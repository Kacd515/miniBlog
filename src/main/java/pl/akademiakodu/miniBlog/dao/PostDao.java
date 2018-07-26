package pl.akademiakodu.miniBlog.dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.miniBlog.model.Post;

public interface PostDao extends CrudRepository<Post,Long> {

}
