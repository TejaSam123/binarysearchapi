package com.search.binarysearchapi.model;

public class Search {
	public Search() {

    }
	 public Search(Integer[] sortedArray, int key) {
	        this.sortedArray = sortedArray;
	        this.key = key;
	    }
	 private Integer[] sortedArray;
	 private int key;
	 
	public Integer[] getSortedArray() {
		return sortedArray;
	}
	public void setSortedArray(Integer[] sortedArray) {
		this.sortedArray = sortedArray;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
}
