package com.spring.p1.loader;

import com.spring.p1.entity.NewsStates;
import com.spring.p1.entity.Roles;
import com.spring.p1.entity.Users;
import com.spring.p1.repository.NewsStatesRepo;
import com.spring.p1.repository.RolesRepo;
import com.spring.p1.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private RolesRepo rolesRepo;
    @Autowired
    private NewsStatesRepo newsStatesRepo;
    @Autowired
    private UsersRepo usersRepo;
    @Override
    public void run(String... args) throws Exception {
        if(rolesRepo.count()==0){
            rolesRepo.save(new Roles("ADMIN","Админстратор"));
            rolesRepo.save(new Roles("USER","Ползовател"));
        }
        if(newsStatesRepo.count()==0){
            newsStatesRepo.save(new NewsStates("CREATED","Создан"));
            newsStatesRepo.save(new NewsStates("MODERATION","На модерации"));
            newsStatesRepo.save(new NewsStates("PUBLISHED","Опубликовано"));
            newsStatesRepo.save(new NewsStates("REJECTED","Отклоненный"));
        }
        if(usersRepo.count()==0){

        }

    }
}
