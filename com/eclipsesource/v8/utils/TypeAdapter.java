package com.eclipsesource.v8.utils;

public abstract interface TypeAdapter
{
  public static final Object DEFAULT = new Object();

  public abstract Object adapt(int paramInt, Object paramObject);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.utils.TypeAdapter
 * JD-Core Version:    0.6.2
 */