package com.tencent.mm.plugin.fav.b.e;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.n;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.c;
import com.tencent.mm.plugin.fav.a.o;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class a
  implements o
{
  private Queue<c> cqQ;
  private Map<String, com.tencent.mm.compatible.util.g.a> cqS;
  boolean cqU;
  public int cqV;
  long cqW;
  public ap cra;
  private com.tencent.mm.i.g.a fFk;
  public n fyJ;
  Map<String, a.a> mgS;
  Set<String> mgT;
  boolean mgU;
  int mgV;
  boolean mgW;
  private Runnable mgX;
  boolean running;

  public a()
  {
    AppMethodBeat.i(5332);
    this.running = false;
    this.cqV = 0;
    this.cqW = 0L;
    this.cqU = false;
    this.cqQ = new LinkedList();
    this.cqS = new HashMap();
    this.mgS = new HashMap();
    this.mgT = new HashSet();
    this.mgV = 0;
    this.mgW = true;
    this.fyJ = new a.1(this);
    this.mgX = new a.4(this);
    this.cra = new ap(com.tencent.mm.kernel.g.RS().oAl.getLooper(), new a.5(this), false);
    this.fFk = new a.6(this);
    this.mgU = at.isWifi(ah.getContext());
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().a(this.fyJ);
    AppMethodBeat.o(5332);
  }

  // ERROR //
  static boolean LV(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: sipush 5343
    //   5: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 163	java/io/RandomAccessFile
    //   11: astore_2
    //   12: aload_2
    //   13: aload_0
    //   14: ldc 165
    //   16: invokespecial 168	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: aload_2
    //   20: astore_0
    //   21: bipush 6
    //   23: newarray byte
    //   25: astore_3
    //   26: aload_2
    //   27: astore_0
    //   28: aload_2
    //   29: aload_3
    //   30: iconst_0
    //   31: bipush 6
    //   33: invokevirtual 172	java/io/RandomAccessFile:read	([BII)I
    //   36: istore 4
    //   38: iload 4
    //   40: iconst_m1
    //   41: if_icmpne +35 -> 76
    //   44: aload_2
    //   45: invokevirtual 175	java/io/RandomAccessFile:close	()V
    //   48: sipush 5343
    //   51: invokestatic 154	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   54: iload_1
    //   55: istore 5
    //   57: iload 5
    //   59: ireturn
    //   60: astore_0
    //   61: ldc 177
    //   63: aload_0
    //   64: ldc 179
    //   66: iconst_0
    //   67: anewarray 4	java/lang/Object
    //   70: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: goto -25 -> 48
    //   76: aload_2
    //   77: astore_0
    //   78: new 187	java/lang/String
    //   81: astore 6
    //   83: aload_2
    //   84: astore_0
    //   85: aload 6
    //   87: aload_3
    //   88: invokespecial 190	java/lang/String:<init>	([B)V
    //   91: aload_2
    //   92: astore_0
    //   93: new 192	java/lang/StringBuilder
    //   96: astore_3
    //   97: aload_2
    //   98: astore_0
    //   99: aload_3
    //   100: ldc 194
    //   102: invokespecial 197	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   105: aload_2
    //   106: astore_0
    //   107: ldc 177
    //   109: aload_3
    //   110: aload 6
    //   112: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: ldc 203
    //   117: invokevirtual 201	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   126: aload_2
    //   127: astore_0
    //   128: aload 6
    //   130: ldc 211
    //   132: invokevirtual 214	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   135: istore 5
    //   137: aload_2
    //   138: invokevirtual 175	java/io/RandomAccessFile:close	()V
    //   141: sipush 5343
    //   144: invokestatic 154	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: goto -90 -> 57
    //   150: astore_0
    //   151: ldc 177
    //   153: aload_0
    //   154: ldc 179
    //   156: iconst_0
    //   157: anewarray 4	java/lang/Object
    //   160: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: goto -22 -> 141
    //   166: astore 6
    //   168: aconst_null
    //   169: astore_2
    //   170: aload_2
    //   171: astore_0
    //   172: ldc 177
    //   174: aload 6
    //   176: ldc 179
    //   178: iconst_0
    //   179: anewarray 4	java/lang/Object
    //   182: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   185: aload_2
    //   186: ifnull +7 -> 193
    //   189: aload_2
    //   190: invokevirtual 175	java/io/RandomAccessFile:close	()V
    //   193: sipush 5343
    //   196: invokestatic 154	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   199: iload_1
    //   200: istore 5
    //   202: goto -145 -> 57
    //   205: astore_0
    //   206: ldc 177
    //   208: aload_0
    //   209: ldc 179
    //   211: iconst_0
    //   212: anewarray 4	java/lang/Object
    //   215: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: goto -25 -> 193
    //   221: astore_2
    //   222: aconst_null
    //   223: astore_0
    //   224: aload_0
    //   225: ifnull +7 -> 232
    //   228: aload_0
    //   229: invokevirtual 175	java/io/RandomAccessFile:close	()V
    //   232: sipush 5343
    //   235: invokestatic 154	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   238: aload_2
    //   239: athrow
    //   240: astore_0
    //   241: ldc 177
    //   243: aload_0
    //   244: ldc 179
    //   246: iconst_0
    //   247: anewarray 4	java/lang/Object
    //   250: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   253: goto -21 -> 232
    //   256: astore_2
    //   257: goto -33 -> 224
    //   260: astore 6
    //   262: goto -92 -> 170
    //
    // Exception table:
    //   from	to	target	type
    //   44	48	60	java/io/IOException
    //   137	141	150	java/io/IOException
    //   8	19	166	java/lang/Exception
    //   189	193	205	java/io/IOException
    //   8	19	221	finally
    //   228	232	240	java/io/IOException
    //   21	26	256	finally
    //   28	38	256	finally
    //   78	83	256	finally
    //   85	91	256	finally
    //   93	97	256	finally
    //   99	105	256	finally
    //   107	126	256	finally
    //   128	137	256	finally
    //   172	185	256	finally
    //   21	26	260	java/lang/Exception
    //   28	38	260	java/lang/Exception
    //   78	83	260	java/lang/Exception
    //   85	91	260	java/lang/Exception
    //   93	97	260	java/lang/Exception
    //   99	105	260	java/lang/Exception
    //   107	126	260	java/lang/Exception
    //   128	137	260	java/lang/Exception
  }

  private static int ee(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5341);
    if ((paramInt1 & 0x1) == 0)
      AppMethodBeat.o(5341);
    while (true)
    {
      return paramInt2;
      ab.w("MicroMsg.Fav.FavCdnService", "NEED To Exchange Type, defType %d", new Object[] { Integer.valueOf(paramInt2) });
      if (com.tencent.mm.i.a.MediaType_FAVORITE_VIDEO == paramInt2)
      {
        paramInt2 = com.tencent.mm.i.a.MediaType_FAVORITE_FILE;
        AppMethodBeat.o(5341);
      }
      else
      {
        paramInt2 = com.tencent.mm.i.a.MediaType_FAVORITE_VIDEO;
        AppMethodBeat.o(5341);
      }
    }
  }

  // ERROR //
  static boolean en(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: sipush 5342
    //   3: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokestatic 377	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   10: astore_0
    //   11: aload_1
    //   12: iconst_0
    //   13: invokestatic 381	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   16: astore_1
    //   17: aload_1
    //   18: astore_2
    //   19: aload_0
    //   20: astore_3
    //   21: sipush 16384
    //   24: newarray byte
    //   26: astore 4
    //   28: aload_1
    //   29: astore_2
    //   30: aload_0
    //   31: astore_3
    //   32: aload_1
    //   33: ldc 211
    //   35: invokevirtual 385	java/lang/String:getBytes	()[B
    //   38: invokevirtual 390	java/io/OutputStream:write	([B)V
    //   41: aload_1
    //   42: astore_2
    //   43: aload_0
    //   44: astore_3
    //   45: aload_0
    //   46: aload 4
    //   48: invokevirtual 395	java/io/InputStream:read	([B)I
    //   51: istore 5
    //   53: iload 5
    //   55: iconst_m1
    //   56: if_icmpeq +66 -> 122
    //   59: aload_1
    //   60: astore_2
    //   61: aload_0
    //   62: astore_3
    //   63: aload_1
    //   64: aload 4
    //   66: iconst_0
    //   67: iload 5
    //   69: invokevirtual 398	java/io/OutputStream:write	([BII)V
    //   72: goto -31 -> 41
    //   75: astore 4
    //   77: aload_1
    //   78: astore_2
    //   79: aload_0
    //   80: astore_3
    //   81: ldc 177
    //   83: aload 4
    //   85: ldc 179
    //   87: iconst_0
    //   88: anewarray 4	java/lang/Object
    //   91: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   94: aload_0
    //   95: ifnull +7 -> 102
    //   98: aload_0
    //   99: invokevirtual 399	java/io/InputStream:close	()V
    //   102: aload_1
    //   103: ifnull +219 -> 322
    //   106: aload_1
    //   107: invokevirtual 400	java/io/OutputStream:close	()V
    //   110: iconst_0
    //   111: istore 6
    //   113: sipush 5342
    //   116: invokestatic 154	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   119: iload 6
    //   121: ireturn
    //   122: iconst_1
    //   123: istore 6
    //   125: iload 6
    //   127: istore 7
    //   129: aload_0
    //   130: ifnull +11 -> 141
    //   133: aload_0
    //   134: invokevirtual 399	java/io/InputStream:close	()V
    //   137: iload 6
    //   139: istore 7
    //   141: iload 7
    //   143: istore 6
    //   145: aload_1
    //   146: ifnull -33 -> 113
    //   149: aload_1
    //   150: invokevirtual 400	java/io/OutputStream:close	()V
    //   153: iload 7
    //   155: istore 6
    //   157: goto -44 -> 113
    //   160: astore_0
    //   161: ldc 177
    //   163: aload_0
    //   164: ldc 179
    //   166: iconst_0
    //   167: anewarray 4	java/lang/Object
    //   170: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: iconst_0
    //   174: istore 6
    //   176: goto -63 -> 113
    //   179: astore_0
    //   180: ldc 177
    //   182: aload_0
    //   183: ldc 179
    //   185: iconst_0
    //   186: anewarray 4	java/lang/Object
    //   189: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   192: iconst_0
    //   193: istore 7
    //   195: goto -54 -> 141
    //   198: astore_0
    //   199: ldc 177
    //   201: aload_0
    //   202: ldc 179
    //   204: iconst_0
    //   205: anewarray 4	java/lang/Object
    //   208: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   211: goto -109 -> 102
    //   214: astore_0
    //   215: ldc 177
    //   217: aload_0
    //   218: ldc 179
    //   220: iconst_0
    //   221: anewarray 4	java/lang/Object
    //   224: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   227: iconst_0
    //   228: istore 6
    //   230: goto -117 -> 113
    //   233: astore_1
    //   234: aconst_null
    //   235: astore_2
    //   236: aconst_null
    //   237: astore_0
    //   238: aload_0
    //   239: ifnull +7 -> 246
    //   242: aload_0
    //   243: invokevirtual 399	java/io/InputStream:close	()V
    //   246: aload_2
    //   247: ifnull +7 -> 254
    //   250: aload_2
    //   251: invokevirtual 400	java/io/OutputStream:close	()V
    //   254: sipush 5342
    //   257: invokestatic 154	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   260: aload_1
    //   261: athrow
    //   262: astore_0
    //   263: ldc 177
    //   265: aload_0
    //   266: ldc 179
    //   268: iconst_0
    //   269: anewarray 4	java/lang/Object
    //   272: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   275: goto -29 -> 246
    //   278: astore_0
    //   279: ldc 177
    //   281: aload_0
    //   282: ldc 179
    //   284: iconst_0
    //   285: anewarray 4	java/lang/Object
    //   288: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   291: goto -37 -> 254
    //   294: astore_1
    //   295: aconst_null
    //   296: astore_2
    //   297: goto -59 -> 238
    //   300: astore_1
    //   301: aload_3
    //   302: astore_0
    //   303: goto -65 -> 238
    //   306: astore 4
    //   308: aconst_null
    //   309: astore_1
    //   310: aconst_null
    //   311: astore_0
    //   312: goto -235 -> 77
    //   315: astore 4
    //   317: aconst_null
    //   318: astore_1
    //   319: goto -242 -> 77
    //   322: iconst_0
    //   323: istore 6
    //   325: goto -212 -> 113
    //
    // Exception table:
    //   from	to	target	type
    //   21	28	75	java/lang/Exception
    //   32	41	75	java/lang/Exception
    //   45	53	75	java/lang/Exception
    //   63	72	75	java/lang/Exception
    //   149	153	160	java/io/IOException
    //   133	137	179	java/io/IOException
    //   98	102	198	java/io/IOException
    //   106	110	214	java/io/IOException
    //   6	11	233	finally
    //   242	246	262	java/io/IOException
    //   250	254	278	java/io/IOException
    //   11	17	294	finally
    //   21	28	300	finally
    //   32	41	300	finally
    //   45	53	300	finally
    //   63	72	300	finally
    //   81	94	300	finally
    //   6	11	306	java/lang/Exception
    //   11	17	315	java/lang/Exception
  }

  private static void f(c paramc)
  {
    AppMethodBeat.i(5337);
    if (1 == paramc.field_type);
    for (paramc.field_status = 2; ; paramc.field_status = 4)
    {
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a(paramc, new String[] { "dataId" });
      g(paramc);
      AppMethodBeat.o(5337);
      return;
    }
  }

  static void g(c paramc)
  {
    AppMethodBeat.i(5345);
    if (paramc.field_type == 0)
    {
      com.tencent.mm.plugin.fav.a.b.a(paramc);
      AppMethodBeat.o(5345);
    }
    while (true)
    {
      return;
      if (paramc.field_type == 1)
      {
        com.tencent.mm.plugin.fav.a.b.b(paramc);
        AppMethodBeat.o(5345);
      }
      else
      {
        AppMethodBeat.o(5345);
      }
    }
  }

  public final void Fb()
  {
    AppMethodBeat.i(5340);
    this.cqQ.clear();
    this.cqS.clear();
    this.running = false;
    this.cqU = false;
    AppMethodBeat.o(5340);
  }

  public final void LP(String paramString)
  {
    AppMethodBeat.i(5334);
    ab.i("MicroMsg.Fav.FavCdnService", "add force job %s", new Object[] { paramString });
    com.tencent.mm.kernel.g.RS().aa(new a.3(this, paramString));
    AppMethodBeat.o(5334);
  }

  public final void LQ(String paramString)
  {
    AppMethodBeat.i(5339);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(5339);
    while (true)
    {
      return;
      com.tencent.mm.al.f.afx().rN(paramString);
      ab.i("MicroMsg.Fav.FavCdnService", "pause upload md5%s", new Object[] { paramString });
      g(((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(paramString));
      LW(paramString);
      AppMethodBeat.o(5339);
    }
  }

  final void LW(String paramString)
  {
    AppMethodBeat.i(5344);
    this.cqU = false;
    this.cqS.remove(paramString);
    pauseDownload(paramString);
    if (this.cqV > 0)
    {
      agK();
      AppMethodBeat.o(5344);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Fav.FavCdnService", "klem stopFlag <= 0 , Stop Service");
      Fb();
      AppMethodBeat.o(5344);
    }
  }

  final void agK()
  {
    AppMethodBeat.i(5336);
    this.cqW = System.currentTimeMillis();
    if ((!this.cqU) && (this.cqQ.size() == 0))
    {
      if (!com.tencent.mm.compatible.util.f.Mn())
      {
        ab.e("MicroMsg.Fav.FavCdnService", "klem getNeedRunInfo sdcard not available");
        Fb();
      }
    }
    else
    {
      if ((this.cqU) || (this.cqQ.size() > 0))
        break label286;
      Fb();
      ab.i("MicroMsg.Fav.FavCdnService", "klem No Data Any More , Stop Service");
      AppMethodBeat.o(5336);
    }
    while (true)
    {
      return;
      Object localObject1 = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().buM();
      if ((localObject1 == null) || (((List)localObject1).size() == 0))
        break;
      localObject1 = ((List)localObject1).iterator();
      Object localObject2;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (c)((Iterator)localObject1).next();
        if (this.cqS.containsKey(((c)localObject2).field_dataId))
        {
          ab.d("MicroMsg.Fav.FavCdnService", "File is Already running:" + ((c)localObject2).field_dataId);
        }
        else
        {
          this.cqQ.add(localObject2);
          this.cqS.put(((c)localObject2).field_dataId, null);
        }
      }
      ab.i("MicroMsg.Fav.FavCdnService", "klem GetNeedRun procing:" + this.cqS.size() + ",send:" + this.cqQ.size() + "]");
      this.cqQ.size();
      break;
      label286: if ((!this.cqU) && (this.cqQ.size() > 0))
        try
        {
          localObject1 = (c)this.cqQ.poll();
          if ((localObject1 != null) && (!bo.isNullOrNil(((c)localObject1).field_dataId)))
          {
            localObject2 = (a.a)this.mgS.get(((c)localObject1).field_dataId);
            if (localObject2 == null)
            {
              localObject2 = new a.a(this, (byte)0);
              ((a.a)localObject2).ghB = 1;
              ((a.a)localObject2).mhb = bo.anU();
              this.mgS.put(((c)localObject1).field_dataId, localObject2);
              if (((c)localObject1).field_type != 0)
                break label832;
              ab.i("MicroMsg.Fav.FavCdnService", "check favCDN:force job[can upload], localid %d, dataid %s, type %d, dataType %d", new Object[] { Long.valueOf(((c)localObject1).field_favLocalId), ((c)localObject1).field_dataId, Integer.valueOf(((c)localObject1).field_type), Integer.valueOf(((c)localObject1).field_dataType) });
              i = 1;
              if (i == 0)
                break label1395;
              this.cqU = true;
              if (localObject1 == null)
                break label1369;
              ab.i("MicroMsg.Fav.FavCdnService", "doTransfer, md5:%s", new Object[] { ((c)localObject1).field_dataId });
              localObject2 = new com.tencent.mm.i.g();
              ((com.tencent.mm.i.g)localObject2).egl = this.fFk;
              ((com.tencent.mm.i.g)localObject2).field_mediaId = ((c)localObject1).field_dataId;
              if (((c)localObject1).field_type != 0)
                break label1251;
              ((com.tencent.mm.i.g)localObject2).cRY = true;
              ((com.tencent.mm.i.g)localObject2).field_priority = com.tencent.mm.i.a.efB;
              ((com.tencent.mm.i.g)localObject2).field_needStorage = true;
              ((com.tencent.mm.i.g)localObject2).field_totalLen = ((c)localObject1).field_totalLen;
              ((com.tencent.mm.i.g)localObject2).field_aesKey = ((c)localObject1).field_cdnKey;
              ((com.tencent.mm.i.g)localObject2).field_fileId = ((c)localObject1).field_cdnUrl;
              ((com.tencent.mm.i.g)localObject2).field_isStreamMedia = ((c)localObject1).buq();
              ((com.tencent.mm.i.g)localObject2).field_fullpath = ((c)localObject1).field_path;
              if (!e.ct(((com.tencent.mm.i.g)localObject2).field_fullpath))
                ab.e("MicroMsg.Fav.FavCdnService", "favcdnservice upload, but file not exsit,filePath = %s ", new Object[] { ((c)localObject1).field_path });
              if (!((c)localObject1).buq())
                break label1234;
              ((com.tencent.mm.i.g)localObject2).field_fileType = ee(((c)localObject1).field_extFlag, com.tencent.mm.i.a.MediaType_FAVORITE_VIDEO);
              ((com.tencent.mm.i.g)localObject2).field_force_aeskeycdn = true;
              ((com.tencent.mm.i.g)localObject2).field_trysafecdn = false;
              ab.i("MicroMsg.Fav.FavCdnService", "summersafecdn send force_aeskeycdn[%b] trysafecdn[%b]", new Object[] { Boolean.valueOf(((com.tencent.mm.i.g)localObject2).field_force_aeskeycdn), Boolean.valueOf(((com.tencent.mm.i.g)localObject2).field_trysafecdn) });
              com.tencent.mm.al.f.afx().e((com.tencent.mm.i.g)localObject2);
              AppMethodBeat.o(5336);
            }
          }
        }
        catch (Throwable localThrowable)
        {
          c localc;
          while (true)
          {
            int i;
            localc = null;
            continue;
            if ((bo.anU() - ((a.a)localObject2).mhb > 180000L) && (((a.a)localObject2).errCode != -6101))
            {
              ((a.a)localObject2).ghB = 1;
              ((a.a)localObject2).mhb = bo.anU();
              this.mgS.put(localc.field_dataId, localObject2);
            }
            else if (((a.a)localObject2).ghB <= 3)
            {
              ((a.a)localObject2).ghB += 1;
              this.mgS.put(localc.field_dataId, localObject2);
            }
            else
            {
              ab.e("MicroMsg.Fav.FavCdnService", "check favCDN:match transfer limit 3times , localid %d, dataid %s, type %d, dataType %d", new Object[] { Long.valueOf(localc.field_favLocalId), localc.field_dataId, Integer.valueOf(localc.field_type), Integer.valueOf(localc.field_dataType) });
              f(localc);
              i = 0;
              continue;
              label832: if ((this.mgT.contains(localc.field_dataId)) || (com.tencent.mm.plugin.fav.a.b.LB(localc.field_dataId)))
              {
                ab.i("MicroMsg.Fav.FavCdnService", "check favCDN:force job[normal], localid %d, dataid %s, type %d, dataType %d", new Object[] { Long.valueOf(localc.field_favLocalId), localc.field_dataId, Integer.valueOf(localc.field_type), Integer.valueOf(localc.field_dataType) });
              }
              else if (!at.isWifi(ah.getContext()))
              {
                ab.i("MicroMsg.Fav.FavCdnService", "check favCDN:not force job, NOT WIFI, pause it, localid %d, dataid %s, type %d, dataType %d", new Object[] { Long.valueOf(localc.field_favLocalId), localc.field_dataId, Integer.valueOf(localc.field_type), Integer.valueOf(localc.field_dataType) });
                f(localc);
                i = 0;
              }
              else if (localc.field_type == 0)
              {
                ab.i("MicroMsg.Fav.FavCdnService", "check favCDN:not force job, IN WIFI & SENDING, not auto limit, localid %d, dataid %s, type %d, dataType %d", new Object[] { Long.valueOf(localc.field_favLocalId), localc.field_dataId, Integer.valueOf(localc.field_type), Integer.valueOf(localc.field_dataType) });
              }
              else if (!this.mgW)
              {
                ab.i("MicroMsg.Fav.FavCdnService", "check favCDN:not force job, IN WIFI, not auto limit, localid %d, dataid %s, type %d, dataType %d", new Object[] { Long.valueOf(localc.field_favLocalId), localc.field_dataId, Integer.valueOf(localc.field_type), Integer.valueOf(localc.field_dataType) });
                this.mgV = 0;
              }
              else if (this.mgV < 10)
              {
                ab.i("MicroMsg.Fav.FavCdnService", "check favCDN:not force job, IN WIFI, auto limit %d, current index %d, retryTimes %dlocalid %d, dataid %s, type %d, dataType %d", new Object[] { Integer.valueOf(10), Integer.valueOf(this.mgV), Integer.valueOf(((a.a)localObject2).ghB), Long.valueOf(localc.field_favLocalId), localc.field_dataId, Integer.valueOf(localc.field_type), Integer.valueOf(localc.field_dataType) });
                if (((a.a)localObject2).ghB == 1)
                  this.mgV += 1;
              }
              else
              {
                ab.i("MicroMsg.Fav.FavCdnService", "check favCDN:not force job, IN WIFI, match auto limit %d", new Object[] { Integer.valueOf(10) });
                i = 0;
                continue;
                label1234: ((com.tencent.mm.i.g)localObject2).field_fileType = ee(localc.field_extFlag, com.tencent.mm.i.a.MediaType_FAVORITE_FILE);
              }
            }
          }
          label1251: ((com.tencent.mm.i.g)localObject2).cRY = false;
          ((com.tencent.mm.i.g)localObject2).field_totalLen = localc.field_totalLen;
          ((com.tencent.mm.i.g)localObject2).field_aesKey = localc.field_cdnKey;
          ((com.tencent.mm.i.g)localObject2).field_fileId = localc.field_cdnUrl;
          ((com.tencent.mm.i.g)localObject2).field_priority = com.tencent.mm.i.a.efC;
          ((com.tencent.mm.i.g)localObject2).egl = this.fFk;
          ((com.tencent.mm.i.g)localObject2).field_fullpath = (localc.field_path + ".temp");
          ((com.tencent.mm.i.g)localObject2).field_needStorage = true;
          ((com.tencent.mm.i.g)localObject2).field_isStreamMedia = localc.buq();
          if (localc.buq());
          for (((com.tencent.mm.i.g)localObject2).field_fileType = ee(localc.field_extFlag, com.tencent.mm.i.a.MediaType_FAVORITE_VIDEO); ; ((com.tencent.mm.i.g)localObject2).field_fileType = ee(localc.field_extFlag, com.tencent.mm.i.a.MediaType_FAVORITE_FILE))
          {
            com.tencent.mm.al.f.afx().b((com.tencent.mm.i.g)localObject2, -1);
            g(localc);
            label1369: AppMethodBeat.o(5336);
            break;
          }
          label1395: if (this.mgV >= 10)
          {
            Fb();
            AppMethodBeat.o(5336);
            continue;
          }
          this.cra.ae(500L, 500L);
        }
      else
        AppMethodBeat.o(5336);
    }
  }

  public final void c(c paramc)
  {
    AppMethodBeat.i(5346);
    if (paramc != null)
      this.cqQ.add(paramc);
    AppMethodBeat.o(5346);
  }

  public final void hf(final boolean paramBoolean)
  {
    AppMethodBeat.i(5333);
    com.tencent.mm.kernel.g.RS().aa(new Runnable()
    {
      public final void run()
      {
        a.this.mgW = paramBoolean;
        a.this.mgV = 0;
      }
    });
    AppMethodBeat.o(5333);
  }

  public final void pauseDownload(String paramString)
  {
    AppMethodBeat.i(5338);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(5338);
    while (true)
    {
      return;
      if (this.cqS.containsKey(paramString))
      {
        com.tencent.mm.al.f.afx().rO(paramString);
        ab.i("MicroMsg.Fav.FavCdnService", "pause download md5%s", new Object[] { paramString });
        g(((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().LR(paramString));
        LW(paramString);
      }
      AppMethodBeat.o(5338);
    }
  }

  public final void run()
  {
    AppMethodBeat.i(5335);
    ab.i("MicroMsg.Fav.FavCdnService", "run fav cdn server");
    com.tencent.mm.kernel.g.RS().doN().removeCallbacks(this.mgX);
    com.tencent.mm.kernel.g.RS().aa(this.mgX);
    AppMethodBeat.o(5335);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.a
 * JD-Core Version:    0.6.2
 */