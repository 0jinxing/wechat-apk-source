package com.tencent.mm.aj;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.notification.b.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class e extends com.tencent.mm.sdk.e.j<d>
{
  public static final String[] diI;
  public static final String[] fnj;
  public static Map<String, String> fwe;
  private final l<e.a, e.a.b> fuL;

  static
  {
    AppMethodBeat.i(11358);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(d.ccO, "bizinfo") };
    fwe = new HashMap();
    diI = new String[] { "CREATE  INDEX IF NOT EXISTS type_username_index ON bizinfo ( type,username ) ", "CREATE  INDEX IF NOT EXISTS  username_acceptType_index ON bizinfo ( username,acceptType ) " };
    AppMethodBeat.o(11358);
  }

  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, d.ccO, "bizinfo", diI);
    AppMethodBeat.i(11326);
    this.fuL = new e.1(this);
    AppMethodBeat.o(11326);
  }

  public static Cursor F(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(11348);
    StringBuilder localStringBuilder = new StringBuilder();
    b(localStringBuilder);
    c(localStringBuilder);
    a(localStringBuilder, paramString);
    b(localStringBuilder, true);
    if (paramBoolean)
      a(localStringBuilder, false);
    localStringBuilder.append(" order by ");
    localStringBuilder.append(aeu());
    paramString = localStringBuilder.toString();
    ab.i("MicroMsg.BizInfoStorage", "getEnterpriseEnableChild sql %s", new Object[] { paramString });
    paramString = g.RP().eJN.a(paramString, null, 0);
    AppMethodBeat.o(11348);
    return paramString;
  }

  public static Cursor V(String paramString, int paramInt)
  {
    AppMethodBeat.i(11345);
    StringBuilder localStringBuilder = new StringBuilder();
    b(localStringBuilder);
    c(localStringBuilder);
    a(localStringBuilder, paramString);
    a(localStringBuilder, false);
    b(localStringBuilder, true);
    localStringBuilder.append(" and (bizinfo.acceptType & ").append(paramInt).append(") > 0 ");
    localStringBuilder.append(" order by ");
    localStringBuilder.append(aet());
    paramString = localStringBuilder.toString();
    ab.i("MicroMsg.BizInfoStorage", "getEnterpriseChildOfAcceptType sql %s", new Object[] { paramString });
    paramString = g.RP().eJN.a(paramString, null, 0);
    AppMethodBeat.o(11345);
    return paramString;
  }

  public static void a(StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(11338);
    paramStringBuilder.append("select bizinfo.username ");
    AppMethodBeat.o(11338);
  }

  private static void a(StringBuilder paramStringBuilder, String paramString)
  {
    AppMethodBeat.i(11342);
    paramStringBuilder.append(" and bizinfo.type = 3");
    paramStringBuilder.append(" and bizinfo.enterpriseFather = '").append(paramString).append("' ");
    AppMethodBeat.o(11342);
  }

  public static void a(StringBuilder paramStringBuilder, boolean paramBoolean)
  {
    AppMethodBeat.i(11343);
    paramStringBuilder.append(" and (bizinfo.bitFlag & 1) ");
    if (paramBoolean);
    for (String str = "!="; ; str = "==")
    {
      paramStringBuilder.append(str).append(" 0 ");
      AppMethodBeat.o(11343);
      return;
    }
  }

  public static String aet()
  {
    AppMethodBeat.i(11336);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("rcontact.showHead asc, ");
    ((StringBuffer)localObject).append(" case when length(rcontact.conRemarkPYFull) > 0 then upper(rcontact.conRemarkPYFull) ");
    ((StringBuffer)localObject).append(" else upper(rcontact.quanPin) end asc, ");
    ((StringBuffer)localObject).append(" case when length(rcontact.conRemark) > 0 then upper(rcontact.conRemark) ");
    ((StringBuffer)localObject).append(" else upper(rcontact.quanPin) end asc, ");
    ((StringBuffer)localObject).append(" upper(rcontact.quanPin) asc, ");
    ((StringBuffer)localObject).append(" upper(rcontact.nickname) asc, ");
    ((StringBuffer)localObject).append(" upper(rcontact.username) asc ");
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(11336);
    return localObject;
  }

  private static String aeu()
  {
    AppMethodBeat.i(11337);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("rcontact.type & 2048 desc, ");
    ((StringBuffer)localObject).append("rcontact.showHead asc, ");
    ((StringBuffer)localObject).append(" case when length(rcontact.conRemarkPYFull) > 0 then upper(rcontact.conRemarkPYFull) ");
    ((StringBuffer)localObject).append(" else upper(rcontact.quanPin) end asc, ");
    ((StringBuffer)localObject).append(" case when length(rcontact.conRemark) > 0 then upper(rcontact.conRemark) ");
    ((StringBuffer)localObject).append(" else upper(rcontact.quanPin) end asc, ");
    ((StringBuffer)localObject).append(" upper(rcontact.quanPin) asc, ");
    ((StringBuffer)localObject).append(" upper(rcontact.nickname) asc, ");
    ((StringBuffer)localObject).append(" upper(rcontact.username) asc ");
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(11337);
    return localObject;
  }

  public static List<String> aev()
  {
    AppMethodBeat.i(11347);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("select rcontact.username");
    ((StringBuilder)localObject).append(", bizinfo.enterpriseFather");
    ((StringBuilder)localObject).append(", bizinfo.bitFlag & 1");
    c((StringBuilder)localObject);
    d((StringBuilder)localObject);
    ((StringBuilder)localObject).append(" and (");
    ((StringBuilder)localObject).append(" (bizinfo.bitFlag & 1) != 0");
    ((StringBuilder)localObject).append(" or ");
    ((StringBuilder)localObject).append(" (bizinfo.acceptType & 128) > 0 ");
    ((StringBuilder)localObject).append(" and (bizinfo.brandFlag & 1) == 0) ");
    localObject = ((StringBuilder)localObject).toString();
    ab.i("MicroMsg.BizInfoStorage", "getEnterpriseConnectorList sql %s", new Object[] { localObject });
    Cursor localCursor = g.RP().eJN.a((String)localObject, null, 2);
    localObject = new ArrayList();
    if (localCursor == null)
      AppMethodBeat.o(11347);
    while (true)
    {
      return localObject;
      if (localCursor.moveToNext())
      {
        if (localCursor.getInt(2) > 0)
        {
          i = 1;
          label152: if (i == 0)
            break label180;
        }
        label180: for (int i = 0; ; i = 1)
        {
          ((List)localObject).add(localCursor.getString(i));
          break;
          i = 0;
          break label152;
        }
      }
      localCursor.close();
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().eE((List)localObject);
      AppMethodBeat.o(11347);
    }
  }

  public static List<String> aew()
  {
    AppMethodBeat.i(11352);
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("select bizinfo.username");
    ((StringBuilder)localObject1).append(" from rcontact, bizinfo");
    ((StringBuilder)localObject1).append(" where bizinfo.specialType = 1");
    ((StringBuilder)localObject1).append(" and rcontact.username = bizinfo.username");
    ((StringBuilder)localObject1).append(" and (rcontact.verifyFlag & ").append(ad.dsh()).append(") != 0 ");
    ((StringBuilder)localObject1).append(" and (rcontact.type & 1) != 0 ");
    Object localObject2 = ((StringBuilder)localObject1).toString();
    ab.i("MicroMsg.BizInfoStorage", "getSpecialInternalBizUsernames sql %s", new Object[] { localObject2 });
    localObject1 = new ArrayList();
    localObject2 = g.RP().eJN.a((String)localObject2, null, 2);
    int i = ((Cursor)localObject2).getColumnIndex("username");
    while (((Cursor)localObject2).moveToNext())
      ((List)localObject1).add(((Cursor)localObject2).getString(i));
    ((Cursor)localObject2).close();
    AppMethodBeat.o(11352);
    return localObject1;
  }

  private static void b(StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(11339);
    paramStringBuilder.append("select bizinfo.brandIconURL");
    paramStringBuilder.append(", bizinfo.type");
    paramStringBuilder.append(", bizinfo.status");
    paramStringBuilder.append(", bizinfo.enterpriseFather");
    paramStringBuilder.append(", bizinfo.brandFlag");
    paramStringBuilder.append(", bizinfo.extInfo");
    paramStringBuilder.append(", rcontact.username");
    paramStringBuilder.append(", rcontact.conRemark");
    paramStringBuilder.append(", rcontact.quanPin");
    paramStringBuilder.append(", rcontact.nickname");
    paramStringBuilder.append(", rcontact.alias");
    paramStringBuilder.append(", rcontact.type ");
    AppMethodBeat.o(11339);
  }

  private static void b(StringBuilder paramStringBuilder, boolean paramBoolean)
  {
    AppMethodBeat.i(11344);
    paramStringBuilder.append(" and (bizinfo.brandFlag & 1) ");
    if (paramBoolean);
    for (String str = "=="; ; str = "!=")
    {
      paramStringBuilder.append(str).append(" 0 ");
      AppMethodBeat.o(11344);
      return;
    }
  }

  public static void c(StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(11340);
    paramStringBuilder.append(" from rcontact, bizinfo");
    paramStringBuilder.append(" where rcontact.username = bizinfo.username");
    paramStringBuilder.append(" and (rcontact.verifyFlag & ").append(ad.dsh()).append(") != 0 ");
    paramStringBuilder.append(" and (rcontact.type & 1) != 0 ");
    AppMethodBeat.o(11340);
  }

  public static void d(StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(11341);
    paramStringBuilder.append(" and bizinfo.type = 3 ");
    AppMethodBeat.o(11341);
  }

  public static Cursor qR(String paramString)
  {
    AppMethodBeat.i(11349);
    StringBuilder localStringBuilder = new StringBuilder();
    b(localStringBuilder);
    c(localStringBuilder);
    a(localStringBuilder, paramString);
    b(localStringBuilder, false);
    a(localStringBuilder, false);
    localStringBuilder.append(" order by ");
    localStringBuilder.append(aeu());
    paramString = localStringBuilder.toString();
    ab.i("MicroMsg.BizInfoStorage", "getEnterpriseDisableChild sql %s", new Object[] { paramString });
    paramString = g.RP().eJN.a(paramString, null, 0);
    AppMethodBeat.o(11349);
    return paramString;
  }

  public static List<String> qS(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(11350);
    Object localObject2 = new StringBuilder();
    a((StringBuilder)localObject2);
    c((StringBuilder)localObject2);
    a((StringBuilder)localObject2, paramString);
    paramString = ((StringBuilder)localObject2).toString();
    ab.i("MicroMsg.BizInfoStorage", "getEnterpriseChildNameList sql %s", new Object[] { paramString });
    localObject2 = g.RP().eJN.a(paramString, null, 2);
    if (localObject2 == null)
    {
      AppMethodBeat.o(11350);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      paramString = new ArrayList();
      while (((Cursor)localObject2).moveToNext())
        paramString.add(((Cursor)localObject2).getString(0));
      ((Cursor)localObject2).close();
      AppMethodBeat.o(11350);
    }
  }

  public static String qT(String paramString)
  {
    String str = null;
    AppMethodBeat.i(11351);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.BizInfoStorage", "getBizChatBrandUserName userName is null");
      AppMethodBeat.o(11351);
      paramString = str;
    }
    Object localObject;
    while (true)
    {
      return paramString;
      if ((fwe != null) && (fwe.containsKey(paramString)))
      {
        paramString = (String)fwe.get(paramString);
        if ((!bo.isNullOrNil(paramString)) && (t.mY(paramString)))
        {
          AppMethodBeat.o(11351);
        }
        else
        {
          AppMethodBeat.o(11351);
          paramString = str;
        }
      }
      else
      {
        localObject = new StringBuilder();
        a((StringBuilder)localObject);
        c((StringBuilder)localObject);
        a((StringBuilder)localObject, paramString);
        a((StringBuilder)localObject, true);
        localObject = ((StringBuilder)localObject).toString();
        ab.i("MicroMsg.BizInfoStorage", "getEnterpriseBizChatChild sql %s", new Object[] { localObject });
        localObject = g.RP().eJN.a((String)localObject, null, 2);
        if (localObject != null)
          break;
        AppMethodBeat.o(11351);
        paramString = str;
      }
    }
    if (((Cursor)localObject).moveToFirst())
    {
      str = ((Cursor)localObject).getString(0);
      fwe.put(paramString, str);
    }
    for (paramString = str; ; paramString = null)
    {
      ((Cursor)localObject).close();
      AppMethodBeat.o(11351);
      break;
    }
  }

  public static boolean qU(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(11353);
    if ((bo.isNullOrNil(paramString)) || (!f.rd(paramString)))
      AppMethodBeat.o(11353);
    while (true)
    {
      return bool2;
      Object localObject1 = f.qX(paramString);
      Object localObject2;
      if ((((d)localObject1).cJ(false) != null) && (((d)localObject1).cJ(false).aer() != null) && (!bo.isNullOrNil(((d)localObject1).adX())))
      {
        localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().apn(((d)localObject1).adX());
        if ((localObject2 != null) && (((at)localObject2).field_username.equals(paramString)) && (((at)localObject2).field_unReadCount > 0))
          ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().apb(((d)localObject1).adX());
      }
      localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Rk(paramString);
      ((Cursor)localObject1).moveToFirst();
      for (bool2 = bool1; !((Cursor)localObject1).isAfterLast(); bool2 = true)
      {
        localObject2 = new bi();
        ((bi)localObject2).d((Cursor)localObject1);
        ((bi)localObject2).setStatus(4);
        ab.d("MicroMsg.BizInfoStorage", "writeOpLog: msgSvrId = " + ((cy)localObject2).field_msgSvrId + " status = " + ((cy)localObject2).field_status);
        ((Cursor)localObject1).moveToNext();
      }
      ((Cursor)localObject1).close();
      if (bool2)
      {
        ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().apb(paramString);
        ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Ri(paramString);
      }
      AppMethodBeat.o(11353);
    }
  }

  public static void qV(String paramString)
  {
    AppMethodBeat.i(11354);
    if ((bo.isNullOrNil(paramString)) || (!f.rd(paramString)))
      AppMethodBeat.o(11354);
    while (true)
    {
      return;
      ((a)g.M(a.class)).getNotification().jO(paramString);
      ((a)g.M(a.class)).getNotification().BV();
      AppMethodBeat.o(11354);
    }
  }

  public static void qW(String paramString)
  {
    AppMethodBeat.i(11355);
    if ((bo.isNullOrNil(paramString)) || (!f.rd(paramString)))
      AppMethodBeat.o(11355);
    while (true)
    {
      return;
      ((a)g.M(a.class)).getNotification().jO("");
      AppMethodBeat.o(11355);
    }
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(11328);
    if (this.fuL != null)
      this.fuL.remove(parama);
    AppMethodBeat.o(11328);
  }

  public final void a(e.a parama, Looper paramLooper)
  {
    AppMethodBeat.i(11327);
    this.fuL.a(parama, paramLooper);
    AppMethodBeat.o(11327);
  }

  public final void c(d paramd)
  {
    AppMethodBeat.i(11331);
    ab.i("MicroMsg.BizInfoStorage", "delete biz ret = %b, username = %s", new Object[] { Boolean.valueOf(super.a(paramd, new String[] { "username" })), paramd.field_username });
    e.a.b localb = new e.a.b();
    localb.fuO = paramd.field_username;
    localb.fwk = e.a.a.fwh;
    localb.fwl = paramd;
    this.fuL.cF(localb);
    this.fuL.doNotify();
    AppMethodBeat.o(11331);
  }

  public final boolean d(d paramd)
  {
    AppMethodBeat.i(11332);
    paramd.field_updateTime = System.currentTimeMillis();
    paramd.adK();
    ab.v("MicroMsg.BizInfoStorage", "username is %s, %s, %d, %s, %s, %s, %d", new Object[] { paramd.field_username, paramd.field_brandList, Integer.valueOf(paramd.field_brandFlag), paramd.field_brandInfo, paramd.field_extInfo, paramd.field_brandIconURL, Long.valueOf(paramd.field_updateTime) });
    Object localObject = paramd.cJ(false);
    if (localObject != null)
    {
      localObject = ((d.b)localObject).aej();
      if (localObject != null)
        paramd.field_specialType = ((d.b.b)localObject).fvJ;
    }
    boolean bool = super.b(paramd);
    if ((bool) && (!t.kH(paramd.field_username)))
    {
      localObject = new e.a.b();
      ((e.a.b)localObject).fuO = paramd.field_username;
      ((e.a.b)localObject).fvo = paramd.adL();
      ((e.a.b)localObject).fwk = e.a.a.fwg;
      ((e.a.b)localObject).fwl = paramd;
      this.fuL.cF(localObject);
      this.fuL.doNotify();
    }
    AppMethodBeat.o(11332);
    return bool;
  }

  public final void delete(String paramString)
  {
    AppMethodBeat.i(11330);
    d locald = new d();
    locald.field_username = paramString;
    ab.i("MicroMsg.BizInfoStorage", "delete biz ret = %b, username = %s", new Object[] { Boolean.valueOf(super.a(locald, new String[] { "username" })), paramString });
    e.a.b localb = new e.a.b();
    localb.fuO = paramString;
    localb.fwk = e.a.a.fwh;
    localb.fwl = locald;
    this.fuL.cF(localb);
    this.fuL.doNotify();
    AppMethodBeat.o(11330);
  }

  public final boolean e(d paramd)
  {
    AppMethodBeat.i(11333);
    paramd.field_updateTime = System.currentTimeMillis();
    paramd.adK();
    Object localObject = paramd.cJ(false);
    if (localObject != null)
    {
      localObject = ((d.b)localObject).aej();
      if (localObject != null)
        paramd.field_specialType = ((d.b.b)localObject).fvJ;
    }
    boolean bool = super.a(paramd);
    if ((bool) && (!t.kH(paramd.field_username)))
    {
      localObject = new e.a.b();
      ((e.a.b)localObject).fuO = paramd.field_username;
      ((e.a.b)localObject).fvo = paramd.adL();
      ((e.a.b)localObject).fwk = e.a.a.fwi;
      ((e.a.b)localObject).fwl = paramd;
      this.fuL.cF(localObject);
      this.fuL.doNotify();
    }
    AppMethodBeat.o(11333);
    return bool;
  }

  public final List<String> le(int paramInt)
  {
    AppMethodBeat.i(11334);
    Object localObject = String.format(Locale.US, "select %s from %s where %s & %d > 0", new Object[] { "username", "bizinfo", "acceptType", Integer.valueOf(paramInt) });
    ab.i("MicroMsg.BizInfoStorage", "getList: sql[%s]", new Object[] { localObject });
    long l = bo.yz();
    Cursor localCursor = rawQuery((String)localObject, new String[0]);
    localObject = new LinkedList();
    if (localCursor != null)
    {
      if (localCursor.moveToFirst())
        do
          ((List)localObject).add(localCursor.getString(0));
        while (localCursor.moveToNext());
      localCursor.close();
      ab.i("MicroMsg.BizInfoStorage", "getMyAcceptList: type[%d], use time[%d ms]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(bo.az(l)) });
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().eE((List)localObject);
      AppMethodBeat.o(11334);
    }
    while (true)
    {
      return localObject;
      ab.i("MicroMsg.BizInfoStorage", "getMyAcceptList: cursor not null, type[%d], use time[%d ms]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(bo.az(l)) });
      AppMethodBeat.o(11334);
    }
  }

  public final int lf(int paramInt)
  {
    AppMethodBeat.i(11335);
    List localList = le(paramInt);
    if (bo.ek(localList))
    {
      paramInt = 0;
      AppMethodBeat.o(11335);
    }
    while (true)
    {
      return paramInt;
      paramInt = localList.size();
      AppMethodBeat.o(11335);
    }
  }

  public final d qP(String paramString)
  {
    AppMethodBeat.i(11329);
    d locald = new d();
    locald.field_username = paramString;
    super.b(locald, new String[0]);
    AppMethodBeat.o(11329);
    return locald;
  }

  public final Cursor qQ(String paramString)
  {
    AppMethodBeat.i(11346);
    Object localObject = qS(paramString);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      if (!bo.isNullOrNil(qP((String)localObject).adW()))
        localArrayList.add(localObject);
    }
    if (localArrayList.size() <= 0)
    {
      AppMethodBeat.o(11346);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      localObject = new StringBuilder();
      b((StringBuilder)localObject);
      c((StringBuilder)localObject);
      a((StringBuilder)localObject, paramString);
      b((StringBuilder)localObject, true);
      ((StringBuilder)localObject).append(" and (");
      for (int i = 0; i < localArrayList.size(); i++)
      {
        paramString = (String)localArrayList.get(i);
        if (i > 0)
          ((StringBuilder)localObject).append(" or ");
        ((StringBuilder)localObject).append("rcontact.username = '").append(paramString).append("'");
      }
      ((StringBuilder)localObject).append(") order by ");
      ((StringBuilder)localObject).append(aeu());
      paramString = ((StringBuilder)localObject).toString();
      ab.i("MicroMsg.BizInfoStorage", "getEnterpriseChatConnector sql %s", new Object[] { paramString });
      paramString = g.RP().eJN.a(paramString, null, 0);
      AppMethodBeat.o(11346);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.e
 * JD-Core Version:    0.6.2
 */