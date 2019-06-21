package com.eclipsesource.v8;

public abstract interface ReferenceHandler
{
  public abstract void v8HandleCreated(V8Value paramV8Value);

  public abstract void v8HandleDisposed(V8Value paramV8Value);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.ReferenceHandler
 * JD-Core Version:    0.6.2
 */