package com.github.mim1q.minecells.entity.interfaces;

public interface AnimatedAttackEntity {

    int getAttackTickCount(String attackName);

    int getAttackCooldown(String attackName);

    void setAttackState(String attackName);

    int getAttackLength(String attackName);

    String getAttackState();

    void stopAnimations();
}
