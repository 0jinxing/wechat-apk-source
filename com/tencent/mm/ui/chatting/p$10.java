package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uh;
import com.tencent.mm.g.a.uh.a;
import com.tencent.mm.g.b.a.l;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.ui.chat.AppPanel.a;
import com.tencent.mm.pluginsdk.ui.tools.NewFileExplorerUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.chatting.c.b.u;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

final class p$10
  implements AppPanel.a
{
  com.tencent.mm.ui.widget.a.d pki = null;

  p$10(p paramp)
  {
  }

  public final void b(com.tencent.mm.pluginsdk.model.app.f paramf)
  {
    AppMethodBeat.i(30643);
    ((com.tencent.mm.ui.chatting.c.b.b)p.e(this.yJn).aF(com.tencent.mm.ui.chatting.c.b.b.class)).q(paramf);
    AppMethodBeat.o(30643);
  }

  public final void bNO()
  {
    AppMethodBeat.i(30637);
    if (com.tencent.mm.r.a.bH(p.e(this.yJn).yTx.getContext()))
    {
      AppMethodBeat.o(30637);
      return;
    }
    uh localuh = new uh();
    com.tencent.mm.sdk.b.a.xxA.m(localuh);
    if ((this.yJn.getTalkerUserName() != null) && (!this.yJn.getTalkerUserName().equals(localuh.cQt.talker)) && ((localuh.cQt.cQv) || (localuh.cQt.cQw)))
    {
      if (localuh.cQt.cQu);
      for (int i = 2131297782; ; i = 2131297783)
      {
        Toast.makeText(p.e(this.yJn).yTx.getContext(), i, 0).show();
        ab.i("MicroMsg.ChattingFooterEventImpl", "voip is running, can't do this");
        AppMethodBeat.o(30637);
        break;
      }
    }
    boolean bool;
    if (1 == com.tencent.mm.m.g.Nu().getInt("EnableVoiceVoipFromPlugin", 0))
    {
      if ((!ad.aox(p.e(this.yJn).sRl.field_username)) && (!t.mP(p.e(this.yJn).sRl.field_username)))
        break label362;
      if ((((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).vi(p.e(this.yJn).sRl.field_openImAppid) & 0x2000) == 0)
        bool = true;
    }
    while (true)
    {
      label240: this.pki = new com.tencent.mm.ui.widget.a.d(p.e(this.yJn).yTx.getContext(), 1, false);
      this.pki.rBl = new p.10.1(this, bool);
      this.pki.rBm = new p.10.2(this);
      this.pki.cpD();
      while (true)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(11033, new Object[] { Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(0) });
        AppMethodBeat.o(30637);
        break;
        bool = false;
        break label240;
        this.yJn.dCl();
      }
      label362: bool = false;
    }
  }

  public final void bNP()
  {
    AppMethodBeat.i(30638);
    if (com.tencent.mm.r.a.bH(p.e(this.yJn).yTx.getContext()))
      AppMethodBeat.o(30638);
    while (true)
    {
      return;
      uh localuh = new uh();
      com.tencent.mm.sdk.b.a.xxA.m(localuh);
      if ((!this.yJn.getTalkerUserName().equals(localuh.cQt.talker)) && ((localuh.cQt.cQv) || (localuh.cQt.cQw)))
      {
        if (localuh.cQt.cQu);
        for (int i = 2131297782; ; i = 2131297783)
        {
          Toast.makeText(p.e(this.yJn).yTx.getContext(), i, 0).show();
          ab.i("MicroMsg.ChattingFooterEventImpl", "voip is running, can't do this");
          AppMethodBeat.o(30638);
          break;
        }
      }
      this.yJn.dCk();
      AppMethodBeat.o(30638);
    }
  }

  public final void bNQ()
  {
    AppMethodBeat.i(30639);
    if ((!com.tencent.mm.r.a.bJ(p.e(this.yJn).yTx.getContext())) && (!com.tencent.mm.r.a.bH(p.e(this.yJn).yTx.getContext())))
    {
      boolean bool = com.tencent.mm.pluginsdk.permission.b.a(p.e(this.yJn).yTx.getContext(), "android.permission.RECORD_AUDIO", 81, "", "");
      ab.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), p.e(this.yJn).yTx.getContext() });
      if (!bool)
        AppMethodBeat.o(30639);
    }
    while (true)
    {
      return;
      this.yJn.dCm();
      AppMethodBeat.o(30639);
    }
  }

  public final void bNR()
  {
    AppMethodBeat.i(30640);
    ((u)p.e(this.yJn).aF(u.class)).dEH();
    AppMethodBeat.o(30640);
  }

  public final void bNS()
  {
    AppMethodBeat.i(30641);
    ((com.tencent.mm.ui.chatting.c.b.e)p.e(this.yJn).aF(com.tencent.mm.ui.chatting.c.b.e.class)).dDD();
    AppMethodBeat.o(30641);
  }

  public final void bNT()
  {
    AppMethodBeat.i(30644);
    com.tencent.mm.bp.d.b(p.e(this.yJn).yTx.getContext(), "subapp", ".ui.openapi.AddAppUI", new Intent());
    AppMethodBeat.o(30644);
  }

  public final void bNU()
  {
    AppMethodBeat.i(30645);
    Intent localIntent = new Intent();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("3");
    if (com.tencent.mm.aj.f.kq(p.n(this.yJn).field_username))
    {
      localArrayList.add("4");
      localArrayList.add("7");
      localArrayList.add("9");
      localArrayList.add("10");
      localArrayList.add("11");
      localArrayList.add("12");
      localArrayList.add("13");
      localArrayList.add("15");
      localArrayList.add("16");
      localArrayList.add("17");
      localArrayList.add("18");
    }
    localIntent.putExtra("key_to_user", p.n(this.yJn).field_username);
    localIntent.putExtra("key_fav_item_id", TextUtils.join(",", localArrayList));
    com.tencent.mm.plugin.fav.a.b.b(p.e(this.yJn).yTx.getContext(), ".ui.FavSelectUI", localIntent);
    com.tencent.mm.plugin.report.service.h.pYm.e(14103, new Object[] { Integer.valueOf(1) });
    AppMethodBeat.o(30645);
  }

  public final void bNV()
  {
    AppMethodBeat.i(30646);
    Intent localIntent = new Intent();
    localIntent.putExtra("service_app_talker_user", this.yJn.getTalkerUserName());
    com.tencent.mm.bp.d.a(p.e(this.yJn).yTx, "subapp", ".ui.openapi.ServiceAppUI", localIntent, 222);
    AppMethodBeat.o(30646);
  }

  public final void bNW()
  {
    AppMethodBeat.i(30647);
    Intent localIntent = new Intent();
    localIntent.putExtra("download_entrance_scene", 17);
    localIntent.putExtra("preceding_scence", 13);
    com.tencent.mm.bp.d.b(p.e(this.yJn).yTx.getContext(), "emoji", ".ui.v2.EmojiStoreV2UI", localIntent);
    com.tencent.mm.plugin.report.service.h.pYm.e(12065, new Object[] { Integer.valueOf(4) });
    AppMethodBeat.o(30647);
  }

  public final void bNX()
  {
    AppMethodBeat.i(30649);
    com.tencent.mm.plugin.report.service.h.pYm.e(12097, new Object[] { Integer.valueOf(11), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
    com.tencent.mm.plugin.report.service.h.pYm.e(11850, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
    Object localObject1;
    int i;
    if (p.o(this.yJn))
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(2) });
      localObject1 = new Intent();
      i = com.tencent.mm.model.n.mA(this.yJn.getTalkerUserName());
      ((Intent)localObject1).putExtra("key_way", 1);
      ((Intent)localObject1).putExtra("key_chatroom_num", i);
      ((Intent)localObject1).putExtra("key_type", 1);
      ((Intent)localObject1).putExtra("key_from", 1);
      ((Intent)localObject1).putExtra("key_username", this.yJn.getTalkerUserName());
      ((Intent)localObject1).putExtra("pay_channel", 14);
      com.tencent.mm.bp.d.b(p.e(this.yJn).yTx.getContext(), "luckymoney", ".ui.LuckyMoneyPrepareUI", (Intent)localObject1);
      AppMethodBeat.o(30649);
    }
    while (true)
    {
      return;
      aw.ZK();
      localObject1 = (Integer)c.Ry().get(ac.a.xJB, Integer.valueOf(0));
      aw.ZK();
      Object localObject2 = (Integer)c.Ry().get(ac.a.xJC, Integer.valueOf(0));
      if ((((Integer)localObject1).intValue() == 1) || (((Integer)localObject2).intValue() == 1))
        if (r.YG() != 0)
          break label448;
      label448: for (i = 1; ; i = 0)
      {
        if (i != 0)
          break label453;
        com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(1) });
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("key_way", 0);
        ((Intent)localObject1).putExtra("key_type", 0);
        ((Intent)localObject1).putExtra("key_from", 1);
        ((Intent)localObject1).putExtra("key_username", this.yJn.getTalkerUserName());
        ((Intent)localObject1).putExtra("pay_channel", 11);
        com.tencent.mm.bp.d.b(p.e(this.yJn).yTx.getContext(), "luckymoney", ".ui.LuckyMoneyPrepareUI", (Intent)localObject1);
        AppMethodBeat.o(30649);
        break;
      }
      label453: localObject1 = new l();
      ((l)localObject1).cVT = 13L;
      ((l)localObject1).ajK();
      localObject1 = p.e(this.yJn).yTx.getMMResources().getString(2131298177);
      localObject2 = p.e(this.yJn).yTx.getMMResources().getString(2131298176);
      Activity localActivity = p.e(this.yJn).yTx.getContext();
      h.c local4 = new h.c()
      {
        public final void iE(int paramAnonymousInt)
        {
          AppMethodBeat.i(30635);
          Object localObject = new Intent();
          switch (paramAnonymousInt)
          {
          default:
          case 0:
          case 1:
          }
          while (true)
          {
            AppMethodBeat.o(30635);
            while (true)
            {
              return;
              com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(1) });
              ((Intent)localObject).putExtra("key_way", 0);
              ((Intent)localObject).putExtra("key_type", 0);
              ((Intent)localObject).putExtra("key_from", 1);
              ((Intent)localObject).putExtra("key_username", p.10.this.yJn.getTalkerUserName());
              ((Intent)localObject).putExtra("pay_channel", 11);
              com.tencent.mm.bp.d.b(p.e(p.10.this.yJn).yTx.getContext(), "luckymoney", ".ui.LuckyMoneyPrepareUI", (Intent)localObject);
              AppMethodBeat.o(30635);
            }
            com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(3) });
            ((Intent)localObject).putExtra("key_username", p.10.this.yJn.getTalkerUserName());
            ((Intent)localObject).putExtra("key_way", 0);
            ((Intent)localObject).putExtra("pay_channel", 11);
            com.tencent.mm.bp.d.b(p.e(p.10.this.yJn).yTx.getContext(), "luckymoney", ".ui.LuckyMoneyNewYearSendUI", (Intent)localObject);
            localObject = new l();
            ((l)localObject).cVT = 1L;
            ((l)localObject).ajK();
          }
        }
      };
      com.tencent.mm.ui.base.h.a(localActivity, null, new String[] { localObject1, localObject2 }, null, local4);
      AppMethodBeat.o(30649);
    }
  }

  public final void bNY()
  {
    AppMethodBeat.i(30650);
    aw.ZK();
    c.Ry().set(81, Boolean.FALSE);
    if (!at.isNetworkConnected(p.e(this.yJn).yTx.getContext()))
    {
      com.tencent.mm.bg.e.a(p.e(this.yJn).yTx.getContext(), 2131304445, null);
      AppMethodBeat.o(30650);
    }
    while (true)
    {
      return;
      this.yJn.dCj();
      AppMethodBeat.o(30650);
    }
  }

  public final void bNZ()
  {
    AppMethodBeat.i(30651);
    Intent localIntent = new Intent();
    localIntent.putExtra("enterprise_scene", 4);
    localIntent.putExtra("enterprise_biz_name", this.yJn.getTalkerUserName());
    localIntent.putExtra("biz_chat_chat_id", ((com.tencent.mm.ui.chatting.c.b.d)p.e(this.yJn).aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDz());
    com.tencent.mm.bp.d.b(p.e(this.yJn).yTx.getContext(), "brandservice", ".ui.EnterpriseBizContactPlainListUI", localIntent);
    AppMethodBeat.o(30651);
  }

  public final void bOa()
  {
    AppMethodBeat.i(30652);
    if (p.o(this.yJn))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("enter_scene", 1);
      localIntent.putExtra("chatroom_name", this.yJn.getTalkerUserName());
      com.tencent.mm.bp.d.b(p.e(this.yJn).yTx.getContext(), "aa", ".ui.LaunchAAUI", localIntent);
    }
    AppMethodBeat.o(30652);
  }

  public final void bOb()
  {
    AppMethodBeat.i(30653);
    com.tencent.mm.plugin.report.service.h.pYm.e(14523, new Object[] { Integer.valueOf(0) });
    Intent localIntent = new Intent();
    localIntent.setClass(p.e(this.yJn).yTx.getContext(), NewFileExplorerUI.class);
    localIntent.putExtra("TO_USER", p.p(this.yJn));
    p.e(this.yJn).a(localIntent, 227, new p.10.5(this));
    AppMethodBeat.o(30653);
  }

  public final void ys(int paramInt)
  {
    AppMethodBeat.i(30642);
    switch (paramInt)
    {
    default:
    case 1:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(30642);
      while (true)
      {
        return;
        Object localObject = p.e(this.yJn).yTx.getContext().getSharedPreferences(ah.doA(), 0).getString("gallery", "1");
        com.tencent.mm.plugin.report.service.g.BN(19);
        if (((String)localObject).equalsIgnoreCase("0"))
          com.tencent.mm.pluginsdk.ui.tools.n.e(p.e(this.yJn).yTx);
        while (true)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(13822, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
          al.n(new p.10.3(this), 1000L);
          AppMethodBeat.o(30642);
          break;
          String str = p.e(this.yJn).dFu();
          localObject = p.e(this.yJn).getTalkerUserName();
          if ((p.m(this.yJn)) && (p.yJd))
            com.tencent.mm.pluginsdk.ui.tools.n.b(p.e(this.yJn).yTx, 3, str, (String)localObject);
          else if (ad.mg((String)localObject))
            com.tencent.mm.pluginsdk.ui.tools.n.a(p.e(this.yJn).yTx, 12, str, (String)localObject);
          else
            com.tencent.mm.pluginsdk.ui.tools.n.a(p.e(this.yJn).yTx, 3, str, (String)localObject);
        }
        localObject = new File(com.tencent.mm.compatible.util.e.euR);
        if ((!((File)localObject).exists()) && (!((File)localObject).mkdir()))
        {
          Toast.makeText(p.e(this.yJn).yTx.getContext(), p.e(this.yJn).yTx.getMMResources().getString(2131298250), 1).show();
          AppMethodBeat.o(30642);
        }
        else
        {
          boolean bool = com.tencent.mm.pluginsdk.permission.b.a(p.e(this.yJn).yTx.getContext(), "android.permission.CAMERA", 20, "", "");
          ab.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkcamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), p.e(this.yJn).yTx.getContext() });
          if (bool)
            break;
          AppMethodBeat.o(30642);
        }
      }
      this.yJn.dCn();
    }
  }

  public final void yt(int paramInt)
  {
    AppMethodBeat.i(30648);
    if ((!com.tencent.mm.r.a.bI(p.e(this.yJn).yTx.getContext())) && (!com.tencent.mm.r.a.bJ(p.e(this.yJn).yTx.getContext())) && (!com.tencent.mm.r.a.bH(p.e(this.yJn).yTx.getContext())))
      this.yJn.Om(paramInt);
    AppMethodBeat.o(30648);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.p.10
 * JD-Core Version:    0.6.2
 */