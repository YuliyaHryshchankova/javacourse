package com.company.lecturetwo.homework.check;

/**
 *
 */
public interface OperationsWithLimit {
    /**
     * Method checks if limit is reached
     *
     * @param currentValue - intermediate result
     * @param limit        - established limit
     * @return true if limit is reached and false otherwise
     */
    boolean isLimitReached(double currentValue, double limit);

}
