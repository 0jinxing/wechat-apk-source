package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ArrayMirror extends ObjectMirror
{
  private static final String LENGTH = "length";

  ArrayMirror(V8Object paramV8Object)
  {
    super(paramV8Object);
  }

  public boolean isArray()
  {
    return true;
  }

  public int length()
  {
    AppMethodBeat.i(74856);
    int i = this.v8Object.executeIntegerFunction("length", null);
    AppMethodBeat.o(74856);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.mirror.ArrayMirror
 * JD-Core Version:    0.6.2
 */