package innopolis.service;

import innopolis.pojo.User;
import innopolis.repository.dao.UserDao;
import innopolis.repository.dao.UserDaoImpl;
import innopolis.service.utils.HashUtil;

public class UserServiceImpl implements UserService {
    UserDao userDaoImpl;

    public UserServiceImpl(UserDao userDao) {
        this.userDaoImpl = userDao;
    }

    @Override
    public int getRole(String login) {
        User user;
        if (login != null) {
            user = userDaoImpl.getUserByLogin(login);
            if (user == null) {
                return -1;
            }
            return user.getRole();
        }
        return -2;
    }

    @Override
    public boolean checkAuth(String login, String password) {
        //TODO:Удалить тестовые учетки из базы
        User user;
        if ((login != null) && (password != null)) {
            user = userDaoImpl.getUserByLogin(login);
            if (user != null) {
                if (user.getPassword().equals(HashUtil.stringToMD5(password))) {
                    return true;
                }
            }
        }
        return false;
    }
}
