package com.tencent.mm.plugin.sns.model;

import android.content.Intent;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.storage.j;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.protocal.protobuf.brf;
import com.tencent.mm.protocal.protobuf.bs;
import com.tencent.mm.protocal.protobuf.can;
import com.tencent.mm.protocal.protobuf.cao;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class am$a
  implements com.tencent.mm.ai.f, com.tencent.mm.plugin.sns.b.h
{
  public static int qMx = -1;
  private Map<h.a, String> ftE;
  private int qMA;
  public long qMB;
  private LinkedList<String> qMC;
  public Map<String, ArrayList<com.tencent.mm.plugin.sns.h.b>> qMD;
  public Map<String, Integer> qME;
  private Map<String, Long> qMy;
  private Map<String, Integer> qMz;

  public am$a()
  {
    AppMethodBeat.i(36572);
    this.qMy = new HashMap();
    this.qMz = new HashMap();
    this.qMA = 0;
    this.qMB = 0L;
    this.ftE = new HashMap();
    this.qMC = new LinkedList();
    this.qMD = new HashMap();
    this.qME = new HashMap();
    AppMethodBeat.o(36572);
  }

  public static void Yd(String paramString)
  {
    AppMethodBeat.i(36585);
    Object localObject = af.cnE();
    if (bo.isNullOrNil(((ad)localObject).ecX))
      ((ad)localObject).ecX = com.tencent.mm.model.r.Yz();
    localObject = ((ad)localObject).ecX;
    com.tencent.mm.plugin.sns.storage.n localn = com.tencent.mm.plugin.sns.storage.h.YS(paramString);
    try
    {
      cbf localcbf = new com/tencent/mm/protocal/protobuf/cbf;
      localcbf.<init>();
      localcbf = (cbf)localcbf.parseFrom(localn.field_attrBuf);
      Iterator localIterator = localcbf.xaq.iterator();
      while (localIterator.hasNext())
      {
        cat localcat = (cat)localIterator.next();
        if (localcat.vHl.equals(localObject))
        {
          localcbf.xaq.remove(localcat);
          localcbf.xao -= 1;
          localn.field_attrBuf = localcbf.toByteArray();
          if (!localn.DI(32))
            break label260;
          af.cnI().a(localn.crd());
        }
      }
      while (true)
      {
        if (!af.cnE().ko(v.Zm(paramString)))
          break label310;
        if (!localn.DI(32))
          break label283;
        localObject = localn.cqq();
        if (localObject != null)
          break;
        localObject = "";
        ((c)com.tencent.mm.kernel.g.K(c.class)).a(11855, localn.cre(), new Object[] { Integer.valueOf(0), localObject, Integer.valueOf(localn.cre()) });
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a(new r(v.Zm(paramString), 7), 0);
        AppMethodBeat.o(36585);
        return;
        label260: af.cnF().B(localn);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        continue;
        String str = localException.hnw;
        continue;
        label283: com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a(new r(v.Zm(paramString), 5), 0);
        label310: AppMethodBeat.o(36585);
      }
    }
  }

  public static cat a(com.tencent.mm.plugin.sns.storage.n paramn, int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(36586);
    paramn = b(paramn, paramInt1, paramString, null, 0, paramInt2);
    AppMethodBeat.o(36586);
    return paramn;
  }

  public static cat a(com.tencent.mm.plugin.sns.storage.n paramn, int paramInt1, String paramString, cat paramcat, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(36587);
    paramn = b(paramn, paramInt1, paramString, paramcat, paramInt2, paramInt3);
    AppMethodBeat.o(36587);
    return paramn;
  }

  public static cat a(com.tencent.mm.plugin.sns.storage.n paramn, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    AppMethodBeat.i(36589);
    can localcan = new can();
    localcan.ncM = paramString1;
    localcan.pcX = ((int)(bo.anU() / 1000L));
    localcan.wZD = com.tencent.mm.model.r.YB();
    localcan.wPm = com.tencent.mm.model.r.Yz();
    localcan.vFH = paramInt2;
    localcan.wZE = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).mJ(paramn.field_userName);
    localcan.wel = paramn.field_userName;
    localcan.jCt = paramInt1;
    cao localcao;
    String str;
    if (paramn.DI(32))
    {
      localcan.wZI = 0L;
      paramString1 = new can();
      paramString1.wPm = paramString2;
      if (!bo.isNullOrNil(paramString1.wPm))
        paramString1.wZD = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).mJ(paramString1.wPm);
      localcao = new cao();
      localcao.vQE = paramn.field_snsId;
      localcao.wZN = localcan;
      localcao.wZO = paramString1;
      paramString2 = "";
      if (paramn.DI(32))
      {
        paramString1 = paramn.cqq();
        if (paramString1 != null)
          break label387;
        str = "";
        label211: if (paramString1 != null)
          break label396;
        paramString1 = "";
        label218: if (localcan.jCt != 7)
          break label404;
        ((c)com.tencent.mm.kernel.g.K(c.class)).a(11855, paramn.cre(), new Object[] { Integer.valueOf(1), str, Integer.valueOf(paramn.cre()) });
        paramString2 = paramString1;
      }
      label276: str = com.tencent.mm.a.g.x(bo.yz().getBytes());
      paramString1 = str;
      if (paramn.DI(32))
        paramString1 = "_AD_TAG_".concat(String.valueOf(str));
      if (!af.cnE().a(paramString1, localcao, paramString2))
        break label495;
      if (!ad.XT(paramString1))
        break label467;
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(new k(localcao, paramString1, paramString2), 0);
    }
    while (true)
    {
      AppMethodBeat.o(36589);
      return null;
      localcan.wZF = 0;
      break;
      label387: str = paramString1.hnw;
      break label211;
      label396: paramString1 = paramString1.qPj;
      break label218;
      label404: paramString2 = paramString1;
      if (localcan.jCt != 8)
        break label276;
      ((c)com.tencent.mm.kernel.g.K(c.class)).a(11855, paramn.cre(), new Object[] { Integer.valueOf(2), str, Integer.valueOf(paramn.cre()) });
      paramString2 = paramString1;
      break label276;
      label467: com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(new o(localcao, paramString1), 0);
      continue;
      label495: ab.e("MicroMsg.SnsService", "can not add Comment");
    }
  }

  public static void a(String paramString1, int paramInt1, String paramString2, com.tencent.mm.plugin.sns.storage.n paramn, int paramInt2)
  {
    AppMethodBeat.i(36590);
    if ((paramInt1 != 3) && (paramInt1 != 5))
      AppMethodBeat.o(36590);
    while (true)
    {
      return;
      can localcan = new can();
      localcan.ncM = paramString2;
      localcan.pcX = ((int)(System.currentTimeMillis() / 1000L));
      localcan.wZD = com.tencent.mm.model.r.YB();
      localcan.wPm = com.tencent.mm.model.r.Yz();
      localcan.vFH = paramInt2;
      localcan.wZE = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).mJ(paramString1);
      localcan.wel = paramString1;
      localcan.jCt = paramInt1;
      paramString2 = new cao();
      paramString2.vQE = paramn.field_snsId;
      paramString2.wZN = localcan;
      paramString2.wZO = new can();
      String str = com.tencent.mm.a.g.x(bo.yz().getBytes());
      long l = paramn.field_snsId;
      try
      {
        ab.v("MicroMsg.SnsService", "comment stg inserted");
        paramn = new com/tencent/mm/plugin/sns/storage/j;
        paramn.<init>();
        paramn.field_talker = paramString1;
        paramn.field_snsID = l;
        paramn.field_createTime = ((int)(System.currentTimeMillis() / 1000L));
        paramn.field_curActionBuf = localcan.toByteArray();
        paramn.field_type = paramInt1;
        paramn.field_isSend = true;
        paramn.field_isRead = ((short)1);
        af.cnK().b(paramn);
        af.cnE().a(str, paramString2);
        AppMethodBeat.o(36590);
      }
      catch (Exception paramString1)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.SnsService", paramString1, "", new Object[0]);
      }
    }
  }

  private static cat b(com.tencent.mm.plugin.sns.storage.n paramn, int paramInt1, String paramString, cat paramcat, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(36588);
    Object localObject1 = new can();
    ((can)localObject1).ncM = paramString;
    ((can)localObject1).pcX = ((int)(bo.anU() / 1000L));
    ((can)localObject1).wZD = com.tencent.mm.model.r.YB();
    ((can)localObject1).wPm = com.tencent.mm.model.r.Yz();
    ((can)localObject1).vFH = 0;
    ((can)localObject1).wZE = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).mJ(paramn.field_userName);
    ((can)localObject1).wel = paramn.field_userName;
    ((can)localObject1).jCt = paramInt1;
    ((can)localObject1).wZL = paramInt2;
    long l;
    label140: cao localcao;
    if (paramn.DI(32))
      if (paramcat == null)
      {
        l = 0L;
        ((can)localObject1).wZI = l;
        Object localObject2 = new can();
        if (paramcat != null)
          break label577;
        paramString = "";
        ((can)localObject2).wPm = paramString;
        if (!bo.isNullOrNil(((can)localObject2).wPm))
          ((can)localObject2).wZD = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).mJ(((can)localObject2).wPm);
        localcao = new cao();
        localcao.vQE = paramn.field_snsId;
        localcao.wZN = ((can)localObject1);
        localcao.wZO = ((can)localObject2);
        paramcat = "";
        if (paramn.DI(32))
        {
          if (paramInt3 != 2)
            break label585;
          paramString = paramn.cqr();
          label236: if (paramString != null)
            break label593;
          paramcat = "";
          label243: if (paramString != null)
            break label601;
          paramString = "";
          label250: if (((can)localObject1).jCt != 7)
            break label609;
          ((c)com.tencent.mm.kernel.g.K(c.class)).a(11855, paramn.cre(), new Object[] { Integer.valueOf(1), paramcat, Integer.valueOf(paramn.cre()) });
          label305: localObject2 = paramn.crd();
          paramcat = paramString;
          if (localObject2 != null)
          {
            if (((com.tencent.mm.plugin.sns.storage.e)localObject2).field_firstControlTime == 0)
            {
              ((com.tencent.mm.plugin.sns.storage.e)localObject2).field_firstControlTime = ((can)localObject1).pcX;
              af.cnI().b(((com.tencent.mm.plugin.sns.storage.e)localObject2).field_snsId, (com.tencent.mm.plugin.sns.storage.e)localObject2);
            }
            localObject1 = ((com.tencent.mm.plugin.sns.storage.e)localObject2).cqv();
            if (paramInt3 != 2)
              break label712;
            if (localObject1 == null)
              break label685;
            localcao.wZN.vFa = ((bs)localObject1).vDZ;
            if (((bs)localObject1).vDZ == null)
              break label667;
            ab.i("MicroMsg.SnsService", "atFriend remindInfo aid %d", new Object[] { Integer.valueOf(((bs)localObject1).vDZ.wTz) });
            paramcat = paramString;
            if (((bs)localObject1).vDZ.wTz == 0)
            {
              com.tencent.mm.plugin.report.service.h.pYm.k(955L, 9L, 1L);
              paramcat = paramString;
            }
          }
        }
        label444: localObject1 = com.tencent.mm.a.g.x(bo.yz().getBytes());
        paramString = (String)localObject1;
        if (paramn.DI(32))
          paramString = "_AD_TAG_".concat(String.valueOf(localObject1));
        if (!af.cnE().a(paramString, localcao))
          break label881;
        if (!ad.XT(paramString))
          break label853;
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a(new k(localcao, paramString, paramcat), 0);
      }
    while (true)
    {
      AppMethodBeat.o(36588);
      return null;
      l = paramcat.wZJ;
      break;
      if (paramcat == null);
      for (paramInt1 = 0; ; paramInt1 = paramcat.wZG)
      {
        ((can)localObject1).wZF = paramInt1;
        break;
      }
      label577: paramString = paramcat.vHl;
      break label140;
      label585: paramString = paramn.cqq();
      break label236;
      label593: paramcat = paramString.hnw;
      break label243;
      label601: paramString = paramString.qPj;
      break label250;
      label609: if (((can)localObject1).jCt != 8)
        break label305;
      ((c)com.tencent.mm.kernel.g.K(c.class)).a(11855, paramn.cre(), new Object[] { Integer.valueOf(2), paramcat, Integer.valueOf(paramn.cre()) });
      break label305;
      label667: com.tencent.mm.plugin.report.service.h.pYm.k(955L, 7L, 1L);
      paramcat = paramString;
      break label444;
      label685: ab.i("MicroMsg.SnsService", "remindInfo group is null!");
      com.tencent.mm.plugin.report.service.h.pYm.k(955L, 5L, 1L);
      paramcat = paramString;
      break label444;
      label712: paramcat = paramString;
      if (!com.tencent.mm.plugin.sns.ui.widget.d.fF(paramInt2, 8))
        break label444;
      if (localObject1 != null)
      {
        localcao.wZN.vFa = ((bs)localObject1).vDY;
        if (((bs)localObject1).vDY != null)
        {
          ab.i("MicroMsg.SnsService", "timeline remindInfo aid %d", new Object[] { Integer.valueOf(((bs)localObject1).vDY.wTz) });
          paramcat = paramString;
          if (((bs)localObject1).vDY.wTz != 0)
            break label444;
          com.tencent.mm.plugin.report.service.h.pYm.k(955L, 8L, 1L);
          paramcat = paramString;
          break label444;
        }
        com.tencent.mm.plugin.report.service.h.pYm.k(955L, 6L, 1L);
        paramcat = paramString;
        break label444;
      }
      ab.i("MicroMsg.SnsService", "remindInfo group is null!");
      com.tencent.mm.plugin.report.service.h.pYm.k(955L, 5L, 1L);
      paramcat = paramString;
      break label444;
      label853: com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(new o(localcao, paramString), 0);
      continue;
      label881: ab.e("MicroMsg.SnsService", "can not add Comment");
    }
  }

  public static int coe()
  {
    AppMethodBeat.i(36583);
    int i;
    if (qMx != -1)
    {
      i = qMx;
      AppMethodBeat.o(36583);
    }
    while (true)
    {
      return i;
      i = i.cmq();
      qMx = i;
      AppMethodBeat.o(36583);
    }
  }

  public final void B(long paramLong, int paramInt)
  {
    AppMethodBeat.i(36582);
    ab.d("MicroMsg.SnsService", "setTimeLastId %d", new Object[] { Long.valueOf(paramLong) });
    if (paramInt > 0)
    {
      this.qMA = paramInt;
      i.CN(paramInt);
    }
    if (paramLong == 0L)
      AppMethodBeat.o(36582);
    while (true)
    {
      return;
      this.qMB = paramLong;
      AppMethodBeat.o(36582);
    }
  }

  public final void WZ(String paramString)
  {
    AppMethodBeat.i(36591);
    String str1 = af.getAccSnsPath();
    String str2 = paramString + "bg_";
    String str3 = paramString + "tbg_";
    if (com.tencent.mm.vfs.e.ct(str2))
    {
      com.tencent.mm.vfs.e.deleteFile(an.fZ(str1, paramString) + str3);
      com.tencent.mm.vfs.e.h(an.fZ(str1, paramString), str2, str3);
    }
    AppMethodBeat.o(36591);
  }

  public final ArrayList<com.tencent.mm.plugin.sns.h.b> Yb(String paramString)
  {
    AppMethodBeat.i(36574);
    if (this.qME.containsKey(paramString))
    {
      int i = ((Integer)this.qME.get(paramString)).intValue();
      this.qME.put(paramString, Integer.valueOf(i + 1));
    }
    while (true)
    {
      paramString = (ArrayList)this.qMD.get(paramString);
      AppMethodBeat.o(36574);
      return paramString;
      this.qME.put(paramString, Integer.valueOf(0));
    }
  }

  public final int Yc(String paramString)
  {
    AppMethodBeat.i(36580);
    synchronized (this.qMz)
    {
      if (this.qMz.containsKey(paramString))
      {
        i = ((Integer)this.qMz.get(paramString)).intValue();
        if (i > 0);
        while (true)
        {
          AppMethodBeat.o(36580);
          return i;
          i = i.cmr();
        }
      }
      int i = i.cmr();
      AppMethodBeat.o(36580);
    }
  }

  public final void a(int paramInt, String paramString, h.a arg3)
  {
    AppMethodBeat.i(36576);
    ab.i("MicroMsg.SnsService", "startServer " + paramInt + " " + ???);
    af.cnE().ecX = com.tencent.mm.model.r.Yz();
    af.cnE().cnf();
    af.cnB().cmp();
    if (this.ftE.isEmpty())
    {
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(211, this);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(212, this);
    }
    if (!this.ftE.containsKey(???))
    {
      if (paramInt == 1)
        this.ftE.put(???, "@__weixintimtline");
    }
    else
      switch (paramInt)
      {
      default:
      case 2:
      case 1:
      }
    while (true)
    {
      AppMethodBeat.o(36576);
      while (true)
      {
        return;
        if ((paramInt == 2) || (paramInt == 3))
        {
          this.ftE.put(???, paramString);
          break;
        }
        if (paramInt == 4)
        {
          this.ftE.put(???, "@__classify_timeline");
          break;
        }
        if (paramInt == 5)
        {
          this.ftE.put(???, "");
          break;
        }
        this.ftE.put(???, "");
        break;
        synchronized (this.qMy)
        {
          this.qMy.put(paramString, Long.valueOf(0L));
        }
        synchronized (this.qMz)
        {
          if (!this.qMz.containsKey(paramString))
            this.qMz.put(paramString, Integer.valueOf(cod()));
          aa.XS(paramString);
          this.qMC.add(paramString);
          AppMethodBeat.o(36576);
          continue;
          paramString = finally;
          AppMethodBeat.o(36576);
          throw paramString;
        }
      }
      this.qMB = 0L;
      this.qMA = cod();
      y.XP("@__weixintimtline");
    }
  }

  public final void a(int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
  {
    AppMethodBeat.i(36579);
    if (ae.gig)
      AppMethodBeat.o(36579);
    while (true)
    {
      return;
      ab.d("MicroMsg.SnsService", "doFpList type: %s, objectId: %s", new Object[] { Integer.valueOf(paramInt1), paramString });
      if (paramInt1 == 2)
      {
        if (!aa.XR(paramString))
        {
          AppMethodBeat.o(36579);
        }
        else
        {
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RO().eJo.a(new aa(paramString, 0L, paramBoolean, paramInt2), 0);
          AppMethodBeat.o(36579);
        }
      }
      else if (paramInt1 == 1)
      {
        if (!y.XO("@__weixintimtline"))
        {
          AppMethodBeat.o(36579);
        }
        else
        {
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RP().Ry().set(68377, "");
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RO().eJo.a(new y(0L), 0);
          AppMethodBeat.o(36579);
        }
      }
      else if ((paramInt1 != 3) && (paramInt1 == 4))
      {
        if (!n.XO("@__classify_timeline"))
        {
          AppMethodBeat.o(36579);
        }
        else
        {
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RO().eJo.a(new n(""), 0);
        }
      }
      else
        AppMethodBeat.o(36579);
    }
  }

  public final boolean a(h.a parama, int paramInt)
  {
    AppMethodBeat.i(36577);
    ab.d("MicroMsg.SnsService", "closeServer");
    this.ftE.remove(parama);
    if ((paramInt == 2) && (this.qMC.size() > 0))
      this.qMC.removeLast();
    if (this.ftE.isEmpty())
    {
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.b(211, this);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.b(212, this);
      an.release();
      com.tencent.mm.plugin.sns.storage.n.release();
      new ak(Looper.getMainLooper()).postDelayed(new am.a.1(this), 5000L);
      aj.cnW();
      ab.i("MicroMsg.SnsService", "close finish");
    }
    AppMethodBeat.o(36577);
    return true;
  }

  public final void b(int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
  {
    AppMethodBeat.i(36578);
    if (ae.gig)
      AppMethodBeat.o(36578);
    while (true)
    {
      return;
      synchronized (this.qMy)
      {
        ab.d("MicroMsg.SnsService", "DO NP　NP ~_~ %s type %s timeLastId: %s userLastIds: %s", new Object[] { paramString, Integer.valueOf(paramInt1), Long.valueOf(this.qMB), this.qMy });
        if (paramInt1 != 2)
          break label221;
        if (!aa.XR(paramString))
          AppMethodBeat.o(36578);
      }
      long l = 0L;
      synchronized (this.qMy)
      {
        if (this.qMy.containsKey(paramString))
          l = ((Long)this.qMy.get(paramString)).longValue();
        if (l == 0L)
        {
          aa.XS(paramString);
          AppMethodBeat.o(36578);
        }
      }
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(new aa(paramString, l, paramBoolean, paramInt2), 0);
      AppMethodBeat.o(36578);
      continue;
      label221: if (paramInt1 == 1)
      {
        if (!y.XO("@__weixintimtline"))
        {
          AppMethodBeat.o(36578);
        }
        else if (this.qMB == 0L)
        {
          y.XP("@__weixintimtline");
          AppMethodBeat.o(36578);
        }
        else
        {
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RO().eJo.a(new y(this.qMB), 0);
          AppMethodBeat.o(36578);
        }
      }
      else if ((paramInt1 != 3) && (paramInt1 == 4))
      {
        if (!n.XO("@__classify_timeline"))
        {
          AppMethodBeat.o(36578);
        }
        else if (this.qMB == 0L)
        {
          n.XP("@__classify_timeline");
          AppMethodBeat.o(36578);
        }
        else
        {
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RO().eJo.a(new n(""), 0);
        }
      }
      else
        AppMethodBeat.o(36578);
    }
  }

  public final int cod()
  {
    AppMethodBeat.i(36581);
    int i;
    if (this.qMA > 0)
    {
      i = this.qMA;
      AppMethodBeat.o(36581);
    }
    while (true)
    {
      return i;
      i = i.cmr();
      AppMethodBeat.o(36581);
    }
  }

  public final Intent e(Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(36575);
    paramIntent.putExtra("sns_userName", paramString);
    if ((this.qMC != null) && (this.qMC.contains(paramString)))
    {
      paramIntent.addFlags(536870912);
      paramIntent.addFlags(67108864);
      AppMethodBeat.o(36575);
    }
    while (true)
    {
      return paramIntent;
      AppMethodBeat.o(36575);
    }
  }

  public final void j(String paramString, ArrayList<com.tencent.mm.plugin.sns.h.b> paramArrayList)
  {
    AppMethodBeat.i(36573);
    this.qMD.put(paramString, paramArrayList);
    AppMethodBeat.o(36573);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(36584);
    ab.i("MicroMsg.SnsService", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramm.getType());
    int i;
    if (((paramInt1 != 4) || (paramInt2 != 207)) && ((paramInt1 != 4) || (paramInt2 != 203)))
      if ((paramInt1 == 4) && ((paramInt2 == 2001) || (paramInt2 == 2004) || (paramInt2 == 2005)))
      {
        i = 1;
        if (i != 0)
          break label173;
        AppMethodBeat.o(36584);
      }
    while (true)
    {
      return;
      if ((paramInt1 == 4) && ((paramInt2 == 2001) || (paramInt2 == 2003)))
      {
        i = 1;
        break;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        i = 0;
        break;
      }
      i = 1;
      break;
      label173: d locald;
      label642: label648: switch (paramm.getType())
      {
      default:
        if ((paramm.getType() == 212) || (paramm.getType() == 211))
        {
          locald = (d)paramm;
          paramm = new ArrayList(this.ftE.keySet()).iterator();
        }
        label346: break;
      case 212:
      case 211:
        label250: 
        while (paramm.hasNext())
        {
          ??? = (h.a)paramm.next();
          if (this.ftE.containsKey(???))
          {
            paramString = (String)this.ftE.get(???);
            if (locald.getUserName().equals(paramString))
            {
              ab.d("MicroMsg.SnsService", "notify ui ".concat(String.valueOf(paramString)));
              boolean bool3;
              if (locald.cmQ() == 0L)
              {
                paramString = "";
                if (!locald.cmM())
                  break label648;
                bool1 = locald.cmO();
                bool2 = locald.cmN();
                bool3 = locald.cmR();
                if ((paramInt1 != 4) || ((paramInt2 != 2001) && (paramInt2 != 2004) && (paramInt2 != 2003) && (paramInt2 != 2005) && (paramInt2 != 203)))
                  break label642;
              }
              for (boolean bool4 = true; ; bool4 = false)
              {
                while (true)
                {
                  ((h.a)???).a(bool1, bool2, paramString, bool3, bool4, paramInt2, locald.cmS(), locald.cmT());
                  break label250;
                  ??? = (aa)paramm;
                  paramString = ((aa)???).userName;
                  long l = ((aa)???).qIY;
                  i = ((aa)???).qJa;
                  if (i > 0);
                  synchronized (this.qMz)
                  {
                    while (true)
                    {
                      this.qMz.put(paramString, Integer.valueOf(i));
                      if (l == 0L)
                        break;
                      synchronized (this.qMy)
                      {
                        this.qMy.put(paramString, Long.valueOf(l));
                      }
                    }
                  }
                }
                paramString = (y)paramm;
                B(paramString.qIY, paramString.qJa);
                i = paramString.qJb;
                if (qMx != i)
                  i.CM(i);
                qMx = i;
                break;
                paramString = i.jW(locald.cmQ());
                break label346;
              }
              boolean bool1 = locald.cmN();
              boolean bool2 = locald.cmP();
              if ((paramInt1 == 4) && ((paramInt2 == 2001) || (paramInt2 == 2004) || (paramInt2 == 2003) || (paramInt2 == 2005) || (paramInt2 == 203)));
              for (bool4 = true; ; bool4 = false)
              {
                ((h.a)???).a(bool1, paramString, bool2, bool4, paramInt2, locald.cmS(), locald.cmT());
                break;
              }
            }
          }
        }
      }
      AppMethodBeat.o(36584);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.am.a
 * JD-Core Version:    0.6.2
 */