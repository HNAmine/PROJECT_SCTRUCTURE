package org.rimtelecom;

import org.dozer.Mapper;
import org.rimtelecom.dtos.UserAddDTO;
import org.rimtelecom.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Amine HANANE
 *
 */
@SpringBootApplication
public class ProjectStrcutureApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjectStrcutureApplication.class, args);
	}

	@Autowired
	org.rimtelecom.repositories.UserRepository userRepository;

	@Autowired
	org.rimtelecom.repositories.AuthorityRepository authorityRepository;

	@Autowired
	org.rimtelecom.repositories.BlogRepository blogRepository;

	@Autowired
	protected Mapper mapper;

	@Override
	@Transactional
	public void run(String... arg0) throws Exception {
		System.out.println("========================= START ===========================");
		User u = new User("AMINE", "HANANE", "hananeamaine@gmail.com", "mypassword", null);
		
		UserAddDTO usto = this.mapper.map(u, UserAddDTO.class);
		
		System.out.println(usto);
		
		//
		// User amine = userRepository.findOne(1L);
		// User solayman = userRepository.findOne(2L);
		//
		// Blog spring = blogRepository.findOne(1L);// amine
		// Blog hibernate = blogRepository.findOne(3L);// solayman
		//
		// hibernate.getComments().forEach(comment -> {
		// System.out.println(comment);
		// });
		// Comment amineCommentHibernateBlog = new Comment("very good article mr
		// solayman", new Date());
		//
		// amineCommentHibernateBlog.setBlog(hibernate);
		// amineCommentHibernateBlog.setUser(amine);

		// hibernate.getComments().add(amineCommentHibernateBlog);
		// amine.getComments().add(amineCommentHibernateBlog);

		// blogRepository.saveAndFlush(hibernate);
		// userRepository.saveAndFlush(amine);
		// blogRepository.save(blog1);

		// userRepository.saveAndFlush(amine);
		// solayman.getAuthorities().forEach(authority -> {
		// System.out.println(authority);
		// });
		// userRepository.save(new User("Solayman",
		// "HANANE","hananesolayman@gmail.com", "mypassword", "0610844460"));

		System.out.println("========================= END ===========================");
	}
}
