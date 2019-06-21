package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.h.a;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.ary;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.bld;
import com.tencent.mm.protocal.protobuf.can;
import com.tencent.mm.protocal.protobuf.cao;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cbb;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbn;
import com.tencent.mm.protocal.protobuf.cbu;
import com.tencent.mm.protocal.protobuf.db;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class aj
{
  private static Map<String, cbf> qMr;

  static
  {
    AppMethodBeat.i(36563);
    qMr = new ConcurrentHashMap();
    AppMethodBeat.o(36563);
  }

  // ERROR //
  public static boolean CY(int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 32
    //   4: invokestatic 16	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: ldc 34
    //   9: ldc 36
    //   11: iload_0
    //   12: invokestatic 42	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   15: invokevirtual 46	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   18: invokestatic 52	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: invokestatic 58	com/tencent/mm/plugin/sns/model/af:cnF	()Lcom/tencent/mm/plugin/sns/storage/o;
    //   24: iload_0
    //   25: invokevirtual 64	com/tencent/mm/plugin/sns/storage/o:DK	(I)Lcom/tencent/mm/plugin/sns/storage/n;
    //   28: astore_2
    //   29: aload_2
    //   30: ifnonnull +10 -> 40
    //   33: ldc 32
    //   35: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   38: iload_1
    //   39: ireturn
    //   40: aload_2
    //   41: invokevirtual 69	com/tencent/mm/plugin/sns/storage/n:cqX	()V
    //   44: aload_2
    //   45: invokestatic 75	java/lang/System:currentTimeMillis	()J
    //   48: ldc2_w 76
    //   51: ldiv
    //   52: l2i
    //   53: invokevirtual 80	com/tencent/mm/plugin/sns/storage/n:ls	(I)V
    //   56: aconst_null
    //   57: astore_3
    //   58: new 82	com/tencent/mm/protocal/protobuf/bav
    //   61: astore 4
    //   63: aload 4
    //   65: invokespecial 83	com/tencent/mm/protocal/protobuf/bav:<init>	()V
    //   68: aload 4
    //   70: aload_2
    //   71: getfield 87	com/tencent/mm/plugin/sns/storage/n:field_postBuf	[B
    //   74: invokevirtual 91	com/tencent/mm/protocal/protobuf/bav:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   77: checkcast 82	com/tencent/mm/protocal/protobuf/bav
    //   80: astore 4
    //   82: aload 4
    //   84: iconst_0
    //   85: putfield 95	com/tencent/mm/protocal/protobuf/bav:eRu	I
    //   88: aload 4
    //   90: invokestatic 75	java/lang/System:currentTimeMillis	()J
    //   93: putfield 99	com/tencent/mm/protocal/protobuf/bav:wFi	J
    //   96: aload_2
    //   97: aload 4
    //   99: invokevirtual 103	com/tencent/mm/protocal/protobuf/bav:toByteArray	()[B
    //   102: putfield 87	com/tencent/mm/plugin/sns/storage/n:field_postBuf	[B
    //   105: aload 4
    //   107: ifnonnull +32 -> 139
    //   110: ldc 32
    //   112: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   115: goto -77 -> 38
    //   118: astore 5
    //   120: aload_3
    //   121: astore 4
    //   123: ldc 34
    //   125: aload 5
    //   127: ldc 105
    //   129: iconst_0
    //   130: anewarray 4	java/lang/Object
    //   133: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: goto -31 -> 105
    //   139: invokestatic 58	com/tencent/mm/plugin/sns/model/af:cnF	()Lcom/tencent/mm/plugin/sns/storage/o;
    //   142: iload_0
    //   143: aload_2
    //   144: invokevirtual 113	com/tencent/mm/plugin/sns/storage/o:b	(ILcom/tencent/mm/plugin/sns/storage/n;)I
    //   147: pop
    //   148: iconst_0
    //   149: istore_0
    //   150: iload_0
    //   151: aload 4
    //   153: getfield 117	com/tencent/mm/protocal/protobuf/bav:wFf	Ljava/util/LinkedList;
    //   156: invokevirtual 123	java/util/LinkedList:size	()I
    //   159: if_icmpge +127 -> 286
    //   162: aload 4
    //   164: getfield 117	com/tencent/mm/protocal/protobuf/bav:wFf	Ljava/util/LinkedList;
    //   167: iload_0
    //   168: invokevirtual 127	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   171: checkcast 129	com/tencent/mm/protocal/protobuf/ayq
    //   174: getfield 132	com/tencent/mm/protocal/protobuf/ayq:wCt	I
    //   177: istore 6
    //   179: invokestatic 136	com/tencent/mm/plugin/sns/model/af:cnu	()Lcom/tencent/mm/plugin/sns/storage/s;
    //   182: iload 6
    //   184: i2l
    //   185: invokevirtual 142	com/tencent/mm/plugin/sns/storage/s:kE	(J)Lcom/tencent/mm/plugin/sns/storage/r;
    //   188: astore 5
    //   190: aload 5
    //   192: ifnull +37 -> 229
    //   195: aload 5
    //   197: iconst_0
    //   198: putfield 147	com/tencent/mm/plugin/sns/storage/r:offset	I
    //   201: new 149	com/tencent/mm/protocal/protobuf/bax
    //   204: astore_3
    //   205: aload_3
    //   206: invokespecial 150	com/tencent/mm/protocal/protobuf/bax:<init>	()V
    //   209: aload_3
    //   210: aload 5
    //   212: getfield 153	com/tencent/mm/plugin/sns/storage/r:rfI	[B
    //   215: invokevirtual 154	com/tencent/mm/protocal/protobuf/bax:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   218: checkcast 149	com/tencent/mm/protocal/protobuf/bax
    //   221: astore_3
    //   222: aload_3
    //   223: getfield 157	com/tencent/mm/protocal/protobuf/bax:wFD	I
    //   226: ifne +9 -> 235
    //   229: iinc 0 1
    //   232: goto -82 -> 150
    //   235: aload_3
    //   236: iconst_2
    //   237: putfield 157	com/tencent/mm/protocal/protobuf/bax:wFD	I
    //   240: aload_3
    //   241: ldc 105
    //   243: putfield 161	com/tencent/mm/protocal/protobuf/bax:wFE	Ljava/lang/String;
    //   246: aload 5
    //   248: aload_3
    //   249: invokevirtual 162	com/tencent/mm/protocal/protobuf/bax:toByteArray	()[B
    //   252: putfield 153	com/tencent/mm/plugin/sns/storage/r:rfI	[B
    //   255: invokestatic 136	com/tencent/mm/plugin/sns/model/af:cnu	()Lcom/tencent/mm/plugin/sns/storage/s;
    //   258: iload 6
    //   260: aload 5
    //   262: invokevirtual 166	com/tencent/mm/plugin/sns/storage/s:a	(ILcom/tencent/mm/plugin/sns/storage/r;)I
    //   265: pop
    //   266: goto -37 -> 229
    //   269: astore 4
    //   271: ldc 34
    //   273: ldc 168
    //   275: invokestatic 171	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   278: ldc 32
    //   280: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   283: goto -245 -> 38
    //   286: iconst_1
    //   287: istore_1
    //   288: ldc 32
    //   290: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   293: goto -255 -> 38
    //   296: astore 5
    //   298: goto -175 -> 123
    //
    // Exception table:
    //   from	to	target	type
    //   58	82	118	java/lang/Exception
    //   201	229	269	java/lang/Exception
    //   235	255	269	java/lang/Exception
    //   82	105	296	java/lang/Exception
  }

  public static n CZ(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(36555);
    n localn = new n();
    Object localObject2 = af.cnF();
    Object localObject3 = o.crm();
    localObject3 = (String)localObject3 + " and createTime < " + paramInt;
    localObject3 = (String)localObject3 + o.rfn;
    localObject3 = (String)localObject3 + " LIMIT 1";
    ab.i("MicroMsg.SnsInfoStorage", "getTimelineByCreateTime sql %s", new Object[] { localObject3 });
    localObject3 = ((o)localObject2).bSd.rawQuery((String)localObject3, null);
    localObject2 = localObject3;
    if (localObject3 == null)
      localObject2 = null;
    if (localObject2 == null)
    {
      AppMethodBeat.o(36555);
      localObject2 = localObject1;
    }
    while (true)
    {
      return localObject2;
      if (((Cursor)localObject2).moveToFirst())
      {
        localn.d((Cursor)localObject2);
        ((Cursor)localObject2).close();
        AppMethodBeat.o(36555);
        localObject2 = localn;
      }
      else
      {
        ((Cursor)localObject2).close();
        AppMethodBeat.o(36555);
        localObject2 = localObject1;
      }
    }
  }

  public static void Da(int paramInt)
  {
    AppMethodBeat.i(36561);
    ab.d("MicroMsg.SnsInfoStorageLogic", "unsetOmitResendFlag localId　".concat(String.valueOf(paramInt)));
    n localn = af.cnF().DK(paramInt);
    if (localn == null)
    {
      AppMethodBeat.o(36561);
      return;
    }
    if ((localn.field_localFlag & 0x40) > 0);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        localn.field_localFlag &= -65;
      af.cnF().b(paramInt, localn);
      AppMethodBeat.o(36561);
      break;
    }
  }

  public static n XX(String paramString)
  {
    AppMethodBeat.i(36539);
    Cursor localCursor = af.cnF().b(paramString, 1, false, "");
    if (localCursor.getCount() == 0)
    {
      localCursor.close();
      paramString = null;
      AppMethodBeat.o(36539);
    }
    while (true)
    {
      return paramString;
      localCursor.moveToFirst();
      paramString = new n();
      paramString.d(localCursor);
      if (!localCursor.isClosed())
        localCursor.close();
      AppMethodBeat.o(36539);
    }
  }

  public static boolean XY(String paramString)
  {
    AppMethodBeat.i(36552);
    boolean bool = r.Yz().equals(paramString.trim());
    AppMethodBeat.o(36552);
    return bool;
  }

  public static String XZ(String paramString)
  {
    AppMethodBeat.i(36554);
    int i = 1;
    LinkedList localLinkedList = new LinkedList();
    Object localObject = af.cnL().getCursor();
    if (((Cursor)localObject).moveToFirst())
      do
      {
        t localt = new t();
        localt.d((Cursor)localObject);
        localLinkedList.add(bo.bc(localt.field_tagName, ""));
      }
      while (((Cursor)localObject).moveToNext());
    ((Cursor)localObject).close();
    localObject = paramString;
    while (localLinkedList.contains(localObject))
    {
      localObject = paramString + i;
      i++;
    }
    AppMethodBeat.o(36554);
    return localObject;
  }

  public static List<com.tencent.mm.plugin.sns.h.b> Ya(String paramString)
  {
    AppMethodBeat.i(36559);
    ArrayList localArrayList = new ArrayList();
    if (af.cnn())
      AppMethodBeat.o(36559);
    while (true)
    {
      return localArrayList;
      Object localObject = h.YT(paramString);
      if (localObject == null)
      {
        AppMethodBeat.o(36559);
      }
      else
      {
        TimeLineObject localTimeLineObject = ((n)localObject).cqu();
        if ((localTimeLineObject.xfI == null) || (localTimeLineObject.xfI.wbK.size() == 0))
        {
          AppMethodBeat.o(36559);
        }
        else
        {
          localArrayList.clear();
          Iterator localIterator = localTimeLineObject.xfI.wbK.iterator();
          for (int i = 0; localIterator.hasNext(); i++)
          {
            localObject = (bau)localIterator.next();
            com.tencent.mm.plugin.sns.h.b localb = new com.tencent.mm.plugin.sns.h.b();
            localb.cNr = ((bau)localObject);
            localb.qQd = paramString;
            localb.fDG = localTimeLineObject.pcX;
            localb.qQe = i;
            localArrayList.add(localb);
          }
          AppMethodBeat.o(36559);
        }
      }
    }
  }

  private static long a(n paramn, cbf paramcbf, String paramString, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(36547);
    n localn = paramn;
    if (paramn == null)
      localn = new n();
    long l;
    if (!af.cnE().kl(localn.field_snsId))
    {
      l = paramcbf.vQE;
      AppMethodBeat.o(36547);
      return l;
    }
    if (paramcbf.xax != 0)
    {
      ab.i("MicroMsg.SnsInfoStorageLogic", "hit the filter id:" + paramcbf.vQE + "  " + i.jV(paramcbf.vQE));
      if (localn.DI(paramInt))
        break label808;
      localn.DF(paramInt);
    }
    label808: for (paramInt = i; ; paramInt = 0)
    {
      while (true)
      {
        if (paramInt != 0)
          af.cnF().a(paramcbf.vQE, localn);
        l = paramcbf.vQE;
        AppMethodBeat.o(36547);
        break;
        paramn = paramcbf.xat;
        ab.i("MicroMsg.SnsInfoStorageLogic", "hasChange id:  %s listSize %s Stringid %s", new Object[] { Long.valueOf(paramcbf.vQE), Integer.valueOf(paramn.size()), i.jV(paramcbf.vQE) });
        if ((paramcbf.xam == null) || (paramcbf.xam.getBuffer() == null))
        {
          ab.i("MicroMsg.SnsInfoStorageLogic", "object desc is null");
          l = paramcbf.vQE;
          AppMethodBeat.o(36547);
          break;
        }
        paramn = new String(paramcbf.xam.getBuffer().toByteArray());
        ab.d("MicroMsg.SnsInfoStorageLogic", "from server %d ", new Object[] { Long.valueOf(paramcbf.vQE) });
        if (bo.isNullOrNil(paramn))
        {
          l = paramcbf.vQE;
          AppMethodBeat.o(36547);
          break;
        }
        if (!localn.YR(paramn))
        {
          l = paramcbf.vQE;
          AppMethodBeat.o(36547);
          break;
        }
        paramcbf.xaD = b(paramcbf.xaD, localn.field_attrBuf);
        ab.d("MicroMsg.SnsInfoStorageLogic", "from server xml ok %d", new Object[] { Long.valueOf(paramcbf.vQE) });
        paramcbf.xam.setBuffer(new byte[0]);
        localn.field_userName = paramcbf.vHl;
        localn.ls(paramcbf.pcX);
        localn.field_likeFlag = paramcbf.xan;
        localn.kz(paramcbf.vQE);
        localn.kB(paramcbf.vQE);
        localn.DF(paramInt);
        try
        {
          while (true)
          {
            l = bo.yz();
            try
            {
              if (localn.field_type == 15)
              {
                paramn = new com/tencent/mm/protocal/protobuf/cbf;
                paramn.<init>();
                paramn = (cbf)paramn.parseFrom(localn.field_attrBuf);
                if ((paramn != null) && (paramn.xaF != null) && (paramn.xaF.wOd > 0))
                {
                  paramcbf.xaF = paramn.xaF;
                  ab.i("MicroMsg.SnsInfoStorageLogic", "mergePreloadInfo predownload info [%d %d %s] cost[%d]", new Object[] { Integer.valueOf(paramcbf.xaF.wOd), Integer.valueOf(paramcbf.xaF.wOe), paramcbf.xaF.wOf, Long.valueOf(bo.az(l)) });
                }
              }
              localn.bi(paramcbf.toByteArray());
              paramn = localn.cqu();
              paramn.jBB = paramcbf.vHl;
              j = paramn.wEJ;
              localn.field_pravited = j;
              ab.i("MicroMsg.SnsInfoStorageLogic", "ext flag %s  extflag %s", new Object[] { Long.valueOf(paramcbf.vQE), Integer.valueOf(paramcbf.wGz) });
              if ((paramcbf.wGz & 0x1) > 0)
              {
                i = 1;
                if (i == 0)
                  break label715;
                localn.cqR();
                if ((j != 1) || (paramInt == 4))
                  break label723;
                ab.e("MicroMsg.SnsInfoStorageLogic", "svr error push me the private pic in timelnie or others");
                l = 0L;
                AppMethodBeat.o(36547);
              }
            }
            catch (Exception paramn)
            {
              while (true)
                ab.e("MicroMsg.SnsInfoStorageLogic", "mergePreloadInfo error %s", new Object[] { paramn.toString() });
            }
          }
        }
        catch (Exception paramn)
        {
          int j;
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramn, "", new Object[0]);
            continue;
            i = 0;
            continue;
            label715: localn.cqS();
          }
          label723: if ((j == 1) || ((!paramString.equals(paramcbf.vHl)) && (paramInt == 4)))
            localn.cqO();
          localn.c(paramn);
          localn.field_type = paramn.xfI.wbJ;
          localn.field_subType = paramn.xfI.wbL;
          af.cnF().a(paramcbf.vQE, localn);
          l = paramcbf.vQE;
          AppMethodBeat.o(36547);
        }
      }
      break;
    }
  }

  public static bau a(n paramn, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(36557);
    if (af.cnn())
    {
      AppMethodBeat.o(36557);
      paramn = localObject;
    }
    while (true)
    {
      return paramn;
      if (paramn == null)
      {
        AppMethodBeat.o(36557);
        paramn = localObject;
      }
      else
      {
        paramn = paramn.cqu();
        if ((paramn.xfI == null) || (paramn.xfI.wbK.size() == 0) || (paramn.xfI.wbK.size() <= paramInt))
        {
          AppMethodBeat.o(36557);
          paramn = localObject;
        }
        else
        {
          paramn = (bau)paramn.xfI.wbK.get(paramInt);
          AppMethodBeat.o(36557);
        }
      }
    }
  }

  public static bau a(n paramn, String paramString)
  {
    AppMethodBeat.i(36558);
    paramn = paramn.cqu();
    if ((paramn.xfI == null) || (paramn.xfI.wbK.size() == 0))
    {
      AppMethodBeat.o(36558);
      paramn = null;
    }
    while (true)
    {
      return paramn;
      Iterator localIterator = paramn.xfI.wbK.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          paramn = (bau)localIterator.next();
          if (paramn.Id.equals(paramString))
          {
            AppMethodBeat.o(36558);
            break;
          }
        }
      AppMethodBeat.o(36558);
      paramn = null;
    }
  }

  public static List<n> a(String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2)
  {
    AppMethodBeat.i(36537);
    if (paramBoolean2)
    {
      paramString1 = af.cnF().b(paramString1, 10, paramBoolean1, paramString2);
      paramString2 = new ArrayList();
      if (paramString1.getCount() != 0)
        break label66;
      paramString1.close();
      AppMethodBeat.o(36537);
    }
    while (true)
    {
      return paramString2;
      paramString1 = af.cnF().e(paramString1, paramBoolean1, paramString2);
      break;
      label66: if (paramString1.moveToFirst())
        do
        {
          n localn = new n();
          localn.d(paramString1);
          paramString2.add(localn);
        }
        while (paramString1.moveToNext());
      paramString1.close();
      AppMethodBeat.o(36537);
    }
  }

  public static void a(String paramString1, int paramInt, LinkedList<cbf> paramLinkedList, String paramString2)
  {
    AppMethodBeat.i(36550);
    if ((paramLinkedList == null) || (paramLinkedList.isEmpty()))
      AppMethodBeat.o(36550);
    ArrayList localArrayList;
    while (true)
    {
      return;
      o localo = af.cnF();
      localArrayList = new ArrayList();
      LinkedList localLinkedList = new LinkedList();
      Object localObject1;
      Object localObject2;
      for (int i = 0; i < paramLinkedList.size(); i++)
      {
        localObject1 = (cbf)paramLinkedList.get(i);
        localObject2 = localo.kD(((cbf)localObject1).vQE);
        localObject3 = localObject2;
        if (localObject2 == null)
          localObject3 = new n();
        if (a((n)localObject3, (cbf)localObject1, paramString1, paramInt) != 0L)
        {
          if ((localLinkedList.size() < 3) && ((((n)localObject3).field_type == 1) || (((n)localObject3).field_type == 15)))
            localLinkedList.add(i.jV(((n)localObject3).field_snsId));
          localArrayList.add(Long.valueOf(((cbf)localObject1).vQE));
        }
      }
      if (((paramInt == 4) || (paramInt == 8)) && (paramString2.equals("")))
      {
        localObject3 = af.cnJ().YX(paramString1);
        if (localObject3 != null)
        {
          localObject3 = ((l)localObject3).field_newerIds;
          localObject3 = bo.P(bo.bc((String)localObject3, "").split(","));
          ab.d("MicroMsg.SnsInfoStorageLogic", "newerIds " + de(localLinkedList));
          label267: 
          do
          {
            if ((localLinkedList.size() >= 3) || (((List)localObject3).size() <= 0))
              break;
            localObject2 = (String)((List)localObject3).remove(0);
          }
          while (localObject2 == null);
        }
        for (i = 0; ; i++)
        {
          if (i < localLinkedList.size())
          {
            localObject1 = (String)localLinkedList.get(i);
            if (((String)localObject2).compareTo((String)localObject1) != 0)
            {
              if (((String)localObject2).compareTo((String)localObject1) <= 0)
                continue;
              localLinkedList.add(0, localObject2);
            }
          }
          if (localLinkedList.contains(localObject2))
            break label267;
          localLinkedList.add(localObject2);
          break label267;
          localObject3 = "";
          break;
        }
        ab.i("MicroMsg.SnsInfoStorageLogic", "merge newerIds " + de(localLinkedList));
        af.cnJ().gq(paramString1, de(localLinkedList));
      }
      Object localObject3 = i.Xl(i.jV(((cbf)paramLinkedList.getLast()).vQE));
      ab.d("MicroMsg.SnsInfoStorageLogic", "FIlTER SEQ :: " + paramString2 + "  -  " + (String)localObject3);
      if (paramInt == 2)
      {
        localObject2 = af.cnF();
        paramLinkedList = o.crk();
        if (paramString2 != null)
        {
          paramString1 = paramLinkedList;
          if (paramString2.equals(""));
        }
        else
        {
          paramString1 = paramLinkedList + " AND " + ((o)localObject2).Zf(paramString2);
        }
        paramLinkedList = paramString1;
        if (o.Zb((String)localObject3))
          paramLinkedList = paramString1 + " AND " + ((o)localObject2).Zc((String)localObject3);
        ab.d("MicroMsg.SnsInfoStorage", "getCursorByUserSeq ".concat(String.valueOf(paramLinkedList)));
        paramString1 = ((o)localObject2).bSd.rawQuery(paramLinkedList, null);
        if (paramString1 == null)
          AppMethodBeat.o(36550);
      }
      else
      {
        localObject2 = af.cnF();
        if (paramInt == 4);
        for (boolean bool = true; ; bool = false)
        {
          paramLinkedList = o.bn(paramString1, bool);
          paramString1 = paramLinkedList;
          if (o.Zb(paramString2))
            paramString1 = paramLinkedList + " AND " + ((o)localObject2).Zf(paramString2);
          paramLinkedList = paramString1;
          if (o.Zb((String)localObject3))
            paramLinkedList = paramString1 + " AND " + ((o)localObject2).Zc((String)localObject3);
          ab.d("MicroMsg.SnsInfoStorage", "getCursorByUserSeq ".concat(String.valueOf(paramLinkedList)));
          paramString1 = ((o)localObject2).bSd.rawQuery(paramLinkedList, null);
          break;
        }
        if (paramString1.moveToFirst())
          break;
        paramString1.close();
        AppMethodBeat.o(36550);
      }
    }
    label935: 
    while (true)
    {
      paramLinkedList = new n();
      paramLinkedList.d(paramString1);
      long l = paramLinkedList.field_snsId;
      if (paramLinkedList.cqV())
        ab.d("MicroMsg.SnsInfoStorageLogic", "uploading one ");
      while (true)
      {
        if (paramString1.moveToNext())
          break label935;
        paramString1.close();
        AppMethodBeat.o(36550);
        break;
        if (paramLinkedList.cqW())
        {
          ab.d("MicroMsg.SnsInfoStorageLogic", "die one ");
        }
        else if (!localArrayList.contains(Long.valueOf(l)))
        {
          paramLinkedList.DJ(paramInt);
          af.cnF().b(l, paramLinkedList);
          ab.i("MicroMsg.SnsInfoStorageLogic", "removeSourceFlag sns Id " + l + " source " + paramInt);
        }
      }
    }
  }

  public static boolean a(long paramLong, cao paramcao)
  {
    AppMethodBeat.i(36545);
    can localcan = paramcao.wZN;
    boolean bool;
    if ((localcan.jCt != 1) && (localcan.jCt != 2))
    {
      AppMethodBeat.o(36545);
      bool = true;
    }
    while (true)
    {
      return bool;
      n localn = af.cnF().kD(paramLong);
      if (localn == null)
      {
        AppMethodBeat.o(36545);
        bool = true;
        continue;
      }
      if ((localn.field_type == 21) && (!com.tencent.mm.plugin.sns.lucky.a.g.cmw()))
      {
        ab.i("MicroMsg.SnsInfoStorageLogic", "passed because close lucky");
        AppMethodBeat.o(36545);
        bool = false;
        continue;
      }
      try
      {
        cbf localcbf = new com/tencent/mm/protocal/protobuf/cbf;
        localcbf.<init>();
        localcbf = (cbf)localcbf.parseFrom(localn.field_attrBuf);
        localcbf.vQE = paramLong;
        Object localObject1;
        Object localObject2;
        if (localcan.jCt == 1)
        {
          localObject1 = localcbf.xaq.iterator();
          while (true)
            if (((Iterator)localObject1).hasNext())
            {
              localObject2 = (cat)((Iterator)localObject1).next();
              if (((cat)localObject2).pcX == localcan.pcX)
              {
                bool = ((cat)localObject2).vHl.equals(localcan.wPm);
                if (bool)
                {
                  AppMethodBeat.o(36545);
                  bool = true;
                  break;
                }
              }
            }
          localcbf.xaq.add(ad.b(paramcao));
        }
        while (true)
        {
          localn.bi(localcbf.toByteArray());
          af.cnF().a(localcbf.vQE, localn);
          AppMethodBeat.o(36545);
          bool = true;
          break;
          if (localcan.jCt == 2)
          {
            localObject2 = localcbf.xat.iterator();
            while (true)
              if (((Iterator)localObject2).hasNext())
              {
                localObject1 = (cat)((Iterator)localObject2).next();
                if (((cat)localObject1).pcX == localcan.pcX)
                {
                  bool = ((cat)localObject1).vHl.equals(localcan.wPm);
                  if (bool)
                  {
                    AppMethodBeat.o(36545);
                    bool = true;
                    break;
                  }
                }
              }
            localcbf.xat.add(ad.b(paramcao));
          }
        }
      }
      catch (Exception paramcao)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramcao, "", new Object[0]);
      }
    }
  }

  public static boolean ab(int paramInt, boolean paramBoolean)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramBoolean)
    {
      bool2 = bool1;
      if (paramInt > 0)
        bool2 = true;
    }
    return bool2;
  }

  public static SKBuiltinBuffer_t b(SKBuiltinBuffer_t paramSKBuiltinBuffer_t, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36548);
    if (paramArrayOfByte != null);
    while (true)
    {
      try
      {
        Object localObject = new com/tencent/mm/protocal/protobuf/cbf;
        ((cbf)localObject).<init>();
        paramArrayOfByte = ((cbf)((cbf)localObject).parseFrom(paramArrayOfByte)).xaD;
        if (paramSKBuiltinBuffer_t == null)
        {
          AppMethodBeat.o(36548);
          return paramArrayOfByte;
        }
        cbn localcbn = new com/tencent/mm/protocal/protobuf/cbn;
        localcbn.<init>();
        localObject = localcbn;
        if (paramArrayOfByte != null)
          localObject = (cbn)localcbn.parseFrom(paramArrayOfByte.getBufferToBytes());
        paramArrayOfByte = new com/tencent/mm/protocal/protobuf/cbn;
        paramArrayOfByte.<init>();
        paramSKBuiltinBuffer_t = (cbn)paramArrayOfByte.parseFrom(paramSKBuiltinBuffer_t.getBufferToBytes());
        if (paramSKBuiltinBuffer_t.xaS == null)
          paramSKBuiltinBuffer_t.xaS = ((cbn)localObject).xaS;
        if (((cbn)localObject).xaR == null)
        {
          paramSKBuiltinBuffer_t.xaR = null;
          paramArrayOfByte = paramSKBuiltinBuffer_t.toByteArray();
          paramSKBuiltinBuffer_t = new com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
          paramSKBuiltinBuffer_t.<init>();
          paramArrayOfByte = paramSKBuiltinBuffer_t.setBuffer(paramArrayOfByte);
          AppMethodBeat.o(36548);
          continue;
        }
        if (paramSKBuiltinBuffer_t.xaR != null)
          continue;
        paramSKBuiltinBuffer_t.xaR = ((cbn)localObject).xaR;
        continue;
      }
      catch (Exception paramSKBuiltinBuffer_t)
      {
        ab.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramSKBuiltinBuffer_t, "", new Object[0]);
        AppMethodBeat.o(36548);
        paramArrayOfByte = null;
        continue;
      }
      paramArrayOfByte = null;
    }
  }

  public static void b(long paramLong, cao paramcao)
  {
    AppMethodBeat.i(36543);
    paramcao = paramcao.wZN;
    if (paramcao.jCt != 9)
      AppMethodBeat.o(36543);
    while (true)
    {
      return;
      n localn = af.cnF().kD(paramLong);
      if (localn == null)
        AppMethodBeat.o(36543);
      else
        try
        {
          Object localObject = new com/tencent/mm/protocal/protobuf/cbf;
          ((cbf)localObject).<init>();
          cbf localcbf = (cbf)((cbf)localObject).parseFrom(localn.field_attrBuf);
          localcbf.vQE = paramLong;
          localObject = localcbf.xat.iterator();
          while (((Iterator)localObject).hasNext())
          {
            cat localcat = (cat)((Iterator)localObject).next();
            if ((localcat.wZG == paramcao.wZG) && (!bo.isNullOrNil(localcat.vHl)) && (localcat.vHl.equals(paramcao.wPm)))
              localcbf.xat.remove(localcat);
          }
          localn.bi(localcbf.toByteArray());
          af.cnF().a(localcbf.vQE, localn);
          AppMethodBeat.o(36543);
        }
        catch (Exception paramcao)
        {
          ab.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramcao, "", new Object[0]);
          AppMethodBeat.o(36543);
        }
    }
  }

  public static List<n> c(String paramString1, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(36538);
    o localo = af.cnF();
    Object localObject = o.bp(paramString1, paramBoolean);
    paramString1 = (String)localObject;
    if (o.Zb(paramString2))
      paramString1 = (String)localObject + " AND " + localo.Zc(paramString2);
    if (paramBoolean)
    {
      paramString1 = paramString1 + o.rfq;
      ab.d("MicroMsg.SnsInfoStorage", "getCursorByUserName in gallery ".concat(String.valueOf(paramString1)));
      paramString2 = localo.bSd.rawQuery(paramString1, null);
      paramString1 = new ArrayList();
      if (paramString2.getCount() != 0)
        break label164;
      paramString2.close();
      AppMethodBeat.o(36538);
    }
    while (true)
    {
      return paramString1;
      paramString1 = paramString1 + o.rfr;
      break;
      label164: if (paramString2.moveToFirst())
        do
        {
          localObject = new n();
          ((n)localObject).d(paramString2);
          paramString1.add(localObject);
        }
        while (paramString2.moveToNext());
      paramString2.close();
      AppMethodBeat.o(36538);
    }
  }

  public static void c(long paramLong, cao paramcao)
  {
    AppMethodBeat.i(36544);
    paramcao = paramcao.wZN;
    if (paramcao.jCt != 13)
      AppMethodBeat.o(36544);
    while (true)
    {
      return;
      n localn = af.cnF().kD(paramLong);
      if (localn == null)
        AppMethodBeat.o(36544);
      else
        try
        {
          cbf localcbf = new com/tencent/mm/protocal/protobuf/cbf;
          localcbf.<init>();
          localcbf = (cbf)localcbf.parseFrom(localn.field_attrBuf);
          localcbf.vQE = paramLong;
          Object localObject;
          if (localcbf.xaE == null)
          {
            localObject = new com/tencent/mm/protocal/protobuf/cbu;
            ((cbu)localObject).<init>();
            localcbf.xaE = ((cbu)localObject);
          }
          if (paramcao.jCt == 13)
          {
            localObject = localcbf.xaE.xbh.iterator();
            while (true)
              if (((Iterator)localObject).hasNext())
              {
                boolean bool = ((cbb)((Iterator)localObject).next()).vHl.equals(paramcao.wPm);
                if (bool)
                {
                  AppMethodBeat.o(36544);
                  break;
                }
              }
            localObject = new com/tencent/mm/protocal/protobuf/cbb;
            ((cbb)localObject).<init>();
            ((cbb)localObject).wZK = paramcao.wZK;
            ((cbb)localObject).pcX = paramcao.pcX;
            ((cbb)localObject).vHl = paramcao.wPm;
            localcbf.xaE.xbh.add(localObject);
            localcbf.xaE.xbg = localcbf.xaE.xbh.size();
          }
          localn.bi(localcbf.toByteArray());
          af.cnF().a(localcbf.vQE, localn);
          AppMethodBeat.o(36544);
        }
        catch (Exception paramcao)
        {
          ab.e("MicroMsg.SnsInfoStorageLogic", "error for update hbaction " + paramcao.getMessage());
          ab.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramcao, "", new Object[0]);
          AppMethodBeat.o(36544);
        }
    }
  }

  public static void cnW()
  {
    AppMethodBeat.i(36540);
    if (qMr != null)
      qMr.clear();
    AppMethodBeat.o(36540);
  }

  public static List<n> cnX()
  {
    AppMethodBeat.i(36553);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = af.cnF();
    Object localObject2 = o.crl() + " AND " + o.rft + " AND  (snsId = 0  ) ";
    localObject2 = ((o)localObject1).bSd.rawQuery((String)localObject2, null);
    if (((Cursor)localObject2).getCount() == 0)
    {
      ((Cursor)localObject2).close();
      AppMethodBeat.o(36553);
    }
    while (true)
    {
      return localArrayList;
      ((Cursor)localObject2).moveToFirst();
      do
      {
        localObject1 = new n();
        ((n)localObject1).d((Cursor)localObject2);
        localArrayList.add(localObject1);
      }
      while (((Cursor)localObject2).moveToNext());
      ((Cursor)localObject2).close();
      AppMethodBeat.o(36553);
    }
  }

  public static void cnY()
  {
    AppMethodBeat.i(36562);
    Cursor localCursor = af.cnF().df("", 0);
    if (localCursor != null)
    {
      ab.i("MicroMsg.SnsInfoStorageLogic", "all timeline snsId begin");
      while (localCursor.moveToNext())
      {
        n localn = new n();
        localn.d(localCursor);
        ab.i("MicroMsg.SnsInfoStorageLogic", localn.cqA());
      }
      ab.i("MicroMsg.SnsInfoStorageLogic", "all timeline snsId end");
      localCursor.close();
    }
    AppMethodBeat.o(36562);
  }

  public static long d(cbf paramcbf)
  {
    AppMethodBeat.i(36546);
    n localn1 = af.cnF().kD(paramcbf.vQE);
    n localn2 = localn1;
    if (localn1 == null)
      localn2 = new n();
    long l = a(localn2, paramcbf, "", 0);
    AppMethodBeat.o(36546);
    return l;
  }

  private static String de(List<String> paramList)
  {
    AppMethodBeat.i(36549);
    Iterator localIterator = paramList.iterator();
    paramList = "";
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (paramList.length() == 0)
        paramList = str;
      else
        paramList = paramList + "," + str;
    }
    AppMethodBeat.o(36549);
    return paramList;
  }

  public static List<com.tencent.mm.plugin.sns.h.b> df(List<String> paramList)
  {
    AppMethodBeat.i(36560);
    ArrayList localArrayList = new ArrayList();
    if (paramList == null)
      AppMethodBeat.o(36560);
    while (true)
    {
      return localArrayList;
      localArrayList.clear();
      Iterator localIterator = paramList.iterator();
      for (int i = 0; localIterator.hasNext(); i++)
      {
        String str = (String)localIterator.next();
        paramList = new com.tencent.mm.plugin.sns.h.b();
        bau localbau = new bau();
        localbau.Id = "pre_temp_extend_pic".concat(String.valueOf(str));
        paramList.cNr = localbau;
        paramList.qQd = "";
        paramList.qQe = i;
        localArrayList.add(paramList);
      }
      AppMethodBeat.o(36560);
    }
  }

  public static List<com.tencent.mm.plugin.sns.h.b> fY(String paramString1, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(36556);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = null;
    try
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = paramString2 + paramString1 + "_ARTISTF.mm";
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = paramString2 + paramString1 + "_ARTIST.mm";
      paramString1 = (String)localObject1;
      if (com.tencent.mm.vfs.e.ct((String)localObject2))
      {
        paramString2 = com.tencent.mm.vfs.e.e((String)localObject2, 0, (int)com.tencent.mm.vfs.e.asZ((String)localObject2));
        paramString1 = new com/tencent/mm/protocal/protobuf/db;
        paramString1.<init>();
        paramString1 = (db)paramString1.parseFrom(paramString2);
      }
      paramString2 = paramString1;
      if (paramString1 == null)
      {
        com.tencent.mm.vfs.e.deleteFile((String)localObject2);
        paramString2 = com.tencent.mm.vfs.e.e((String)localObject3, 0, (int)com.tencent.mm.vfs.e.asZ((String)localObject3));
        paramString1 = new java/lang/String;
        paramString1.<init>(paramString2);
        paramString2 = a.YD(paramString1);
        com.tencent.mm.vfs.e.b((String)localObject2, paramString2.toByteArray(), -1);
      }
      paramString1 = paramString2.vFk.iterator();
      if (paramString1.hasNext())
      {
        localObject1 = (ary)paramString1.next();
        paramString2 = ((ary)localObject1).Name;
        localObject2 = ((ary)localObject1).wbK.iterator();
        for (int j = i; ; j++)
        {
          i = j;
          if (!((Iterator)localObject2).hasNext())
            break;
          localObject3 = (bau)((Iterator)localObject2).next();
          ((bau)localObject3).Desc = paramString2;
          localObject1 = new com/tencent/mm/plugin/sns/h/b;
          ((com.tencent.mm.plugin.sns.h.b)localObject1).<init>();
          ((com.tencent.mm.plugin.sns.h.b)localObject1).cNr = ((bau)localObject3);
          ((com.tencent.mm.plugin.sns.h.b)localObject1).qQd = "";
          ((com.tencent.mm.plugin.sns.h.b)localObject1).qQe = j;
          localArrayList.add(localObject1);
        }
      }
    }
    catch (Exception paramString1)
    {
      ab.e("MicroMsg.SnsInfoStorageLogic", "error initDataArtist");
      AppMethodBeat.o(36556);
    }
    return localArrayList;
  }

  public static cbf p(n paramn)
  {
    AppMethodBeat.i(36541);
    try
    {
      cbf localcbf = new com/tencent/mm/protocal/protobuf/cbf;
      localcbf.<init>();
      paramn = (cbf)localcbf.parseFrom(paramn.field_attrBuf);
      paramn = af.cnE().c(paramn);
      qMr.clear();
      AppMethodBeat.o(36541);
      return paramn;
    }
    catch (Exception paramn)
    {
      while (true)
      {
        ab.e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
        ab.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramn, "", new Object[0]);
        paramn = new cbf();
        AppMethodBeat.o(36541);
      }
    }
  }

  public static cbf q(n paramn)
  {
    AppMethodBeat.i(36542);
    try
    {
      Object localObject;
      if (paramn.reW == null)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        paramn.reW = (com.tencent.mm.a.g.x(paramn.field_content) + com.tencent.mm.a.g.x(paramn.field_attrBuf));
      }
      if (qMr.containsKey(paramn.reW))
      {
        localObject = (cbf)qMr.get(paramn.reW);
        if (localObject != null)
        {
          af.cnE().c((cbf)localObject);
          AppMethodBeat.o(36542);
        }
      }
      for (paramn = (n)localObject; ; paramn = (n)localObject)
      {
        return paramn;
        localObject = new com/tencent/mm/protocal/protobuf/cbf;
        ((cbf)localObject).<init>();
        localObject = (cbf)((cbf)localObject).parseFrom(paramn.field_attrBuf);
        qMr.put(paramn.reW, localObject);
        af.cnE().c((cbf)localObject);
        AppMethodBeat.o(36542);
      }
    }
    catch (Exception paramn)
    {
      while (true)
      {
        ab.e("MicroMsg.SnsInfoStorageLogic", "SnsObject parseFrom error");
        ab.printErrStackTrace("MicroMsg.SnsInfoStorageLogic", paramn, "", new Object[0]);
        paramn = new cbf();
        AppMethodBeat.o(36542);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.aj
 * JD-Core Version:    0.6.2
 */