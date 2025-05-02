package com.daw.miniproyecto.model;

public class Mariposa {
    private int id;
    private float topOffset;
    private float bottomOffset;
    private float pauseTime;

    // getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public float getTopOffset() { return topOffset; }
    public void setTopOffset(float topOffset) { this.topOffset = topOffset; }

    public float getBottomOffset() { return bottomOffset; }
    public void setBottomOffset(float bottomOffset) { this.bottomOffset = bottomOffset; }

    public float getPauseTime() { return pauseTime; }
    public void setPauseTime(float pauseTime) { this.pauseTime = pauseTime; }
}
