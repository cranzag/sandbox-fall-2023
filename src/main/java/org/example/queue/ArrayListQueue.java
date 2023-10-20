package org.example.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public abstract class ArrayListQueue<T> implements Queue<T> {

    private List<T> queue;

    public ArrayListQueue() {
        queue = new ArrayList<>();
    }

    @Override
    public boolean offer(T t) {
        return queue.add(t);
    }

    @Override
    public T poll() {
        return queue.remove(0);
    }

    @Override
    public T peek() {
        return queue.get(0);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}