package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;

public class UndefinedMirror extends ValueMirror
{
  UndefinedMirror(V8Object paramV8Object)
  {
    super(paramV8Object);
  }

  public boolean isUndefined()
  {
    return true;
  }

  public String toString()
  {
    return "undefined";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.mirror.UndefinedMirror
 * JD-Core Version:    0.6.2
 */