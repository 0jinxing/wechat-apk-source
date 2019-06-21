package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AbsListView;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.g.a.db;
import com.tencent.mm.plugin.appbrand.widget.desktop.b.c;
import com.tencent.mm.plugin.appbrand.widget.desktop.b.d.1;
import com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.DynamicBackgroundGLSurfaceView;
import com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GameGLSurfaceView;
import com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GameGLSurfaceView.j;
import com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GradientColorBackgroundView;
import com.tencent.mm.plugin.appbrand.widget.header.GyroView;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ak;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public final class a extends com.tencent.mm.plugin.appbrand.widget.header.b
{
  private View aus;
  private View iJO;
  private boolean iVA;
  private View iVB;
  private int iVC;
  private int iVD;
  private Runnable iVE;
  private Runnable iVF;
  private Runnable iVG;
  private Runnable iVH;
  private boolean iVI;
  private boolean iVJ;
  private boolean iVK;
  private boolean iVL;
  private boolean iVM;
  private int iVN;
  private boolean iVO;
  private boolean iVP;
  private boolean iVQ;
  private boolean iVR;
  private boolean iVS;
  private int iVT;
  private boolean iVU;
  private boolean iVV;
  private Runnable iVW;
  private boolean iVX;
  private PointF iVY;
  private PointF iVZ;
  private HeaderContainer iVo;
  private float iVp;
  private float iVq;
  private int iVr;
  private int iVs;
  private Vibrator iVt;
  private int iVu;
  private com.tencent.mm.plugin.appbrand.widget.header.a iVv;
  private DynamicBackgroundGLSurfaceView iVw;
  private View iVx;
  private boolean iVy;
  private boolean iVz;
  private boolean iWa;
  private Runnable iWb;
  private boolean iWc;
  private GyroView iWd;
  private View iWe;
  private boolean iWf;
  private boolean iWg;
  private boolean iWh;
  private Context mContext;
  private ListView mListView;

  public a(Context paramContext, ListView paramListView, HeaderContainer paramHeaderContainer)
  {
    AppMethodBeat.i(133676);
    this.iVp = 0.3F;
    this.iVq = 0.05F;
    this.iVr = 0;
    this.iVs = 0;
    this.iVy = true;
    this.iVz = false;
    this.iVA = false;
    this.iVC = 0;
    this.iVD = 0;
    this.iVE = null;
    this.iVF = null;
    this.iVG = null;
    this.iVH = null;
    this.iVI = false;
    this.iVJ = false;
    this.iVK = true;
    this.iVL = false;
    this.iVM = false;
    this.iVN = 0;
    this.iVO = false;
    this.iVP = true;
    this.iVQ = true;
    this.iVR = false;
    this.iVS = false;
    this.iVT = -2;
    this.iVU = false;
    this.iVV = false;
    this.iVY = new PointF();
    this.iVZ = new PointF();
    this.iWa = false;
    this.iWb = new a.6(this);
    this.iWc = true;
    this.iWf = true;
    this.iWg = false;
    this.iWh = false;
    this.mContext = paramContext;
    this.mListView = paramListView;
    this.iVo = paramHeaderContainer;
    this.iVt = ((Vibrator)paramContext.getSystemService("vibrator"));
    this.iVu = (ak.de(this.mContext) + ak.J(this.mContext, 0));
    boolean bool = paramListView.post(new a.1(this));
    this.iVQ = b.aPe();
    ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo init AppBrandDesktopAnimController isEnableDynamicBackground: %b mScrollOffset:%s ret:%s", new Object[] { Boolean.valueOf(this.iVQ), Integer.valueOf(this.iVu), Boolean.valueOf(bool) });
    aOY();
    aOZ();
    aOR();
    AppMethodBeat.o(133676);
  }

  private void aOR()
  {
    AppMethodBeat.i(133677);
    this.iVC = (this.mContext.getResources().getDisplayMetrics().heightPixels / 4);
    this.iVD = this.iVC;
    ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo configAnim mStartAlphaAnimDisFromBottom: %d, mAlphaAnimationDistance: %d", new Object[] { Integer.valueOf(this.iVC), Integer.valueOf(this.iVD) });
    AppMethodBeat.o(133677);
  }

  private boolean aOT()
  {
    boolean bool = true;
    AppMethodBeat.i(133681);
    int i = this.iVo.getBottom();
    if (!aOW())
      if (i > aOX())
        AppMethodBeat.o(133681);
    while (true)
    {
      return bool;
      AppMethodBeat.o(133681);
      bool = false;
      continue;
      if (this.iVs == 0)
        this.iVs = ((int)(this.iVo.getHeight() * this.iVq));
      if (i < this.iVs)
      {
        AppMethodBeat.o(133681);
      }
      else
      {
        AppMethodBeat.o(133681);
        bool = false;
      }
    }
  }

  private void aOU()
  {
    AppMethodBeat.i(133687);
    if (this.iVE != null)
      al.af(this.iVE);
    if (this.iVK)
    {
      a.9 local9 = new a.9(this);
      this.iVE = local9;
      al.n(local9, 500L);
      AppMethodBeat.o(133687);
    }
    while (true)
    {
      return;
      aPb();
      AppMethodBeat.o(133687);
    }
  }

  private boolean aOW()
  {
    AppMethodBeat.i(133691);
    boolean bool;
    if ((Math.abs(this.iVZ.y - this.iVY.y) <= 5.0F) || (this.iVZ.y <= this.iVY.y))
    {
      bool = true;
      AppMethodBeat.o(133691);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(133691);
    }
  }

  private int aOX()
  {
    AppMethodBeat.i(133692);
    if (this.iVr == 0)
      this.iVr = ((int)(this.iVo.getHeight() * this.iVp));
    int i = this.iVr;
    AppMethodBeat.o(133692);
    return i;
  }

  private void aOY()
  {
    AppMethodBeat.i(133693);
    if (this.iWe != null)
    {
      this.iWe.setTranslationY(aOX() * 2);
      this.iWe.setAlpha(0.0F);
    }
    this.iWh = true;
    this.iWf = true;
    AppMethodBeat.o(133693);
  }

  private void aOZ()
  {
    AppMethodBeat.i(133694);
    if (this.iWd != null)
    {
      this.iWd.b(0.0F, aOX());
      this.iWd.setTranslationY(0.0F);
    }
    AppMethodBeat.o(133694);
  }

  private void aPa()
  {
    AppMethodBeat.i(133695);
    if (this.iVw != null)
    {
      this.iVw.setVisibility(0);
      this.iVw.setShowGradientView(false);
    }
    AppMethodBeat.o(133695);
  }

  private void aPb()
  {
    AppMethodBeat.i(133696);
    boolean bool1 = this.iVQ;
    if ((b.aPe()) && (this.iVw != null));
    for (boolean bool2 = true; ; bool2 = false)
    {
      this.iVQ = bool2;
      aPc();
      ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo hideBackgroundView refresh isEnableDynamicBackground: %b, lastEnable: %b", new Object[] { Boolean.valueOf(this.iVQ), Boolean.valueOf(bool1) });
      if ((!this.iVK) || (!aOV()))
        break;
      AppMethodBeat.o(133696);
      return;
    }
    if (bool1)
      if ((this.iVw != null) && (!this.iVy))
      {
        ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo hideBackgroundView SurfaceView onPause and set GONE");
        this.iVw.iZQ.onPause();
        this.iVy = true;
        this.iVz = true;
        this.iVw.setVisibility(8);
      }
    while (true)
    {
      if (this.iVB != null)
      {
        ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo hideBackgroundView GradientColorView set GONE");
        this.iVB.setVisibility(8);
      }
      AppMethodBeat.o(133696);
      break;
      if (this.iVw != null)
      {
        ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo hideBackgroundView SurfaceView set GONE");
        this.iVw.setVisibility(8);
      }
    }
  }

  private void aPc()
  {
    AppMethodBeat.i(133698);
    if ((this.iVB instanceof GradientColorBackgroundView))
      ((GradientColorBackgroundView)this.iVB).setUpdateMode(1);
    AppMethodBeat.o(133698);
  }

  private void aw(float paramFloat)
  {
    AppMethodBeat.i(133699);
    if (this.iVv != null)
      this.iVv.a(paramFloat, 0, 0, 0);
    AppMethodBeat.o(133699);
  }

  private void eS(boolean paramBoolean)
  {
    AppMethodBeat.i(133689);
    if ((this.iVo.isFullScreen()) && (paramBoolean != this.iWc))
    {
      this.iWc = paramBoolean;
      db localdb = new db();
      localdb.cwi.enable = paramBoolean;
      com.tencent.mm.sdk.b.a.xxA.m(localdb);
    }
    AppMethodBeat.o(133689);
  }

  public final void F(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(138153);
    ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo setActionDownEvent %d, x: %f, y: %f", new Object[] { Integer.valueOf(paramMotionEvent.getAction()), Float.valueOf(paramMotionEvent.getRawX()), Float.valueOf(paramMotionEvent.getRawY()) });
    this.mListView.removeCallbacks(this.iVW);
    this.mListView.removeCallbacks(this.iVF);
    this.iVY.set(paramMotionEvent.getRawX(), paramMotionEvent.getRawY());
    this.iVV = false;
    AppMethodBeat.o(138153);
  }

  public final void aOS()
  {
    AppMethodBeat.i(133678);
    ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo openHeader isVisibleHeader: %b, headerOpen: %b", new Object[] { Boolean.valueOf(aOV()), Boolean.valueOf(this.iVR) });
    if (!aOV())
      AppMethodBeat.o(133678);
    while (true)
    {
      return;
      if ((this.iWf) && (this.iWg))
        ay.gL(this.mContext);
      this.iVU = true;
      this.iVM = false;
      this.mListView.removeCallbacks(this.iVW);
      Object localObject = this.mListView;
      a.3 local3 = new a.3(this);
      this.iVW = local3;
      ((ListView)localObject).post(local3);
      if (!this.iVQ)
      {
        ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo checkAndStartPerformanceMonitor not enableNativeBackground not need to monitor");
        AppMethodBeat.o(133678);
      }
      else
      {
        localObject = com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b.iZg;
        if (!com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b.aPA())
        {
          ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo checkAndStartPerformanceMonitor no need to check");
          AppMethodBeat.o(133678);
        }
        else
        {
          ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo checkAndStartPerformanceMonitor hasStartMonitor: %b, hasDelayStopMonitor: %b", new Object[] { Boolean.valueOf(this.iVI), Boolean.valueOf(this.iVJ) });
          if ((!this.iVI) && (!this.iVJ))
          {
            this.iVI = true;
            if (this.iVG != null)
              com.tencent.mm.sdk.g.d.xDG.remove(this.iVG);
            this.iVG = new Runnable()
            {
              public final void run()
              {
                AppMethodBeat.i(133675);
                com.tencent.mm.plugin.appbrand.widget.desktop.b.d locald;
                if (!c.jbx.eCM)
                {
                  ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo doStart performanceMonitor");
                  ??? = c.jbx;
                  if (!((c)???).eCM)
                  {
                    ((c)???).eCM = true;
                    ab.i("MicroMsg.Metronome", "[start] stack:%s", new Object[] { bo.dpG() });
                    ((c)???).bsZ.postFrameCallback((Choreographer.FrameCallback)???);
                  }
                  locald = com.tencent.mm.plugin.appbrand.widget.desktop.b.d.jbz;
                }
                synchronized (locald.eCR)
                {
                  if (locald.isRunning)
                  {
                    ab.w("MicroMsg.PerformanceMonitor", "alvinluo already running and ignore this requestStartMonitor. If you want run a new one, stop first.");
                    a.n(a.this);
                    AppMethodBeat.o(133675);
                    return;
                  }
                  if (locald.mTimer != null)
                    locald.mTimer.cancel();
                  System.gc();
                  Object localObject3 = new java/util/Timer;
                  ((Timer)localObject3).<init>("Handle_Monitor_mem_cpu", true);
                  locald.mTimer = ((Timer)localObject3);
                  locald.eCQ.clear();
                  Object localObject4 = locald.eCQ;
                  localObject3 = new com/tencent/mm/plugin/appbrand/widget/desktop/b/a;
                  ((com.tencent.mm.plugin.appbrand.widget.desktop.b.a)localObject3).<init>();
                  ((HashMap)localObject4).put(Integer.valueOf(1), localObject3);
                  localObject4 = locald.mTimer;
                  localObject3 = new com/tencent/mm/plugin/appbrand/widget/desktop/b/d$1;
                  ((d.1)localObject3).<init>(locald);
                  ((Timer)localObject4).scheduleAtFixedRate((TimerTask)localObject3, 0L, 5L);
                  locald.isRunning = true;
                }
              }
            };
            ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo execute startMonitorRunnable");
            com.tencent.mm.sdk.g.d.xDG.b(this.iVG, "AppBrandDesktopPerformanceMonitor");
          }
          AppMethodBeat.o(133678);
        }
      }
    }
  }

  public final boolean aOV()
  {
    AppMethodBeat.i(133690);
    boolean bool;
    if ((this.iVo.getBottom() >= 10) && (this.mListView.getFirstVisiblePosition() == 0))
    {
      bool = true;
      AppMethodBeat.o(133690);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(133690);
    }
  }

  public final void c(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(133680);
    super.c(paramLong, paramInt, paramBoolean);
    ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo closeHeader delay: %d, type: %d fast:%s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (this.iVF != null)
      this.mListView.removeCallbacks(this.iVF);
    ListView localListView = this.mListView;
    a.5 local5 = new a.5(this, paramBoolean, paramInt);
    this.iVF = local5;
    localListView.postDelayed(local5, paramLong);
    AppMethodBeat.o(133680);
  }

  public final void cD(View paramView)
  {
    this.iJO = paramView;
  }

  public final void e(View paramView1, View paramView2)
  {
    AppMethodBeat.i(133697);
    if ((paramView1 instanceof DynamicBackgroundGLSurfaceView))
      this.iVw = ((DynamicBackgroundGLSurfaceView)paramView1);
    if (this.iVw == null)
      this.iVQ = false;
    this.iVB = paramView2;
    if ((this.iVw != null) && ((this.iVB instanceof GradientColorBackgroundView)))
    {
      this.iVw.setGradientBackgroundView((GradientColorBackgroundView)this.iVB);
      aPc();
    }
    AppMethodBeat.o(133697);
  }

  public final void eQ(boolean paramBoolean)
  {
    AppMethodBeat.i(133685);
    super.eQ(paramBoolean);
    this.iVR = true;
    if ((this.iVB != null) && (this.iVB.getVisibility() == 0))
      this.iVB.invalidate();
    ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo onOpenHeader isToClose: %b, isEnableDynamicBackgroud: %b", new Object[] { Boolean.valueOf(this.iVM), Boolean.valueOf(this.iVQ) });
    if (this.aus == null)
      AppMethodBeat.o(133685);
    while (true)
    {
      return;
      if (this.iVM)
      {
        AppMethodBeat.o(133685);
      }
      else if (!aOV())
      {
        ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo onOpen header not visible");
        this.aus.setTranslationY(0.0F);
        AppMethodBeat.o(133685);
      }
      else
      {
        this.aus.animate().translationY(this.aus.getHeight()).setDuration(260L).setListener(new a.7(this)).start();
        AppMethodBeat.o(133685);
      }
    }
  }

  public final void eR(boolean paramBoolean)
  {
    AppMethodBeat.i(133686);
    super.eR(paramBoolean);
    this.iVR = false;
    aOZ();
    aOU();
    if (this.aus == null)
    {
      AppMethodBeat.o(133686);
      return;
    }
    this.aus.setVisibility(0);
    ViewPropertyAnimator localViewPropertyAnimator = this.aus.animate().translationY(0.0F);
    if (this.aus.getTranslationY() == 0.0F);
    for (long l = 130L; ; l = 260L)
    {
      localViewPropertyAnimator.setDuration(l).setListener(new a.8(this)).start();
      AppMethodBeat.o(133686);
      break;
    }
  }

  public final void gY()
  {
    AppMethodBeat.i(133688);
    aOR();
    this.iVP = false;
    AppMethodBeat.o(133688);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(133701);
    ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo DesktopAnimController onDestroy");
    if (this.mListView != null)
    {
      if (this.iVF != null)
      {
        this.mListView.removeCallbacks(this.iVF);
        this.iVF = null;
      }
      if (this.iVE != null)
      {
        this.mListView.removeCallbacks(this.iVE);
        this.iVE = null;
      }
    }
    com.tencent.mm.sdk.g.d.xDG.remove("AppBrandDesktopPerformanceMonitor");
    com.tencent.mm.plugin.appbrand.widget.desktop.b.d.jbz.Pz();
    com.tencent.mm.plugin.appbrand.widget.desktop.b.d.jbz.release();
    this.iVI = false;
    AppMethodBeat.o(133701);
  }

  public final void onResume()
  {
    AppMethodBeat.i(133700);
    super.onResume();
    ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo onResume isVisibleHeader: %b, bottom: %d, height: %d", new Object[] { Boolean.valueOf(aOV()), Integer.valueOf(this.iVo.getBottom()), Integer.valueOf(this.iVo.getHeight()) });
    if ((aOV()) && (this.iVo.getBottom() < this.iVo.getHeight()))
      if (this.iVZ.y - this.iVY.y > 50.0F)
      {
        ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo onResume openHeader");
        aOS();
        AppMethodBeat.o(133700);
      }
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo onResume closeHeader");
      qh(4);
      AppMethodBeat.o(133700);
    }
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(133684);
    if ((paramAbsListView.isInLayout()) && (!this.iVM) && (this.iVo.getBottom() < this.iVo.getHeight()) && (this.iVR))
    {
      ab.i("MicroMsg.AppBrandDesktopAnimController", "isInLayout");
      qh(0);
      AppMethodBeat.o(133684);
      return;
    }
    if ((this.iVV) && (!this.iVU) && (this.iVX) && (paramInt1 <= 0) && (aOV()))
    {
      ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo [onScroll] stop fling!");
      this.mListView.scrollBy(0, 0);
      qh(4);
    }
    boolean bool1 = this.iVX;
    boolean bool2 = this.iVV;
    boolean bool3;
    label140: label314: label329: label374: float f1;
    label575: label708: float f2;
    if (this.iVo != null)
    {
      bool3 = true;
      ab.d("MicroMsg.AppBrandDesktopAnimController", "alvinluo onScroll isFling: %b, firstVisibleItem: %d, visibleItemCount: %d, totalItemCount: %d,isNeedCheckStopFling: %b, mHeaderContainer != null: %b", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      if ((!this.iVV) && (paramInt1 == 0) && (this.iVo != null))
      {
        paramInt3 = this.iVo.getBottom();
        ab.d("MicroMsg.AppBrandDesktopAnimController", "alvinluo onDragHeader disX: %d, disY: %d, mScrollOffset: %d, headerContainer height: %d, headerContainer bottom: %d, canShowSurfaceView: %b", new Object[] { Integer.valueOf(0), Integer.valueOf(paramInt3), Integer.valueOf(this.iVu), Integer.valueOf(this.iVo.getHeight()), Integer.valueOf(this.iVo.getBottom()), Boolean.valueOf(this.iVA) });
        if ((this.iVw != null) && (this.iVB != null))
          break label959;
        if (this.iVP)
          break label1081;
        ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo onDragHeader disableUpdateListAlpha");
      }
      if ((this.mListView != null) && ((Build.VERSION.SDK_INT < 23) || (h.Mt())) && (Build.VERSION.SDK_INT >= 21))
      {
        if ((!aOV()) || (!this.iVR))
          break label1334;
        paramInt1 = 1;
        if (paramInt1 == 0)
        {
          if ((this.iVo != null) && (this.iVo.getBottom() <= this.iVu + 20))
          {
            if (this.iVB != null)
              this.iVB.setVisibility(8);
            if (this.iVw != null)
            {
              this.iVw.iZQ.onPause();
              this.iVy = true;
              this.iVz = true;
              this.iVw.setVisibility(8);
            }
          }
          if ((this.mListView.getFirstVisiblePosition() > 0) || ((this.mListView.getFirstVisiblePosition() == 0) && (!aOV())))
          {
            this.mListView.setBackgroundColor(this.mListView.getResources().getColor(2131690597));
            if (this.iVx != null)
              this.iVx.setBackgroundColor(this.mContext.getResources().getColor(2131690597));
            if (this.iVB != null)
              this.iVB.setVisibility(4);
          }
        }
      }
      if (aOV())
        break label1362;
      this.iVV = true;
      if ((aOT()) || (!this.iVS))
        break label1339;
      t(false, true);
      paramInt2 = aOX();
      if (this.iWd == null)
        this.iWd = ((GyroView)this.iVo.findViewById(2131820627));
      if (this.iWe == null)
      {
        this.iWe = this.iVo.findViewById(2131820554);
        this.iWe.setTranslationY(paramInt2 * 2);
      }
      paramInt1 = this.iVo.getBottom();
      if (((!this.iVX) && (paramInt1 >= 5)) || (this.iVL))
      {
        if (paramInt2 < paramInt1)
          break label1370;
        this.iWd.b(paramInt1, paramInt2);
        this.iWd.setTranslationY(-paramInt1 / 2 + this.iWd.getHeight() / 2 + this.iVo.getPaddingBottom());
      }
      if (this.iWf)
      {
        f1 = this.iVo.getHeight();
        paramInt3 = (int)(paramInt2 * 2 * 1.0F * paramInt1 / f1);
        this.iWe.setTranslationY(paramInt2 * 2 - paramInt3);
        ab.d("MicroMsg.AppBrandDesktopAnimController", "[transHeader] TranY:" + (paramInt2 * 2 - paramInt3));
        f2 = 1.0F * (paramInt1 - paramInt2) / (f1 - paramInt2);
        f1 = f2;
        if (f2 < 0.0F)
          f1 = 0.0F;
        this.iWe.setAlpha(f1);
        this.iWd.setAlpha((1.2F * paramInt2 - paramInt1) / paramInt2);
      }
      if ((paramInt2 <= paramInt1) && (this.iWh) && (aOV()) && (!paramAbsListView.isInLayout()))
      {
        this.iVt.vibrate(10L);
        this.iWh = false;
      }
      if (this.iWe.getTranslationY() <= 10.0F)
        this.iWf = false;
      if (paramInt1 < 50)
        aOY();
      this.iWa = aOV();
      if (!aOV())
        break label1383;
      eS(false);
    }
    while (true)
    {
      al.af(this.iWb);
      al.n(this.iWb, 60L);
      AppMethodBeat.o(133684);
      break;
      bool3 = false;
      break label140;
      label959: if (this.iVQ)
      {
        if ((!aOV()) || (!this.iVy) || (!this.iVA))
          break label314;
        this.iVy = false;
        aPa();
        if (!this.iVz)
          break label314;
        ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo showSurfaceView onResume");
        this.iVw.onResume();
        this.iVz = false;
        break label314;
      }
      this.iVy = true;
      this.iVz = true;
      this.iVw.setVisibility(8);
      this.iVw.iZQ.onPause();
      if (!aOV())
        break label314;
      this.iVB.setAlpha(1.0F);
      this.iVB.setVisibility(0);
      break label314;
      label1081: if (this.iJO == null)
        break label329;
      paramInt3 -= this.iVo.getHeight() - this.iVC;
      f2 = paramInt3 * 1.0F / this.iVD;
      f1 = f2;
      if (f2 < 0.0F)
        f1 = 0.0F;
      if (f1 > 1.0F)
      {
        f1 = 1.0F;
        if (paramInt3 < 0)
          break label1219;
        aw(0.0F);
        label1152: if (Math.abs(1.0F - f1) > 0.01D)
          break label1227;
        aw(0.0F);
      }
      while (true)
      {
        for (paramInt3 = paramInt1; paramInt3 < paramInt1 + paramInt2; paramInt3++)
        {
          View localView = paramAbsListView.getChildAt(paramInt3);
          if ((localView != null) && (paramInt3 != 0))
            localView.setAlpha(1.0F - f1);
        }
        break;
        label1219: aw(1.0F);
        break label1152;
        label1227: aw(1.0F - f1);
      }
      if (f1 == 0.0F)
      {
        paramAbsListView.setBackgroundColor(this.mContext.getResources().getColor(2131690311));
        if (this.iVB == null)
          break label329;
        ab.d("MicroMsg.AppBrandDesktopAnimController", "alvinluo onDragHeader show GradientBackgroundView");
        this.iVB.setAlpha(1.0F);
        this.iVB.setVisibility(0);
        break label329;
      }
      if (f1 != 1.0F)
        break label329;
      if (this.iVQ)
        aPa();
      paramAbsListView.setBackgroundColor(this.mContext.getResources().getColor(2131690597));
      break label329;
      label1334: paramInt1 = 0;
      break label374;
      label1339: if ((!this.iWa) || (!this.iVS))
        break label575;
      t(false, true);
      break label575;
      label1362: this.iVV = false;
      break label575;
      label1370: this.iWd.b(paramInt2, paramInt2);
      break label708;
      label1383: eS(true);
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(133683);
    ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo onScrollStateChanged scrollState: %d, isMoveUp: %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(aOW()) });
    this.iVA = true;
    int i = this.iVT;
    this.iVT = paramInt;
    if ((paramInt == 0) || (paramInt == -1))
    {
      this.iVS = false;
      if ((this.iVU) && (paramInt == 0))
      {
        ab.i("MicroMsg.AppBrandDesktopAnimController", "isScrollingByAnim True!!!");
        this.iVU = false;
        if (i == -1)
        {
          ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo onScrollStateChanged checkOpen: %b", new Object[] { Boolean.valueOf(aOT()) });
          if ((this.iVo.getBottom() < 200) || (this.mListView.getFirstVisiblePosition() != 0) || (this.iVR))
            break label184;
          paramInt = 1;
          if ((paramInt != 0) && (aOT()))
          {
            ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo onScrollStateChanged header is visible but not open");
            this.iVM = false;
            t(true, false);
          }
        }
        AppMethodBeat.o(133683);
      }
    }
    while (true)
    {
      return;
      label184: paramInt = 0;
      break;
      if (aOT())
      {
        aOS();
        AppMethodBeat.o(133683);
      }
      else if ((aOW()) && (paramInt == -1))
      {
        ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo onScrollStateChanged closeHeader");
        qh(4);
        AppMethodBeat.o(133683);
      }
      else if (paramInt == -1)
      {
        ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo onScrollStateChanged closeHeader auto");
        qh(0);
        this.iVL = true;
        AppMethodBeat.o(133683);
        continue;
        if (paramInt == 2)
        {
          this.iVX = true;
          this.iVS = true;
          AppMethodBeat.o(133683);
        }
        else if (paramInt == 1)
        {
          this.iVX = false;
          this.iVP = true;
          this.iVS = true;
          if (aOW())
          {
            this.iVX = false;
            this.iVN = 4;
          }
        }
      }
      else
      {
        AppMethodBeat.o(133683);
      }
    }
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(133682);
    if (paramMotionEvent.getAction() == 0)
      F(paramMotionEvent);
    while (true)
    {
      AppMethodBeat.o(133682);
      return false;
      if ((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1))
      {
        this.iVZ.set(paramMotionEvent.getRawX(), paramMotionEvent.getRawY());
        if ((this.iVo != null) && (this.iVo.getBackUpFooterRect().contains((int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY())) && (aOW()))
        {
          if (this.iVN == 0)
            this.iVN = 12;
          ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo onTouch ActionUp reason: %d", new Object[] { Integer.valueOf(this.iVN) });
        }
        onScrollStateChanged(this.mListView, -1);
      }
    }
  }

  public final void qh(int paramInt)
  {
    AppMethodBeat.i(133679);
    ab.i("MicroMsg.AppBrandDesktopAnimController", "alvinluo closeHeader isVisibleHeader: %b, reason: %d", new Object[] { Boolean.valueOf(aOV()), Integer.valueOf(paramInt) });
    this.iVM = true;
    eS(true);
    if (!aOV())
    {
      eR(false);
      AppMethodBeat.o(133679);
    }
    while (true)
    {
      return;
      this.iVU = true;
      this.mListView.removeCallbacks(this.iVW);
      ListView localListView = this.mListView;
      a.4 local4 = new a.4(this, paramInt);
      this.iVW = local4;
      localListView.post(local4);
      AppMethodBeat.o(133679);
    }
  }

  public final void setActionBarUpdateCallback(com.tencent.mm.plugin.appbrand.widget.header.a parama)
  {
    this.iVv = parama;
  }

  public final void setStatusBarMaskView(View paramView)
  {
    this.iVx = paramView;
  }

  public final void setTabView(View paramView)
  {
    this.aus = paramView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.a
 * JD-Core Version:    0.6.2
 */