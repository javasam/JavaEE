package innopolis.repository.dao;

import innopolis.pojo.User;

public interface UserDao {
    User getUserByLogin(String login);
}
