package com.tencent.mm.plugin.fav.b.f;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.plugin.fav.a.a;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.a.w;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Set<Ljava.lang.Integer;>;
import junit.framework.Assert;

public final class d extends j<g>
  implements x
{
  private static final String mhk;
  private e bSd;

  static
  {
    AppMethodBeat.i(5459);
    mhk = "xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type" + ",updateSeq,updateTime,tagProto,sessionId,datatotalsize,rowid";
    AppMethodBeat.o(5459);
  }

  public d(e parame)
  {
    super(parame, g.ccO, "FavItemInfo", null);
    this.bSd = parame;
  }

  private static boolean vA(int paramInt)
  {
    boolean bool1 = false;
    int[] arrayOfInt = a.meB;
    int i = arrayOfInt.length;
    for (int j = 0; ; j++)
    {
      boolean bool2 = bool1;
      if (j < i)
      {
        if (arrayOfInt[j] == paramInt)
          bool2 = true;
      }
      else
        return bool2;
    }
  }

  public final void J(int paramInt, long paramLong)
  {
    AppMethodBeat.i(5445);
    ab.d("MicroMsg.Fav.FavItemInfoStorage", "setStatus status:%d,localId:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    String str = "update FavItemInfo set itemStatus = " + paramInt + " where localId = " + paramLong;
    this.bSd.hY("FavItemInfo", str);
    anF(String.valueOf(paramLong));
    AppMethodBeat.o(5445);
  }

  public final g LS(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(5434);
    Cursor localCursor = this.bSd.a("FavItemInfo", null, "sourceId=?", new String[] { String.valueOf(paramString) }, null, null, null, 2);
    if (localCursor.moveToFirst())
    {
      paramString = new g();
      paramString.d(localCursor);
      localCursor.close();
      AppMethodBeat.o(5434);
    }
    while (true)
    {
      return paramString;
      ab.w("MicroMsg.Fav.FavItemInfoStorage", "klem getBySourceId:%s, no data", new Object[] { paramString });
      localCursor.close();
      AppMethodBeat.o(5434);
      paramString = localObject;
    }
  }

  public final ArrayList<g> a(List<Long> paramList, List<g> paramList1, Set<Integer> paramSet, w paramw)
  {
    Object localObject1 = null;
    AppMethodBeat.i(5450);
    if ((paramList == null) || (paramList.size() == 0) || (paramList.size() > 20))
      AppMethodBeat.o(5450);
    Object localObject2;
    for (paramList = localObject1; ; paramList = localObject1)
    {
      return paramList;
      localObject2 = new StringBuffer();
      ((StringBuffer)localObject2).append("select ").append(mhk).append(" from FavItemInfo where ");
      if ((paramSet != null) && (paramSet.size() > 0))
      {
        ((StringBuffer)localObject2).append("( 1=1");
        Iterator localIterator = paramSet.iterator();
        while (localIterator.hasNext())
        {
          paramSet = (Integer)localIterator.next();
          ((StringBuffer)localObject2).append(" and type != ").append(paramSet);
        }
        ((StringBuffer)localObject2).append(") and ");
      }
      int i = paramList.size();
      int j = 0;
      if (j < i)
      {
        if (j == 0)
          ((StringBuffer)localObject2).append("( ");
        if (j == i - 1)
          ((StringBuffer)localObject2).append("localId = ").append(paramList.get(j)).append(" )");
        while (true)
        {
          j++;
          break;
          ((StringBuffer)localObject2).append("localId = ").append(paramList.get(j)).append(" or ");
        }
      }
      ((StringBuffer)localObject2).append(" order by updateTime desc");
      paramList = ((StringBuffer)localObject2).toString();
      ab.d("MicroMsg.Fav.FavItemInfoStorage", "get list by id list sql %s", new Object[] { paramList });
      localObject2 = this.bSd.a(paramList, null, 2);
      if (localObject2 != null)
        break;
      AppMethodBeat.o(5450);
    }
    label394: if (((Cursor)localObject2).moveToFirst())
    {
      paramSet = new ArrayList();
      label320: if ((paramList1 == null) || (paramList1.isEmpty()))
      {
        paramList = new g();
        label341: paramList.d((Cursor)localObject2);
        if ((paramw == null) || (!paramw.t(paramList)))
          break label436;
        ab.w("MicroMsg.Fav.FavItemInfoStorage", "id[%d] type[%d] match filter", new Object[] { Integer.valueOf(paramList.field_id), Integer.valueOf(paramList.field_type) });
        if (((Cursor)localObject2).moveToNext())
          break label443;
      }
    }
    for (paramList = paramSet; ; paramList = null)
    {
      ((Cursor)localObject2).close();
      AppMethodBeat.o(5450);
      break;
      paramList = (g)paramList1.remove(0);
      break label341;
      label436: paramSet.add(paramList);
      break label394;
      label443: break label320;
    }
  }

  public final List<g> a(int paramInt, Set<Integer> paramSet, w paramw)
  {
    AppMethodBeat.i(5439);
    if ((paramSet != null) && (paramSet.contains(Integer.valueOf(paramInt))))
    {
      ab.w("MicroMsg.Fav.FavItemInfoStorage", "getFirstPageList::block set contains target type, error, do return null");
      AppMethodBeat.o(5439);
      paramSet = null;
      return paramSet;
    }
    ArrayList localArrayList = new ArrayList();
    Object localObject = "select " + mhk + " from FavItemInfo where itemStatus > 0";
    if (paramInt != -1)
      paramSet = (String)localObject + " and type = " + paramInt;
    while (true)
    {
      paramSet = paramSet + " order by updateTime desc limit 20";
      paramSet = this.bSd.a(paramSet, null, 2);
      if (paramSet == null)
      {
        AppMethodBeat.o(5439);
        paramSet = localArrayList;
        break;
        if (paramSet == null)
          break label327;
        Iterator localIterator = paramSet.iterator();
        while (true)
        {
          paramSet = (Set<Integer>)localObject;
          if (!localIterator.hasNext())
            break;
          paramInt = ((Integer)localIterator.next()).intValue();
          localObject = (String)localObject + " and type != " + paramInt;
        }
      }
      while (paramSet.moveToNext())
      {
        localObject = new g();
        ((g)localObject).d(paramSet);
        if ((paramw != null) && (paramw.t((g)localObject)))
          ab.w("MicroMsg.Fav.FavItemInfoStorage", "id[%d] type[%d] match filter", new Object[] { Integer.valueOf(((g)localObject).field_id), Integer.valueOf(((g)localObject).field_type) });
        else
          localArrayList.add(localObject);
      }
      paramSet.close();
      AppMethodBeat.o(5439);
      paramSet = localArrayList;
      break;
      label327: paramSet = (Set<Integer>)localObject;
    }
  }

  public final boolean a(g paramg, String[] paramArrayOfString)
  {
    AppMethodBeat.i(5436);
    abl localabl;
    if (paramg.field_favProto.wit != null)
    {
      localabl = paramg.field_favProto.wit;
      if (localabl.cvp > 0)
        break label166;
      ab.w("MicroMsg.Fav.FavItemInfoStorage", "update::favid %d favlocalid %d type %d, sourceTypeError %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_type), Integer.valueOf(localabl.cvp) });
      localabl.LN(1);
    }
    while (true)
    {
      b.a(paramg);
      boolean bool = super.b(paramg, false, paramArrayOfString);
      if (bool)
        b(paramg.field_localId, 3, Long.valueOf(paramg.field_localId));
      ab.d("MicroMsg.Fav.FavItemInfoStorage", "update result[%B]", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(5436);
      return bool;
      label166: localabl.LN(localabl.cvp);
    }
  }

  // ERROR //
  public final List<g> b(long paramLong, int paramInt, Set<Integer> paramSet, w paramw)
  {
    // Byte code:
    //   0: sipush 5442
    //   3: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload 4
    //   8: ifnull +37 -> 45
    //   11: aload 4
    //   13: iload_3
    //   14: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   17: invokeinterface 243 2 0
    //   22: ifeq +23 -> 45
    //   25: ldc 69
    //   27: ldc_w 309
    //   30: invokestatic 248	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   33: sipush 5442
    //   36: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   39: aconst_null
    //   40: astore 4
    //   42: aload 4
    //   44: areturn
    //   45: new 208	java/util/ArrayList
    //   48: dup
    //   49: invokespecial 209	java/util/ArrayList:<init>	()V
    //   52: astore 6
    //   54: new 21	java/lang/StringBuilder
    //   57: dup
    //   58: ldc 156
    //   60: invokespecial 27	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   63: getstatic 39	com/tencent/mm/plugin/fav/b/f/d:mhk	Ljava/lang/String;
    //   66: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: ldc_w 311
    //   72: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: lload_1
    //   76: invokevirtual 100	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   79: invokevirtual 37	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: astore 7
    //   84: iload_3
    //   85: iconst_m1
    //   86: if_icmpeq +107 -> 193
    //   89: new 21	java/lang/StringBuilder
    //   92: dup
    //   93: invokespecial 251	java/lang/StringBuilder:<init>	()V
    //   96: aload 7
    //   98: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: ldc 253
    //   103: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: iload_3
    //   107: invokevirtual 95	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   110: invokevirtual 37	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   113: astore 7
    //   115: new 21	java/lang/StringBuilder
    //   118: dup
    //   119: invokespecial 251	java/lang/StringBuilder:<init>	()V
    //   122: aload 7
    //   124: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: ldc_w 313
    //   130: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: invokevirtual 37	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: astore 4
    //   138: new 21	java/lang/StringBuilder
    //   141: dup
    //   142: invokespecial 251	java/lang/StringBuilder:<init>	()V
    //   145: aload 4
    //   147: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: ldc 200
    //   152: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: invokevirtual 37	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   158: astore 4
    //   160: aload_0
    //   161: getfield 57	com/tencent/mm/plugin/fav/b/f/d:bSd	Lcom/tencent/mm/sdk/e/e;
    //   164: aload 4
    //   166: aconst_null
    //   167: iconst_2
    //   168: invokeinterface 206 4 0
    //   173: astore 4
    //   175: aload 4
    //   177: ifnonnull +101 -> 278
    //   180: sipush 5442
    //   183: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   186: aload 6
    //   188: astore 4
    //   190: goto -148 -> 42
    //   193: aload 4
    //   195: ifnull +159 -> 354
    //   198: aload 4
    //   200: invokeinterface 170 1 0
    //   205: astore 8
    //   207: aload 7
    //   209: astore 4
    //   211: aload 4
    //   213: astore 7
    //   215: aload 8
    //   217: invokeinterface 175 1 0
    //   222: ifeq -107 -> 115
    //   225: aload 8
    //   227: invokeinterface 179 1 0
    //   232: checkcast 75	java/lang/Integer
    //   235: invokevirtual 258	java/lang/Integer:intValue	()I
    //   238: istore_3
    //   239: new 21	java/lang/StringBuilder
    //   242: dup
    //   243: invokespecial 251	java/lang/StringBuilder:<init>	()V
    //   246: aload 4
    //   248: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: ldc 181
    //   253: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: iload_3
    //   257: invokevirtual 95	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   260: invokevirtual 37	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   263: astore 4
    //   265: goto -54 -> 211
    //   268: astore 7
    //   270: ldc 69
    //   272: ldc_w 315
    //   275: invokestatic 318	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   278: aload 4
    //   280: invokeinterface 230 1 0
    //   285: ifeq +49 -> 334
    //   288: new 46	com/tencent/mm/plugin/fav/a/g
    //   291: dup
    //   292: invokespecial 133	com/tencent/mm/plugin/fav/a/g:<init>	()V
    //   295: astore 7
    //   297: aload 7
    //   299: aload 4
    //   301: invokevirtual 136	com/tencent/mm/plugin/fav/a/g:d	(Landroid/database/Cursor;)V
    //   304: aload 5
    //   306: ifnull +15 -> 321
    //   309: aload 5
    //   311: aload 7
    //   313: invokeinterface 218 2 0
    //   318: ifne -40 -> 278
    //   321: aload 6
    //   323: aload 7
    //   325: invokeinterface 259 2 0
    //   330: pop
    //   331: goto -53 -> 278
    //   334: aload 4
    //   336: invokeinterface 139 1 0
    //   341: sipush 5442
    //   344: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   347: aload 6
    //   349: astore 4
    //   351: goto -309 -> 42
    //   354: goto -239 -> 115
    //
    // Exception table:
    //   from	to	target	type
    //   297	304	268	java/lang/Exception
  }

  public final boolean b(g paramg, String[] paramArrayOfString)
  {
    AppMethodBeat.i(5451);
    abl localabl;
    if (paramg.field_favProto.wit != null)
    {
      localabl = paramg.field_favProto.wit;
      if (localabl.cvp > 0)
        break label107;
      ab.w("MicroMsg.Fav.FavItemInfoStorage", "update::favid %d favlocalid %d type %d, sourceTypeError %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_type), Integer.valueOf(localabl.cvp) });
      localabl.LN(1);
    }
    while (true)
    {
      boolean bool = super.b(paramg, false, paramArrayOfString);
      AppMethodBeat.o(5451);
      return bool;
      label107: localabl.LN(localabl.cvp);
    }
  }

  public final e buR()
  {
    return this.bSd;
  }

  public final int buS()
  {
    int i = 0;
    AppMethodBeat.i(5433);
    Cursor localCursor = rawQuery("select count(*) from FavItemInfo where type = 2", new String[0]);
    if (localCursor != null)
    {
      localCursor.moveToFirst();
      i = localCursor.getInt(0);
      localCursor.close();
      AppMethodBeat.o(5433);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(5433);
    }
  }

  public final List<g> buT()
  {
    Object localObject1 = null;
    AppMethodBeat.i(5443);
    Object localObject2 = "select " + mhk + " from FavItemInfo where itemStatus=3";
    localObject2 = this.bSd.rawQuery((String)localObject2, null);
    if (localObject2 == null)
      AppMethodBeat.o(5443);
    while (true)
    {
      return localObject1;
      if (((Cursor)localObject2).getCount() == 0)
      {
        ((Cursor)localObject2).close();
        AppMethodBeat.o(5443);
      }
      else
      {
        localObject1 = new LinkedList();
        while (((Cursor)localObject2).moveToNext())
        {
          g localg = new g();
          localg.d((Cursor)localObject2);
          ((List)localObject1).add(localg);
        }
        ((Cursor)localObject2).close();
        AppMethodBeat.o(5443);
      }
    }
  }

  public final List<g> buU()
  {
    g localg = null;
    Object localObject1 = null;
    AppMethodBeat.i(5444);
    Object localObject2 = "select " + mhk + " from FavItemInfo where itemStatus=1";
    localObject2 = this.bSd.a((String)localObject2, null, 2);
    if (localObject2 == null)
      AppMethodBeat.o(5444);
    while (true)
    {
      return localObject1;
      localObject1 = localg;
      if (((Cursor)localObject2).moveToFirst())
      {
        localObject1 = new LinkedList();
        do
        {
          localg = new g();
          localg.d((Cursor)localObject2);
          ((List)localObject1).add(localg);
        }
        while (((Cursor)localObject2).moveToNext());
      }
      ((Cursor)localObject2).close();
      AppMethodBeat.o(5444);
    }
  }

  public final List<g> buV()
  {
    g localg = null;
    Object localObject1 = null;
    AppMethodBeat.i(5447);
    Object localObject2 = "select " + mhk + " from FavItemInfo where (itemStatus=9 or itemStatus=12)";
    localObject2 = this.bSd.a((String)localObject2, null, 2);
    if (localObject2 == null)
      AppMethodBeat.o(5447);
    while (true)
    {
      return localObject1;
      localObject1 = localg;
      if (((Cursor)localObject2).moveToFirst())
      {
        localObject1 = new ArrayList();
        do
        {
          localg = new g();
          localg.d((Cursor)localObject2);
          ((List)localObject1).add(localg);
        }
        while (((Cursor)localObject2).moveToNext());
      }
      ((Cursor)localObject2).close();
      AppMethodBeat.o(5447);
    }
  }

  public final List<g> buW()
  {
    g localg = null;
    Object localObject1 = null;
    AppMethodBeat.i(5448);
    Object localObject2 = "select " + mhk + " from FavItemInfo where itemStatus=17";
    localObject2 = this.bSd.a((String)localObject2, null, 2);
    if (localObject2 == null)
      AppMethodBeat.o(5448);
    while (true)
    {
      return localObject1;
      localObject1 = localg;
      if (((Cursor)localObject2).moveToFirst())
      {
        localObject1 = new ArrayList();
        do
        {
          localg = new g();
          localg.d((Cursor)localObject2);
          ((List)localObject1).add(localg);
        }
        while (((Cursor)localObject2).moveToNext());
      }
      ((Cursor)localObject2).close();
      AppMethodBeat.o(5448);
    }
  }

  public final List<g> buX()
  {
    g localg = null;
    Object localObject1 = null;
    AppMethodBeat.i(5449);
    Object localObject2 = "select " + mhk + " from FavItemInfo where itemStatus=3 or itemStatus=6 or itemStatus=11 or itemStatus=14 or itemStatus=16 or itemStatus=18";
    localObject2 = this.bSd.a((String)localObject2, null, 2);
    if (localObject2 == null)
      AppMethodBeat.o(5449);
    while (true)
    {
      return localObject1;
      localObject1 = localg;
      if (((Cursor)localObject2).moveToFirst())
      {
        localObject1 = new ArrayList();
        do
        {
          localg = new g();
          localg.d((Cursor)localObject2);
          ((List)localObject1).add(localg);
        }
        while (((Cursor)localObject2).moveToNext());
      }
      ((Cursor)localObject2).close();
      AppMethodBeat.o(5449);
    }
  }

  public final List<g> buY()
  {
    g localg = null;
    Object localObject1 = null;
    AppMethodBeat.i(5452);
    Object localObject2 = "select " + mhk + " from FavItemInfo where flag =  -1 and itemStatus = 0 ";
    localObject2 = this.bSd.a((String)localObject2, null, 2);
    if (localObject2 == null)
      AppMethodBeat.o(5452);
    while (true)
    {
      return localObject1;
      localObject1 = localg;
      if (((Cursor)localObject2).moveToFirst())
      {
        localObject1 = new ArrayList();
        do
        {
          localg = new g();
          localg.d((Cursor)localObject2);
          ((List)localObject1).add(localg);
        }
        while (((Cursor)localObject2).moveToNext());
      }
      ((Cursor)localObject2).close();
      AppMethodBeat.o(5452);
    }
  }

  public final List<Long> buZ()
  {
    AppMethodBeat.i(5453);
    long l1 = System.currentTimeMillis();
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = "";
    int k;
    for (k : a.meB)
      localObject1 = (String)localObject1 + k + ",";
    ??? = localObject1;
    if (((String)localObject1).endsWith(","))
      ??? = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
    localObject1 = "select localId from FavItemInfo where " + " itemStatus in (" + (String)??? + ")";
    String str = (String)localObject1 + " and datatotalsize > 0 ";
    localObject1 = "";
    for (k : a.meA)
      localObject1 = (String)localObject1 + k + ",";
    ??? = localObject1;
    if (((String)localObject1).endsWith(","))
      ??? = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
    localObject1 = str + " and type in (" + (String)??? + ")";
    localObject1 = (String)localObject1 + " order by datatotalsize desc";
    localObject1 = this.bSd.rawQuery((String)localObject1, null);
    if (localObject1 == null)
      AppMethodBeat.o(5453);
    while (true)
    {
      return localArrayList;
      if (((Cursor)localObject1).getCount() == 0)
      {
        ((Cursor)localObject1).close();
        AppMethodBeat.o(5453);
      }
      else
      {
        while (((Cursor)localObject1).moveToNext())
          localArrayList.add(Long.valueOf(((Cursor)localObject1).getLong(0)));
        ((Cursor)localObject1).close();
        long l2 = System.currentTimeMillis();
        ab.i("MicroMsg.Fav.FavItemInfoStorage", "getCleanList cu.getCount() = %d,used %dms", new Object[] { Integer.valueOf(localArrayList.size()), Long.valueOf(l2 - l1) });
        AppMethodBeat.o(5453);
      }
    }
  }

  public final void bva()
  {
    AppMethodBeat.i(5454);
    ab.i("MicroMsg.Fav.FavItemInfoStorage", "calDataBaseDataTotalLength");
    Object localObject1 = "select " + mhk + " from FavItemInfo where ";
    Object localObject2 = "";
    int k;
    for (k : a.meB)
      localObject2 = (String)localObject2 + k + ",";
    ??? = localObject2;
    if (((String)localObject2).endsWith(","))
      ??? = ((String)localObject2).substring(0, ((String)localObject2).length() - 1);
    localObject1 = (String)localObject1 + "itemStatus in (" + (String)??? + ")";
    localObject2 = "";
    for (k : a.meA)
      localObject2 = (String)localObject2 + k + ",";
    ??? = localObject2;
    if (((String)localObject2).endsWith(","))
      ??? = ((String)localObject2).substring(0, ((String)localObject2).length() - 1);
    localObject2 = (String)localObject1 + " and type in (" + (String)??? + ")";
    localObject1 = this.bSd.rawQuery((String)localObject2, null);
    if (localObject1 == null)
    {
      ab.e("MicroMsg.Fav.FavItemInfoStorage", "calDataBaseDataTotalLength cu = null");
      AppMethodBeat.o(5454);
    }
    while (true)
    {
      return;
      if (((Cursor)localObject1).getCount() != 0)
        break;
      ((Cursor)localObject1).close();
      ab.i("MicroMsg.Fav.FavItemInfoStorage", "calDataBaseDataTotalLength cu.getCount() = 0");
      AppMethodBeat.o(5454);
    }
    ab.i("MicroMsg.Fav.FavItemInfoStorage", "calDataBaseDataTotalLength cu.getCount() = " + ((Cursor)localObject1).getCount());
    long l1;
    if ((this.bSd instanceof h))
      l1 = ((h)this.bSd).iV(Thread.currentThread().getId());
    while (true)
      if (((Cursor)localObject1).moveToNext())
      {
        ??? = new g();
        ((g)???).d((Cursor)localObject1);
        if (vA(((g)???).field_itemStatus))
        {
          if (((g)???).field_favProto != null)
          {
            localObject2 = ((g)???).field_favProto.wiv.iterator();
            for (long l2 = 0L; ; l2 = ((aar)((Iterator)localObject2).next()).wgu + l2)
            {
              l3 = l2;
              if (!((Iterator)localObject2).hasNext())
                break;
            }
          }
          long l3 = 0L;
          ((g)???).field_datatotalsize = l3;
          a((g)???, new String[] { "localId" });
        }
      }
      else
      {
        if ((this.bSd instanceof h))
          ((h)this.bSd).mB(l1);
        ((Cursor)localObject1).close();
        ab.i("MicroMsg.Fav.FavItemInfoStorage", "calDataBaseDataTotalLength end");
        AppMethodBeat.o(5454);
        break;
        l1 = 0L;
      }
  }

  public final List<Long> bvb()
  {
    AppMethodBeat.i(5455);
    ArrayList localArrayList = new ArrayList();
    Object localObject = "select localId from FavItemInfo" + " order by updateTime desc";
    localObject = this.bSd.a((String)localObject, null, 2);
    if (localObject == null)
      AppMethodBeat.o(5455);
    while (true)
    {
      return localArrayList;
      if (((Cursor)localObject).getCount() == 0)
      {
        ((Cursor)localObject).close();
        AppMethodBeat.o(5455);
      }
      else
      {
        while (((Cursor)localObject).moveToNext())
          localArrayList.add(Long.valueOf(((Cursor)localObject).getLong(0)));
        ((Cursor)localObject).close();
        AppMethodBeat.o(5455);
      }
    }
  }

  public final g iE(long paramLong)
  {
    Object localObject = null;
    AppMethodBeat.i(5431);
    if (this.bSd == null)
    {
      ab.e("MicroMsg.Fav.FavItemInfoStorage", "getBtLocalId, but db is null, return");
      AppMethodBeat.o(5431);
    }
    while (true)
    {
      return localObject;
      Cursor localCursor = this.bSd.a("FavItemInfo", null, "localId=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
      if (localCursor.moveToFirst())
      {
        g localg = new g();
        try
        {
          localg.d(localCursor);
          localCursor.close();
          AppMethodBeat.o(5431);
          localObject = localg;
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.Fav.FavItemInfoStorage", "getByLocalId convertFrom(cu) cause IlleagalStateException, return null");
          localCursor.close();
          AppMethodBeat.o(5431);
        }
      }
      else
      {
        ab.w("MicroMsg.Fav.FavItemInfoStorage", "klem getByLocalId:%d, no data", new Object[] { Long.valueOf(paramLong) });
        localCursor.close();
        AppMethodBeat.o(5431);
      }
    }
  }

  public final g iF(long paramLong)
  {
    AppMethodBeat.i(5432);
    Object localObject1 = "Select * from FavItemInfo where id = ".concat(String.valueOf(paramLong));
    Cursor localCursor = this.bSd.rawQuery((String)localObject1, null);
    if (localCursor.getCount() != 0)
    {
      localObject1 = new g();
      localCursor.moveToFirst();
    }
    while (true)
    {
      try
      {
        ((g)localObject1).d(localCursor);
        localCursor.close();
        AppMethodBeat.o(5432);
        return localObject1;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.Fav.FavItemInfoStorage", localException, "", new Object[0]);
        ab.e("MicroMsg.Fav.FavItemInfoStorage", "getByFavId(%d),info.convertFrom error", new Object[] { Long.valueOf(paramLong) });
        localCursor.close();
        AppMethodBeat.o(5432);
        localObject2 = null;
        continue;
      }
      ab.w("MicroMsg.Fav.FavItemInfoStorage", "klem getByFavId:%d, no data", new Object[] { Long.valueOf(paramLong) });
      localCursor.close();
      AppMethodBeat.o(5432);
      Object localObject2 = null;
    }
  }

  public final boolean t(long paramLong, int paramInt)
  {
    AppMethodBeat.i(5437);
    String str = "select count(updateTime) from FavItemInfo where updateTime < ".concat(String.valueOf(paramLong));
    Object localObject = str;
    if (paramInt != -1)
      localObject = str + " and type = " + paramInt;
    localObject = this.bSd.a((String)localObject, null, 2);
    boolean bool;
    if (localObject == null)
    {
      AppMethodBeat.o(5437);
      bool = true;
    }
    while (true)
    {
      return bool;
      ((Cursor)localObject).moveToFirst();
      if (((Cursor)localObject).getInt(0) == 0)
      {
        ((Cursor)localObject).close();
        AppMethodBeat.o(5437);
        bool = true;
      }
      else
      {
        ((Cursor)localObject).close();
        AppMethodBeat.o(5437);
        bool = false;
      }
    }
  }

  public final long u(long paramLong, int paramInt)
  {
    AppMethodBeat.i(5438);
    if (this.bSd == null)
    {
      ab.e("MicroMsg.Fav.FavItemInfoStorage", "getNextUpdateTime, but db is null, return");
      AppMethodBeat.o(5438);
      paramLong = 0L;
    }
    while (true)
    {
      return paramLong;
      if (paramLong != 0L)
        break;
      localObject = "select updateTime from FavItemInfo where itemStatus > 0";
      if (paramInt != -1)
        localObject = "select updateTime from FavItemInfo where itemStatus > 0" + " and type = " + paramInt;
      localObject = (String)localObject + " order by updateTime desc limit 20";
      localObject = this.bSd.rawQuery((String)localObject, null);
      if (localObject == null)
      {
        AppMethodBeat.o(5438);
        paramLong = 0L;
      }
      else if (((Cursor)localObject).getCount() == 0)
      {
        ((Cursor)localObject).close();
        AppMethodBeat.o(5438);
        paramLong = 0L;
      }
      else
      {
        ((Cursor)localObject).moveToLast();
        paramLong = ((Cursor)localObject).getLong(0);
        ((Cursor)localObject).close();
        AppMethodBeat.o(5438);
      }
    }
    String str = "select updateTime from FavItemInfo where updateTime < ".concat(String.valueOf(paramLong));
    Object localObject = str;
    if (paramInt != -1)
      localObject = str + " and type = " + paramInt;
    localObject = (String)localObject + " and itemStatus > 0";
    localObject = (String)localObject + " order by updateTime desc limit 20";
    localObject = this.bSd.rawQuery((String)localObject, null);
    if ((localObject != null) && (((Cursor)localObject).getCount() > 0))
    {
      ((Cursor)localObject).moveToLast();
      paramLong = ((Cursor)localObject).getLong(0);
    }
    while (true)
    {
      if (localObject != null)
        ((Cursor)localObject).close();
      AppMethodBeat.o(5438);
      break;
    }
  }

  public final LinkedList<Integer> v(long paramLong, int paramInt)
  {
    AppMethodBeat.i(5440);
    LinkedList localLinkedList = new LinkedList();
    String str = "select id from FavItemInfo where updateTime >= ".concat(String.valueOf(paramLong));
    Object localObject = str;
    if (paramInt != -1)
      localObject = str + " and type = " + paramInt;
    localObject = (String)localObject + " and updateSeq > localSeq";
    localObject = (String)localObject + " order by updateTime desc";
    localObject = this.bSd.a((String)localObject, null, 2);
    if (localObject == null)
      AppMethodBeat.o(5440);
    while (true)
    {
      return localLinkedList;
      while (((Cursor)localObject).moveToNext())
        localLinkedList.add(Integer.valueOf(((Cursor)localObject).getInt(0)));
      ((Cursor)localObject).close();
      AppMethodBeat.o(5440);
    }
  }

  public final int vz(int paramInt)
  {
    int i = -1;
    AppMethodBeat.i(5456);
    Object localObject = "select count(*) from FavItemInfo where id>".concat(String.valueOf(paramInt));
    try
    {
      localObject = this.bSd.a((String)localObject, null, 2);
      if (localObject == null)
      {
        AppMethodBeat.o(5456);
        paramInt = i;
      }
      while (true)
      {
        return paramInt;
        if (((Cursor)localObject).getCount() == 0)
        {
          ((Cursor)localObject).close();
          AppMethodBeat.o(5456);
          paramInt = i;
        }
        else
        {
          ((Cursor)localObject).moveToNext();
          paramInt = ((Cursor)localObject).getInt(0);
          ((Cursor)localObject).close();
          AppMethodBeat.o(5456);
        }
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.w("MicroMsg.Fav.FavItemInfoStorage", "getFavHomePosition failed with throwable: " + localThrowable.getMessage());
        AppMethodBeat.o(5456);
        paramInt = i;
      }
    }
  }

  public final long w(long paramLong, int paramInt)
  {
    AppMethodBeat.i(5441);
    if (this.bSd == null)
    {
      ab.e("MicroMsg.Fav.FavItemInfoStorage", "getMinBatchGetUpdateTime, but db is null, return");
      AppMethodBeat.o(5441);
      paramLong = 0L;
    }
    while (true)
    {
      return paramLong;
      Object localObject;
      if (paramLong == 0L)
      {
        localObject = "select updateTime from (select * from FavItemInfo";
        if (paramInt != -1)
          localObject = "select updateTime from (select * from FavItemInfo" + " where type = " + paramInt;
        localObject = (String)localObject + " order by updateTime desc limit 20";
        localObject = (String)localObject + ") where updateSeq > localSeq";
        localObject = this.bSd.rawQuery((String)localObject, null);
        if (localObject == null)
        {
          AppMethodBeat.o(5441);
          paramLong = 0L;
        }
        else if (((Cursor)localObject).getCount() == 0)
        {
          ((Cursor)localObject).close();
          AppMethodBeat.o(5441);
          paramLong = 0L;
        }
        else
        {
          ((Cursor)localObject).moveToLast();
          paramLong = ((Cursor)localObject).getLong(0);
          ((Cursor)localObject).close();
          AppMethodBeat.o(5441);
        }
      }
      else
      {
        String str = "select updateTime from (select * from FavItemInfo where updateTime < ".concat(String.valueOf(paramLong));
        localObject = str;
        if (paramInt != -1)
          localObject = str + " and type = " + paramInt;
        localObject = (String)localObject + " order by updateTime desc limit 20";
        localObject = (String)localObject + ") where updateSeq > localSeq";
        localObject = this.bSd.rawQuery((String)localObject, null);
        if (localObject == null)
        {
          AppMethodBeat.o(5441);
          paramLong = 0L;
        }
        else if (((Cursor)localObject).getCount() == 0)
        {
          ((Cursor)localObject).close();
          AppMethodBeat.o(5441);
          paramLong = 0L;
        }
        else
        {
          ((Cursor)localObject).moveToLast();
          paramLong = ((Cursor)localObject).getLong(0);
          ((Cursor)localObject).close();
          AppMethodBeat.o(5441);
        }
      }
    }
  }

  public final boolean y(g paramg)
  {
    AppMethodBeat.i(5435);
    boolean bool;
    abl localabl;
    if (paramg.field_localId > 0L)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramg.field_favProto.wit != null)
      {
        localabl = paramg.field_favProto.wit;
        if (localabl.cvp > 0)
          break label162;
        ab.w("MicroMsg.Fav.FavItemInfoStorage", "insert::favid %d favlocalid %d type %d, sourceTypeError %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_type), Integer.valueOf(localabl.cvp) });
        localabl.LN(1);
      }
    }
    while (true)
    {
      b.a(paramg);
      bool = a(paramg, false);
      if (bool)
        b(paramg.field_localId, 2, Long.valueOf(paramg.field_localId));
      AppMethodBeat.o(5435);
      return bool;
      bool = false;
      break;
      label162: localabl.LN(localabl.cvp);
    }
  }

  public final void z(g paramg)
  {
    AppMethodBeat.i(5446);
    String str = "delete from FavItemInfo where localId = " + paramg.field_localId;
    ab.i("MicroMsg.Fav.FavItemInfoStorage", "delete sql: ".concat(String.valueOf(str)));
    this.bSd.hY("FavItemInfo", str);
    b(paramg.field_localId, 5, Long.valueOf(paramg.field_localId));
    AppMethodBeat.o(5446);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.f.d
 * JD-Core Version:    0.6.2
 */