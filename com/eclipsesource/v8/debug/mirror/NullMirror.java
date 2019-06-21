package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;

public class NullMirror extends ValueMirror
{
  NullMirror(V8Object paramV8Object)
  {
    super(paramV8Object);
  }

  public boolean isNull()
  {
    return true;
  }

  public String toString()
  {
    return "null";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.mirror.NullMirror
 * JD-Core Version:    0.6.2
 */