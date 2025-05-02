package com.daw.miniproyecto.model;

public class Enemy {
    private int id;
    private int health;
    private float moveSpeed;
    private boolean isDead;
    private String enemyType;

    // getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public float getMoveSpeed() { return moveSpeed; }
    public void setMoveSpeed(float moveSpeed) { this.moveSpeed = moveSpeed; }

    public boolean isDead() { return isDead; }
    public void setDead(boolean dead) { isDead = dead; }

    public String getEnemyType() { return enemyType; }
    public void setEnemyType(String enemyType) { this.enemyType = enemyType; }
}
