package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView.OnScrollListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.g.a.hq;
import com.tencent.mm.g.b.a.aa;
import com.tencent.mm.g.b.a.y;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.emoji.model.d.a;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch;
import com.tencent.mm.plugin.luckymoney.model.af;
import com.tencent.mm.plugin.luckymoney.model.am;
import com.tencent.mm.plugin.luckymoney.model.ar;
import com.tencent.mm.plugin.luckymoney.model.as;
import com.tencent.mm.plugin.luckymoney.model.w;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.protocal.protobuf.atb;
import com.tencent.mm.protocal.protobuf.atc;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(1)
public class LuckyMoneyDetailUI extends LuckyMoneyBaseUI
{
  private int Lp;
  private View abB;
  private String emo;
  private Dialog gII;
  private boolean hZu;
  private TextView kEq;
  private TextView kGq;
  private d.a kVj;
  private String kWO;
  private EmojiInfo kZa;
  private View kZq;
  private ImageView lBT;
  private TextView nSD;
  private ListView nSL;
  private ImageView nSM;
  private TextView nSN;
  private ImageView nSO;
  private View nSP;
  private View nSQ;
  AbsListView.OnScrollListener nSS;
  private List<w> nSx;
  private SoundPool nTR;
  private com.tencent.mm.plugin.luckymoney.particles.b nVt;
  private int nXi;
  private TextView nsq;
  private LuckyMoneyWishFooter ocC;
  private View ocE;
  private boolean ocG;
  private int ocH;
  private String ocI;
  private String ocJ;
  private String ocK;
  private String ocL;
  private Map<String, Integer> ocN;
  private i ocO;
  private String ocP;
  private boolean ocQ;
  private TextView odA;
  private TextView odB;
  private ViewGroup odC;
  private RelativeLayout odD;
  private int[] odE;
  private ViewGroup odF;
  private RelativeLayout odG;
  private BaseEmojiView odH;
  private TextView odI;
  private LinearLayout odJ;
  private MMAnimateView odK;
  private LinearLayout odL;
  private LinearLayout odM;
  private RelativeLayout odN;
  private LinearLayout odO;
  private BaseEmojiView odP;
  private RelativeLayout odQ;
  private ImageView odR;
  private a odS;
  private View odT;
  private ImageView odU;
  private FrameLayout odV;
  private boolean odW;
  private int odX;
  private ChatFooterPanel odY;
  private EmojiInfo odZ;
  private CdnImageView odq;
  private ImageView odr;
  private View ods;
  private ImageView odt;
  private TextView odu;
  private ViewGroup odv;
  private ViewGroup odw;
  private View odx;
  private View ody;
  private View odz;
  private ViewGroup oea;
  public LuckyMoneyEmojiSwitch oeb;
  private aa oec;
  private y oed;
  private com.tencent.mm.g.b.a.z oee;
  private int oef;
  private boolean oeg;
  private Bitmap oeh;
  private Bitmap oei;
  private Bitmap oej;
  private Bitmap oek;
  private Bitmap oel;
  private Bitmap oem;
  private Bitmap oen;
  private Bitmap oeo;
  private boolean oep;
  private int oeq;
  private View oer;
  private long oes;
  private View.OnClickListener oet;
  private int oeu;
  private f oev;
  private int oew;
  private int oex;
  private final int oey;
  private final int oez;

  public LuckyMoneyDetailUI()
  {
    AppMethodBeat.i(42683);
    this.Lp = 0;
    this.ocG = true;
    this.hZu = false;
    this.nXi = -1;
    this.nSx = new LinkedList();
    this.ocN = new HashMap();
    this.ocP = "";
    this.odW = false;
    this.ocQ = false;
    this.oef = 0;
    this.oeg = false;
    this.nSS = new LuckyMoneyDetailUI.1(this);
    this.nVt = new LuckyMoneyDetailUI.12(this);
    this.oep = false;
    this.kVj = new LuckyMoneyDetailUI.22(this);
    this.oes = 0L;
    this.oet = new LuckyMoneyDetailUI.13(this);
    this.oeu = 3;
    this.oev = new LuckyMoneyDetailUI.15(this);
    this.oew = 0;
    this.oex = 0;
    this.oey = 750;
    this.oez = 240;
    AppMethodBeat.o(42683);
  }

  private void a(final com.tencent.mm.plugin.luckymoney.model.k paramk)
  {
    AppMethodBeat.i(42700);
    if (paramk == null)
      AppMethodBeat.o(42700);
    while (true)
    {
      return;
      boolean bool = e(paramk);
      label66: label100: label110: int i;
      label160: int j;
      label194: label328: label466: label495: Object localObject2;
      label618: label878: Object localObject3;
      if (f(paramk))
        if (bMw())
          if (bool)
          {
            xY(1);
            if (!bMw())
              break label1906;
            this.odG.setVisibility(0);
            iK(true);
            if ((!bo.gW(this.oeb.nXr, 0)) && (e(paramk)) && (this.oeg))
              break label1918;
            xZ(0);
            if (paramk.nXa != 1)
              break label2029;
            bool = true;
            this.ocG = bool;
            if (paramk != null)
            {
              if (((paramk.cRU != 3) && (paramk.cRU != 2)) || (paramk.nWZ != 1) || (this.ocG) || (paramk.nXc != 1))
                break label2034;
              i = 1;
              if ((paramk.nXd == null) || (paramk.nXd.erD != 1) || (bo.isNullOrNil(paramk.nXd.nWy)))
                break label2039;
              j = 1;
              this.odA = ((TextView)this.kZq.findViewById(2131825438));
              if ((i == 0) && (j == 0))
                break label2045;
              this.odA.setOnClickListener(new LuckyMoneyDetailUI.24(this, paramk));
              if (j != 0)
              {
                this.ocL = paramk.nXd.nWy;
                this.odA.setText(paramk.nXd.nWz);
              }
              com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(xW(paramk.nXi)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2) });
              this.odA.setVisibility(0);
              this.nXi = paramk.nXi;
              this.odB = ((TextView)this.kZq.findViewById(2131825439));
              this.odB.setVisibility(8);
              if (!this.ocQ)
              {
                this.nSL.addFooterView(this.kZq);
                this.ocQ = true;
              }
            }
            if (this.Lp == 0)
            {
              this.ocJ = paramk.nWX;
              localObject1 = this.ocJ;
              if ((paramk == null) || (paramk.cRT != 0) || (paramk.nXj == null) || (paramk.nXj.size() <= 0) || (!((w)paramk.nXj.get(0)).nWX.equals(localObject1)) || (paramk.nWY == 1))
                break label2057;
              i = 1;
              if (i == 0)
                break label2062;
              this.ocO.nSz = false;
              this.odv.setVisibility(0);
              this.odw.setVisibility(8);
              this.ocO.nSA = paramk.nXi;
              if (paramk != null)
              {
                localObject1 = this.mController.ylL;
                if (paramk.nXi != 2)
                  break label2153;
                this.nSM.setImageResource(2130839243);
                if (paramk.resourceId == 0)
                  break label2135;
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyDetailUI", "busi logo load from file:" + paramk.resourceId);
                localObject2 = new hq();
                ((hq)localObject2).cCx.cCz = paramk.resourceId;
                ((hq)localObject2).callback = new LuckyMoneyDetailUI.20(this, (hq)localObject2, paramk);
                com.tencent.mm.sdk.b.a.xxA.a((com.tencent.mm.sdk.b.b)localObject2, Looper.myLooper());
                localObject2 = getString(2131301215, new Object[] { paramk.nWQ });
                i = ((WindowManager)getSystemService("window")).getDefaultDisplay().getWidth();
                j = BackwardSupportUtil.b.b(this.mController.ylL, 92.0F);
                this.nSN.setMaxWidth(i - j);
                x.a((Context)localObject1, this.nSN, (String)localObject2);
                x.a((Context)localObject1, this.nsq, paramk.nSd);
                if (paramk.cRT != 1)
                  break label2171;
                this.nSO.setVisibility(0);
                this.nSO.setImageResource(2130839302);
                label733: if (!bo.isNullOrNil(paramk.nXg))
                {
                  x.l(this.odr, paramk.nXg);
                  this.odr.setScaleType(ImageView.ScaleType.FIT_XY);
                }
                if (bo.isNullOrNil(paramk.nXh))
                  break label2249;
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyDetailUI", "hy: has url : %s", new Object[] { paramk.nXh });
                this.odD.setVisibility(4);
                x.h(this.lBT, paramk.nXh);
                al.n(new LuckyMoneyDetailUI.21(this), 500L);
                label827: if ((paramk.cRV != 2) || (this.ocH == 3))
                  break label2270;
                this.nSD.setText(com.tencent.mm.wallet_core.ui.e.F(paramk.cSh / 100.0D));
                this.ocO.nSz = false;
                this.nSP.setVisibility(0);
                if (bo.isNullOrNil(paramk.nUj))
                  break label2323;
                this.nSQ.setVisibility(0);
                this.kGq.setText(paramk.nUj);
                if (paramk.nUh != 1)
                  break label2294;
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyDetailUI", "changeIconUrl: %s", new Object[] { paramk.nXn });
                if (bo.isNullOrNil(paramk.nXn))
                  break label2282;
                this.odq.setUrl(paramk.nXn);
                this.odq.setVisibility(0);
                label964: this.kGq.setOnClickListener(new LuckyMoneyDetailUI.23(this, paramk));
                label980: if (bo.isNullOrNil(paramk.nXb))
                  break label2344;
                this.kEq.setText(paramk.nXb);
                this.odw.setVisibility(0);
                if ((f(paramk)) && (!e(paramk)))
                {
                  this.odx.setVisibility(8);
                  this.ody.setVisibility(8);
                  this.odz.setVisibility(8);
                }
              }
              label1051: if (paramk != null)
              {
                localObject3 = paramk.nXe;
                if ((localObject3 != null) && (((List)localObject3).size() > 0))
                {
                  View localView1 = this.abB.findViewById(2131825456);
                  View localView2 = this.abB.findViewById(2131825459);
                  localObject2 = this.abB.findViewById(2131825462);
                  ViewGroup localViewGroup1 = (ViewGroup)this.abB.findViewById(2131825457);
                  localObject1 = (ViewGroup)this.abB.findViewById(2131825460);
                  ViewGroup localViewGroup2 = (ViewGroup)this.abB.findViewById(2131825463);
                  View localView3 = this.abB.findViewById(2131825458);
                  View localView4 = this.abB.findViewById(2131825461);
                  h.c localc = new h.c();
                  localc.textColor = getResources().getColor(2131690234);
                  if (((List)localObject3).size() > 0)
                  {
                    h.a(this, localViewGroup1, (as)((List)localObject3).get(0), localc);
                    localView1.setVisibility(0);
                  }
                  if (((List)localObject3).size() > 1)
                  {
                    h.a(this, (ViewGroup)localObject1, (as)((List)localObject3).get(1), localc);
                    localView2.setVisibility(0);
                  }
                  if (((List)localObject3).size() > 2)
                  {
                    h.a(this, localViewGroup2, (as)((List)localObject3).get(2), localc);
                    ((View)localObject2).setVisibility(0);
                  }
                  if ((localView1.getVisibility() == 0) && ((localView2.getVisibility() == 0) || (((View)localObject2).getVisibility() == 0)))
                    localView3.setVisibility(0);
                  if ((localView2.getVisibility() == 0) && (((View)localObject2).getVisibility() == 0))
                    localView4.setVisibility(0);
                  if ((localView1.getVisibility() == 0) || (localView2.getVisibility() == 0) || (((View)localObject2).getVisibility() == 0))
                  {
                    this.ocE.requestLayout();
                    this.ocE.setVisibility(0);
                  }
                }
                this.odC = ((ViewGroup)this.kZq.findViewById(2131825440));
                localObject1 = new h.c();
                ((h.c)localObject1).textColor = getResources().getColor(2131690155);
                ((h.c)localObject1).textSize = getResources().getDimensionPixelSize(2131427762);
                h.a(this, this.odC, paramk.nXf, (h.c)localObject1);
                localObject2 = new h.c();
                ((h.c)localObject2).textColor = Color.parseColor("#0C4F8E");
                ((h.c)localObject2).textSize = getResources().getDimensionPixelSize(2131427762);
                if (paramk.nXo != null)
                {
                  localObject1 = com.tencent.mm.plugin.luckymoney.model.at.Ql(paramk.nXo);
                  if ((localObject1 != null) && (((com.tencent.mm.plugin.luckymoney.model.at)localObject1).nZp != null))
                  {
                    ((h.c)localObject2).ogN = ((com.tencent.mm.plugin.luckymoney.model.at)localObject1).nWu;
                    h.a(this, this.odC, ((com.tencent.mm.plugin.luckymoney.model.at)localObject1).nZp, (h.c)localObject2);
                    localObject3 = com.tencent.mm.plugin.report.service.h.pYm;
                    localObject2 = ((com.tencent.mm.plugin.luckymoney.model.at)localObject1).nZp.content;
                    if (((com.tencent.mm.plugin.luckymoney.model.at)localObject1).nWu == null)
                      break label2364;
                  }
                }
              }
            }
          }
      label2057: label2062: label2323: label2344: label2364: for (Object localObject1 = ((com.tencent.mm.plugin.luckymoney.model.at)localObject1).nWu.wwP; ; localObject1 = "")
      {
        ((com.tencent.mm.plugin.report.service.h)localObject3).e(16589, new Object[] { Integer.valueOf(1), localObject2, localObject1 });
        if (!this.oep)
        {
          this.oep = true;
          this.kZq.post(new LuckyMoneyDetailUI.25(this));
        }
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.LuckyMoneyDetailUI", "adjust footer");
        this.kZq.post(new LuckyMoneyDetailUI.26(this));
        com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(xW(paramk.nXi)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
        localObject2 = paramk.nXj;
        if (localObject2 == null)
          break label2413;
        for (i = 0; i < ((List)localObject2).size(); i++)
        {
          localObject1 = (w)((List)localObject2).get(i);
          if (!this.ocN.containsKey(((w)localObject1).nWX))
          {
            this.nSx.add(((List)localObject2).get(i));
            this.ocN.put(((w)localObject1).nWX, Integer.valueOf(1));
          }
        }
        xY(3);
        break;
        if (bool)
        {
          xY(2);
          break;
        }
        xY(4);
        break;
        if (bool)
        {
          if (bMw())
          {
            xY(1);
            break;
          }
          xY(2);
          break;
        }
        if (bMw())
        {
          xY(3);
          break;
        }
        xY(4);
        break;
        label1906: this.odG.setVisibility(8);
        break label66;
        label1918: this.odM.setOnClickListener(this.oet);
        this.odM.setTag("nodelete");
        this.odR.setOnClickListener(this.oet);
        this.odU.setOnClickListener(this.oet);
        this.odQ.setOnClickListener(new LuckyMoneyDetailUI.10(this));
        this.odP.setOnClickListener(this.oet);
        localObject1 = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xPY, "");
        xZ(1);
        if (bo.isNullOrNil((String)localObject1))
          break label100;
        aP(2, (String)localObject1);
        break label100;
        label2029: bool = false;
        break label110;
        label2034: i = 0;
        break label160;
        label2039: j = 0;
        break label194;
        label2045: this.odA.setVisibility(8);
        break label328;
        i = 0;
        break label466;
        this.odv.setVisibility(8);
        this.odw.setVisibility(0);
        if ((f(paramk)) && (!e(paramk)))
        {
          this.odx.setVisibility(8);
          this.ody.setVisibility(8);
          this.odz.setVisibility(8);
        }
        this.ocO.nSy = this.ocJ;
        break label495;
        label2135: x.b(this.nSM, paramk.nWR, paramk.nXl);
        break label618;
        label2153: x.b(this.nSM, paramk.nWR, paramk.nXl);
        break label618;
        label2171: if (paramk.cRT == 2)
        {
          if (!t.mY(paramk.nXl))
          {
            localObject1 = new com.tencent.mm.ah.h();
            ((com.tencent.mm.ah.h)localObject1).username = paramk.nXl;
            o.act().b((com.tencent.mm.ah.h)localObject1);
          }
          this.nSO.setVisibility(0);
          this.nSO.setImageResource(2130839290);
          break label733;
        }
        this.nSO.setVisibility(8);
        break label733;
        label2249: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyDetailUI", "hy: no bg. set bg area to gone");
        this.odD.setVisibility(8);
        break label827;
        label2270: this.nSP.setVisibility(8);
        break label878;
        label2282: this.odq.setVisibility(8);
        break label964;
        label2294: com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.LuckyMoneyDetailUI", "detail.jumpChange is false");
        this.kGq.setTextColor(getResources().getColor(2131690232));
        break label980;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.LuckyMoneyDetailUI", "detail.changeWording is empty");
        this.nSQ.setVisibility(8);
        break label980;
        this.kEq.setText(null);
        this.odw.setVisibility(8);
        break label1051;
      }
      this.Lp += ((List)localObject2).size();
      this.hZu = false;
      if (this.odv.getVisibility() != 0)
        this.ocO.ck(this.nSx);
      label2413: if ((paramk.cRT == 2) && (!bo.isNullOrNil(paramk.nWP)))
      {
        this.nTR = new SoundPool(2, 3, 0);
        this.odE = new int[2];
      }
      try
      {
        this.odE[0] = this.nTR.load(getResources().getAssets().openFd("most_lucky.m4a"), 0);
        this.odE[1] = this.nTR.load(getResources().getAssets().openFd("whistle.m4a"), 0);
        this.nTR.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener()
        {
          public final void onLoadComplete(SoundPool paramAnonymousSoundPool, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            AppMethodBeat.i(42666);
            if (paramAnonymousInt2 == 0)
              if (paramAnonymousInt1 == LuckyMoneyDetailUI.I(LuckyMoneyDetailUI.this)[0])
              {
                paramAnonymousSoundPool.play(paramAnonymousInt1, 1.0F, 1.0F, 0, 0, 1.0F);
                AppMethodBeat.o(42666);
              }
            while (true)
            {
              return;
              if ((paramAnonymousInt1 == LuckyMoneyDetailUI.I(LuckyMoneyDetailUI.this)[1]) && (paramk.cSh >= 19000L))
                paramAnonymousSoundPool.play(paramAnonymousInt1, 1.0F, 1.0F, 0, 0, 1.0F);
              AppMethodBeat.o(42666);
            }
          }
        });
        this.abB.postDelayed(new LuckyMoneyDetailUI.18(this), 300L);
        localObject1 = new com.tencent.mm.plugin.wallet_core.model.ab();
        ((com.tencent.mm.plugin.wallet_core.model.ab)localObject1).field_mNativeUrl = this.ocK;
        ((com.tencent.mm.plugin.wallet_core.model.ab)localObject1).field_hbType = paramk.cRT;
        ((com.tencent.mm.plugin.wallet_core.model.ab)localObject1).field_receiveAmount = paramk.cSh;
        ((com.tencent.mm.plugin.wallet_core.model.ab)localObject1).field_receiveTime = System.currentTimeMillis();
        ((com.tencent.mm.plugin.wallet_core.model.ab)localObject1).field_hbStatus = paramk.cRU;
        ((com.tencent.mm.plugin.wallet_core.model.ab)localObject1).field_receiveStatus = paramk.cRV;
        if (((com.tencent.mm.plugin.wallet_core.model.ab)localObject1).field_receiveAmount > 0L)
          r.cPF().a((com.tencent.mm.plugin.wallet_core.model.ab)localObject1);
        if (paramk.nXo != null)
        {
          localObject2 = com.tencent.mm.plugin.luckymoney.model.at.Ql(paramk.nXo);
          if ((localObject2 != null) && (((com.tencent.mm.plugin.luckymoney.model.at)localObject2).nWu != null))
          {
            localObject3 = (ImageView)findViewById(2131825492);
            localObject1 = (ImageView)findViewById(2131825493);
            this.abB.post(new LuckyMoneyDetailUI.19(this));
            ((com.tencent.mm.plugin.luckymoney.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.luckymoney.a.a.class)).b((ImageView)localObject3, ((com.tencent.mm.plugin.luckymoney.model.at)localObject2).nWu);
            ((ImageView)localObject3).setVisibility(0);
            ((ImageView)localObject1).setVisibility(0);
            if (!this.odW)
            {
              this.odW = true;
              if (((com.tencent.mm.plugin.luckymoney.model.at)localObject2).nWu.wwQ == null)
                break label2870;
              localObject1 = ((com.tencent.mm.plugin.luckymoney.model.at)localObject2).nWu.wwQ.wwX;
              paramk = paramk.nXl;
              com.tencent.mm.plugin.report.service.h.pYm.e(16598, new Object[] { Integer.valueOf(3), ((com.tencent.mm.plugin.luckymoney.model.at)localObject2).nWu.wwP, localObject1, paramk });
            }
          }
        }
        if ((this.gII != null) && (this.gII.isShowing()))
          this.gII.hide();
        AppMethodBeat.o(42700);
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.LuckyMoneyDetailUI", "load lucky money voice fail " + localIOException.getMessage());
          continue;
          label2870: String str = "";
        }
      }
    }
  }

  private void aP(int paramInt, String paramString)
  {
    AppMethodBeat.i(42702);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(42702);
      while (true)
      {
        return;
        this.odL.setVisibility(8);
        AppMethodBeat.o(42702);
        continue;
        this.odL.setVisibility(0);
        this.odM.setVisibility(0);
        this.odN.setVisibility(8);
        this.odO.setVisibility(8);
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xPY, "");
        AppMethodBeat.o(42702);
        continue;
        if (bo.isNullOrNil(paramString))
          break;
        paramString = j.getEmojiStorageMgr().xYn.aqi(paramString);
        if (paramString != null)
          break label154;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyDetailUI", "exchangeThxEmojiState() temp == null");
        AppMethodBeat.o(42702);
      }
      label154: this.odZ = paramString;
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xPY, this.odZ.Aq());
      this.odP.setEmojiInfo(this.odZ);
      this.odL.setVisibility(0);
      this.odM.setVisibility(8);
      this.odN.setVisibility(0);
      this.odO.setVisibility(8);
    }
  }

  private void bMt()
  {
    AppMethodBeat.i(42703);
    if ((this.ocC != null) && (this.ocC.getVisibility() != 8))
      this.ocC.setVisibility(8);
    AppMethodBeat.o(42703);
  }

  private void bMv()
  {
    AppMethodBeat.i(42690);
    ((com.tencent.mm.pluginsdk.i)com.tencent.mm.kernel.g.K(com.tencent.mm.pluginsdk.i.class)).a(this, this.emo, this.odZ.Aq(), getString(2131301189), new LuckyMoneyDetailUI.9(this));
    AppMethodBeat.o(42690);
  }

  private boolean bMw()
  {
    boolean bool = true;
    AppMethodBeat.i(42699);
    if ((!bo.isNullOrNil(this.kWO)) && ((bo.gW(this.oeb.nXp, 1)) || (bo.gW(this.oeb.nXq, 1))))
      AppMethodBeat.o(42699);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(42699);
    }
  }

  private boolean e(com.tencent.mm.plugin.luckymoney.model.k paramk)
  {
    if ((paramk.cRV == 2) && (this.ocH != 3));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean f(com.tencent.mm.plugin.luckymoney.model.k paramk)
  {
    boolean bool = true;
    if (paramk.nWZ == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  private void iK(boolean paramBoolean)
  {
    AppMethodBeat.i(42696);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyDetailUI", "showEmoji() circle:%s", new Object[] { Boolean.TRUE });
    this.odI.setVisibility(8);
    this.oex = 1;
    if (paramBoolean)
    {
      this.oeu = 3;
      this.kZa = j.getEmojiStorageMgr().xYn.aqi(this.kWO);
      if (this.kZa == null)
        break label187;
      if ((com.tencent.mm.vfs.e.asZ(this.kZa.dve()) <= 0L) && (!this.kZa.xy()) && (!this.kZa.duS()))
        break label220;
      this.odH.setVisibility(0);
      z(this.kZa);
      AppMethodBeat.o(42696);
    }
    while (true)
    {
      return;
      this.oeu -= 1;
      if (this.oeu != 0)
        break;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyDetailUI", "showEmoji() circle fail!");
      this.odJ.setVisibility(8);
      this.odI.setVisibility(0);
      this.oex = 2;
      AppMethodBeat.o(42696);
      continue;
      label187: this.kZa = new EmojiInfo();
      this.kZa.field_md5 = this.kWO;
      this.kZa.field_type = this.odX;
      label220: if (paramBoolean)
      {
        this.odH.setVisibility(8);
        this.odJ.setVisibility(0);
        this.odK.setImageResource(2131231555);
        j.bkh().kVj = this.kVj;
      }
      j.bkh().s(this.kZa);
      com.tencent.mm.kernel.g.RO().eJo.a(697, this.oev);
      AppMethodBeat.o(42696);
    }
  }

  private static int xW(int paramInt)
  {
    if (paramInt == 2);
    for (paramInt = 13; ; paramInt = 7)
      return paramInt;
  }

  private void xY(int paramInt)
  {
    AppMethodBeat.i(42698);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.odr.getLayoutParams();
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      this.oew = localLayoutParams.topMargin;
      this.odr.setLayoutParams(localLayoutParams);
      this.odr.requestLayout();
      AppMethodBeat.o(42698);
      return;
      localLayoutParams.topMargin = (-BackwardSupportUtil.b.b(this.mController.ylL, 80.0F));
      continue;
      localLayoutParams.topMargin = (-BackwardSupportUtil.b.b(this.mController.ylL, 238.0F));
      continue;
      localLayoutParams.topMargin = (-BackwardSupportUtil.b.b(this.mController.ylL, 204.0F));
      continue;
      localLayoutParams.topMargin = (-BackwardSupportUtil.b.b(this.mController.ylL, 363.0F));
    }
  }

  private void xZ(int paramInt)
  {
    AppMethodBeat.i(42701);
    aP(paramInt, "");
    AppMethodBeat.o(42701);
  }

  private void z(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(42697);
    this.oex = 3;
    this.odH.setEmojiInfo(paramEmojiInfo);
    this.oec = new aa();
    this.oec.cVT = 11L;
    this.oec.ajK();
    AppMethodBeat.o(42697);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(42693);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyDetailUI", "onSceneEnd() errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString + " netsceneType:" + paramm.getType());
    if ((paramm instanceof af))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramm = (af)paramm;
        paramString = paramm.nYn;
        this.ocP = paramm.nYz;
        this.kWO = paramm.nYA;
        this.odX = paramm.nYB;
        this.oeb = paramm.nYC;
        a(paramString);
        AppMethodBeat.o(42693);
        bool = true;
      }
    while (true)
    {
      return bool;
      com.tencent.mm.ui.base.h.bQ(this, paramString);
      AppMethodBeat.o(42693);
      bool = true;
      continue;
      if ((paramm instanceof am))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.ocO.nSz = false;
          bMt();
          paramString = (am)paramm;
          if (this.nSx != null);
          for (paramInt1 = 0; ; paramInt1++)
            if (paramInt1 < this.nSx.size())
            {
              paramm = (w)this.nSx.get(paramInt1);
              if (paramm.nWX.equalsIgnoreCase(paramString.nWX))
              {
                paramm.nYb = paramString.nSd;
                this.ocO.notifyDataSetChanged();
              }
            }
            else
            {
              if (this.odv.getVisibility() == 0)
                this.odv.setVisibility(8);
              this.ocO.ck(this.nSx);
              AppMethodBeat.o(42693);
              bool = true;
              break;
            }
        }
        com.tencent.mm.ui.base.h.bQ(this, paramString);
        AppMethodBeat.o(42693);
        bool = true;
      }
      else if ((paramm instanceof ar))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          com.tencent.mm.ui.widget.snackbar.b.i(this, getString(2131300520));
          AppMethodBeat.o(42693);
          bool = true;
        }
        else
        {
          com.tencent.mm.ui.base.h.bQ(this, paramString);
          AppMethodBeat.o(42693);
          bool = true;
        }
      }
      else
      {
        AppMethodBeat.o(42693);
      }
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(42692);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (this.ocC.getVisibility() == 0))
    {
      this.ocC.setVisibility(8);
      bool = true;
      AppMethodBeat.o(42692);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(42692);
    }
  }

  public boolean enableActivityAnimation()
  {
    return false;
  }

  public void finish()
  {
    AppMethodBeat.i(42695);
    if (getIntent().hasExtra("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)getIntent().getParcelableExtra("key_realname_guide_helper");
      Bundle localBundle = new Bundle();
      localBundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyDetailUI");
      localBundle.putString("realname_verify_process_jump_plugin", "luckymoney");
      boolean bool = localRealnameGuideHelper.b(this, localBundle, new LuckyMoneyDetailUI.14(this));
      getIntent().removeExtra("key_realname_guide_helper");
      if (!bool)
        super.finish();
    }
    while (true)
    {
      overridePendingTransition(2131034261, 2131034266);
      AppMethodBeat.o(42695);
      return;
      super.finish();
    }
  }

  public final int getLayoutId()
  {
    return 2130969976;
  }

  public final void initView()
  {
    AppMethodBeat.i(42688);
    setMMTitle("");
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(42678);
        LuckyMoneyDetailUI.this.finish();
        AppMethodBeat.o(42678);
        return true;
      }
    });
    this.nSL = ((ListView)findViewById(2131825494));
    this.ocO = new i(this.mController.ylL);
    this.abB = LayoutInflater.from(this).inflate(2130969975, null);
    this.nSL.addHeaderView(this.abB);
    this.nSL.setAdapter(this.ocO);
    this.abB.setOnClickListener(new LuckyMoneyDetailUI.29(this));
    this.nSL.setOnScrollListener(this.nSS);
    this.nSL.setOnItemClickListener(new LuckyMoneyDetailUI.30(this));
    this.kZq = LayoutInflater.from(this).inflate(2130969973, null);
    this.nSM = ((ImageView)this.abB.findViewById(2131825442));
    this.nSN = ((TextView)this.abB.findViewById(2131825444));
    this.nSO = ((ImageView)this.abB.findViewById(2131825445));
    this.nsq = ((TextView)this.abB.findViewById(2131825446));
    this.odG = ((RelativeLayout)findViewById(2131825469));
    this.odH = ((BaseEmojiView)findViewById(2131825470));
    this.odI = ((TextView)findViewById(2131825471));
    this.odJ = ((LinearLayout)findViewById(2131825472));
    this.odK = ((MMAnimateView)findViewById(2131825473));
    this.nSP = this.abB.findViewById(2131825447);
    this.nSD = ((TextView)this.abB.findViewById(2131825448));
    this.nSQ = this.abB.findViewById(2131825450);
    this.kGq = ((TextView)this.abB.findViewById(2131825452));
    this.odq = ((CdnImageView)this.abB.findViewById(2131825451));
    this.kEq = ((TextView)this.abB.findViewById(2131825464));
    this.odr = ((ImageView)this.abB.findViewById(2131825441));
    this.ocE = this.abB.findViewById(2131825455);
    this.ods = this.abB.findViewById(2131825453);
    this.odt = ((ImageView)this.abB.findViewById(2131825454));
    this.odL = ((LinearLayout)findViewById(2131825475));
    this.odM = ((LinearLayout)findViewById(2131825476));
    this.odN = ((RelativeLayout)findViewById(2131825479));
    this.odO = ((LinearLayout)findViewById(2131825484));
    this.odP = ((BaseEmojiView)findViewById(2131825480));
    this.odQ = ((RelativeLayout)findViewById(2131825483));
    this.odR = ((ImageView)findViewById(2131825482));
    this.odu = ((TextView)this.abB.findViewById(2131825466));
    this.odv = ((ViewGroup)this.abB.findViewById(2131825489));
    this.odw = ((ViewGroup)this.abB.findViewById(2131825485));
    this.odx = findViewById(2131825487);
    this.ody = findViewById(2131825486);
    this.odz = findViewById(2131825488);
    this.odD = ((RelativeLayout)this.abB.findViewById(2131825453));
    this.lBT = ((ImageView)this.abB.findViewById(2131825454));
    this.ocC = ((LuckyMoneyWishFooter)findViewById(2131825495));
    this.oer = findViewById(2131825491);
    this.odF = ((ViewGroup)findViewById(2131825496));
    this.odU = ((ImageView)findViewById(2131825481));
    this.odV = ((FrameLayout)findViewById(2131825490));
    this.odI.setOnClickListener(new LuckyMoneyDetailUI.31(this));
    this.odS = new a(this);
    this.odT = getLayoutInflater().inflate(2130969978, null);
    this.odS.setContentView(this.odT, new ViewGroup.LayoutParams(-1, -1));
    this.odT.findViewById(2131825497).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(42682);
        LuckyMoneyDetailUI.s(LuckyMoneyDetailUI.this);
        AppMethodBeat.o(42682);
      }
    });
    this.odS.obT = new LuckyMoneyDetailUI.2(this);
    this.oea = ((ViewGroup)this.odT.findViewById(2131825499));
    this.odY = com.tencent.mm.pluginsdk.ui.chat.e.vom.dF(this.mController.ylL);
    com.tencent.mm.plugin.luckymoney.ui.a.a.a(this.odY);
    this.odq.setUseSdcardCache(true);
    this.ocC.a(new LuckyMoneyDetailUI.3(this));
    this.ocC.setOnWishSendImp(new LuckyMoneyWishFooter.b()
    {
      public final void Qm(String paramAnonymousString)
      {
        AppMethodBeat.i(42649);
        if ((!bo.isNullOrNil(paramAnonymousString)) && (!bo.isNullOrNil(LuckyMoneyDetailUI.u(LuckyMoneyDetailUI.this))))
        {
          paramAnonymousString = new am(LuckyMoneyDetailUI.v(LuckyMoneyDetailUI.this), paramAnonymousString, LuckyMoneyDetailUI.u(LuckyMoneyDetailUI.this), "v1.0");
          LuckyMoneyDetailUI.this.b(paramAnonymousString, false);
          LuckyMoneyDetailUI.r(LuckyMoneyDetailUI.this);
        }
        AppMethodBeat.o(42649);
      }
    });
    this.ocC.post(new LuckyMoneyDetailUI.5(this));
    this.ocC.setOnkbdStateListener(new LuckyMoneyDetailUI.6(this));
    this.ocO.ohU = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(42652);
        LuckyMoneyDetailUI.t(LuckyMoneyDetailUI.this).setVisibility(0);
        AppMethodBeat.o(42652);
      }
    };
    this.ocC.setMaxLength(25);
    this.odu.setOnClickListener(new LuckyMoneyDetailUI.8(this));
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.LuckyMoneyDetailUI", "after initview");
    AppMethodBeat.o(42688);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(42694);
    switch (paramInt1)
    {
    default:
    case 1:
    case 1111:
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(42694);
      return;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        String str = paramIntent.getStringExtra("Select_Conv_User");
        if (!bo.isNullOrNil(str))
          if ((this.ocL != null) && (this.ocL.startsWith("wxpay://c2cbizmessagehandler/hongbao/festivalhongbao")))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyDetailUI", "Not expected branch since 2015 fesitval");
          }
          else
          {
            n(new ar(str.replaceAll(",", "|"), this.ocI, "v1.0"));
            continue;
            if (paramInt2 == -1)
            {
              str = "";
              if (paramIntent != null)
                str = paramIntent.getStringExtra("gif_md5");
              if (!bo.isNullOrNil(str))
              {
                aP(2, str);
                bMv();
              }
              else
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyDetailUI", "md5 == null go emoji capture failed!");
              }
            }
            else
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyDetailUI", "go emoji capture failed!");
            }
          }
      }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(42689);
    super.onBackPressed();
    AppMethodBeat.o(42689);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42684);
    super.onCreate(paramBundle);
    getWindow().setBackgroundDrawableResource(2131690691);
    int i;
    if (getIntent().getBooleanExtra("key_anim_slide", false))
      i = 2131034265;
    while (true)
    {
      overridePendingTransition(i, 0);
      xE(getResources().getColor(2131690247));
      dyb();
      initView();
      this.oeg = getIntent().getBooleanExtra("key_lucky_money_can_received", false);
      this.emo = getIntent().getStringExtra("key_username");
      this.ocI = getIntent().getStringExtra("key_sendid");
      this.ocK = getIntent().getStringExtra("key_native_url");
      this.ocH = getIntent().getIntExtra("key_jump_from", 2);
      this.ocP = getIntent().getStringExtra("key_process_content");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyDetailUI", "sendid=" + bo.nullAsNil(this.ocI) + ", nativeurl=" + bo.nullAsNil(this.ocK) + ", jumpFrom=" + this.ocH);
      if ((bo.isNullOrNil(this.ocI)) && (!bo.isNullOrNil(this.ocK)))
        paramBundle = Uri.parse(this.ocK);
      try
      {
        this.ocI = paramBundle.getQueryParameter("sendid");
        try
        {
          label250: paramBundle = getIntent().getByteArrayExtra("key_detail_info");
          this.kWO = getIntent().getStringExtra("key_detail_emoji_md5");
          this.odX = getIntent().getIntExtra("key_detail_emoji_type", 0);
          Object localObject;
          if (!bo.isNullOrNil(this.kWO))
          {
            localObject = new com/tencent/mm/g/b/a/aa;
            ((aa)localObject).<init>();
            this.oec = ((aa)localObject);
            this.oec.cVT = 10L;
            this.oec.ajK();
          }
          this.oeb = ((LuckyMoneyEmojiSwitch)getIntent().getParcelableExtra("key_emoji_switch"));
          if (this.oeb == null)
          {
            localObject = new com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEmojiSwitch;
            ((LuckyMoneyEmojiSwitch)localObject).<init>();
            this.oeb = ((LuckyMoneyEmojiSwitch)localObject);
          }
          if (paramBundle != null)
          {
            localObject = new com/tencent/mm/plugin/luckymoney/model/k;
            ((com.tencent.mm.plugin.luckymoney.model.k)localObject).<init>();
            paramBundle = (com.tencent.mm.plugin.luckymoney.model.k)((com.tencent.mm.plugin.luckymoney.model.k)localObject).parseFrom(paramBundle);
            if (paramBundle == null)
              break label467;
            a(paramBundle);
          }
          while (true)
          {
            if (getIntent().getBooleanExtra("play_sound", false))
              k.a(this, k.a.oiu);
            addTextOptionMenu(0, getString(2131301088), new LuckyMoneyDetailUI.27(this));
            Nc(getResources().getColor(2131690235));
            AppMethodBeat.o(42684);
            return;
            i = 2131034216;
            break;
            label467: finish();
          }
        }
        catch (Exception paramBundle)
        {
          while (true)
          {
            com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.LuckyMoneyDetailUI", "Parse LuckyMoneyDetail fail!" + paramBundle.getLocalizedMessage());
            finish();
          }
        }
      }
      catch (Exception paramBundle)
      {
        break label250;
      }
    }
  }

  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    AppMethodBeat.i(42685);
    boolean bool = super.onCreatePanelMenu(paramInt, paramMenu);
    paramMenu = (TextView)findViewById(2131820958);
    if (paramMenu != null)
      paramMenu.setTextColor(getResources().getColor(2131690231));
    AppMethodBeat.o(42685);
    return bool;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(42704);
    super.onDestroy();
    if ((this.oex == 1) || (this.oex == 2))
    {
      this.oec = new aa();
      this.oec.cVT = 12L;
      this.oec.ajK();
    }
    if (this.ocC != null)
      this.ocC.bMO();
    if (this.nTR != null)
    {
      this.nTR.release();
      for (int i = 0; i < this.odE.length; i++)
        this.nTR.unload(this.odE[i]);
    }
    if (this.odY != null)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyDetailUI", "commentfooter release");
      this.odY.onPause();
      this.odY.AC();
      this.odY.destroy();
    }
    j.bkh().kVj = null;
    com.tencent.mm.kernel.g.RO().eJo.b(697, this.oev);
    AppMethodBeat.o(42704);
  }

  public final void onKeyboardStateChanged()
  {
    AppMethodBeat.i(42691);
    super.onKeyboardStateChanged();
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.LuckyMoneyDetailUI", "keyboard changed: %s", new Object[] { Integer.valueOf(this.mController.ymc) });
    AppMethodBeat.o(42691);
  }

  public void onPause()
  {
    AppMethodBeat.i(42687);
    super.onPause();
    com.tencent.mm.modelstat.d.h("LuckyMoneyDetailUI", this.oes, bo.anT());
    AppMethodBeat.o(42687);
  }

  public void onResume()
  {
    AppMethodBeat.i(42686);
    super.onResume();
    this.oes = bo.anT();
    AppMethodBeat.o(42686);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI
 * JD-Core Version:    0.6.2
 */