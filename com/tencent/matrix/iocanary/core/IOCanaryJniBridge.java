package com.tencent.matrix.iocanary.core;

import com.tencent.matrix.d.c;
import com.tencent.mrs.b.a.a;
import java.util.ArrayList;

public class IOCanaryJniBridge
{
  private static final String TAG = "Matrix.IOCanaryJniBridge";
  private static boolean sIsLoadJniLib;
  private static boolean sIsTryInstall;
  private static OnJniIssuePublishListener sOnIssuePublishListener;

  private static native boolean doHook();

  private static native boolean doUnHook();

  private static native void enableDetector(int paramInt);

  private static JavaContext getJavaContext()
  {
    try
    {
      JavaContext localJavaContext = new com/tencent/matrix/iocanary/core/IOCanaryJniBridge$JavaContext;
      localJavaContext.<init>(null);
      return localJavaContext;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        c.printErrStackTrace("Matrix.IOCanaryJniBridge", localThrowable, "get javacontext exception", new Object[0]);
        Object localObject = null;
      }
    }
  }

  public static void install(com.tencent.matrix.iocanary.a.a parama, OnJniIssuePublishListener paramOnJniIssuePublishListener)
  {
    c.v("Matrix.IOCanaryJniBridge", "install sIsTryInstall:%b", new Object[] { Boolean.valueOf(sIsTryInstall) });
    if (sIsTryInstall);
    while (true)
    {
      return;
      if (!loadJni())
      {
        c.e("Matrix.IOCanaryJniBridge", "install loadJni failed", new Object[0]);
      }
      else
      {
        sOnIssuePublishListener = paramOnJniIssuePublishListener;
        if (parama != null);
        try
        {
          if (parama.zb())
          {
            enableDetector(0);
            setConfig(0, parama.bUG.get(a.a.Ajp.name(), 500) * 1000L);
          }
          if (parama.zd())
          {
            enableDetector(1);
            setConfig(1, parama.bUG.get(a.a.Ajs.name(), 4096));
          }
          if (parama.zc())
          {
            enableDetector(2);
            setConfig(2, parama.bUG.get(a.a.Aju.name(), 5));
          }
          doHook();
          sIsTryInstall = true;
        }
        catch (Error parama)
        {
          c.printErrStackTrace("Matrix.IOCanaryJniBridge", parama, "call jni method error", new Object[0]);
        }
      }
    }
  }

  private static boolean loadJni()
  {
    boolean bool = true;
    if (sIsLoadJniLib);
    while (true)
    {
      return bool;
      try
      {
        System.loadLibrary("io-canary");
        sIsLoadJniLib = true;
      }
      catch (Exception localException)
      {
        c.e("Matrix.IOCanaryJniBridge", "hook: e: %s", new Object[] { localException.getLocalizedMessage() });
        sIsLoadJniLib = false;
        bool = false;
      }
    }
  }

  public static void onIssuePublish(ArrayList<IOIssue> paramArrayList)
  {
    if (sOnIssuePublishListener == null);
    while (true)
    {
      return;
      sOnIssuePublishListener.onIssuePublish(paramArrayList);
    }
  }

  private static native void setConfig(int paramInt, long paramLong);

  public static void uninstall()
  {
    if (!sIsTryInstall);
    while (true)
    {
      return;
      doUnHook();
      sIsTryInstall = false;
    }
  }

  static final class ConfigKey
  {
    static final int MAIN_THREAD_THRESHOLD = 0;
    static final int REPEAT_READ_THRESHOLD = 2;
    static final int SMALL_BUFFER_THRESHOLD = 1;
  }

  static final class DetectorType
  {
    static final int MAIN_THREAD_IO = 0;
    static final int REPEAT_READ = 2;
    static final int SMALL_BUFFER = 1;
  }

  static final class JavaContext
  {
    private final String stack = com.tencent.matrix.iocanary.c.a.getThrowableStack(new Throwable());
    private final String threadName = Thread.currentThread().getName();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.iocanary.core.IOCanaryJniBridge
 * JD-Core Version:    0.6.2
 */