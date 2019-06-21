package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class BooleanMirror extends ValueMirror
{
  BooleanMirror(V8Object paramV8Object)
  {
    super(paramV8Object);
  }

  public boolean isBoolean()
  {
    return true;
  }

  public String toString()
  {
    AppMethodBeat.i(74857);
    String str = this.v8Object.executeStringFunction("toText", null);
    AppMethodBeat.o(74857);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.mirror.BooleanMirror
 * JD-Core Version:    0.6.2
 */