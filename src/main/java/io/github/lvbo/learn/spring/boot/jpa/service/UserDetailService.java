package io.github.lvbo.learn.spring.boot.jpa.service;

import io.github.lvbo.learn.spring.boot.jpa.model.UserDetail;
import io.github.lvbo.learn.spring.boot.jpa.param.UserDetailParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserDetailService {
    public Page<UserDetail> findByCondition(UserDetailParam detailParam, Pageable pageable);
}
