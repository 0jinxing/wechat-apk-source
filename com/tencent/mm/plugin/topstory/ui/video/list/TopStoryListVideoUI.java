package com.tencent.mm.plugin.topstory.ui.video.list;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.System;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.v;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.topstory.a.c.j;
import com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI;
import com.tencent.mm.plugin.topstory.ui.video.l;
import com.tencent.mm.plugin.topstory.ui.video.n;
import com.tencent.mm.plugin.topstory.ui.video.n.1;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.plugin.topstory.ui.widget.TopStoryCommentFloatDialog;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.protocal.protobuf.bzs;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.protocal.protobuf.tn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xwalk.core.Log;

public class TopStoryListVideoUI extends TopStoryBaseVideoUI
  implements b
{
  com.tencent.mm.plugin.topstory.ui.widget.c sGA;
  View sGB;
  TopStoryCommentFloatDialog sGC;
  private boolean sGD;
  private ProgressDialog sGu;
  private View sGv;
  private View sGw;
  private View sGx;
  private Button sGy;
  View sGz;
  private View sHg;
  private TextView sHh;
  private e sHi;
  private com.tencent.mm.plugin.topstory.ui.video.fs.d sHj;
  private View sHk;
  private View sHl;
  View sHm;
  com.tencent.mm.plugin.topstory.ui.widget.c sHn;
  View sHo;
  private long sHp = 0L;

  private void cHg()
  {
    AppMethodBeat.i(2120);
    if (!this.sEt)
    {
      this.sGw.setVisibility(0);
      this.sGv.setVisibility(0);
    }
    while (true)
    {
      this.sEo.FM(0);
      AppMethodBeat.o(2120);
      return;
      this.sHl.setVisibility(0);
      this.sHk.setVisibility(0);
    }
  }

  public final boolean FC(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(2125);
    this.sGz.setVisibility(8);
    this.sHm.setVisibility(8);
    ab.i("MicroMsg.TopStory.TopStoryVideoUI", "tryToPlayPositionVideo %d", new Object[] { Integer.valueOf(paramInt) });
    try
    {
      if (this.sEt)
      {
        if (paramInt < this.sEd.getItemCount() - this.sEd.getFootersCount() - this.sEd.getHeadersCount())
        {
          this.sEb.smoothScrollToPosition(paramInt);
          AppMethodBeat.o(2125);
          return bool;
        }
        ab.w("MicroMsg.TopStory.TopStoryVideoUI", "tryToPlayPositionVideo fullScreen, position invalid, pos:%s, itemCount:%s, footer:%s, header:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.sEd.getItemCount()), Integer.valueOf(this.sEd.getFootersCount()), Integer.valueOf(this.sEd.getHeadersCount()) });
      }
      while (true)
      {
        AppMethodBeat.o(2125);
        bool = false;
        break;
        if (paramInt < this.sHi.getItemCount() - this.sHi.getFootersCount() - this.sHi.getHeadersCount())
        {
          this.sEa.a(this, this.sHi.getHeadersCount() + paramInt);
          AppMethodBeat.o(2125);
          break;
        }
        ab.w("MicroMsg.TopStory.TopStoryVideoUI", "tryToPlayPositionVideo, position invalid, pos:%s, itemCount:%s, footer:%s, header:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.sHi.getItemCount()), Integer.valueOf(this.sHi.getFootersCount()), Integer.valueOf(this.sHi.getHeadersCount()) });
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.w("MicroMsg.TopStory.TopStoryVideoUI", "tryToPlayPositionVideo Exception:%s", new Object[] { localException.getMessage() });
    }
  }

  public final void FJ(int paramInt)
  {
    AppMethodBeat.i(2128);
    boolean bool;
    if (Settings.System.getInt(getContentResolver(), "accelerometer_rotation", 0) == 1)
    {
      bool = true;
      ab.i("MicroMsg.TopStory.TopStoryVideoUI", "onDeviceOrientationChange, orientation: %s sysOrienOn: %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
      if (!bool)
        break label127;
      if ((paramInt != 90) && (paramInt != 270))
        break label96;
      if (!this.sEt)
        break label83;
      AppMethodBeat.o(2128);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label83: aFH();
      AppMethodBeat.o(2128);
      continue;
      label96: if ((paramInt == 180) || (paramInt == 0))
      {
        if (!this.sEt)
          AppMethodBeat.o(2128);
        else
          cGf();
      }
      else
        label127: AppMethodBeat.o(2128);
    }
  }

  public final void Kh()
  {
    AppMethodBeat.i(2113);
    super.Kh();
    if (cFT().xgH != null)
      this.sEo.d(cFT().xgH);
    AppMethodBeat.o(2113);
  }

  public final void a(bzs parambzs)
  {
    AppMethodBeat.i(2133);
    if (this.sEt)
      cGf();
    this.sEk.sEM = true;
    this.sEn.stopPlay();
    chw localchw = this.sEo.FL(cFY());
    chv localchv = com.tencent.mm.plugin.topstory.a.g.a(cFT());
    localchv.xgj = UUID.randomUUID().toString();
    localchv.xgC = localchw.xgS;
    localchv.xgG = parambzs.wYN;
    localchv.xgH = null;
    localchv.xgI = parambzs;
    localchv.xgJ = this.sEk.sEM;
    Iterator localIterator = localchv.tZG.iterator();
    tn localtn;
    while (localIterator.hasNext())
    {
      localtn = (tn)localIterator.next();
      if ("show_tag_list".equals(localtn.key))
        localtn.waE = parambzs.id;
    }
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
      {
        localtn = new tn();
        localtn.key = "show_tag_list";
        localtn.waE = parambzs.id;
        localchv.tZG.add(localtn);
      }
      aa.a(this, localchv);
      com.tencent.mm.plugin.websearch.api.a.a.kT(28);
      ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getReporter().a(cFT(), localchw, cFY(), 4, parambzs.cEh + ":" + parambzs.id);
      AppMethodBeat.o(2133);
      return;
    }
  }

  public final void a(chw paramchw, View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(2136);
    ab.i("MicroMsg.TopStory.TopStoryVideoUI", "onLikeSceneEnd vid:%s, thumb:%s", new Object[] { paramchw.xgS, Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
      if (this.sHm.getVisibility() == 0)
      {
        if ((this.sHn == null) || (this.sHn.fgd == null) || (!this.sHn.fgd.equals(paramchw.xgS)))
          break label149;
        this.sHm.setVisibility(8);
        AppMethodBeat.o(2136);
      }
    while (true)
    {
      return;
      if ((this.sGz.getVisibility() == 0) && (this.sGA != null) && (this.sGA.fgd != null) && (this.sGA.fgd.equals(paramchw.xgS)))
        this.sGz.setVisibility(8);
      label149: AppMethodBeat.o(2136);
      continue;
      Object localObject1 = System.currentTimeMillis();
      Object localObject2 = paramchw.ubA;
      Object localObject3 = paramchw.title;
      Object localObject4 = cFT().hlm;
      int i = cFT().scene;
      if (cGb());
      for (int j = 318; ; j = 317)
      {
        localObject3 = new com.tencent.mm.plugin.topstory.a.c.f((String)localObject1, (String)localObject2, "", "", "", "", (String)localObject3, (String)localObject4, i, j, paramchw.xgS, paramchw.xhi);
        if (!this.sEt)
          break label581;
        this.sHm.setVisibility(0);
        this.sGz.setVisibility(8);
        this.sHn = new com.tencent.mm.plugin.topstory.ui.widget.c(this.sHo, new TopStoryListVideoUI.2(this, paramchw), (com.tencent.mm.plugin.topstory.a.c.f)localObject3, paramchw.xgS);
        paramchw = this.sHn;
        localObject2 = paramView.getContext();
        localObject1 = paramchw.contentView;
        localObject3 = new int[2];
        localObject4 = new int[2];
        paramView.getLocationInWindow((int[])localObject4);
        paramView.getHeight();
        int k = paramView.getWidth();
        i = ae.hy((Context)localObject2).x;
        ((View)localObject1).measure(0, 0);
        int m = ((View)localObject1).getMeasuredHeight();
        j = ((View)localObject1).getMeasuredWidth();
        int n = localObject4[0];
        localObject3[0] = (k / 2 + n - j / 2);
        localObject4[1] -= m;
        Log.i("PopupUtil", "window pos x:" + localObject3[0] + ", windowWidth:" + j + ", screenWidth:" + i);
        if (localObject3[0] + j > i)
          localObject3[0] = (i - j);
        localObject3[0] += 0;
        localObject3[1] += 0;
        paramView = (LinearLayout.LayoutParams)paramchw.contentView.getLayoutParams();
        paramView.leftMargin = localObject3[0];
        paramView.topMargin = localObject3[1];
        paramchw.contentView.setLayoutParams(paramView);
        this.sHm.postDelayed(new TopStoryListVideoUI.3(this), 1800L);
        AppMethodBeat.o(2136);
        break;
      }
      label581: this.sHm.setVisibility(8);
      this.sGz.setVisibility(0);
      this.sGA = new com.tencent.mm.plugin.topstory.ui.widget.c(this.sGB, new TopStoryListVideoUI.4(this, paramchw), (com.tencent.mm.plugin.topstory.a.c.f)localObject3, paramchw.xgS);
      this.sGA.a(paramView, false, 0 - com.tencent.mm.plugin.topstory.ui.widget.f.dip2px(this, 10.0F));
      AppMethodBeat.o(2136);
    }
  }

  public final void aFH()
  {
    AppMethodBeat.i(2131);
    long l = System.currentTimeMillis();
    if (l - this.sHp < 1000L)
      AppMethodBeat.o(2131);
    while (true)
    {
      return;
      this.sHp = l;
      ab.d("MicroMsg.TopStory.TopStoryVideoUI", "enterFullScreen");
      if (this.sEn.sFu == null)
        break;
      this.sBa.xgM = this.sEn.sFu.getControlBar().getmPosition();
      if (this.sEn.sFu.getControlBar().getVideoTotalTime() - this.sBa.xgM >= 2)
        break;
      AppMethodBeat.o(2131);
    }
    md(false);
    this.sEt = true;
    this.sHm.setVisibility(8);
    this.sGz.setVisibility(8);
    if (!cGb())
      setRequestedOrientation(0);
    if ((this.sEq != null) && (this.sEq.isShowing()))
    {
      this.sEq.dismiss();
      this.sEq = null;
    }
    this.sHg.setVisibility(8);
    this.gnB.setVisibility(8);
    this.sDW.setVisibility(8);
    this.sDY.setVisibility(8);
    this.sEb.setVisibility(0);
    this.sHi.aop.notifyChanged();
    if (com.tencent.mm.kernel.g.RP().Ry().getInt(ac.a.xVO, 0) == 0)
    {
      this.sEn.cpN();
      this.sGx.setVisibility(0);
      this.sGx.setOnTouchListener(new TopStoryListVideoUI.11(this));
      this.sGy.setOnClickListener(new TopStoryListVideoUI.12(this));
    }
    while (true)
    {
      this.sHj.sFI = true;
      this.sEc.ah(cFT().xgL, 0);
      getSwipeBackLayout().setEnableGesture(false);
      md(true);
      AppMethodBeat.o(2131);
      break;
      this.sGx.setVisibility(8);
    }
  }

  public final void abH(String paramString)
  {
    AppMethodBeat.i(2127);
    al.d(new TopStoryListVideoUI.10(this, paramString));
    AppMethodBeat.o(2127);
  }

  public final void cFN()
  {
    AppMethodBeat.i(2122);
    if (!this.sEt)
      this.sHg.animate().alpha(1.0F).setDuration(200L).setStartDelay(1800L);
    while (true)
    {
      this.qpb.animate().alpha(0.1F).setDuration(200L).setStartDelay(1800L);
      if ((cFT().xgI != null) && (this.sHh != null))
        this.sHh.animate().alpha(0.1F).setDuration(200L).setStartDelay(1800L);
      AppMethodBeat.o(2122);
      return;
      this.sHm.setVisibility(8);
    }
  }

  public final void cFO()
  {
    AppMethodBeat.i(2123);
    this.qpb.animate().cancel();
    this.qpb.setAlpha(1.0F);
    if ((cFT().xgI != null) && (this.sHh != null))
      this.sHh.setAlpha(1.0F);
    AppMethodBeat.o(2123);
  }

  public final void cGC()
  {
    AppMethodBeat.i(2116);
    if (this.sEt)
    {
      cGf();
      AppMethodBeat.o(2116);
    }
    while (true)
    {
      return;
      if (this.sBa != null)
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("isMute", this.sBa.eif);
        localIntent.putExtra("MOBILE_CHECK_FLAG", this.sBa.xgO);
        setResult(-1, localIntent);
      }
      finish();
      AppMethodBeat.o(2116);
    }
  }

  public final void cGD()
  {
    AppMethodBeat.i(2117);
    super.cGD();
    this.sGx = findViewById(2131828300);
    this.sGy = ((Button)findViewById(2131828301));
    this.sHg = findViewById(2131828340);
    this.sHg.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(2097);
        if ((TopStoryListVideoUI.this.sEn.sFw) && (TopStoryListVideoUI.this.sEn.sFu.getItemUIComponent() != null))
        {
          TopStoryListVideoUI.this.sEn.sFu.getItemUIComponent().cFO();
          TopStoryListVideoUI.this.sEn.sFu.getItemUIComponent().cFN();
        }
        AppMethodBeat.o(2097);
      }
    });
    overridePendingTransition(MMFragmentActivity.a.ync, MMFragmentActivity.a.ynd);
    if (cFT().xgI != null)
      this.gnB.setVisibility(8);
    this.sEl.sFo = 2;
    if (cGI())
      if (this.sEk.isConnected())
      {
        cHg();
        this.sGD = false;
        if ((cFT().scene != 21) && (cFT().xgI == null))
          this.sGu = com.tencent.mm.ui.base.h.b(this, getString(2131300968), true, new TopStoryListVideoUI.5(this));
      }
    while (true)
    {
      this.sHi.sGI = true;
      if (cFT().xgJ)
        this.sEk.sEM = true;
      this.sDY.post(new TopStoryListVideoUI.6(this));
      new c(this).i(this.sDY);
      new com.tencent.mm.plugin.topstory.ui.video.fs.b().i(this.sEb);
      this.sGz = findViewById(2131828304);
      this.sGB = findViewById(2131828305);
      this.sGz.setVisibility(8);
      this.sHm = findViewById(2131828341);
      this.sHo = findViewById(2131828342);
      this.sHm.setVisibility(8);
      this.sGz.setOnTouchListener(new TopStoryListVideoUI.7(this));
      this.sHm.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          AppMethodBeat.i(2108);
          if (TopStoryListVideoUI.this.sHm.getVisibility() == 0)
          {
            float f1 = paramAnonymousMotionEvent.getX();
            float f2 = paramAnonymousMotionEvent.getY();
            if (TopStoryListVideoUI.g(TopStoryListVideoUI.this.sHo, f1, f2))
            {
              ab.i("MicroMsg.TopStory.TopStoryVideoUI", "touch in mContentViewFull");
              AppMethodBeat.o(2108);
            }
          }
          while (true)
          {
            return false;
            TopStoryListVideoUI.this.sHm.setVisibility(8);
            AppMethodBeat.o(2108);
          }
        }
      });
      this.sGC = ((TopStoryCommentFloatDialog)findViewById(2131828306));
      this.sGC.setVisibility(8);
      this.sGC.k(this);
      AppMethodBeat.o(2117);
      return;
      Toast.makeText(this, 2131302192, 1).show();
      this.sGD = true;
      continue;
      this.sGw.setVisibility(4);
      this.sGv.setVisibility(4);
    }
  }

  public final com.tencent.mm.plugin.topstory.ui.video.d cGE()
  {
    AppMethodBeat.i(2118);
    d locald = new d();
    AppMethodBeat.o(2118);
    return locald;
  }

  public final com.tencent.mm.plugin.topstory.ui.video.d cGF()
  {
    AppMethodBeat.i(2135);
    com.tencent.mm.plugin.topstory.ui.video.fs.c localc = new com.tencent.mm.plugin.topstory.ui.video.fs.c();
    AppMethodBeat.o(2135);
    return localc;
  }

  public final void cGG()
  {
    AppMethodBeat.i(2124);
    super.cGG();
    if ((!this.sEt) && (this.sHg.getAlpha() != 0.0F))
    {
      this.sHg.animate().cancel();
      this.sHg.setAlpha(0.0F);
    }
    AppMethodBeat.o(2124);
  }

  public final void cGH()
  {
    AppMethodBeat.i(2119);
    if (!this.sEt)
    {
      this.sGw.setVisibility(0);
      this.sGv.setVisibility(0);
    }
    while (true)
    {
      this.sEo.FM(this.sEo.cGR());
      AppMethodBeat.o(2119);
      return;
      this.sHl.setVisibility(0);
      this.sHk.setVisibility(0);
    }
  }

  public final com.tencent.mm.plugin.topstory.ui.video.e cGJ()
  {
    AppMethodBeat.i(2129);
    this.sHi = new e(this);
    e locale = this.sHi;
    View localView1 = LayoutInflater.from(this).inflate(2130970956, null);
    localView1.setClickable(false);
    localView1.setFocusableInTouchMode(false);
    localView1.setFocusable(false);
    Object localObject = localView1.findViewById(2131828331);
    View localView2 = localView1.findViewById(2131828332);
    if (cFT().xgI != null)
    {
      ((View)localObject).setVisibility(8);
      localView2.setVisibility(0);
      this.sHh = ((TextView)localView1.findViewById(2131828333));
      this.sHh.setText(cFT().xgI.title);
      localObject = (TextView)localView1.findViewById(2131828334);
      if (!bo.isNullOrNil(cFT().xgI.jcF))
        ((TextView)localObject).setText(cFT().xgI.jcF);
    }
    while (true)
    {
      localView1.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
      locale.addHeaderView(localView1);
      locale = this.sHi;
      localView1 = LayoutInflater.from(this).inflate(2130970958, null);
      localView1.setPadding(0, 0, 0, com.tencent.mm.bz.a.ge(this.mController.ylL) * 2 / 5 - getResources().getDimensionPixelSize(2131428726));
      localView1.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      this.sGw = localView1.findViewById(2131828338);
      this.sGv = localView1.findViewById(2131824238);
      locale.ei(localView1);
      locale = this.sHi;
      AppMethodBeat.o(2129);
      return locale;
      ((TextView)localObject).setVisibility(8);
      continue;
      ((View)localObject).setVisibility(0);
      localView2.setVisibility(8);
    }
  }

  public final com.tencent.mm.plugin.topstory.ui.video.e cGK()
  {
    AppMethodBeat.i(2130);
    this.sHj = new com.tencent.mm.plugin.topstory.ui.video.fs.d(this);
    com.tencent.mm.plugin.topstory.ui.video.fs.d locald = this.sHj;
    View localView = LayoutInflater.from(this).inflate(2130970958, null);
    localView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    this.sHl = localView.findViewById(2131828338);
    this.sHk = localView.findViewById(2131824238);
    locald.ei(localView);
    locald = this.sHj;
    AppMethodBeat.o(2130);
    return locald;
  }

  public final void cGf()
  {
    AppMethodBeat.i(2132);
    long l = System.currentTimeMillis();
    if (l - this.sHp < 1000L)
      AppMethodBeat.o(2132);
    while (true)
    {
      return;
      this.sHp = l;
      ab.d("MicroMsg.TopStory.TopStoryVideoUI", "exitFullScreen");
      if (this.sEn.sFu != null)
      {
        this.sBa.xgM = this.sEn.sFu.getControlBar().getmPosition();
        if (this.sEn.sFu.getControlBar().getVideoTotalTime() - this.sBa.xgM < 2)
          AppMethodBeat.o(2132);
      }
      else
      {
        md(false);
        this.sEt = false;
        this.sHm.setVisibility(8);
        this.sGz.setVisibility(8);
        if (!cGb())
          setRequestedOrientation(1);
        if ((this.sEq != null) && (this.sEq.isShowing()))
        {
          this.sEq.dismiss();
          this.sEq = null;
        }
        this.sHg.setVisibility(0);
        if (cFT().xgI == null)
          this.gnB.setVisibility(0);
        this.sDY.setVisibility(0);
        this.sEb.setVisibility(8);
        this.sHj.aop.notifyChanged();
        this.sGx.setVisibility(8);
        this.sHi.sGP = true;
        this.qYS.ah(cFT().xgL + this.sHi.getHeadersCount(), TopStoryBaseVideoUI.sDT);
        getSwipeBackLayout().setEnableGesture(true);
        md(true);
        AppMethodBeat.o(2132);
      }
    }
  }

  public final int cGk()
  {
    return 0;
  }

  public final void fP(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(2121);
    if (((paramInt2 == 2) || (paramInt2 == 1)) && (this.sGD))
      cHg();
    super.fP(paramInt1, paramInt2);
    AppMethodBeat.o(2121);
  }

  public final boolean fS(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    AppMethodBeat.i(2134);
    if (cFT().xgI == null)
      if ((paramInt1 > 30) && (paramInt1 / paramInt2 > 0.65F))
      {
        n localn = this.sEo;
        chv localchv = this.sBa;
        Object localObject = this.sEo.FL(cFY()).xgS;
        paramInt1 = this.sEo.cGR();
        localchv = com.tencent.mm.plugin.topstory.a.g.a(localchv);
        localchv.offset = paramInt1;
        localObject = new j(localchv, localn.sDo.cFY(), (String)localObject);
        com.tencent.mm.kernel.g.Rg().a((m)localObject, 0);
        com.tencent.mm.kernel.g.Rg().a(1943, new n.1(localn, (j)localObject));
        AppMethodBeat.o(2134);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(2134);
      bool = false;
      continue;
      AppMethodBeat.o(2134);
    }
  }

  public final int getForceOrientation()
  {
    AppMethodBeat.i(2114);
    int i;
    if ((this.sEt) && (!cGb()))
    {
      i = 0;
      AppMethodBeat.o(2114);
    }
    while (true)
    {
      return i;
      i = 1;
      AppMethodBeat.o(2114);
    }
  }

  public final int getLayoutId()
  {
    return 2130970959;
  }

  public final void i(List<chw> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(2126);
    super.i(paramList, paramBoolean);
    al.n(new TopStoryListVideoUI.9(this), 50L);
    AppMethodBeat.o(2126);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(2115);
    com.tencent.mm.plugin.topstory.ui.video.p.sFq.a(this, paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 10001)
    {
      RecyclerView.v localv = d.f(this);
      if ((localv != null) && ((localv instanceof com.tencent.mm.plugin.topstory.ui.video.h)))
        ((com.tencent.mm.plugin.topstory.ui.video.h)localv).mc(false);
      if ((paramIntent != null) && (paramIntent.hasExtra("isMute")) && (this.sBa != null))
        me(paramIntent.getBooleanExtra("isMute", this.sBa.eif));
      if ((paramIntent != null) && (paramIntent.hasExtra("MOBILE_CHECK_FLAG")) && (this.sBa != null))
        FE(paramIntent.getIntExtra("MOBILE_CHECK_FLAG", this.sBa.xgO));
    }
    AppMethodBeat.o(2115);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(2112);
    if (Build.VERSION.SDK_INT >= 28)
      this.ylm = true;
    super.onCreate(paramBundle);
    ((com.tencent.mm.plugin.boots.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.boots.a.c.class)).dC(com.tencent.mm.plugin.boots.a.b.jJr, 885);
    com.tencent.mm.plugin.websearch.api.a.a.kT(13);
    AppMethodBeat.o(2112);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(2139);
    super.onDestroy();
    this.sGC.sIl.close();
    AppMethodBeat.o(2139);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(2140);
    boolean bool;
    if ((paramInt == 4) && (this.sGC.getVisibility() == 0))
    {
      this.sGC.hide();
      bool = true;
      AppMethodBeat.o(2140);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(2140);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(2137);
    super.onPause();
    this.sGC.onPause();
    AppMethodBeat.o(2137);
  }

  public void onResume()
  {
    AppMethodBeat.i(2138);
    super.onResume();
    this.sGC.onResume();
    AppMethodBeat.o(2138);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI
 * JD-Core Version:    0.6.2
 */