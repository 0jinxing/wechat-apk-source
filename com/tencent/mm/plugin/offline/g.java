package com.tencent.mm.plugin.offline;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.offline.a.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import java.util.Map;

public final class g
{
  public static String TAG;
  public static int oWV;
  private static int oWW;
  private static int oWX;
  public static int oWY;
  public static int oWZ;
  public static int oXa;
  public static int oXb;
  public static int oXc;
  public static int oXd;
  public static int oXe;
  public static int oXf;
  public static int oXg;
  public static int oXh;
  public static int oXi;
  public static int oXj;
  public f oXk;
  public boolean oXl;
  public ap oXm;
  public int status;

  static
  {
    AppMethodBeat.i(43323);
    TAG = "MicroMsg.OfflineGetMsgLogic";
    oWV = 5000;
    oWW = 30000;
    oWX = 5000;
    oWY = 0;
    oWZ = 24;
    oXa = 4;
    oXb = 8;
    oXc = 23;
    oXd = 6;
    oXe = 5;
    oXf = 20;
    oXg = 20000;
    oXh = 20001;
    oXi = 10001;
    oXj = oWX;
    com.tencent.mm.kernel.g.RQ();
    Object localObject = com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xRR, null);
    int i;
    if (localObject != null)
    {
      i = ((Integer)localObject).intValue();
      oXj = i;
      if (i == 0)
        oXj = oWX;
    }
    com.tencent.mm.kernel.g.RQ();
    localObject = com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xRT, Integer.valueOf(0));
    if (localObject != null)
    {
      i = ((Integer)localObject).intValue();
      if (i != 0)
        oWW = i;
    }
    AppMethodBeat.o(43323);
  }

  public g()
  {
    AppMethodBeat.i(43314);
    this.status = 0;
    this.oXk = new g.1(this);
    this.oXl = true;
    this.oXm = new ap(new g.2(this), false);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(385, this.oXk);
    AppMethodBeat.o(43314);
  }

  private static boolean a(r paramr)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(43315);
    if (paramr != null)
      ab.i(TAG, "isOrderClosed lastest status req_key=" + paramr.field_reqkey);
    Object localObject = new HashSet();
    ((HashSet)localObject).add(Integer.valueOf(oXg));
    ((HashSet)localObject).add(Integer.valueOf(oXd));
    ((HashSet)localObject).add(Integer.valueOf(oXe));
    ((HashSet)localObject).add(Integer.valueOf(oXa));
    ((HashSet)localObject).add(Integer.valueOf(-1));
    if ((paramr == null) || (((HashSet)localObject).contains(Integer.valueOf(paramr.field_status))))
    {
      String str = TAG;
      localObject = new StringBuilder("isOrderClosed true;status==null?");
      if (paramr == null)
        bool2 = true;
      ab.i(str, bool2);
      if (paramr != null)
        ab.i(TAG, "isOrderClosed status.field_status=" + paramr.field_status);
      AppMethodBeat.o(43315);
      bool2 = true;
      return bool2;
    }
    ab.i(TAG, "isOrderClosed false");
    if (paramr != null)
      ab.i(TAG, "status=" + paramr.field_status + ";req_key=" + paramr.field_reqkey);
    while (true)
    {
      AppMethodBeat.o(43315);
      bool2 = bool1;
      break;
      ab.i(TAG, "isOrderClosed status=null");
    }
  }

  private static boolean a(r paramr, int paramInt)
  {
    AppMethodBeat.i(43318);
    int i = paramInt;
    if (paramInt == oXa)
      i = oXg;
    boolean bool = eN(paramr.field_status, i);
    ab.i(TAG, "in changeStatus: isallow=%b; old status = %d; new status = %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramr.field_status), Integer.valueOf(i) });
    if (bool)
    {
      paramr.field_status = i;
      k.bXg();
      k.bXk().c(paramr);
    }
    AppMethodBeat.o(43318);
    return bool;
  }

  public static int bXb()
  {
    return oWW;
  }

  public static void bXc()
  {
    AppMethodBeat.i(43320);
    ab.i(TAG, "endAllOldOrder");
    k.bXg();
    com.tencent.mm.plugin.offline.b.a locala = k.bXk();
    ab.i("MicroMsg.OfflineOrderStatusStorage", "end all orders to final status. orders count: %d, latest 3 orders: %s", new Object[] { Integer.valueOf(locala.bXq()), locala.bXp() });
    Object localObject = String.format("SELECT %s FROM %s ORDER BY %s DESC LIMIT 1;", new Object[] { "rowid", "OfflineOrderStatus", "rowid" });
    localObject = locala.bSd.a((String)localObject, null, 2);
    long l1 = 0L;
    long l2;
    if (localObject == null)
    {
      ab.e("MicroMsg.OfflineOrderStatusStorage", "removeOlderOrders: error. cursor is null \n");
      l2 = l1;
      if (l2 - 10L <= 0L)
        break label300;
      localObject = String.format("DELETE FROM %s WHERE %s < %d;", new Object[] { "OfflineOrderStatus", "rowid", Long.valueOf(l2 - 10L) });
      ab.i("MicroMsg.OfflineOrderStatusStorage", "removeOlderOrders. latestRowId is %d. sql: %s", new Object[] { Long.valueOf(l2), localObject });
      locala.bSd.hY("OfflineOrderStatus", (String)localObject);
    }
    while (true)
    {
      localObject = "UPDATE OfflineOrderStatus SET status=" + oXg + " where status!=" + oXg;
      locala.bSd.hY("OfflineOrderStatus", (String)localObject);
      AppMethodBeat.o(43320);
      return;
      ((Cursor)localObject).moveToFirst();
      l2 = l1;
      if (!((Cursor)localObject).isAfterLast())
      {
        l2 = l1;
        if (((Cursor)localObject).getColumnCount() > 0)
          l2 = ((Cursor)localObject).getLong(0);
      }
      ((Cursor)localObject).close();
      break;
      label300: ab.i("MicroMsg.OfflineOrderStatusStorage", "removeOlderOrders. latestRowId is %d. do nothing", new Object[] { Long.valueOf(l2) });
    }
  }

  public static void cM(String paramString, int paramInt)
  {
    AppMethodBeat.i(43319);
    r localr;
    if (!bo.isNullOrNil(paramString))
    {
      k.bXg();
      localr = k.bXk().TY(paramString);
      if (localr != null)
      {
        a(localr, paramInt);
        AppMethodBeat.o(43319);
      }
    }
    while (true)
    {
      return;
      localr = new r();
      localr.field_reqkey = paramString;
      localr.field_status = paramInt;
      k.bXg();
      k.bXk().c(localr);
      AppMethodBeat.o(43319);
    }
  }

  private static boolean eN(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(43317);
    ab.i(TAG, "checkStatus from=" + paramInt1 + ";to=" + paramInt2);
    if (paramInt1 == paramInt2)
      AppMethodBeat.o(43317);
    while (true)
    {
      return bool;
      if (paramInt1 == oWY)
      {
        AppMethodBeat.o(43317);
        bool = true;
      }
      else if (paramInt1 == oWZ)
      {
        if (paramInt2 != oWZ)
        {
          AppMethodBeat.o(43317);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(43317);
        }
      }
      else if (paramInt1 == oXd)
      {
        if (paramInt2 == oXg)
        {
          AppMethodBeat.o(43317);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(43317);
        }
      }
      else if (paramInt1 == oXe)
      {
        if (paramInt2 == oXg)
        {
          AppMethodBeat.o(43317);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(43317);
        }
      }
      else if (paramInt1 == oXa)
      {
        if (paramInt2 == oXg)
        {
          AppMethodBeat.o(43317);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(43317);
        }
      }
      else if (paramInt1 == oXf)
      {
        if (paramInt2 == oXg)
        {
          AppMethodBeat.o(43317);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(43317);
        }
      }
      else if ((paramInt1 == oXb) || (paramInt1 == oXc))
      {
        if ((paramInt2 == oXd) || (paramInt2 == oXg))
        {
          AppMethodBeat.o(43317);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(43317);
        }
      }
      else if (paramInt1 == oXi)
      {
        if ((paramInt2 == oXd) || (paramInt2 == oXg))
        {
          AppMethodBeat.o(43317);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(43317);
        }
      }
      else
      {
        AppMethodBeat.o(43317);
      }
    }
  }

  public static boolean fy(String paramString1, String paramString2)
  {
    AppMethodBeat.i(43316);
    int i;
    Object localObject1;
    label97: label125: boolean bool1;
    if (bo.isNullOrNil(paramString2))
    {
      ab.i(TAG, "shouldDeal appmsg is null");
      i = 0;
      if (i == 0)
        break label1163;
      k.bXg();
      localObject1 = k.bXk().bXo();
      paramString2 = br.z(paramString2, "sysmsg");
      i = bo.getInt((String)paramString2.get(".sysmsg.paymsg.PayMsgType"), -1);
      paramString2 = (String)paramString2.get(".sysmsg.paymsg.req_key");
      if (i != 24)
        break label1043;
      h.pYm.a(135L, 58L, 1L, true);
      if ((localObject1 == null) || (((r)localObject1).field_reqkey == null) || (!((r)localObject1).field_reqkey.equals(paramString2)))
        break label1122;
      a((r)localObject1, i);
      ab.i(TAG, "dealMsg true");
      bool1 = true;
      AppMethodBeat.o(43316);
    }
    while (true)
    {
      return bool1;
      localObject1 = br.z(paramString2, "sysmsg");
      String str1 = (String)((Map)localObject1).get(".sysmsg.paymsg.req_key");
      int j = bo.getInt((String)((Map)localObject1).get(".sysmsg.paymsg.PayMsgType"), -1);
      k.bXg();
      r localr1 = k.bXk().TY(str1);
      k.bXg();
      r localr2 = k.bXk().bXo();
      boolean bool2 = a(localr2);
      label238: String str2;
      Object localObject2;
      Object localObject3;
      if (localr1 != null)
      {
        h.pYm.a(135L, 63L, 1L, true);
        if (localr2 == null)
          break label364;
        str2 = TAG;
        localObject2 = "latestStatus: reqKey: %s, status:%d, isLatestClose: %b";
        localObject3 = new Object[3];
        localObject3[0] = localr2.field_reqkey;
        localObject3[1] = Integer.valueOf(localr2.field_status);
        i = 2;
        bool1 = bool2;
        localObject1 = localObject3;
      }
      while (true)
      {
        localObject1[i] = Boolean.valueOf(bool1);
        ab.i(str2, (String)localObject2, (Object[])localObject3);
        if (localr1 != null)
          break label545;
        if (localr2 != null)
          break label440;
        ab.i(TAG, "== current reqKey: %s not in local storage, payMsgType:%d; cannot get latest order in local storage. return true", new Object[] { str1, Integer.valueOf(j) });
        i = 1;
        break;
        h.pYm.a(135L, 64L, 1L, true);
        break label238;
        label364: str2 = TAG;
        String str3 = "latestStatus is null. isLatestClose: %b, localStatus is null ?: %b";
        localObject1 = new Object[2];
        localObject1[0] = Boolean.valueOf(bool2);
        i = 1;
        if (localr1 == null)
        {
          bool1 = true;
          localObject3 = localObject1;
          localObject2 = localObject1;
          localObject1 = localObject3;
          localObject3 = localObject2;
          localObject2 = str3;
        }
        else
        {
          bool1 = false;
          localObject3 = localObject1;
          localObject2 = localObject1;
          localObject1 = localObject3;
          localObject3 = localObject2;
          localObject2 = str3;
        }
      }
      label440: if (bool2)
      {
        ab.i(TAG, "== current reqKey: %s not in local storage, payMsgType:%d. the latest order in local storage is closed, reqKey:%s, status:%d. return true", new Object[] { str1, Integer.valueOf(j), localr2.field_reqkey, Integer.valueOf(localr2.field_status) });
        i = 1;
        break;
      }
      ab.i(TAG, "== current reqKey: %s not in local storage, payMsgType:%d. the latest order in local storage is not closed, reqKey:%s, status:%d. return false", new Object[] { str1, Integer.valueOf(j), localr2.field_reqkey, Integer.valueOf(localr2.field_status) });
      i = 0;
      break;
      label545: if (a(localr1))
      {
        ab.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d, it is final status. return false.", new Object[] { localr1.field_reqkey, Integer.valueOf(j), Integer.valueOf(localr1.field_status) });
        i = 0;
        break;
      }
      if (localr2 == null)
      {
        ab.i(TAG, "== unbelievable! current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; cannot get latest order in local storage , or all local orders is in give-up. return false.", new Object[] { str1, Integer.valueOf(j), Integer.valueOf(localr1.field_status) });
        k.bXg();
        k.bXk().TZ(str1);
        i = 0;
        break;
      }
      ab.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s ", new Object[] { str1, Integer.valueOf(j), Integer.valueOf(localr1.field_status), localr2.field_reqkey, Integer.valueOf(localr2.field_status) });
      if (localr1.field_reqkey.equals(localr2.field_reqkey))
      {
        if (eN(localr2.field_status, j))
        {
          ab.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are equal. return true", new Object[] { str1, Integer.valueOf(j), Integer.valueOf(localr1.field_status), localr2.field_reqkey, Integer.valueOf(localr2.field_status) });
          i = 1;
          break;
        }
        ab.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are equal. return false.", new Object[] { str1, Integer.valueOf(j), Integer.valueOf(localr1.field_status), localr2.field_reqkey, Integer.valueOf(localr2.field_status) });
        if (localr2.field_status != j)
        {
          ab.i(TAG, "mark reqKey: %s as give up", new Object[] { str1 });
          k.bXg();
          k.bXk().TZ(str1);
        }
        i = 0;
        break;
      }
      if (bool2)
      {
        ab.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are not equal. the latest order is closed. return true.", new Object[] { str1, Integer.valueOf(j), Integer.valueOf(localr1.field_status), localr2.field_reqkey, Integer.valueOf(localr2.field_status) });
        i = 1;
        break;
      }
      ab.i(TAG, "== current reqKey: %s  is in local storage, payMsgType: %d, local status is %d; the latest order is in local storage, reqKey: %s, status: %s. the two reqKeys are not equal. the latest order is not closed. return false.", new Object[] { str1, Integer.valueOf(j), Integer.valueOf(localr1.field_status), localr2.field_reqkey, Integer.valueOf(localr2.field_status) });
      k.bXg();
      k.bXk().TZ(str1);
      i = 0;
      break;
      label1043: if (i == 6)
      {
        h.pYm.a(135L, 59L, 1L, true);
        break label97;
      }
      if ((i == 4) || (i == 5) || (i == 20))
      {
        h.pYm.a(135L, 60L, 1L, true);
        break label97;
      }
      if (i != 23)
        break label97;
      h.pYm.a(135L, 66L, 1L, true);
      break label97;
      label1122: localObject1 = new r();
      ((r)localObject1).field_reqkey = paramString2;
      if (!bo.isNullOrNil(paramString1))
        ((r)localObject1).field_ack_key = paramString1;
      ((r)localObject1).field_status = oWY;
      a((r)localObject1, i);
      break label125;
      label1163: ab.i(TAG, "dealMsg false");
      bool1 = false;
      AppMethodBeat.o(43316);
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(43321);
    if (com.tencent.mm.plugin.offline.c.a.bYE())
    {
      ab.i(TAG, "OFFLINEGETMSGLOGIN STOP; IS stopped=" + this.oXm.doT());
      if (!this.oXm.doT())
      {
        h.pYm.a(135L, 62L, 1L, true);
        this.oXm.stopTimer();
      }
    }
    AppMethodBeat.o(43321);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.g
 * JD-Core Version:    0.6.2
 */