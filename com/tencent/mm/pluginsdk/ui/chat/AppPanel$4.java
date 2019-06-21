package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.sz.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class AppPanel$4
  implements AppGrid.b
{
  AppPanel$4(AppPanel paramAppPanel)
  {
  }

  public final int Lb(int paramInt)
  {
    AppMethodBeat.i(27748);
    int j;
    int k;
    int m;
    if (paramInt < AppPanel.f(this.vmj))
    {
      int i = AppPanel.g(this.vmj).length;
      j = 0;
      k = 0;
      if (j >= i)
        break label118;
      m = k;
      if (AppPanel.g(this.vmj)[j] != 0)
        if (k == paramInt)
        {
          AppMethodBeat.o(27748);
          paramInt = j;
        }
    }
    while (true)
    {
      return paramInt;
      m = k + 1;
      j++;
      k = m;
      break;
      if ((paramInt >= AppPanel.f(this.vmj)) && (paramInt < AppPanel.h(this.vmj)))
      {
        paramInt = -2147483648;
        AppMethodBeat.o(27748);
      }
      else
      {
        label118: paramInt = 2147483647;
        AppMethodBeat.o(27748);
      }
    }
  }

  public final void Lc(int paramInt)
  {
    AppMethodBeat.i(27749);
    if (paramInt == 0)
      if (!this.vmj.vlP.vmn.value)
      {
        Toast.makeText(AppPanel.i(this.vmj), AppPanel.i(this.vmj).getString(2131298184), 0).show();
        AppMethodBeat.o(27749);
      }
    while (true)
    {
      return;
      AppPanel.a(this.vmj, true);
      AppMethodBeat.o(27749);
      continue;
      AppMethodBeat.o(27749);
    }
  }

  public final void a(int paramInt, f paramf)
  {
    boolean bool1 = true;
    int i = 0;
    AppMethodBeat.i(27750);
    boolean bool2;
    Object localObject;
    if (paramf != null)
    {
      bool2 = true;
      ab.d("MicroMsg.AppPanel", "pos=%d, has appInfo = %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool2) });
      if ((paramf != null) && (com.tencent.mm.pluginsdk.model.app.g.l(paramf)))
      {
        localObject = paramf.field_appId;
        HashMap localHashMap = new HashMap();
        r.m(localHashMap);
        localHashMap.put(localObject, "1");
        r.l(localHashMap);
      }
    }
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(27750);
    case 2147483647:
    case 8:
    case -2147483648:
    case 1:
    case 12:
    case 7:
      while (true)
      {
        label262: return;
        bool2 = false;
        break;
        if (AppPanel.j(this.vmj) == null)
        {
          ab.e("MicroMsg.AppPanel", "infoList == null");
          AppMethodBeat.o(27750);
        }
        else
        {
          com.tencent.mm.plugin.report.service.h.pYm.X(10305, String.valueOf(AppPanel.j(this.vmj).size()));
          com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(10) });
          com.tencent.mm.kernel.g.RP().Ry().set(69121, "");
          AppPanel.k(this.vmj).bNT();
          AppMethodBeat.o(27750);
          continue;
          localObject = paramf;
          if (paramf == null)
            localObject = (f)AppPanel.l(this.vmj).get(f.vbQ);
          aw.ZK();
          paramInt = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue();
          aw.ZK();
          paramf = bo.P(((String)com.tencent.mm.model.c.Ry().get(ac.a.xPW, "")).split(";"));
          if (!paramf.contains(String.valueOf(paramInt)))
          {
            paramf.add(String.valueOf(paramInt));
            aw.ZK();
            com.tencent.mm.model.c.Ry().set(ac.a.xPW, bo.c(paramf, ";"));
            this.vmj.refresh();
          }
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(80, Boolean.FALSE);
          AppPanel.k(this.vmj).b((f)localObject);
          AppMethodBeat.o(27750);
          continue;
          if (!this.vmj.vlP.vmu.value)
          {
            Toast.makeText(AppPanel.i(this.vmj), AppPanel.i(this.vmj).getString(2131298184), 0).show();
            AppMethodBeat.o(27750);
          }
          else if (paramf == null)
          {
            ab.e("MicroMsg.AppPanel", "APP_MSG_POS bug appInfo is null");
            AppMethodBeat.o(27750);
          }
          else
          {
            if ((paramf.dhx()) || (paramf.dhA()))
            {
              if (AppPanel.m(this.vmj) == null)
                AppPanel.a(this.vmj, AppPanel.i(this.vmj).getSharedPreferences(ah.doA(), 0));
              if (AppPanel.m(this.vmj).getBoolean("SP_KEY_SERVICE_APP_PREFIX_" + paramf.field_appId, true))
                AppPanel.m(this.vmj).edit().putBoolean("SP_KEY_SERVICE_APP_PREFIX_" + paramf.field_appId, false).commit();
              if (paramf.dhA())
                com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(16), paramf.field_appId, Integer.valueOf(0) });
              com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(13), paramf.field_appId, Integer.valueOf(0) });
            }
            while (true)
            {
              AppPanel.k(this.vmj).b(paramf);
              AppMethodBeat.o(27750);
              break;
              com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(11), paramf.field_appId });
            }
            com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(14) });
            paramf = AppPanel.k(this.vmj);
            if (this.vmj.vlP.vmD.value);
            for (paramInt = i; ; paramInt = 2)
            {
              paramf.yt(paramInt);
              AppMethodBeat.o(27750);
              break;
            }
            if (!this.vmj.vlP.vmo.value)
            {
              Toast.makeText(AppPanel.i(this.vmj), AppPanel.i(this.vmj).getString(2131298184), 0).show();
              AppMethodBeat.o(27750);
            }
            else
            {
              com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(4) });
              AppPanel.k(this.vmj).bNS();
              AppMethodBeat.o(27750);
              continue;
              if (!this.vmj.vlP.vmE.value)
              {
                Toast.makeText(AppPanel.i(this.vmj), AppPanel.i(this.vmj).getString(2131298184), 0).show();
                AppMethodBeat.o(27750);
              }
              else
              {
                if (paramf != null)
                  break label1121;
                localObject = (f)AppPanel.l(this.vmj).get(f.vbS);
                paramf = (f)localObject;
                if (localObject != null)
                  break label1121;
                AppMethodBeat.o(27750);
              }
            }
          }
        }
      }
      label1121: if ((paramf.dhx()) || (paramf.dhA()))
      {
        if (AppPanel.m(this.vmj) == null)
          AppPanel.a(this.vmj, AppPanel.i(this.vmj).getSharedPreferences(ah.doA(), 0));
        if (AppPanel.m(this.vmj).getBoolean("SP_KEY_SERVICE_APP_PREFIX_" + paramf.field_appId, true))
          AppPanel.m(this.vmj).edit().putBoolean("SP_KEY_SERVICE_APP_PREFIX_" + paramf.field_appId, false).commit();
        com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(13), paramf.field_appId, Integer.valueOf(0) });
        bool2 = com.tencent.mm.x.c.PK().a(ac.a.xUs, ac.a.xUt);
        if (bool2)
          com.tencent.mm.x.c.PK().c(ac.a.xUs, ac.a.xUt);
        aw.ZK();
        paramInt = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue();
        aw.ZK();
        paramf = bo.P(((String)com.tencent.mm.model.c.Ry().get(ac.a.xPX, "")).split(";"));
        if (paramf.contains(String.valueOf(paramInt)))
          break label3187;
        paramf.add(String.valueOf(paramInt));
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xPX, bo.c(paramf, ";"));
        bool2 = bool1;
      }
      label1282: break;
    case 6:
    case 14:
    case 0:
    case 2:
    case 4:
    case 5:
    case 10:
    case 11:
    case 13:
    case 3:
    case 15:
    case 9:
    case 16:
    }
    label3187: 
    while (true)
    {
      if (bool2)
        this.vmj.refresh();
      AppPanel.k(this.vmj).bNX();
      AppMethodBeat.o(27750);
      break label262;
      com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(11), paramf.field_appId });
      break label1282;
      if ((!this.vmj.vlP.vmA.value) || (!this.vmj.vlP.vmB.value))
      {
        Toast.makeText(AppPanel.i(this.vmj), AppPanel.i(this.vmj).getString(2131298184), 0).show();
        AppMethodBeat.o(27750);
        break label262;
      }
      aw.ZK();
      if (((Boolean)com.tencent.mm.model.c.Ry().get(290817, Boolean.TRUE)).booleanValue())
      {
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(290817, Boolean.FALSE);
        this.vmj.refresh();
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(3) });
      AppPanel.k(this.vmj).bNR();
      AppMethodBeat.o(27750);
      break label262;
      if (!this.vmj.vlP.vms.value)
      {
        Toast.makeText(AppPanel.i(this.vmj), AppPanel.i(this.vmj).getString(2131298184), 0).show();
        AppMethodBeat.o(27750);
        break label262;
      }
      aw.ZK();
      if (((Boolean)com.tencent.mm.model.c.Ry().get(327744, Boolean.TRUE)).booleanValue())
      {
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(327744, Boolean.FALSE);
        this.vmj.refresh();
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(12) });
      AppPanel.k(this.vmj).bNV();
      AppMethodBeat.o(27750);
      break label262;
      if (!this.vmj.vlP.vmn.value)
      {
        Toast.makeText(AppPanel.i(this.vmj), AppPanel.i(this.vmj).getString(2131298184), 0).show();
        AppMethodBeat.o(27750);
        break label262;
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(1) });
      AppPanel.a(this.vmj, false);
      AppMethodBeat.o(27750);
      break label262;
      if (!this.vmj.vlP.vmq.value)
      {
        Toast.makeText(AppPanel.i(this.vmj), AppPanel.i(this.vmj).getString(2131298184), 0).show();
        AppMethodBeat.o(27750);
        break label262;
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(8) });
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(54, Boolean.FALSE);
      if (AppPanel.k(this.vmj) == null)
        break;
      paramf = new sz();
      paramf.cPf.cPh = true;
      com.tencent.mm.sdk.b.a.xxA.m(paramf);
      paramf = paramf.cPg.cPj;
      if (!bo.isNullOrNil(paramf))
      {
        ab.v("MicroMsg.AppPanel", "Talkroom is on: ".concat(String.valueOf(paramf)));
        com.tencent.mm.ui.base.h.d(AppPanel.i(this.vmj), AppPanel.i(this.vmj).getString(2131303996), "", AppPanel.i(this.vmj).getString(2131296994), AppPanel.i(this.vmj).getString(2131296868), new AppPanel.4.1(this), new AppPanel.4.2(this));
        AppMethodBeat.o(27750);
        break label262;
      }
      AppPanel.k(this.vmj).bNO();
      AppMethodBeat.o(27750);
      break label262;
      if (!this.vmj.vlP.vmw.value)
      {
        Toast.makeText(AppPanel.i(this.vmj), AppPanel.i(this.vmj).getString(2131298184), 0).show();
        AppMethodBeat.o(27750);
        break label262;
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(7) });
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(62, Boolean.FALSE);
      paramf = new sz();
      paramf.cPf.cPh = true;
      com.tencent.mm.sdk.b.a.xxA.m(paramf);
      paramf = paramf.cPg.cPj;
      if (!bo.isNullOrNil(paramf))
      {
        ab.v("MicroMsg.AppPanel", "Talkroom is on: ".concat(String.valueOf(paramf)));
        com.tencent.mm.ui.base.h.d(AppPanel.i(this.vmj), AppPanel.i(this.vmj).getString(2131303996), "", AppPanel.i(this.vmj).getString(2131296994), AppPanel.i(this.vmj).getString(2131296868), new AppPanel.4.3(this), new AppPanel.4.4(this));
        AppMethodBeat.o(27750);
        break label262;
      }
      AppPanel.k(this.vmj).bNP();
      AppMethodBeat.o(27750);
      break label262;
      if (AppPanel.k(this.vmj) == null)
        break;
      com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(6) });
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(67, Boolean.FALSE);
      AppPanel.k(this.vmj).bNQ();
      AppMethodBeat.o(27750);
      break label262;
      com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(9) });
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(73, Boolean.FALSE);
      AppPanel.n(this.vmj).djW();
      AppMethodBeat.o(27750);
      break label262;
      if (!this.vmj.vlP.vmp.value)
      {
        Toast.makeText(AppPanel.i(this.vmj), AppPanel.i(this.vmj).getString(2131298184), 0).show();
        AppMethodBeat.o(27750);
        break label262;
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(5) });
      if (AppPanel.k(this.vmj) == null)
        break;
      AppPanel.k(this.vmj).bNU();
      AppMethodBeat.o(27750);
      break label262;
      if (!this.vmj.vlP.vmC.value)
      {
        Toast.makeText(AppPanel.i(this.vmj), AppPanel.i(this.vmj).getString(2131298184), 0).show();
        AppMethodBeat.o(27750);
        break label262;
      }
      if (AppPanel.k(this.vmj) != null)
        AppPanel.k(this.vmj).bNW();
      com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(15) });
      aw.ZK();
      bool1 = ((Boolean)com.tencent.mm.model.c.Ry().get(208899, Boolean.FALSE)).booleanValue();
      aw.ZK();
      bool2 = ((Boolean)com.tencent.mm.model.c.Ry().get(208913, Boolean.FALSE)).booleanValue();
      if (bool1)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(11594, new Object[] { Integer.valueOf(3) });
        AppMethodBeat.o(27750);
        break label262;
      }
      if (!bool2)
        break;
      com.tencent.mm.plugin.report.service.h.pYm.e(11594, new Object[] { Integer.valueOf(4) });
      AppMethodBeat.o(27750);
      break label262;
      if (AppPanel.k(this.vmj) == null)
        break;
      AppPanel.k(this.vmj).bNY();
      AppMethodBeat.o(27750);
      break label262;
      if (!this.vmj.vlP.vmG.value)
      {
        Toast.makeText(AppPanel.i(this.vmj), AppPanel.i(this.vmj).getString(2131298184), 0).show();
        AppMethodBeat.o(27750);
        break label262;
      }
      AppPanel.k(this.vmj).bNZ();
      AppMethodBeat.o(27750);
      break label262;
      if (AppPanel.k(this.vmj) == null)
        break;
      if (paramf == null)
      {
        localObject = (f)AppPanel.l(this.vmj).get(f.vbT);
        paramf = (f)localObject;
        if (localObject == null)
        {
          ab.i("MicroMsg.AppPanel", "empty info");
          AppMethodBeat.o(27750);
          break label262;
        }
      }
      if ((paramf.dhx()) || (paramf.dhA()))
      {
        if (AppPanel.m(this.vmj) == null)
          AppPanel.a(this.vmj, AppPanel.i(this.vmj).getSharedPreferences(ah.doA(), 0));
        if (AppPanel.m(this.vmj).getBoolean("SP_KEY_SERVICE_APP_PREFIX_" + paramf.field_appId, true))
          AppPanel.m(this.vmj).edit().putBoolean("SP_KEY_SERVICE_APP_PREFIX_" + paramf.field_appId, false).commit();
      }
      AppPanel.k(this.vmj).bOa();
      AppMethodBeat.o(27750);
      break label262;
      if (!this.vmj.vlP.vmI.value)
      {
        Toast.makeText(AppPanel.i(this.vmj), AppPanel.i(this.vmj).getString(2131298184), 0).show();
        AppMethodBeat.o(27750);
        break label262;
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(10923, new Object[] { Integer.valueOf(17) });
      if (AppPanel.k(this.vmj) == null)
        break;
      AppPanel.k(this.vmj).bOb();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.AppPanel.4
 * JD-Core Version:    0.6.2
 */