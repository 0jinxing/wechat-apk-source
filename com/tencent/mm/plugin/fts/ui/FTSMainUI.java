package com.tencent.mm.plugin.fts.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.tv;
import com.tencent.mm.g.a.vl;
import com.tencent.mm.g.b.a.cv;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.appbrand.service.i.a;
import com.tencent.mm.plugin.appbrand.service.i.c;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.c.b;
import com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView;
import com.tencent.mm.plugin.fts.ui.widget.FTSMainUIEducationLayout;
import com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl;
import com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout;
import com.tencent.mm.plugin.websearch.api.ac;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.plugin.websearch.api.o;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.KeyboardLinearLayout;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@com.tencent.mm.ui.base.a(3)
public class FTSMainUI extends FTSBaseVoiceSearchUI
  implements b.a
{
  private int ieu;
  private int iev;
  long ijU;
  private Dialog lud;
  private int mFa;
  int mIa;
  private Map<String, Integer> mJA;
  private KeyboardLinearLayout mJB;
  private j mJC;
  private j.b mJD;
  private o mJE;
  private com.tencent.mm.plugin.websearch.api.d mJF;
  private com.tencent.mm.plugin.websearch.api.g mJG;
  private View.OnClickListener mJH;
  private com.tencent.mm.sdk.b.c<vl> mJI;
  private FTSMainUIEducationLayout mJe;
  private LinearLayout mJf;
  private LinearLayout mJg;
  private com.tencent.mm.plugin.fts.ui.widget.c mJh;
  private boolean mJi;
  private LinearLayout mJj;
  private View mJk;
  private View mJl;
  private FTSLocalPageRelevantView mJm;
  private TextView mJn;
  private TextView mJo;
  private View mJp;
  private View mJq;
  private TextView mJr;
  private com.tencent.mm.plugin.websearch.api.i mJs;
  private View mJt;
  private boolean mJu;
  private long mJv;
  private boolean mJw;
  private Runnable mJx;
  private String mJy;
  private volatile boolean mJz;

  public FTSMainUI()
  {
    AppMethodBeat.i(61897);
    this.mJi = false;
    this.mJx = new FTSMainUI.1(this);
    this.mJA = new HashMap();
    this.mJD = new FTSMainUI.19(this);
    this.mIa = -1;
    this.mJE = new FTSMainUI.8(this);
    this.mJF = new FTSMainUI.9(this);
    this.mJG = new FTSMainUI.10(this);
    this.mJH = new FTSMainUI.13(this);
    this.mJI = new FTSMainUI.14(this);
    AppMethodBeat.o(61897);
  }

  private void bBb()
  {
    AppMethodBeat.i(61908);
    this.mJe.setVisibility(0);
    this.mJe.cu();
    AppMethodBeat.o(61908);
  }

  private void bBc()
  {
    AppMethodBeat.i(61909);
    this.mJe.setVisibility(8);
    AppMethodBeat.o(61909);
  }

  private void bBd()
  {
    AppMethodBeat.i(61915);
    this.mJC.mIO = true;
    String str1 = this.query;
    if ((str1 == null) || (bo.isNullOrNil(str1.trim())))
      AppMethodBeat.o(61915);
    while (true)
    {
      return;
      if (System.currentTimeMillis() - this.ijU <= 1000L)
      {
        AppMethodBeat.o(61915);
      }
      else
      {
        this.ijU = System.currentTimeMillis();
        String str2 = com.tencent.mm.plugin.fts.a.e.mCM;
        Object localObject = new HashMap();
        ((Map)localObject).put("sceneActionType", "15");
        ((Map)localObject).put("clickType", "15");
        ((com.tencent.mm.plugin.websearch.api.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.websearch.api.j.class)).a(this.mController.ylL, 3, str1, str2, (Map)localObject);
        an.Ik(3);
        if (!bo.isNullOrNil(this.query))
          an.l(this.query, 2, 2, 3);
        this.mJk.setEnabled(false);
        localObject = bBe();
        k.a(this.query, this.mJC.getCount(), this.mFa, (b)localObject, 18);
        AppMethodBeat.o(61915);
      }
    }
  }

  private b bBe()
  {
    AppMethodBeat.i(61916);
    b localb = this.mJC.mIS;
    if ((this.mJp != null) && (this.mJp.getVisibility() == 0));
    for (localb.mLE = (this.mJC.getBlockCount() + 2); ; localb.mLE = (this.mJC.getBlockCount() + 1))
    {
      AppMethodBeat.o(61916);
      return localb;
    }
  }

  private void bBf()
  {
    AppMethodBeat.i(61918);
    cv localcv;
    if ((this.mJz) && (!TextUtils.isEmpty(this.query)))
      if ((this.mJC.getBlockCount() == 0) && (this.mJt.getVisibility() == 8) && (TextUtils.isEmpty(this.mJr.getText())))
      {
        bBd();
        localcv = new cv();
        localcv.dim = 1L;
        localcv.cTl = 1L;
        localcv.hL(this.query).ajK();
        AppMethodBeat.o(61918);
      }
    while (true)
    {
      return;
      localcv = new cv();
      localcv.dim = 1L;
      localcv.cTl = 2L;
      localcv.hL(this.query).ajK();
      AppMethodBeat.o(61918);
    }
  }

  public final void U(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(61921);
    super.U(paramInt, paramBoolean);
    this.mJm.setVisibility(8);
    this.mJs.hide();
    this.mJt.setVisibility(8);
    if ((!paramBoolean) && (paramInt == 0) && (this.mJC.mJa))
      this.mJj.setVisibility(0);
    while (!paramBoolean)
    {
      al.af(this.mJx);
      this.mJk.setVisibility(8);
      this.mJp.setVisibility(8);
      this.mJw = false;
      AppMethodBeat.o(61921);
      return;
      this.mJj.setVisibility(8);
    }
    this.mJz = true;
    paramBoolean = com.tencent.mm.plugin.fts.a.d.Nd(this.query);
    boolean bool = com.tencent.mm.plugin.fts.a.d.Ne(this.query);
    if (paramInt > 0)
    {
      if ((paramBoolean) || (bool))
        this.mJq.setVisibility(0);
      this.mJl.setVisibility(0);
      label167: if ((paramBoolean) || (bool))
        this.mJp.setVisibility(0);
      this.mJw = true;
      if (this.mJu)
        break label317;
      this.mJk.setVisibility(0);
    }
    while (true)
    {
      if ((this.query != null) && (this.query.length() > 0))
      {
        ((com.tencent.mm.plugin.websearch.api.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.websearch.api.e.class)).a(this.query, this.mJF, this);
        ((p)com.tencent.mm.kernel.g.K(p.class)).a(this.query, com.tencent.mm.plugin.fts.a.e.mCM, this.mJE);
      }
      AppMethodBeat.o(61921);
      break;
      this.mJq.setVisibility(8);
      if ((paramBoolean) || (bool))
      {
        this.mJl.setVisibility(0);
        break label167;
      }
      this.mJl.setVisibility(8);
      break label167;
      label317: ab.i("MicroMsg.FTS.FTSMainUI", "wait for search widget result , timeout %d", new Object[] { Long.valueOf(this.mJv) });
      al.n(this.mJx, this.mJv);
    }
  }

  protected final d a(e parame)
  {
    AppMethodBeat.i(61903);
    this.mJC = new j(parame, this.mFa, this.mJD);
    this.mJC.wd(2);
    parame = this.mJC;
    AppMethodBeat.o(61903);
    return parame;
  }

  public final void a(com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(61907);
    ab.i("MicroMsg.FTS.FTSMainUI", "onGetLocation %b %f|%f", new Object[] { Boolean.valueOf(paramBoolean), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
    com.tencent.mm.modelgeo.d.agz().c(this);
    AppMethodBeat.o(61907);
    return false;
  }

  public final View aWz()
  {
    AppMethodBeat.i(61914);
    if (this.mJf == null)
    {
      this.mJf = ((LinearLayout)getLayoutInflater().inflate(2130969626, null));
      this.mJn = ((TextView)this.mJf.findViewById(2131824235));
      this.mJo = ((TextView)this.mJf.findViewById(2131824236));
    }
    try
    {
      Object localObject = ac.adL("webSearchBar").optString("wording");
      ab.i("MicroMsg.FTS.FTSMainUI", "set searchNetworkTips %s", new Object[] { localObject });
      this.mJo.setText((CharSequence)localObject);
      label103: this.mJl = this.mJf.findViewById(2131824232);
      this.mJk = this.mJf.findViewById(2131824231);
      this.mJf.findViewById(2131824234).setOnClickListener(new FTSMainUI.2(this));
      this.mJt = this.mJf.findViewById(2131824233);
      this.mJs = ((com.tencent.mm.plugin.websearch.api.h)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.websearch.api.h.class)).a((LinearLayout)this.mJt, com.tencent.mm.bz.a.ao(ah.getContext(), ah.getResources().getDisplayMetrics().widthPixels) - 26, this, this.mJG);
      this.mJm = new FTSLocalPageRelevantView(this);
      this.mJm.setOnRelevantClickListener(new FTSMainUI.3(this));
      int i = this.mJf.indexOfChild(this.mJk);
      if ((i >= 0) && (i < this.mJf.getChildCount()))
        this.mJf.addView(this.mJm, i + 1);
      this.mJr = ((TextView)this.mJf.findViewById(2131824230));
      this.mJq = this.mJf.findViewById(2131824228);
      this.mJp = this.mJf.findViewById(2131824229);
      this.mJp.setOnClickListener(new FTSMainUI.4(this));
      this.mJg = ((LinearLayout)this.mJf.findViewById(2131824237));
      localObject = this.mJf;
      AppMethodBeat.o(61914);
      return localObject;
    }
    catch (Exception localException)
    {
      break label103;
    }
  }

  protected final void bAM()
  {
    AppMethodBeat.i(61923);
    super.bAM();
    Object localObject = com.tencent.mm.pluginsdk.ui.e.j.b(this, f.a(getString(2131300130), "", com.tencent.mm.plugin.fts.a.a.d.b(this.query, this.query)).mDR, com.tencent.mm.bz.a.al(this, 2131427813));
    this.mJn.setText((CharSequence)localObject);
    localObject = null;
    if (com.tencent.mm.plugin.fts.a.d.Nd(this.query))
      localObject = f.a(getString(2131300101), "", com.tencent.mm.plugin.fts.a.a.d.b(this.query, this.query)).mDR;
    while (true)
    {
      localObject = com.tencent.mm.pluginsdk.ui.e.j.b(this, (CharSequence)localObject, com.tencent.mm.bz.a.al(this, 2131427813));
      this.mJr.setText((CharSequence)localObject);
      AppMethodBeat.o(61923);
      return;
      if (com.tencent.mm.plugin.fts.a.d.Ne(this.query))
        localObject = f.a(getString(2131300102), "", com.tencent.mm.plugin.fts.a.a.d.b(this.query, this.query)).mDR;
    }
  }

  protected final void bAQ()
  {
    AppMethodBeat.i(61902);
    switch (getIntent().getIntExtra("from_tab_index", -1))
    {
    default:
      this.mFa = 0;
      AppMethodBeat.o(61902);
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      this.mFa = 1;
      AppMethodBeat.o(61902);
      continue;
      this.mFa = 2;
      AppMethodBeat.o(61902);
      continue;
      this.mFa = 3;
      AppMethodBeat.o(61902);
      continue;
      this.mFa = 4;
      AppMethodBeat.o(61902);
    }
  }

  protected final void bAS()
  {
    AppMethodBeat.i(61913);
    super.bAS();
    bBc();
    this.mJj.setVisibility(8);
    if ((this.mJh != null) && (!this.mJh.mMH))
      this.mJh.bBy();
    AppMethodBeat.o(61913);
  }

  protected final void bAT()
  {
    AppMethodBeat.i(61912);
    super.bAT();
    bBc();
    this.mJj.setVisibility(8);
    this.mIn.setVisibility(0);
    this.mIp.setVisibility(8);
    if ((this.mJh != null) && (!this.mJh.mMH))
      this.mJh.bBy();
    AppMethodBeat.o(61912);
  }

  protected final void bAU()
  {
    AppMethodBeat.i(61911);
    super.bAU();
    bBc();
    this.mJj.setVisibility(8);
    if ((this.mJh != null) && (!this.mJh.mMH))
      this.mJh.bBy();
    AppMethodBeat.o(61911);
  }

  protected final void bAV()
  {
    AppMethodBeat.i(61910);
    super.bAV();
    bBb();
    this.mJj.setVisibility(8);
    if ((this.mJi) && (this.mJh != null))
      this.mJh.show();
    AppMethodBeat.o(61910);
  }

  protected final void bAW()
  {
    AppMethodBeat.i(61919);
    if (this.mJg != null)
      this.mJg.setVisibility(0);
    AppMethodBeat.o(61919);
  }

  protected final void bAX()
  {
    AppMethodBeat.i(61920);
    if (this.mJg != null)
      this.mJg.setVisibility(8);
    AppMethodBeat.o(61920);
  }

  public void finish()
  {
    AppMethodBeat.i(61906);
    int i = 100;
    if (!this.mController.hideVKB())
      i = 0;
    al.n(new FTSMainUI.21(this), i);
    AppMethodBeat.o(61906);
  }

  public final int getLayoutId()
  {
    return 2130969629;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(61900);
    finish();
    AppMethodBeat.o(61900);
  }

  public void onClickWxApp(View paramView)
  {
    AppMethodBeat.i(61924);
    if (paramView.getTag().equals("more-click"))
    {
      ((com.tencent.mm.plugin.appbrand.service.i)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.i.class)).a(this, com.tencent.mm.plugin.fts.a.e.mCM, i.a.iDF);
      AppMethodBeat.o(61924);
    }
    while (true)
    {
      return;
      if (paramView.getTag().equals("more-swipe"))
      {
        ((com.tencent.mm.plugin.appbrand.service.i)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.i.class)).a(this, com.tencent.mm.plugin.fts.a.e.mCM, i.a.iDG);
        AppMethodBeat.o(61924);
      }
      else
      {
        ((com.tencent.mm.plugin.appbrand.service.i)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.i.class)).a(this, (i.c)paramView.getTag(), com.tencent.mm.plugin.fts.a.e.mCM);
        AppMethodBeat.o(61924);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(61898);
    super.onCreate(paramBundle);
    this.ieu = ah.getResources().getDisplayMetrics().widthPixels;
    this.iev = ah.getResources().getDisplayMetrics().heightPixels;
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = TransitionInflater.from(this).inflateTransition(17760258);
      TransitionInflater.from(this).inflateTransition(17760258);
      paramBundle.excludeTarget(getWindow().getDecorView().findViewById(2131820940), true);
      paramBundle.excludeTarget(16908335, true);
      getWindow().setEnterTransition(paramBundle);
    }
    this.mJB = ((KeyboardLinearLayout)findViewById(2131820987));
    this.mJB.setOnkbdStateListener(new FTSMainUI.12(this));
    this.mIu.setHint(getString(2131297040));
    com.tencent.mm.plugin.fts.a.e.mCM = com.tencent.mm.plugin.websearch.api.aa.HP(3);
    paramBundle = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(this.mFa), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), com.tencent.mm.plugin.fts.a.e.mCM, "" });
    ab.d("MicroMsg.FTS.FTSReportLogic", "reportFTSEnterClick: %d, %s", new Object[] { Integer.valueOf(10991), paramBundle });
    com.tencent.mm.plugin.report.service.h.pYm.X(10991, paramBundle);
    this.mJe = ((FTSMainUIEducationLayout)findViewById(2131824241));
    this.mJj = ((LinearLayout)findViewById(2131824200));
    this.mJe.setOnCellClickListener(this.mJH);
    this.mJe.setOnHotwordClickListener(new FTSMainUI.16(this));
    this.mJe.setNeedHotWord(false);
    com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.widget.recentview.d.class);
    com.tencent.mm.sdk.g.d.xDG.b(new FTSMainUI.18(this), "FTSMainUI.GetLocation");
    if (((n)com.tencent.mm.kernel.g.M(n.class)).getFTSImageLoader() == null)
    {
      finish();
      AppMethodBeat.o(61898);
    }
    while (true)
    {
      return;
      ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSImageLoader().bzY();
      ac.Ig(3);
      com.tencent.mm.sdk.b.a.xxA.b(this.mJI);
      com.tencent.mm.sdk.g.d.post(new FTSMainUI.15(this), "init-widget-switch");
      AppMethodBeat.o(61898);
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    boolean bool1 = true;
    AppMethodBeat.i(61899);
    boolean bool2 = super.onCreateOptionsMenu(paramMenu);
    int i;
    if ((com.tencent.mm.sdk.platformtools.aa.don()) || (com.tencent.mm.sdk.platformtools.aa.dor().equals("en")))
    {
      i = 1;
      if (i != 0)
        break label54;
      AppMethodBeat.o(61899);
    }
    while (true)
    {
      return bool2;
      i = 0;
      break;
      label54: paramMenu = (FTSVoiceInputLayoutImpl)findViewById(2131824243);
      TextView localTextView = (TextView)findViewById(2131824239);
      ImageView localImageView = (ImageView)findViewById(2131824240);
      if ((paramMenu == null) || (localTextView == null) || (localImageView == null))
      {
        boolean bool3;
        label110: boolean bool4;
        if (paramMenu == null)
        {
          bool3 = true;
          if (localTextView != null)
            break label174;
          bool4 = true;
          label118: if (localImageView != null)
            break label180;
        }
        while (true)
        {
          ab.w("MicroMsg.FTS.FTSMainUI", "voicePanel == null || sayTv == null || loadingIv == null, %s, %s, %s", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool1) });
          AppMethodBeat.o(61899);
          break;
          bool3 = false;
          break label110;
          label174: bool4 = false;
          break label118;
          label180: bool1 = false;
        }
      }
      this.mJh = new com.tencent.mm.plugin.fts.ui.widget.c(this, paramMenu, localTextView, localImageView);
      this.mJh.mMG = new FTSMainUI.17(this);
      AppMethodBeat.o(61899);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(61904);
    com.tencent.mm.sdk.g.d.xDG.remove("FTSMainUI.GetLocation");
    com.tencent.mm.modelgeo.d.agz().c(this);
    if (((n)com.tencent.mm.kernel.g.M(n.class)).getFTSImageLoader() != null)
      ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSImageLoader().bzZ();
    com.tencent.mm.sdk.b.a.xxA.d(this.mJI);
    if (this.mJh != null)
    {
      Object localObject = this.mJh;
      if (((com.tencent.mm.plugin.fts.ui.widget.c)localObject).mMI != null)
      {
        ((com.tencent.mm.plugin.fts.ui.widget.c)localObject).mMI.amA();
        localObject = ((com.tencent.mm.plugin.fts.ui.widget.c)localObject).mMI;
        if (((VoiceInputLayout)localObject).ilv != null)
          ((VoiceInputLayout)localObject).ilv.removeCallbacksAndMessages(null);
        if (((VoiceInputLayout)localObject).mNk != null)
          ((VoiceInputLayout)localObject).mNk.removeCallbacksAndMessages(null);
        if (((VoiceInputLayout)localObject).gci != null)
          ((VoiceInputLayout)localObject).gci.stopTimer();
      }
    }
    if (this.mJs != null)
      this.mJs.onDestroy();
    k.a(bBe());
    super.onDestroy();
    AppMethodBeat.o(61904);
  }

  public void onResume()
  {
    AppMethodBeat.i(61905);
    super.onResume();
    runOnUiThread(new FTSMainUI.20(this));
    tv localtv = new tv();
    localtv.cPX.cvc = 0L;
    com.tencent.mm.sdk.b.a.xxA.m(localtv);
    com.tencent.mm.cj.c.aNX();
    if (this.mJk != null)
      this.mJk.setEnabled(true);
    if (!bo.isNullOrNil(this.mJy))
    {
      this.query = this.mJy;
      this.mJy = null;
    }
    com.tencent.mm.plugin.websearch.api.aa.cVe();
    if (this.mJs != null)
      this.mJs.onResume();
    AppMethodBeat.o(61905);
  }

  public void onStop()
  {
    AppMethodBeat.i(61901);
    aqX();
    super.onStop();
    if (this.mJs != null)
      this.mJs.onPause();
    AppMethodBeat.o(61901);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final boolean vN(String paramString)
  {
    AppMethodBeat.i(61917);
    super.vN(paramString);
    bBf();
    AppMethodBeat.o(61917);
    return false;
  }

  public final void vO(String paramString)
  {
    AppMethodBeat.i(61922);
    if ((this.mJh == null) || (!this.mJh.mMH))
      super.vO(paramString);
    this.mJz = false;
    AppMethodBeat.o(61922);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI
 * JD-Core Version:    0.6.2
 */