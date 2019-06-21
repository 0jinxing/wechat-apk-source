package com.tencent.mm.plugin.report.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.protocal.protobuf.ate;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac;
import java.io.IOException;
import java.util.LinkedList;

public final class a
{
  private static String filename;
  private static Object lock;
  private a pXh = null;
  private int pXi = 0;
  private int pXj = 1;
  private int pXk = 2;
  private int pXl = 3;

  static
  {
    AppMethodBeat.i(72668);
    filename = "heavy_user_id_mapping.dat";
    lock = new Object();
    AppMethodBeat.o(72668);
  }

  public static int BM(int paramInt)
  {
    AppMethodBeat.i(72667);
    ab.d("MicroMsg.HeavyUserIDMappingStg", "getIDMappingVersion,chanel:".concat(String.valueOf(paramInt)));
    ate localate = cgh();
    if (localate == null)
    {
      paramInt = 0;
      AppMethodBeat.o(72667);
    }
    while (true)
    {
      return paramInt;
      paramInt = localate.wxc;
      ab.i("MicroMsg.HeavyUserIDMappingStg", "version:".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(72667);
    }
  }

  public static ate cgh()
  {
    ate localate = null;
    AppMethodBeat.i(72666);
    ab.d("MicroMsg.HeavyUserIDMappingStg", "getIDMappingObj");
    while (true)
    {
      Object localObject4;
      synchronized (lock)
      {
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = e.f(ac.eSj + filename, 0, -1);
        if (localObject4 == null)
        {
          ab.w("MicroMsg.HeavyUserIDMappingStg", "get file content fail, filename" + filename);
          AppMethodBeat.o(72666);
          return localate;
        }
      }
      ??? = new ate();
      try
      {
        ((ate)???).parseFrom((byte[])localObject4);
        ab.i("MicroMsg.HeavyUserIDMappingStg", "svr_version:" + ((ate)???).wxc + ", ret:" + ((ate)???).wxe + ", size: " + ((ate)???).wxd.size());
        AppMethodBeat.o(72666);
        Object localObject2 = ???;
      }
      catch (IOException localIOException)
      {
        ab.printErrStackTrace("MicroMsg.HeavyUserIDMappingStg", localIOException, "", new Object[0]);
        AppMethodBeat.o(72666);
      }
    }
  }

  // ERROR //
  public final void a(ate paramate, int paramInt)
  {
    // Byte code:
    //   0: ldc 156
    //   2: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 55
    //   7: ldc 158
    //   9: iload_2
    //   10: invokestatic 63	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   13: invokevirtual 67	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   16: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: aload_1
    //   20: ifnonnull +16 -> 36
    //   23: ldc 55
    //   25: ldc 160
    //   27: invokestatic 121	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: ldc 156
    //   32: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   35: return
    //   36: aload_0
    //   37: getfield 44	com/tencent/mm/plugin/report/b/a:pXi	I
    //   40: aload_1
    //   41: getfield 136	com/tencent/mm/protocal/protobuf/ate:wxe	I
    //   44: if_icmpeq +101 -> 145
    //   47: new 93	java/lang/StringBuilder
    //   50: dup
    //   51: ldc 162
    //   53: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   56: astore_3
    //   57: aload_1
    //   58: getfield 136	com/tencent/mm/protocal/protobuf/ate:wxe	I
    //   61: istore_2
    //   62: aload_0
    //   63: getfield 46	com/tencent/mm/plugin/report/b/a:pXj	I
    //   66: iload_2
    //   67: if_icmpne +41 -> 108
    //   70: ldc 164
    //   72: astore 4
    //   74: ldc 55
    //   76: aload_3
    //   77: aload 4
    //   79: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: ldc 166
    //   84: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload_1
    //   88: getfield 82	com/tencent/mm/protocal/protobuf/ate:wxc	I
    //   91: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   94: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: invokestatic 169	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   100: ldc 156
    //   102: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   105: goto -70 -> 35
    //   108: aload_0
    //   109: getfield 48	com/tencent/mm/plugin/report/b/a:pXk	I
    //   112: iload_2
    //   113: if_icmpne +10 -> 123
    //   116: ldc 171
    //   118: astore 4
    //   120: goto -46 -> 74
    //   123: aload_0
    //   124: getfield 50	com/tencent/mm/plugin/report/b/a:pXl	I
    //   127: iload_2
    //   128: if_icmpne +10 -> 138
    //   131: ldc 173
    //   133: astore 4
    //   135: goto -61 -> 74
    //   138: ldc 175
    //   140: astore 4
    //   142: goto -68 -> 74
    //   145: iload_2
    //   146: invokestatic 177	com/tencent/mm/plugin/report/b/a:BM	(I)I
    //   149: istore 5
    //   151: aload_1
    //   152: getfield 82	com/tencent/mm/protocal/protobuf/ate:wxc	I
    //   155: istore 6
    //   157: iload 5
    //   159: iload 6
    //   161: if_icmpne +26 -> 187
    //   164: ldc 55
    //   166: ldc 179
    //   168: iload 6
    //   170: invokestatic 63	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   173: invokevirtual 67	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   176: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   179: ldc 156
    //   181: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   184: goto -149 -> 35
    //   187: ldc 55
    //   189: new 93	java/lang/StringBuilder
    //   192: dup
    //   193: ldc 181
    //   195: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   198: iload_2
    //   199: invokestatic 177	com/tencent/mm/plugin/report/b/a:BM	(I)I
    //   202: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   205: ldc 183
    //   207: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: iload 6
    //   212: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   215: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   218: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   221: ldc 55
    //   223: new 93	java/lang/StringBuilder
    //   226: dup
    //   227: ldc 128
    //   229: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   232: aload_1
    //   233: getfield 82	com/tencent/mm/protocal/protobuf/ate:wxc	I
    //   236: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   239: ldc 133
    //   241: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: aload_1
    //   245: getfield 136	com/tencent/mm/protocal/protobuf/ate:wxe	I
    //   248: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   251: ldc 138
    //   253: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: aload_1
    //   257: getfield 142	com/tencent/mm/protocal/protobuf/ate:wxd	Ljava/util/LinkedList;
    //   260: invokevirtual 148	java/util/LinkedList:size	()I
    //   263: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   266: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   269: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   272: aload_1
    //   273: invokevirtual 187	com/tencent/mm/protocal/protobuf/ate:toByteArray	()[B
    //   276: astore 7
    //   278: getstatic 36	com/tencent/mm/plugin/report/b/a:lock	Ljava/lang/Object;
    //   281: astore 4
    //   283: aload 4
    //   285: monitorenter
    //   286: new 93	java/lang/StringBuilder
    //   289: astore_3
    //   290: aload_3
    //   291: ldc 189
    //   293: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   296: ldc 55
    //   298: aload_3
    //   299: aload_1
    //   300: getfield 82	com/tencent/mm/protocal/protobuf/ate:wxc	I
    //   303: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   306: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   309: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   312: getstatic 99	com/tencent/mm/storage/ac:eSj	Ljava/lang/String;
    //   315: getstatic 31	com/tencent/mm/plugin/report/b/a:filename	Ljava/lang/String;
    //   318: aload 7
    //   320: invokestatic 193	com/tencent/mm/a/e:b	(Ljava/lang/String;Ljava/lang/String;[B)I
    //   323: pop
    //   324: aload 4
    //   326: monitorexit
    //   327: ldc 156
    //   329: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   332: goto -297 -> 35
    //   335: astore_1
    //   336: ldc 55
    //   338: aload_1
    //   339: ldc 150
    //   341: iconst_0
    //   342: anewarray 4	java/lang/Object
    //   345: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   348: ldc 156
    //   350: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   353: goto -318 -> 35
    //   356: astore_1
    //   357: aload 4
    //   359: monitorexit
    //   360: ldc 156
    //   362: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   365: aload_1
    //   366: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   272	278	335	java/io/IOException
    //   286	327	356	finally
    //   357	360	356	finally
  }

  public static abstract interface a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.b.a
 * JD-Core Version:    0.6.2
 */