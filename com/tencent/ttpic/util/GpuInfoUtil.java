package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class GpuInfoUtil
{
  private static final String TAG;
  private static String gpuInfo;

  static
  {
    AppMethodBeat.i(83930);
    TAG = GpuInfoUtil.class.getSimpleName();
    AppMethodBeat.o(83930);
  }

  // ERROR //
  public static String getGPUInfo()
  {
    // Byte code:
    //   0: ldc 40
    //   2: invokestatic 16	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 34	com/tencent/ttpic/util/GpuInfoUtil:gpuInfo	Ljava/lang/String;
    //   8: ifnonnull +48 -> 56
    //   11: new 4	java/lang/Object
    //   14: dup
    //   15: invokespecial 31	java/lang/Object:<init>	()V
    //   18: astore_0
    //   19: new 42	com/tencent/ttpic/util/GpuInfoUtil$1
    //   22: dup
    //   23: aload_0
    //   24: invokespecial 45	com/tencent/ttpic/util/GpuInfoUtil$1:<init>	(Ljava/lang/Object;)V
    //   27: astore_1
    //   28: invokestatic 51	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   31: astore_2
    //   32: invokestatic 57	com/tencent/view/c:dSN	()Lcom/tencent/view/c;
    //   35: astore_3
    //   36: aload_3
    //   37: getfield 61	com/tencent/view/c:mGlThread	Landroid/os/HandlerThread;
    //   40: ifnonnull +27 -> 67
    //   43: aconst_null
    //   44: astore_3
    //   45: aload_2
    //   46: aload_3
    //   47: if_acmpne +31 -> 78
    //   50: aload_1
    //   51: invokeinterface 66 1 0
    //   56: getstatic 34	com/tencent/ttpic/util/GpuInfoUtil:gpuInfo	Ljava/lang/String;
    //   59: astore_3
    //   60: ldc 40
    //   62: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   65: aload_3
    //   66: areturn
    //   67: aload_3
    //   68: getfield 61	com/tencent/view/c:mGlThread	Landroid/os/HandlerThread;
    //   71: invokevirtual 71	android/os/HandlerThread:getLooper	()Landroid/os/Looper;
    //   74: astore_3
    //   75: goto -30 -> 45
    //   78: aload_0
    //   79: monitorenter
    //   80: invokestatic 57	com/tencent/view/c:dSN	()Lcom/tencent/view/c;
    //   83: aload_1
    //   84: invokevirtual 75	com/tencent/view/c:queue	(Ljava/lang/Runnable;)V
    //   87: aload_0
    //   88: invokevirtual 78	java/lang/Object:wait	()V
    //   91: aload_0
    //   92: monitorexit
    //   93: goto -37 -> 56
    //   96: astore_3
    //   97: aload_0
    //   98: monitorexit
    //   99: ldc 40
    //   101: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   104: aload_3
    //   105: athrow
    //   106: astore_3
    //   107: getstatic 24	com/tencent/ttpic/util/GpuInfoUtil:TAG	Ljava/lang/String;
    //   110: ldc 80
    //   112: invokestatic 86	com/tencent/ttpic/baseutils/LogUtils:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   115: goto -24 -> 91
    //
    // Exception table:
    //   from	to	target	type
    //   80	87	96	finally
    //   87	91	96	finally
    //   91	93	96	finally
    //   97	99	96	finally
    //   107	115	96	finally
    //   87	91	106	java/lang/InterruptedException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.GpuInfoUtil
 * JD-Core Version:    0.6.2
 */