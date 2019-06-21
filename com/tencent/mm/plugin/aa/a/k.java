package com.tencent.mm.plugin.aa.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.protocal.protobuf.i;
import com.tencent.mm.protocal.protobuf.y;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;
import java.util.Map;

public final class k
  implements com.tencent.mm.ai.f
{
  public static String glP = "title";
  public static String glQ = "totalPayAmount";
  public static String glR = "totalUserNumber";
  public static String glS = "perAmount";
  public static String glT = "chatRoomName";
  public static String glU = "launchScene";
  public static String glV = "payerlist";
  public static String glW = "timestamp";
  private static int glX = 131100026;
  private com.tencent.mm.vending.g.b fsC;
  private boolean glY = false;
  private Map<String, Object> glZ;
  private int mode = 0;

  public final boolean c(int paramInt, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(40632);
    this.fsC = com.tencent.mm.vending.g.f.dMj();
    boolean bool;
    if (this.glY)
    {
      ab.e("MicroMsg.LaunchAALogic", "launchAA, isLaunching!!! ignore it");
      this.fsC.cR(Boolean.FALSE);
      bool = false;
      AppMethodBeat.o(40632);
    }
    while (true)
    {
      return bool;
      if ((paramMap == null) || (paramMap.size() == 0))
      {
        this.fsC.cR(Boolean.FALSE);
        bool = false;
        AppMethodBeat.o(40632);
      }
      else
      {
        ab.i("MicroMsg.LaunchAALogic", "launchAAByMoney, data.keySet: %s", new Object[] { paramMap.keySet() });
        this.glY = true;
        this.glZ = paramMap;
        this.mode = paramInt;
        Object localObject;
        long l1;
        String str;
        long l2;
        com.tencent.mm.plugin.aa.a.a.f localf;
        if (paramInt == a.gkT)
        {
          if ((this.glZ.containsKey(glP)) && (this.glZ.containsKey(glS)) && (this.glZ.containsKey(glR)) && (this.glZ.containsKey(glU)) && (this.glZ.containsKey(glT)) && (this.glZ.containsKey(glW)))
          {
            try
            {
              localObject = (String)this.glZ.get(glP);
              l1 = ((Long)this.glZ.get(glS)).longValue();
              paramInt = ((Integer)this.glZ.get(glR)).intValue();
              int i = ((Integer)this.glZ.get(glU)).intValue();
              str = (String)this.glZ.get(glT);
              l2 = ((Long)this.glZ.get(glW)).longValue();
              ab.i("MicroMsg.LaunchAALogic", "launchAAByMoney");
              com.tencent.mm.kernel.g.RQ();
              paramMap = com.tencent.mm.kernel.g.RO().eJo;
              localf = new com/tencent/mm/plugin/aa/a/a/f;
              localf.<init>(l1, (String)localObject, paramInt, i, l2, str);
              paramMap.a(localf, 0);
              if ((paramInt > 0) && (paramInt <= 10))
                paramInt = 13;
              while (true)
              {
                com.tencent.mm.plugin.report.service.h.pYm.a(407L, paramInt, 1L, false);
                this.fsC.dMi();
                bool = true;
                AppMethodBeat.o(40632);
                break;
                if ((paramInt > 10) && (paramInt <= 20))
                  paramInt = 14;
                else if ((paramInt > 20) && (paramInt <= 50))
                  paramInt = 15;
                else
                  paramInt = 16;
              }
            }
            catch (Exception paramMap)
            {
              ab.e("MicroMsg.LaunchAALogic", "launchAAByMoney, without specific user error: %s", new Object[] { paramMap.getMessage() });
              this.fsC.cR(Boolean.FALSE);
              this.glY = false;
              bool = false;
              AppMethodBeat.o(40632);
            }
          }
          else
          {
            this.fsC.cR(Boolean.FALSE);
            this.glY = false;
            bool = false;
            AppMethodBeat.o(40632);
          }
        }
        else if (paramInt == a.gkU)
        {
          if ((this.glZ.containsKey(glP)) && (this.glZ.containsKey(glS)) && (this.glZ.containsKey(glV)) && (this.glZ.containsKey(glU)) && (this.glZ.containsKey(glT)) && (this.glZ.containsKey(glW)))
          {
            try
            {
              str = (String)this.glZ.get(glP);
              l2 = ((Long)this.glZ.get(glS)).longValue();
              localObject = (List)this.glZ.get(glV);
              paramInt = ((Integer)this.glZ.get(glU)).intValue();
              paramMap = (String)this.glZ.get(glT);
              l1 = ((Long)this.glZ.get(glW)).longValue();
              com.tencent.mm.kernel.g.RQ();
              p localp = com.tencent.mm.kernel.g.RO().eJo;
              localf = new com/tencent/mm/plugin/aa/a/a/f;
              localf.<init>(l2, str, (List)localObject, paramInt, l1, paramMap);
              localp.a(localf, 0);
              paramInt = ((List)localObject).size();
              if ((paramInt > 0) && (paramInt <= 10))
                paramInt = 13;
              while (true)
              {
                com.tencent.mm.plugin.report.service.h.pYm.a(407L, paramInt, 1L, false);
                this.fsC.dMi();
                bool = true;
                AppMethodBeat.o(40632);
                break;
                if ((paramInt > 10) && (paramInt <= 20))
                  paramInt = 14;
                else if ((paramInt > 20) && (paramInt <= 50))
                  paramInt = 15;
                else
                  paramInt = 16;
              }
            }
            catch (Exception paramMap)
            {
              ab.e("MicroMsg.LaunchAALogic", "launchAAByMoney, specific user error: %", new Object[] { paramMap.getMessage() });
              this.fsC.cR(Boolean.FALSE);
              this.glY = false;
              bool = false;
              AppMethodBeat.o(40632);
            }
          }
          else
          {
            this.fsC.cR(Boolean.FALSE);
            this.glY = false;
            bool = false;
            AppMethodBeat.o(40632);
          }
        }
        else
        {
          bool = false;
          AppMethodBeat.o(40632);
        }
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(40634);
    ab.d("MicroMsg.LaunchAALogic", "onSceneEnd, errType: %s, errCode: %s, scene: %s, mode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramm, Integer.valueOf(this.mode) });
    String str;
    boolean bool;
    if (paramm.getType() == 1624)
    {
      this.glY = false;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramm = (com.tencent.mm.plugin.aa.a.a.f)paramm;
        paramString = paramm.gmi;
        paramInt1 = paramString.kCl;
        str = paramString.kCm;
        if (paramString.vzN == null)
        {
          bool = true;
          ab.i("MicroMsg.LaunchAALogic", "launchAAByMoney, onSceneEnd, retCode: %s, retmsg: %s, msgXml==null: %s, billNo: %s", new Object[] { Integer.valueOf(paramInt1), str, Boolean.valueOf(bool), paramString.vzL });
          if (paramString.kCl != 0)
            break label250;
          if (paramString.vzN == null)
            break label221;
          h.w(paramString.vzL, paramm.chatroomName, paramString.vzN);
          com.tencent.mm.vending.g.f.a(this.fsC, new Object[] { Boolean.TRUE });
          label189: h.vF(paramm.chatroomName);
          com.tencent.mm.plugin.report.service.h.pYm.a(407L, 0L, 1L, false);
          AppMethodBeat.o(40634);
        }
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label221: h.a(paramString.vzL, false, 0L);
      com.tencent.mm.vending.g.f.a(this.fsC, new Object[] { Boolean.TRUE });
      break label189;
      label250: if (this.fsC != null)
      {
        if (paramString.kCl <= 0)
          break label357;
        paramm = paramString.vzT;
        if ((paramm == null) || (paramm.vAF <= 0))
          break label316;
        this.fsC.cR(paramm);
      }
      while (true)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(407L, 2L, 1L, false);
        AppMethodBeat.o(40634);
        break;
        label316: if (!bo.isNullOrNil(paramString.kCm))
        {
          this.fsC.cR(paramString.kCm);
        }
        else
        {
          this.fsC.cR(Boolean.FALSE);
          continue;
          label357: this.fsC.cR(Boolean.FALSE);
        }
      }
      if (this.fsC != null)
        this.fsC.cR(Boolean.FALSE);
      com.tencent.mm.plugin.report.service.h.pYm.a(407L, 1L, 1L, false);
      AppMethodBeat.o(40634);
      continue;
      if (paramm.getType() == 1655)
      {
        this.glY = false;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramm = (com.tencent.mm.plugin.aa.a.a.g)paramm;
          paramString = paramm.gmk;
          paramInt1 = paramString.kCl;
          str = paramString.kCm;
          if (paramString.vzN == null)
          {
            bool = true;
            label469: ab.i("MicroMsg.LaunchAALogic", "launchAAByPerson, onSceneEnd, retCode: %s, retmsg: %s, msgxml==null: %s", new Object[] { Integer.valueOf(paramInt1), str, Boolean.valueOf(bool) });
            ab.d("MicroMsg.LaunchAALogic", "launchAAByPerson, onSceneEnd, retMsg: %s, billNo: %s", new Object[] { paramString.kCm, paramString.vzL });
            if (paramString.kCl != 0)
              break label653;
            if (paramString.vzN == null)
              break label617;
            h.w(paramString.vzL, paramm.chatroomName, paramString.vzN);
            com.tencent.mm.vending.g.f.a(this.fsC, new Object[] { Boolean.TRUE, paramString.vzL });
          }
          while (true)
          {
            h.vF(paramm.chatroomName);
            com.tencent.mm.plugin.report.service.h.pYm.a(407L, 3L, 1L, false);
            AppMethodBeat.o(40634);
            break;
            bool = false;
            break label469;
            label617: h.a(paramString.vzL, false, 0L);
            com.tencent.mm.vending.g.f.a(this.fsC, new Object[] { Boolean.TRUE, paramString.vzL });
          }
          label653: if (paramString.kCl > 0)
          {
            paramm = paramString.vzT;
            if ((paramm != null) && (paramm.vAF > 0))
              this.fsC.cR(paramm);
          }
          while (true)
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(407L, 5L, 1L, false);
            AppMethodBeat.o(40634);
            break;
            if (!bo.isNullOrNil(paramString.kCm))
            {
              this.fsC.cR(paramString.kCm);
            }
            else
            {
              this.fsC.cR(Boolean.FALSE);
              continue;
              this.fsC.cR(Boolean.FALSE);
            }
          }
        }
        if (this.fsC != null)
          this.fsC.cR(Boolean.FALSE);
        com.tencent.mm.plugin.report.service.h.pYm.a(407L, 4L, 1L, false);
      }
      AppMethodBeat.o(40634);
    }
  }

  public final boolean r(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(40633);
    this.fsC = com.tencent.mm.vending.g.f.dMj();
    ab.i("MicroMsg.LaunchAALogic", "launchAAByPerson");
    boolean bool;
    if (this.glY)
    {
      ab.e("MicroMsg.LaunchAALogic", "launchAA, isLaunching!!! ignore it");
      this.fsC.cR(Boolean.FALSE);
      bool = false;
      AppMethodBeat.o(40633);
    }
    while (true)
    {
      return bool;
      if ((paramMap == null) || (paramMap.size() == 0))
      {
        this.fsC.cR(Boolean.FALSE);
        bool = false;
        AppMethodBeat.o(40633);
      }
      else
      {
        this.glY = true;
        this.glZ = paramMap;
        this.mode = a.gkV;
        if (this.mode != a.gkV)
        {
          this.fsC.cR(Boolean.FALSE);
          bool = false;
          AppMethodBeat.o(40633);
        }
        else if ((this.glZ.containsKey(glP)) && (this.glZ.containsKey(glQ)) && (this.glZ.containsKey(glV)) && (this.glZ.containsKey(glU)) && (this.glZ.containsKey(glT)) && (this.glZ.containsKey(glW)))
        {
          try
          {
            String str = (String)this.glZ.get(glP);
            long l1 = ((Long)this.glZ.get(glQ)).longValue();
            List localList = (List)this.glZ.get(glV);
            int i = ((Integer)this.glZ.get(glU)).intValue();
            paramMap = (String)this.glZ.get(glT);
            long l2 = ((Long)this.glZ.get(glW)).longValue();
            com.tencent.mm.kernel.g.RQ();
            p localp = com.tencent.mm.kernel.g.RO().eJo;
            com.tencent.mm.plugin.aa.a.a.g localg = new com/tencent/mm/plugin/aa/a/a/g;
            localg.<init>(str, l1, localList, i, paramMap, l2);
            localp.a(localg, 0);
            i = localList.size();
            if ((i > 0) && (i <= 10))
              i = 17;
            while (true)
            {
              com.tencent.mm.plugin.report.service.h.pYm.a(407L, i, 1L, false);
              this.fsC.dMi();
              bool = true;
              AppMethodBeat.o(40633);
              break;
              if ((i > 10) && (i <= 20))
                i = 18;
              else if ((i > 20) && (i <= 50))
                i = 19;
              else
                i = 20;
            }
          }
          catch (Exception paramMap)
          {
            ab.e("MicroMsg.LaunchAALogic", "launchAAByPerson error: %s", new Object[] { paramMap.getMessage() });
          }
        }
        else
        {
          this.fsC.cR(Boolean.FALSE);
          this.glY = false;
          bool = false;
          AppMethodBeat.o(40633);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.k
 * JD-Core Version:    0.6.2
 */