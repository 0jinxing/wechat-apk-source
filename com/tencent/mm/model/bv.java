package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.axd;
import com.tencent.mm.protocal.protobuf.axe;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class bv
{
  public static final int fnu;
  public static final int fnv;
  public static final int fnw;
  private static bv fnz;
  private long fnx;
  private Map<Integer, bv.a> fny;

  static
  {
    AppMethodBeat.i(72649);
    int i = "kv_key_start".hashCode();
    fnu = i;
    fnv = i + 1;
    fnw = fnu + 2;
    AppMethodBeat.o(72649);
  }

  private bv()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 51	java/lang/Object:<init>	()V
    //   4: ldc 52
    //   6: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: lconst_0
    //   11: putfield 54	com/tencent/mm/model/bv:fnx	J
    //   14: aload_0
    //   15: new 56	java/util/HashMap
    //   18: dup
    //   19: invokespecial 57	java/util/HashMap:<init>	()V
    //   22: putfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   25: aload_0
    //   26: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   29: getstatic 42	com/tencent/mm/model/bv:fnv	I
    //   32: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   35: new 67	com/tencent/mm/model/bv$1
    //   38: dup
    //   39: aload_0
    //   40: invokespecial 70	com/tencent/mm/model/bv$1:<init>	(Lcom/tencent/mm/model/bv;)V
    //   43: invokeinterface 76 3 0
    //   48: pop
    //   49: aload_0
    //   50: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   53: getstatic 44	com/tencent/mm/model/bv:fnw	I
    //   56: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   59: new 78	com/tencent/mm/model/bv$12
    //   62: dup
    //   63: aload_0
    //   64: invokespecial 79	com/tencent/mm/model/bv$12:<init>	(Lcom/tencent/mm/model/bv;)V
    //   67: invokeinterface 76 3 0
    //   72: pop
    //   73: aload_0
    //   74: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   77: bipush 24
    //   79: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   82: new 6	com/tencent/mm/model/bv$16
    //   85: dup
    //   86: aload_0
    //   87: invokespecial 80	com/tencent/mm/model/bv$16:<init>	(Lcom/tencent/mm/model/bv;)V
    //   90: invokeinterface 76 3 0
    //   95: pop
    //   96: aload_0
    //   97: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   100: bipush 25
    //   102: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   105: new 82	com/tencent/mm/model/bv$17
    //   108: dup
    //   109: aload_0
    //   110: invokespecial 83	com/tencent/mm/model/bv$17:<init>	(Lcom/tencent/mm/model/bv;)V
    //   113: invokeinterface 76 3 0
    //   118: pop
    //   119: aload_0
    //   120: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   123: bipush 26
    //   125: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   128: new 85	com/tencent/mm/model/bv$18
    //   131: dup
    //   132: aload_0
    //   133: invokespecial 86	com/tencent/mm/model/bv$18:<init>	(Lcom/tencent/mm/model/bv;)V
    //   136: invokeinterface 76 3 0
    //   141: pop
    //   142: aload_0
    //   143: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   146: sipush 10071
    //   149: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   152: new 8	com/tencent/mm/model/bv$19
    //   155: dup
    //   156: aload_0
    //   157: invokespecial 87	com/tencent/mm/model/bv$19:<init>	(Lcom/tencent/mm/model/bv;)V
    //   160: invokeinterface 76 3 0
    //   165: pop
    //   166: aload_0
    //   167: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   170: sipush 10076
    //   173: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   176: new 89	com/tencent/mm/model/bv$20
    //   179: dup
    //   180: aload_0
    //   181: invokespecial 90	com/tencent/mm/model/bv$20:<init>	(Lcom/tencent/mm/model/bv;)V
    //   184: invokeinterface 76 3 0
    //   189: pop
    //   190: aload_0
    //   191: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   194: bipush 19
    //   196: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   199: new 92	com/tencent/mm/model/bv$21
    //   202: dup
    //   203: aload_0
    //   204: invokespecial 93	com/tencent/mm/model/bv$21:<init>	(Lcom/tencent/mm/model/bv;)V
    //   207: invokeinterface 76 3 0
    //   212: pop
    //   213: aload_0
    //   214: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   217: sipush 10112
    //   220: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   223: new 95	com/tencent/mm/model/bv$22
    //   226: dup
    //   227: aload_0
    //   228: invokespecial 96	com/tencent/mm/model/bv$22:<init>	(Lcom/tencent/mm/model/bv;)V
    //   231: invokeinterface 76 3 0
    //   236: pop
    //   237: aload_0
    //   238: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   241: sipush 10113
    //   244: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   247: new 98	com/tencent/mm/model/bv$2
    //   250: dup
    //   251: aload_0
    //   252: invokespecial 99	com/tencent/mm/model/bv$2:<init>	(Lcom/tencent/mm/model/bv;)V
    //   255: invokeinterface 76 3 0
    //   260: pop
    //   261: aload_0
    //   262: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   265: sipush 10114
    //   268: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   271: new 101	com/tencent/mm/model/bv$3
    //   274: dup
    //   275: aload_0
    //   276: invokespecial 102	com/tencent/mm/model/bv$3:<init>	(Lcom/tencent/mm/model/bv;)V
    //   279: invokeinterface 76 3 0
    //   284: pop
    //   285: aload_0
    //   286: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   289: sipush 10115
    //   292: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   295: new 104	com/tencent/mm/model/bv$4
    //   298: dup
    //   299: aload_0
    //   300: invokespecial 105	com/tencent/mm/model/bv$4:<init>	(Lcom/tencent/mm/model/bv;)V
    //   303: invokeinterface 76 3 0
    //   308: pop
    //   309: aload_0
    //   310: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   313: sipush 10240
    //   316: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   319: new 107	com/tencent/mm/model/bv$5
    //   322: dup
    //   323: aload_0
    //   324: invokespecial 108	com/tencent/mm/model/bv$5:<init>	(Lcom/tencent/mm/model/bv;)V
    //   327: invokeinterface 76 3 0
    //   332: pop
    //   333: aload_0
    //   334: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   337: sipush 10241
    //   340: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   343: new 110	com/tencent/mm/model/bv$6
    //   346: dup
    //   347: aload_0
    //   348: invokespecial 111	com/tencent/mm/model/bv$6:<init>	(Lcom/tencent/mm/model/bv;)V
    //   351: invokeinterface 76 3 0
    //   356: pop
    //   357: aload_0
    //   358: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   361: bipush 15
    //   363: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   366: new 113	com/tencent/mm/model/bv$7
    //   369: dup
    //   370: aload_0
    //   371: invokespecial 114	com/tencent/mm/model/bv$7:<init>	(Lcom/tencent/mm/model/bv;)V
    //   374: invokeinterface 76 3 0
    //   379: pop
    //   380: aload_0
    //   381: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   384: bipush 16
    //   386: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   389: new 116	com/tencent/mm/model/bv$8
    //   392: dup
    //   393: aload_0
    //   394: invokespecial 117	com/tencent/mm/model/bv$8:<init>	(Lcom/tencent/mm/model/bv;)V
    //   397: invokeinterface 76 3 0
    //   402: pop
    //   403: aload_0
    //   404: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   407: bipush 27
    //   409: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   412: new 119	com/tencent/mm/model/bv$9
    //   415: dup
    //   416: aload_0
    //   417: invokespecial 120	com/tencent/mm/model/bv$9:<init>	(Lcom/tencent/mm/model/bv;)V
    //   420: invokeinterface 76 3 0
    //   425: pop
    //   426: aload_0
    //   427: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   430: bipush 38
    //   432: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   435: new 122	com/tencent/mm/model/bv$10
    //   438: dup
    //   439: aload_0
    //   440: invokespecial 123	com/tencent/mm/model/bv$10:<init>	(Lcom/tencent/mm/model/bv;)V
    //   443: invokeinterface 76 3 0
    //   448: pop
    //   449: aload_0
    //   450: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   453: sipush 10090
    //   456: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   459: new 125	com/tencent/mm/model/bv$11
    //   462: dup
    //   463: aload_0
    //   464: invokespecial 126	com/tencent/mm/model/bv$11:<init>	(Lcom/tencent/mm/model/bv;)V
    //   467: invokeinterface 76 3 0
    //   472: pop
    //   473: aload_0
    //   474: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   477: sipush 10237
    //   480: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   483: new 128	com/tencent/mm/model/bv$13
    //   486: dup
    //   487: aload_0
    //   488: invokespecial 129	com/tencent/mm/model/bv$13:<init>	(Lcom/tencent/mm/model/bv;)V
    //   491: invokeinterface 76 3 0
    //   496: pop
    //   497: aload_0
    //   498: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   501: sipush 10238
    //   504: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   507: new 131	com/tencent/mm/model/bv$14
    //   510: dup
    //   511: aload_0
    //   512: invokespecial 132	com/tencent/mm/model/bv$14:<init>	(Lcom/tencent/mm/model/bv;)V
    //   515: invokeinterface 76 3 0
    //   520: pop
    //   521: aload_0
    //   522: getfield 59	com/tencent/mm/model/bv:fny	Ljava/util/Map;
    //   525: sipush 10239
    //   528: invokestatic 65	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   531: new 134	com/tencent/mm/model/bv$15
    //   534: dup
    //   535: aload_0
    //   536: invokespecial 135	com/tencent/mm/model/bv$15:<init>	(Lcom/tencent/mm/model/bv;)V
    //   539: invokeinterface 76 3 0
    //   544: pop
    //   545: ldc 52
    //   547: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   550: return
  }

  private static void a(bu parambu)
  {
    AppMethodBeat.i(72648);
    if ((parambu != null) && (g.RN().QY()) && (g.RP().Ry() != null))
    {
      g.RN();
      if (a.QT());
    }
    while (true)
    {
      try
      {
        g.RP().Ry().set(8215, bo.cd(parambu.toByteArray()));
        AppMethodBeat.o(72648);
        return;
      }
      catch (IOException parambu)
      {
        ab.e("MicroMsg.StatisticsKVReportLogic", "exception:%s", new Object[] { bo.l(parambu) });
      }
      AppMethodBeat.o(72648);
    }
  }

  public static bv aaq()
  {
    AppMethodBeat.i(72642);
    if (fnz == null)
      fnz = new bv();
    bv localbv = fnz;
    AppMethodBeat.o(72642);
    return localbv;
  }

  private static bu aas()
  {
    AppMethodBeat.i(72647);
    byte[] arrayOfByte;
    bu localbu1;
    if (g.RN().QY())
    {
      g.RN();
      if ((!a.QT()) && (g.RP().Ry() != null))
      {
        arrayOfByte = bo.anf((String)g.RP().Ry().get(8215, null));
        if (arrayOfByte.length <= 0)
        {
          localbu1 = new bu();
          AppMethodBeat.o(72647);
        }
      }
    }
    while (true)
    {
      return localbu1;
      try
      {
        localbu1 = new com/tencent/mm/model/bu;
        localbu1.<init>();
        localbu1.parseFrom(arrayOfByte);
        AppMethodBeat.o(72647);
      }
      catch (IOException localIOException)
      {
        ab.e("MicroMsg.StatisticsKVReportLogic", "exception:%s", new Object[] { bo.l(localIOException) });
      }
      bu localbu2 = new bu();
      AppMethodBeat.o(72647);
    }
  }

  public static void b(LinkedList<axd> paramLinkedList)
  {
    AppMethodBeat.i(72644);
    if (g.RN().QY())
    {
      g.RN();
      if (!a.QT())
      {
        axe localaxe = new axe();
        localaxe.jBw = paramLinkedList;
        localaxe.jBv = paramLinkedList.size();
        ((j)g.K(j.class)).XL().c(new j.a(36, localaxe));
      }
    }
    AppMethodBeat.o(72644);
  }

  public static void s(int paramInt, String paramString)
  {
    AppMethodBeat.i(72643);
    LinkedList localLinkedList = new LinkedList();
    axd localaxd = new axd();
    localaxd.pXC = paramInt;
    localaxd.pXM = paramString;
    localLinkedList.add(localaxd);
    b(localLinkedList);
    AppMethodBeat.o(72643);
  }

  public final void aar()
  {
    AppMethodBeat.i(72646);
    if (System.currentTimeMillis() - this.fnx < 60000L)
    {
      AppMethodBeat.o(72646);
      return;
    }
    this.fnx = System.currentTimeMillis();
    label158: 
    while (true)
    {
      try
      {
        bu localbu = aas();
        Iterator localIterator = localbu.fnt.iterator();
        int i = 0;
        if (localIterator.hasNext())
        {
          bt localbt = (bt)localIterator.next();
          bv.a locala = (bv.a)this.fny.get(Integer.valueOf(localbt.key));
          if ((locala == null) || (!locala.a(localbt)))
            break label158;
          i = 1;
          continue;
        }
        if (i != 0)
          a(localbu);
        AppMethodBeat.o(72646);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.StatisticsKVReportLogic", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(72646);
      }
      break;
    }
  }

  public final void c(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72645);
    bv.a locala = (bv.a)this.fny.get(Integer.valueOf(paramInt));
    if (locala == null)
    {
      AppMethodBeat.o(72645);
      return;
    }
    bu localbu = aas();
    Iterator localIterator = localbu.fnt.iterator();
    while (localIterator.hasNext())
    {
      bt localbt = (bt)localIterator.next();
      if (localbt.key == paramInt)
        locala.a(localbt, paramArrayOfObject);
    }
    while (true)
    {
      a(localbu);
      AppMethodBeat.o(72645);
      break;
      localbu.fnt.add(locala.d(paramInt, paramArrayOfObject));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bv
 * JD-Core Version:    0.6.2
 */