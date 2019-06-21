package com.eclipsesource.v8.debug;

import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8ResultUndefined;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ScriptBreakPoint
  implements Releasable
{
  private static final String CONDITION = "condition";
  private static final String LINE = "line";
  private static final String NUMBER = "number";
  private static final String SET_CONDITION = "setCondition";
  private V8Object v8Object;

  ScriptBreakPoint(V8Object paramV8Object)
  {
    AppMethodBeat.i(74912);
    this.v8Object = paramV8Object.twin();
    AppMethodBeat.o(74912);
  }

  public int getBreakPointNumber()
  {
    AppMethodBeat.i(74913);
    int i = this.v8Object.executeIntegerFunction("number", null);
    AppMethodBeat.o(74913);
    return i;
  }

  public String getCondition()
  {
    AppMethodBeat.i(74916);
    try
    {
      String str1 = this.v8Object.executeStringFunction("condition", null);
      AppMethodBeat.o(74916);
      return str1;
    }
    catch (V8ResultUndefined localV8ResultUndefined)
    {
      while (true)
      {
        String str2 = "undefined";
        AppMethodBeat.o(74916);
      }
    }
  }

  public int getLine()
  {
    AppMethodBeat.i(74914);
    int i = this.v8Object.executeIntegerFunction("line", null);
    AppMethodBeat.o(74914);
    return i;
  }

  public void release()
  {
    AppMethodBeat.i(74917);
    if ((this.v8Object != null) && (!this.v8Object.isReleased()))
    {
      this.v8Object.release();
      this.v8Object = null;
    }
    AppMethodBeat.o(74917);
  }

  public void setCondition(String paramString)
  {
    AppMethodBeat.i(74915);
    V8Array localV8Array = new V8Array(this.v8Object.getRuntime());
    localV8Array.push(paramString);
    try
    {
      this.v8Object.executeVoidFunction("setCondition", localV8Array);
      return;
    }
    finally
    {
      localV8Array.release();
      AppMethodBeat.o(74915);
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.ScriptBreakPoint
 * JD-Core Version:    0.6.2
 */