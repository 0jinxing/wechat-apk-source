package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.g.a.gy;
import com.tencent.mm.g.a.gz;
import com.tencent.mm.g.a.gz.b;
import com.tencent.mm.g.a.ho;
import com.tencent.mm.g.a.ib;
import com.tencent.mm.g.a.ib.a;
import com.tencent.mm.g.a.ik;
import com.tencent.mm.g.a.jb;
import com.tencent.mm.g.a.ll;
import com.tencent.mm.g.a.mz;
import com.tencent.mm.g.a.mz.a;
import com.tencent.mm.g.a.oh;
import com.tencent.mm.g.a.oj;
import com.tencent.mm.g.a.px;
import com.tencent.mm.g.a.pz;
import com.tencent.mm.g.a.qm;
import com.tencent.mm.g.a.qp;
import com.tencent.mm.g.a.qp.b;
import com.tencent.mm.g.a.to;
import com.tencent.mm.g.a.vl;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.as;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bp;
import com.tencent.mm.model.bz;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.plugin.account.bind.ui.MobileFriendUI;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.account.ui.FacebookFriendUI;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.game.a.a.a;
import com.tencent.mm.plugin.websearch.api.ac;
import com.tencent.mm.plugin.websearch.api.am;
import com.tencent.mm.plugin.websearch.api.am.a;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.pluginsdk.f.f.a;
import com.tencent.mm.pluginsdk.f.f.b;
import com.tencent.mm.pluginsdk.p.b;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.bu;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreferenceFragment;
import com.tencent.mm.ui.base.preference.NormalIconPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.t;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class FindMoreFriendsUI extends AbstractTabChildPreference
  implements ar, as, k.a, n.b
{
  private boolean cCt;
  private long kFU;
  private com.tencent.mm.sdk.platformtools.ak mHandler;
  private com.tencent.mm.sdk.b.c<vl> mJI;
  private CheckBox oPS;
  private com.tencent.mm.ui.widget.a.c oPU;
  com.tencent.mm.sdk.b.c qLL;
  private int qnE;
  private int status;
  private com.tencent.mm.pluginsdk.c.a vqt;
  com.tencent.mm.at.p.a yhA;
  private long yha;
  private com.tencent.mm.ui.base.preference.h yhb;
  private View yhc;
  private String yhd;
  private int yhe;
  private String yhf;
  private String yhg;
  private String yhh;
  private String yhi;
  private String yhj;
  private boolean yhk;
  private boolean yhl;
  private boolean yhm;
  private int yhn;
  private View yho;
  private TextView yhp;
  private com.tencent.mm.sdk.b.c<px> yhq;
  com.tencent.mm.sdk.b.c yhr;
  com.tencent.mm.sdk.b.c yhs;
  private com.tencent.mm.pluginsdk.c.a yht;
  private com.tencent.mm.pluginsdk.c.a yhu;
  private com.tencent.mm.sdk.b.c yhv;
  private String yhw;
  private FindMoreFriendsUI.a yhx;
  private com.tencent.mm.plugin.messenger.foundation.a.o yhy;
  private com.tencent.mm.sdk.b.c<ho> yhz;

  public FindMoreFriendsUI()
  {
    AppMethodBeat.i(29251);
    this.oPU = null;
    this.yhd = "";
    this.yhe = 0;
    this.yhf = null;
    this.yhg = null;
    this.yhh = null;
    this.yhi = null;
    this.yhj = null;
    this.yhk = false;
    this.yhl = false;
    this.yhm = true;
    this.cCt = false;
    this.mHandler = new FindMoreFriendsUI.1(this, Looper.getMainLooper());
    this.yhq = new FindMoreFriendsUI.12(this);
    this.vqt = new FindMoreFriendsUI.20(this);
    this.qLL = new FindMoreFriendsUI.21(this);
    this.yhr = new FindMoreFriendsUI.22(this);
    this.yhs = new FindMoreFriendsUI.23(this);
    this.yht = new FindMoreFriendsUI.24(this);
    this.yhu = new FindMoreFriendsUI.25(this);
    this.yhv = new FindMoreFriendsUI.26(this);
    this.yhx = FindMoreFriendsUI.a.yhP;
    this.yhy = new FindMoreFriendsUI.2(this);
    this.mJI = new FindMoreFriendsUI.6(this);
    this.yhz = new FindMoreFriendsUI.7(this);
    this.yhA = new FindMoreFriendsUI.9(this);
    AppMethodBeat.o(29251);
  }

  private boolean Cn(int paramInt)
  {
    if ((this.kFU & paramInt) != 0L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void a(mz parammz1, IconPreference paramIconPreference, mz parammz2, String paramString)
  {
    try
    {
      AppMethodBeat.i(29265);
      String str1 = parammz1.cIX.cIY;
      int i = parammz1.cIX.cIZ;
      int j = parammz1.cIX.cJa;
      if ((bo.isNullOrNil(str1)) || (paramIconPreference == null) || (paramIconPreference.dAz() == null))
        AppMethodBeat.o(29265);
      while (true)
      {
        return;
        ab.i("MicroMsg.FindMoreFriendsUI", "download entrance image : %s, width: %d, height: %d", new Object[] { str1, Integer.valueOf(i), Integer.valueOf(j) });
        if ((i > 0) && (j > 0))
          paramIconPreference.hn(com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), i), com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), i));
        String str2 = parammz2.cIX.cJb;
        String str3 = parammz2.cIX.appId;
        i = parammz2.cIX.msgType;
        parammz1 = parammz2.cIX.ctu;
        j = parammz2.cIX.showType;
        parammz2 = new com/tencent/mm/g/a/gz;
        parammz2.<init>();
        parammz2.cBH.Cn = 1;
        parammz2.cBH.url = str1;
        com.tencent.mm.sdk.b.a.xxA.m(parammz2);
        if (parammz2.cBI.cBK)
        {
          Object localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = parammz2.cBI.cBJ + com.tencent.mm.a.g.x(str1.getBytes());
          Object localObject2 = new com/tencent/mm/at/a/a/c$a;
          ((c.a)localObject2).<init>();
          ((c.a)localObject2).ePH = true;
          ((c.a)localObject2).ePJ = ((String)localObject1);
          localObject2 = ((c.a)localObject2).ahG();
          localObject1 = com.tencent.mm.at.o.ahp();
          ImageView localImageView = paramIconPreference.dAz();
          com.tencent.mm.at.a.c.i local14 = new com/tencent/mm/ui/FindMoreFriendsUI$14;
          local14.<init>(this, parammz2);
          com.tencent.mm.at.a.c.g local15 = new com/tencent/mm/ui/FindMoreFriendsUI$15;
          local15.<init>(this, parammz2, paramIconPreference, j, str3, i, str2, parammz1, paramString);
          ((com.tencent.mm.at.a.a)localObject1).a(str1, localImageView, (com.tencent.mm.at.a.a.c)localObject2, local14, local15);
        }
        AppMethodBeat.o(29265);
      }
    }
    finally
    {
    }
    throw parammz1;
  }

  private void a(am.a parama, IconPreference paramIconPreference)
  {
    AppMethodBeat.i(138177);
    com.tencent.mm.sdk.platformtools.al.d(new FindMoreFriendsUI.4(this, paramIconPreference, parama));
    AppMethodBeat.o(138177);
  }

  private static void a(IconPreference paramIconPreference, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5, int paramInt6)
  {
    AppMethodBeat.i(29269);
    paramIconPreference.NL(paramInt1);
    paramIconPreference.NN(paramInt2);
    paramIconPreference.NM(paramInt3);
    paramIconPreference.qh(paramBoolean);
    paramIconPreference.NQ(paramInt4);
    paramIconPreference.NP(paramInt5);
    paramIconPreference.NR(paramInt6);
    AppMethodBeat.o(29269);
  }

  private static void a(IconPreference paramIconPreference, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(29255);
    paramIconPreference.NN(paramInt1);
    paramIconPreference.NM(paramInt2);
    paramIconPreference.qh(paramBoolean);
    paramIconPreference.NQ(paramInt3);
    paramIconPreference.NP(paramInt4);
    paramIconPreference.NR(paramInt5);
    AppMethodBeat.o(29255);
  }

  private void aMk()
  {
    AppMethodBeat.i(29257);
    this.yhn = 0;
    this.yha = System.currentTimeMillis();
    if (this.yho != null)
      this.yho.setVisibility(8);
    if ((!this.yCQ) || (!isAdded()))
    {
      AppMethodBeat.o(29257);
      return;
    }
    ab.i("MicroMsg.FindMoreFriendsUI", "status %d (%d), extStatus %d (%d), pluginFlag %d (%d)", new Object[] { Integer.valueOf(this.status), Integer.valueOf(com.tencent.mm.model.r.YD()), Long.valueOf(this.kFU), Long.valueOf(com.tencent.mm.model.r.YE()), Integer.valueOf(this.qnE), Integer.valueOf(com.tencent.mm.model.r.YK()) });
    dwX();
    boolean bool1 = Cn(1048576);
    boolean bool2 = com.tencent.mm.bp.d.afj("scanner");
    label150: label213: label239: Object localObject1;
    if (!bool1)
    {
      bool3 = true;
      ab.i("MicroMsg.FindMoreFriendsUI", "openScan %s, plugin installed %s", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool2) });
      if ((!bool1) && (bool2))
        break label1344;
      this.yhb.ce("find_friends_by_qrcode", true);
      if (!dwR())
        com.tencent.mm.plugin.report.service.h.pYm.k(953L, 1L, 1L);
      dwY();
      dwZ();
      dxa();
      bool1 = Cn(4194304);
      if (bool1)
        break label1420;
      bool3 = true;
      ab.i("MicroMsg.FindMoreFriendsUI", "openShoppingEntry %s", new Object[] { Boolean.valueOf(bool3) });
      if (bool1)
        break label1425;
      pD(false);
      label267: localObject1 = a.a.bDb();
      if (localObject1 == null)
        break label1990;
      getContext();
    }
    label304: label950: label1344: label1984: label1990: for (boolean bool3 = ((com.tencent.mm.plugin.game.a.a)localObject1).bCS(); ; bool3 = false)
    {
      bool2 = Cn(8388608);
      label363: Object localObject2;
      if (!bool2)
      {
        bool1 = true;
        ab.i("MicroMsg.FindMoreFriendsUI", "shouldShowGame %s, openGameEntry %s", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool1) });
        if ((!bool3) || (bool2))
          break label1464;
        this.yhb.ce("more_tab_game_recommend", false);
        dwW();
        this.yhn += 1;
        localObject2 = new qp();
        ((qp)localObject2).cMH.cMJ = true;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        bool1 = ((qp)localObject2).cMI.cMK;
        bool2 = Cn(16777216);
        if (bool2)
          break label1498;
        bool3 = true;
        ab.i("MicroMsg.FindMoreFriendsUI", "shouldShowMiniProgram %s, openMiniProgramEntry %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool3) });
        if ((bool1) && (!bool2))
          break label1503;
        this.yhb.ce("app_brand_entrance", true);
        if (!dwR())
          com.tencent.mm.plugin.report.service.h.pYm.k(953L, 9L, 1L);
        bool2 = com.tencent.mm.plugin.ipcall.d.bGW();
        bool1 = Cn(33554432);
        if (bool1)
          break label1613;
        bool3 = true;
        label496: ab.i("MicroMsg.FindMoreFriendsUI", "showShowWeChatOut %s, openWeChatOutEntry %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
        if ((!bool2) || (bool1))
          break label1650;
        this.yhn += 1;
        this.yhb.ce("ip_call_entrance", false);
        localObject2 = (IconPreference)this.yhb.aqO("ip_call_entrance");
        aw.ZK();
        if (((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xLC, Integer.valueOf(0))).intValue() >= com.tencent.mm.m.g.Nu().getInt("WCOEntranceRedDot", 0))
          break label1618;
        ((IconPreference)localObject2).NL(0);
        ((IconPreference)localObject2).ey(getString(2131296988), 2130839673);
        label623: ((IconPreference)localObject2).NQ(8);
        aw.ZK();
        if (((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xLE, Boolean.FALSE)).booleanValue() != true)
          break label1628;
        ((IconPreference)localObject2).qh(true);
        ((IconPreference)localObject2).NL(8);
        i = 1;
        aw.ZK();
        localObject1 = (String)com.tencent.mm.model.c.Ry().get(ac.a.xLD, "");
        ((IconPreference)localObject2).av((String)localObject1, -1, -7566196);
        if (!bo.isNullOrNil((String)localObject1))
          i = 1;
        if (i == 0)
          break label1640;
        ((IconPreference)localObject2).NM(0);
        label725: localObject1 = new PreferenceSmallCategory(getContext());
        this.yhb.a((Preference)localObject1, -1);
        label748: dwS();
        bool3 = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xWa, Boolean.TRUE)).booleanValue();
        ab.d("MicroMsg.FindMoreFriendsUI", "firstExposeFindMorePage: %s.", new Object[] { Boolean.valueOf(bool3) });
        if (bool3)
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xWa, Boolean.FALSE);
        bool1 = ((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.welab.a.a.a.class)).agO("labs_nearbylife");
        ab.i("MicroMsg.FindMoreFriendsUI", "updateMyLifeAroundEntrance isInExperiment: ".concat(String.valueOf(bool1)));
        if (!bool1)
          break label1984;
        bool1 = ((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.welab.a.a.a.class)).xj("labs_nearbylife");
        ab.i("MicroMsg.FindMoreFriendsUI", "updateMyLifeAroundEntrance isOpen: ".concat(String.valueOf(bool1)));
        if (!bool1)
          break label1984;
      }
      for (int i = 1; ; i = 0)
      {
        String str;
        if (i != 0)
        {
          localObject1 = (IconPreference)this.yhb.aqO("my_life_around");
          ((IconPreference)localObject1).setTitle(getString(2131296318));
          this.yhn += 1;
          if (bool3)
          {
            com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVZ, Boolean.FALSE);
            if (!((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVY, Boolean.FALSE)).booleanValue())
              break label1940;
            str = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xWc, "");
            localObject2 = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xWd, "");
            ij(str, (String)localObject2);
            switch (FindMoreFriendsUI.19.yhN[this.yhx.ordinal()])
            {
            default:
              this.yhb.ce("my_life_around", false);
              com.tencent.mm.plugin.report.service.h.pYm.e(17065, new Object[] { Integer.valueOf(0), Long.valueOf(bo.anT()), Integer.valueOf(this.yhx.ordinal()), com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xWd, ""), com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xWc, ""), com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xWb, "0") });
              com.tencent.mm.au.b.ahN();
              this.yhb.ce("find_friends_by_facebook", true);
              this.yhb.ce("settings_emoji_store", true);
              if (this.yhn == 0)
              {
                localObject2 = (ViewGroup)findViewById(16908298).getParent();
                if (this.yho != null)
                  break label1973;
                this.yho = getContext().getLayoutInflater().inflate(2130969558, null);
                this.yhp = ((TextView)this.yho.findViewById(2131824038));
                this.yhp.setOnClickListener(new FindMoreFriendsUI.8(this));
                localObject1 = new RelativeLayout.LayoutParams(-1, -1);
                ((ViewGroup)localObject2).addView(this.yho, (ViewGroup.LayoutParams)localObject1);
              }
              break;
            case 1:
            case 2:
            case 3:
            case 4:
            }
          }
        }
        while (true)
        {
          this.yhb.notifyDataSetChanged();
          if (!dwR())
            com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xWu, Long.valueOf(this.yha));
          AppMethodBeat.o(29257);
          break;
          bool3 = false;
          break label150;
          this.yhb.ce("find_friends_by_qrcode", false);
          this.yhn += 1;
          if (com.tencent.mm.x.c.PK().b(ac.a.xVK, ac.a.xVJ))
          {
            ((NormalIconPreference)this.yhb.aqO("find_friends_by_qrcode")).NN(0);
            break label213;
          }
          ((NormalIconPreference)this.yhb.aqO("find_friends_by_qrcode")).NN(4);
          break label213;
          bool3 = false;
          break label239;
          this.yhb.ce("jd_market_entrance", true);
          if (dwR())
            break label267;
          com.tencent.mm.plugin.report.service.h.pYm.k(953L, 7L, 1L);
          break label267;
          bool1 = false;
          break label304;
          this.yhb.ce("more_tab_game_recommend", true);
          if (dwR())
            break label363;
          com.tencent.mm.plugin.report.service.h.pYm.k(953L, 8L, 1L);
          break label363;
          label1498: bool3 = false;
          break label413;
          label1503: this.yhn += 1;
          this.yhb.ce("app_brand_entrance", false);
          localObject1 = (IconPreference)this.yhb.aqO("app_brand_entrance");
          if (((qp)localObject2).cMI.cMM)
          {
            i = 0;
            ((IconPreference)localObject1).NL(i);
            ((IconPreference)localObject1).ey(getString(2131296988), 2130839673);
            if (!((qp)localObject2).cMI.cML)
              break label1606;
          }
          label1606: for (i = 0; ; i = 8)
          {
            ((IconPreference)localObject1).NN(i);
            break;
            i = 8;
            break label1553;
          }
          label1613: bool3 = false;
          break label496;
          label1618: ((IconPreference)localObject2).NL(8);
          break label623;
          label1628: ((IconPreference)localObject2).qh(false);
          i = 0;
          break label672;
          label1640: ((IconPreference)localObject2).NM(8);
          break label725;
          label1650: this.yhb.ce("ip_call_entrance", true);
          break label748;
          if (!((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVZ, Boolean.TRUE)).booleanValue())
            break label950;
          this.yhx = FindMoreFriendsUI.a.yhU;
          ((IconPreference)localObject1).NL(0);
          ((IconPreference)localObject1).ey(getString(2131296988), 2130839673);
          break label950;
          com.tencent.mm.at.o.ahk();
          Bitmap localBitmap = com.tencent.mm.at.c.kR((String)localObject2);
          if (localBitmap != null)
          {
            this.yhw = null;
            ((IconPreference)localObject1).ap(com.tencent.mm.sdk.platformtools.d.a(localBitmap, false, localBitmap.getWidth() * 0.1F));
          }
          while (true)
          {
            ((IconPreference)localObject1).av(str, -1, Color.parseColor("#8c8c8c"));
            a((IconPreference)localObject1, 8, 0, false, 0, 0, 0);
            break;
            this.yhw = ((String)localObject2);
            com.tencent.mm.at.o.aho().a((String)localObject2, this.yhA);
          }
          com.tencent.mm.at.o.ahk();
          localBitmap = com.tencent.mm.at.c.kR((String)localObject2);
          if (localBitmap != null)
          {
            this.yhw = null;
            ((IconPreference)localObject1).ap(com.tencent.mm.sdk.platformtools.d.a(localBitmap, false, localBitmap.getWidth() * 0.1F));
          }
          while (true)
          {
            a((IconPreference)localObject1, 8, 8, false, 0, 0, 0);
            break;
            this.yhw = ((String)localObject2);
            com.tencent.mm.at.o.aho().a((String)localObject2, this.yhA);
          }
          ((IconPreference)localObject1).av(str, -1, Color.parseColor("#8c8c8c"));
          a((IconPreference)localObject1, 8, 0, true, 8, 8, 8);
          break label1064;
          a((IconPreference)localObject1, 0, 8, false, 8, 8, 8);
          break label1064;
          a((IconPreference)localObject1, 8, 8, false, 8, 8, 8);
          break label1064;
          this.yhb.ce("my_life_around", true);
          break label1170;
          this.yho.setVisibility(0);
        }
      }
    }
  }

  private static void b(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    AppMethodBeat.i(29266);
    com.tencent.mm.kernel.g.RQ();
    Object localObject = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xTJ, "");
    if ((paramString2 != null) && (!paramString2.equals(localObject)))
    {
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTJ, paramString2);
      localObject = new oj();
      ((oj)localObject).cKF.scene = 9;
      ((oj)localObject).cKF.cKG = 901;
      ((oj)localObject).cKF.action = 1;
      ((oj)localObject).cKF.appId = paramString1;
      ((oj)localObject).cKF.msgType = paramInt1;
      ((oj)localObject).cKF.cJb = paramString2;
      ((oj)localObject).cKF.ctu = paramString3;
      paramString2 = new JSONObject();
    }
    try
    {
      paramString2.put("function_type", "resource");
      paramString2.put("function_value", String.valueOf(paramInt2));
    }
    catch (JSONException paramString1)
    {
      try
      {
        while (true)
        {
          paramString1 = URLEncoder.encode(paramString2.toString(), "utf-8");
          ((oj)localObject).cKF.cKH = paramString1;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
          com.tencent.mm.plugin.report.service.h.pYm.a(858L, 2L, 1L, false);
          AppMethodBeat.o(29266);
          return;
          paramString1 = paramString1;
          ab.e("MicroMsg.FindMoreFriendsUI", paramString1.getMessage());
        }
      }
      catch (UnsupportedEncodingException paramString2)
      {
        while (true)
        {
          paramString1 = "";
          ab.e("MicroMsg.FindMoreFriendsUI", paramString2.getMessage());
        }
      }
    }
  }

  private boolean dwR()
  {
    AppMethodBeat.i(29252);
    boolean bool;
    if (bo.L(com.tencent.mm.kernel.g.RP().Ry().a(ac.a.xWu, 0L), this.yha))
    {
      bool = true;
      AppMethodBeat.o(29252);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(29252);
    }
  }

  private void dwS()
  {
    AppMethodBeat.i(29253);
    ab.i("MicroMsg.FindMoreFriendsUI", "checkLookVisibility");
    if ((!this.yCQ) || (!isAdded()))
    {
      ab.i("MicroMsg.FindMoreFriendsUI", "checkLookVisibility preference not add");
      AppMethodBeat.o(29253);
      return;
    }
    while (true)
    {
      try
      {
        Object localObject1 = ac.adL("discoverRecommendEntry");
        if (Cn(67108864))
          break label267;
        if (!((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.welab.a.a.a.class)).agN("labs_browse"))
          break label354;
        i = 1;
        bool = true;
        if (!com.tencent.mm.au.b.sO((String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null)))
          break label351;
        ab.i("MicroMsg.FindMoreFriendsUI", "checkLookVisibility EuropeanUnionCountry");
        bool = false;
        ab.i("MicroMsg.FindMoreFriendsUI", "showLookEntry %s", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
          break label311;
        localObject2 = ((JSONObject)localObject1).optString("wording");
        localObject1 = (IconPreference)this.yhb.aqO("find_friends_by_look");
        if (!bo.isNullOrNil((String)localObject2))
          break label282;
        ((IconPreference)localObject1).setTitle(getString(2131299820));
        this.yhn += 1;
        this.yhb.ce("find_friends_by_look", false);
        if (i == 0)
          break label291;
        ((IconPreference)localObject1).NL(0);
        ((IconPreference)localObject1).ey(getString(2131296988), 2130839673);
        ((com.tencent.mm.plugin.topstory.ui.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.ui.a.class)).tryToCreateTopStoryWebView();
        AppMethodBeat.o(29253);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.FindMoreFriendsUI", bo.l(localException));
        AppMethodBeat.o(29253);
      }
      break;
      label267: ab.i("MicroMsg.FindMoreFriendsUI", "checkLookVisibility in experiment but not open");
      int i = 0;
      boolean bool = false;
      continue;
      label282: localException.setTitle((CharSequence)localObject2);
      continue;
      label291: Object localObject2 = new com/tencent/mm/ui/FindMoreFriendsUI$3;
      ((FindMoreFriendsUI.3)localObject2).<init>(this, localException);
      com.tencent.mm.sdk.platformtools.al.d((Runnable)localObject2);
      continue;
      label311: this.yhb.ce("find_friends_by_look", true);
      if (!dwR())
        com.tencent.mm.plugin.report.service.h.pYm.k(953L, 3L, 1L);
      AppMethodBeat.o(29253);
      break;
      label351: continue;
      label354: i = 0;
      bool = true;
    }
  }

  private static int dwT()
  {
    AppMethodBeat.i(29259);
    int i = 1;
    f.b localb = com.tencent.mm.pluginsdk.f.f.vdy;
    int j = i;
    f.a locala;
    if (localb != null)
    {
      locala = localb.cDB();
      j = i;
      if (localb.cDs())
      {
        j = i;
        if (locala.isStart())
        {
          j = i;
          if (!locala.bxX())
          {
            if ((!"3".equals(locala.cDp())) || (bo.isNullOrNil(locala.cDq())))
              break label96;
            j = 6;
          }
        }
      }
    }
    while (true)
    {
      AppMethodBeat.o(29259);
      return j;
      label96: if (!bo.isNullOrNil(locala.cDn()))
      {
        j = 3;
      }
      else
      {
        j = i;
        if (locala.cDo())
          j = 2;
      }
    }
  }

  private void dwV()
  {
    AppMethodBeat.i(29263);
    if (this.yhc == null)
    {
      this.yhc = View.inflate(getContext(), 2130969930, null);
      this.oPS = ((CheckBox)this.yhc.findViewById(2131825250));
      this.oPS.setChecked(false);
    }
    if (this.oPU == null)
    {
      this.oPU = com.tencent.mm.ui.base.h.a(getContext(), getString(2131297061), this.yhc, new FindMoreFriendsUI.11(this), null);
      AppMethodBeat.o(29263);
    }
    while (true)
    {
      return;
      this.oPU.show();
      AppMethodBeat.o(29263);
    }
  }

  private void dwW()
  {
    AppMethodBeat.i(29264);
    if ((IconPreference)this.yhb.aqO("more_tab_game_recommend") == null)
      AppMethodBeat.o(29264);
    while (true)
    {
      return;
      com.tencent.mm.sdk.g.d.post(new FindMoreFriendsUI.13(this), "updateGame");
      AppMethodBeat.o(29264);
    }
  }

  private void dwX()
  {
    AppMethodBeat.i(29275);
    boolean bool2;
    if ((this.qnE & 0x8000) == 0)
    {
      bool1 = true;
      bool2 = com.tencent.mm.bp.d.afj("sns");
      ab.i("MicroMsg.FindMoreFriendsUI", "openSns %s, plugin installed %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if (!bool1)
      {
        if (com.tencent.mm.kernel.g.RP().Ry().getInt(ac.a.xWt, 0) != 1)
          break label143;
        ab.w("MicroMsg.FindMoreFriendsUI", "opened sns entry recently");
        com.tencent.mm.plugin.report.service.h.pYm.k(150L, 71L, 1L);
      }
    }
    while (true)
    {
      if ((bool1) && (bool2))
        break label184;
      this.yhb.ce("album_dyna_photo_ui_title", true);
      if (!dwR())
        com.tencent.mm.plugin.report.service.h.pYm.k(953L, 0L, 1L);
      AppMethodBeat.o(29275);
      return;
      bool1 = false;
      break;
      label143: if (com.tencent.mm.kernel.g.RP().Ry().getInt(ac.a.xWt, 0) == -1)
      {
        ab.i("MicroMsg.FindMoreFriendsUI", "closed sns entry recently");
        com.tencent.mm.plugin.report.service.h.pYm.k(150L, 70L, 1L);
      }
    }
    label184: this.yhn += 1;
    this.yhb.ce("album_dyna_photo_ui_title", false);
    FriendSnsPreference localFriendSnsPreference = (FriendSnsPreference)this.yhb.aqO("album_dyna_photo_ui_title");
    localFriendSnsPreference.drawable = com.tencent.mm.bz.a.g(getContext(), 2131231452);
    aw.ZK();
    boolean bool1 = bo.e((Boolean)com.tencent.mm.model.c.Ry().get(48, null));
    localFriendSnsPreference.NL(8);
    localFriendSnsPreference.NR(8);
    if (bool1)
    {
      localFriendSnsPreference.NL(0);
      localFriendSnsPreference.ey(getString(2131296988), 2130839673);
    }
    aw.ZK();
    this.yhd = ((String)com.tencent.mm.model.c.Ry().get(68377, null));
    if ((!bo.isNullOrNil(this.yhd)) && (LauncherUI.dxE() == 2))
    {
      aw.ZK();
      if (com.tencent.mm.model.c.Ry().getInt(68419, 0) == 0)
      {
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.plugin.sns.i.f.k(2, (String)com.tencent.mm.kernel.g.RP().Ry().get(68418, ""), this.yhe);
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(68419, Integer.valueOf(1));
      }
    }
    Object localObject = com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVv, null);
    long l;
    label412: int i;
    if (localObject == null)
    {
      l = 0L;
      ab.i("MicroMsg.FindMoreFriendsUI", "newer snsobj %s", new Object[] { bo.bc(this.yhd, "") });
      localFriendSnsPreference.NQ(0);
      if (bo.isNullOrNil(this.yhd))
        break label610;
      localFriendSnsPreference.NP(0);
      aw.ZK();
      if (!bo.a((Boolean)com.tencent.mm.model.c.Ry().get(68384, null), true))
        break label603;
      i = 0;
      label483: localFriendSnsPreference.NR(i);
      localFriendSnsPreference.aqD(this.yhd);
    }
    while (true)
    {
      if (com.tencent.mm.plugin.sns.b.n.qFz != null)
        this.yhe = com.tencent.mm.plugin.sns.b.n.qFz.baS();
      if (this.yhe != 0)
      {
        localFriendSnsPreference.NL(0);
        localFriendSnsPreference.ey(this.yhe, com.tencent.mm.ui.tools.r.ik(getContext()));
      }
      localFriendSnsPreference.NN(8);
      localFriendSnsPreference.NM(8);
      com.tencent.mm.sdk.b.a.xxA.m(new to());
      AppMethodBeat.o(29275);
      break;
      l = ((Long)localObject).longValue();
      break label412;
      label603: i = 8;
      break label483;
      label610: aw.ZK();
      if (((Boolean)com.tencent.mm.model.c.Ry().get(589825, Boolean.FALSE)).booleanValue())
      {
        localFriendSnsPreference.NO(2131231709);
        localFriendSnsPreference.NP(0);
        localFriendSnsPreference.NR(8);
      }
      else if ((l != 0L) && (((com.tencent.mm.plugin.sns.b.m)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.sns.b.m.class)).jM(l)))
      {
        localFriendSnsPreference.NP(0);
        localFriendSnsPreference.NR(0);
        localFriendSnsPreference.mX(l);
      }
      else
      {
        localFriendSnsPreference.NP(8);
      }
    }
  }

  private void dwY()
  {
    AppMethodBeat.i(29276);
    if ((this.qnE & 0x100) == 0);
    boolean bool2;
    for (boolean bool1 = true; ; bool1 = false)
    {
      bool2 = com.tencent.mm.bp.d.afj("shake");
      ab.i("MicroMsg.FindMoreFriendsUI", "openShake %s, plugin installed %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((bool1) && (bool2))
        break;
      this.yhb.ce("find_friends_by_shake", true);
      if (!dwR())
        com.tencent.mm.plugin.report.service.h.pYm.k(953L, 2L, 1L);
      AppMethodBeat.o(29276);
      return;
    }
    this.yhn += 1;
    this.yhb.ce("find_friends_by_shake", false);
    IconPreference localIconPreference = (IconPreference)this.yhb.aqO("find_friends_by_shake");
    int i = com.tencent.mm.bi.d.akR().baS() + com.tencent.mm.pluginsdk.p.a.dgQ().cjL();
    if (i > 0)
    {
      localIconPreference.NL(0);
      localIconPreference.ey(String.valueOf(i), 2130840508);
      label177: localIconPreference.NP(8);
      com.tencent.mm.pluginsdk.p.a.dgQ().cjM();
      if (!com.tencent.mm.pluginsdk.p.a.dgQ().cjN())
        break label547;
    }
    label532: label547: for (bool1 = com.tencent.mm.x.c.PK().bY(262154, 266258); ; bool1 = false)
    {
      Object localObject;
      if (bool1)
      {
        aw.ZK();
        localObject = (String)com.tencent.mm.model.c.Ry().get(ac.a.xIW, "");
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          localIconPreference.NN(8);
          localIconPreference.NL(0);
          localIconPreference.ey(String.valueOf(localObject), 2130840508);
        }
      }
      int j;
      while (true)
      {
        aw.ZK();
        localObject = bo.bc((String)com.tencent.mm.model.c.Ry().get(ac.a.xMn, null), "");
        aw.ZK();
        bool2 = bo.a((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xMp, null), false);
        aw.ZK();
        j = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xMl, Integer.valueOf(0))).intValue();
        if ((!Boolean.valueOf(bool2).booleanValue()) || (localObject == null) || (((String)localObject).equals("")) || (i > 0) || (bool1))
          break label532;
        if (j != 0)
          break label501;
        localIconPreference.NN(8);
        localIconPreference.NM(0);
        localObject = ((String)localObject).split(",");
        if (localObject.length > 0)
          localIconPreference.av(localObject[0], -1, Color.parseColor("#8c8c8c"));
        localIconPreference.qh(true);
        localIconPreference.NQ(8);
        AppMethodBeat.o(29276);
        break;
        localIconPreference.NL(8);
        localIconPreference.ey("", -1);
        break label177;
        if (i > 0)
        {
          localIconPreference.NN(0);
        }
        else
        {
          localIconPreference.NN(0);
          localIconPreference.NL(8);
          localIconPreference.ey("", -1);
          continue;
          localIconPreference.NN(8);
        }
      }
      label501: if (j == 1)
      {
        localIconPreference.NM(8);
        localIconPreference.NL(0);
        localIconPreference.yBX = true;
        AppMethodBeat.o(29276);
        break;
        localIconPreference.NM(8);
      }
      AppMethodBeat.o(29276);
      break;
    }
  }

  private void dwZ()
  {
    AppMethodBeat.i(138178);
    boolean bool1 = Cn(2097152);
    boolean bool2 = com.tencent.mm.bp.d.afj("search");
    boolean bool3;
    if (!bool1)
    {
      bool3 = true;
      ab.i("MicroMsg.FindMoreFriendsUI", "openSearch %s, plugin installed %s", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool2) });
      if ((!bool1) && (bool2))
        break label104;
      this.yhb.ce("find_friends_by_search", true);
      if (!dwR())
        com.tencent.mm.plugin.report.service.h.pYm.k(953L, 4L, 1L);
      AppMethodBeat.o(138178);
    }
    while (true)
    {
      return;
      bool3 = false;
      break;
      label104: this.yhn += 1;
      this.yhb.ce("find_friends_by_search", false);
      try
      {
        Object localObject = ac.adL("discoverSearchEntry");
        String str = ((JSONObject)localObject).optString("wording");
        ((JSONObject)localObject).optString("androidIcon");
        localObject = (IconPreference)this.yhb.aqO("find_friends_by_search");
        if (bo.isNullOrNil(str))
          ((IconPreference)localObject).setTitle(getString(2131299824));
        while (true)
        {
          ((IconPreference)localObject).NL(8);
          a(am.cVt().uaS, (IconPreference)localObject);
          com.tencent.mm.plugin.websearch.api.aa.cVe();
          AppMethodBeat.o(138178);
          break;
          ((IconPreference)localObject).setTitle(str);
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.FindMoreFriendsUI", localException, "update search entry exception!", new Object[0]);
        AppMethodBeat.o(138178);
      }
    }
  }

  private void dxa()
  {
    AppMethodBeat.i(29277);
    boolean bool1;
    if ((this.qnE & 0x200) == 0)
    {
      bool1 = true;
      boolean bool2 = com.tencent.mm.bp.d.afj("nearby");
      ab.i("MicroMsg.FindMoreFriendsUI", "openNearby %s, plugin installed %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((bool1) && (bool2))
        break label103;
      this.yhb.ce("find_friends_by_near", true);
      if (!dwR())
        com.tencent.mm.plugin.report.service.h.pYm.k(953L, 5L, 1L);
      AppMethodBeat.o(29277);
    }
    while (true)
    {
      return;
      bool1 = false;
      break;
      label103: this.yhn += 1;
      this.yhb.ce("find_friends_by_near", false);
      IconPreference localIconPreference = (IconPreference)this.yhb.aqO("find_friends_by_near");
      if (localIconPreference != null)
      {
        if (com.tencent.mm.app.plugin.b.Ci())
          localIconPreference.NP(8);
        int i;
        while (true)
        {
          i = com.tencent.mm.bi.d.akQ().baS();
          if (!com.tencent.mm.bn.a.dgL())
            break label225;
          if (i <= 0)
            break label210;
          localIconPreference.NN(0);
          AppMethodBeat.o(29277);
          break;
          localIconPreference.NP(0);
          localIconPreference.NO(2130839539);
          localIconPreference.hn(-2, -2);
        }
        label210: localIconPreference.NN(8);
        AppMethodBeat.o(29277);
        continue;
        label225: if (i > 0)
        {
          localIconPreference.NL(0);
          localIconPreference.ey(String.valueOf(i), com.tencent.mm.ui.tools.r.ik(getContext()));
          AppMethodBeat.o(29277);
        }
        else
        {
          localIconPreference.NL(8);
          localIconPreference.ey("", -1);
        }
      }
      else
      {
        AppMethodBeat.o(29277);
      }
    }
  }

  private void dxb()
  {
    AppMethodBeat.i(29278);
    pz localpz = new pz();
    localpz.cMo.cCt = this.cCt;
    com.tencent.mm.sdk.b.a.xxA.m(localpz);
    AppMethodBeat.o(29278);
  }

  private boolean ij(String paramString1, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(29254);
    int i;
    int j;
    if (!bo.isNullOrNil(paramString1))
    {
      i = 1;
      if (bo.isNullOrNil(paramString2))
        break label95;
      j = 1;
      label28: if ((i == 0) || (j == 0))
        break label101;
      paramString1 = FindMoreFriendsUI.a.yhT;
      label42: ab.d("MicroMsg.FindMoreFriendsUI", "new type: %s, now type: %s.", new Object[] { paramString1, this.yhx });
      if (paramString1.compareTo(this.yhx) < 0)
        break label132;
      this.yhx = paramString1;
      AppMethodBeat.o(29254);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label95: j = 0;
      break label28;
      label101: if (j != 0)
      {
        paramString1 = FindMoreFriendsUI.a.yhS;
        break label42;
      }
      if (i != 0)
      {
        paramString1 = FindMoreFriendsUI.a.yhR;
        break label42;
      }
      paramString1 = FindMoreFriendsUI.a.yhQ;
      break label42;
      label132: AppMethodBeat.o(29254);
      bool = false;
    }
  }

  private String ik(String paramString1, String paramString2)
  {
    AppMethodBeat.i(29268);
    if (!bo.isNullOrNil(paramString1))
      AppMethodBeat.o(29268);
    while (true)
    {
      return paramString1;
      paramString1 = com.tencent.mm.pluginsdk.model.app.g.t(getContext(), paramString2);
      AppMethodBeat.o(29268);
    }
  }

  private void pD(boolean paramBoolean)
  {
    AppMethodBeat.i(29258);
    Object localObject;
    String str1;
    f.b localb;
    String str2;
    com.tencent.mm.plugin.subapp.jdbiz.b localb1;
    if (com.tencent.mm.sdk.platformtools.aa.doo())
    {
      localObject = com.tencent.mm.m.g.Nu().getValue("JDEntranceConfigName");
      str1 = com.tencent.mm.m.g.Nu().getValue("JDEntranceConfigIconUrl");
      localb = com.tencent.mm.pluginsdk.f.f.vdy;
      if (localb == null)
        break label621;
      str2 = localb.cDA();
      if ((bo.isNullOrNil((String)localObject)) || (bo.isNullOrNil(str1)) || (bo.isNullOrNil(str2)))
        break label547;
      this.yhn += 1;
      localb1 = (com.tencent.mm.plugin.subapp.jdbiz.b)localb.cDB();
      if ((!localb1.cDk()) || (localb1.cDl()))
        break label632;
      if (bo.isNullOrNil(localb1.iconUrl))
        break label629;
      str1 = localb1.iconUrl;
      label128: if (bo.isNullOrNil(localb1.title))
        break label626;
      localObject = localb1.title;
    }
    label343: label495: label626: label629: label632: 
    while (true)
    {
      IconPreference localIconPreference = (IconPreference)this.yhb.aqO("jd_market_entrance");
      com.tencent.mm.at.o.ahk();
      com.tencent.mm.at.c.kR(str1);
      localIconPreference.setTitle((CharSequence)localObject);
      localIconPreference.NL(8);
      localIconPreference.NN(8);
      localIconPreference.NM(8);
      localIconPreference.qh(false);
      localIconPreference.NQ(8);
      if ((localb.cDs()) && (localb1.isStart()) && (!localb1.bxX()))
      {
        if (!bo.isNullOrNil(localb1.ssu))
        {
          localIconPreference.NL(8);
          localIconPreference.NN(8);
          localIconPreference.av(localb1.ssu, -1, -7566196);
          localIconPreference.NM(0);
        }
        if (bo.isNullOrNil(localb1.ssv))
          break label495;
        com.tencent.mm.at.o.ahk();
        localObject = com.tencent.mm.at.c.kR(localb1.ssv);
        localIconPreference.NQ(0);
        localIconPreference.NP(0);
        localIconPreference.NR(0);
        localIconPreference.qh(false);
        if (localObject != null)
        {
          this.yhj = null;
          localIconPreference.ap((Bitmap)localObject);
        }
      }
      else
      {
        if (paramBoolean)
          this.yhb.notifyDataSetChanged();
        if (!dwR())
        {
          com.tencent.mm.plugin.report.service.h.pYm.k(931L, 12L, 1L);
          com.tencent.mm.plugin.report.service.h.pYm.e(11178, new Object[] { str2, localb.cDB().cDm(), Integer.valueOf(dwT()) });
        }
      }
      for (paramBoolean = false; ; paramBoolean = true)
      {
        this.yhb.ce("jd_market_entrance", paramBoolean);
        AppMethodBeat.o(29258);
        return;
        if (com.tencent.mm.sdk.platformtools.aa.dop())
        {
          localObject = com.tencent.mm.m.g.Nu().getValue("JDEntranceConfigNameHKTW");
          break;
        }
        localObject = com.tencent.mm.m.g.Nu().getValue("JDEntranceConfigNameEN");
        break;
        com.tencent.mm.at.o.aho().a(localb1.ssv, this.yhA);
        this.yhj = localb1.ssv;
        break label343;
        if (!bo.isNullOrNil(localb1.ssu))
        {
          localIconPreference.qh(true);
          break label343;
        }
        if (!localb1.sst)
          break label343;
        localIconPreference.NN(0);
        localIconPreference.ey("", -1);
        localIconPreference.NL(8);
        break label343;
        if ((!dwR()) && (com.tencent.mm.sdk.platformtools.aa.doo()))
        {
          if (bo.isNullOrNil((String)localObject))
            com.tencent.mm.plugin.report.service.h.pYm.k(931L, 2L, 1L);
          if (bo.isNullOrNil(str1))
            com.tencent.mm.plugin.report.service.h.pYm.k(931L, 3L, 1L);
          if (bo.isNullOrNil(str2))
            com.tencent.mm.plugin.report.service.h.pYm.k(931L, 4L, 1L);
        }
      }
      continue;
      break label128;
    }
  }

  private static void pE(boolean paramBoolean)
  {
    AppMethodBeat.i(29267);
    a.a.bDb().hH(paramBoolean);
    AppMethodBeat.o(29267);
  }

  public final int JC()
  {
    return 2131165240;
  }

  public final void ZA()
  {
    AppMethodBeat.i(29290);
    ab.i("MicroMsg.FindMoreFriendsUI", "notify comment change");
    if ((com.tencent.mm.model.r.YK() & 0x8000) != 0)
      AppMethodBeat.o(29290);
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.sns.b.n.qFz != null)
        this.yhe = com.tencent.mm.plugin.sns.b.n.qFz.baS();
      dwX();
      this.yhb.notifyDataSetChanged();
      AppMethodBeat.o(29290);
    }
  }

  public final void ZB()
  {
    AppMethodBeat.i(29272);
    if (this.yhb == null)
      AppMethodBeat.o(29272);
    while (true)
    {
      return;
      this.status = com.tencent.mm.model.r.YD();
      aMk();
      AppMethodBeat.o(29272);
    }
  }

  public final void Zx()
  {
    AppMethodBeat.i(29270);
    if ((com.tencent.mm.model.r.YK() & 0x8000) != 0)
      AppMethodBeat.o(29270);
    while (true)
    {
      return;
      this.yhe += 1;
      dwX();
      this.yhb.notifyDataSetChanged();
      AppMethodBeat.o(29270);
    }
  }

  public final void Zy()
  {
    AppMethodBeat.i(29271);
    if ((com.tencent.mm.model.r.YK() & 0x8000) != 0)
      AppMethodBeat.o(29271);
    while (true)
    {
      return;
      dwX();
      this.yhb.notifyDataSetChanged();
      AppMethodBeat.o(29271);
    }
  }

  public final void Zz()
  {
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    int i = 1;
    AppMethodBeat.i(29287);
    ab.i("MicroMsg.FindMoreFriendsUI", "onNotifyChange(MStorageEx)");
    if (LauncherUI.dxE() == 2)
    {
      paramInt = 0;
      if (this.status != com.tencent.mm.model.r.YD())
      {
        this.status = com.tencent.mm.model.r.YD();
        paramInt = 1;
      }
      if (this.kFU != com.tencent.mm.model.r.YE())
      {
        this.kFU = com.tencent.mm.model.r.YE();
        paramInt = 1;
      }
      if (this.qnE == com.tencent.mm.model.r.YK())
        break label114;
      this.qnE = com.tencent.mm.model.r.YK();
      paramInt = i;
    }
    label114: 
    while (true)
    {
      if (paramInt != 0)
        aMk();
      if ((paramn instanceof com.tencent.mm.storage.al))
        this.yhb.notifyDataSetChanged();
      AppMethodBeat.o(29287);
      return;
    }
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    int i = 1;
    AppMethodBeat.i(29286);
    ab.i("MicroMsg.FindMoreFriendsUI", "onNotifyChange(MStorage)");
    int j;
    if (LauncherUI.dxE() == 2)
    {
      j = 0;
      if (this.status != com.tencent.mm.model.r.YD())
      {
        this.status = com.tencent.mm.model.r.YD();
        j = 1;
      }
      if (this.kFU != com.tencent.mm.model.r.YE())
      {
        this.kFU = com.tencent.mm.model.r.YE();
        j = 1;
      }
      if (this.qnE == com.tencent.mm.model.r.YK())
        break label103;
      this.qnE = com.tencent.mm.model.r.YK();
      j = i;
    }
    label103: 
    while (true)
    {
      if (j != 0)
        aMk();
      AppMethodBeat.o(29286);
      return;
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(29261);
    boolean bool1;
    if ("album_dyna_photo_ui_title".equals(paramPreference.mKey))
    {
      com.tencent.mm.plugin.report.service.g.BN(10);
      aw.ZK();
      this.yhd = ((String)com.tencent.mm.model.c.Ry().get(68377, null));
      paramf = new Intent();
      paramPreference = new com.tencent.mm.modelsns.b(701, 1);
      if (!bo.isNullOrNil(this.yhd))
      {
        bool1 = true;
        paramPreference.cS(bool1);
        paramPreference.tx(this.yhe);
        paramf.putExtra("sns_timeline_NeedFirstLoadint", true);
        paramf.putExtra("is_from_find_more", true);
        if ((bo.isNullOrNil(this.yhd)) && (this.yhe <= 0))
          break label451;
        bool1 = true;
        label142: paramf.putExtra("enter_by_red", bool1);
        aw.ZK();
        paramf.putExtra("is_sns_notify_open", bo.a((Boolean)com.tencent.mm.model.c.Ry().get(68384, null), true));
        paramf.putExtra("sns_unread_count", com.tencent.mm.plugin.sns.b.n.qFz.baS());
        if (!bo.isNullOrNil(this.yhd))
        {
          aw.ZK();
          paramf.putExtra("new_feed_id", bo.bc((String)com.tencent.mm.model.c.Ry().get(68418, null), ""));
          aw.ZK();
          com.tencent.mm.plugin.sns.i.f.k(3, (String)com.tencent.mm.model.c.Ry().get(68418, ""), this.yhe);
        }
        paramPreference.b(paramf, "enter_log");
        paramPreference = new ib();
        com.tencent.mm.sdk.b.a.xxA.m(paramPreference);
        boolean bool2 = true;
        bool1 = true;
        if (!paramPreference.cDa.isResume)
        {
          if (!bo.isNullOrNil(this.yhd))
            bool1 = false;
          bool2 = bool1;
          if (com.tencent.mm.plugin.sns.b.n.qFz != null)
          {
            this.yhe = com.tencent.mm.plugin.sns.b.n.qFz.baS();
            bool2 = bool1;
            if (this.yhe > 0)
              bool2 = false;
          }
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(68377, "");
        }
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(589825, Boolean.FALSE);
        paramf.putExtra("sns_resume_state", bool2);
        com.tencent.mm.bp.d.b(getContext(), "sns", ".ui.SnsTimeLineUI", paramf);
        com.tencent.mm.plugin.report.service.h.pYm.X(10958, "1");
        new com.tencent.mm.sdk.platformtools.ak().postDelayed(new FindMoreFriendsUI.10(this), 500L);
        bool1 = true;
        AppMethodBeat.o(29261);
      }
    }
    while (true)
    {
      return bool1;
      bool1 = false;
      break;
      label451: bool1 = false;
      break label142;
      if ("find_friends_by_near".equals(paramPreference.mKey))
      {
        if (com.tencent.mm.au.b.sO((String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null)))
        {
          if (!com.tencent.mm.pluginsdk.permission.b.o(thisActivity(), "android.permission.ACCESS_COARSE_LOCATION"))
          {
            if (!((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVP, Boolean.FALSE)).booleanValue())
              com.tencent.mm.plugin.account.a.b.a.b(thisActivity(), getString(2131305910, new Object[] { com.tencent.mm.sdk.platformtools.aa.dor() }), 30764, true);
            while (true)
            {
              bool1 = true;
              AppMethodBeat.o(29261);
              break;
              com.tencent.mm.pluginsdk.permission.b.b(getActivity(), "android.permission.ACCESS_COARSE_LOCATION", 66);
            }
          }
        }
        else
        {
          bool1 = com.tencent.mm.pluginsdk.permission.b.a(thisActivity(), "android.permission.ACCESS_COARSE_LOCATION", 66, null, null);
          ab.i("MicroMsg.FindMoreFriendsUI", "summerper checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool1) });
          if (!bool1)
          {
            bool1 = true;
            AppMethodBeat.o(29261);
            continue;
          }
        }
        dwU();
        bool1 = true;
        AppMethodBeat.o(29261);
      }
      else
      {
        if ("find_friends_by_shake".equals(paramPreference.mKey))
        {
          if ((!this.yhk) && (com.tencent.mm.model.r.Zf().booleanValue()))
          {
            paramf = (IconPreference)paramf.aqO("find_friends_by_shake");
            if (paramf != null)
            {
              paramf.NN(8);
              aw.ZK();
              com.tencent.mm.model.c.Ry().set(340231, Boolean.TRUE);
              aw.ZK();
              com.tencent.mm.model.c.Ry().dsb();
              com.tencent.mm.plugin.report.service.h.pYm.a(232L, 4L, 1L, false);
            }
          }
          com.tencent.mm.plugin.report.service.h.pYm.X(10958, "3");
          aw.ZK();
          paramf = bo.bc((String)com.tencent.mm.model.c.Ry().get(ac.a.xMn, null), "");
          aw.ZK();
          if ((bo.a((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xMp, null), false)) && (paramf != null) && (!paramf.equals("")));
          for (paramf = Boolean.TRUE; ; paramf = Boolean.FALSE)
          {
            if (paramf.booleanValue())
              com.tencent.mm.plugin.report.service.h.pYm.e(12653, new Object[] { Integer.valueOf(2), Integer.valueOf(2) });
            com.tencent.mm.sdk.b.a.xxA.m(new oh());
            com.tencent.mm.bp.d.H(getContext(), "shake", ".ui.ShakeReportUI");
            bool1 = true;
            AppMethodBeat.o(29261);
            break;
          }
        }
        if ("find_friends_by_qrcode".equals(paramPreference.mKey))
        {
          com.tencent.mm.x.c.PK().c(ac.a.xVK, ac.a.xVJ);
          if (!com.tencent.mm.r.a.bI(getContext()))
          {
            getContext();
            if (!com.tencent.mm.bg.e.akI());
          }
          else
          {
            bool1 = true;
            AppMethodBeat.o(29261);
            continue;
          }
          com.tencent.mm.plugin.report.service.h.pYm.X(10958, "2");
          paramf = new Intent();
          paramf.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
          com.tencent.mm.plugin.report.service.h.pYm.e(11265, new Object[] { Integer.valueOf(2) });
          com.tencent.mm.bp.d.b(getContext(), "scanner", ".ui.BaseScanUI", paramf);
          bool1 = true;
          AppMethodBeat.o(29261);
        }
        else
        {
          Object localObject1;
          if (paramPreference.mKey.equals("more_tab_game_recommend"))
          {
            com.tencent.mm.plugin.report.service.h.pYm.X(10958, "6");
            com.tencent.mm.plugin.report.service.h.pYm.a(848L, 2L, 1L, false);
            aw.ZK();
            if (!com.tencent.mm.model.c.isSDCardAvailable())
            {
              t.hO(getContext());
              bool1 = true;
              AppMethodBeat.o(29261);
            }
            else
            {
              localObject1 = new Intent();
              ((Intent)localObject1).putExtra("from_find_more_friend", this.yhm);
              ((Intent)localObject1).putExtra("game_report_from_scene", 901);
              if (this.yhm)
              {
                paramPreference = new mz();
                com.tencent.mm.sdk.b.a.xxA.m(paramPreference);
                paramf = (IconPreference)paramf.aqO("more_tab_game_recommend");
                if ((paramPreference.cIX.cIY != null) && (paramf != null))
                  com.tencent.mm.at.o.ahp().b(paramPreference.cIX.cIY, paramf.dAz());
              }
              ab.i("MicroMsg.FindMoreFriendsUI", "start game center index, time : " + System.currentTimeMillis());
              ((Intent)localObject1).putExtra("start_time", System.currentTimeMillis());
              com.tencent.mm.bp.d.b(getContext(), "game", ".ui.GameCenterUI", (Intent)localObject1);
              bool1 = true;
              AppMethodBeat.o(29261);
            }
          }
          else if ("find_friends_by_micromsg".equals(paramPreference.mKey))
          {
            com.tencent.mm.bp.d.b(getContext(), "subapp", ".ui.pluginapp.ContactSearchUI", new Intent());
            bool1 = true;
            AppMethodBeat.o(29261);
          }
          else if ("find_friends_by_mobile".equals(paramPreference.mKey))
          {
            if (l.apS() != l.a.gvz)
            {
              paramf = new Intent(getContext(), BindMContactIntroUI.class);
              paramf.putExtra("key_upload_scene", 6);
              MMWizardActivity.J(getContext(), paramf);
              bool1 = true;
              AppMethodBeat.o(29261);
            }
            else
            {
              startActivity(new Intent(getContext(), MobileFriendUI.class));
              bool1 = true;
              AppMethodBeat.o(29261);
            }
          }
          else if ("find_friends_by_facebook".equals(paramPreference.mKey))
          {
            startActivity(new Intent(getContext(), FacebookFriendUI.class));
            bool1 = true;
            AppMethodBeat.o(29261);
          }
          else if ("settings_mm_card_package".equals(paramPreference.mKey))
          {
            ab.i("MicroMsg.FindMoreFriendsUI", "enter to cardhome");
            paramf = new ik();
            paramf.cDz.context = getContext();
            com.tencent.mm.sdk.b.a.xxA.m(paramf);
            bool1 = true;
            AppMethodBeat.o(29261);
          }
          else
          {
            Object localObject2;
            if (paramPreference.mKey.equals("jd_market_entrance"))
            {
              paramf = null;
              com.tencent.mm.pluginsdk.wallet.i.Lt(9);
              localObject2 = com.tencent.mm.pluginsdk.f.f.vdy;
              if (localObject2 != null)
              {
                localObject1 = com.tencent.mm.pluginsdk.f.f.vdy.cDA();
                com.tencent.mm.plugin.report.service.h.pYm.e(11179, new Object[] { localObject1, ((f.b)localObject2).cDB().cDm(), Integer.valueOf(dwT()) });
                ((f.b)localObject2).cDv();
                ((f.b)localObject2).cDu();
                ((IconPreference)paramPreference).ey("", -1);
                paramf = (com.tencent.mm.ui.base.preference.f)localObject1;
                if (!bo.isNullOrNil((String)localObject1))
                {
                  paramf = new Intent();
                  paramf.putExtra("rawUrl", (String)localObject1);
                  paramf.putExtra("useJs", true);
                  paramf.putExtra("vertical_scroll", true);
                  paramf.putExtra("minimize_secene", 1);
                  paramf.putExtra("KPublisherId", "jd_store");
                  com.tencent.mm.bp.d.b(getContext(), "webview", ".ui.tools.WebViewUI", paramf);
                  paramf = (com.tencent.mm.ui.base.preference.f)localObject1;
                }
              }
              ab.i("MicroMsg.FindMoreFriendsUI", "jump to url: ".concat(String.valueOf(paramf)));
              bool1 = true;
              AppMethodBeat.o(29261);
            }
            else
            {
              int i;
              if ("ip_call_entrance".equals(paramPreference.mKey))
              {
                paramf = (IconPreference)paramf.aqO("ip_call_entrance");
                paramf.NN(8);
                paramf.NM(8);
                paramf.qh(false);
                paramf.NQ(8);
                i = 0;
                aw.ZK();
                paramf = (String)com.tencent.mm.model.c.Ry().get(ac.a.xLD, "");
                aw.ZK();
                if (((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xLE, Boolean.FALSE)).booleanValue() == true)
                {
                  com.tencent.mm.plugin.ipcall.a.e.i.Z(1, -1, -1);
                  aw.ZK();
                  com.tencent.mm.model.c.Ry().set(ac.a.xLE, Boolean.FALSE);
                  i = 1;
                }
                aw.ZK();
                if (((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xLC, Integer.valueOf(0))).intValue() < com.tencent.mm.m.g.Nu().getInt("WCOEntranceRedDot", 0))
                {
                  i = 1;
                  com.tencent.mm.plugin.report.service.h.pYm.e(13254, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1) });
                  aw.ZK();
                  com.tencent.mm.model.c.Ry().set(ac.a.xLC, Integer.valueOf(com.tencent.mm.m.g.Nu().getInt("WCOEntranceRedDot", 0)));
                }
                if (!bo.isNullOrNil(paramf))
                {
                  aw.ZK();
                  com.tencent.mm.model.c.Ry().set(ac.a.xLD, "");
                }
                if (i != 0)
                  com.tencent.mm.sdk.b.a.xxA.m(new to());
                if (com.tencent.mm.r.a.Oo())
                  com.tencent.mm.ui.base.h.a(getContext(), 2131301545, 0, null, null);
                while (true)
                {
                  bool1 = true;
                  AppMethodBeat.o(29261);
                  break;
                  com.tencent.mm.plugin.report.service.h.pYm.e(12061, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
                  com.tencent.mm.bp.d.b(getContext(), "ipcall", ".ui.IPCallAddressUI", new Intent());
                }
              }
              if ("app_brand_entrance".equals(paramPreference.mKey))
              {
                ((com.tencent.mm.plugin.appbrand.service.g)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.g.class)).b(getContext(), 1, false);
                bool1 = true;
                AppMethodBeat.o(29261);
              }
              else
              {
                if ("find_friends_by_search".equals(paramPreference.mKey))
                {
                  if (!com.tencent.mm.plugin.websearch.api.aa.HU(0))
                    ab.e("MicroMsg.FindMoreFriendsUI", "fts h5 template not avail");
                  while (true)
                  {
                    bool1 = true;
                    AppMethodBeat.o(29261);
                    break;
                    paramf = ac.adL("discoverSearchEntry").optString("wording");
                    if (bo.isNullOrNil(paramf))
                    {
                      ab.e("MicroMsg.FindMoreFriendsUI", "empty title");
                    }
                    else
                    {
                      paramPreference = am.cVt();
                      paramPreference.uaS = new am.a();
                      paramPreference.save();
                      ((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.welab.a.a.a.class)).open("labs1de6f3");
                      an.l("", 0, 0, 20);
                      localObject2 = com.tencent.mm.plugin.websearch.api.aa.HP(20);
                      paramPreference = com.tencent.mm.plugin.webview.modeltools.g.cYC().cWl();
                      localObject1 = new HashMap();
                      ((Map)localObject1).put("sessionId", localObject2);
                      ((Map)localObject1).put("inputMarginTop", "32");
                      ((Map)localObject1).put("inputMarginLeftRight", "24");
                      ((Map)localObject1).put("inputHeight", "48");
                      if ((paramPreference != null) && (!paramPreference.isEmpty()))
                        ((Map)localObject1).put("educationTab", Uri.encode(paramPreference));
                      ((Map)localObject1).put("clickType", "15");
                      ((com.tencent.mm.plugin.websearch.api.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.websearch.api.j.class)).b(getContext(), 20, "", (String)localObject2, (Map)localObject1, paramf);
                      ((com.tencent.mm.plugin.boots.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.boots.a.c.class)).rT(com.tencent.mm.plugin.boots.a.b.jJt);
                    }
                  }
                }
                if ("find_friends_by_look".equals(paramPreference.mKey))
                {
                  if (!com.tencent.mm.plugin.websearch.api.aa.HU(1))
                    ab.e("MicroMsg.FindMoreFriendsUI", "fts h5 template not avail");
                  while (true)
                  {
                    bool1 = true;
                    AppMethodBeat.o(29261);
                    break;
                    paramPreference = ac.adL("discoverRecommendEntry").optString("wording");
                    if (bo.isNullOrNil(paramPreference))
                    {
                      ab.e("MicroMsg.FindMoreFriendsUI", "empty query");
                    }
                    else
                    {
                      ab.i("MicroMsg.FindMoreFriendsUI", "look one look clikced");
                      com.tencent.mm.plugin.topstory.ui.c.W(getContext(), 21);
                      ((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.welab.a.a.a.class)).open("labs_browse");
                      paramf = new ll();
                      paramf.cHk.scene = 0;
                      com.tencent.mm.sdk.b.a.xxA.m(paramf);
                      an.bz(21, paramPreference);
                      an.reportIdKey649ForLook(21, 0);
                      if (com.tencent.mm.plugin.websearch.api.aa.HV(1) > com.tencent.mm.plugin.websearch.api.aa.HT(1))
                        an.reportIdKey649ForLook(21, 15);
                      else
                        an.reportIdKey649ForLook(21, 14);
                    }
                  }
                }
                if ("my_life_around".equals(paramPreference.mKey))
                {
                  com.tencent.mm.plugin.report.service.h.pYm.e(17065, new Object[] { Integer.valueOf(1), Long.valueOf(bo.anT()), Integer.valueOf(this.yhx.ordinal()), com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xWd, ""), com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xWc, ""), com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xWb, "0") });
                  if (this.yhx.equals(FindMoreFriendsUI.a.yhU))
                  {
                    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVZ, Boolean.FALSE);
                    this.yhx = FindMoreFriendsUI.a.yhP;
                    paramf = (IconPreference)this.yhb.aqO("my_life_around");
                    paramf.NL(8);
                    paramf.ey("", -1);
                  }
                  bool1 = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVY, Boolean.FALSE)).booleanValue();
                  ((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.welab.a.a.a.class)).open("labs_nearbylife");
                  localObject2 = ((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.welab.a.a.a.class)).agP("labs_nearbylife");
                  i = ((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.welab.a.a.a.class)).agQ("labs_nearbylife");
                  localObject1 = new AppBrandStatObject();
                  ((AppBrandStatObject)localObject1).scene = 1112;
                  paramPreference = null;
                  int j = com.tencent.mm.m.g.Nu().getInt("LifeAppEntranceBringRedDot", 0);
                  ab.d("MicroMsg.FindMoreFriendsUI", "withRedTag: %d.", new Object[] { Integer.valueOf(j) });
                  paramf = paramPreference;
                  if (j != 0)
                  {
                    paramf = paramPreference;
                    if (bool1)
                      paramf = "?hasRedDot=true";
                  }
                  ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(getContext(), (String)localObject2, null, i, 0, paramf, (AppBrandStatObject)localObject1);
                  bool1 = true;
                  AppMethodBeat.o(29261);
                }
                else
                {
                  bool1 = false;
                  AppMethodBeat.o(29261);
                }
              }
            }
          }
        }
      }
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference, View paramView)
  {
    AppMethodBeat.i(29260);
    boolean bool;
    if ((com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) && ("app_brand_entrance".equals(paramPreference.mKey)))
    {
      ((com.tencent.mm.plugin.appbrand.service.g)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.g.class)).b(getContext(), 1, true);
      AppMethodBeat.o(29260);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = super.a(paramf, paramPreference, paramView);
      AppMethodBeat.o(29260);
    }
  }

  protected final void dvY()
  {
    AppMethodBeat.i(29273);
    ab.i("MicroMsg.FindMoreFriendsUI", "on tab create");
    this.yhb = ((com.tencent.mm.ui.base.preference.h)this.yCw);
    this.status = com.tencent.mm.model.r.YD();
    this.qnE = com.tencent.mm.model.r.YK();
    this.kFU = com.tencent.mm.model.r.YE();
    View localView = getView().getRootView().findViewById(2131820634);
    int i = ak.de(getContext());
    int j = ak.J(getContext(), -1);
    FindMoreFriendsUI.5 local5 = new FindMoreFriendsUI.5(this, localView);
    if (j <= 0)
      getView().post(local5);
    while (true)
    {
      ab.i("MicroMsg.FindMoreFriendsUI", "on tab create end");
      AppMethodBeat.o(29273);
      return;
      getView().setPadding(0, i + j, 0, localView.getHeight());
      ab.i("MicroMsg.FindMoreFriendsUI", "[trySetParentViewPadding] actionBarHeight:%s actionBarHeight:%s", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      getView().postDelayed(local5, 100L);
    }
  }

  protected final void dvZ()
  {
    AppMethodBeat.i(29274);
    ab.i("MicroMsg.FindMoreFriendsUI", "on tab resume");
    this.cCt = true;
    dxb();
    com.tencent.mm.pluginsdk.c.a.a(jb.class.getName(), this.vqt);
    com.tencent.mm.pluginsdk.c.a.a(gy.class.getName(), this.yht);
    com.tencent.mm.pluginsdk.c.a.a(qm.class.getName(), this.yhu);
    com.tencent.mm.sdk.b.a.xxA.c(this.yhr);
    com.tencent.mm.sdk.b.a.xxA.c(this.yhq);
    com.tencent.mm.sdk.b.a.xxA.c(this.yhs);
    com.tencent.mm.sdk.b.a.xxA.c(this.qLL);
    com.tencent.mm.sdk.b.a.xxA.c(this.yhv);
    com.tencent.mm.sdk.b.a.xxA.b(this.mJI);
    com.tencent.mm.sdk.b.a.xxA.c(this.yhz);
    com.tencent.mm.bi.d.akR().c(this);
    aw.ZK();
    com.tencent.mm.model.c.XR().a(this);
    aw.ZK();
    com.tencent.mm.model.c.a(this);
    aw.ZK();
    com.tencent.mm.model.c.Ry().a(this);
    if (com.tencent.mm.plugin.sns.b.n.qFB != null)
      com.tencent.mm.plugin.sns.b.n.qFB.a(this);
    View localView = findViewById(2131828206);
    if ((localView != null) && (localView.getVisibility() != 8))
      new com.tencent.mm.sdk.platformtools.ak(Looper.getMainLooper()).post(new FindMoreFriendsUI.16(this, localView));
    if (isAdded())
      com.tencent.mm.blink.b.HQ().o(new FindMoreFriendsUI.17(this));
    ab.i("MicroMsg.FindMoreFriendsUI", "on tab resume end");
    AppMethodBeat.o(29274);
  }

  public final void dwU()
  {
    AppMethodBeat.i(29262);
    com.tencent.mm.plugin.report.service.h.pYm.X(10958, "4");
    aw.ZK();
    if (!bo.e((Boolean)com.tencent.mm.model.c.Ry().get(4103, null)))
    {
      com.tencent.mm.bp.d.H(getContext(), "nearby", ".ui.NearbyFriendsIntroUI");
      AppMethodBeat.o(29262);
    }
    while (true)
    {
      return;
      Object localObject = bp.aap();
      if (localObject == null)
      {
        com.tencent.mm.bp.d.H(getContext(), "nearby", ".ui.NearbyPersonalInfoUI");
        AppMethodBeat.o(29262);
      }
      else
      {
        String str = bo.nullAsNil(((bp)localObject).getProvince());
        int i = bo.a(Integer.valueOf(((bp)localObject).dtS), 0);
        if ((bo.isNullOrNil(str)) || (i == 0))
        {
          com.tencent.mm.bp.d.H(getContext(), "nearby", ".ui.NearbyPersonalInfoUI");
          AppMethodBeat.o(29262);
        }
        else
        {
          aw.ZK();
          localObject = (Boolean)com.tencent.mm.model.c.Ry().get(4104, null);
          if ((localObject == null) || (!((Boolean)localObject).booleanValue()))
          {
            localObject = (LauncherUI)getContext();
            if (localObject != null)
              ((LauncherUI)localObject).yjJ.getMainTabUI().aqG("tab_find_friend");
            com.tencent.mm.bn.a.fy(getContext());
            AppMethodBeat.o(29262);
          }
          else
          {
            dwV();
            AppMethodBeat.o(29262);
          }
        }
      }
    }
  }

  protected final void dwa()
  {
    AppMethodBeat.i(29279);
    ab.i("MicroMsg.FindMoreFriendsUI", "on tab start");
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("lifeappreddot", this.yhy);
    AppMethodBeat.o(29279);
  }

  protected final void dwb()
  {
    AppMethodBeat.i(29280);
    ab.i("MicroMsg.FindMoreFriendsUI", "on tab pause");
    this.cCt = false;
    dxb();
    if (aw.RK())
    {
      com.tencent.mm.pluginsdk.c.a.b(jb.class.getName(), this.vqt);
      com.tencent.mm.pluginsdk.c.a.b(gy.class.getName(), this.yht);
      com.tencent.mm.pluginsdk.c.a.b(qm.class.getName(), this.yhu);
      com.tencent.mm.sdk.b.a.xxA.d(this.yhr);
      com.tencent.mm.sdk.b.a.xxA.d(this.yhq);
      com.tencent.mm.sdk.b.a.xxA.d(this.yhs);
      com.tencent.mm.sdk.b.a.xxA.d(this.qLL);
      com.tencent.mm.sdk.b.a.xxA.d(this.yhv);
      com.tencent.mm.sdk.b.a.xxA.d(this.mJI);
      com.tencent.mm.sdk.b.a.xxA.d(this.yhz);
      com.tencent.mm.bi.d.akR().d(this);
      aw.ZK();
      com.tencent.mm.model.c.XR().b(this);
      aw.ZK();
      com.tencent.mm.model.c.b(this);
      aw.ZK();
      com.tencent.mm.model.c.Ry().b(this);
      if (this.yhf != null)
        com.tencent.mm.at.o.ahk().rZ(this.yhf);
      if (this.yhj != null)
        com.tencent.mm.at.o.ahk().rZ(this.yhj);
    }
    if (com.tencent.mm.plugin.sns.b.n.qFB != null)
      com.tencent.mm.plugin.sns.b.n.qFB.b(this);
    AppMethodBeat.o(29280);
  }

  protected final void dwc()
  {
    AppMethodBeat.i(29281);
    ab.i("MicroMsg.FindMoreFriendsUI", "on tab stop");
    AppMethodBeat.o(29281);
  }

  protected final void dwd()
  {
    AppMethodBeat.i(29282);
    ab.i("MicroMsg.FindMoreFriendsUI", "on tab destroy");
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("lifeappreddot", this.yhy);
    AppMethodBeat.o(29282);
  }

  public final void dwf()
  {
    AppMethodBeat.i(29283);
    ab.i("MicroMsg.FindMoreFriendsUI", "turn to bg");
    AppMethodBeat.o(29283);
  }

  public final void dwg()
  {
    AppMethodBeat.i(29284);
    ab.i("MicroMsg.FindMoreFriendsUI", "turn to fg");
    AppMethodBeat.o(29284);
  }

  public final void dwi()
  {
    AppMethodBeat.i(29285);
    ab.i("MicroMsg.FindMoreFriendsUI", "on tab recreate ui");
    AppMethodBeat.o(29285);
  }

  public final void dxc()
  {
    AppMethodBeat.i(29288);
    ab.v("MicroMsg.FindMoreFriendsUI", "on tab switch in");
    this.cCt = true;
    dxb();
    com.tencent.mm.blink.b.HQ().o(new FindMoreFriendsUI.18(this));
    ac.Ig(20);
    AppMethodBeat.o(29288);
  }

  public final void dxd()
  {
    AppMethodBeat.i(29289);
    ab.v("MicroMsg.FindMoreFriendsUI", "on tab switch out");
    this.cCt = false;
    dxb();
    AppMethodBeat.o(29289);
  }

  public boolean noActionBar()
  {
    return true;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    AppMethodBeat.i(29256);
    super.onActivityCreated(paramBundle);
    ab.i("MicroMsg.FindMoreFriendsUI", "onActivityCreated");
    AppMethodBeat.o(29256);
  }

  public boolean supportNavigationSwipeBack()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI
 * JD-Core Version:    0.6.2
 */