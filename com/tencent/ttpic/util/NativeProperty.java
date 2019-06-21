package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.LogUtils;

public class NativeProperty
{
  private static final int ARM_FEATURE_ARMv7 = 1;
  private static final int ARM_FEATURE_NEON = 4;
  private static final int FAMILY_ARM = 1;
  private static final int FAMILY_ARM64 = 4;
  private static int cpuFamily = 1;
  private static int cpuFeature;

  static
  {
    AppMethodBeat.i(83937);
    try
    {
      System.loadLibrary("pitu_tools");
      String str = getSystemProperty("ro.product.cpu.abi");
      if ((str == null) || (str.equals("x86")))
      {
        cpuFeature = 5;
        AppMethodBeat.o(83937);
      }
      while (true)
      {
        return;
        cpuFeature = nGetCpuInfo();
        AppMethodBeat.o(83937);
      }
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      while (true)
      {
        LogUtils.e(localUnsatisfiedLinkError);
        AppMethodBeat.o(83937);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        LogUtils.e(localRuntimeException);
        AppMethodBeat.o(83937);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        LogUtils.e(localException);
        AppMethodBeat.o(83937);
      }
    }
  }

  public static int cpuFeature()
  {
    return cpuFeature;
  }

  // ERROR //
  public static String getSystemProperty(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 74
    //   4: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: invokestatic 80	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   10: ldc 82
    //   12: aload_0
    //   13: invokestatic 86	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   16: invokevirtual 89	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   19: invokevirtual 93	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   22: astore_2
    //   23: new 95	java/io/BufferedReader
    //   26: astore_3
    //   27: new 97	java/io/InputStreamReader
    //   30: astore_0
    //   31: aload_0
    //   32: aload_2
    //   33: invokevirtual 103	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   36: invokespecial 106	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   39: aload_3
    //   40: aload_0
    //   41: sipush 1024
    //   44: invokespecial 109	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   47: aload_3
    //   48: astore_0
    //   49: aload_3
    //   50: invokevirtual 113	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   53: astore_1
    //   54: aload_3
    //   55: astore_0
    //   56: aload_3
    //   57: invokevirtual 116	java/io/BufferedReader:close	()V
    //   60: aload_3
    //   61: invokevirtual 116	java/io/BufferedReader:close	()V
    //   64: ldc 74
    //   66: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: aload_1
    //   70: astore_0
    //   71: aload_0
    //   72: areturn
    //   73: astore_0
    //   74: aload_0
    //   75: invokestatic 67	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   78: goto -14 -> 64
    //   81: astore_1
    //   82: aconst_null
    //   83: astore_3
    //   84: aload_3
    //   85: astore_0
    //   86: aload_1
    //   87: invokestatic 67	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   90: aload_3
    //   91: ifnull +7 -> 98
    //   94: aload_3
    //   95: invokevirtual 116	java/io/BufferedReader:close	()V
    //   98: ldc 74
    //   100: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: aconst_null
    //   104: astore_0
    //   105: goto -34 -> 71
    //   108: astore_0
    //   109: aload_0
    //   110: invokestatic 67	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   113: goto -15 -> 98
    //   116: astore_0
    //   117: aload_1
    //   118: astore_3
    //   119: aload_3
    //   120: ifnull +7 -> 127
    //   123: aload_3
    //   124: invokevirtual 116	java/io/BufferedReader:close	()V
    //   127: ldc 74
    //   129: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: aload_0
    //   133: athrow
    //   134: astore_3
    //   135: aload_3
    //   136: invokestatic 67	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   139: goto -12 -> 127
    //   142: astore_3
    //   143: aload_0
    //   144: astore_1
    //   145: aload_3
    //   146: astore_0
    //   147: aload_1
    //   148: astore_3
    //   149: goto -30 -> 119
    //   152: astore_1
    //   153: goto -69 -> 84
    //
    // Exception table:
    //   from	to	target	type
    //   60	64	73	java/io/IOException
    //   7	47	81	java/io/IOException
    //   94	98	108	java/io/IOException
    //   7	47	116	finally
    //   123	127	134	java/io/IOException
    //   49	54	142	finally
    //   56	60	142	finally
    //   86	90	142	finally
    //   49	54	152	java/io/IOException
    //   56	60	152	java/io/IOException
  }

  public static boolean hasNeonFeature()
  {
    boolean bool = true;
    if ((1 == cpuFamily) && ((cpuFeature & 0x4) != 0));
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public static boolean isArmV7Feature()
  {
    boolean bool1 = true;
    if (1 == cpuFamily)
    {
      bool2 = bool1;
      if ((cpuFeature & 0x1) != 0);
    }
    else
    {
      if (4 != cpuFamily)
        break label30;
    }
    label30: for (boolean bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  private static native int nGetCpuInfo();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.NativeProperty
 * JD-Core Version:    0.6.2
 */