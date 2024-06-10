package com.example.dto;

import com.example.dispatch.PathNode;

import java.util.ArrayList;
import java.util.List;

public class DispatchResult {

    private List<String> logs = new ArrayList<>();
    private int totalDispatched;

    private double maxTime; // 添加最大时间字段
    private double totalCost; // 添加总成本字段

    private List<PathNode> usedPaths = new ArrayList<>(); // 添加实际使用的路径记录

    @Override
    public String toString() {
        return "DispatchResult{" +
                "logs=" + logs +
                ", totalDispatched=" + totalDispatched +
                '}';
    }

    public void addLog(String log) {
        logs.add(log);
    }

    public List<String> getLogs() {
        return logs;
    }

    public int getTotalDispatched() {
        return totalDispatched;
    }

    public void setTotalDispatched(int totalDispatched) {
        this.totalDispatched = totalDispatched;
    }

    public void setLogs(List<String> logs) {
        this.logs = logs;
    }

    public double getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(double maxTime) {
        this.maxTime = maxTime;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void addUsedPath(PathNode path) {
        usedPaths.add(path);
    }

    public List<PathNode> getUsedPaths() {
        return usedPaths;
    }

    public void setUsedPaths(List<PathNode> usedPaths) {
        this.usedPaths = usedPaths;
    }
}
