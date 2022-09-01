package com.search.binarysearchapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.search.binarysearchapi.model.Search;
import com.search.binarysearchapi.service.SearchService;

@RestController
@RequestMapping(value = "/search")
public class SearchController 
{
    @Autowired
    private SearchService searchService;

	@PostMapping(path = "/key", consumes = "application/json", produces = "application/json")
	public int searchKey(@RequestBody Search search) throws Exception {
		int index = searchService.findKeyFromSortedRotatedArray(search);
		return index;
	}
}