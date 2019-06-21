package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class StringMirror extends ValueMirror
{
  StringMirror(V8Object paramV8Object)
  {
    super(paramV8Object);
  }

  public boolean isString()
  {
    return true;
  }

  public String toString()
  {
    AppMethodBeat.i(74910);
    String str = this.v8Object.executeStringFunction("toText", null);
    AppMethodBeat.o(74910);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.mirror.StringMirror
 * JD-Core Version:    0.6.2
 */