package com.eclipsesource.v8.debug;

import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Function;
import com.eclipsesource.v8.V8Locker;
import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class DebugHandler
  implements Releasable
{
  private static final String CHANGE_BREAK_POINT_CONDITION = "changeBreakPointCondition";
  private static final String CLEAR_BREAK_POINT = "clearBreakPoint";
  private static final String DEBUG_BREAK_HANDLER = "__j2v8_debug_handler";
  public static String DEBUG_OBJECT_NAME = "__j2v8_Debug";
  private static final String DISABLE_ALL_BREAK_POINTS = "disableAllBreakPoints";
  private static final String DISABLE_SCRIPT_BREAK_POINT = "disableScriptBreakPoint";
  private static final String ENABLE_SCRIPT_BREAK_POINT = "enableScriptBreakPoint";
  private static final String FIND_SCRIPT_BREAK_POINT = "findScriptBreakPoint";
  private static final String NUMBER = "number";
  private static final String SCRIPT_BREAK_POINTS = "scriptBreakPoints";
  private static final String SET_BREAK_POINT = "setBreakPoint";
  private static final String SET_LISTENER = "setListener";
  private static final String SET_SCRIPT_BREAK_POINT_BY_NAME = "setScriptBreakPointByName";
  private static final String V8_DEBUG_OBJECT = "Debug";
  private List<BreakHandler> breakHandlers;
  private V8Object debugObject;
  private V8 runtime;

  public DebugHandler(V8 paramV8)
  {
    AppMethodBeat.i(74833);
    this.breakHandlers = new ArrayList();
    this.runtime = paramV8;
    setupDebugObject(paramV8);
    setupBreakpointHandler();
    AppMethodBeat.o(74833);
  }

  // ERROR //
  private void setupBreakpointHandler()
  {
    // Byte code:
    //   0: ldc 97
    //   2: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 10	com/eclipsesource/v8/debug/DebugHandler$BreakpointHandler
    //   8: dup
    //   9: aload_0
    //   10: aconst_null
    //   11: invokespecial 100	com/eclipsesource/v8/debug/DebugHandler$BreakpointHandler:<init>	(Lcom/eclipsesource/v8/debug/DebugHandler;Lcom/eclipsesource/v8/debug/DebugHandler$1;)V
    //   14: astore_1
    //   15: aload_0
    //   16: getfield 102	com/eclipsesource/v8/debug/DebugHandler:debugObject	Lcom/eclipsesource/v8/V8Object;
    //   19: aload_1
    //   20: ldc 22
    //   22: invokevirtual 108	com/eclipsesource/v8/V8Object:registerJavaMethod	(Lcom/eclipsesource/v8/JavaVoidCallback;Ljava/lang/String;)Lcom/eclipsesource/v8/V8Object;
    //   25: pop
    //   26: aload_0
    //   27: getfield 102	com/eclipsesource/v8/debug/DebugHandler:debugObject	Lcom/eclipsesource/v8/V8Object;
    //   30: ldc 22
    //   32: invokevirtual 112	com/eclipsesource/v8/V8Object:getObject	(Ljava/lang/String;)Lcom/eclipsesource/v8/V8Object;
    //   35: checkcast 114	com/eclipsesource/v8/V8Function
    //   38: astore_1
    //   39: new 116	com/eclipsesource/v8/V8Array
    //   42: astore_2
    //   43: aload_2
    //   44: aload_0
    //   45: getfield 85	com/eclipsesource/v8/debug/DebugHandler:runtime	Lcom/eclipsesource/v8/V8;
    //   48: invokespecial 118	com/eclipsesource/v8/V8Array:<init>	(Lcom/eclipsesource/v8/V8;)V
    //   51: aload_2
    //   52: aload_1
    //   53: invokevirtual 122	com/eclipsesource/v8/V8Array:push	(Lcom/eclipsesource/v8/V8Value;)Lcom/eclipsesource/v8/V8Array;
    //   56: astore_2
    //   57: aload_0
    //   58: getfield 102	com/eclipsesource/v8/debug/DebugHandler:debugObject	Lcom/eclipsesource/v8/V8Object;
    //   61: ldc 47
    //   63: aload_2
    //   64: invokevirtual 126	com/eclipsesource/v8/V8Object:executeFunction	(Ljava/lang/String;Lcom/eclipsesource/v8/V8Array;)Ljava/lang/Object;
    //   67: pop
    //   68: aload_1
    //   69: ifnull +14 -> 83
    //   72: aload_1
    //   73: invokevirtual 130	com/eclipsesource/v8/V8Function:isReleased	()Z
    //   76: ifne +7 -> 83
    //   79: aload_1
    //   80: invokevirtual 133	com/eclipsesource/v8/V8Function:release	()V
    //   83: aload_2
    //   84: ifnull +62 -> 146
    //   87: aload_2
    //   88: invokevirtual 134	com/eclipsesource/v8/V8Array:isReleased	()Z
    //   91: ifne +55 -> 146
    //   94: aload_2
    //   95: invokevirtual 135	com/eclipsesource/v8/V8Array:release	()V
    //   98: ldc 97
    //   100: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: return
    //   104: astore_1
    //   105: aconst_null
    //   106: astore_2
    //   107: aconst_null
    //   108: astore_3
    //   109: aload_3
    //   110: ifnull +14 -> 124
    //   113: aload_3
    //   114: invokevirtual 130	com/eclipsesource/v8/V8Function:isReleased	()Z
    //   117: ifne +7 -> 124
    //   120: aload_3
    //   121: invokevirtual 133	com/eclipsesource/v8/V8Function:release	()V
    //   124: aload_2
    //   125: ifnull +14 -> 139
    //   128: aload_2
    //   129: invokevirtual 134	com/eclipsesource/v8/V8Array:isReleased	()Z
    //   132: ifne +7 -> 139
    //   135: aload_2
    //   136: invokevirtual 135	com/eclipsesource/v8/V8Array:release	()V
    //   139: ldc 97
    //   141: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   144: aload_1
    //   145: athrow
    //   146: ldc 97
    //   148: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   151: goto -48 -> 103
    //   154: astore_2
    //   155: aconst_null
    //   156: astore 4
    //   158: aload_1
    //   159: astore_3
    //   160: aload_2
    //   161: astore_1
    //   162: aload 4
    //   164: astore_2
    //   165: goto -56 -> 109
    //   168: astore 4
    //   170: aload_1
    //   171: astore_3
    //   172: aload 4
    //   174: astore_1
    //   175: goto -66 -> 109
    //
    // Exception table:
    //   from	to	target	type
    //   26	39	104	finally
    //   39	57	154	finally
    //   57	68	168	finally
  }

  private void setupDebugObject(V8 paramV8)
  {
    AppMethodBeat.i(74847);
    V8Object localV8Object = paramV8.getObject(DEBUG_OBJECT_NAME);
    try
    {
      this.debugObject = localV8Object.getObject("Debug");
      return;
    }
    finally
    {
      localV8Object.release();
      AppMethodBeat.o(74847);
    }
    throw paramV8;
  }

  public void addBreakHandler(BreakHandler paramBreakHandler)
  {
    AppMethodBeat.i(74834);
    this.runtime.getLocker().checkThread();
    this.breakHandlers.add(paramBreakHandler);
    AppMethodBeat.o(74834);
  }

  public void changeBreakPointCondition(int paramInt, String paramString)
  {
    AppMethodBeat.i(74845);
    V8Array localV8Array = new V8Array(this.runtime);
    localV8Array.push(paramInt);
    localV8Array.push(paramString);
    try
    {
      this.debugObject.executeVoidFunction("changeBreakPointCondition", localV8Array);
      return;
    }
    finally
    {
      localV8Array.release();
      AppMethodBeat.o(74845);
    }
    throw paramString;
  }

  public void clearBreakPoint(int paramInt)
  {
    AppMethodBeat.i(74840);
    V8Array localV8Array = new V8Array(this.runtime);
    localV8Array.push(paramInt);
    try
    {
      this.debugObject.executeVoidFunction("clearBreakPoint", localV8Array);
      return;
    }
    finally
    {
      localV8Array.release();
      AppMethodBeat.o(74840);
    }
  }

  public void disableAllBreakPoints()
  {
    AppMethodBeat.i(74841);
    this.debugObject.executeVoidFunction("disableAllBreakPoints", null);
    AppMethodBeat.o(74841);
  }

  public void disableScriptBreakPoint(int paramInt)
  {
    AppMethodBeat.i(74839);
    V8Array localV8Array = new V8Array(this.runtime);
    localV8Array.push(paramInt);
    try
    {
      this.debugObject.executeVoidFunction("disableScriptBreakPoint", localV8Array);
      return;
    }
    finally
    {
      localV8Array.release();
      AppMethodBeat.o(74839);
    }
  }

  public void enableScriptBreakPoint(int paramInt)
  {
    AppMethodBeat.i(74838);
    V8Array localV8Array = new V8Array(this.runtime);
    localV8Array.push(paramInt);
    try
    {
      this.debugObject.executeVoidFunction("enableScriptBreakPoint", localV8Array);
      return;
    }
    finally
    {
      localV8Array.release();
      AppMethodBeat.o(74838);
    }
  }

  public ScriptBreakPoint getScriptBreakPoint(int paramInt)
  {
    AppMethodBeat.i(74844);
    V8Array localV8Array = new V8Array(this.runtime);
    localV8Array.push(paramInt);
    localV8Array.push(false);
    Object localObject1 = null;
    try
    {
      V8Object localV8Object = this.debugObject.executeObjectFunction("findScriptBreakPoint", localV8Array);
      localObject1 = localV8Object;
      ScriptBreakPoint localScriptBreakPoint = new ScriptBreakPoint(localV8Object);
      return localScriptBreakPoint;
    }
    finally
    {
      localV8Array.release();
      if (localObject1 != null)
        localObject1.release();
      AppMethodBeat.o(74844);
    }
  }

  public int getScriptBreakPointCount()
  {
    AppMethodBeat.i(74842);
    V8Array localV8Array = this.debugObject.executeArrayFunction("scriptBreakPoints", null);
    try
    {
      int i = localV8Array.length();
      return i;
    }
    finally
    {
      localV8Array.release();
      AppMethodBeat.o(74842);
    }
  }

  public int[] getScriptBreakPointIDs()
  {
    AppMethodBeat.i(74843);
    V8Array localV8Array = this.debugObject.executeArrayFunction("scriptBreakPoints", null);
    try
    {
      arrayOfInt1 = new int[localV8Array.length()];
      i = 0;
      if (i < localV8Array.length())
        localV8Object = localV8Array.getObject(i);
    }
    finally
    {
      try
      {
        int[] arrayOfInt1;
        int i;
        arrayOfInt1[i] = localV8Object.executeIntegerFunction("number", null);
        localV8Object.release();
        i++;
      }
      finally
      {
        V8Object localV8Object;
        localV8Object.release();
        AppMethodBeat.o(74843);
      }
      AppMethodBeat.o(74843);
    }
    localV8Array.release();
    AppMethodBeat.o(74843);
    return arrayOfInt2;
  }

  public void release()
  {
    AppMethodBeat.i(74846);
    this.debugObject.release();
    AppMethodBeat.o(74846);
  }

  public void removeBreakHandler(BreakHandler paramBreakHandler)
  {
    AppMethodBeat.i(74835);
    this.runtime.getLocker().checkThread();
    this.breakHandlers.remove(paramBreakHandler);
    AppMethodBeat.o(74835);
  }

  public int setBreakpoint(V8Function paramV8Function)
  {
    AppMethodBeat.i(74836);
    V8Array localV8Array = new V8Array(this.runtime);
    localV8Array.push(paramV8Function);
    try
    {
      int i = this.debugObject.executeIntegerFunction("setBreakPoint", localV8Array);
      return i;
    }
    finally
    {
      localV8Array.release();
      AppMethodBeat.o(74836);
    }
    throw paramV8Function;
  }

  public int setScriptBreakpoint(String paramString, int paramInt)
  {
    AppMethodBeat.i(74837);
    V8Array localV8Array = new V8Array(this.runtime);
    localV8Array.push(paramString);
    localV8Array.push(paramInt);
    try
    {
      paramInt = this.debugObject.executeIntegerFunction("setScriptBreakPointByName", localV8Array);
      return paramInt;
    }
    finally
    {
      localV8Array.release();
      AppMethodBeat.o(74837);
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.DebugHandler
 * JD-Core Version:    0.6.2
 */