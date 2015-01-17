package com.tsystems.javaschool.tasks;

/**
 * Created by Kolia on 18.01.2015.
 */
public class TestObject
{
    String name;

    TestObject(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final TestObject other = (TestObject) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        return 53 * hash + this.name.hashCode();
    }
}
