package com.tencent.mm.ipcinvoker;

import android.content.Context;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import junit.framework.Assert;

public final class e
{
  private static String eFZ;
  public static Context sContext;

  public static String PN()
  {
    AppMethodBeat.i(114023);
    if ((eFZ == null) || (eFZ.length() == 0))
      eFZ = z(sContext, Process.myPid());
    String str = eFZ;
    AppMethodBeat.o(114023);
    return str;
  }

  public static Context getContext()
  {
    AppMethodBeat.i(114021);
    Assert.assertNotNull("IPCInvoker not initialize.", sContext);
    Context localContext = sContext;
    AppMethodBeat.o(114021);
    return localContext;
  }

  public static boolean lg(String paramString)
  {
    AppMethodBeat.i(114022);
    boolean bool;
    if ((paramString != null) && (paramString.equals(PN())))
    {
      bool = true;
      AppMethodBeat.o(114022);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(114022);
    }
  }

  // ERROR //
  private static String z(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: ldc 63
    //   2: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ifnonnull +12 -> 18
    //   9: ldc 63
    //   11: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   14: aconst_null
    //   15: astore_0
    //   16: aload_0
    //   17: areturn
    //   18: aload_0
    //   19: ldc 65
    //   21: invokevirtual 71	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   24: checkcast 73	android/app/ActivityManager
    //   27: astore_0
    //   28: aload_0
    //   29: ifnull +68 -> 97
    //   32: aload_0
    //   33: invokevirtual 77	android/app/ActivityManager:getRunningAppProcesses	()Ljava/util/List;
    //   36: astore_0
    //   37: aload_0
    //   38: ifnull +59 -> 97
    //   41: aload_0
    //   42: invokeinterface 83 1 0
    //   47: ifne +50 -> 97
    //   50: aload_0
    //   51: invokeinterface 87 1 0
    //   56: astore_0
    //   57: aload_0
    //   58: invokeinterface 92 1 0
    //   63: ifeq +34 -> 97
    //   66: aload_0
    //   67: invokeinterface 96 1 0
    //   72: checkcast 98	android/app/ActivityManager$RunningAppProcessInfo
    //   75: astore_2
    //   76: aload_2
    //   77: getfield 102	android/app/ActivityManager$RunningAppProcessInfo:pid	I
    //   80: iload_1
    //   81: if_icmpne -24 -> 57
    //   84: aload_2
    //   85: getfield 105	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   88: astore_0
    //   89: ldc 63
    //   91: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: goto -78 -> 16
    //   97: sipush 128
    //   100: newarray byte
    //   102: astore_3
    //   103: new 107	java/io/FileInputStream
    //   106: astore_2
    //   107: new 109	java/lang/StringBuilder
    //   110: astore_0
    //   111: aload_0
    //   112: ldc 111
    //   114: invokespecial 115	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   117: aload_2
    //   118: aload_0
    //   119: iload_1
    //   120: invokevirtual 119	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   123: ldc 121
    //   125: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: invokespecial 128	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   134: aload_2
    //   135: astore_0
    //   136: aload_2
    //   137: aload_3
    //   138: invokevirtual 132	java/io/FileInputStream:read	([B)I
    //   141: istore 4
    //   143: iload 4
    //   145: ifle +72 -> 217
    //   148: iconst_0
    //   149: istore_1
    //   150: iload 4
    //   152: istore 5
    //   154: iload_1
    //   155: iload 4
    //   157: if_icmpge +21 -> 178
    //   160: aload_3
    //   161: iload_1
    //   162: baload
    //   163: sipush 128
    //   166: if_icmpgt +9 -> 175
    //   169: aload_3
    //   170: iload_1
    //   171: baload
    //   172: ifgt +39 -> 211
    //   175: iload_1
    //   176: istore 5
    //   178: aload_2
    //   179: astore_0
    //   180: new 21	java/lang/String
    //   183: astore 6
    //   185: aload_2
    //   186: astore_0
    //   187: aload 6
    //   189: aload_3
    //   190: iconst_0
    //   191: iload 5
    //   193: invokespecial 135	java/lang/String:<init>	([BII)V
    //   196: aload_2
    //   197: invokevirtual 139	java/io/FileInputStream:close	()V
    //   200: ldc 63
    //   202: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   205: aload 6
    //   207: astore_0
    //   208: goto -192 -> 16
    //   211: iinc 1 1
    //   214: goto -64 -> 150
    //   217: aload_2
    //   218: invokevirtual 139	java/io/FileInputStream:close	()V
    //   221: ldc 63
    //   223: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   226: aconst_null
    //   227: astore_0
    //   228: goto -212 -> 16
    //   231: astore 6
    //   233: aconst_null
    //   234: astore_2
    //   235: aload_2
    //   236: astore_0
    //   237: ldc 141
    //   239: ldc 143
    //   241: iconst_1
    //   242: anewarray 4	java/lang/Object
    //   245: dup
    //   246: iconst_0
    //   247: aload 6
    //   249: invokestatic 149	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   252: aastore
    //   253: invokestatic 155	com/tencent/mm/ipcinvoker/h/b:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   256: aload_2
    //   257: ifnull -36 -> 221
    //   260: aload_2
    //   261: invokevirtual 139	java/io/FileInputStream:close	()V
    //   264: goto -43 -> 221
    //   267: astore_0
    //   268: goto -47 -> 221
    //   271: astore_2
    //   272: aconst_null
    //   273: astore_0
    //   274: aload_0
    //   275: ifnull +7 -> 282
    //   278: aload_0
    //   279: invokevirtual 139	java/io/FileInputStream:close	()V
    //   282: ldc 63
    //   284: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   287: aload_2
    //   288: athrow
    //   289: astore_0
    //   290: goto -90 -> 200
    //   293: astore_0
    //   294: goto -73 -> 221
    //   297: astore_0
    //   298: goto -16 -> 282
    //   301: astore_2
    //   302: goto -28 -> 274
    //   305: astore 6
    //   307: goto -72 -> 235
    //
    // Exception table:
    //   from	to	target	type
    //   103	134	231	java/lang/Exception
    //   260	264	267	java/lang/Exception
    //   103	134	271	finally
    //   196	200	289	java/lang/Exception
    //   217	221	293	java/lang/Exception
    //   278	282	297	java/lang/Exception
    //   136	143	301	finally
    //   180	185	301	finally
    //   187	196	301	finally
    //   237	256	301	finally
    //   136	143	305	java/lang/Exception
    //   180	185	305	java/lang/Exception
    //   187	196	305	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.e
 * JD-Core Version:    0.6.2
 */