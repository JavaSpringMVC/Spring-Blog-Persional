package com.hainguyen.repository;

import com.hainguyen.model.BlogPersonal;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<BlogPersonal, Integer> {
}
