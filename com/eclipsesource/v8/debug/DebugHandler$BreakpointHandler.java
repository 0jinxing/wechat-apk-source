package com.eclipsesource.v8.debug;

import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

class DebugHandler$BreakpointHandler
  implements JavaVoidCallback
{
  private DebugHandler$BreakpointHandler(DebugHandler paramDebugHandler)
  {
  }

  private EventData createDebugEvent(DebugHandler.DebugEvent paramDebugEvent, V8Object paramV8Object)
  {
    AppMethodBeat.i(74828);
    switch (DebugHandler.1.$SwitchMap$com$eclipsesource$v8$debug$DebugHandler$DebugEvent[paramDebugEvent.ordinal()])
    {
    default:
      paramDebugEvent = new EventData(paramV8Object);
      AppMethodBeat.o(74828);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return paramDebugEvent;
      paramDebugEvent = new BreakEvent(paramV8Object);
      AppMethodBeat.o(74828);
      continue;
      paramDebugEvent = new CompileEvent(paramV8Object);
      AppMethodBeat.o(74828);
      continue;
      paramDebugEvent = new CompileEvent(paramV8Object);
      AppMethodBeat.o(74828);
      continue;
      paramDebugEvent = new ExceptionEvent(paramV8Object);
      AppMethodBeat.o(74828);
    }
  }

  // ERROR //
  private void invokeHandler(V8Array paramV8Array, int paramInt, BreakHandler paramBreakHandler)
  {
    // Byte code:
    //   0: ldc 63
    //   2: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: iconst_1
    //   7: invokevirtual 69	com/eclipsesource/v8/V8Array:getObject	(I)Lcom/eclipsesource/v8/V8Object;
    //   10: astore 4
    //   12: aload_1
    //   13: iconst_2
    //   14: invokevirtual 69	com/eclipsesource/v8/V8Array:getObject	(I)Lcom/eclipsesource/v8/V8Object;
    //   17: astore 5
    //   19: aload_1
    //   20: iconst_3
    //   21: invokevirtual 69	com/eclipsesource/v8/V8Array:getObject	(I)Lcom/eclipsesource/v8/V8Object;
    //   24: astore 6
    //   26: new 71	com/eclipsesource/v8/debug/ExecutionState
    //   29: astore 7
    //   31: aload 7
    //   33: aload 4
    //   35: invokespecial 72	com/eclipsesource/v8/debug/ExecutionState:<init>	(Lcom/eclipsesource/v8/V8Object;)V
    //   38: invokestatic 76	com/eclipsesource/v8/debug/DebugHandler$DebugEvent:values	()[Lcom/eclipsesource/v8/debug/DebugHandler$DebugEvent;
    //   41: iload_2
    //   42: aaload
    //   43: astore_1
    //   44: aload_0
    //   45: aload_1
    //   46: aload 5
    //   48: invokespecial 78	com/eclipsesource/v8/debug/DebugHandler$BreakpointHandler:createDebugEvent	(Lcom/eclipsesource/v8/debug/DebugHandler$DebugEvent;Lcom/eclipsesource/v8/V8Object;)Lcom/eclipsesource/v8/debug/EventData;
    //   51: astore 8
    //   53: aload_3
    //   54: aload_1
    //   55: aload 7
    //   57: aload 8
    //   59: aload 6
    //   61: invokeinterface 84 5 0
    //   66: aload_0
    //   67: aload 4
    //   69: invokespecial 88	com/eclipsesource/v8/debug/DebugHandler$BreakpointHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   72: aload_0
    //   73: aload 5
    //   75: invokespecial 88	com/eclipsesource/v8/debug/DebugHandler$BreakpointHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   78: aload_0
    //   79: aload 6
    //   81: invokespecial 88	com/eclipsesource/v8/debug/DebugHandler$BreakpointHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   84: aload_0
    //   85: aload 7
    //   87: invokespecial 88	com/eclipsesource/v8/debug/DebugHandler$BreakpointHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   90: aload_0
    //   91: aload 8
    //   93: invokespecial 88	com/eclipsesource/v8/debug/DebugHandler$BreakpointHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   96: ldc 63
    //   98: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   101: return
    //   102: astore_1
    //   103: aconst_null
    //   104: astore_3
    //   105: aconst_null
    //   106: astore 8
    //   108: aconst_null
    //   109: astore 6
    //   111: aconst_null
    //   112: astore 5
    //   114: aconst_null
    //   115: astore 4
    //   117: aload_0
    //   118: aload 4
    //   120: invokespecial 88	com/eclipsesource/v8/debug/DebugHandler$BreakpointHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   123: aload_0
    //   124: aload 5
    //   126: invokespecial 88	com/eclipsesource/v8/debug/DebugHandler$BreakpointHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   129: aload_0
    //   130: aload 6
    //   132: invokespecial 88	com/eclipsesource/v8/debug/DebugHandler$BreakpointHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   135: aload_0
    //   136: aload 8
    //   138: invokespecial 88	com/eclipsesource/v8/debug/DebugHandler$BreakpointHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   141: aload_0
    //   142: aload_3
    //   143: invokespecial 88	com/eclipsesource/v8/debug/DebugHandler$BreakpointHandler:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   146: ldc 63
    //   148: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   151: aload_1
    //   152: athrow
    //   153: astore_1
    //   154: aconst_null
    //   155: astore_3
    //   156: aconst_null
    //   157: astore 8
    //   159: aconst_null
    //   160: astore 6
    //   162: aconst_null
    //   163: astore 5
    //   165: goto -48 -> 117
    //   168: astore_1
    //   169: aconst_null
    //   170: astore_3
    //   171: aconst_null
    //   172: astore 8
    //   174: aconst_null
    //   175: astore 6
    //   177: goto -60 -> 117
    //   180: astore_1
    //   181: aconst_null
    //   182: astore_3
    //   183: aconst_null
    //   184: astore 8
    //   186: goto -69 -> 117
    //   189: astore_1
    //   190: aconst_null
    //   191: astore_3
    //   192: aload 7
    //   194: astore 8
    //   196: goto -79 -> 117
    //   199: astore_1
    //   200: aload 8
    //   202: astore_3
    //   203: aload 7
    //   205: astore 8
    //   207: goto -90 -> 117
    //
    // Exception table:
    //   from	to	target	type
    //   5	12	102	finally
    //   12	19	153	finally
    //   19	26	168	finally
    //   26	38	180	finally
    //   38	53	189	finally
    //   53	66	199	finally
  }

  private void safeRelease(Releasable paramReleasable)
  {
    AppMethodBeat.i(74829);
    if (paramReleasable != null)
      paramReleasable.release();
    AppMethodBeat.o(74829);
  }

  public void invoke(V8Object paramV8Object, V8Array paramV8Array)
  {
    AppMethodBeat.i(74826);
    if ((paramV8Array == null) || (paramV8Array.isUndefined()))
      AppMethodBeat.o(74826);
    while (true)
    {
      return;
      int i = paramV8Array.getInteger(0);
      paramV8Object = DebugHandler.access$100(this.this$0).iterator();
      while (paramV8Object.hasNext())
        invokeHandler(paramV8Array, i, (BreakHandler)paramV8Object.next());
      AppMethodBeat.o(74826);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.DebugHandler.BreakpointHandler
 * JD-Core Version:    0.6.2
 */