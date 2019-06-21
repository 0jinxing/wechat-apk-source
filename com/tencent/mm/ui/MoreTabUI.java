package com.tencent.mm.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.ik;
import com.tencent.mm.g.a.on;
import com.tencent.mm.g.a.sp;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.story.api.AbsStoryGallery;
import com.tencent.mm.plugin.story.api.AbsStoryMuteView;
import com.tencent.mm.plugin.story.api.m;
import com.tencent.mm.plugin.story.api.m.a;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bm;
import com.tencent.mm.storage.bn;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreferenceFragment;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.contact.AddressUI;
import com.tencent.mm.ui.widget.listview.PullDownListView;
import com.tencent.mm.ui.widget.listview.PullDownListView.a;
import com.tencent.mm.x.a.a;
import java.util.UUID;

public class MoreTabUI extends AbstractTabChildPreference
  implements com.tencent.mm.plugin.story.api.g, n.b
{
  private View contentView;
  private com.tencent.mm.ui.base.preference.f ehK;
  private boolean lZa;
  private RelativeLayout oZf;
  private AbsStoryGallery plq;
  private AbsStoryMuteView plr;
  private View plw;
  private boolean pnR;
  private byte[] qkE;
  private a.a qpv;
  private Bitmap svw;
  private int yoA;
  public PullDownListView.a yoB;
  private MoreTabUI.a yoC;
  private ImageView yog;
  PullDownListView yoh;
  private View yoi;
  private MoreTabUI.b yoj;
  private boolean yok;
  private AccountInfoPreference yol;
  private boolean yom;
  private RelativeLayout yon;
  private FrameLayout yoo;
  private int yop;
  private int yoq;
  private int yor;
  private int yos;
  private boolean yot;
  private boolean you;
  private boolean yov;
  public boolean yow;
  private boolean yox;
  public boolean yoy;
  private int yoz;

  public MoreTabUI()
  {
    AppMethodBeat.i(29717);
    this.svw = null;
    this.qkE = null;
    this.plr = null;
    this.oZf = null;
    this.yoi = null;
    this.plq = null;
    this.yoj = new MoreTabUI.b(this, (byte)0);
    this.pnR = false;
    this.yok = false;
    this.yol = null;
    this.yom = false;
    this.yon = null;
    this.yoo = null;
    this.yop = 0;
    this.yoq = 0;
    this.yor = 0;
    this.yos = 0;
    this.lZa = false;
    this.yot = false;
    this.you = false;
    this.yov = false;
    this.qpv = new MoreTabUI.1(this);
    this.yow = true;
    this.yox = true;
    this.yoy = true;
    this.yoz = com.tencent.mm.bz.a.fromDPToPix(getContext(), 48);
    this.yoA = com.tencent.mm.bz.a.fromDPToPix(getContext(), 120);
    this.yoB = new MoreTabUI.10(this);
    this.yoC = new MoreTabUI.a(this);
    AppMethodBeat.o(29717);
  }

  private void Nq(int paramInt)
  {
    AppMethodBeat.i(29736);
    View localView = findViewById(2131820940);
    if (localView != null)
    {
      localView.setVisibility(paramInt);
      ab.i("MicroMsg.MoreTabUI", "setActionbarContainer type:%s", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(29736);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.MoreTabUI", "setActionbarContainer is null!!");
      AppMethodBeat.o(29736);
    }
  }

  private void dyK()
  {
    AppMethodBeat.i(29721);
    if (!this.yot)
    {
      i = com.tencent.mm.kernel.g.RP().Ry().getInt(ac.a.xWP, 0);
      boolean bool = com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xWD, false);
      ab.i("MicroMsg.MoreTabUI", "checkSmallHead: %s", new Object[] { Integer.valueOf(i) });
      if ((!this.pnR) && ((bool) || (i > 0)))
      {
        this.yot = true;
        if (this.yol != null)
          this.yol.ad(this.pnR, this.yot);
        if (!this.yot)
          break label132;
      }
    }
    label132: for (int i = com.tencent.mm.bz.a.am(getContext(), 2131428604); ; i = com.tencent.mm.bz.a.am(getContext(), 2131428603))
    {
      this.yor = i;
      AppMethodBeat.o(29721);
      return;
    }
  }

  private void dyL()
  {
    AppMethodBeat.i(29726);
    if (!com.tencent.mm.bp.d.afj("sns"))
    {
      this.ehK.ce("settings_my_album", true);
      AppMethodBeat.o(29726);
    }
    while (true)
    {
      return;
      this.ehK.ce("settings_my_album", false);
      IconPreference localIconPreference = (IconPreference)this.ehK.aqO("settings_my_album");
      if (localIconPreference != null)
      {
        if ((com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xWV, true)) && (this.yov))
        {
          localIconPreference.NN(0);
          AppMethodBeat.o(29726);
        }
        else
        {
          this.yov = false;
          localIconPreference.NN(8);
        }
      }
      else
        AppMethodBeat.o(29726);
    }
  }

  private void dyM()
  {
    AppMethodBeat.i(29727);
    Object localObject1 = (com.tencent.mm.plugin.card.c.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.card.c.b.class);
    if ((localObject1 == null) || ((!((com.tencent.mm.plugin.card.c.b)localObject1).bbn()) && (!((com.tencent.mm.plugin.card.c.b)localObject1).bbo())) || (!com.tencent.mm.bp.d.afj("card")))
    {
      this.ehK.ce("settings_mm_cardpackage", true);
      AppMethodBeat.o(29727);
      return;
    }
    if (localObject1 != null);
    for (localObject1 = ((com.tencent.mm.plugin.card.c.b)localObject1).bbp(); ; localObject1 = "")
    {
      boolean bool1 = com.tencent.mm.x.c.PK().bY(262152, 266256);
      boolean bool2 = com.tencent.mm.x.c.PK().bX(262152, 266256);
      boolean bool3 = com.tencent.mm.x.c.PK().a(ac.a.xKd, ac.a.xKf);
      boolean bool4 = com.tencent.mm.x.c.PK().a(ac.a.xKe, ac.a.xKg);
      this.ehK.ce("settings_mm_cardpackage", false);
      IconPreference localIconPreference = (IconPreference)this.ehK.aqO("settings_mm_cardpackage");
      if (localIconPreference == null)
      {
        AppMethodBeat.o(29727);
        break;
      }
      localIconPreference.setTitle(2131303138);
      if (bool2)
      {
        localIconPreference.NL(0);
        localIconPreference.ey(getString(2131296988), 2130839673);
        localIconPreference.NN(8);
        localIconPreference.setSummary(null);
        localIconPreference.ap(null);
        localIconPreference.NP(8);
        localIconPreference.ez("", -1);
        localIconPreference.NM(8);
        AppMethodBeat.o(29727);
        break;
      }
      com.tencent.mm.model.aw.ZK();
      String str = (String)com.tencent.mm.model.c.Ry().get(ac.a.xKm, "");
      if ((bool4) && (!TextUtils.isEmpty(str)))
      {
        int i = getResources().getDimensionPixelOffset(2131428161);
        Object localObject2 = new com.tencent.mm.at.a.a.c.a();
        ((com.tencent.mm.at.a.a.c.a)localObject2).ePK = com.tencent.mm.compatible.util.e.eSn;
        o.ahq();
        ((com.tencent.mm.at.a.a.c.a)localObject2).ePY = null;
        ((com.tencent.mm.at.a.a.c.a)localObject2).ePH = true;
        ((com.tencent.mm.at.a.a.c.a)localObject2).eQf = true;
        ((com.tencent.mm.at.a.a.c.a)localObject2).ePF = true;
        ((com.tencent.mm.at.a.a.c.a)localObject2).ePO = i;
        ((com.tencent.mm.at.a.a.c.a)localObject2).ePN = i;
        localObject2 = ((com.tencent.mm.at.a.a.c.a)localObject2).ahG();
        o.ahp().a(str, localIconPreference.dAz(), (com.tencent.mm.at.a.a.c)localObject2, new MoreTabUI.5(this, localIconPreference));
        label397: if (!bool1)
          break label514;
        localIconPreference.NN(0);
        label407: if (!bool3)
          break label584;
        localIconPreference.ey("", -1);
        localIconPreference.NL(8);
        if (!bool4)
          break label543;
        localIconPreference.setSummary(null);
        if (ah.isNullOrNil((String)localObject1))
          break label524;
        localIconPreference.av((String)localObject1, -1, getResources().getColor(2131690164));
        localIconPreference.NM(0);
      }
      while (true)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(16322, new Object[] { Integer.valueOf(1) });
        AppMethodBeat.o(29727);
        break;
        localIconPreference.ap(null);
        localIconPreference.NP(8);
        break label397;
        label514: localIconPreference.NN(8);
        break label407;
        label524: localIconPreference.ez("", -1);
        localIconPreference.NM(8);
        continue;
        label543: localIconPreference.ez("", -1);
        localIconPreference.NM(8);
        if (!ah.isNullOrNil((String)localObject1))
        {
          localIconPreference.setSummary((CharSequence)localObject1);
        }
        else
        {
          localIconPreference.setSummary(null);
          continue;
          label584: localIconPreference.NM(8);
          localIconPreference.NL(8);
          localIconPreference.setSummary(null);
        }
      }
    }
  }

  private void dyN()
  {
    AppMethodBeat.i(29728);
    this.ehK.ce("more_setting", false);
    IconPreference localIconPreference = (IconPreference)this.ehK.aqO("more_setting");
    boolean bool;
    if (localIconPreference != null)
    {
      localIconPreference.NQ(8);
      bool = com.tencent.mm.x.c.PK().bX(262145, 266242);
      if (bool)
      {
        localIconPreference.NL(0);
        localIconPreference.ey(getString(2131296988), 2130839673);
        com.tencent.mm.model.aw.ZK();
        if (((Integer)com.tencent.mm.model.c.Ry().get(9, Integer.valueOf(0))).intValue() != 0)
        {
          if (com.tencent.mm.model.r.YH())
            break label153;
          localIconPreference.setSummary(2131302675);
        }
        label119: localIconPreference.NN(8);
        if (!bool)
          break label163;
        AppMethodBeat.o(29728);
      }
      while (true)
      {
        return;
        localIconPreference.NL(8);
        localIconPreference.ey("", -1);
        break;
        label153: localIconPreference.setSummary("");
        break label119;
        label163: com.tencent.mm.model.aw.ZK();
        int i = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xQI, Integer.valueOf(0))).intValue();
        com.tencent.mm.model.aw.ZK();
        j = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xQJ, Integer.valueOf(0))).intValue();
        if (((((com.tencent.mm.plugin.welab.a.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.welab.a.a.c.class)).ddn()) || (((com.tencent.mm.plugin.welab.a.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.welab.a.a.c.class)).ddo()) || (i > j)) && (!bool))
        {
          localIconPreference.NN(0);
          localIconPreference.NL(8);
          localIconPreference.ey("", -1);
          AppMethodBeat.o(29728);
        }
        else
        {
          localIconPreference.NN(8);
          if (com.tencent.mm.x.c.PK().bY(262157, 266261))
          {
            localIconPreference.NN(0);
            localIconPreference.NL(8);
            localIconPreference.ey("", -1);
            AppMethodBeat.o(29728);
          }
          else
          {
            localIconPreference.NN(8);
            if (com.tencent.mm.x.c.PK().bY(262158, 266264))
            {
              localIconPreference.NN(0);
              localIconPreference.NL(8);
              localIconPreference.ey("", -1);
              AppMethodBeat.o(29728);
            }
            else
            {
              if (!com.tencent.mm.x.c.PK().a(ac.a.xUP, 266242))
                break label411;
              localIconPreference.NN(0);
              AppMethodBeat.o(29728);
            }
          }
        }
      }
      label411: localIconPreference.NN(8);
      com.tencent.mm.model.aw.ZK();
      if ((com.tencent.mm.model.c.Ry().getInt(40, 0) & 0x20000) != 0)
        break label620;
    }
    label620: for (int j = 1; ; j = 0)
    {
      if (bo.getInt(com.tencent.mm.m.g.Nu().getValue("VoiceprintEntry"), 0) == 1)
        com.tencent.mm.model.aw.ZK();
      for (bool = ((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xJG, Boolean.TRUE)).booleanValue(); ; bool = false)
      {
        if ((bool) && (j != 0))
        {
          ab.i("MicroMsg.MoreTabUI", "show voiceprint dot");
          localIconPreference.NN(0);
          AppMethodBeat.o(29728);
          break;
        }
        localIconPreference.NN(8);
        bm localbm = com.tencent.mm.plugin.r.a.bVu().Ms(com.tencent.mm.ax.b.fKD);
        if ((localbm != null) && (!localbm.field_isExit))
        {
          com.tencent.mm.plugin.r.a.bVt().fKT = new MoreTabUI.6(this, localIconPreference);
          AppMethodBeat.o(29728);
          break;
        }
        com.tencent.mm.plugin.r.a.bVv();
        if (com.tencent.mm.ax.c.lQ(com.tencent.mm.ax.b.fKD))
        {
          localIconPreference.NN(0);
          localIconPreference.NL(8);
          localIconPreference.ey("", -1);
          AppMethodBeat.o(29728);
          break;
        }
        AppMethodBeat.o(29728);
        break;
      }
    }
  }

  private void dyO()
  {
    AppMethodBeat.i(29729);
    boolean bool1;
    boolean bool2;
    IconPreference localIconPreference;
    if (com.tencent.mm.bp.d.afj("emoji"))
    {
      com.tencent.mm.bp.d.dlL();
      this.ehK.ce("settings_emoji_store", false);
      bool1 = com.tencent.mm.x.c.PK().bX(262147, 266244);
      bool2 = com.tencent.mm.x.c.PK().bX(262149, 266244);
      localIconPreference = (IconPreference)this.ehK.aqO("settings_emoji_store");
      if (localIconPreference != null)
        break label107;
      AppMethodBeat.o(29729);
    }
    while (true)
    {
      return;
      this.ehK.ce("settings_emoji_store", false);
      AppMethodBeat.o(29729);
      continue;
      label107: if (bool1)
      {
        localIconPreference.NL(0);
        localIconPreference.ey(getString(2131296988), 2130839673);
      }
      while (true)
      {
        if ((!bool2) && (!bool1))
          break label230;
        com.tencent.mm.model.aw.ZK();
        String str = (String)com.tencent.mm.model.c.Ry().get(229633, null);
        o.ahp().a(str, localIconPreference.dAz(), new MoreTabUI.9(this, localIconPreference));
        AppMethodBeat.o(29729);
        break;
        if (bool2)
        {
          localIconPreference.NL(0);
          localIconPreference.ey(getString(2131296946), 2130839673);
        }
        else
        {
          localIconPreference.NL(8);
          localIconPreference.ey("", -1);
        }
      }
      label230: localIconPreference.NP(8);
      AppMethodBeat.o(29729);
    }
  }

  private void dyP()
  {
    AppMethodBeat.i(29730);
    boolean bool = com.tencent.mm.model.r.YI();
    ab.d("MicroMsg.MoreTabUI", "wallet status: is open".concat(String.valueOf(bool)));
    com.tencent.mm.ui.base.preference.f localf = this.ehK;
    if (!bool);
    for (bool = true; ; bool = false)
    {
      localf.ce("settings_mm_wallet", bool);
      this.yCw.notifyDataSetChanged();
      AppMethodBeat.o(29730);
      return;
    }
  }

  private void dyQ()
  {
    AppMethodBeat.i(29731);
    com.tencent.mm.model.aw.ZK();
    int i = ah.i((Integer)com.tencent.mm.model.c.Ry().get(204820, null));
    com.tencent.mm.model.aw.ZK();
    int j = i + ah.i((Integer)com.tencent.mm.model.c.Ry().get(204817, null));
    boolean bool1 = com.tencent.mm.x.c.PK().bX(262156, 266248);
    boolean bool2 = com.tencent.mm.x.c.PK().bY(262156, 266248);
    boolean bool3 = com.tencent.mm.x.c.PK().b(ac.a.xSJ, ac.a.xSL);
    com.tencent.mm.model.aw.ZK();
    String str1 = (String)com.tencent.mm.model.c.Ry().get(ac.a.xSM, "");
    IconPreference localIconPreference = (IconPreference)this.ehK.aqO("settings_mm_wallet");
    if (localIconPreference == null)
    {
      AppMethodBeat.o(29731);
      return;
    }
    ab.d("MicroMsg.MoreTabUI", "isShowNew : ".concat(String.valueOf(bool1)));
    ab.d("MicroMsg.MoreTabUI", "isShowDot : ".concat(String.valueOf(bool2)));
    com.tencent.mm.model.aw.ZK();
    String str2 = (String)com.tencent.mm.model.c.Ry().get(ac.a.xSs, "");
    com.tencent.mm.model.aw.ZK();
    i = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xSt, Integer.valueOf(-1))).intValue();
    boolean bool4;
    boolean bool5;
    if (!bool1)
    {
      bool4 = bool2;
      bool5 = bool1;
      if (!bool2);
    }
    else
    {
      com.tencent.mm.model.aw.ZK();
      long l1 = ((Long)com.tencent.mm.model.c.Ry().get(ac.a.xSq, Long.valueOf(-1L))).longValue();
      long l2 = ah.lb(com.tencent.mm.m.g.Nu().getValue("PayWalletRedDotExpire"));
      l3 = System.currentTimeMillis();
      double d = (l3 - l1) / 86400000.0D;
      ab.i("MicroMsg.MoreTabUI", "pushTick: %s, expireTime: %s, expireTick: %s, currentTick: %s, passDay: %s", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(86400000L * l2), Long.valueOf(l3), Double.valueOf(d) });
      bool4 = bool2;
      bool5 = bool1;
      if (l1 > 0L)
      {
        bool4 = bool2;
        bool5 = bool1;
        if (l2 > 0L)
        {
          bool4 = bool2;
          bool5 = bool1;
          if (d >= l2)
          {
            bool5 = false;
            com.tencent.mm.x.c.PK().x(262156, false);
            bool4 = false;
          }
        }
      }
    }
    com.tencent.mm.kernel.g.RQ();
    bool1 = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUe, Boolean.FALSE)).booleanValue();
    com.tencent.mm.kernel.g.RQ();
    long l3 = ((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUf, Long.valueOf(0L))).longValue();
    if ((bool1) && (l3 > 0L) && (System.currentTimeMillis() > l3))
    {
      ab.i("MicroMsg.MoreTabUI", "walletMyEntryRedDot expire, ignore redDot");
      bool1 = false;
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUe, Boolean.FALSE);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUf, Long.valueOf(0L));
    }
    while (true)
    {
      bool1 = bool4 | bool1;
      com.tencent.mm.kernel.g.RQ();
      String str3 = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUb, "");
      ab.i("MicroMsg.MoreTabUI", "after check, isShowNew: %s, isShowDot: %s, walletEntryWording: %s", new Object[] { Boolean.valueOf(bool5), Boolean.valueOf(bool1), str3 });
      bool4 = com.tencent.mm.x.c.PK().b(ac.a.xUi, ac.a.xUo);
      com.tencent.mm.kernel.g.RQ();
      l3 = ((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUk, Long.valueOf(0L))).longValue();
      if ((bool4) && (l3 > 0L) && (System.currentTimeMillis() > l3))
      {
        ab.i("MicroMsg.MoreTabUI", "walletMyEntryRedDot expire, ignore redDot");
        bool4 = false;
        com.tencent.mm.x.c.PK().c(ac.a.xUi, ac.a.xUo);
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUk, Long.valueOf(0L));
      }
      while (true)
      {
        bool4 = bool1 | bool4;
        com.tencent.mm.kernel.g.RQ();
        Object localObject = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUh, "");
        ab.i("MicroMsg.MoreTabUI", "after check, isShowNew: %s, isShowDot: %s, walletEntryWording: %s", new Object[] { Boolean.valueOf(bool5), Boolean.valueOf(bool4), localObject });
        ab.d("MicroMsg.MoreTabUI", "bankcardDot : ".concat(String.valueOf(bool3)));
        if (bool3)
          if (!bo.isNullOrNil(str1))
          {
            localIconPreference.NM(0);
            localIconPreference.av(str1, -1, -7566196);
            localIconPreference.qh(true);
            localIconPreference.NN(8);
            label820: if (bo.isNullOrNil((String)localObject))
              break label1206;
          }
        while (true)
        {
          if ((!ah.isNullOrNil((String)localObject)) && (bool4))
          {
            localIconPreference.setSummary((CharSequence)localObject);
            label848: localObject = com.tencent.mm.plugin.report.service.h.pYm;
            if (!bool4)
              break label1201;
          }
          label1201: for (i = 1; ; i = 0)
          {
            ((com.tencent.mm.plugin.report.service.h)localObject).e(14872, new Object[] { Integer.valueOf(6), Integer.valueOf(i), "", "", Integer.valueOf(1) });
            AppMethodBeat.o(29731);
            break;
            localIconPreference.ez("", -1);
            localIconPreference.NM(8);
            localIconPreference.NN(0);
            break label820;
            if (bool5)
            {
              localIconPreference.NL(0);
              localIconPreference.ey(getString(2131296988), 2130839673);
              localIconPreference.NN(8);
              break label820;
            }
            if (j > 99)
            {
              localIconPreference.NL(0);
              localIconPreference.ey(getString(2131303989), com.tencent.mm.ui.tools.r.ik(getContext()));
              localIconPreference.NN(8);
              break label820;
            }
            if (j > 0)
            {
              localIconPreference.NL(0);
              localIconPreference.ey(String.valueOf(j), com.tencent.mm.ui.tools.r.ik(getContext()));
              localIconPreference.NN(8);
              break label820;
            }
            if (bool4)
            {
              localIconPreference.ey("", -1);
              localIconPreference.NL(8);
              localIconPreference.NN(0);
              break label820;
            }
            if (i == 1)
            {
              localIconPreference.ey("", -1);
              localIconPreference.NL(8);
              localIconPreference.NM(0);
              localIconPreference.qh(true);
              if (!ah.isNullOrNil(str2))
                localIconPreference.av(str2, -1, Color.parseColor("#888888"));
              localIconPreference.NQ(8);
              break label820;
            }
            localIconPreference.ey("", -1);
            localIconPreference.NL(8);
            localIconPreference.NN(8);
            localIconPreference.NM(8);
            localIconPreference.ez("", -1);
            break label820;
            localIconPreference.setSummary("");
            break label848;
          }
          label1206: localObject = str3;
        }
      }
    }
  }

  private void dyR()
  {
    AppMethodBeat.i(29751);
    ab.c("MicroMsg.MoreTabUI", "activeBubbleTip", new Object[0]);
    this.yon.setVisibility(0);
    ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryUIFactory().ef(this.yog);
    AppMethodBeat.o(29751);
  }

  private void dyS()
  {
    AppMethodBeat.i(29752);
    ab.c("MicroMsg.MoreTabUI", "forceStopBubbleTip", new Object[0]);
    this.yon.setVisibility(4);
    ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryUIFactory().eg(this.yog);
    AppMethodBeat.o(29752);
  }

  private void dyT()
  {
    AppMethodBeat.i(29753);
    if ((this.yom) && (this.yoh.isVisible))
    {
      dyR();
      AppMethodBeat.o(29753);
    }
    while (true)
    {
      return;
      dyS();
      AppMethodBeat.o(29753);
    }
  }

  private boolean pS(boolean paramBoolean)
  {
    AppMethodBeat.i(29733);
    com.tencent.mm.plugin.appbrand.n.c.izk.a(com.tencent.mm.plugin.appbrand.n.c.a.izo);
    com.tencent.mm.plugin.appbrand.n.c.izk.a(com.tencent.mm.plugin.appbrand.n.c.a.izA);
    Intent localIntent = new Intent();
    localIntent.putExtra("preceding_scence", 2);
    localIntent.putExtra("isNativeView", paramBoolean);
    com.tencent.mm.bp.d.b(getContext(), "appbrand", ".functions.emojistore.LFEmojiStoreContainerActivity", localIntent);
    AppMethodBeat.o(29733);
    return true;
  }

  private void pT(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(29747);
    if (getActivity() != null)
      if (this.plw == null)
      {
        View localView = findViewById(2131820940);
        if (localView != null)
          this.plw = localView.findViewById(2131820941);
        if (this.plw != null)
          ab.i("MicroMsg.MoreTabUI", "checkActionBarClick: findActionBar %s", new Object[] { Boolean.valueOf(bool) });
      }
      else
      {
        if (this.plw == null)
          break label116;
        if (!paramBoolean)
          break label108;
        this.plw.setOnClickListener(new MoreTabUI.3(this));
        AppMethodBeat.o(29747);
      }
    while (true)
    {
      return;
      bool = false;
      break;
      label108: this.plw.setOnClickListener(null);
      label116: AppMethodBeat.o(29747);
    }
  }

  private void pU(boolean paramBoolean)
  {
    AppMethodBeat.i(29749);
    if (((getContext() instanceof LauncherUI)) && (this.yoh != null) && (this.yoh.isVisible))
      ((LauncherUI)getContext()).getHomeUI().pK(paramBoolean);
    AppMethodBeat.o(29749);
  }

  public final int JC()
  {
    return 2131165250;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(29732);
    int i = ah.bh(paramObject);
    ab.d("MicroMsg.MoreTabUI", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
    com.tencent.mm.model.aw.ZK();
    if ((paramn != com.tencent.mm.model.c.Ry()) || (i <= 0))
    {
      ab.e("MicroMsg.MoreTabUI", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
      AppMethodBeat.o(29732);
    }
    while (true)
    {
      return;
      if ((204817 == i) || (204820 == i))
      {
        dyQ();
        AppMethodBeat.o(29732);
      }
      else if (40 == i)
      {
        dyP();
        AppMethodBeat.o(29732);
      }
      else
      {
        if ("208899".equals(Integer.valueOf(paramInt)))
          dyO();
        AppMethodBeat.o(29732);
      }
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool1 = true;
    AppMethodBeat.i(29725);
    StringBuilder localStringBuilder = new StringBuilder();
    String str;
    if (paramPreference == null)
    {
      str = "null";
      ab.i("MicroMsg.MoreTabUI", str + " item has been clicked!");
      if (com.tencent.mm.kernel.g.RK())
        break label78;
      ab.w("MicroMsg.MoreTabUI", "account has not already!");
      AppMethodBeat.o(29725);
    }
    label576: 
    while (true)
    {
      return bool1;
      str = paramPreference.mKey;
      break;
      label78: if (paramPreference.mKey.equals("settings_my_address"))
      {
        paramf = new Intent(getContext(), AddressUI.class);
        paramf.putExtra("Contact_GroupFilter_Type", "@biz.contact");
        startActivity(paramf);
        AppMethodBeat.o(29725);
      }
      else if (paramPreference.mKey.equals("settings_my_add_contact"))
      {
        com.tencent.mm.bp.d.b(getContext(), "subapp", ".ui.pluginapp.AddMoreFriendsUI", new Intent());
        AppMethodBeat.o(29725);
      }
      else
      {
        boolean bool2;
        int i;
        if (paramPreference.mKey.equals("settings_mm_wallet"))
        {
          bool2 = com.tencent.mm.x.c.PK().bX(262156, 266248);
          boolean bool3 = com.tencent.mm.x.c.PK().bY(262156, 266248);
          com.tencent.mm.plugin.report.service.h.pYm.X(10958, "9");
          paramf = com.tencent.mm.plugin.report.service.h.pYm;
          if ((bool2) || (bool3))
          {
            i = 1;
            label243: paramf.e(13341, new Object[] { Integer.valueOf(i) });
            str = UUID.randomUUID().toString();
            com.tencent.mm.plugin.report.service.h.pYm.e(14419, new Object[] { str, Integer.valueOf(0) });
            paramf = new on();
            paramf.cKQ.context = getContext();
            paramPreference = new Intent();
            paramPreference.putExtra("key_wallet_has_red", bool3);
            paramPreference.putExtra("key_uuid", str);
            paramf.cKQ.intent = paramPreference;
            com.tencent.mm.sdk.b.a.xxA.m(paramf);
            com.tencent.mm.x.c.PK().bZ(262156, 266248);
            com.tencent.mm.x.c.PK().c(ac.a.xSJ, ac.a.xSL);
            com.tencent.mm.model.aw.ZK();
            com.tencent.mm.model.c.Ry().set(ac.a.xSs, "");
            com.tencent.mm.model.aw.ZK();
            com.tencent.mm.model.c.Ry().set(ac.a.xSt, Integer.valueOf(-1));
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUe, Boolean.FALSE);
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUb, "");
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUc, Boolean.FALSE);
            com.tencent.mm.x.c.PK().c(ac.a.xUi, ac.a.xUo);
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUh, "");
            paramf = com.tencent.mm.plugin.report.service.h.pYm;
            if (!bool3)
              break label576;
          }
          for (i = 1; ; i = 0)
          {
            paramf.e(14872, new Object[] { Integer.valueOf(6), Integer.valueOf(i), "", "", Integer.valueOf(0) });
            AppMethodBeat.o(29725);
            break;
            i = 0;
            break label243;
          }
        }
        if (paramPreference.mKey.equals("settings_mm_cardpackage"))
        {
          com.tencent.mm.model.aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xKj, "");
          new Intent().putExtra("key_from_scene", 22);
          ab.i("MicroMsg.MoreTabUI", "enter to cardhome");
          paramf = new ik();
          paramf.cDz.context = getContext();
          paramf.cDz.cDB = 1;
          com.tencent.mm.sdk.b.a.xxA.m(paramf);
          AppMethodBeat.o(29725);
        }
        else if (paramPreference.mKey.equals("settings_my_album"))
        {
          com.tencent.mm.model.aw.ZK();
          if (!com.tencent.mm.model.c.isSDCardAvailable())
          {
            t.hO(getContext());
            AppMethodBeat.o(29725);
          }
          else
          {
            com.tencent.mm.model.aw.ZK();
            paramPreference = (String)com.tencent.mm.model.c.Ry().get(2, null);
            paramf = new Intent(getContext(), AlbumUI.class);
            paramf.putExtra("sns_userName", paramPreference);
            paramf.putExtra("username", paramPreference);
            paramf.putExtra("story_dot", this.yov);
            paramf.setFlags(536870912);
            paramf.addFlags(67108864);
            com.tencent.mm.model.aw.ZK();
            i = ah.i((Integer)com.tencent.mm.model.c.Ry().get(68389, null));
            com.tencent.mm.model.aw.ZK();
            com.tencent.mm.model.c.Ry().set(68389, Integer.valueOf(i + 1));
            startActivity(paramf);
            AppMethodBeat.o(29725);
          }
        }
        else if (paramPreference.mKey.equals("settings_mm_favorite"))
        {
          com.tencent.mm.plugin.report.service.h.pYm.X(10958, "8");
          com.tencent.mm.plugin.report.service.h.pYm.e(14103, new Object[] { Integer.valueOf(0) });
          com.tencent.mm.plugin.fav.a.b.b(getContext(), ".ui.FavoriteIndexUI", new Intent());
          com.tencent.mm.cj.c.aNX();
          AppMethodBeat.o(29725);
        }
        else if (paramPreference.mKey.equals("settings_emoji_store"))
        {
          com.tencent.mm.plugin.report.service.h.pYm.X(10958, "7");
          com.tencent.mm.x.c.PK().bZ(262147, 266244);
          com.tencent.mm.x.c.PK().bZ(262149, 266244);
          paramf = new Intent();
          paramf.putExtra("preceding_scence", 2);
          com.tencent.mm.bp.d.b(getContext(), "emoji", ".ui.v2.EmojiStoreV2UI", paramf);
          com.tencent.mm.plugin.report.service.h.pYm.e(12065, new Object[] { Integer.valueOf(1) });
          ((com.tencent.mm.plugin.boots.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.boots.a.c.class)).dC(com.tencent.mm.plugin.boots.a.b.jJo, 881);
          AppMethodBeat.o(29725);
        }
        else if (paramPreference.mKey.equals("more_setting"))
        {
          bool2 = com.tencent.mm.x.c.PK().bX(262145, 266242);
          com.tencent.mm.x.c.PK().bZ(262145, 266242);
          com.tencent.mm.x.c.PK().bZ(262157, 266261);
          com.tencent.mm.x.c.PK().bZ(262158, 266264);
          com.tencent.mm.x.c.PK().b(ac.a.xUP, 266242);
          paramPreference = new Intent();
          com.tencent.mm.bp.d.b(getContext(), "setting", ".ui.setting.SettingsUI", paramPreference);
          com.tencent.mm.model.aw.ZK();
          i = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xQI, Integer.valueOf(0))).intValue();
          com.tencent.mm.model.aw.ZK();
          int j = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xQJ, Integer.valueOf(0))).intValue();
          if ((!bool2) && (i > j))
          {
            com.tencent.mm.model.aw.ZK();
            com.tencent.mm.model.c.Ry().set(ac.a.xQJ, Integer.valueOf(i));
            paramf = (IconPreference)paramf.aqO("more_setting");
            if (paramf != null)
              paramf.NN(8);
            com.tencent.mm.x.c.PK().bZ(266260, 266241);
          }
          AppMethodBeat.o(29725);
        }
        else if (paramPreference.mKey.equals("more_uishow"))
        {
          com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.x.a.a.a.class);
          getContext();
          new Intent();
          AppMethodBeat.o(29725);
        }
        else if (paramPreference.mKey.equals("settings_privacy_agreements"))
        {
          com.tencent.mm.plugin.account.a.b.a.b(getActivity(), getString(2131305909, new Object[] { aa.dor(), com.tencent.mm.kernel.g.RP().Ry().get(274436, null), "setting", Integer.valueOf(0), Integer.valueOf(0) }), 0, true);
          AppMethodBeat.o(29725);
        }
        else
        {
          AppMethodBeat.o(29725);
          bool1 = false;
        }
      }
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference, View paramView)
  {
    boolean bool = true;
    AppMethodBeat.i(29724);
    if (!com.tencent.mm.kernel.g.RK())
    {
      ab.w("MicroMsg.MoreTabUI", "account has not already!");
      AppMethodBeat.o(29724);
    }
    while (true)
    {
      return bool;
      try
      {
        if ((bp.dnM()) || (bp.dpJ()) || (bp.dpL()) || (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED))
        {
          if (bo.nullAsNil(paramPreference.mKey).equals("settings_emoji_store"))
          {
            bool = pS(true);
            AppMethodBeat.o(29724);
            continue;
          }
          if (bo.nullAsNil(paramPreference.mKey).equals("more_setting"))
          {
            bool = pS(false);
            AppMethodBeat.o(29724);
          }
        }
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        bool = super.a(paramf, paramPreference, paramView);
        AppMethodBeat.o(29724);
      }
    }
  }

  public final void caA()
  {
    AppMethodBeat.i(29744);
    ab.i("MicroMsg.MoreTabUI", "story_cat storyUINoStory");
    if ((this.yoh != null) && (!this.yoh.isVisible))
      this.yoh.dLf();
    if ((!com.tencent.mm.plugin.story.api.n.isShowStoryCheck()) || (this.lZa))
    {
      this.yoj.Nr(2);
      AppMethodBeat.o(29744);
    }
    while (true)
    {
      return;
      this.yoj.Nr(1);
      AppMethodBeat.o(29744);
    }
  }

  public final void caB()
  {
    AppMethodBeat.i(29745);
    ab.i("MicroMsg.MoreTabUI", "story_cat storyUIHasStory");
    IconPreference localIconPreference;
    if ((this.yoh != null) && (this.yoh.isVisible))
    {
      if (this.lZa)
        this.yoj.Nr(2);
    }
    else
    {
      localIconPreference = (IconPreference)this.ehK.aqO("settings_my_album");
      if (localIconPreference == null)
        break label121;
      if (!com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xWV, true))
        break label110;
      this.yov = true;
      localIconPreference.NN(0);
      AppMethodBeat.o(29745);
    }
    while (true)
    {
      return;
      this.yoj.Nr(0);
      break;
      label110: this.yov = false;
      localIconPreference.NN(8);
      label121: AppMethodBeat.o(29745);
    }
  }

  public final void caC()
  {
    AppMethodBeat.i(29746);
    ab.i("MicroMsg.MoreTabUI", "story_cat storyUIBackPressed");
    if ((this.yoh != null) && (!this.yoh.isVisible))
      this.yoh.dLf();
    Nq(0);
    pU(this.pnR);
    AppMethodBeat.o(29746);
  }

  final void caE()
  {
    AppMethodBeat.i(29750);
    if (com.tencent.mm.compatible.util.d.iW(19))
    {
      getWindow().clearFlags(201327616);
      AppMethodBeat.o(29750);
    }
    while (true)
    {
      return;
      getWindow().clearFlags(1024);
      AppMethodBeat.o(29750);
    }
  }

  protected final void dvY()
  {
    AppMethodBeat.i(29735);
    boolean bool;
    Object localObject;
    if (getResources().getConfiguration().orientation == 2)
    {
      bool = true;
      this.lZa = bool;
      this.ehK = this.yCw;
      this.contentView = getContentView();
      com.tencent.mm.compatible.util.a.bG(getContext());
      com.tencent.mm.kernel.g.RQ();
      this.plr = ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryUIFactory().eV(getContext());
      localObject = new FrameLayout.LayoutParams(com.tencent.mm.bz.a.am(getContext(), 2131428602), com.tencent.mm.bz.a.am(getContext(), 2131428602));
      ((FrameLayout.LayoutParams)localObject).gravity = 83;
      ((ViewGroup)getContext().findViewById(2131823829).getParent()).addView(this.plr, 0, (ViewGroup.LayoutParams)localObject);
      this.yoh.zRr = this.yoB;
      this.yoh.setPadding(this.yoh.getPaddingLeft(), this.yoh.getPaddingTop(), this.yoh.getPaddingRight(), this.yoi.getHeight());
      if (this.oZf != null)
      {
        ab.d("MicroMsg.MoreTabUI", "dancy test add view !");
        this.plq = ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryUIFactory().a(getContext(), m.a.rQD, null);
        if (this.plq != null)
        {
          this.yos = (-(ak.hy(getContext()).y / 10));
          if (!this.yot)
            break label458;
        }
      }
    }
    label458: for (int i = com.tencent.mm.bz.a.am(getContext(), 2131428604); ; i = com.tencent.mm.bz.a.am(getContext(), 2131428603))
    {
      this.yor = i;
      this.yoq = (-com.tencent.mm.bz.a.fromDPToPix(getContext(), 330));
      this.yop = 0;
      localObject = new RelativeLayout.LayoutParams(-1, ak.hy(getContext()).y);
      ((RelativeLayout.LayoutParams)localObject).topMargin = this.yos;
      ((RelativeLayout.LayoutParams)localObject).bottomMargin = (-ak.fr(getContext()));
      this.oZf.addView(this.plq, 0, (ViewGroup.LayoutParams)localObject);
      this.yoh.x(this.plq, this.yor, this.yos);
      this.yoh.setNavigationBarHeight(ak.fr(getActivity()));
      this.plq.setDataSeed(com.tencent.mm.model.r.Yz());
      this.plq.a(this.yoh);
      this.plq.setStoryBrowseUIListener(this);
      ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryUIFactory().d(this.yoo, this.yog);
      this.yoj.dyU();
      AppMethodBeat.o(29735);
      return;
      bool = false;
      break;
    }
  }

  protected final void dvZ()
  {
    AppMethodBeat.i(29737);
    long l = System.currentTimeMillis();
    this.ehK = this.yCw;
    com.tencent.mm.model.aw.ZK();
    com.tencent.mm.model.c.Ry().a(this);
    com.tencent.mm.x.c.PK().a(this.qpv);
    this.ehK.ce("more_tab_setting_personal_info", false);
    this.yol = ((AccountInfoPreference)this.yCw.aqO("more_tab_setting_personal_info"));
    Object localObject1 = com.tencent.mm.model.r.YA();
    if (ah.isNullOrNil((String)localObject1))
    {
      localObject1 = com.tencent.mm.model.r.Yz();
      if (ad.aoA((String)localObject1))
      {
        this.yol.vpX = null;
        this.yol.userName = com.tencent.mm.model.r.Yz();
        Object localObject2 = com.tencent.mm.model.r.YB();
        localObject1 = localObject2;
        if (ah.isNullOrNil((String)localObject2))
          localObject1 = com.tencent.mm.model.r.Yz();
        this.yol.vpW = j.b(getContext(), (CharSequence)localObject1);
        this.yol.ad(this.pnR, this.yot);
        this.yol.vqe = new MoreTabUI.7(this);
        ((AccountInfoPreference)this.ehK.aqO("more_tab_setting_personal_info")).vqd = new MoreTabUI.8(this);
        localObject1 = (IconPreference)this.ehK.aqO("settings_my_address");
        if (localObject1 != null)
        {
          int i = com.tencent.mm.bi.d.akP().dtd();
          if (i <= 0)
            break label648;
          ((IconPreference)localObject1).NL(0);
          ((IconPreference)localObject1).ey(String.valueOf(i), 2130839673);
        }
        label252: dyL();
        dyO();
        dyN();
        if (com.tencent.mm.bp.d.afj("favorite"))
          break label665;
        this.ehK.ce("settings_mm_favorite", true);
        label286: dyQ();
        dyP();
        dyM();
        if (!com.tencent.mm.kernel.g.RL().J(com.tencent.mm.plugin.x.a.a.class))
          break label681;
        this.ehK.ce("more_uishow", false);
        label323: Preference localPreference = this.ehK.aqO("settings_privacy_agreements");
        if (!com.tencent.mm.au.b.sO((String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null)))
          break label697;
        localObject1 = getString(2131302021);
        localObject2 = Spannable.Factory.getInstance().newSpannable((CharSequence)localObject1);
        ((Spannable)localObject2).setSpan(new ForegroundColorSpan(getResources().getColor(2131690208)), ((Spannable)localObject2).length() - ((String)localObject1).length(), ((Spannable)localObject2).length(), 33);
        localPreference.setTitle((CharSequence)localObject2);
        this.ehK.ce("settings_privacy_agreements", false);
        label441: thisActivity().supportInvalidateOptionsMenu();
        this.ehK.notifyDataSetChanged();
        localObject1 = findViewById(2131828206);
        if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8))
          new com.tencent.mm.sdk.platformtools.ak(Looper.getMainLooper()).post(new MoreTabUI.11(this, (View)localObject1));
        if ((this.yoh != null) && (this.yoh.isVisible))
        {
          Nq(0);
          ab.i("MicroMsg.MoreTabUI", "onTabResume force set actionbar visible!!");
        }
        if (this.plq != null)
        {
          this.plq.onResume();
          this.plq.Pb();
        }
        if ((!((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).isShowStoryCheck()) || (!com.tencent.mm.x.c.PK().bX(352279, 266241)))
          break label713;
      }
    }
    label648: label665: label681: label697: label713: for (boolean bool = true; ; bool = false)
    {
      this.yom = bool;
      dyT();
      ab.i("MicroMsg.MoreTabUI", "[onTabResume] cost:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(29737);
      return;
      this.yol.vpX = ((String)localObject1);
      break;
      this.yol.vpX = ((String)localObject1);
      break;
      ((IconPreference)localObject1).NL(8);
      ((IconPreference)localObject1).ey("", -1);
      break label252;
      this.ehK.ce("settings_mm_favorite", false);
      break label286;
      this.ehK.ce("more_uishow", true);
      break label323;
      this.ehK.ce("settings_privacy_agreements", true);
      break label441;
    }
  }

  protected final void dwa()
  {
    AppMethodBeat.i(29738);
    if (this.plq != null)
      this.plq.onStart();
    AppMethodBeat.o(29738);
  }

  protected final void dwb()
  {
    AppMethodBeat.i(29739);
    ab.d("MicroMsg.MoreTabUI", "onTabPause");
    com.tencent.mm.x.c.PK().b(this.qpv);
    com.tencent.mm.model.aw.ZK();
    com.tencent.mm.model.c.Ry().b(this);
    if (this.plq != null)
      this.plq.onPause();
    if (this.yoh != null)
    {
      if ((this.yoh.isVisible) || (this.pnR))
        break label103;
      this.yoh.postDelayed(new MoreTabUI.2(this), 200L);
    }
    while (true)
    {
      dyS();
      AppMethodBeat.o(29739);
      return;
      label103: if ((this.yoh.isVisible) && (this.yoh.getTranslationY() != 0.0F))
        this.yoh.setTranslationY(0.0F);
    }
  }

  protected final void dwc()
  {
    AppMethodBeat.i(29740);
    if (this.plq != null)
      this.plq.onStop();
    AppMethodBeat.o(29740);
  }

  protected final void dwd()
  {
    AppMethodBeat.i(29741);
    if (this.plq != null)
      this.plq.onDestroy();
    ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryUIFactory().ee(this.yog);
    AppMethodBeat.o(29741);
  }

  public final void dwf()
  {
  }

  public final void dwg()
  {
  }

  public final void dwi()
  {
  }

  public final void dxc()
  {
    AppMethodBeat.i(29742);
    ab.d("MicroMsg.MoreTabUI", "onTabSwitchIn");
    this.you = true;
    boolean bool;
    Object localObject;
    if (getContext() != null)
    {
      if (getResources().getConfiguration().orientation == 2)
      {
        bool = true;
        this.lZa = bool;
      }
    }
    else if (this.yoh != null)
    {
      localObject = this.yoh;
      ai.i("MicroMsg.PullDownListView", "onResume", new Object[0]);
      ((PullDownListView)localObject).zRn = true;
      if ((!this.yoh.isVisible) || (this.yoh.getTranslationY() == 0.0F))
        break label174;
      this.yoh.setTranslationY(0.0F);
    }
    while (true)
    {
      if (this.plq != null)
        this.plq.Pb();
      pT(true);
      long l = System.currentTimeMillis();
      localObject = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.lq(l);
      localObject = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.cAJ().cZm = l;
      localObject = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.cAJ().cZW = System.currentTimeMillis();
      AppMethodBeat.o(29742);
      return;
      bool = false;
      break;
      label174: if (!this.yoh.isVisible)
        this.yoh.dLf();
    }
  }

  public final void dxd()
  {
    AppMethodBeat.i(29743);
    this.you = false;
    if (this.yoh != null)
    {
      localObject = this.yoh;
      ai.i("MicroMsg.PullDownListView", "onPause", new Object[0]);
      ((PullDownListView)localObject).zRn = false;
      if (!this.yoh.isVisible)
        this.yoh.dLf();
    }
    if (this.plr != null)
      this.plr.setVisibility(8);
    Object localObject = new sp();
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    pT(false);
    localObject = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAK();
    AppMethodBeat.o(29743);
  }

  public boolean noActionBar()
  {
    return true;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    AppMethodBeat.i(29723);
    ab.i("MicroMsg.MoreTabUI", "onActivityCreated");
    super.onActivityCreated(paramBundle);
    this.ehK = this.yCw;
    this.ehK.ce("more_setting", true);
    this.ehK.ce("settings_emoji_store", true);
    this.ehK.ce("settings_mm_wallet", true);
    this.ehK.ce("settings_mm_cardpackage", true);
    this.ehK.ce("settings_mm_favorite", true);
    this.ehK.ce("settings_my_album", true);
    this.ehK.ce("settings_my_address", true);
    this.ehK.ce("more_tab_setting_personal_info", true);
    this.ehK.ce("more_uishow", true);
    this.ehK.ce("settings_privacy_agreements", true);
    this.yoi = getView().getRootView().findViewById(2131820634);
    this.oZf = ((RelativeLayout)findViewById(2131826058));
    this.yog = ((ImageView)findViewById(2131826061));
    this.yon = ((RelativeLayout)findViewById(2131826059));
    this.yoo = ((FrameLayout)findViewById(2131826060));
    this.yoh = ((PullDownListView)this.nDp);
    this.yoh.setTabView(this.yoi);
    this.yoh.setBackgroundResource(2130839495);
    this.yoh.setOnScrollListener(new MoreTabUI.4(this));
    AppMethodBeat.o(29723);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(29734);
    super.onConfigurationChanged(paramConfiguration);
    ab.d("MicroMsg.MoreTabUI", "onConfigurationChanged");
    if (paramConfiguration.orientation == 1)
    {
      this.lZa = false;
      if (this.yoh == null)
        break label98;
      this.yoj.dyU();
      AppMethodBeat.o(29734);
    }
    while (true)
    {
      return;
      if (paramConfiguration.orientation == 2)
      {
        this.lZa = true;
        if (this.yoh != null)
        {
          if (!this.yoh.isVisible)
            this.yoh.dLf();
          this.yoj.Nr(2);
        }
      }
      label98: AppMethodBeat.o(29734);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(29718);
    super.onCreate(paramBundle);
    if ((!com.tencent.mm.model.aw.RK()) || (com.tencent.mm.model.aw.QT()))
    {
      ab.e("MicroMsg.MoreTabUI", "Create MoreTabUI when accready:%b ishold:%b", new Object[] { Boolean.valueOf(com.tencent.mm.model.aw.RK()), Boolean.valueOf(com.tencent.mm.model.aw.QT()) });
      AppMethodBeat.o(29718);
    }
    while (true)
    {
      return;
      dyK();
      pT(false);
      AppMethodBeat.o(29718);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(29722);
    super.onDestroy();
    AppMethodBeat.o(29722);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = false;
    AppMethodBeat.i(29748);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0) && (this.plq != null));
    for (boolean bool2 = this.plq.wY(); ; bool2 = false)
    {
      ab.d("MicroMsg.MoreTabUI", "onBackPressed: %b", new Object[] { Boolean.valueOf(bool2) });
      if ((bool2) || (super.onKeyDown(paramInt, paramKeyEvent)))
        AppMethodBeat.o(29748);
      for (bool2 = true; ; bool2 = bool1)
      {
        return bool2;
        AppMethodBeat.o(29748);
      }
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(29720);
    super.onPause();
    ab.i("MicroMsg.MoreTabUI", "onPause: ");
    if (this.you)
    {
      com.tencent.mm.plugin.story.g.h localh = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.cAK();
    }
    AppMethodBeat.o(29720);
  }

  public void onResume()
  {
    AppMethodBeat.i(29719);
    super.onResume();
    ab.i("MicroMsg.MoreTabUI", "onResume: ");
    dyK();
    if (this.you)
    {
      long l = System.currentTimeMillis();
      com.tencent.mm.plugin.story.g.h localh = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.lq(l);
      localh = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.cAJ().cZm = l;
    }
    AppMethodBeat.o(29719);
  }

  public boolean supportNavigationSwipeBack()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MoreTabUI
 * JD-Core Version:    0.6.2
 */