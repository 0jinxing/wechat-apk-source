package com.tencent.tinker.loader;

import android.content.Context;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import java.io.File;

public class TinkerUncaughtHandler
  implements Thread.UncaughtExceptionHandler
{
  private final File ACV;
  private final Context context;
  private final Thread.UncaughtExceptionHandler xzv;

  public TinkerUncaughtHandler(Context paramContext)
  {
    this.context = paramContext;
    this.xzv = Thread.getDefaultUncaughtExceptionHandler();
    this.ACV = SharePatchFileUtil.jj(paramContext);
  }

  // ERROR //
  public void uncaughtException(Thread paramThread, java.lang.Throwable paramThrowable)
  {
    // Byte code:
    //   0: new 42	java/lang/StringBuilder
    //   3: dup
    //   4: ldc 44
    //   6: invokespecial 47	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   9: aload_2
    //   10: invokestatic 53	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   13: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: pop
    //   17: aload_0
    //   18: getfield 27	com/tencent/tinker/loader/TinkerUncaughtHandler:xzv	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   21: aload_1
    //   22: aload_2
    //   23: invokeinterface 59 3 0
    //   28: aload_0
    //   29: getfield 35	com/tencent/tinker/loader/TinkerUncaughtHandler:ACV	Ljava/io/File;
    //   32: ifnull +34 -> 66
    //   35: invokestatic 25	java/lang/Thread:getDefaultUncaughtExceptionHandler	()Ljava/lang/Thread$UncaughtExceptionHandler;
    //   38: instanceof 2
    //   41: ifeq +25 -> 66
    //   44: aload_0
    //   45: getfield 35	com/tencent/tinker/loader/TinkerUncaughtHandler:ACV	Ljava/io/File;
    //   48: invokevirtual 65	java/io/File:getParentFile	()Ljava/io/File;
    //   51: astore_1
    //   52: aload_1
    //   53: invokevirtual 69	java/io/File:exists	()Z
    //   56: ifne +11 -> 67
    //   59: aload_1
    //   60: invokevirtual 72	java/io/File:mkdirs	()Z
    //   63: ifne +4 -> 67
    //   66: return
    //   67: new 74	java/io/PrintWriter
    //   70: astore_3
    //   71: new 76	java/io/FileWriter
    //   74: astore_1
    //   75: aload_1
    //   76: aload_0
    //   77: getfield 35	com/tencent/tinker/loader/TinkerUncaughtHandler:ACV	Ljava/io/File;
    //   80: iconst_0
    //   81: invokespecial 79	java/io/FileWriter:<init>	(Ljava/io/File;Z)V
    //   84: aload_3
    //   85: aload_1
    //   86: invokespecial 82	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   89: aload_3
    //   90: astore_1
    //   91: new 42	java/lang/StringBuilder
    //   94: astore 4
    //   96: aload_3
    //   97: astore_1
    //   98: aload 4
    //   100: ldc 84
    //   102: invokespecial 47	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   105: aload_3
    //   106: astore_1
    //   107: aload_3
    //   108: aload 4
    //   110: aload_0
    //   111: getfield 19	com/tencent/tinker/loader/TinkerUncaughtHandler:context	Landroid/content/Context;
    //   114: invokestatic 90	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:aD	(Landroid/content/Context;)Ljava/lang/String;
    //   117: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: invokevirtual 97	java/io/PrintWriter:println	(Ljava/lang/String;)V
    //   126: aload_3
    //   127: astore_1
    //   128: aload_3
    //   129: aload_2
    //   130: invokestatic 100	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:m	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   133: invokevirtual 97	java/io/PrintWriter:println	(Ljava/lang/String;)V
    //   136: aload_3
    //   137: invokestatic 104	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   140: invokestatic 110	android/os/Process:myPid	()I
    //   143: invokestatic 114	android/os/Process:killProcess	(I)V
    //   146: goto -80 -> 66
    //   149: astore 4
    //   151: aconst_null
    //   152: astore_2
    //   153: aload_2
    //   154: astore_1
    //   155: new 42	java/lang/StringBuilder
    //   158: astore_3
    //   159: aload_2
    //   160: astore_1
    //   161: aload_3
    //   162: ldc 116
    //   164: invokespecial 47	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   167: aload_2
    //   168: astore_1
    //   169: aload_3
    //   170: aload 4
    //   172: invokestatic 53	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   175: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: pop
    //   179: aload_2
    //   180: invokestatic 104	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   183: goto -43 -> 140
    //   186: astore_2
    //   187: aconst_null
    //   188: astore_1
    //   189: aload_1
    //   190: invokestatic 104	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   193: aload_2
    //   194: athrow
    //   195: astore_2
    //   196: goto -7 -> 189
    //   199: astore 4
    //   201: aload_3
    //   202: astore_2
    //   203: goto -50 -> 153
    //
    // Exception table:
    //   from	to	target	type
    //   67	89	149	java/io/IOException
    //   67	89	186	finally
    //   91	96	195	finally
    //   98	105	195	finally
    //   107	126	195	finally
    //   128	136	195	finally
    //   155	159	195	finally
    //   161	167	195	finally
    //   169	179	195	finally
    //   91	96	199	java/io/IOException
    //   98	105	199	java/io/IOException
    //   107	126	199	java/io/IOException
    //   128	136	199	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.TinkerUncaughtHandler
 * JD-Core Version:    0.6.2
 */