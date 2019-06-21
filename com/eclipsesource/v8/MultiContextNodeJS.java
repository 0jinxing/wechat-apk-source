package com.eclipsesource.v8;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public final class MultiContextNodeJS
{
  private static final String GLOBAL = "global";
  private static final String STARTUP_CALLBACK = "__run";
  private static final String STARTUP_SCRIPT = "global.__run(require, exports, module, __filename, __dirname);";
  private static final String STARTUP_SCRIPT_NAME = "startup";
  private static final String TMP_JS_EXT = ".js.tmp";
  private static MultiContextNodeJS.IGetTmpFileDirectory sTmpFileDirectoryDelegate;
  private final V8Context mainContext;
  private final MultiContextV8 mv8;
  private V8Function require;

  static
  {
    AppMethodBeat.i(74975);
    sTmpFileDirectoryDelegate = new MultiContextNodeJS.2();
    AppMethodBeat.o(74975);
  }

  private MultiContextNodeJS(MultiContextV8 paramMultiContextV8, V8Context paramV8Context)
  {
    this.mv8 = paramMultiContextV8;
    this.mainContext = paramV8Context;
  }

  public static MultiContextNodeJS createMultiContextNodeJS(int paramInt)
  {
    AppMethodBeat.i(74964);
    MultiContextNodeJS localMultiContextNodeJS = createMultiContextNodeJS(paramInt, null, null);
    AppMethodBeat.o(74964);
    return localMultiContextNodeJS;
  }

  public static MultiContextNodeJS createMultiContextNodeJS(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(74965);
    MultiContextV8 localMultiContextV8 = MultiContextV8.createMultiContextV8("global", paramString, paramArrayOfByte);
    paramArrayOfByte = localMultiContextV8.createContext(paramInt);
    paramString = new MultiContextNodeJS(localMultiContextV8, paramArrayOfByte);
    paramArrayOfByte.registerJavaMethod(new MultiContextNodeJS.1(paramString), "__run");
    try
    {
      paramArrayOfByte = createTemporaryScriptFile("global.__run(require, exports, module, __filename, __dirname);", "startup");
      try
      {
        if (!localMultiContextV8.getV8Locker().hasLock())
          localMultiContextV8.getV8Locker().acquire();
        localMultiContextV8.getV8().createNodeRuntime(paramArrayOfByte.getAbsolutePath());
        localMultiContextV8.getV8Locker().release();
        return paramString;
      }
      finally
      {
        paramArrayOfByte.delete();
        AppMethodBeat.o(74965);
      }
    }
    catch (IOException paramString)
    {
      paramString = new RuntimeException(paramString);
      AppMethodBeat.o(74965);
    }
    throw paramString;
  }

  private static File createTemporaryScriptFile(String paramString1, String paramString2)
  {
    AppMethodBeat.i(74973);
    File localFile = File.createTempFile(paramString2, ".js.tmp", sTmpFileDirectoryDelegate.getDirectory());
    paramString2 = new PrintWriter(localFile, "UTF-8");
    try
    {
      paramString2.print(paramString1);
      return localFile;
    }
    finally
    {
      paramString2.close();
      AppMethodBeat.o(74973);
    }
    throw paramString1;
  }

  private void init(V8Function paramV8Function)
  {
    this.require = paramV8Function;
  }

  public static void setGetTmpFileDirectoryDelegate(MultiContextNodeJS.IGetTmpFileDirectory paramIGetTmpFileDirectory)
  {
    if (paramIGetTmpFileDirectory == null);
    while (true)
    {
      return;
      sTmpFileDirectoryDelegate = paramIGetTmpFileDirectory;
    }
  }

  public final void closeUVLoop()
  {
    AppMethodBeat.i(74967);
    this.mv8.getV8().closeUVLoop();
    AppMethodBeat.o(74967);
  }

  public final void debuggerMessageLoop()
  {
    AppMethodBeat.i(74972);
    this.mv8.debuggerMessageLoop();
    AppMethodBeat.o(74972);
  }

  public final V8Context getMainContext()
  {
    return this.mainContext;
  }

  public final MultiContextV8 getRuntime()
  {
    return this.mv8;
  }

  public final boolean handleMessage()
  {
    AppMethodBeat.i(74968);
    this.mv8.getV8().checkThread();
    boolean bool = this.mv8.getV8().pumpMessageLoop();
    AppMethodBeat.o(74968);
    return bool;
  }

  public final boolean isRunning()
  {
    AppMethodBeat.i(74969);
    this.mv8.getV8().checkThread();
    boolean bool = this.mv8.getV8().isRunning();
    AppMethodBeat.o(74969);
    return bool;
  }

  public final void release()
  {
    AppMethodBeat.i(74970);
    this.mv8.getV8().checkThread();
    if (!this.require.isReleased())
      this.require.release();
    if (!this.mainContext.isReleased())
      this.mainContext.release();
    this.mv8.release();
    AppMethodBeat.o(74970);
  }

  public final void waitForDebugger(String paramString)
  {
    AppMethodBeat.i(74971);
    this.mv8.waitForDebugger(paramString);
    AppMethodBeat.o(74971);
  }

  public final void wakeUpUVLoop()
  {
    AppMethodBeat.i(74966);
    this.mv8.getV8().wakeUpUVLoop();
    AppMethodBeat.o(74966);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.MultiContextNodeJS
 * JD-Core Version:    0.6.2
 */