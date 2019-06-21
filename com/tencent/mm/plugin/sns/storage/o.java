package com.tencent.mm.plugin.sns.storage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.a.rk;
import com.tencent.mm.g.a.rk.a;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.sns.b.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class o extends j<n>
  implements g
{
  public static final String[] diI;
  public static final String[] fnj;
  private static ArrayList<Integer> rfA;
  private static ArrayList<Integer> rfB;
  private static String[] rfl;
  private static String rfm;
  public static String rfn;
  public static String rfo;
  private static String rfp;
  public static String rfq;
  public static String rfr;
  public static String rfs;
  public static String rft;
  protected static String rfu;
  protected static String rfv;
  private static String rfw;
  private static String rfx;
  private static String rfy;
  protected static String rfz;
  public com.tencent.mm.sdk.e.e bSd;
  private boolean rfj;
  private int rfk;

  static
  {
    AppMethodBeat.i(37969);
    fnj = new String[] { j.a(n.ccO, "SnsInfo") };
    rfl = new String[] { "snsId", "userName", "localFlag", "createTime", "head", "localPrivate", "type", "sourceType", "likeFlag", "pravited", "stringSeq", "content", "attrBuf", "postBuf", "rowid" };
    diI = new String[] { "CREATE INDEX IF NOT EXISTS serverSnsNameIndex ON SnsInfo ( snsId )", "CREATE INDEX IF NOT EXISTS serverSnsTimeHeadIndex ON SnsInfo ( head )", "DROP INDEX IF EXISTS serverSnsTimeIndex", "DROP INDEX IF EXISTS serverSnsTimeSourceTypeIndex", "CREATE INDEX IF NOT EXISTS snsMultiIndex1 ON SnsInfo ( createTime,snsId,sourceType,type)", "CREATE INDEX IF NOT EXISTS snsMultiIndex2 ON SnsInfo ( sourceType,type,userName)", "CREATE INDEX IF NOT EXISTS snsLocalflagIndex ON SnsInfo ( localFlag )" };
    rfm = "";
    rfn = " order by SnsInfo.createTime desc ,snsId desc";
    rfo = " order by SnsInfo.createTime asc ,snsId asc";
    rfp = " order by SnsInfo.createTime asc ,snsId asc";
    rfq = " order by SnsInfo.head desc ,SnsInfo.createTime desc ";
    rfr = " order by SnsInfo.head desc ,snsId desc";
    rfs = null;
    rft = null;
    rfu = " (sourceType & 2 != 0 ) ";
    rfv = " (sourceType & 2 != 0 ) and type < 21";
    rfw = null;
    rfx = null;
    rfy = null;
    rfz = null;
    rfA = dm(Arrays.asList(new Integer[] { Integer.valueOf(16), Integer.valueOf(32), Integer.valueOf(2), Integer.valueOf(8), Integer.valueOf(64), Integer.valueOf(128), Integer.valueOf(256) }));
    rfB = dm(Arrays.asList(new Integer[] { Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(8) }));
    rfm = "select ";
    int i = 0;
    if (i < rfl.length)
    {
      if (i < rfl.length - 1);
      for (rfm = rfm + " " + rfl[i] + ","; ; rfm = rfm + " " + rfl[i] + " ")
      {
        i++;
        break;
      }
    }
    ab.i("MicroMsg.SnsInfoStorage", "TIMELINE_SELECT_BEGIN " + rfm);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = rfA.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if (((i & 0x10) != 0) && ((i & 0x20) == 0))
        localArrayList.add(Integer.valueOf(i));
    }
    rfs = f(localArrayList, "localFlag");
    ab.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", new Object[] { rfs });
    localArrayList.clear();
    localIterator = rfA.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if ((i & 0x20) != 0)
        localArrayList.add(Integer.valueOf(i));
    }
    rft = f(localArrayList, "localFlag");
    ab.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", new Object[] { rft });
    localArrayList.clear();
    localIterator = rfA.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if (((i & 0x40) == 0) && ((i & 0x20) != 0))
        localArrayList.add(Integer.valueOf(i));
    }
    rfy = f(localArrayList, "localFlag");
    localArrayList.clear();
    localIterator = rfB.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if ((i & 0x8) != 0)
        localArrayList.add(Integer.valueOf(i));
    }
    rfx = f(localArrayList, "sourceType");
    ab.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", new Object[] { rfx });
    localArrayList.clear();
    localIterator = rfB.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if ((i & 0x2) != 0)
        localArrayList.add(Integer.valueOf(i));
    }
    rfu = f(localArrayList, "sourceType");
    ab.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", new Object[] { rfu });
    localArrayList.clear();
    localIterator = rfB.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if ((i & 0x4) != 0)
        localArrayList.add(Integer.valueOf(i));
    }
    rfw = f(localArrayList, "sourceType");
    ab.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", new Object[] { rfw });
    localArrayList.clear();
    localIterator = rfA.iterator();
    while (localIterator.hasNext())
    {
      i = ((Integer)localIterator.next()).intValue();
      if ((i & 0x100) != 0)
        localArrayList.add(Integer.valueOf(i));
    }
    rfz = b(localArrayList, "localFlag", true);
    AppMethodBeat.o(37969);
  }

  public o(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, n.ccO, "SnsInfo", diI);
    AppMethodBeat.i(37921);
    this.bSd = parame;
    parame = this.bSd.a("select count(*) from SnsInfo where snsId > 0;", null, 2);
    int i;
    if (parame.moveToFirst())
    {
      i = parame.getInt(0);
      if (i > 0)
      {
        ab.i("MicroMsg.SnsInfoStorage", "exsits snsId > 0  ,count is %d", new Object[] { Integer.valueOf(i) });
        parame.close();
        i = 1;
        if (i != 0)
          break label134;
        label92: this.rfj = bool;
        this.rfk = 0;
        if (!this.rfj)
          break label139;
        ab.i("MicroMsg.SnsInfoStorage", "all sndId < 0 ,so optimalizeForSnsId");
        AppMethodBeat.o(37921);
      }
    }
    while (true)
    {
      return;
      parame.close();
      i = 0;
      break;
      label134: bool = false;
      break label92;
      label139: rfn = " order by SnsInfo.createTime desc ,case when snsId < 0 then 0 else 1 end ,  snsId desc";
      rfo = " order by SnsInfo.createTime asc ,case when snsId < 0 then 0 else 1 end ,  snsId asc";
      rfq = " order by SnsInfo.head desc ,SnsInfo.createTime desc ";
      rfr = " order by SnsInfo.head desc ,case when snsId < 0 then 0 else 1 end ,  snsId desc";
      AppMethodBeat.o(37921);
    }
  }

  private void Za(String paramString)
  {
    AppMethodBeat.i(37928);
    paramString = "UPDATE SnsInfo SET sourceType = sourceType & -3".concat(String.valueOf(paramString));
    ab.d("MicroMsg.SnsInfoStorage", "updateFilterTimeLine sql ".concat(String.valueOf(paramString)));
    this.bSd.hY("SnsInfo", paramString);
    AppMethodBeat.o(37928);
  }

  public static boolean Zb(String paramString)
  {
    AppMethodBeat.i(37931);
    boolean bool;
    if ((paramString == null) || (paramString.equals("")))
    {
      bool = false;
      AppMethodBeat.o(37931);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(37931);
    }
  }

  private static long Zd(String paramString)
  {
    AppMethodBeat.i(37933);
    long l = new BigInteger(paramString).longValue();
    ab.i("MicroMsg.SnsInfoStorage", "seq %s to snsId %d ", new Object[] { paramString, Long.valueOf(l) });
    AppMethodBeat.o(37933);
    return l;
  }

  private static String b(List<Integer> paramList, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(37919);
    StringBuilder localStringBuilder = new StringBuilder("(");
    if (paramBoolean)
      localStringBuilder.append(paramString + " not in (");
    while (true)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localStringBuilder.append(paramList.next());
        if (paramList.hasNext())
          localStringBuilder.append(",");
      }
      localStringBuilder.append(paramString + " in (");
    }
    localStringBuilder.append(")");
    localStringBuilder.append(")");
    paramList = localStringBuilder.toString();
    AppMethodBeat.o(37919);
    return paramList;
  }

  public static String bm(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(37936);
    if (paramBoolean);
    for (paramString = "" + " WHERE " + rfw; ; paramString = paramString + " AND " + rfx)
    {
      AppMethodBeat.o(37936);
      return paramString;
      paramString = "" + " WHERE SnsInfo.userName=\"" + bo.vA(paramString) + "\"";
    }
  }

  public static String bn(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(37937);
    paramString = "select *,rowid from SnsInfo " + bm(paramString, paramBoolean);
    paramString = paramString + " AND type in ( 1,2 , 3 , 4 , 18 , 5 , 12 , 9 , 14 , 15 , 13 , 21 , 25 , 26)";
    AppMethodBeat.o(37937);
    return paramString;
  }

  public static String bp(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(37966);
    paramString = "select *,rowid from SnsInfo " + bm(paramString, paramBoolean);
    paramString = paramString + " AND type in ( 1 , 15)";
    AppMethodBeat.o(37966);
    return paramString;
  }

  private long c(String paramString, long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(37940);
    Object localObject;
    if (paramLong != 0L)
    {
      localObject = i.Xl(i.jV(paramLong));
      paramString = paramString + " AND SnsInfo.stringSeq < '" + (String)localObject + "'";
    }
    while (true)
    {
      localObject = paramString;
      if (paramBoolean)
        localObject = paramString + " AND  (snsId != 0 ) ";
      paramString = (String)localObject + rfn;
      paramString = paramString + " limit " + paramInt;
      ab.d("MicroMsg.SnsInfoStorage", "getMinSeqByLimit %s \n maxId=%s", new Object[] { paramString, Long.valueOf(paramLong) });
      localObject = this.bSd.rawQuery(paramString, null);
      if (((Cursor)localObject).moveToLast())
      {
        paramString = new n();
        paramString.d((Cursor)localObject);
        ((Cursor)localObject).close();
        paramLong = paramString.field_snsId;
        AppMethodBeat.o(37940);
      }
      while (true)
      {
        return paramLong;
        ((Cursor)localObject).close();
        AppMethodBeat.o(37940);
        paramLong = 0L;
      }
    }
  }

  private static boolean crh()
  {
    AppMethodBeat.i(37916);
    rk localrk = new rk();
    a.xxA.m(localrk);
    boolean bool = localrk.cNs.cNt;
    AppMethodBeat.o(37916);
    return bool;
  }

  private static String cri()
  {
    AppMethodBeat.i(37917);
    String str;
    if (crh())
    {
      str = " (sourceType & 2 != 0 ) and type < 21";
      AppMethodBeat.o(37917);
    }
    while (true)
    {
      return str;
      str = " (sourceType & 2 != 0 ) ";
      AppMethodBeat.o(37917);
    }
  }

  public static String crk()
  {
    AppMethodBeat.i(37941);
    String str = "select *,rowid from SnsInfo  where " + " (sourceType & 2 != 0 ) ";
    AppMethodBeat.o(37941);
    return str;
  }

  public static String crl()
  {
    AppMethodBeat.i(37942);
    String str = "select *,rowid from SnsInfo  where " + cri();
    AppMethodBeat.o(37942);
    return str;
  }

  public static String crm()
  {
    AppMethodBeat.i(37943);
    StringBuilder localStringBuilder = new StringBuilder().append("select *,rowid from SnsInfo  where ");
    if (crh());
    for (String str = rfv; ; str = rfu)
    {
      str = str;
      AppMethodBeat.o(37943);
      return str;
    }
  }

  public static String crn()
  {
    AppMethodBeat.i(37944);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("select snsId from SnsInfo  where ").append(cri()).append(" limit 3");
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(37944);
    return localObject;
  }

  private static ArrayList<Integer> dm(List<Integer> paramList)
  {
    AppMethodBeat.i(37920);
    Object localObject = new ArrayList(paramList);
    paramList = new HashSet();
    ArrayList localArrayList1 = new ArrayList();
    Iterator localIterator = ((ArrayList)localObject).iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      ArrayList localArrayList2 = new ArrayList();
      localObject = paramList.iterator();
      while (((Iterator)localObject).hasNext())
        localArrayList2.add(Integer.valueOf(((Integer)((Iterator)localObject).next()).intValue() | localInteger.intValue()));
      paramList.addAll(new HashSet(localArrayList2));
      paramList.add(localInteger);
    }
    paramList.add(Integer.valueOf(0));
    localArrayList1.addAll(paramList);
    AppMethodBeat.o(37920);
    return localArrayList1;
  }

  private static String f(List<Integer> paramList, String paramString)
  {
    AppMethodBeat.i(37918);
    paramList = b(paramList, paramString, false);
    AppMethodBeat.o(37918);
    return paramList;
  }

  public final int A(n paramn)
  {
    AppMethodBeat.i(37922);
    ab.d("MicroMsg.SnsInfoStorage", "SnsInfo Insert");
    int i;
    if (paramn == null)
    {
      i = -1;
      AppMethodBeat.o(37922);
    }
    while (true)
    {
      return i;
      paramn = paramn.Hl();
      i = (int)this.bSd.insert("SnsInfo", "", paramn);
      ab.d("MicroMsg.SnsInfoStorage", "SnsInfo Insert result ".concat(String.valueOf(i)));
      AppMethodBeat.o(37922);
    }
  }

  public final boolean B(n paramn)
  {
    AppMethodBeat.i(37955);
    if (paramn.DI(32))
    {
      bool = af.cnI().a(paramn.crd());
      AppMethodBeat.o(37955);
      return bool;
    }
    paramn = paramn.Hl();
    if (this.bSd.replace("SnsInfo", "", paramn) > 0L);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.SnsInfoStorage", "SnsInfo replace result ".concat(String.valueOf(bool)));
      AppMethodBeat.o(37955);
      break;
    }
  }

  public final boolean CJ(int paramInt)
  {
    AppMethodBeat.i(37954);
    boolean bool;
    if (DK(paramInt) != null)
    {
      bool = true;
      AppMethodBeat.o(37954);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37954);
    }
  }

  public final n DK(int paramInt)
  {
    AppMethodBeat.i(37958);
    n localn = new n();
    Object localObject = "select *,rowid from SnsInfo  where SnsInfo.rowid=".concat(String.valueOf(paramInt));
    localObject = this.bSd.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localn.d((Cursor)localObject);
      ((Cursor)localObject).close();
      AppMethodBeat.o(37958);
    }
    while (true)
    {
      return localn;
      ((Cursor)localObject).close();
      AppMethodBeat.o(37958);
      localn = null;
    }
  }

  public final boolean DL(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(37963);
    if (this.bSd.delete("SnsInfo", "rowid=?", new String[] { String.valueOf(paramInt) }) > 0)
      AppMethodBeat.o(37963);
    while (true)
    {
      return bool;
      AppMethodBeat.o(37963);
      bool = false;
    }
  }

  public final Cursor WY(String paramString)
  {
    AppMethodBeat.i(37947);
    String str1 = crl();
    String str2 = str1;
    if (Zb(paramString))
      str2 = str1 + " AND " + Zc(paramString);
    paramString = str2 + rfn;
    ab.d("MicroMsg.SnsInfoStorage", "getCursorForTimeLine ".concat(String.valueOf(paramString)));
    paramString = this.bSd.rawQuery(paramString, null);
    AppMethodBeat.o(37947);
    return paramString;
  }

  public final n YS(String paramString)
  {
    AppMethodBeat.i(37957);
    if (v.WT(paramString))
    {
      paramString = kD(v.Zm(paramString));
      AppMethodBeat.o(37957);
    }
    while (true)
    {
      return paramString;
      paramString = af.cnI().ku(v.Zm(paramString));
      if (paramString != null)
      {
        paramString = paramString.cqB();
        AppMethodBeat.o(37957);
      }
      else
      {
        paramString = null;
        AppMethodBeat.o(37957);
      }
    }
  }

  public final n YT(String paramString)
  {
    AppMethodBeat.i(37959);
    if (v.WT(paramString))
    {
      paramString = DK(v.Zn(paramString));
      AppMethodBeat.o(37959);
    }
    while (true)
    {
      return paramString;
      paramString = af.cnI().DG(v.Zn(paramString));
      if (paramString != null)
      {
        paramString = paramString.cqB();
        AppMethodBeat.o(37959);
      }
      else
      {
        paramString = null;
        AppMethodBeat.o(37959);
      }
    }
  }

  public final void YY(String paramString)
  {
    AppMethodBeat.i(37926);
    if (!Zb(paramString))
      AppMethodBeat.o(37926);
    while (true)
    {
      return;
      Za(" where " + Zf(paramString) + " and " + cri() + " and  (snsId != 0  ) ");
      AppMethodBeat.o(37926);
    }
  }

  public final void YZ(String paramString)
  {
    AppMethodBeat.i(37927);
    if (!Zb(paramString))
      AppMethodBeat.o(37927);
    while (true)
    {
      return;
      Za(" where " + Ze(paramString) + " and " + cri() + " and  (snsId != 0  ) ");
      AppMethodBeat.o(37927);
    }
  }

  public final String Zc(String paramString)
  {
    AppMethodBeat.i(37932);
    if ((paramString == null) || (paramString.equals("")))
    {
      paramString = " ";
      AppMethodBeat.o(37932);
    }
    while (true)
    {
      return paramString;
      if (this.rfj)
      {
        paramString = " (snsId >= " + Zd(bo.vA(paramString)) + " ) ";
        AppMethodBeat.o(37932);
      }
      else
      {
        paramString = " (stringSeq >=\"" + bo.vA(paramString) + "\"  ) ";
        AppMethodBeat.o(37932);
      }
    }
  }

  public final String Ze(String paramString)
  {
    AppMethodBeat.i(37934);
    if ((paramString == null) || (paramString.equals("")))
    {
      paramString = " ";
      AppMethodBeat.o(37934);
    }
    while (true)
    {
      return paramString;
      if (this.rfj)
      {
        paramString = " (snsId > " + Zd(bo.vA(paramString)) + " ) ";
        AppMethodBeat.o(37934);
      }
      else
      {
        paramString = " (stringSeq >\"" + bo.vA(paramString) + "\"  ) ";
        AppMethodBeat.o(37934);
      }
    }
  }

  public final String Zf(String paramString)
  {
    AppMethodBeat.i(37935);
    if ((paramString == null) || (paramString.equals("")))
    {
      paramString = " ";
      AppMethodBeat.o(37935);
    }
    while (true)
    {
      return paramString;
      if (this.rfj)
      {
        paramString = " (snsId < " + Zd(bo.vA(paramString)) + " ) ";
        AppMethodBeat.o(37935);
      }
      else
      {
        paramString = " (stringSeq <\"" + bo.vA(paramString) + "\"  ) ";
        AppMethodBeat.o(37935);
      }
    }
  }

  public final int Zg(String paramString)
  {
    AppMethodBeat.i(37949);
    Object localObject1 = crl();
    Object localObject2 = localObject1;
    if (Zb(paramString))
      localObject2 = (String)localObject1 + " AND " + Zc(paramString);
    paramString = (String)localObject2 + " AND  (snsId != 0 ) ";
    localObject2 = paramString + rfo + " limit 1";
    localObject1 = this.bSd.a((String)localObject2, null, 2);
    int i = 0;
    if (((Cursor)localObject1).moveToFirst())
    {
      paramString = new n();
      paramString.d((Cursor)localObject1);
      i = paramString.field_createTime;
    }
    ((Cursor)localObject1).close();
    ab.i("MicroMsg.SnsInfoStorage", "getLastTime " + (String)localObject2 + " createtime " + i);
    AppMethodBeat.o(37949);
    return i;
  }

  public final long a(long paramLong, int paramInt, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(37939);
    paramLong = c(bn(paramString, paramBoolean), paramLong, paramInt, false);
    AppMethodBeat.o(37939);
    return paramLong;
  }

  public final boolean a(long paramLong, n paramn)
  {
    AppMethodBeat.i(37930);
    boolean bool;
    if (kv(paramLong))
    {
      bool = b(paramLong, paramn);
      AppMethodBeat.o(37930);
    }
    while (true)
    {
      return bool;
      if (A(paramn) != -1)
      {
        bool = true;
        AppMethodBeat.o(37930);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(37930);
      }
    }
  }

  public final Cursor ah(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37951);
    Object localObject = rfm + " from SnsInfo where ";
    String str = (String)localObject + cri();
    localObject = str;
    if (Zb(paramString))
      localObject = str + " AND " + Zc(paramString);
    localObject = (String)localObject + " AND createTime >= " + paramInt1;
    localObject = (String)localObject + " UNION ";
    localObject = (String)localObject + rfm + " from AdSnsInfo where createTime > " + paramInt1 + " and " + rfz;
    localObject = (String)localObject + rfn;
    localObject = (String)localObject + " limit " + paramInt2;
    ab.d("MicroMsg.SnsInfoStorage", "getAdCursorForTimeLine " + (String)localObject + " limtiSeq: " + paramString);
    paramString = this.bSd.rawQuery((String)localObject, null);
    AppMethodBeat.o(37951);
    return paramString;
  }

  public final int b(int paramInt, n paramn)
  {
    AppMethodBeat.i(37961);
    paramn = paramn.Hl();
    paramn.remove("rowid");
    paramInt = this.bSd.update("SnsInfo", paramn, "rowid=?", new String[] { String.valueOf(paramInt) });
    AppMethodBeat.o(37961);
    return paramInt;
  }

  public final Cursor b(String paramString1, int paramInt, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(37946);
    String str = bn(paramString1, paramBoolean);
    paramString1 = str;
    if (Zb(paramString2))
      paramString1 = str + " AND " + Zc(paramString2);
    if (paramBoolean);
    for (paramString1 = paramString1 + rfq; ; paramString1 = paramString1 + rfr)
    {
      paramString2 = paramString1;
      if (paramInt > 0)
        paramString2 = paramString1 + " LIMIT " + paramInt;
      ab.d("MicroMsg.SnsInfoStorage", "getCursorByUserName in gallery ".concat(String.valueOf(paramString2)));
      paramString1 = this.bSd.rawQuery(paramString2, null);
      AppMethodBeat.o(37946);
      return paramString1;
    }
  }

  public final boolean b(long paramLong, n paramn)
  {
    boolean bool = true;
    AppMethodBeat.i(37960);
    paramn = paramn.Hl();
    paramn.remove("rowid");
    if (this.bSd.update("SnsInfo", paramn, "snsId=?", new String[] { String.valueOf(paramLong) }) > 0)
      AppMethodBeat.o(37960);
    while (true)
    {
      return bool;
      AppMethodBeat.o(37960);
      bool = false;
    }
  }

  public final List<n> bo(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(37948);
    paramString = "select *,rowid from SnsInfo " + bm(paramString, paramBoolean) + " AND type = 4";
    Cursor localCursor = this.bSd.a(paramString, null, 2);
    paramString = new ArrayList();
    while (localCursor.moveToNext())
    {
      n localn = new n();
      localn.d(localCursor);
      paramString.add(localn);
    }
    localCursor.close();
    AppMethodBeat.o(37948);
    return paramString;
  }

  public final ArrayList<Long> cmn()
  {
    // Byte code:
    //   0: ldc_w 717
    //   3: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 204	java/util/ArrayList
    //   9: dup
    //   10: invokespecial 205	java/util/ArrayList:<init>	()V
    //   13: astore_1
    //   14: aload_0
    //   15: getfield 256	com/tencent/mm/plugin/sns/storage/o:bSd	Lcom/tencent/mm/sdk/e/e;
    //   18: astore_2
    //   19: new 175	java/lang/StringBuilder
    //   22: dup
    //   23: ldc_w 719
    //   26: invokespecial 197	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   29: getstatic 149	com/tencent/mm/plugin/sns/storage/o:rfy	Ljava/lang/String;
    //   32: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   38: astore_3
    //   39: invokestatic 724	java/lang/System:currentTimeMillis	()J
    //   42: ldc2_w 725
    //   45: ldiv
    //   46: l2i
    //   47: istore 4
    //   49: aload_2
    //   50: ldc 55
    //   52: iconst_2
    //   53: anewarray 47	java/lang/String
    //   56: dup
    //   57: iconst_0
    //   58: ldc_w 728
    //   61: aastore
    //   62: dup
    //   63: iconst_1
    //   64: ldc 91
    //   66: aastore
    //   67: aload_3
    //   68: iconst_1
    //   69: anewarray 47	java/lang/String
    //   72: dup
    //   73: iconst_0
    //   74: iload 4
    //   76: ldc_w 729
    //   79: isub
    //   80: invokestatic 499	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   83: aastore
    //   84: aconst_null
    //   85: aconst_null
    //   86: ldc_w 731
    //   89: iconst_2
    //   90: invokeinterface 734 9 0
    //   95: astore_2
    //   96: aload_2
    //   97: invokeinterface 712 1 0
    //   102: ifeq +102 -> 204
    //   105: new 49	com/tencent/mm/plugin/sns/storage/n
    //   108: astore 5
    //   110: aload 5
    //   112: invokespecial 412	com/tencent/mm/plugin/sns/storage/n:<init>	()V
    //   115: aload 5
    //   117: aload_2
    //   118: invokevirtual 415	com/tencent/mm/plugin/sns/storage/n:d	(Landroid/database/Cursor;)V
    //   121: aload 5
    //   123: getfield 737	com/tencent/mm/plugin/sns/storage/n:reX	I
    //   126: iconst_m1
    //   127: if_icmpeq -31 -> 96
    //   130: aload 5
    //   132: getfield 740	com/tencent/mm/plugin/sns/storage/n:field_userName	Ljava/lang/String;
    //   135: invokestatic 745	com/tencent/mm/model/r:Yz	()Ljava/lang/String;
    //   138: invokevirtual 315	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   141: ifeq -45 -> 96
    //   144: aload_1
    //   145: aload 5
    //   147: getfield 737	com/tencent/mm/plugin/sns/storage/n:reX	I
    //   150: i2l
    //   151: invokestatic 332	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   154: invokevirtual 227	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   157: pop
    //   158: new 175	java/lang/StringBuilder
    //   161: astore_3
    //   162: aload_3
    //   163: ldc_w 747
    //   166: invokespecial 197	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   169: ldc 192
    //   171: aload_3
    //   172: aload 5
    //   174: invokevirtual 750	com/tencent/mm/plugin/sns/storage/n:cqU	()Ljava/lang/String;
    //   177: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   183: invokestatic 305	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   186: goto -90 -> 96
    //   189: astore_1
    //   190: aload_2
    //   191: invokeinterface 277 1 0
    //   196: ldc_w 717
    //   199: invokestatic 248	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   202: aload_1
    //   203: athrow
    //   204: aload_2
    //   205: invokeinterface 277 1 0
    //   210: ldc 192
    //   212: ldc_w 752
    //   215: iconst_1
    //   216: anewarray 235	java/lang/Object
    //   219: dup
    //   220: iconst_0
    //   221: aload_1
    //   222: invokevirtual 755	java/util/ArrayList:size	()I
    //   225: invokestatic 157	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   228: aastore
    //   229: invokestatic 404	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   232: ldc_w 717
    //   235: invokestatic 248	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   238: aload_1
    //   239: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   96	186	189	finally
  }

  public final void crj()
  {
    AppMethodBeat.i(37925);
    Za(" where " + cri() + " AND  (snsId != 0  ) ");
    AppMethodBeat.o(37925);
  }

  public final long d(long paramLong, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(37965);
    paramLong = c(bp(paramString, paramBoolean), paramLong, 30, false);
    AppMethodBeat.o(37965);
    return paramLong;
  }

  public final void d(String paramString1, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(37923);
    String str = bm(paramString1, paramBoolean) + " AND  (snsId != 0  ) ";
    paramString1 = str;
    if (Zb(paramString2))
      paramString1 = str + " AND " + Zf(paramString2);
    q(paramBoolean, paramString1);
    AppMethodBeat.o(37923);
  }

  public final boolean delete(long paramLong)
  {
    boolean bool = true;
    AppMethodBeat.i(37962);
    int i = this.bSd.delete("SnsInfo", "snsId=?", new String[] { String.valueOf(paramLong) });
    ab.d("MicroMsg.SnsInfoStorage", "del msg " + paramLong + " res " + i);
    if (i > 0)
      AppMethodBeat.o(37962);
    while (true)
    {
      return bool;
      AppMethodBeat.o(37962);
      bool = false;
    }
  }

  public final Cursor df(String paramString, int paramInt)
  {
    AppMethodBeat.i(37950);
    Object localObject = rfm + " from SnsInfo where ";
    String str = (String)localObject + cri();
    localObject = str;
    if (Zb(paramString))
      localObject = str + " AND " + Zc(paramString);
    localObject = (String)localObject + " AND createTime >= " + paramInt;
    localObject = (String)localObject + " UNION ";
    localObject = (String)localObject + rfm + " from AdSnsInfo where createTime > " + paramInt + " and " + rfz;
    localObject = (String)localObject + rfn;
    ab.d("MicroMsg.SnsInfoStorage", "getAdCursorForTimeLine " + (String)localObject + " limtiSeq: " + paramString);
    paramString = this.bSd.rawQuery((String)localObject, null);
    AppMethodBeat.o(37950);
    return paramString;
  }

  public final Cursor e(String paramString1, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(37945);
    paramString1 = b(paramString1, 0, paramBoolean, paramString2);
    AppMethodBeat.o(37945);
    return paramString1;
  }

  public final long g(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(37938);
    paramLong = c(crl(), paramLong, paramInt, paramBoolean);
    AppMethodBeat.o(37938);
    return paramLong;
  }

  public final void jR(long paramLong)
  {
    AppMethodBeat.i(37952);
    ah.getContext().getSharedPreferences(ah.doA(), 0).edit().putLong("check_trim_time", 0L).commit();
    h localh = af.Ru();
    long l = localh.iV(Thread.currentThread().getId());
    for (int i = 0; i < paramLong; i++)
      localh.hY("SnsInfo", "INSERT INTO SnsInfo VALUES(-69999999991777434909,'miaochanchan',2,1402026897,20140606,0,2,2,0,0,'0',X'0A143131373631303534303431393332313136373037120C6D69616F6368616E6368616E18002091F7C49C052A36E8A681E6849FE8B0A2E8BF99E4BBBDE5B7A5EFBC8CE8AEA9E68891E4B88DE4BC9AE69C89E5A29EE882A5E79A84E8BFB9E8B1A1E3808232180D0000000015000000001A0022002A0032003800480050003A0A0A0012001A0022002A0042080A0010021A0022004A0052005A006000680272007A2408001200180022002A0032003A080A0012001A00220042004A040800100052040A001200',X'08E3E5A48CEA8AEA9BA301120C6D69616F6368616E6368616E1A09E88B97E7B1B3E7B1B32091F7C49C052A04080012003000380040005000580068007000800101880100900100A00101B00100B80100',NULL);");
    for (i = 0; i < 20000L; i++)
      localh.hY("snsExtInfo3", String.format("INSERT INTO snsExtInfo3 VALUES('zeustest%d','afd',2,1402026897,'d', 0,1, 1, 1, 1, 'a', 'a', NULL);", new Object[] { Integer.valueOf(i) }));
    for (i = 0; i < 20000L; i++)
      localh.hY("snsComment", String.format("INSERT INTO snsComment VALUES(-69999999991777434909,0,2,1402026897,'d', 2,1, 'a', 'b', 1, NULL);", new Object[0]));
    localh.mB(l);
    AppMethodBeat.o(37952);
  }

  public final int jS(long paramLong)
  {
    AppMethodBeat.i(37964);
    n localn = af.cnF().kD(paramLong);
    int i;
    if (localn == null)
    {
      i = 0;
      AppMethodBeat.o(37964);
    }
    while (true)
    {
      return i;
      i = localn.cre();
      AppMethodBeat.o(37964);
    }
  }

  public final n kD(long paramLong)
  {
    AppMethodBeat.i(37956);
    n localn = new n();
    Object localObject = "select *,rowid from SnsInfo  where SnsInfo.snsId=" + paramLong + " limit 1";
    localObject = this.bSd.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localn.d((Cursor)localObject);
      ((Cursor)localObject).close();
      AppMethodBeat.o(37956);
    }
    while (true)
    {
      return localn;
      ((Cursor)localObject).close();
      AppMethodBeat.o(37956);
      localn = null;
    }
  }

  public final boolean kv(long paramLong)
  {
    AppMethodBeat.i(37929);
    Object localObject = "select *,rowid from SnsInfo  where SnsInfo.snsId=".concat(String.valueOf(paramLong));
    localObject = this.bSd.rawQuery((String)localObject, null);
    int i = ((Cursor)localObject).getCount();
    ((Cursor)localObject).close();
    boolean bool;
    if (i > 0)
    {
      bool = true;
      AppMethodBeat.o(37929);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37929);
    }
  }

  public final void q(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(37924);
    if (paramBoolean);
    for (int i = 4; ; i = 8)
    {
      paramString = "UPDATE SnsInfo SET sourceType = sourceType & " + (i ^ 0xFFFFFFFF) + paramString;
      ab.d("MicroMsg.SnsInfoStorage", "updateFilterUserName sql ".concat(String.valueOf(paramString)));
      this.bSd.hY("SnsInfo", paramString);
      AppMethodBeat.o(37924);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.o
 * JD-Core Version:    0.6.2
 */