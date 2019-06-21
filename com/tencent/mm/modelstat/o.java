package com.tencent.mm.modelstat;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.w;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.bpu;
import com.tencent.mm.protocal.protobuf.bpv;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.HashMap;

public final class o
{
  private static ap che;
  private static final byte[] eMl;
  private static long fTP;
  private static HashMap<String, Long> fTQ;
  private static String fTR;
  private static long fTS;
  private static int fTT;
  private static long fTU;
  private static long fTV;
  private static float fTW;
  private static float fTX;
  private static int fTY;
  private static int fTZ;
  private static long fUa;
  private static String fUb;

  static
  {
    AppMethodBeat.i(78786);
    fTP = 86400000L;
    fTQ = new HashMap();
    fTR = null;
    eMl = new byte[0];
    fTS = 9223372036854775807L;
    fTT = 0;
    che = new ap(g.RS().oAl.getLooper(), new o.4(), false);
    fTU = 0L;
    fTV = 0L;
    fTW = 0.0F;
    fTX = 0.0F;
    fTY = 0;
    fTZ = 0;
    fUa = 0L;
    fUb = "";
    AppMethodBeat.o(78786);
  }

  public static void a(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(78782);
        if ((paramInt1 < 2000) || (paramFloat1 == 0.0F) || (paramFloat2 == 0.0F))
        {
          ab.e("MicroMsg.NetTypeReporter", "reportGps, invalid args, scene = %d, lon = %f, lat = %f, pre = %d", new Object[] { Integer.valueOf(paramInt1), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt2) });
          AppMethodBeat.o(78782);
          return;
        }
        if (bo.gb(fUa) < 60000L)
        {
          ab.e("MicroMsg.NetTypeReporter", "reportGps, hit lastReportGpsLimit, request dropped, scene = %d, lon = %f, lat = %f, pre = %d", new Object[] { Integer.valueOf(paramInt1), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt2) });
          AppMethodBeat.o(78782);
          continue;
        }
      }
      finally
      {
      }
      ab.i("MicroMsg.NetTypeReporter", "reportGps scene:%d lon:%f lat:%f pre:%d last:%d", new Object[] { Integer.valueOf(paramInt1), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt2), Long.valueOf(bo.gb(fUa)) });
      fUa = bo.anU();
      fTZ = paramInt1;
      fTV = bo.anU();
      fTY = paramInt2;
      fTW = paramFloat2;
      fTX = paramFloat1;
      try
      {
        ((WifiManager)ah.getContext().getSystemService("wifi")).startScan();
        al localal = g.RS();
        o.5 local5 = new com/tencent/mm/modelstat/o$5;
        local5.<init>();
        localal.m(local5, 5000L);
        AppMethodBeat.o(78782);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.NetTypeReporter", "reportGps :%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(78782);
      }
    }
  }

  private static void a(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(78778);
    long l1 = bo.anU();
    if ((fTU > 0L) && (l1 - fTU > 5000L))
    {
      ab.e("MicroMsg.NetTypeReporter", "never  report  at  background :%d diff:%d", new Object[] { Long.valueOf(fTU), Long.valueOf(l1 - fTU) });
      AppMethodBeat.o(78778);
    }
    String[] arrayOfString;
    while (true)
    {
      return;
      arrayOfString = mf(paramInt1);
      if ((arrayOfString != null) && (arrayOfString.length == 4) && (!bo.isNullOrNil(arrayOfString[0])))
        break;
      ab.e("MicroMsg.NetTypeReporter", "report get failed val");
      AppMethodBeat.o(78778);
    }
    ab.d("MicroMsg.NetTypeReporter", "report scene:%d time:%d lon:%f lat:%f pre:%d scanuse:%d [%s]", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(bo.gb(l1)), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt2), Long.valueOf(paramLong), arrayOfString[0] });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bpu();
    ((b.a)localObject).fsK = new bpv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rtkvreport";
    ((b.a)localObject).fsI = 716;
    com.tencent.mm.ai.b localb = ((b.a)localObject).acD();
    bpu localbpu = (bpu)localb.fsG.fsP;
    localbpu.vOz = d.vxj;
    localbpu.vOA = d.vxi;
    localbpu.vOB = d.vxl;
    localbpu.vOC = d.vxm;
    localbpu.vOD = aa.dor();
    localbpu.wBd = 11747;
    long l2 = bo.gb(fTU);
    if (l2 <= 600000L)
    {
      l1 = l2;
      if (l2 >= 0L);
    }
    else
    {
      l1 = 0L;
    }
    StringBuilder localStringBuilder = new StringBuilder().append(arrayOfString[0]).append("0,").append(paramFloat1).append(",").append(paramFloat2).append(",").append(paramInt2).append(",").append(paramLong).append(",");
    if (com.tencent.mm.sdk.a.b.foreground);
    for (localObject = "1"; ; localObject = String.valueOf(l1))
    {
      localbpu.pXM = ((String)localObject + "," + arrayOfString[1] + "," + arrayOfString[2] + "," + arrayOfString[3]);
      w.a(localb, new o.2(bo.anU(), localbpu, arrayOfString, paramFloat1, paramFloat2, paramInt2, paramLong), true);
      AppMethodBeat.o(78778);
      break;
    }
  }

  private static long ako()
  {
    AppMethodBeat.i(78777);
    synchronized (eMl)
    {
      try
      {
        l = bo.a((Long)g.RP().Ry().get(ac.a.xJK, null), 1L);
        g.RP().Ry().set(ac.a.xJK, Long.valueOf(1L + l));
        g.RP().Ry().dsb();
        ab.i("MicroMsg.NetTypeReporter", "incSeq after write  old:%d new:%d", new Object[] { Long.valueOf(l), Long.valueOf(bo.a((Long)g.RP().Ry().get(ac.a.xJK, null), 1L)) });
        AppMethodBeat.o(78777);
        return l;
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.NetTypeReporter", "incSeq :%s", new Object[] { bo.l(localException) });
          long l = -1L;
          AppMethodBeat.o(78777);
        }
      }
    }
  }

  private static void b(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(78780);
    try
    {
      ab.i("MicroMsg.NetTypeReporter", "checkTimeReport scene:%d diff:%d  time:%d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(bo.gb(fTS)), Long.valueOf(fTS) });
      if ((paramInt1 > 2000) || (bo.gb(fTS) > 300000L))
      {
        ab.i("MicroMsg.NetTypeReporter", "force Run, scene:%d diff:%d time:%d ", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(bo.gb(fTS)), Long.valueOf(fTS) });
        fTT = paramInt1;
        fTS = 9223372036854775807L;
        a(paramInt1, paramFloat1, paramFloat2, paramInt2, paramLong);
        AppMethodBeat.o(78780);
      }
      while (true)
      {
        return;
        if (fTS == 9223372036854775807L)
          fTS = bo.anU() + 60000L;
        fTT = paramInt1;
        che.ae(60000L, 60000L);
        AppMethodBeat.o(78780);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.e("MicroMsg.NetTypeReporter", "checkTimeReport error: %s", new Object[] { bo.l(localThrowable) });
        AppMethodBeat.o(78780);
      }
    }
  }

  public static void cT(boolean paramBoolean)
  {
    AppMethodBeat.i(78781);
    if (paramBoolean)
    {
      fTU = 0L;
      AppMethodBeat.o(78781);
    }
    while (true)
    {
      return;
      if (che.doT())
      {
        AppMethodBeat.o(78781);
      }
      else
      {
        ab.i("MicroMsg.NetTypeReporter", "setToForeground user turn to background run report now");
        fTU = bo.anU();
        che.ae(0L, 0L);
        AppMethodBeat.o(78781);
      }
    }
  }

  public static void ce(Context paramContext)
  {
    AppMethodBeat.i(78773);
    if (paramContext == null);
    try
    {
      ab.e("MicroMsg.NetTypeReporter", "registerReceiver ctx == null");
      AppMethodBeat.o(78773);
      while (true)
      {
        return;
        o.a locala = new com/tencent/mm/modelstat/o$a;
        locala.<init>((byte)0);
        IntentFilter localIntentFilter = new android/content/IntentFilter;
        localIntentFilter.<init>();
        localIntentFilter.addAction("android.net.wifi.supplicant.CONNECTION_CHANGE");
        localIntentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
        localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
        localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        localIntentFilter.addAction("android.net.wifi.SCAN_RESULTS");
        localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        paramContext.registerReceiver(locala, localIntentFilter);
        ab.i("MicroMsg.NetTypeReporter", "registerReceiver finish");
        AppMethodBeat.o(78773);
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.NetTypeReporter", "registerReceiver : %s", new Object[] { bo.l(paramContext) });
        AppMethodBeat.o(78773);
      }
    }
  }

  // ERROR //
  private static boolean i(java.util.ArrayList<String> paramArrayList)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc_w 452
    //   5: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokevirtual 457	java/util/ArrayList:size	()I
    //   12: ifne +19 -> 31
    //   15: ldc 116
    //   17: ldc_w 459
    //   20: invokestatic 462	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: ldc_w 452
    //   26: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: iload_1
    //   30: ireturn
    //   31: getstatic 51	com/tencent/mm/modelstat/o:fTR	Ljava/lang/String;
    //   34: invokestatic 205	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   37: ifeq +31 -> 68
    //   40: new 296	java/lang/StringBuilder
    //   43: dup
    //   44: invokespecial 297	java/lang/StringBuilder:<init>	()V
    //   47: invokestatic 352	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   50: getfield 465	com/tencent/mm/kernel/e:cachePath	Ljava/lang/String;
    //   53: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: ldc_w 467
    //   59: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: invokevirtual 325	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: putstatic 51	com/tencent/mm/modelstat/o:fTR	Ljava/lang/String;
    //   68: getstatic 49	com/tencent/mm/modelstat/o:fTQ	Ljava/util/HashMap;
    //   71: invokevirtual 468	java/util/HashMap:size	()I
    //   74: ifne +166 -> 240
    //   77: getstatic 51	com/tencent/mm/modelstat/o:fTR	Ljava/lang/String;
    //   80: invokestatic 474	com/tencent/mm/a/e:cs	(Ljava/lang/String;)I
    //   83: ldc_w 475
    //   86: if_icmple +10 -> 96
    //   89: getstatic 51	com/tencent/mm/modelstat/o:fTR	Ljava/lang/String;
    //   92: invokestatic 478	com/tencent/mm/a/e:deleteFile	(Ljava/lang/String;)Z
    //   95: pop
    //   96: new 480	java/io/FileInputStream
    //   99: astore_2
    //   100: aload_2
    //   101: getstatic 51	com/tencent/mm/modelstat/o:fTR	Ljava/lang/String;
    //   104: invokespecial 482	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   107: new 484	java/io/ObjectInputStream
    //   110: astore_3
    //   111: new 486	java/io/BufferedInputStream
    //   114: astore 4
    //   116: aload 4
    //   118: aload_2
    //   119: invokespecial 489	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   122: aload_3
    //   123: aload 4
    //   125: invokespecial 490	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   128: aload_3
    //   129: astore 5
    //   131: aload_2
    //   132: astore 4
    //   134: aload_3
    //   135: invokevirtual 494	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   138: checkcast 44	java/util/HashMap
    //   141: putstatic 49	com/tencent/mm/modelstat/o:fTQ	Ljava/util/HashMap;
    //   144: aload_3
    //   145: astore 5
    //   147: aload_2
    //   148: astore 4
    //   150: ldc 116
    //   152: ldc_w 496
    //   155: iconst_1
    //   156: anewarray 4	java/lang/Object
    //   159: dup
    //   160: iconst_0
    //   161: getstatic 49	com/tencent/mm/modelstat/o:fTQ	Ljava/util/HashMap;
    //   164: invokevirtual 468	java/util/HashMap:size	()I
    //   167: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   170: aastore
    //   171: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   174: aload_3
    //   175: invokevirtual 499	java/io/ObjectInputStream:close	()V
    //   178: aload_2
    //   179: invokevirtual 500	java/io/FileInputStream:close	()V
    //   182: getstatic 49	com/tencent/mm/modelstat/o:fTQ	Ljava/util/HashMap;
    //   185: invokevirtual 468	java/util/HashMap:size	()I
    //   188: ifle +15 -> 203
    //   191: getstatic 49	com/tencent/mm/modelstat/o:fTQ	Ljava/util/HashMap;
    //   194: invokevirtual 468	java/util/HashMap:size	()I
    //   197: sipush 1000
    //   200: if_icmple +40 -> 240
    //   203: ldc 116
    //   205: ldc_w 502
    //   208: iconst_2
    //   209: anewarray 4	java/lang/Object
    //   212: dup
    //   213: iconst_0
    //   214: getstatic 49	com/tencent/mm/modelstat/o:fTQ	Ljava/util/HashMap;
    //   217: invokevirtual 468	java/util/HashMap:size	()I
    //   220: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   223: aastore
    //   224: dup
    //   225: iconst_1
    //   226: getstatic 51	com/tencent/mm/modelstat/o:fTR	Ljava/lang/String;
    //   229: aastore
    //   230: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   233: getstatic 51	com/tencent/mm/modelstat/o:fTR	Ljava/lang/String;
    //   236: invokestatic 478	com/tencent/mm/a/e:deleteFile	(Ljava/lang/String;)Z
    //   239: pop
    //   240: aload_0
    //   241: invokevirtual 506	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   244: astore_3
    //   245: iconst_0
    //   246: istore_1
    //   247: aload_3
    //   248: invokeinterface 511 1 0
    //   253: ifeq +302 -> 555
    //   256: aload_3
    //   257: invokeinterface 514 1 0
    //   262: checkcast 340	java/lang/String
    //   265: astore_0
    //   266: getstatic 49	com/tencent/mm/modelstat/o:fTQ	Ljava/util/HashMap;
    //   269: aload_0
    //   270: invokevirtual 517	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   273: invokestatic 521	com/tencent/mm/sdk/platformtools/bo:cE	(Ljava/lang/Object;)J
    //   276: invokestatic 141	com/tencent/mm/sdk/platformtools/bo:gb	(J)J
    //   279: lstore 6
    //   281: ldc 116
    //   283: ldc_w 523
    //   286: iconst_2
    //   287: anewarray 4	java/lang/Object
    //   290: dup
    //   291: iconst_0
    //   292: aload_0
    //   293: aastore
    //   294: dup
    //   295: iconst_1
    //   296: lload 6
    //   298: invokestatic 152	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   301: aastore
    //   302: invokestatic 215	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   305: lload 6
    //   307: lconst_0
    //   308: lcmp
    //   309: ifle +12 -> 321
    //   312: lload 6
    //   314: getstatic 42	com/tencent/mm/modelstat/o:fTP	J
    //   317: lcmp
    //   318: ifle +539 -> 857
    //   321: getstatic 49	com/tencent/mm/modelstat/o:fTQ	Ljava/util/HashMap;
    //   324: aload_0
    //   325: invokestatic 158	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   328: invokestatic 152	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   331: invokevirtual 527	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   334: pop
    //   335: iconst_1
    //   336: istore_1
    //   337: goto -90 -> 247
    //   340: astore_3
    //   341: ldc 116
    //   343: ldc_w 529
    //   346: iconst_1
    //   347: anewarray 4	java/lang/Object
    //   350: dup
    //   351: iconst_0
    //   352: aload_3
    //   353: invokestatic 193	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   356: aastore
    //   357: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   360: new 44	java/util/HashMap
    //   363: dup
    //   364: invokespecial 47	java/util/HashMap:<init>	()V
    //   367: putstatic 49	com/tencent/mm/modelstat/o:fTQ	Ljava/util/HashMap;
    //   370: goto -188 -> 182
    //   373: astore 8
    //   375: aconst_null
    //   376: astore_3
    //   377: aconst_null
    //   378: astore_2
    //   379: aload_3
    //   380: astore 5
    //   382: aload_2
    //   383: astore 4
    //   385: ldc 116
    //   387: ldc_w 529
    //   390: iconst_1
    //   391: anewarray 4	java/lang/Object
    //   394: dup
    //   395: iconst_0
    //   396: aload 8
    //   398: invokestatic 193	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   401: aastore
    //   402: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   405: aload_3
    //   406: astore 5
    //   408: aload_2
    //   409: astore 4
    //   411: new 44	java/util/HashMap
    //   414: astore 8
    //   416: aload_3
    //   417: astore 5
    //   419: aload_2
    //   420: astore 4
    //   422: aload 8
    //   424: invokespecial 47	java/util/HashMap:<init>	()V
    //   427: aload_3
    //   428: astore 5
    //   430: aload_2
    //   431: astore 4
    //   433: aload 8
    //   435: putstatic 49	com/tencent/mm/modelstat/o:fTQ	Ljava/util/HashMap;
    //   438: aload_3
    //   439: ifnull +7 -> 446
    //   442: aload_3
    //   443: invokevirtual 499	java/io/ObjectInputStream:close	()V
    //   446: aload_2
    //   447: ifnull -265 -> 182
    //   450: aload_2
    //   451: invokevirtual 500	java/io/FileInputStream:close	()V
    //   454: goto -272 -> 182
    //   457: astore_3
    //   458: ldc 116
    //   460: ldc_w 529
    //   463: iconst_1
    //   464: anewarray 4	java/lang/Object
    //   467: dup
    //   468: iconst_0
    //   469: aload_3
    //   470: invokestatic 193	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   473: aastore
    //   474: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   477: new 44	java/util/HashMap
    //   480: dup
    //   481: invokespecial 47	java/util/HashMap:<init>	()V
    //   484: putstatic 49	com/tencent/mm/modelstat/o:fTQ	Ljava/util/HashMap;
    //   487: goto -305 -> 182
    //   490: astore_0
    //   491: aconst_null
    //   492: astore 5
    //   494: aconst_null
    //   495: astore_2
    //   496: aload 5
    //   498: ifnull +8 -> 506
    //   501: aload 5
    //   503: invokevirtual 499	java/io/ObjectInputStream:close	()V
    //   506: aload_2
    //   507: ifnull +7 -> 514
    //   510: aload_2
    //   511: invokevirtual 500	java/io/FileInputStream:close	()V
    //   514: ldc_w 452
    //   517: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   520: aload_0
    //   521: athrow
    //   522: astore_3
    //   523: ldc 116
    //   525: ldc_w 529
    //   528: iconst_1
    //   529: anewarray 4	java/lang/Object
    //   532: dup
    //   533: iconst_0
    //   534: aload_3
    //   535: invokestatic 193	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   538: aastore
    //   539: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   542: new 44	java/util/HashMap
    //   545: dup
    //   546: invokespecial 47	java/util/HashMap:<init>	()V
    //   549: putstatic 49	com/tencent/mm/modelstat/o:fTQ	Ljava/util/HashMap;
    //   552: goto -38 -> 514
    //   555: iload_1
    //   556: ifeq +90 -> 646
    //   559: getstatic 49	com/tencent/mm/modelstat/o:fTQ	Ljava/util/HashMap;
    //   562: invokevirtual 468	java/util/HashMap:size	()I
    //   565: ifle +81 -> 646
    //   568: new 531	java/io/FileOutputStream
    //   571: astore_3
    //   572: aload_3
    //   573: getstatic 51	com/tencent/mm/modelstat/o:fTR	Ljava/lang/String;
    //   576: invokespecial 532	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   579: new 534	java/io/ObjectOutputStream
    //   582: astore_0
    //   583: aload_0
    //   584: aload_3
    //   585: invokespecial 537	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   588: aload_0
    //   589: astore 4
    //   591: aload_3
    //   592: astore_2
    //   593: aload_0
    //   594: getstatic 49	com/tencent/mm/modelstat/o:fTQ	Ljava/util/HashMap;
    //   597: invokevirtual 541	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   600: aload_0
    //   601: astore 4
    //   603: aload_3
    //   604: astore_2
    //   605: aload_3
    //   606: invokevirtual 544	java/io/FileOutputStream:flush	()V
    //   609: aload_0
    //   610: astore 4
    //   612: aload_3
    //   613: astore_2
    //   614: ldc 116
    //   616: ldc_w 546
    //   619: iconst_1
    //   620: anewarray 4	java/lang/Object
    //   623: dup
    //   624: iconst_0
    //   625: getstatic 49	com/tencent/mm/modelstat/o:fTQ	Ljava/util/HashMap;
    //   628: invokevirtual 468	java/util/HashMap:size	()I
    //   631: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   634: aastore
    //   635: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   638: aload_0
    //   639: invokevirtual 547	java/io/ObjectOutputStream:close	()V
    //   642: aload_3
    //   643: invokevirtual 548	java/io/FileOutputStream:close	()V
    //   646: ldc_w 452
    //   649: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   652: goto -623 -> 29
    //   655: astore_0
    //   656: ldc 116
    //   658: ldc_w 550
    //   661: iconst_1
    //   662: anewarray 4	java/lang/Object
    //   665: dup
    //   666: iconst_0
    //   667: aload_0
    //   668: invokestatic 193	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   671: aastore
    //   672: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   675: goto -29 -> 646
    //   678: astore 5
    //   680: aconst_null
    //   681: astore_0
    //   682: aconst_null
    //   683: astore_3
    //   684: aload_0
    //   685: astore 4
    //   687: aload_3
    //   688: astore_2
    //   689: ldc 116
    //   691: ldc_w 550
    //   694: iconst_1
    //   695: anewarray 4	java/lang/Object
    //   698: dup
    //   699: iconst_0
    //   700: aload 5
    //   702: invokestatic 193	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   705: aastore
    //   706: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   709: aload_0
    //   710: ifnull +7 -> 717
    //   713: aload_0
    //   714: invokevirtual 547	java/io/ObjectOutputStream:close	()V
    //   717: aload_3
    //   718: ifnull -72 -> 646
    //   721: aload_3
    //   722: invokevirtual 548	java/io/FileOutputStream:close	()V
    //   725: goto -79 -> 646
    //   728: astore_0
    //   729: ldc 116
    //   731: ldc_w 550
    //   734: iconst_1
    //   735: anewarray 4	java/lang/Object
    //   738: dup
    //   739: iconst_0
    //   740: aload_0
    //   741: invokestatic 193	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   744: aastore
    //   745: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   748: goto -102 -> 646
    //   751: astore_0
    //   752: aconst_null
    //   753: astore 4
    //   755: aconst_null
    //   756: astore_3
    //   757: aload 4
    //   759: ifnull +8 -> 767
    //   762: aload 4
    //   764: invokevirtual 547	java/io/ObjectOutputStream:close	()V
    //   767: aload_3
    //   768: ifnull +7 -> 775
    //   771: aload_3
    //   772: invokevirtual 548	java/io/FileOutputStream:close	()V
    //   775: ldc_w 452
    //   778: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   781: aload_0
    //   782: athrow
    //   783: astore_3
    //   784: ldc 116
    //   786: ldc_w 550
    //   789: iconst_1
    //   790: anewarray 4	java/lang/Object
    //   793: dup
    //   794: iconst_0
    //   795: aload_3
    //   796: invokestatic 193	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   799: aastore
    //   800: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   803: goto -28 -> 775
    //   806: astore_0
    //   807: aconst_null
    //   808: astore 4
    //   810: goto -53 -> 757
    //   813: astore_0
    //   814: aload_2
    //   815: astore_3
    //   816: goto -59 -> 757
    //   819: astore 5
    //   821: aconst_null
    //   822: astore_0
    //   823: goto -139 -> 684
    //   826: astore 5
    //   828: goto -144 -> 684
    //   831: astore_0
    //   832: aconst_null
    //   833: astore 5
    //   835: goto -339 -> 496
    //   838: astore_0
    //   839: aload 4
    //   841: astore_2
    //   842: goto -346 -> 496
    //   845: astore 8
    //   847: aconst_null
    //   848: astore_3
    //   849: goto -470 -> 379
    //   852: astore 8
    //   854: goto -475 -> 379
    //   857: goto -520 -> 337
    //
    // Exception table:
    //   from	to	target	type
    //   174	182	340	java/lang/Exception
    //   77	96	373	java/lang/Exception
    //   96	107	373	java/lang/Exception
    //   442	446	457	java/lang/Exception
    //   450	454	457	java/lang/Exception
    //   77	96	490	finally
    //   96	107	490	finally
    //   501	506	522	java/lang/Exception
    //   510	514	522	java/lang/Exception
    //   638	646	655	java/lang/Exception
    //   568	579	678	java/lang/Exception
    //   713	717	728	java/lang/Exception
    //   721	725	728	java/lang/Exception
    //   568	579	751	finally
    //   762	767	783	java/lang/Exception
    //   771	775	783	java/lang/Exception
    //   579	588	806	finally
    //   593	600	813	finally
    //   605	609	813	finally
    //   614	638	813	finally
    //   689	709	813	finally
    //   579	588	819	java/lang/Exception
    //   593	600	826	java/lang/Exception
    //   605	609	826	java/lang/Exception
    //   614	638	826	java/lang/Exception
    //   107	128	831	finally
    //   134	144	838	finally
    //   150	174	838	finally
    //   385	405	838	finally
    //   411	416	838	finally
    //   422	427	838	finally
    //   433	438	838	finally
    //   107	128	845	java/lang/Exception
    //   134	144	852	java/lang/Exception
    //   150	174	852	java/lang/Exception
  }

  // ERROR //
  private static String[] mf(int paramInt)
  {
    // Byte code:
    //   0: ldc_w 553
    //   3: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 116
    //   8: ldc_w 555
    //   11: iconst_4
    //   12: anewarray 4	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: iload_0
    //   18: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   21: aastore
    //   22: dup
    //   23: iconst_1
    //   24: getstatic 320	com/tencent/mm/sdk/a/b:foreground	Z
    //   27: invokestatic 560	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   30: aastore
    //   31: dup
    //   32: iconst_2
    //   33: getstatic 89	com/tencent/mm/modelstat/o:fTU	J
    //   36: invokestatic 152	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   39: aastore
    //   40: dup
    //   41: iconst_3
    //   42: getstatic 89	com/tencent/mm/modelstat/o:fTU	J
    //   45: invokestatic 141	com/tencent/mm/sdk/platformtools/bo:gb	(J)J
    //   48: invokestatic 152	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   51: aastore
    //   52: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: iload_0
    //   56: ifgt +32 -> 88
    //   59: ldc 116
    //   61: ldc_w 562
    //   64: iconst_1
    //   65: anewarray 4	java/lang/Object
    //   68: dup
    //   69: iconst_0
    //   70: iload_0
    //   71: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   74: aastore
    //   75: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   78: aconst_null
    //   79: astore_1
    //   80: ldc_w 553
    //   83: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   86: aload_1
    //   87: areturn
    //   88: invokestatic 164	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   91: astore_2
    //   92: aload_2
    //   93: ifnonnull +33 -> 126
    //   96: ldc 116
    //   98: ldc_w 564
    //   101: iconst_1
    //   102: anewarray 4	java/lang/Object
    //   105: dup
    //   106: iconst_0
    //   107: iload_0
    //   108: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   111: aastore
    //   112: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   115: aconst_null
    //   116: astore_1
    //   117: ldc_w 553
    //   120: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   123: goto -37 -> 86
    //   126: ldc 116
    //   128: ldc_w 566
    //   131: iconst_2
    //   132: anewarray 4	java/lang/Object
    //   135: dup
    //   136: iconst_0
    //   137: iload_0
    //   138: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   141: aastore
    //   142: dup
    //   143: iconst_1
    //   144: getstatic 320	com/tencent/mm/sdk/a/b:foreground	Z
    //   147: invokestatic 560	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   150: aastore
    //   151: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   154: invokestatic 571	com/tencent/mm/compatible/e/y:Me	()I
    //   157: istore_3
    //   158: ldc 116
    //   160: ldc_w 573
    //   163: iconst_1
    //   164: anewarray 4	java/lang/Object
    //   167: dup
    //   168: iconst_0
    //   169: iload_3
    //   170: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   173: aastore
    //   174: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   177: ldc 103
    //   179: astore 4
    //   181: ldc 103
    //   183: astore 5
    //   185: aload 4
    //   187: astore_1
    //   188: aload_2
    //   189: ldc 166
    //   191: invokevirtual 172	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   194: checkcast 174	android/net/wifi/WifiManager
    //   197: astore 6
    //   199: aload 4
    //   201: astore_1
    //   202: new 575	java/lang/StringBuffer
    //   205: astore 7
    //   207: aload 4
    //   209: astore_1
    //   210: aload 7
    //   212: invokespecial 576	java/lang/StringBuffer:<init>	()V
    //   215: aload 4
    //   217: astore_1
    //   218: new 575	java/lang/StringBuffer
    //   221: astore 8
    //   223: aload 4
    //   225: astore_1
    //   226: aload 8
    //   228: invokespecial 576	java/lang/StringBuffer:<init>	()V
    //   231: aload 4
    //   233: astore_1
    //   234: new 575	java/lang/StringBuffer
    //   237: astore 9
    //   239: aload 4
    //   241: astore_1
    //   242: aload 9
    //   244: invokespecial 576	java/lang/StringBuffer:<init>	()V
    //   247: iconst_0
    //   248: istore 10
    //   250: iconst_0
    //   251: istore 11
    //   253: aload 4
    //   255: astore_1
    //   256: new 454	java/util/ArrayList
    //   259: astore 12
    //   261: aload 4
    //   263: astore_1
    //   264: aload 12
    //   266: invokespecial 577	java/util/ArrayList:<init>	()V
    //   269: aload 4
    //   271: astore_1
    //   272: aload 7
    //   274: invokestatic 164	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   277: invokestatic 583	com/tencent/mm/sdk/platformtools/at:gE	(Landroid/content/Context;)Ljava/lang/String;
    //   280: invokevirtual 586	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   283: pop
    //   284: aload 4
    //   286: astore_1
    //   287: aload 8
    //   289: invokestatic 164	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   292: invokestatic 589	com/tencent/mm/sdk/platformtools/at:gF	(Landroid/content/Context;)Ljava/lang/String;
    //   295: invokevirtual 586	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   298: pop
    //   299: aload 4
    //   301: astore_1
    //   302: invokestatic 164	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   305: invokestatic 589	com/tencent/mm/sdk/platformtools/at:gF	(Landroid/content/Context;)Ljava/lang/String;
    //   308: astore 13
    //   310: aload 4
    //   312: astore_1
    //   313: aload 12
    //   315: aload 13
    //   317: invokevirtual 593	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   320: pop
    //   321: aload 4
    //   323: astore_1
    //   324: aload 6
    //   326: invokevirtual 597	android/net/wifi/WifiManager:getScanResults	()Ljava/util/List;
    //   329: astore 6
    //   331: aload 6
    //   333: ifnull +295 -> 628
    //   336: aload 4
    //   338: astore_1
    //   339: new 599	com/tencent/mm/modelstat/o$1
    //   342: astore 14
    //   344: aload 4
    //   346: astore_1
    //   347: aload 14
    //   349: invokespecial 600	com/tencent/mm/modelstat/o$1:<init>	()V
    //   352: aload 4
    //   354: astore_1
    //   355: aload 6
    //   357: aload 14
    //   359: invokestatic 606	java/util/Collections:sort	(Ljava/util/List;Ljava/util/Comparator;)V
    //   362: aload 4
    //   364: astore_1
    //   365: aload 6
    //   367: invokeinterface 609 1 0
    //   372: astore 6
    //   374: bipush 20
    //   376: istore 15
    //   378: iload 11
    //   380: istore 10
    //   382: aload 4
    //   384: astore_1
    //   385: aload 6
    //   387: invokeinterface 511 1 0
    //   392: ifeq +236 -> 628
    //   395: aload 4
    //   397: astore_1
    //   398: aload 6
    //   400: invokeinterface 514 1 0
    //   405: checkcast 611	android/net/wifi/ScanResult
    //   408: astore 14
    //   410: aload 14
    //   412: ifnull -34 -> 378
    //   415: aload 4
    //   417: astore_1
    //   418: aload 14
    //   420: getfield 614	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   423: invokestatic 205	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   426: ifne -48 -> 378
    //   429: aload 4
    //   431: astore_1
    //   432: aload 14
    //   434: getfield 614	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   437: aload 13
    //   439: invokevirtual 617	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   442: ifeq +41 -> 483
    //   445: aload 4
    //   447: astore_1
    //   448: aload 14
    //   450: getfield 620	android/net/wifi/ScanResult:level	I
    //   453: istore 11
    //   455: goto -77 -> 378
    //   458: astore_1
    //   459: ldc 116
    //   461: ldc_w 622
    //   464: iconst_1
    //   465: anewarray 4	java/lang/Object
    //   468: dup
    //   469: iconst_0
    //   470: aload_1
    //   471: invokestatic 193	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   474: aastore
    //   475: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   478: iconst_0
    //   479: istore_3
    //   480: goto -322 -> 158
    //   483: iload 11
    //   485: istore 10
    //   487: iload 15
    //   489: ifle +139 -> 628
    //   492: aload 4
    //   494: astore_1
    //   495: aload 7
    //   497: ldc_w 624
    //   500: invokevirtual 586	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   503: pop
    //   504: aload 4
    //   506: astore_1
    //   507: aload 7
    //   509: aload 14
    //   511: getfield 627	android/net/wifi/ScanResult:SSID	Ljava/lang/String;
    //   514: invokestatic 631	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   517: ldc_w 624
    //   520: ldc 103
    //   522: invokevirtual 635	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   525: ldc_w 637
    //   528: ldc 103
    //   530: invokevirtual 635	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   533: invokevirtual 586	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   536: pop
    //   537: aload 4
    //   539: astore_1
    //   540: aload 8
    //   542: ldc_w 624
    //   545: invokevirtual 586	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   548: pop
    //   549: aload 4
    //   551: astore_1
    //   552: aload 8
    //   554: aload 14
    //   556: getfield 614	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   559: invokestatic 631	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   562: ldc_w 624
    //   565: ldc 103
    //   567: invokevirtual 635	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   570: ldc_w 637
    //   573: ldc 103
    //   575: invokevirtual 635	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   578: invokevirtual 586	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   581: pop
    //   582: aload 4
    //   584: astore_1
    //   585: aload 12
    //   587: aload 14
    //   589: getfield 614	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   592: invokevirtual 593	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   595: pop
    //   596: aload 4
    //   598: astore_1
    //   599: aload 9
    //   601: ldc_w 624
    //   604: invokevirtual 586	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   607: pop
    //   608: aload 4
    //   610: astore_1
    //   611: aload 9
    //   613: aload 14
    //   615: getfield 620	android/net/wifi/ScanResult:level	I
    //   618: invokevirtual 640	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   621: pop
    //   622: iinc 15 255
    //   625: goto -247 -> 378
    //   628: iload_0
    //   629: sipush 2000
    //   632: if_icmpge +47 -> 679
    //   635: aload 4
    //   637: astore_1
    //   638: aload 12
    //   640: invokestatic 642	com/tencent/mm/modelstat/o:i	(Ljava/util/ArrayList;)Z
    //   643: ifne +36 -> 679
    //   646: aload 4
    //   648: astore_1
    //   649: ldc 116
    //   651: ldc_w 644
    //   654: iconst_1
    //   655: anewarray 4	java/lang/Object
    //   658: dup
    //   659: iconst_0
    //   660: iload_0
    //   661: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   664: aastore
    //   665: invokestatic 646	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   668: aconst_null
    //   669: astore_1
    //   670: ldc_w 553
    //   673: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   676: goto -590 -> 86
    //   679: aload 4
    //   681: astore_1
    //   682: aload 7
    //   684: invokevirtual 647	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   687: astore 4
    //   689: aload 4
    //   691: astore_1
    //   692: aload 8
    //   694: invokevirtual 647	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   697: astore 8
    //   699: aload 8
    //   701: astore_1
    //   702: new 296	java/lang/StringBuilder
    //   705: astore 8
    //   707: aload 8
    //   709: invokespecial 297	java/lang/StringBuilder:<init>	()V
    //   712: aload 8
    //   714: iload 10
    //   716: invokevirtual 311	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   719: aload 9
    //   721: invokevirtual 647	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   724: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   727: invokevirtual 325	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   730: astore 8
    //   732: aload 8
    //   734: astore 5
    //   736: aload 4
    //   738: astore 14
    //   740: aload_1
    //   741: astore 16
    //   743: ldc 116
    //   745: ldc_w 649
    //   748: iconst_2
    //   749: anewarray 4	java/lang/Object
    //   752: dup
    //   753: iconst_0
    //   754: aload 16
    //   756: aastore
    //   757: dup
    //   758: iconst_1
    //   759: aload 14
    //   761: aastore
    //   762: invokestatic 215	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   765: ldc 103
    //   767: astore 17
    //   769: aload_2
    //   770: ldc_w 651
    //   773: invokevirtual 172	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   776: checkcast 653	android/telephony/TelephonyManager
    //   779: astore_1
    //   780: aload_1
    //   781: ifnull +1207 -> 1988
    //   784: aload_1
    //   785: invokevirtual 656	android/telephony/TelephonyManager:getNetworkOperatorName	()Ljava/lang/String;
    //   788: astore_1
    //   789: aload_1
    //   790: astore 17
    //   792: ldc 116
    //   794: ldc_w 658
    //   797: iconst_1
    //   798: anewarray 4	java/lang/Object
    //   801: dup
    //   802: iconst_0
    //   803: aload 17
    //   805: aastore
    //   806: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   809: ldc 103
    //   811: astore 4
    //   813: ldc 103
    //   815: astore 8
    //   817: ldc 103
    //   819: astore 9
    //   821: ldc 103
    //   823: astore 13
    //   825: ldc 103
    //   827: astore_1
    //   828: aload_2
    //   829: invokestatic 662	com/tencent/mm/sdk/platformtools/at:gJ	(Landroid/content/Context;)Ljava/util/List;
    //   832: astore 18
    //   834: iconst_0
    //   835: istore 11
    //   837: ldc 103
    //   839: astore 7
    //   841: aload 4
    //   843: astore_2
    //   844: aload 8
    //   846: astore 13
    //   848: aload 9
    //   850: astore 4
    //   852: aload 7
    //   854: astore 8
    //   856: aload 4
    //   858: astore 9
    //   860: aload 13
    //   862: astore 6
    //   864: aload_2
    //   865: astore 12
    //   867: iload 11
    //   869: aload 18
    //   871: invokeinterface 663 1 0
    //   876: if_icmpge +683 -> 1559
    //   879: aload 4
    //   881: astore 9
    //   883: aload 13
    //   885: astore 6
    //   887: aload_2
    //   888: astore 12
    //   890: aload 18
    //   892: iload 11
    //   894: invokeinterface 666 2 0
    //   899: checkcast 668	com/tencent/mm/sdk/platformtools/at$a
    //   902: astore 19
    //   904: aload 4
    //   906: astore 9
    //   908: aload 13
    //   910: astore 6
    //   912: aload_2
    //   913: astore 12
    //   915: aload 19
    //   917: getfield 671	com/tencent/mm/sdk/platformtools/at$a:org	Ljava/lang/String;
    //   920: ldc 103
    //   922: invokestatic 675	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   925: astore_2
    //   926: aload 4
    //   928: astore 9
    //   930: aload 13
    //   932: astore 6
    //   934: aload_2
    //   935: astore 12
    //   937: aload 19
    //   939: getfield 678	com/tencent/mm/sdk/platformtools/at$a:orh	Ljava/lang/String;
    //   942: ldc 103
    //   944: invokestatic 675	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   947: astore 7
    //   949: aload 4
    //   951: astore 13
    //   953: aload 4
    //   955: astore 9
    //   957: aload 7
    //   959: astore 6
    //   961: aload_2
    //   962: astore 12
    //   964: aload 4
    //   966: invokevirtual 681	java/lang/String:length	()I
    //   969: ifle +90 -> 1059
    //   972: aload 4
    //   974: astore 13
    //   976: aload 4
    //   978: astore 9
    //   980: aload 7
    //   982: astore 6
    //   984: aload_2
    //   985: astore 12
    //   987: aload 19
    //   989: getfield 684	com/tencent/mm/sdk/platformtools/at$a:ori	Ljava/lang/String;
    //   992: invokestatic 205	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   995: ifne +64 -> 1059
    //   998: aload 4
    //   1000: astore 9
    //   1002: aload 7
    //   1004: astore 6
    //   1006: aload_2
    //   1007: astore 12
    //   1009: new 296	java/lang/StringBuilder
    //   1012: astore 13
    //   1014: aload 4
    //   1016: astore 9
    //   1018: aload 7
    //   1020: astore 6
    //   1022: aload_2
    //   1023: astore 12
    //   1025: aload 13
    //   1027: invokespecial 297	java/lang/StringBuilder:<init>	()V
    //   1030: aload 4
    //   1032: astore 9
    //   1034: aload 7
    //   1036: astore 6
    //   1038: aload_2
    //   1039: astore 12
    //   1041: aload 13
    //   1043: aload 4
    //   1045: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1048: ldc_w 624
    //   1051: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1054: invokevirtual 325	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1057: astore 13
    //   1059: aload 13
    //   1061: astore 4
    //   1063: aload 13
    //   1065: astore 9
    //   1067: aload 7
    //   1069: astore 6
    //   1071: aload_2
    //   1072: astore 12
    //   1074: aload 19
    //   1076: getfield 684	com/tencent/mm/sdk/platformtools/at$a:ori	Ljava/lang/String;
    //   1079: invokestatic 205	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1082: ifne +66 -> 1148
    //   1085: aload 13
    //   1087: astore 9
    //   1089: aload 7
    //   1091: astore 6
    //   1093: aload_2
    //   1094: astore 12
    //   1096: new 296	java/lang/StringBuilder
    //   1099: astore 4
    //   1101: aload 13
    //   1103: astore 9
    //   1105: aload 7
    //   1107: astore 6
    //   1109: aload_2
    //   1110: astore 12
    //   1112: aload 4
    //   1114: invokespecial 297	java/lang/StringBuilder:<init>	()V
    //   1117: aload 13
    //   1119: astore 9
    //   1121: aload 7
    //   1123: astore 6
    //   1125: aload_2
    //   1126: astore 12
    //   1128: aload 4
    //   1130: aload 13
    //   1132: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1135: aload 19
    //   1137: getfield 684	com/tencent/mm/sdk/platformtools/at$a:ori	Ljava/lang/String;
    //   1140: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1143: invokevirtual 325	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1146: astore 4
    //   1148: aload 4
    //   1150: astore 9
    //   1152: aload 7
    //   1154: astore 6
    //   1156: aload_2
    //   1157: astore 12
    //   1159: aload 8
    //   1161: invokevirtual 681	java/lang/String:length	()I
    //   1164: ifle +817 -> 1981
    //   1167: aload 4
    //   1169: astore 9
    //   1171: aload 7
    //   1173: astore 6
    //   1175: aload_2
    //   1176: astore 12
    //   1178: aload 19
    //   1180: getfield 687	com/tencent/mm/sdk/platformtools/at$a:tzp	Ljava/lang/String;
    //   1183: invokestatic 205	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1186: ifne +795 -> 1981
    //   1189: aload 4
    //   1191: astore 9
    //   1193: aload 7
    //   1195: astore 6
    //   1197: aload_2
    //   1198: astore 12
    //   1200: new 296	java/lang/StringBuilder
    //   1203: astore 13
    //   1205: aload 4
    //   1207: astore 9
    //   1209: aload 7
    //   1211: astore 6
    //   1213: aload_2
    //   1214: astore 12
    //   1216: aload 13
    //   1218: invokespecial 297	java/lang/StringBuilder:<init>	()V
    //   1221: aload 4
    //   1223: astore 9
    //   1225: aload 7
    //   1227: astore 6
    //   1229: aload_2
    //   1230: astore 12
    //   1232: aload 13
    //   1234: aload 8
    //   1236: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1239: ldc_w 624
    //   1242: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1245: invokevirtual 325	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1248: astore 13
    //   1250: aload 13
    //   1252: astore 9
    //   1254: aload 9
    //   1256: astore 8
    //   1258: aload_1
    //   1259: astore 12
    //   1261: aload 9
    //   1263: astore 13
    //   1265: aload 19
    //   1267: getfield 687	com/tencent/mm/sdk/platformtools/at$a:tzp	Ljava/lang/String;
    //   1270: invokestatic 205	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1273: ifne +54 -> 1327
    //   1276: aload_1
    //   1277: astore 12
    //   1279: aload 9
    //   1281: astore 13
    //   1283: new 296	java/lang/StringBuilder
    //   1286: astore 8
    //   1288: aload_1
    //   1289: astore 12
    //   1291: aload 9
    //   1293: astore 13
    //   1295: aload 8
    //   1297: invokespecial 297	java/lang/StringBuilder:<init>	()V
    //   1300: aload_1
    //   1301: astore 12
    //   1303: aload 9
    //   1305: astore 13
    //   1307: aload 8
    //   1309: aload 9
    //   1311: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1314: aload 19
    //   1316: getfield 687	com/tencent/mm/sdk/platformtools/at$a:tzp	Ljava/lang/String;
    //   1319: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1322: invokevirtual 325	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1325: astore 8
    //   1327: aload_1
    //   1328: astore 9
    //   1330: aload_1
    //   1331: astore 12
    //   1333: aload 8
    //   1335: astore 13
    //   1337: aload_1
    //   1338: invokevirtual 681	java/lang/String:length	()I
    //   1341: ifle +51 -> 1392
    //   1344: aload_1
    //   1345: astore 12
    //   1347: aload 8
    //   1349: astore 13
    //   1351: new 296	java/lang/StringBuilder
    //   1354: astore 9
    //   1356: aload_1
    //   1357: astore 12
    //   1359: aload 8
    //   1361: astore 13
    //   1363: aload 9
    //   1365: invokespecial 297	java/lang/StringBuilder:<init>	()V
    //   1368: aload_1
    //   1369: astore 12
    //   1371: aload 8
    //   1373: astore 13
    //   1375: aload 9
    //   1377: aload_1
    //   1378: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1381: ldc_w 624
    //   1384: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1387: invokevirtual 325	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1390: astore 9
    //   1392: aload 9
    //   1394: astore 12
    //   1396: aload 8
    //   1398: astore 13
    //   1400: new 296	java/lang/StringBuilder
    //   1403: astore_1
    //   1404: aload 9
    //   1406: astore 12
    //   1408: aload 8
    //   1410: astore 13
    //   1412: aload_1
    //   1413: invokespecial 297	java/lang/StringBuilder:<init>	()V
    //   1416: aload 9
    //   1418: astore 12
    //   1420: aload 8
    //   1422: astore 13
    //   1424: aload_1
    //   1425: aload 9
    //   1427: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1430: astore 6
    //   1432: aload 9
    //   1434: astore 12
    //   1436: aload 8
    //   1438: astore 13
    //   1440: aload 19
    //   1442: getfield 690	com/tencent/mm/sdk/platformtools/at$a:tzt	Ljava/lang/String;
    //   1445: invokestatic 205	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1448: ifeq +94 -> 1542
    //   1451: ldc_w 692
    //   1454: astore_1
    //   1455: aload 9
    //   1457: astore 12
    //   1459: aload 8
    //   1461: astore 13
    //   1463: aload 6
    //   1465: aload_1
    //   1466: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1469: invokevirtual 325	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1472: astore_1
    //   1473: iinc 11 1
    //   1476: aload 7
    //   1478: astore 13
    //   1480: goto -624 -> 856
    //   1483: astore 9
    //   1485: ldc 103
    //   1487: astore 8
    //   1489: ldc 116
    //   1491: ldc_w 694
    //   1494: iconst_1
    //   1495: anewarray 4	java/lang/Object
    //   1498: dup
    //   1499: iconst_0
    //   1500: aload 9
    //   1502: invokestatic 193	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1505: aastore
    //   1506: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1509: aload 8
    //   1511: astore 16
    //   1513: aload_1
    //   1514: astore 14
    //   1516: goto -773 -> 743
    //   1519: astore_1
    //   1520: ldc 116
    //   1522: ldc_w 622
    //   1525: iconst_1
    //   1526: anewarray 4	java/lang/Object
    //   1529: dup
    //   1530: iconst_0
    //   1531: aload_1
    //   1532: invokestatic 193	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1535: aastore
    //   1536: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1539: goto -747 -> 792
    //   1542: aload 9
    //   1544: astore 12
    //   1546: aload 8
    //   1548: astore 13
    //   1550: aload 19
    //   1552: getfield 690	com/tencent/mm/sdk/platformtools/at$a:tzt	Ljava/lang/String;
    //   1555: astore_1
    //   1556: goto -101 -> 1455
    //   1559: aload 8
    //   1561: astore 7
    //   1563: aload 13
    //   1565: astore 8
    //   1567: aload 4
    //   1569: astore 9
    //   1571: aload 7
    //   1573: astore 13
    //   1575: ldc 116
    //   1577: ldc_w 696
    //   1580: iconst_3
    //   1581: anewarray 4	java/lang/Object
    //   1584: dup
    //   1585: iconst_0
    //   1586: aload_2
    //   1587: aastore
    //   1588: dup
    //   1589: iconst_1
    //   1590: aload 8
    //   1592: aastore
    //   1593: dup
    //   1594: iconst_2
    //   1595: aload 9
    //   1597: aastore
    //   1598: invokestatic 215	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1601: new 296	java/lang/StringBuilder
    //   1604: dup
    //   1605: invokespecial 297	java/lang/StringBuilder:<init>	()V
    //   1608: astore 4
    //   1610: aload 4
    //   1612: invokestatic 699	com/tencent/mm/sdk/platformtools/bo:anT	()J
    //   1615: invokevirtual 314	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1618: ldc_w 308
    //   1621: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1624: pop
    //   1625: aload 4
    //   1627: iload_0
    //   1628: invokevirtual 311	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1631: ldc_w 308
    //   1634: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1637: pop
    //   1638: aload 4
    //   1640: iload_3
    //   1641: invokevirtual 311	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1644: ldc_w 308
    //   1647: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1650: pop
    //   1651: aload 4
    //   1653: aload 14
    //   1655: ldc_w 308
    //   1658: ldc_w 637
    //   1661: invokevirtual 635	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1664: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1667: ldc_w 308
    //   1670: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1673: pop
    //   1674: aload 4
    //   1676: aload 16
    //   1678: ldc_w 308
    //   1681: ldc_w 637
    //   1684: invokevirtual 635	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1687: invokestatic 702	com/tencent/mm/modelstat/o:tJ	(Ljava/lang/String;)Ljava/lang/String;
    //   1690: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1693: ldc_w 308
    //   1696: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1699: pop
    //   1700: aload 4
    //   1702: aload 17
    //   1704: ldc_w 308
    //   1707: ldc_w 637
    //   1710: invokevirtual 635	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1713: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1716: ldc_w 308
    //   1719: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1722: pop
    //   1723: aload 4
    //   1725: aload_2
    //   1726: ldc_w 308
    //   1729: ldc_w 637
    //   1732: invokevirtual 635	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1735: invokestatic 702	com/tencent/mm/modelstat/o:tJ	(Ljava/lang/String;)Ljava/lang/String;
    //   1738: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1741: ldc_w 308
    //   1744: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1747: pop
    //   1748: aload 4
    //   1750: aload 8
    //   1752: ldc_w 308
    //   1755: ldc_w 637
    //   1758: invokevirtual 635	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1761: invokestatic 702	com/tencent/mm/modelstat/o:tJ	(Ljava/lang/String;)Ljava/lang/String;
    //   1764: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1767: ldc_w 308
    //   1770: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1773: pop
    //   1774: aload 4
    //   1776: aload 9
    //   1778: ldc_w 308
    //   1781: ldc_w 637
    //   1784: invokevirtual 635	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1787: invokestatic 702	com/tencent/mm/modelstat/o:tJ	(Ljava/lang/String;)Ljava/lang/String;
    //   1790: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1793: ldc_w 308
    //   1796: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1799: pop
    //   1800: invokestatic 704	com/tencent/mm/modelstat/o:ako	()J
    //   1803: lstore 20
    //   1805: lload 20
    //   1807: lconst_0
    //   1808: lcmp
    //   1809: ifge +40 -> 1849
    //   1812: aconst_null
    //   1813: astore_1
    //   1814: ldc_w 553
    //   1817: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1820: goto -1734 -> 86
    //   1823: astore_2
    //   1824: ldc 116
    //   1826: ldc_w 622
    //   1829: iconst_1
    //   1830: anewarray 4	java/lang/Object
    //   1833: dup
    //   1834: iconst_0
    //   1835: aload_2
    //   1836: invokestatic 193	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1839: aastore
    //   1840: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1843: aload 4
    //   1845: astore_2
    //   1846: goto -271 -> 1575
    //   1849: new 296	java/lang/StringBuilder
    //   1852: dup
    //   1853: invokespecial 297	java/lang/StringBuilder:<init>	()V
    //   1856: lload 20
    //   1858: invokevirtual 314	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1861: ldc_w 308
    //   1864: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1867: aload 4
    //   1869: invokevirtual 325	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1872: invokevirtual 301	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1875: invokevirtual 325	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1878: astore 4
    //   1880: aload 5
    //   1882: invokestatic 702	com/tencent/mm/modelstat/o:tJ	(Ljava/lang/String;)Ljava/lang/String;
    //   1885: astore 8
    //   1887: aload 13
    //   1889: invokestatic 702	com/tencent/mm/modelstat/o:tJ	(Ljava/lang/String;)Ljava/lang/String;
    //   1892: astore 9
    //   1894: aload_1
    //   1895: invokestatic 702	com/tencent/mm/modelstat/o:tJ	(Ljava/lang/String;)Ljava/lang/String;
    //   1898: astore_1
    //   1899: ldc_w 553
    //   1902: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1905: iconst_4
    //   1906: anewarray 340	java/lang/String
    //   1909: dup
    //   1910: iconst_0
    //   1911: aload 4
    //   1913: aastore
    //   1914: dup
    //   1915: iconst_1
    //   1916: aload 8
    //   1918: aastore
    //   1919: dup
    //   1920: iconst_2
    //   1921: aload 9
    //   1923: aastore
    //   1924: dup
    //   1925: iconst_3
    //   1926: aload_1
    //   1927: aastore
    //   1928: astore_1
    //   1929: goto -1843 -> 86
    //   1932: astore 6
    //   1934: aload 12
    //   1936: astore_1
    //   1937: aload 4
    //   1939: astore 9
    //   1941: aload 7
    //   1943: astore 8
    //   1945: aload_2
    //   1946: astore 4
    //   1948: aload 6
    //   1950: astore_2
    //   1951: goto -127 -> 1824
    //   1954: astore_2
    //   1955: aload 8
    //   1957: astore 13
    //   1959: aload 6
    //   1961: astore 8
    //   1963: aload 12
    //   1965: astore 4
    //   1967: goto -143 -> 1824
    //   1970: astore 9
    //   1972: aload_1
    //   1973: astore 8
    //   1975: aload 4
    //   1977: astore_1
    //   1978: goto -489 -> 1489
    //   1981: aload 8
    //   1983: astore 9
    //   1985: goto -731 -> 1254
    //   1988: ldc 103
    //   1990: astore_1
    //   1991: goto -1202 -> 789
    //
    // Exception table:
    //   from	to	target	type
    //   154	158	458	java/lang/Exception
    //   188	199	1483	java/lang/Exception
    //   202	207	1483	java/lang/Exception
    //   210	215	1483	java/lang/Exception
    //   218	223	1483	java/lang/Exception
    //   226	231	1483	java/lang/Exception
    //   234	239	1483	java/lang/Exception
    //   242	247	1483	java/lang/Exception
    //   256	261	1483	java/lang/Exception
    //   264	269	1483	java/lang/Exception
    //   272	284	1483	java/lang/Exception
    //   287	299	1483	java/lang/Exception
    //   302	310	1483	java/lang/Exception
    //   313	321	1483	java/lang/Exception
    //   324	331	1483	java/lang/Exception
    //   339	344	1483	java/lang/Exception
    //   347	352	1483	java/lang/Exception
    //   355	362	1483	java/lang/Exception
    //   365	374	1483	java/lang/Exception
    //   385	395	1483	java/lang/Exception
    //   398	410	1483	java/lang/Exception
    //   418	429	1483	java/lang/Exception
    //   432	445	1483	java/lang/Exception
    //   448	455	1483	java/lang/Exception
    //   495	504	1483	java/lang/Exception
    //   507	537	1483	java/lang/Exception
    //   540	549	1483	java/lang/Exception
    //   552	582	1483	java/lang/Exception
    //   585	596	1483	java/lang/Exception
    //   599	608	1483	java/lang/Exception
    //   611	622	1483	java/lang/Exception
    //   638	646	1483	java/lang/Exception
    //   649	668	1483	java/lang/Exception
    //   682	689	1483	java/lang/Exception
    //   692	699	1483	java/lang/Exception
    //   769	780	1519	java/lang/Exception
    //   784	789	1519	java/lang/Exception
    //   828	834	1823	java/lang/Exception
    //   1265	1276	1932	java/lang/Exception
    //   1283	1288	1932	java/lang/Exception
    //   1295	1300	1932	java/lang/Exception
    //   1307	1327	1932	java/lang/Exception
    //   1337	1344	1932	java/lang/Exception
    //   1351	1356	1932	java/lang/Exception
    //   1363	1368	1932	java/lang/Exception
    //   1375	1392	1932	java/lang/Exception
    //   1400	1404	1932	java/lang/Exception
    //   1412	1416	1932	java/lang/Exception
    //   1424	1432	1932	java/lang/Exception
    //   1440	1451	1932	java/lang/Exception
    //   1463	1473	1932	java/lang/Exception
    //   1550	1556	1932	java/lang/Exception
    //   867	879	1954	java/lang/Exception
    //   890	904	1954	java/lang/Exception
    //   915	926	1954	java/lang/Exception
    //   937	949	1954	java/lang/Exception
    //   964	972	1954	java/lang/Exception
    //   987	998	1954	java/lang/Exception
    //   1009	1014	1954	java/lang/Exception
    //   1025	1030	1954	java/lang/Exception
    //   1041	1059	1954	java/lang/Exception
    //   1074	1085	1954	java/lang/Exception
    //   1096	1101	1954	java/lang/Exception
    //   1112	1117	1954	java/lang/Exception
    //   1128	1148	1954	java/lang/Exception
    //   1159	1167	1954	java/lang/Exception
    //   1178	1189	1954	java/lang/Exception
    //   1200	1205	1954	java/lang/Exception
    //   1216	1221	1954	java/lang/Exception
    //   1232	1250	1954	java/lang/Exception
    //   702	732	1970	java/lang/Exception
  }

  // ERROR //
  public static void mg(int paramInt)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc_w 706
    //   6: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: ldc 116
    //   11: ldc_w 708
    //   14: iconst_4
    //   15: anewarray 4	java/lang/Object
    //   18: dup
    //   19: iconst_0
    //   20: iload_0
    //   21: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   24: aastore
    //   25: dup
    //   26: iconst_1
    //   27: getstatic 320	com/tencent/mm/sdk/a/b:foreground	Z
    //   30: invokestatic 560	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   33: aastore
    //   34: dup
    //   35: iconst_2
    //   36: getstatic 91	com/tencent/mm/modelstat/o:fTV	J
    //   39: invokestatic 152	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   42: aastore
    //   43: dup
    //   44: iconst_3
    //   45: getstatic 105	com/tencent/mm/modelstat/o:fUb	Ljava/lang/String;
    //   48: aastore
    //   49: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   52: iload_0
    //   53: sipush 1005
    //   56: if_icmpne +141 -> 197
    //   59: getstatic 91	com/tencent/mm/modelstat/o:fTV	J
    //   62: lconst_0
    //   63: lcmp
    //   64: ifle +133 -> 197
    //   67: ldc 116
    //   69: ldc_w 710
    //   72: bipush 6
    //   74: anewarray 4	java/lang/Object
    //   77: dup
    //   78: iconst_0
    //   79: iload_0
    //   80: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   83: aastore
    //   84: dup
    //   85: iconst_1
    //   86: getstatic 99	com/tencent/mm/modelstat/o:fTZ	I
    //   89: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   92: aastore
    //   93: dup
    //   94: iconst_2
    //   95: getstatic 95	com/tencent/mm/modelstat/o:fTX	F
    //   98: invokestatic 129	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   101: aastore
    //   102: dup
    //   103: iconst_3
    //   104: getstatic 93	com/tencent/mm/modelstat/o:fTW	F
    //   107: invokestatic 129	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   110: aastore
    //   111: dup
    //   112: iconst_4
    //   113: getstatic 97	com/tencent/mm/modelstat/o:fTY	I
    //   116: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   119: aastore
    //   120: dup
    //   121: iconst_5
    //   122: getstatic 91	com/tencent/mm/modelstat/o:fTV	J
    //   125: invokestatic 152	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   128: aastore
    //   129: invokestatic 215	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: getstatic 91	com/tencent/mm/modelstat/o:fTV	J
    //   135: invokestatic 141	com/tencent/mm/sdk/platformtools/bo:gb	(J)J
    //   138: lstore_1
    //   139: getstatic 99	com/tencent/mm/modelstat/o:fTZ	I
    //   142: istore_3
    //   143: getstatic 93	com/tencent/mm/modelstat/o:fTW	F
    //   146: fstore 4
    //   148: getstatic 95	com/tencent/mm/modelstat/o:fTX	F
    //   151: fstore 5
    //   153: getstatic 97	com/tencent/mm/modelstat/o:fTY	I
    //   156: istore_0
    //   157: lconst_0
    //   158: putstatic 91	com/tencent/mm/modelstat/o:fTV	J
    //   161: fconst_0
    //   162: putstatic 93	com/tencent/mm/modelstat/o:fTW	F
    //   165: fconst_0
    //   166: putstatic 95	com/tencent/mm/modelstat/o:fTX	F
    //   169: iconst_0
    //   170: putstatic 97	com/tencent/mm/modelstat/o:fTY	I
    //   173: iconst_0
    //   174: putstatic 99	com/tencent/mm/modelstat/o:fTZ	I
    //   177: iload_3
    //   178: fload 5
    //   180: fload 4
    //   182: iload_0
    //   183: lload_1
    //   184: invokestatic 712	com/tencent/mm/modelstat/o:b	(IFFIJ)V
    //   187: ldc_w 706
    //   190: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   193: ldc 2
    //   195: monitorexit
    //   196: return
    //   197: getstatic 320	com/tencent/mm/sdk/a/b:foreground	Z
    //   200: ifne +39 -> 239
    //   203: ldc 116
    //   205: ldc_w 714
    //   208: iconst_1
    //   209: anewarray 4	java/lang/Object
    //   212: dup
    //   213: iconst_0
    //   214: iload_0
    //   215: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   218: aastore
    //   219: invokestatic 646	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   222: ldc_w 706
    //   225: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   228: goto -35 -> 193
    //   231: astore 6
    //   233: ldc 2
    //   235: monitorexit
    //   236: aload 6
    //   238: athrow
    //   239: iload_0
    //   240: iconst_3
    //   241: if_icmpne +93 -> 334
    //   244: invokestatic 164	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   247: ldc 166
    //   249: invokevirtual 172	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   252: checkcast 174	android/net/wifi/WifiManager
    //   255: invokevirtual 718	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   258: invokevirtual 723	android/net/wifi/WifiInfo:getBSSID	()Ljava/lang/String;
    //   261: astore 6
    //   263: ldc 116
    //   265: ldc_w 725
    //   268: iconst_3
    //   269: anewarray 4	java/lang/Object
    //   272: dup
    //   273: iconst_0
    //   274: iload_0
    //   275: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   278: aastore
    //   279: dup
    //   280: iconst_1
    //   281: aload 6
    //   283: aastore
    //   284: dup
    //   285: iconst_2
    //   286: getstatic 105	com/tencent/mm/modelstat/o:fUb	Ljava/lang/String;
    //   289: aastore
    //   290: invokestatic 215	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   293: aload 6
    //   295: invokestatic 205	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   298: ifne +27 -> 325
    //   301: aload 6
    //   303: getstatic 105	com/tencent/mm/modelstat/o:fUb	Ljava/lang/String;
    //   306: invokevirtual 617	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   309: ifne +16 -> 325
    //   312: aload 6
    //   314: putstatic 105	com/tencent/mm/modelstat/o:fUb	Ljava/lang/String;
    //   317: iload_0
    //   318: fconst_0
    //   319: fconst_0
    //   320: iconst_0
    //   321: lconst_0
    //   322: invokestatic 712	com/tencent/mm/modelstat/o:b	(IFFIJ)V
    //   325: ldc_w 706
    //   328: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   331: goto -138 -> 193
    //   334: iload_0
    //   335: iconst_4
    //   336: if_icmpne +78 -> 414
    //   339: invokestatic 352	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   342: invokevirtual 358	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   345: getstatic 728	com/tencent/mm/storage/ac$a:xJL	Lcom/tencent/mm/storage/ac$a;
    //   348: aconst_null
    //   349: invokevirtual 370	com/tencent/mm/storage/z:get	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)Ljava/lang/Object;
    //   352: checkcast 149	java/lang/Long
    //   355: lconst_0
    //   356: invokestatic 373	com/tencent/mm/sdk/platformtools/bo:a	(Ljava/lang/Long;J)J
    //   359: invokestatic 141	com/tencent/mm/sdk/platformtools/bo:gb	(J)J
    //   362: lstore_1
    //   363: ldc 116
    //   365: ldc_w 730
    //   368: iconst_2
    //   369: anewarray 4	java/lang/Object
    //   372: dup
    //   373: iconst_0
    //   374: iload_0
    //   375: invokestatic 124	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   378: aastore
    //   379: dup
    //   380: iconst_1
    //   381: lload_1
    //   382: invokestatic 152	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   385: aastore
    //   386: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   389: lload_1
    //   390: ldc2_w 731
    //   393: lcmp
    //   394: iflt +11 -> 405
    //   397: iload_0
    //   398: fconst_0
    //   399: fconst_0
    //   400: iconst_0
    //   401: lconst_0
    //   402: invokestatic 712	com/tencent/mm/modelstat/o:b	(IFFIJ)V
    //   405: ldc_w 706
    //   408: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   411: goto -218 -> 193
    //   414: iload_0
    //   415: fconst_0
    //   416: fconst_0
    //   417: iconst_0
    //   418: lconst_0
    //   419: invokestatic 712	com/tencent/mm/modelstat/o:b	(IFFIJ)V
    //   422: ldc_w 706
    //   425: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   428: goto -235 -> 193
    //   431: astore 6
    //   433: ldc 116
    //   435: ldc_w 734
    //   438: iconst_1
    //   439: anewarray 4	java/lang/Object
    //   442: dup
    //   443: iconst_0
    //   444: aload 6
    //   446: invokestatic 193	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   449: aastore
    //   450: invokestatic 135	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   453: ldc_w 706
    //   456: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   459: goto -266 -> 193
    //
    // Exception table:
    //   from	to	target	type
    //   3	52	231	finally
    //   59	187	231	finally
    //   187	193	231	finally
    //   197	222	231	finally
    //   222	228	231	finally
    //   244	325	231	finally
    //   325	331	231	finally
    //   339	389	231	finally
    //   397	405	231	finally
    //   405	411	231	finally
    //   414	422	231	finally
    //   422	428	231	finally
    //   433	459	231	finally
    //   59	187	431	java/lang/Throwable
    //   197	222	431	java/lang/Throwable
    //   244	325	431	java/lang/Throwable
    //   339	389	431	java/lang/Throwable
    //   397	405	431	java/lang/Throwable
    //   414	422	431	java/lang/Throwable
  }

  private static String tJ(String paramString)
  {
    AppMethodBeat.i(78776);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = "";
      AppMethodBeat.o(78776);
    }
    while (true)
    {
      return paramString;
      char[] arrayOfChar = paramString.toCharArray();
      int i = arrayOfChar.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label132;
        int k = arrayOfChar[j];
        if (((k < 97) || (k > 122)) && ((k < 65) || (k > 90)) && ((k < 48) || (k > 57)) && (k != 124) && (k != 45) && (k != 32) && (k != 58))
        {
          paramString = "";
          AppMethodBeat.o(78776);
          break;
        }
      }
      label132: AppMethodBeat.o(78776);
    }
  }

  public static void y(int paramInt, String paramString)
  {
    AppMethodBeat.i(78779);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bpu();
    ((b.a)localObject).fsK = new bpv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rtkvreport";
    ((b.a)localObject).fsI = 716;
    localObject = ((b.a)localObject).acD();
    bpu localbpu = (bpu)((com.tencent.mm.ai.b)localObject).fsG.fsP;
    localbpu.vOz = d.vxj;
    localbpu.vOA = d.vxi;
    localbpu.vOB = d.vxl;
    localbpu.vOC = d.vxm;
    localbpu.vOD = aa.dor();
    localbpu.wBd = paramInt;
    localbpu.pXM = paramString;
    ab.i("MicroMsg.NetTypeReporter", "reportCgi logId:%d, value:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    w.a((com.tencent.mm.ai.b)localObject, new o.3(bo.anU(), localbpu));
    AppMethodBeat.o(78779);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.o
 * JD-Core Version:    0.6.2
 */