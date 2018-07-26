package pl.akademiakodu.miniBlog.dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.miniBlog.model.Comment;


public interface CommentDao extends CrudRepository<Comment,Integer> {
}
