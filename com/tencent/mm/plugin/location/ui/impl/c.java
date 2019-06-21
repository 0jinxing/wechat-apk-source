package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bz.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.location.ui.PoiHeaderView;
import com.tencent.mm.plugin.location.ui.SimpleImageView;
import com.tencent.mm.plugin.location.ui.SimpleImageView.a;
import com.tencent.mm.protocal.protobuf.alt;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.ui.base.MMLoadMoreListView.a;
import com.tencent.mm.ui.tools.ActionBarSearchView;
import java.util.Iterator;
import java.util.List;

public final class c extends b
  implements com.tencent.mm.ai.f
{
  private static int nPR = 11;
  private static int nPS = 12;
  private static int nPT = 13;
  private static int nPU = 14;
  private b.a ecy;
  private String fMh;
  private double lat;
  private double lng;
  private ImageView lnh;
  private String nJJ;
  private int nJK;
  FrameLayout nOX;
  private boolean nPA;
  private int nPB;
  private RelativeLayout nPC;
  private int nPD;
  private int nPE;
  private int nPF;
  private boolean nPG;
  private boolean nPH;
  private boolean nPI;
  private FrameLayout nPJ;
  private float nPK;
  private float nPL;
  private int nPM;
  private long nPN;
  private long nPO;
  private long nPP;
  private int nPQ;
  private boolean nPV;
  private boolean nPW;
  private boolean nPX;
  protected PoiHeaderView nPg;
  private PickPoi nPh;
  private MMLoadMoreListView nPi;
  private MMLoadMoreListView nPj;
  private View nPk;
  private e nPl;
  private e nPm;
  private View nPn;
  private ImageButton nPo;
  private com.tencent.mm.plugin.location.model.h nPp;
  private f nPq;
  private View nPr;
  private ImageButton nPs;
  ActionBarSearchView nPt;
  private TextView nPu;
  private LinearLayout nPv;
  private com.tencent.mm.plugin.location.ui.e nPw;
  private com.tencent.mm.plugin.location.ui.g nPx;
  private double nPy;
  private double nPz;
  private TextView titleView;

  public c(Activity paramActivity)
  {
    super(paramActivity);
    AppMethodBeat.i(113618);
    this.nPp = null;
    this.nPq = null;
    this.lat = -85.0D;
    this.lng = -1000.0D;
    this.nPy = -85.0D;
    this.nPz = -1000.0D;
    this.nJJ = "";
    this.nPA = false;
    this.fMh = "";
    this.nPB = 0;
    this.nPG = true;
    this.nPH = false;
    this.nPI = false;
    this.nPM = 0;
    this.nPN = -1L;
    this.nPO = -1L;
    this.nPP = -1L;
    this.nPQ = -1;
    this.nPV = false;
    this.nJK = 1;
    this.ecy = new c.9(this);
    AppMethodBeat.o(113618);
  }

  private void a(f paramf)
  {
    AppMethodBeat.i(113624);
    if (this.nPW)
      xE(com.tencent.mm.sdk.platformtools.ah.getResources().getColor(2131689913));
    while (true)
    {
      this.fMh = "";
      this.nPA = false;
      this.nPk.setVisibility(8);
      this.nPj.setVisibility(8);
      this.nPt.setVisibility(8);
      this.nPt.setSearchContent("");
      this.nPu.setVisibility(8);
      this.nPi.setVisibility(0);
      this.nPi.setAdapter(this.nPl);
      this.nPl.notifyDataSetChanged();
      this.nPv.setVisibility(0);
      aqX();
      if (paramf != null)
      {
        this.nMj.getIController().setCenter(paramf.bDG, paramf.bDH);
        this.lat = paramf.bDG;
        this.lng = paramf.bDH;
        this.nPh.m(this.lat, this.lng);
        hM(false);
      }
      AppMethodBeat.o(113624);
      return;
      xE(com.tencent.mm.sdk.platformtools.ah.getResources().getColor(2131690310));
    }
  }

  private String b(double paramDouble, String paramString)
  {
    AppMethodBeat.i(113626);
    paramString = (int)(paramDouble * 1000000.0D) + "_" + (int)(this.lng * 1000000.0D) + "_" + paramString;
    AppMethodBeat.o(113626);
    return paramString;
  }

  private void bKq()
  {
    AppMethodBeat.i(113627);
    if (this.nPh.nQh)
    {
      f localf = this.nPh.getPoi();
      this.nPl.b(localf);
    }
    AppMethodBeat.o(113627);
  }

  private void hM(boolean paramBoolean)
  {
    AppMethodBeat.i(113628);
    if (this.nPx != null)
      this.nPx.remove();
    this.nJJ = b(this.lat, this.fMh);
    if (this.nJJ.equals(this.nPl.key))
    {
      ab.i("MicroMsg.MMPoiMapUI", "same key passed it ", new Object[] { this.nJJ });
      AppMethodBeat.o(113628);
    }
    while (true)
    {
      return;
      byte[] arrayOfByte = null;
      int i = 1;
      label146: label159: double d1;
      double d2;
      if (this.nPA)
        if ((this.nJK > 0) && (paramBoolean))
        {
          this.nPj.dzO();
          this.nPm.bKy();
          this.nPm.Qb(this.nJJ);
          this.nPm.kPJ = this.fMh;
          arrayOfByte = this.nPm.buffer;
          if (i == 0)
            break label402;
          if (this.nPB != 0)
            break label391;
          i = 0;
          d1 = this.lat;
          d2 = this.lng;
          if (!this.nPA)
            break label396;
        }
      label391: label396: for (int j = 0; ; j = 1)
      {
        this.nPp = new com.tencent.mm.plugin.location.model.h(arrayOfByte, d1, d2, i, j, this.nPL, this.nPK, this.nJJ, this.fMh, paramBoolean);
        com.tencent.mm.kernel.g.Rg().a(this.nPp, 0);
        this.nPM += 1;
        if (this.nPP == -1L)
          this.nPP = System.currentTimeMillis();
        AppMethodBeat.o(113628);
        break;
        if (!paramBoolean)
        {
          this.nPj.dzO();
          this.nPm.clean();
          this.nPm.Qb(this.nJJ);
          this.nPm.kPJ = this.fMh;
          arrayOfByte = this.nPm.buffer;
          this.nPm.notifyDataSetChanged();
          break label146;
        }
        i = 0;
        break label146;
        this.nPi.dzO();
        this.nPl.clean();
        this.nPl.Qb(this.nJJ);
        this.nPl.notifyDataSetChanged();
        arrayOfByte = this.nPl.buffer;
        this.nPn.setVisibility(0);
        iG(false);
        bKq();
        break label146;
        i = 1;
        break label159;
      }
      label402: ab.i("MicroMsg.MMPoiMapUI", "pass this query because query interval: %d", new Object[] { Integer.valueOf(this.nJK) });
      AppMethodBeat.o(113628);
    }
  }

  private void iF(boolean paramBoolean)
  {
    AppMethodBeat.i(113622);
    this.nPG = false;
    c.a locala1;
    if (paramBoolean)
      locala1 = new c.a(this, -(bKr() - this.nPE));
    for (c.a locala2 = new c.a(this, -(bKr() - this.nPE) / 2); ; locala2 = new c.a(this, (this.nPD - bKr()) / 2))
    {
      c.15 local15 = new c.15(this, paramBoolean);
      locala1.setDuration(200L);
      locala1 = locala1.bKw();
      locala1.setAnimationListener(local15);
      locala1.dm(this.nPC).dm(this.nPo).bKx();
      locala2.setDuration(200L);
      locala2.bKw().dm(this.nPJ).bKx();
      AppMethodBeat.o(113622);
      return;
      locala1 = new c.a(this, this.nPD - bKr());
    }
  }

  private void iG(boolean paramBoolean)
  {
    AppMethodBeat.i(113632);
    ab.d("MicroMsg.MMPoiMapUI", "enable send.. %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.nPr.setEnabled(paramBoolean);
    findViewById(2131820958).setEnabled(paramBoolean);
    this.nPs.setEnabled(paramBoolean);
    AppMethodBeat.o(113632);
  }

  private void m(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(113629);
    String str1;
    String str2;
    String str3;
    if ((this.nPy == -85.0D) || (this.nPz == -1000.0D))
    {
      str1 = "null/null";
      str2 = "";
      if (paramBoolean)
        break label576;
      if (this.nPl.llU >= this.nPl.getCount())
        break label645;
      str2 = this.nPl.xG(this.nPl.llU).nQA;
      str3 = this.nPl.xG(this.nPl.llU).nQq;
    }
    while (true)
    {
      label96: String str4 = str2;
      if (paramInt2 == 0)
      {
        str4 = str2;
        if (bo.isNullOrNil(str2))
        {
          str4 = str2;
          if (this.nPl.getCount() > 1)
          {
            ab.d("MicroMsg.MMPoiMapUI", "set searchid in first poi");
            str4 = this.nPl.xG(1).nQA;
          }
        }
      }
      if ((this.nPl.getCount() > 0) && (!paramBoolean))
        ab.d("MicroMsg.MMPoiMapUI", "set request id at index: %s", new Object[] { Integer.valueOf(paramInt2) });
      for (str2 = this.nPl.xG(0).nQB; ; str2 = "")
      {
        int i = paramInt2;
        if (paramInt2 == 0)
        {
          i = paramInt2;
          if (!paramBoolean)
          {
            i = paramInt2;
            if (this.nPl.getCount() > 0)
            {
              int j = this.nPl.xG(0).nQC;
              i = paramInt2;
              if (j >= 0)
              {
                ab.d("MicroMsg.MMPoiMapUI", "change to search index: %s", new Object[] { Integer.valueOf(j) });
                i = j;
              }
            }
          }
        }
        ab.d("MicroMsg.MMPoiMapUI", "tofutest type:%d, index: %d, startTime: %s, lastTime: %s, firsSuccTime: %s, poiCount: %s, latlng: %s, entryTime: %s, searchId: %s, requestId: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i + 1), Long.valueOf(this.nPP), Long.valueOf(this.nPO), Long.valueOf(this.nPN), Integer.valueOf(this.nPM), str1, Integer.valueOf(this.nPQ), str4, str2 });
        com.tencent.mm.plugin.report.service.h.pYm.e(11135, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i + 1), Long.valueOf(this.nPP), Long.valueOf(this.nPO), Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.nPN), Integer.valueOf(this.nPM), str1, str3, Integer.valueOf(this.nPQ), str4, q.LK(), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), str2 });
        AppMethodBeat.o(113629);
        return;
        str1 = String.format("%f/%f", new Object[] { Double.valueOf(this.nPy), Double.valueOf(this.nPz) });
        break;
        label576: if ((paramInt2 < 0) || (this.nPm.llU >= this.nPm.getCount()))
          break label645;
        str2 = this.nPm.xG(this.nPm.llU).nQA;
        str3 = this.nPm.xG(this.nPm.llU).nQq;
        break label96;
      }
      label645: str3 = "";
    }
  }

  private void xE(int paramInt)
  {
    AppMethodBeat.i(113621);
    this.nPv.setBackgroundColor(paramInt);
    this.nPt.setBackgroundColor(paramInt);
    Boolean localBoolean = Boolean.valueOf(com.tencent.mm.ui.ah.Nw(paramInt));
    if (localBoolean.booleanValue())
    {
      this.lnh.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
      this.nPs.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
      this.titleView.setTextColor(com.tencent.mm.sdk.platformtools.ah.getResources().getColor(2131690693));
    }
    Object localObject;
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = this.activity.getWindow();
      ((Window)localObject).clearFlags(201326592);
      ((Window)localObject).addFlags(-2147483648);
      if ((Build.VERSION.SDK_INT < 23) || (com.tencent.mm.compatible.util.h.Mt()))
        break label185;
    }
    while (true)
    {
      this.activity.getWindow().setStatusBarColor(paramInt);
      if (Build.VERSION.SDK_INT >= 23)
      {
        localObject = this.activity.getWindow().getDecorView();
        paramInt = ((View)localObject).getSystemUiVisibility();
        if (!localBoolean.booleanValue())
          break label214;
        paramInt &= -8193;
      }
      while (true)
      {
        ((View)localObject).setSystemUiVisibility(paramInt);
        AppMethodBeat.o(113621);
        return;
        label185: if (Build.VERSION.SDK_INT < 21)
          break label223;
        paramInt = com.tencent.mm.ui.ah.s(this.activity.getResources().getColor(2131690515), paramInt);
        break;
        label214: paramInt |= 8192;
      }
      label223: paramInt = 0;
    }
  }

  public final com.tencent.mm.plugin.k.d bKo()
  {
    AppMethodBeat.i(113620);
    com.tencent.mm.plugin.k.d locald = (com.tencent.mm.plugin.k.d)this.activity.findViewById(2131820622);
    AppMethodBeat.o(113620);
    return locald;
  }

  public final void bKp()
  {
    AppMethodBeat.i(113625);
    PickPoi localPickPoi = this.nPh;
    localPickPoi.nLu.clearAnimation();
    localPickPoi.nLu.startAnimation(localPickPoi.De);
    this.lat = (this.nMj.getMapCenterX() / 1000000.0D);
    this.lng = (this.nMj.getMapCenterY() / 1000000.0D);
    this.nPh.l(this.lat, this.lng);
    this.nPo.setBackgroundResource(2130839181);
    if (this.nPI)
      iF(false);
    hM(false);
    this.nPV = false;
    this.nPl.nPV = false;
    AppMethodBeat.o(113625);
  }

  public final int bKr()
  {
    AppMethodBeat.i(113636);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.nPC.getLayoutParams();
    this.nPF = localMarginLayoutParams.topMargin;
    int i = localMarginLayoutParams.topMargin;
    AppMethodBeat.o(113636);
    return i;
  }

  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(113623);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      ab.d("MicroMsg.MMPoiMapUI", "dispatchKeyEvent");
      if (this.nPA)
      {
        a(null);
        m(nPU, this.nPm.llU, true);
        AppMethodBeat.o(113623);
      }
    }
    while (true)
    {
      return bool;
      m(nPS, this.nPl.llU, false);
      this.activity.finish();
      AppMethodBeat.o(113623);
      bool = true;
      continue;
      AppMethodBeat.o(113623);
    }
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(113619);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.Rg().a(457, this);
    this.nPQ = ((int)(System.currentTimeMillis() / 1000L));
    this.nPv = ((LinearLayout)findViewById(2131825945));
    this.titleView = ((TextView)findViewById(2131825948));
    this.titleView.setText(getString(2131300989));
    this.nPC = ((RelativeLayout)findViewById(2131826548));
    this.nPi = ((MMLoadMoreListView)this.activity.findViewById(2131826550));
    this.nPj = ((MMLoadMoreListView)this.activity.findViewById(2131826552));
    this.nPk = this.activity.findViewById(2131826554);
    this.nPu = ((TextView)findViewById(2131826553));
    this.nPo = ((ImageButton)findViewById(2131824674));
    this.nPo.setContentDescription(getString(2131300969));
    this.nPg = ((PoiHeaderView)findViewById(2131826549));
    this.nMj.setBuiltInZoomControls(false);
    this.nOX = ((FrameLayout)findViewById(2131824671));
    this.nPw = new com.tencent.mm.plugin.location.ui.e(this.activity, this.nMj);
    this.nPx = new com.tencent.mm.plugin.location.ui.g(this.activity, this.nMj);
    this.nPh = new PickPoi(this.activity);
    this.nPh.setLocationArrow(2130839178);
    this.nOX.addView(this.nPh);
    this.nPn = findViewById(2131826551);
    this.lnh = ((ImageView)this.activity.findViewById(2131825947));
    this.nPr = ((LinearLayout)this.activity.findViewById(2131825952));
    this.nPr.setVisibility(0);
    int i;
    switch (this.type)
    {
    default:
      this.nPs = ((ImageButton)findViewById(2131825950));
      this.nPs.setContentDescription(getString(2131302856));
      this.nPt = ((ActionBarSearchView)findViewById(2131826546));
      iG(false);
      this.nPl = new e(this.activity);
      this.nPm = new e(this.activity);
      this.nPm.gxV = true;
      this.nPm.llU = -1;
      this.nPh.setAdapter(this.nPl);
      this.nPi.setAdapter(this.nPl);
      this.nPi.setOnTouchListener(new c.1(this));
      paramBundle = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xMx, "");
      if ((!bo.isNullOrNil(paramBundle)) && ((this.nPy == -85.0D) || (this.nPz == -1000.0D)))
      {
        String[] arrayOfString = paramBundle.split(",");
        ab.i("MicroMsg.MMPoiMapUI", "lastlocationinfo ".concat(String.valueOf(paramBundle)));
        if (arrayOfString.length == 2)
        {
          float f1 = (float)(bo.ank(arrayOfString[0]) * 1.0D / 1000000.0D);
          float f2 = (float)(bo.ank(arrayOfString[1]) * 1.0D / 1000000.0D);
          this.nMj.getIController().setCenter(f1, f2);
        }
      }
      this.nPi.setOnLoadMoreListener(new c.10(this));
      this.nPo.setOnClickListener(new c.11(this));
      this.lnh.setOnClickListener(new c.12(this));
      this.nPr.setOnClickListener(new c.13(this));
      this.nPi.setOnItemClickListener(new c.14(this));
      this.nPs.setOnClickListener(new c.16(this));
      this.nPt.setHint(getString(2131300985));
      this.nPt.qN(false);
      this.nPt.setBackClickCallback(new c.17(this));
      this.nPt.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          AppMethodBeat.i(113595);
          ab.d("MicroMsg.MMPoiMapUI", "keyboard action");
          if (3 == paramAnonymousInt)
            c.m(c.this);
          AppMethodBeat.o(113595);
          return false;
        }
      });
      this.nPt.setCallBack(new c.3(this));
      this.nPJ = ((FrameLayout)findViewById(2131826547));
      xE(com.tencent.mm.sdk.platformtools.ah.getResources().getColor(2131690310));
      this.nPD = BackwardSupportUtil.b.b(this.activity, 280.0F);
      this.nPE = BackwardSupportUtil.b.b(this.activity, 150.0F);
      i = a.ge(this.activity);
      j = com.tencent.mm.sdk.platformtools.ah.getResources().getIdentifier("status_bar_height", "dimen", "android");
      if (j <= 0)
        break;
    case 0:
    case 3:
    case 8:
    }
    for (int j = com.tencent.mm.sdk.platformtools.ah.getResources().getDimensionPixelSize(j); ; j = 0)
    {
      int k = a.al(this.activity, 2131427563);
      i = i - this.nPE - j - k;
      if (i > a.al(this.activity, 2131428625))
      {
        ab.i("MicroMsg.MMPoiMapUI", "reset listview height: %s, statusBar: %s, actionBar: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
        paramBundle = this.nPC.getLayoutParams();
        paramBundle.height = i;
        this.nPC.setLayoutParams(paramBundle);
      }
      AppMethodBeat.o(113619);
      return;
      ((TextView)findViewById(2131820958)).setText(2131300988);
      break;
      ((TextView)findViewById(2131820958)).setText(2131296989);
      break;
      ((TextView)findViewById(2131820958)).setText(2131296944);
      break;
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(113633);
    super.onDestroy();
    com.tencent.mm.kernel.g.Rg().b(457, this);
    AppMethodBeat.o(113633);
  }

  public final void onPause()
  {
    AppMethodBeat.i(113631);
    super.onPause();
    com.tencent.mm.modelgeo.d.agz().c(this.ecy);
    com.tencent.mm.plugin.location.ui.e locale = this.nPw;
    locale.nLP.c(locale.ecy);
    AppMethodBeat.o(113631);
  }

  public final void onResume()
  {
    AppMethodBeat.i(113630);
    super.onResume();
    com.tencent.mm.modelgeo.d.agz().b(this.ecy, true);
    com.tencent.mm.plugin.location.ui.e locale = this.nPw;
    locale.nLP.b(locale.ecy, true);
    AppMethodBeat.o(113630);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(113634);
    if (paramm.getType() == 457)
      if ((paramInt1 != 0) || (paramInt2 != 0))
        AppMethodBeat.o(113634);
    while (true)
    {
      return;
      this.nPp = null;
      com.tencent.mm.plugin.location.model.h localh = (com.tencent.mm.plugin.location.model.h)paramm;
      if (!localh.nJJ.equals(this.nJJ))
      {
        ab.i("MicroMsg.MMPoiMapUI", "pass this resp!" + this.nJJ + " " + localh.nJJ);
        AppMethodBeat.o(113634);
      }
      else
      {
        ab.i("MicroMsg.MMPoiMapUI", "isend " + localh.eTf + "searchId: " + localh.hlm);
        if (this.nPN == -1L)
        {
          long l = System.currentTimeMillis();
          this.nPO = l;
          this.nPN = l;
        }
        while (true)
        {
          this.nJK = localh.nJK;
          if (!this.nPA)
            break label387;
          this.nPk.setVisibility(8);
          if ((this.nPm.getCount() != 0) || (localh.list == null) || (localh.list.size() != 0))
            break label267;
          this.nPu.setVisibility(0);
          this.nPj.dzO();
          AppMethodBeat.o(113634);
          break;
          this.nPO = System.currentTimeMillis();
        }
        label267: ab.d("MicroMsg.MMPoiMapUI", "search is first: %s", new Object[] { Boolean.valueOf(localh.isFirst()) });
        if (localh.isFirst())
          this.nPm.nQk.clear();
        this.nPm.a(localh.list, localh.nJI, localh.eTf, localh.nJJ);
        if (!this.nPm.eTf)
        {
          this.nPj.dzN();
          this.nPj.dzP();
          AppMethodBeat.o(113634);
        }
        else
        {
          this.nPj.dzO();
          AppMethodBeat.o(113634);
          continue;
          label387: PoiHeaderView localPoiHeaderView;
          Object localObject;
          if (this.nPg != null)
          {
            paramm = (alt)localh.ehh.fsH.fsP;
            localPoiHeaderView = this.nPg;
            localObject = paramm.wdK;
            paramString = paramm.wpY;
            String str = paramm.Url;
            paramm = com.tencent.mm.plugin.i.c.XW();
            ab.d("MicroMsg.PoiHeaderView", "setContent, url:%s, logUrl:%s", new Object[] { paramString, str });
            localPoiHeaderView.nMe = str;
            localPoiHeaderView.nMf = "";
            if ((!bo.isNullOrNil((String)localObject)) && (!bo.isNullOrNil(paramString)))
              break label740;
            localPoiHeaderView.setVisibility(8);
            localPoiHeaderView.eku.setVisibility(8);
            localPoiHeaderView.nMg.setVisibility(8);
          }
          while (true)
          {
            this.nPn.setVisibility(8);
            iG(true);
            if (this.nPq != null)
            {
              paramString = localh.list.iterator();
              while (paramString.hasNext())
              {
                paramm = (f)paramString.next();
                if ((paramm.nQp != null) && (paramm.mName != null) && (paramm.nQp.equals(this.nPq.nQp)) && (paramm.mName.equals(this.nPq.mName)))
                  localh.list.remove(paramm);
              }
              this.nPl.b(this.nPq);
              this.nPq = null;
              this.nPV = true;
              this.nPl.nPV = true;
            }
            this.nPl.a(localh.list, localh.nJI, localh.eTf, localh.nJJ);
            this.nPl.llU = 0;
            this.nPl.notifyDataSetChanged();
            if (this.nPl.eTf)
              break label1026;
            this.nPi.dzN();
            this.nPi.dzP();
            AppMethodBeat.o(113634);
            break;
            label740: localPoiHeaderView.setVisibility(0);
            localPoiHeaderView.eku.setVisibility(0);
            localPoiHeaderView.nMg.setVisibility(0);
            localPoiHeaderView.eku.setText((CharSequence)localObject);
            localObject = localPoiHeaderView.nMg;
            ((SimpleImageView)localObject).imagePath = paramm;
            ((SimpleImageView)localObject).url = paramString;
            ((SimpleImageView)localObject).eTi = 0;
            ((SimpleImageView)localObject).eTj = 0;
            if ((paramString == null) || (paramString.length() == 0))
            {
              ((SimpleImageView)localObject).setVisibility(8);
            }
            else if (paramString.startsWith("http"))
            {
              paramm = BitmapFactory.decodeFile(((SimpleImageView)localObject).imagePath + com.tencent.mm.a.g.x(paramString.getBytes()));
              if (paramm != null)
              {
                paramString = paramm;
                if (((SimpleImageView)localObject).eTi > 0)
                {
                  paramString = paramm;
                  if (((SimpleImageView)localObject).eTj > 0)
                    paramString = com.tencent.mm.sdk.platformtools.d.a(paramm, ((SimpleImageView)localObject).eTi, ((SimpleImageView)localObject).eTj, true, false);
                }
                ((SimpleImageView)localObject).setImageBitmap(paramString);
              }
              else
              {
                com.tencent.mm.sdk.g.d.post(new SimpleImageView.a(paramString, ((SimpleImageView)localObject).handler), "SimpleImageView_download");
              }
            }
            else if (!com.tencent.mm.vfs.e.ct(paramString))
            {
              ((SimpleImageView)localObject).setVisibility(8);
            }
            else
            {
              if ((((SimpleImageView)localObject).eTi <= 0) || (((SimpleImageView)localObject).eTj <= 0));
              for (paramString = com.tencent.mm.sdk.platformtools.d.aml(paramString); ; paramString = com.tencent.mm.sdk.platformtools.d.d(paramString, ((SimpleImageView)localObject).eTi, ((SimpleImageView)localObject).eTj, true))
              {
                if (paramString != null)
                  break label1017;
                ((SimpleImageView)localObject).setVisibility(8);
                break;
              }
              label1017: ((SimpleImageView)localObject).setImageBitmap(paramString);
            }
          }
          label1026: this.nPi.dzO();
          AppMethodBeat.o(113634);
        }
      }
    }
  }

  public final void xF(int paramInt)
  {
    AppMethodBeat.i(113635);
    ((FrameLayout.LayoutParams)this.nPC.getLayoutParams()).topMargin = paramInt;
    int i = BackwardSupportUtil.b.b(this.activity, 65.0F);
    ((FrameLayout.LayoutParams)this.nPo.getLayoutParams()).topMargin = (paramInt - i);
    i = (paramInt - this.nPF) / 2;
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.nPJ.getLayoutParams();
    if (paramInt == this.nPE)
      localLayoutParams.topMargin = BackwardSupportUtil.b.b(this.activity, -65.0F);
    while (true)
    {
      this.nPJ.requestLayout();
      this.nPF = paramInt;
      this.nPC.requestLayout();
      this.nPo.requestLayout();
      AppMethodBeat.o(113635);
      return;
      if (paramInt == this.nPD)
        localLayoutParams.topMargin = 0;
      else
        localLayoutParams.topMargin = (i + localLayoutParams.topMargin);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.c
 * JD-Core Version:    0.6.2
 */