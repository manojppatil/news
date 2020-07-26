package com.appsnipp.news.model;

import java.util.ArrayList;

public class SourceResponse {
    private String status;
    private int totalResults;
    private ArrayList<Source> sources;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<Source> getSources() {
        return sources;
    }

    public void setSources(ArrayList<ArticleStructure> articles) {
        this.sources = sources;
    }
}
