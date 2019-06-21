package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.appusage.ag;
import com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.DynamicBackgroundGLSurfaceView;
import com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GameGLSurfaceView;
import com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GameGLSurfaceView.j;
import com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GradientColorBackgroundView;
import com.tencent.mm.plugin.appbrand.widget.header.GyroView;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;
import com.tencent.mm.plugin.appbrand.widget.header.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMFragmentActivity;

public class AppBrandDesktopContainer extends HeaderContainer
  implements View.OnTouchListener
{
  private DynamicBackgroundGLSurfaceView iVw;
  private MMFragmentActivity iWA;
  private boolean iWB;
  private int iWC;
  private int iWD;
  private GyroView iWd;
  private com.tencent.mm.plugin.appbrand.widget.header.b iWv;
  private AppBrandDesktopView iWw;
  private GradientColorBackgroundView iWx;
  private Rect iWy;
  private View iWz;

  public AppBrandDesktopContainer(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(133713);
    this.iWy = new Rect();
    this.iWB = true;
    this.iWC = 0;
    this.iWD = 0;
    init(paramContext);
    AppMethodBeat.o(133713);
  }

  public AppBrandDesktopContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(133714);
    this.iWy = new Rect();
    this.iWB = true;
    this.iWC = 0;
    this.iWD = 0;
    init(paramContext);
    AppMethodBeat.o(133714);
  }

  public AppBrandDesktopContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(133715);
    this.iWy = new Rect();
    this.iWB = true;
    this.iWC = 0;
    this.iWD = 0;
    init(paramContext);
    AppMethodBeat.o(133715);
  }

  private void aPh()
  {
    AppMethodBeat.i(133718);
    if (getResources().getConfiguration().orientation == 1)
    {
      this.iWC = getResources().getDimensionPixelSize(2131428436);
      AppMethodBeat.o(133718);
    }
    while (true)
    {
      return;
      this.iWC = getResources().getDimensionPixelSize(2131428437);
      AppMethodBeat.o(133718);
    }
  }

  private int getStatusbarHeight()
  {
    AppMethodBeat.i(133721);
    int i = getResources().getIdentifier("status_bar_height", "dimen", "android");
    int j = 0;
    if (i > 0)
      j = getResources().getDimensionPixelSize(i);
    AppMethodBeat.o(133721);
    return j;
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(133719);
    ab.i("MicroMsg.AppBrandDesktopContainer", "alvinluo HeaderContainer init");
    aPh();
    setBackgroundColor(getResources().getColor(2131690597));
    Object localObject = com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b.iZg;
    com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.b.aPB();
    this.iWw = new AppBrandDesktopView(paramContext);
    this.iWw.setHeaderContainer(this);
    this.iWw.setId(2131820554);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    int i = this.iWw.getLeftRightMargin();
    ab.i("MicroMsg.AppBrandDesktopContainer", "alvinluo desktop view topMargin: %d, marginLeftRight: %d", new Object[] { Integer.valueOf(localLayoutParams.topMargin), Integer.valueOf(i) });
    localObject = this.iWw;
    ((AppBrandDesktopView)localObject).setPadding(i, ((AppBrandDesktopView)localObject).getPaddingTop(), i, 0);
    addView(this.iWw, localLayoutParams);
    this.iWd = new GyroView(paramContext);
    paramContext = new FrameLayout.LayoutParams((int)getResources().getDimension(2131428434), (int)getResources().getDimension(2131428433));
    paramContext.gravity = 81;
    this.iWd.setId(2131820627);
    addView(this.iWd, paramContext);
    AppMethodBeat.o(133719);
  }

  public final void a(Configuration paramConfiguration)
  {
    AppMethodBeat.i(133723);
    super.a(paramConfiguration);
    if (this.iWw != null)
    {
      AppBrandDesktopView localAppBrandDesktopView = this.iWw;
      ab.i("MicroMsg.AppBrandDesktopView", "alvinluo DesktopView onCustomConfigurationChanged lastOrientation: %d, orientation: %d", new Object[] { Integer.valueOf(localAppBrandDesktopView.ivr), Integer.valueOf(paramConfiguration.orientation) });
      if (localAppBrandDesktopView.iVo != null)
      {
        localAppBrandDesktopView.iXp = localAppBrandDesktopView.iVo.getMeasuredHeight();
        ab.i("MicroMsg.AppBrandDesktopView", "alvinluo DesktopView onCustomConfigurationChanged fixedViewHeight: %d", new Object[] { Integer.valueOf(localAppBrandDesktopView.iXp) });
      }
      if (localAppBrandDesktopView.ivr != paramConfiguration.orientation)
      {
        localAppBrandDesktopView.ivr = paramConfiguration.orientation;
        if ((localAppBrandDesktopView.iVo != null) && (localAppBrandDesktopView.iVo.aOV()))
        {
          ab.i("MicroMsg.AppBrandDesktopView", "alvinluo onCustomConfigurationChanged closeHeader");
          localAppBrandDesktopView.iVo.j(0L, 0);
        }
        if (localAppBrandDesktopView.iVo != null)
          localAppBrandDesktopView.iVo.a(paramConfiguration);
      }
    }
    AppMethodBeat.o(133723);
  }

  public final boolean aOV()
  {
    AppMethodBeat.i(133724);
    boolean bool;
    if (this.iWv != null)
    {
      bool = this.iWv.aOV();
      AppMethodBeat.o(133724);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(133724);
    }
  }

  public final void aPi()
  {
    AppMethodBeat.i(133720);
    if (this.iWw != null)
      this.iWw.setPadding(this.iWw.getLeftRightMargin(), this.iWw.getPaddingTop(), this.iWw.getLeftRightMargin(), 0);
    AppMethodBeat.o(133720);
  }

  public final void e(View paramView1, View paramView2)
  {
    AppMethodBeat.i(133727);
    this.iVw = ((DynamicBackgroundGLSurfaceView)paramView1);
    this.iWx = ((GradientColorBackgroundView)paramView2);
    if (this.iWv != null)
      this.iWv.e(paramView1, paramView2);
    AppMethodBeat.o(133727);
  }

  public Rect getBackUpFooterRect()
  {
    return this.iWy;
  }

  public View getBackgroundGLSurfaceView()
  {
    return this.iVw;
  }

  public View getBackgroundGradientView()
  {
    return this.iWx;
  }

  public View getEmptyView()
  {
    return null;
  }

  public int getExtraBottomHeight()
  {
    return this.iWD;
  }

  public GyroView getGyroView()
  {
    return this.iWd;
  }

  public a getHeaderView()
  {
    return null;
  }

  public View getMaskView()
  {
    return this.iWz;
  }

  public final boolean isFullScreen()
  {
    return true;
  }

  public final void j(long paramLong, int paramInt)
  {
    AppMethodBeat.i(133725);
    super.j(paramLong, paramInt);
    if (this.iWv != null)
      this.iWv.c(paramLong, paramInt, false);
    AppMethodBeat.o(133725);
  }

  public final void k(long paramLong, int paramInt)
  {
    AppMethodBeat.i(133726);
    super.k(paramLong, paramInt);
    if (this.iWv != null)
      this.iWv.c(paramLong, paramInt, true);
    AppMethodBeat.o(133726);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(133731);
    super.onDestroy();
    AppBrandDesktopView localAppBrandDesktopView;
    if (this.iWw != null)
    {
      localAppBrandDesktopView = this.iWw;
      ab.i("MicroMsg.AppBrandDesktopView", "alvinluo AppBrandDesktopView onDestroy %d", new Object[] { Integer.valueOf(localAppBrandDesktopView.hashCode()) });
    }
    while (true)
    {
      try
      {
        if (localAppBrandDesktopView.iXm != null)
        {
          RecentAppBrandViewContainer localRecentAppBrandViewContainer = localAppBrandDesktopView.iXm;
          if (localRecentAppBrandViewContainer.iYR != null)
            localRecentAppBrandViewContainer.removeCallbacks(localRecentAppBrandViewContainer.iYR);
        }
        if (localAppBrandDesktopView.iXt != null)
        {
          localAppBrandDesktopView.removeCallbacks(localAppBrandDesktopView.iXt);
          localAppBrandDesktopView.iXt = null;
        }
        if (localAppBrandDesktopView.iXu != null)
        {
          localAppBrandDesktopView.removeCallbacks(localAppBrandDesktopView.iXu);
          localAppBrandDesktopView.iXu = null;
        }
        if (localAppBrandDesktopView.iXL != null)
          ((af)g.K(af.class)).d(localAppBrandDesktopView.iXL);
        if (localAppBrandDesktopView.iXM != null)
          ((ag)g.K(ag.class)).d(localAppBrandDesktopView.iXM);
        localAppBrandDesktopView.iXN = false;
        AppMethodBeat.o(133731);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandDesktopView", localException, "alvinluo onDestroy exception", new Object[0]);
      }
      AppMethodBeat.o(133731);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(133717);
    aPh();
    ab.v("MicroMsg.AppBrandDesktopContainer", "alvinluo onMeasure orientation: %d, closeHeight: %d, extraBottomHeight: %d", new Object[] { Integer.valueOf(getResources().getConfiguration().orientation), Integer.valueOf(this.iWC), Integer.valueOf(this.iWD) });
    if (this.iWB);
    for (paramInt2 = View.MeasureSpec.makeMeasureSpec(((ViewGroup)getParent()).getMeasuredHeight() - this.iWC - this.iWD, 1073741824); ; paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824))
    {
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(133717);
      return;
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(133730);
    super.onPause();
    AppBrandDesktopView localAppBrandDesktopView;
    Object localObject;
    if (this.iWw != null)
    {
      localAppBrandDesktopView = this.iWw;
      localAppBrandDesktopView.isPaused = true;
      localAppBrandDesktopView.iXH = false;
      ab.i("MicroMsg.AppBrandDesktopView", "alvinluo onPause isHeaderOpen: %b, needProcess: %b, needRecreate: %b", new Object[] { Boolean.valueOf(localAppBrandDesktopView.iXF), Boolean.valueOf(localAppBrandDesktopView.iXI), Boolean.valueOf(localAppBrandDesktopView.iXH) });
      if ((localAppBrandDesktopView.iXF) && (localAppBrandDesktopView.iXI))
      {
        localAppBrandDesktopView.iXJ = true;
        if (!localAppBrandDesktopView.iXH)
        {
          if ((localAppBrandDesktopView.iVo == null) || (!b.aPe()))
            break label362;
          ab.i("MicroMsg.AppBrandDesktopView", "alvinluo switchToGradientBackgroundView");
          localObject = localAppBrandDesktopView.iVo.getParent();
          if ((localObject instanceof View))
            ((View)localObject).setBackgroundColor(localAppBrandDesktopView.mContext.getResources().getColor(2131690597));
          localObject = localAppBrandDesktopView.iVo.getBackgroundGradientView();
          if (localObject != null)
          {
            ((View)localObject).setVisibility(0);
            ((View)localObject).setAlpha(1.0F);
          }
          localObject = localAppBrandDesktopView.iVo.getBackgroundGLSurfaceView();
          if ((localObject instanceof DynamicBackgroundGLSurfaceView))
          {
            ((DynamicBackgroundGLSurfaceView)localObject).setShowGradientView(true);
            ((DynamicBackgroundGLSurfaceView)localObject).iZQ.onPause();
            localAppBrandDesktopView.iXO = true;
          }
          AppMethodBeat.o(133730);
        }
      }
    }
    while (true)
    {
      return;
      localAppBrandDesktopView.iXO = false;
      if ((localAppBrandDesktopView.iVo != null) && (b.aPe()))
      {
        ab.i("MicroMsg.AppBrandDesktopView", "alvinluo switchToGradientBackgroundView");
        localObject = localAppBrandDesktopView.iVo.getParent();
        if ((localObject instanceof View))
          ((View)localObject).setBackgroundColor(localAppBrandDesktopView.mContext.getResources().getColor(2131690597));
        localObject = localAppBrandDesktopView.iVo.getBackgroundGradientView();
        if (localObject != null)
        {
          ((View)localObject).setAlpha(1.0F);
          ((View)localObject).setVisibility(0);
        }
        if (localAppBrandDesktopView.iVo != null)
        {
          localObject = localAppBrandDesktopView.iVo.getBackgroundGLSurfaceView();
          if ((localObject != null) && (localAppBrandDesktopView.iXl != null))
          {
            ab.i("MicroMsg.AppBrandDesktopView", "alvinluo removeDynamicBackgroundView");
            localAppBrandDesktopView.iXl.removeView((View)localObject);
          }
        }
        localAppBrandDesktopView.postDelayed(new AppBrandDesktopView.11(localAppBrandDesktopView), 200L);
      }
      label362: AppMethodBeat.o(133730);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(133729);
    super.onResume();
    if (this.iWw != null)
    {
      AppBrandDesktopView localAppBrandDesktopView = this.iWw;
      ab.i("MicroMsg.AppBrandDesktopView", "alvinluo DesktopView onResume");
      localAppBrandDesktopView.isPaused = false;
      if (localAppBrandDesktopView.anv)
      {
        ab.v("MicroMsg.AppBrandDesktopView", "alvinluo DesktopView onResume setLayoutFrozen false");
        localAppBrandDesktopView.setLayoutFrozen(false);
      }
      ab.i("MicroMsg.AppBrandDesktopView", "alvinluo onResume isHeaderOpen: %b, needProcessSurfaceWhenResumed: %b", new Object[] { Boolean.valueOf(localAppBrandDesktopView.iXF), Boolean.valueOf(localAppBrandDesktopView.iXJ) });
      if ((localAppBrandDesktopView.iXF) && (localAppBrandDesktopView.iXJ))
      {
        if ((b.aPe()) && (localAppBrandDesktopView.iVo != null) && (localAppBrandDesktopView.iVo.aOV()))
        {
          ab.i("MicroMsg.AppBrandDesktopView", "alvinluo switchToDynamicBackgroundView");
          ((View)localAppBrandDesktopView.iVo.getParent()).setBackgroundColor(localAppBrandDesktopView.mContext.getResources().getColor(2131690597));
          View localView = localAppBrandDesktopView.iVo.getBackgroundGradientView();
          if (localView != null)
            localView.setVisibility(0);
          localView = localAppBrandDesktopView.iVo.getBackgroundGLSurfaceView();
          if ((localView instanceof DynamicBackgroundGLSurfaceView))
          {
            localView.setVisibility(0);
            if (localAppBrandDesktopView.iXO)
            {
              ((DynamicBackgroundGLSurfaceView)localView).onResume();
              localAppBrandDesktopView.iXO = false;
            }
            ab.i("MicroMsg.AppBrandDesktopView", "alvinluo switchToDynamicBackgroundView show dynamicBackgroundView");
            localAppBrandDesktopView.postDelayed(new AppBrandDesktopView.2(localAppBrandDesktopView, localView), 100L);
          }
        }
        localAppBrandDesktopView.iXI = true;
        localAppBrandDesktopView.iXJ = true;
      }
      localAppBrandDesktopView.aPp();
    }
    AppMethodBeat.o(133729);
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(133722);
    if ((this.iWv != null) && ((paramMotionEvent.getAction() == 0) || (paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3)))
      this.iWv.onTouch(paramView, paramMotionEvent);
    AppMethodBeat.o(133722);
    return false;
  }

  public void setActivity(MMFragmentActivity paramMMFragmentActivity)
  {
    this.iWA = paramMMFragmentActivity;
  }

  public void setAnimController(com.tencent.mm.plugin.appbrand.widget.header.b paramb)
  {
    AppMethodBeat.i(133716);
    this.iWv = paramb;
    if ((this.iWw != null) && (this.iWv != null))
      this.iWv.a(this.iWw);
    AppMethodBeat.o(133716);
  }

  public void setDynamicBackgroundView(View paramView)
  {
    AppMethodBeat.i(133728);
    this.iVw = ((DynamicBackgroundGLSurfaceView)paramView);
    if (this.iWv != null)
      this.iWv.e(this.iVw, this.iWx);
    AppMethodBeat.o(133728);
  }

  public void setExtraBottomHeight(int paramInt)
  {
    this.iWD = paramInt;
  }

  public void setFixedHeight(boolean paramBoolean)
  {
    this.iWB = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopContainer
 * JD-Core Version:    0.6.2
 */