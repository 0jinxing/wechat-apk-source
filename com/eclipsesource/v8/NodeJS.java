package com.eclipsesource.v8;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class NodeJS
{
  private static final String GLOBAL = "global";
  private static final String NEXT_TICK = "nextTick";
  private static final String NODE = "node";
  private static final String PROCESS = "process";
  private static final String STARTUP_CALLBACK = "__run";
  private static final String STARTUP_SCRIPT = "global.__run(require, exports, module, __filename, __dirname);";
  private static final String STARTUP_SCRIPT_NAME = "startup";
  private static final String TMP_JS_EXT = ".js.tmp";
  private static final String VERSIONS = "versions";
  private String nodeVersion = null;
  private V8Function require;
  private V8 v8;

  private NodeJS(V8 paramV8)
  {
    this.v8 = paramV8;
  }

  public static NodeJS createNodeJS()
  {
    AppMethodBeat.i(74993);
    NodeJS localNodeJS = createNodeJS(null);
    AppMethodBeat.o(74993);
    return localNodeJS;
  }

  public static NodeJS createNodeJS(File paramFile)
  {
    AppMethodBeat.i(74995);
    V8 localV8 = V8.createV8Runtime("global");
    NodeJS localNodeJS = new NodeJS(localV8);
    localV8.registerJavaMethod(new NodeJS.1(localNodeJS), "__run");
    try
    {
      File localFile = createTemporaryScriptFile("global.__run(require, exports, module, __filename, __dirname);", "startup");
      try
      {
        localV8.createNodeRuntime(localFile.getAbsolutePath());
        localFile.delete();
        if (paramFile != null)
          localNodeJS.exec(paramFile);
        AppMethodBeat.o(74995);
        return localNodeJS;
      }
      finally
      {
        localFile.delete();
        AppMethodBeat.o(74995);
      }
    }
    catch (IOException paramFile)
    {
      paramFile = new RuntimeException(paramFile);
      AppMethodBeat.o(74995);
    }
    throw paramFile;
  }

  private V8Function createScriptExecutionCallback(File paramFile)
  {
    AppMethodBeat.i(75001);
    paramFile = new V8Function(this.v8, new NodeJS.2(this, paramFile));
    AppMethodBeat.o(75001);
    return paramFile;
  }

  private static File createTemporaryScriptFile(String paramString1, String paramString2)
  {
    AppMethodBeat.i(75003);
    File localFile = File.createTempFile(paramString2, ".js.tmp");
    paramString2 = new PrintWriter(localFile, "UTF-8");
    try
    {
      paramString2.print(paramString1);
      return localFile;
    }
    finally
    {
      paramString2.close();
      AppMethodBeat.o(75003);
    }
    throw paramString1;
  }

  private void init(V8Function paramV8Function)
  {
    this.require = paramV8Function;
  }

  private void safeRelease(Releasable paramReleasable)
  {
    AppMethodBeat.i(75002);
    if (paramReleasable != null)
      paramReleasable.release();
    AppMethodBeat.o(75002);
  }

  // ERROR //
  public void exec(File paramFile)
  {
    // Byte code:
    //   0: ldc 161
    //   2: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: aload_1
    //   7: invokespecial 163	com/eclipsesource/v8/NodeJS:createScriptExecutionCallback	(Ljava/io/File;)Lcom/eclipsesource/v8/V8Function;
    //   10: astore_2
    //   11: aload_0
    //   12: getfield 46	com/eclipsesource/v8/NodeJS:v8	Lcom/eclipsesource/v8/V8;
    //   15: ldc 17
    //   17: invokevirtual 167	com/eclipsesource/v8/V8:getObject	(Ljava/lang/String;)Lcom/eclipsesource/v8/V8Object;
    //   20: astore_3
    //   21: new 169	com/eclipsesource/v8/V8Array
    //   24: astore 4
    //   26: aload 4
    //   28: aload_0
    //   29: getfield 46	com/eclipsesource/v8/NodeJS:v8	Lcom/eclipsesource/v8/V8;
    //   32: invokespecial 170	com/eclipsesource/v8/V8Array:<init>	(Lcom/eclipsesource/v8/V8;)V
    //   35: aload 4
    //   37: aload_2
    //   38: invokevirtual 174	com/eclipsesource/v8/V8Array:push	(Lcom/eclipsesource/v8/V8Value;)Lcom/eclipsesource/v8/V8Array;
    //   41: pop
    //   42: aload_3
    //   43: ldc 11
    //   45: aload 4
    //   47: invokevirtual 180	com/eclipsesource/v8/V8Object:executeObjectFunction	(Ljava/lang/String;Lcom/eclipsesource/v8/V8Array;)Lcom/eclipsesource/v8/V8Object;
    //   50: pop
    //   51: aload_0
    //   52: aload_3
    //   53: invokespecial 182	com/eclipsesource/v8/NodeJS:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   56: aload_0
    //   57: aload 4
    //   59: invokespecial 182	com/eclipsesource/v8/NodeJS:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   62: aload_0
    //   63: aload_2
    //   64: invokespecial 182	com/eclipsesource/v8/NodeJS:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   67: ldc 161
    //   69: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   72: return
    //   73: astore_1
    //   74: aconst_null
    //   75: astore 4
    //   77: aconst_null
    //   78: astore_3
    //   79: aload_0
    //   80: aload_3
    //   81: invokespecial 182	com/eclipsesource/v8/NodeJS:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   84: aload_0
    //   85: aload 4
    //   87: invokespecial 182	com/eclipsesource/v8/NodeJS:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   90: aload_0
    //   91: aload_2
    //   92: invokespecial 182	com/eclipsesource/v8/NodeJS:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   95: ldc 161
    //   97: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: aload_1
    //   101: athrow
    //   102: astore_1
    //   103: aconst_null
    //   104: astore 4
    //   106: goto -27 -> 79
    //   109: astore_1
    //   110: goto -31 -> 79
    //
    // Exception table:
    //   from	to	target	type
    //   11	21	73	finally
    //   21	35	102	finally
    //   35	51	109	finally
  }

  // ERROR //
  public String getNodeVersion()
  {
    // Byte code:
    //   0: ldc 184
    //   2: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 44	com/eclipsesource/v8/NodeJS:nodeVersion	Ljava/lang/String;
    //   9: ifnull +15 -> 24
    //   12: aload_0
    //   13: getfield 44	com/eclipsesource/v8/NodeJS:nodeVersion	Ljava/lang/String;
    //   16: astore_1
    //   17: ldc 184
    //   19: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   22: aload_1
    //   23: areturn
    //   24: aload_0
    //   25: getfield 46	com/eclipsesource/v8/NodeJS:v8	Lcom/eclipsesource/v8/V8;
    //   28: ldc 17
    //   30: invokevirtual 167	com/eclipsesource/v8/V8:getObject	(Ljava/lang/String;)Lcom/eclipsesource/v8/V8Object;
    //   33: astore_2
    //   34: aload_2
    //   35: ldc 32
    //   37: invokevirtual 185	com/eclipsesource/v8/V8Object:getObject	(Ljava/lang/String;)Lcom/eclipsesource/v8/V8Object;
    //   40: astore_3
    //   41: aload_0
    //   42: aload_3
    //   43: ldc 14
    //   45: invokevirtual 189	com/eclipsesource/v8/V8Object:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   48: putfield 44	com/eclipsesource/v8/NodeJS:nodeVersion	Ljava/lang/String;
    //   51: aload_0
    //   52: aload_2
    //   53: invokespecial 182	com/eclipsesource/v8/NodeJS:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   56: aload_0
    //   57: aload_3
    //   58: invokespecial 182	com/eclipsesource/v8/NodeJS:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   61: aload_0
    //   62: getfield 44	com/eclipsesource/v8/NodeJS:nodeVersion	Ljava/lang/String;
    //   65: astore_1
    //   66: ldc 184
    //   68: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   71: goto -49 -> 22
    //   74: astore_1
    //   75: aconst_null
    //   76: astore_3
    //   77: aconst_null
    //   78: astore_2
    //   79: aload_0
    //   80: aload_2
    //   81: invokespecial 182	com/eclipsesource/v8/NodeJS:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   84: aload_0
    //   85: aload_3
    //   86: invokespecial 182	com/eclipsesource/v8/NodeJS:safeRelease	(Lcom/eclipsesource/v8/Releasable;)V
    //   89: ldc 184
    //   91: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: aload_1
    //   95: athrow
    //   96: astore_1
    //   97: aconst_null
    //   98: astore_3
    //   99: goto -20 -> 79
    //   102: astore_1
    //   103: goto -24 -> 79
    //
    // Exception table:
    //   from	to	target	type
    //   24	34	74	finally
    //   34	41	96	finally
    //   41	51	102	finally
  }

  public V8 getRuntime()
  {
    return this.v8;
  }

  public boolean handleMessage()
  {
    AppMethodBeat.i(74996);
    this.v8.checkThread();
    boolean bool = this.v8.pumpMessageLoop();
    AppMethodBeat.o(74996);
    return bool;
  }

  public boolean isRunning()
  {
    AppMethodBeat.i(74998);
    this.v8.checkThread();
    boolean bool = this.v8.isRunning();
    AppMethodBeat.o(74998);
    return bool;
  }

  public void release()
  {
    AppMethodBeat.i(74997);
    this.v8.checkThread();
    if (!this.require.isReleased())
      this.require.release();
    if (!this.v8.isReleased())
      this.v8.release();
    AppMethodBeat.o(74997);
  }

  public V8Object require(File paramFile)
  {
    AppMethodBeat.i(74999);
    this.v8.checkThread();
    V8Array localV8Array = new V8Array(this.v8);
    try
    {
      localV8Array.push(paramFile.getAbsolutePath());
      paramFile = (V8Object)this.require.call(null, localV8Array);
      return paramFile;
    }
    finally
    {
      localV8Array.release();
      AppMethodBeat.o(74999);
    }
    throw paramFile;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.NodeJS
 * JD-Core Version:    0.6.2
 */