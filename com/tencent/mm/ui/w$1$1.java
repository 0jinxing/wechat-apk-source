package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.sns.b.m;
import com.tencent.mm.plugin.websearch.api.am;
import com.tencent.mm.plugin.websearch.api.am.a;
import com.tencent.mm.pluginsdk.f.f;
import com.tencent.mm.pluginsdk.f.f.a;
import com.tencent.mm.pluginsdk.f.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.z;

final class w$1$1
  implements com.tencent.mm.vending.c.a<Void, Integer>
{
  w$1$1(w.1 param1)
  {
  }

  private Void k(Integer paramInteger)
  {
    AppMethodBeat.i(29650);
    this.yob.yoa.ynT.px(false);
    this.yob.yoa.ynT.MO(paramInteger.intValue());
    if ((paramInteger.intValue() <= 0) && (com.tencent.mm.bn.a.dgL()) && (com.tencent.mm.bi.d.akQ().baS() > 0))
      this.yob.yoa.ynT.px(true);
    if ((paramInteger.intValue() <= 0) && ((r.YK() & 0x8000) == 0))
    {
      aw.ZK();
      if (ah.f((Boolean)com.tencent.mm.model.c.Ry().get(68384, null)))
      {
        aw.ZK();
        if (!ah.isNullOrNil((String)com.tencent.mm.model.c.Ry().get(68377, null)))
        {
          this.yob.yoa.ynT.px(true);
          paramInteger = zXH;
          AppMethodBeat.o(29650);
        }
        while (true)
        {
          return paramInteger;
          aw.ZK();
          if (!((Boolean)com.tencent.mm.model.c.Ry().get(589825, Boolean.FALSE)).booleanValue())
            break;
          this.yob.yoa.ynT.px(true);
          paramInteger = zXH;
          AppMethodBeat.o(29650);
        }
        localObject = com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVv, null);
        if (localObject == null);
        for (long l = 0L; ; l = ((Long)localObject).longValue())
        {
          if ((l == 0L) || (!((m)com.tencent.mm.kernel.g.K(m.class)).jM(l)))
            break label303;
          this.yob.yoa.ynT.px(true);
          paramInteger = zXH;
          AppMethodBeat.o(29650);
          break;
        }
      }
    }
    label303: Object localObject = ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr();
    if (com.tencent.mm.au.b.sO((String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null)))
    {
      ab.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "checkLookVisibility EuropeanUnionCountry");
      label345: if ((((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.welab.a.a.a.class)).agO("labs_nearbylife")) && (((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.welab.a.a.a.class)).xj("labs_nearbylife")) && (((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVZ, Boolean.TRUE)).booleanValue()))
        this.yob.yoa.ynT.px(true);
      if (paramInteger.intValue() > 0)
        break label708;
      if ((r.YE() & 0x400000) == 0L)
        break label694;
    }
    boolean bool;
    label694: for (int i = 1; ; i = 0)
    {
      localObject = com.tencent.mm.m.g.Nu().getValue("JDEntranceConfigName");
      String str1 = com.tencent.mm.m.g.Nu().getValue("JDEntranceConfigIconUrl");
      String str2 = com.tencent.mm.m.g.Nu().getValue("JDEntranceConfigJumpUrl");
      ab.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "jd tryshow configName " + (String)localObject + " iconUrl " + str1 + " jumpUrl " + str2);
      if ((i != 0) || (ah.isNullOrNil((String)localObject)) || (ah.isNullOrNil(str1)) || (ah.isNullOrNil(str2)))
        break label708;
      localObject = f.vdy;
      if (localObject == null)
        break label708;
      bool = ((f.b)localObject).cDt();
      ab.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "jdshowFriend ".concat(String.valueOf(bool)));
      if (!bool)
        break label708;
      localObject = ((f.b)localObject).cDB();
      if ((!((f.a)localObject).isStart()) || (((f.a)localObject).bxX()))
        break label700;
      this.yob.yoa.ynT.px(true);
      paramInteger = zXH;
      AppMethodBeat.o(29650);
      break;
      if ((localObject == null) || (!((com.tencent.mm.plugin.topstory.a.e)localObject).cFi()) || (!((com.tencent.mm.plugin.topstory.a.e)localObject).cFj()) || (!((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cET()))
        break label345;
      this.yob.yoa.ynT.px(true);
      break label345;
    }
    label700: ab.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "jd time is not start or jd time isExpire");
    label708: if ((r.YE() & 0x2000000) != 0L)
    {
      i = 1;
      label723: if (!com.tencent.mm.plugin.ipcall.d.bGW())
        break label1041;
      if ((i == 0) && (!this.yob.yoa.ynT.getShowFriendPoint()) && (paramInteger.intValue() <= 0))
      {
        aw.ZK();
        if (((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xLC, Integer.valueOf(0))).intValue() >= com.tencent.mm.m.g.Nu().getInt("WCOEntranceRedDot", 0))
        {
          aw.ZK();
          if (((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xLE, Boolean.FALSE)).booleanValue() != true);
        }
        else
        {
          this.yob.yoa.ynT.px(true);
        }
      }
      label837: if ((r.YE() & 0x200000) == 0L)
        break label1060;
      i = 1;
      label852: if (i == 0)
      {
        paramInteger = am.cVt();
        if ((paramInteger.uaS == null) || (!paramInteger.uaS.isValid()) || (paramInteger.uaS.uaW != 1))
          break label1066;
        i = 1;
        label892: if (i != 0)
          this.yob.yoa.ynT.px(true);
      }
      aw.ZK();
      if ((com.tencent.mm.model.c.Ry().getInt(40, 0) & 0x20000) != 0)
        break label1078;
    }
    label1041: label1060: label1066: label1078: for (i = 1; ; i = 0)
    {
      if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("VoiceprintEntry"), 0) == 1)
        aw.ZK();
      for (bool = ((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xJG, Boolean.TRUE)).booleanValue(); ; bool = false)
      {
        if ((bool) && (i != 0))
        {
          ab.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "show voiceprint dot");
          this.yob.yoa.ynT.py(true);
        }
        this.yob.yoa.ynU = false;
        paramInteger = zXH;
        AppMethodBeat.o(29650);
        break;
        i = 0;
        break label723;
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xLB, Boolean.FALSE);
        break label837;
        i = 0;
        break label852;
        i = 0;
        break label892;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.w.1.1
 * JD-Core Version:    0.6.2
 */