package com.hgcode.vo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wentao_tang
 * Date: 2016/7/28
 * Time: 17:36
 * To change this template use File | Settings | File Templates.
 */
public class GridJson<T> {
    private long total;
    private List<T> rows;

    public GridJson(List<T> rows, long total) {
        this.rows = rows;
        this.total = total;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public GridJson() {
    }
}
