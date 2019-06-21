package com.tencent.mm.plugin.normsg.b;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.c;
import java.util.List;
import java.util.Map;

public final class a
  implements b.g
{
  public static final a.a<String> oTR;
  private long oTS;
  private long oTT;
  private long oTU;
  private long oTV;
  private long oTW;
  private int oTX;
  private boolean oTY;
  private long oTZ;

  static
  {
    AppMethodBeat.i(10388);
    a.a locala = new a.a((byte)0);
    oTR = locala;
    locala.add("");
    oTR.add(":tools");
    oTR.add(":toolsmp");
    oTR.add(":appbrand0");
    oTR.add(":appbrand1");
    oTR.add(":appbrand2");
    oTR.add(":appbrand3");
    oTR.add(":appbrand4");
    AppMethodBeat.o(10388);
  }

  private a()
  {
    AppMethodBeat.i(10371);
    this.oTS = 0L;
    this.oTT = 0L;
    this.oTU = 0L;
    this.oTV = 0L;
    this.oTW = 0L;
    this.oTX = 0;
    this.oTY = false;
    this.oTZ = 0L;
    bVW();
    AppMethodBeat.o(10371);
  }

  // ERROR //
  private static String Ap(int paramInt)
  {
    // Byte code:
    //   0: sipush 10384
    //   3: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 96	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   9: ldc 98
    //   11: invokevirtual 104	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   14: checkcast 106	android/app/ActivityManager
    //   17: astore_1
    //   18: aload_1
    //   19: ifnonnull +14 -> 33
    //   22: ldc 42
    //   24: astore_2
    //   25: sipush 10384
    //   28: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   31: aload_2
    //   32: areturn
    //   33: aload_1
    //   34: invokevirtual 110	android/app/ActivityManager:getRunningAppProcesses	()Ljava/util/List;
    //   37: astore_2
    //   38: aload_2
    //   39: ifnull +64 -> 103
    //   42: aload_2
    //   43: invokeinterface 116 1 0
    //   48: astore_3
    //   49: aload_3
    //   50: invokeinterface 122 1 0
    //   55: ifeq +48 -> 103
    //   58: aload_3
    //   59: invokeinterface 126 1 0
    //   64: checkcast 128	android/app/ActivityManager$RunningAppProcessInfo
    //   67: astore_2
    //   68: aload_2
    //   69: getfield 131	android/app/ActivityManager$RunningAppProcessInfo:pid	I
    //   72: iload_0
    //   73: if_icmpne -24 -> 49
    //   76: aload_2
    //   77: getfield 135	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   80: astore_2
    //   81: sipush 10384
    //   84: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: goto -56 -> 31
    //   90: astore_2
    //   91: ldc 137
    //   93: aload_2
    //   94: ldc 139
    //   96: iconst_0
    //   97: anewarray 4	java/lang/Object
    //   100: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   103: aload_1
    //   104: sipush 16384
    //   107: invokevirtual 149	android/app/ActivityManager:getRunningServices	(I)Ljava/util/List;
    //   110: astore_2
    //   111: aload_2
    //   112: ifnull +64 -> 176
    //   115: aload_2
    //   116: invokeinterface 116 1 0
    //   121: astore_2
    //   122: aload_2
    //   123: invokeinterface 122 1 0
    //   128: ifeq +48 -> 176
    //   131: aload_2
    //   132: invokeinterface 126 1 0
    //   137: checkcast 151	android/app/ActivityManager$RunningServiceInfo
    //   140: astore_1
    //   141: aload_1
    //   142: getfield 152	android/app/ActivityManager$RunningServiceInfo:pid	I
    //   145: iload_0
    //   146: if_icmpne -24 -> 122
    //   149: aload_1
    //   150: getfield 155	android/app/ActivityManager$RunningServiceInfo:process	Ljava/lang/String;
    //   153: astore_2
    //   154: sipush 10384
    //   157: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   160: goto -129 -> 31
    //   163: astore_2
    //   164: ldc 137
    //   166: aload_2
    //   167: ldc 157
    //   169: iconst_0
    //   170: anewarray 4	java/lang/Object
    //   173: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   176: aconst_null
    //   177: astore_3
    //   178: new 159	java/io/BufferedReader
    //   181: astore_1
    //   182: new 161	java/io/FileReader
    //   185: astore_2
    //   186: aload_2
    //   187: getstatic 167	java/util/Locale:ENGLISH	Ljava/util/Locale;
    //   190: ldc 169
    //   192: invokestatic 175	com/tencent/mm/plugin/normsg/b/d:TQ	(Ljava/lang/String;)Ljava/lang/String;
    //   195: iconst_1
    //   196: anewarray 4	java/lang/Object
    //   199: dup
    //   200: iconst_0
    //   201: iload_0
    //   202: invokestatic 181	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   205: aastore
    //   206: invokestatic 187	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   209: invokespecial 190	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   212: aload_1
    //   213: aload_2
    //   214: invokespecial 193	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   217: aload_1
    //   218: astore_2
    //   219: aload_1
    //   220: invokevirtual 197	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   223: astore_3
    //   224: aload_3
    //   225: ifnull +25 -> 250
    //   228: aload_1
    //   229: astore_2
    //   230: aload_3
    //   231: invokevirtual 200	java/lang/String:trim	()Ljava/lang/String;
    //   234: astore_3
    //   235: aload_3
    //   236: astore_2
    //   237: aload_1
    //   238: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   241: sipush 10384
    //   244: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   247: goto -216 -> 31
    //   250: aload_1
    //   251: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   254: ldc 42
    //   256: astore_2
    //   257: sipush 10384
    //   260: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   263: goto -232 -> 31
    //   266: astore_3
    //   267: aconst_null
    //   268: astore_1
    //   269: aload_1
    //   270: astore_2
    //   271: ldc 137
    //   273: aload_3
    //   274: ldc 208
    //   276: iconst_0
    //   277: anewarray 4	java/lang/Object
    //   280: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   283: aload_1
    //   284: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   287: goto -33 -> 254
    //   290: astore_2
    //   291: aload_3
    //   292: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   295: sipush 10384
    //   298: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   301: aload_2
    //   302: athrow
    //   303: astore_1
    //   304: aload_2
    //   305: astore_3
    //   306: aload_1
    //   307: astore_2
    //   308: goto -17 -> 291
    //   311: astore_3
    //   312: goto -43 -> 269
    //
    // Exception table:
    //   from	to	target	type
    //   33	38	90	java/lang/Throwable
    //   42	49	90	java/lang/Throwable
    //   49	81	90	java/lang/Throwable
    //   103	111	163	java/lang/Throwable
    //   115	122	163	java/lang/Throwable
    //   122	154	163	java/lang/Throwable
    //   178	217	266	java/lang/Throwable
    //   178	217	290	finally
    //   219	224	303	finally
    //   230	235	303	finally
    //   271	283	303	finally
    //   219	224	311	java/lang/Throwable
    //   230	235	311	java/lang/Throwable
  }

  public static String TS(String paramString)
  {
    AppMethodBeat.i(10385);
    int i = paramString.indexOf(':');
    if (i != -1)
    {
      paramString = paramString.substring(i);
      AppMethodBeat.o(10385);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(10385);
    }
  }

  public static a bVT()
  {
    return a.b.oUa;
  }

  private void bVV()
  {
    try
    {
      AppMethodBeat.i(10376);
      long l = System.currentTimeMillis();
      if (l - this.oTV >= 259200000L)
      {
        this.oTW = 0L;
        this.oTV = l;
        bVX();
      }
      AppMethodBeat.o(10376);
      return;
    }
    finally
    {
    }
  }

  // ERROR //
  private void bVW()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: sipush 10377
    //   5: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 236	java/io/File
    //   11: astore_1
    //   12: aload_1
    //   13: invokestatic 96	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   16: invokevirtual 240	android/content/Context:getCacheDir	()Ljava/io/File;
    //   19: ldc 242
    //   21: invokestatic 175	com/tencent/mm/plugin/normsg/b/d:TQ	(Ljava/lang/String;)Ljava/lang/String;
    //   24: invokespecial 245	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   27: new 247	java/io/DataInputStream
    //   30: astore_2
    //   31: new 249	java/io/BufferedInputStream
    //   34: astore_3
    //   35: new 251	java/io/FileInputStream
    //   38: astore 4
    //   40: aload 4
    //   42: aload_1
    //   43: invokespecial 254	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   46: aload_3
    //   47: aload 4
    //   49: invokespecial 257	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   52: aload_2
    //   53: aload_3
    //   54: invokespecial 258	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   57: aload_2
    //   58: astore_1
    //   59: aload_2
    //   60: invokevirtual 262	java/io/DataInputStream:readInt	()I
    //   63: i2l
    //   64: ldc2_w 263
    //   67: lcmp
    //   68: ifeq +102 -> 170
    //   71: aload_2
    //   72: astore_1
    //   73: new 266	java/lang/IllegalStateException
    //   76: astore_3
    //   77: aload_2
    //   78: astore_1
    //   79: aload_3
    //   80: ldc_w 268
    //   83: invokespecial 269	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   86: aload_2
    //   87: astore_1
    //   88: sipush 10377
    //   91: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: aload_2
    //   95: astore_1
    //   96: aload_3
    //   97: athrow
    //   98: astore_3
    //   99: aload_2
    //   100: astore_1
    //   101: ldc 137
    //   103: aload_3
    //   104: ldc_w 271
    //   107: iconst_0
    //   108: anewarray 4	java/lang/Object
    //   111: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   114: aload_2
    //   115: astore_1
    //   116: aload_0
    //   117: lconst_0
    //   118: putfield 68	com/tencent/mm/plugin/normsg/b/a:oTS	J
    //   121: aload_2
    //   122: astore_1
    //   123: aload_0
    //   124: lconst_0
    //   125: putfield 70	com/tencent/mm/plugin/normsg/b/a:oTT	J
    //   128: aload_2
    //   129: astore_1
    //   130: aload_0
    //   131: lconst_0
    //   132: putfield 72	com/tencent/mm/plugin/normsg/b/a:oTU	J
    //   135: aload_2
    //   136: astore_1
    //   137: aload_0
    //   138: invokestatic 229	java/lang/System:currentTimeMillis	()J
    //   141: putfield 74	com/tencent/mm/plugin/normsg/b/a:oTV	J
    //   144: aload_2
    //   145: astore_1
    //   146: aload_0
    //   147: lconst_0
    //   148: putfield 76	com/tencent/mm/plugin/normsg/b/a:oTW	J
    //   151: aload_2
    //   152: astore_1
    //   153: aload_0
    //   154: invokespecial 234	com/tencent/mm/plugin/normsg/b/a:bVX	()V
    //   157: aload_2
    //   158: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   161: sipush 10377
    //   164: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   167: aload_0
    //   168: monitorexit
    //   169: return
    //   170: aload_2
    //   171: astore_1
    //   172: aload_0
    //   173: aload_2
    //   174: invokevirtual 274	java/io/DataInputStream:readLong	()J
    //   177: putfield 68	com/tencent/mm/plugin/normsg/b/a:oTS	J
    //   180: aload_2
    //   181: astore_1
    //   182: aload_0
    //   183: aload_2
    //   184: invokevirtual 274	java/io/DataInputStream:readLong	()J
    //   187: putfield 70	com/tencent/mm/plugin/normsg/b/a:oTT	J
    //   190: aload_2
    //   191: astore_1
    //   192: aload_0
    //   193: aload_2
    //   194: invokevirtual 274	java/io/DataInputStream:readLong	()J
    //   197: putfield 72	com/tencent/mm/plugin/normsg/b/a:oTU	J
    //   200: aload_2
    //   201: astore_1
    //   202: aload_0
    //   203: aload_2
    //   204: invokevirtual 274	java/io/DataInputStream:readLong	()J
    //   207: putfield 74	com/tencent/mm/plugin/normsg/b/a:oTV	J
    //   210: aload_2
    //   211: astore_1
    //   212: aload_2
    //   213: invokevirtual 274	java/io/DataInputStream:readLong	()J
    //   216: lstore 5
    //   218: lload 5
    //   220: lconst_0
    //   221: lcmp
    //   222: ifle +22 -> 244
    //   225: aload_2
    //   226: astore_1
    //   227: aload_0
    //   228: getfield 76	com/tencent/mm/plugin/normsg/b/a:oTW	J
    //   231: lconst_0
    //   232: lcmp
    //   233: ifgt +11 -> 244
    //   236: aload_2
    //   237: astore_1
    //   238: aload_0
    //   239: lload 5
    //   241: putfield 76	com/tencent/mm/plugin/normsg/b/a:oTW	J
    //   244: aload_2
    //   245: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   248: sipush 10377
    //   251: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   254: goto -87 -> 167
    //   257: astore_1
    //   258: aload_0
    //   259: monitorexit
    //   260: aload_1
    //   261: athrow
    //   262: astore_2
    //   263: aconst_null
    //   264: astore_1
    //   265: aload_1
    //   266: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   269: sipush 10377
    //   272: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   275: aload_2
    //   276: athrow
    //   277: astore_2
    //   278: goto -13 -> 265
    //   281: astore_3
    //   282: aconst_null
    //   283: astore_2
    //   284: goto -185 -> 99
    //
    // Exception table:
    //   from	to	target	type
    //   59	71	98	java/lang/Throwable
    //   73	77	98	java/lang/Throwable
    //   79	86	98	java/lang/Throwable
    //   88	94	98	java/lang/Throwable
    //   96	98	98	java/lang/Throwable
    //   172	180	98	java/lang/Throwable
    //   182	190	98	java/lang/Throwable
    //   192	200	98	java/lang/Throwable
    //   202	210	98	java/lang/Throwable
    //   212	218	98	java/lang/Throwable
    //   227	236	98	java/lang/Throwable
    //   238	244	98	java/lang/Throwable
    //   2	27	257	finally
    //   157	167	257	finally
    //   244	254	257	finally
    //   265	277	257	finally
    //   27	57	262	finally
    //   59	71	277	finally
    //   73	77	277	finally
    //   79	86	277	finally
    //   88	94	277	finally
    //   96	98	277	finally
    //   101	114	277	finally
    //   116	121	277	finally
    //   123	128	277	finally
    //   130	135	277	finally
    //   137	144	277	finally
    //   146	151	277	finally
    //   153	157	277	finally
    //   172	180	277	finally
    //   182	190	277	finally
    //   192	200	277	finally
    //   202	210	277	finally
    //   212	218	277	finally
    //   227	236	277	finally
    //   238	244	277	finally
    //   27	57	281	java/lang/Throwable
  }

  // ERROR //
  private void bVX()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: sipush 10378
    //   5: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 236	java/io/File
    //   11: astore_1
    //   12: aload_1
    //   13: invokestatic 96	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   16: invokevirtual 240	android/content/Context:getCacheDir	()Ljava/io/File;
    //   19: ldc 242
    //   21: invokestatic 175	com/tencent/mm/plugin/normsg/b/d:TQ	(Ljava/lang/String;)Ljava/lang/String;
    //   24: invokespecial 245	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   27: new 276	java/io/DataOutputStream
    //   30: astore_2
    //   31: new 278	java/io/BufferedOutputStream
    //   34: astore_3
    //   35: new 280	java/io/FileOutputStream
    //   38: astore 4
    //   40: aload 4
    //   42: aload_1
    //   43: invokespecial 281	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   46: aload_3
    //   47: aload 4
    //   49: invokespecial 284	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   52: aload_2
    //   53: aload_3
    //   54: invokespecial 285	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   57: aload_2
    //   58: astore_1
    //   59: aload_2
    //   60: ldc_w 286
    //   63: invokevirtual 289	java/io/DataOutputStream:writeInt	(I)V
    //   66: aload_2
    //   67: astore_1
    //   68: aload_2
    //   69: aload_0
    //   70: getfield 68	com/tencent/mm/plugin/normsg/b/a:oTS	J
    //   73: invokevirtual 293	java/io/DataOutputStream:writeLong	(J)V
    //   76: aload_2
    //   77: astore_1
    //   78: aload_2
    //   79: aload_0
    //   80: getfield 70	com/tencent/mm/plugin/normsg/b/a:oTT	J
    //   83: invokevirtual 293	java/io/DataOutputStream:writeLong	(J)V
    //   86: aload_2
    //   87: astore_1
    //   88: aload_2
    //   89: aload_0
    //   90: getfield 72	com/tencent/mm/plugin/normsg/b/a:oTU	J
    //   93: invokevirtual 293	java/io/DataOutputStream:writeLong	(J)V
    //   96: aload_2
    //   97: astore_1
    //   98: aload_2
    //   99: aload_0
    //   100: getfield 74	com/tencent/mm/plugin/normsg/b/a:oTV	J
    //   103: invokevirtual 293	java/io/DataOutputStream:writeLong	(J)V
    //   106: aload_2
    //   107: astore_1
    //   108: aload_2
    //   109: aload_0
    //   110: getfield 76	com/tencent/mm/plugin/normsg/b/a:oTW	J
    //   113: invokevirtual 293	java/io/DataOutputStream:writeLong	(J)V
    //   116: aload_2
    //   117: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   120: sipush 10378
    //   123: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   126: aload_0
    //   127: monitorexit
    //   128: return
    //   129: astore_3
    //   130: aconst_null
    //   131: astore_2
    //   132: aload_2
    //   133: astore_1
    //   134: ldc 137
    //   136: aload_3
    //   137: ldc_w 295
    //   140: iconst_0
    //   141: anewarray 4	java/lang/Object
    //   144: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   147: aload_2
    //   148: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   151: sipush 10378
    //   154: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   157: goto -31 -> 126
    //   160: astore_1
    //   161: aload_0
    //   162: monitorexit
    //   163: aload_1
    //   164: athrow
    //   165: astore_1
    //   166: aconst_null
    //   167: astore_3
    //   168: aload_1
    //   169: astore_2
    //   170: aload_3
    //   171: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   174: sipush 10378
    //   177: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   180: aload_2
    //   181: athrow
    //   182: astore_2
    //   183: aload_1
    //   184: astore_3
    //   185: goto -15 -> 170
    //   188: astore_3
    //   189: goto -57 -> 132
    //
    // Exception table:
    //   from	to	target	type
    //   27	57	129	java/lang/Throwable
    //   2	27	160	finally
    //   116	126	160	finally
    //   147	157	160	finally
    //   170	182	160	finally
    //   27	57	165	finally
    //   59	66	182	finally
    //   68	76	182	finally
    //   78	86	182	finally
    //   88	96	182	finally
    //   98	106	182	finally
    //   108	116	182	finally
    //   134	147	182	finally
    //   59	66	188	java/lang/Throwable
    //   68	76	188	java/lang/Throwable
    //   78	86	188	java/lang/Throwable
    //   88	96	188	java/lang/Throwable
    //   98	106	188	java/lang/Throwable
    //   108	116	188	java/lang/Throwable
  }

  private void bVY()
  {
    try
    {
      AppMethodBeat.i(10382);
      long l;
      if (!this.oTY)
      {
        l = System.currentTimeMillis();
        if (l - this.oTZ < 2000L)
          AppMethodBeat.o(10382);
      }
      while (true)
      {
        return;
        this.oTZ = l;
        this.oTY = true;
        com.tencent.mm.plugin.secinforeport.a.d.qjp.Ch(-2147483647);
        AppMethodBeat.o(10382);
      }
    }
    finally
    {
    }
  }

  private void cL(String paramString, int paramInt)
  {
    try
    {
      AppMethodBeat.i(10380);
      long l = System.currentTimeMillis();
      if (l - this.oTS > 86400000L)
      {
        com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.pYm;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("findview, pkg: ");
        localh.g("Normsg_AED", paramString + ", res_count: " + paramInt, null);
        this.oTS = l;
        bVX();
      }
      if ((com.tencent.mm.compatible.util.h.Ms()) && (a.c.bWb()))
        bVY();
      AppMethodBeat.o(10380);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  private void e(int paramInt, View paramView)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(10379);
        if (paramView == null)
        {
          AppMethodBeat.o(10379);
          return;
        }
        if (paramInt != 16)
        {
          AppMethodBeat.o(10379);
          continue;
        }
      }
      finally
      {
      }
      try
      {
        if (this.oTX == 0)
        {
          AppMethodBeat.o(10379);
        }
        else
        {
          if (((paramView instanceof Button)) && (paramView.getId() == this.oTX))
          {
            this.oTW += 1L;
            bVX();
          }
          AppMethodBeat.o(10379);
        }
      }
      finally
      {
        AppMethodBeat.o(10379);
      }
    }
    throw paramView;
  }

  private static String fv(String paramString1, String paramString2)
  {
    AppMethodBeat.i(10386);
    try
    {
      g.RN().QU();
    }
    catch (b paramString1)
    {
      try
      {
        localObject = com.tencent.mm.ipcinvoker.wx_extension.a.a.b.eGM;
        localObject = com.tencent.mm.ipcinvoker.wx_extension.a.a.ll("100373");
        if ((localObject == null) || (!((c)localObject).isValid()))
        {
          ab.w("MircoMsg.AEDHLP", "check point 1, explained by src code.");
          AppMethodBeat.o(10386);
          while (true)
          {
            return paramString2;
            paramString1 = paramString1;
            ab.w("MircoMsg.AEDHLP", "check point 0, explained by src code.");
            AppMethodBeat.o(10386);
          }
        }
      }
      catch (b paramString1)
      {
        while (true)
        {
          ab.printErrStackTrace("MircoMsg.AEDHLP", paramString1, "check point 1-1, explained by src code.", new Object[0]);
          AppMethodBeat.o(10386);
          continue;
          Object localObject = ((c)localObject).dru();
          if (localObject == null)
          {
            ab.w("MircoMsg.AEDHLP", "check point 2, explained by src code.");
            AppMethodBeat.o(10386);
          }
          else
          {
            paramString1 = (String)((Map)localObject).get(paramString1);
            if ((paramString1 != null) && (paramString1.length() > 0))
            {
              AppMethodBeat.o(10386);
              paramString2 = paramString1;
            }
            else
            {
              AppMethodBeat.o(10386);
            }
          }
        }
      }
    }
  }

  private void z(int paramInt, String paramString1, String paramString2)
  {
    try
    {
      AppMethodBeat.i(10381);
      long l = System.currentTimeMillis();
      if (l - this.oTT > 86400000L)
      {
        com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.pYm;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("action: ");
        localh.g("Normsg_AED", paramInt + ", pkg: " + paramString1 + ", view: " + paramString2, null);
        this.oTT = l;
        bVX();
      }
      if ((com.tencent.mm.compatible.util.h.Ms()) && (a.c.bWb()))
        bVY();
      AppMethodBeat.o(10381);
      return;
    }
    finally
    {
    }
    throw paramString1;
  }

  public final void Ao(int paramInt)
  {
    try
    {
      this.oTX = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(int paramInt, View paramView, List<AccessibilityNodeInfo> paramList)
  {
    int i = 0;
    AppMethodBeat.i(10372);
    String str;
    if (paramView != null)
    {
      paramView = paramView.toString();
      str = Ap(paramInt);
      if ((paramList == null) || (paramList.size() <= 0))
        break label145;
    }
    label145: for (boolean bool = true; ; bool = false)
    {
      ab.i("MircoMsg.AEDHLP", "[tomys] ae about searching, pid:%d, pname:%s, vwinfo:%s, is_found:%b", new Object[] { Integer.valueOf(paramInt), str, paramView, Boolean.valueOf(bool) });
      paramInt = i;
      if (paramList != null)
        paramInt = paramList.size();
      cL(str, paramInt);
      if ((a.c.bVZ()) && (str != null) && (str.contains(d.TQ(">\020r\033c\001xV"))) && (paramList != null))
        paramList.clear();
      AppMethodBeat.o(10372);
      return;
      paramView = "";
      break;
    }
  }

  public final boolean a(int paramInt1, int paramInt2, View paramView)
  {
    AppMethodBeat.i(10373);
    String str1;
    if (paramView != null)
    {
      str1 = paramView.toString();
      String str2 = Ap(paramInt2);
      ab.i("MircoMsg.AEDHLP", "[tomys] ae about action, pid:%d, pname:%s, vwinfo:%s, action:%d", new Object[] { Integer.valueOf(paramInt2), str2, str1, Integer.valueOf(paramInt1) });
      e(paramInt1, paramView);
      z(paramInt1, str2, str1);
      if ((!a.c.bVZ()) || (str2 == null) || (!str2.contains(d.TQ(">\020r\033c\001xV"))))
        break label117;
      AppMethodBeat.o(10373);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      str1 = "";
      break;
      label117: AppMethodBeat.o(10373);
    }
  }

  public final long bVU()
  {
    try
    {
      AppMethodBeat.i(10375);
      long l = this.oTW;
      bVV();
      AppMethodBeat.o(10375);
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  public final void j(Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: sipush 10383
    //   5: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: ifnonnull +12 -> 21
    //   12: sipush 10383
    //   15: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: invokestatic 229	java/lang/System:currentTimeMillis	()J
    //   24: lstore_2
    //   25: lload_2
    //   26: aload_0
    //   27: getfield 72	com/tencent/mm/plugin/normsg/b/a:oTU	J
    //   30: lsub
    //   31: ldc2_w 311
    //   34: lcmp
    //   35: ifle +83 -> 118
    //   38: new 479	java/io/StringWriter
    //   41: astore 4
    //   43: aload 4
    //   45: invokespecial 480	java/io/StringWriter:<init>	()V
    //   48: new 482	java/io/PrintWriter
    //   51: astore 5
    //   53: aload 5
    //   55: aload 4
    //   57: invokespecial 485	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   60: aload_1
    //   61: aload 5
    //   63: invokevirtual 489	java/lang/Throwable:printStackTrace	(Ljava/io/PrintWriter;)V
    //   66: aload 5
    //   68: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   71: getstatic 318	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   74: astore_1
    //   75: new 320	java/lang/StringBuilder
    //   78: astore 5
    //   80: aload 5
    //   82: ldc_w 491
    //   85: invokespecial 323	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   88: aload_1
    //   89: ldc_w 493
    //   92: aload 5
    //   94: aload 4
    //   96: invokevirtual 494	java/io/StringWriter:toString	()Ljava/lang/String;
    //   99: invokevirtual 329	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: invokevirtual 337	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: aconst_null
    //   106: invokevirtual 341	com/tencent/mm/plugin/report/service/h:g	(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    //   109: aload_0
    //   110: lload_2
    //   111: putfield 72	com/tencent/mm/plugin/normsg/b/a:oTU	J
    //   114: aload_0
    //   115: invokespecial 234	com/tencent/mm/plugin/normsg/b/a:bVX	()V
    //   118: sipush 10383
    //   121: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: goto -106 -> 18
    //   127: astore_1
    //   128: aload_0
    //   129: monitorexit
    //   130: aload_1
    //   131: athrow
    //   132: astore_1
    //   133: aconst_null
    //   134: astore 5
    //   136: aload 5
    //   138: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   141: goto -70 -> 71
    //   144: astore 4
    //   146: aconst_null
    //   147: astore_1
    //   148: aload_1
    //   149: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   152: sipush 10383
    //   155: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   158: aload 4
    //   160: athrow
    //   161: astore_1
    //   162: aload_1
    //   163: astore 4
    //   165: aload 5
    //   167: astore_1
    //   168: goto -20 -> 148
    //   171: astore_1
    //   172: goto -36 -> 136
    //
    // Exception table:
    //   from	to	target	type
    //   2	8	127	finally
    //   12	18	127	finally
    //   21	48	127	finally
    //   66	71	127	finally
    //   71	118	127	finally
    //   118	124	127	finally
    //   136	141	127	finally
    //   148	161	127	finally
    //   48	60	132	java/lang/Throwable
    //   48	60	144	finally
    //   60	66	161	finally
    //   60	66	171	java/lang/Throwable
  }

  public final void onError(Throwable paramThrowable)
  {
    AppMethodBeat.i(10374);
    ab.printErrStackTrace("MircoMsg.AEDHLP", paramThrowable, "[tomys] unexpected error happens.", new Object[0]);
    j(paramThrowable);
    AppMethodBeat.o(10374);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.a
 * JD-Core Version:    0.6.2
 */