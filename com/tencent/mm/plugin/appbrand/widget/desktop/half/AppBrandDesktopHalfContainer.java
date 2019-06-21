package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.header.GyroView;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;
import com.tencent.mm.plugin.appbrand.widget.header.a.a;
import com.tencent.mm.plugin.appbrand.widget.header.b;
import com.tencent.mm.plugin.appbrand.widget.header.b.a;
import com.tencent.mm.ui.MMFragmentActivity;

public class AppBrandDesktopHalfContainer extends HeaderContainer
  implements View.OnTouchListener, b.a
{
  private View Ek;
  private GyroView iWd;
  private b iWv;
  private Rect iWy;
  private AppBrandDesktopHalfView jan;

  public AppBrandDesktopHalfContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(134115);
    this.iWy = new Rect();
    init(paramContext);
    AppMethodBeat.o(134115);
  }

  public AppBrandDesktopHalfContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(134116);
    this.iWy = new Rect();
    init(paramContext);
    AppMethodBeat.o(134116);
  }

  private void jdMethod_do(Context paramContext)
  {
    AppMethodBeat.i(134119);
    this.iWd = new GyroView(paramContext);
    paramContext = new FrameLayout.LayoutParams((int)getResources().getDimension(2131428434), (int)getResources().getDimension(2131428433));
    paramContext.gravity = 81;
    this.iWd.setId(2131820627);
    this.iWd.setVisibility(8);
    addView(this.iWd, paramContext);
    AppMethodBeat.o(134119);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(134118);
    this.jan = new AppBrandDesktopHalfView(paramContext);
    this.jan.setId(2131820554);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    localLayoutParams.setMargins(localLayoutParams.leftMargin, localLayoutParams.topMargin, localLayoutParams.rightMargin, localLayoutParams.bottomMargin);
    this.jan.setLayoutParams(localLayoutParams);
    this.Ek = this.jan.findViewById(2131821164);
    addView(this.jan);
    jdMethod_do(paramContext);
    AppMethodBeat.o(134118);
  }

  public final boolean aOV()
  {
    return false;
  }

  public final void aPi()
  {
  }

  public final void aPs()
  {
  }

  public final void aPt()
  {
  }

  public final void e(View paramView1, View paramView2)
  {
  }

  public Rect getBackUpFooterRect()
  {
    return this.iWy;
  }

  public View getBackgroundGLSurfaceView()
  {
    return null;
  }

  public View getBackgroundGradientView()
  {
    return null;
  }

  public View getEmptyView()
  {
    return this.Ek;
  }

  public int getExtraBottomHeight()
  {
    return 0;
  }

  public GyroView getGyroView()
  {
    return this.iWd;
  }

  public a getHeaderView()
  {
    return this.jan;
  }

  public View getMaskView()
  {
    return null;
  }

  public final boolean isFullScreen()
  {
    if (this.jan != null);
    return false;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134117);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(134117);
  }

  public final void onPause()
  {
    AppMethodBeat.i(134124);
    super.onPause();
    if (this.jan != null)
      this.jan.cAY = true;
    AppMethodBeat.o(134124);
  }

  public final void onResume()
  {
    AppMethodBeat.i(134123);
    super.onResume();
    if (this.jan != null)
    {
      AppBrandDesktopHalfView localAppBrandDesktopHalfView = this.jan;
      localAppBrandDesktopHalfView.cAY = false;
      localAppBrandDesktopHalfView.setLayoutFrozen(false);
      localAppBrandDesktopHalfView.postDelayed(new AppBrandDesktopHalfView.14(localAppBrandDesktopHalfView), 10L);
    }
    AppMethodBeat.o(134123);
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    return false;
  }

  public final void qj(int paramInt)
  {
    AppMethodBeat.i(134121);
    if (this.jan != null)
      this.jan.qj(paramInt);
    AppMethodBeat.o(134121);
  }

  public final void qk(int paramInt)
  {
    AppMethodBeat.i(134122);
    qj(paramInt);
    AppMethodBeat.o(134122);
  }

  public void setActivity(MMFragmentActivity paramMMFragmentActivity)
  {
  }

  public void setAnimController(b paramb)
  {
    AppMethodBeat.i(134120);
    this.iWv = paramb;
    if (this.iWv != null)
      this.iWv.a(this);
    AppMethodBeat.o(134120);
  }

  public void setDynamicBackgroundView(View paramView)
  {
  }

  public void setExtraBottomHeight(int paramInt)
  {
  }

  public void setFixedHeight(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfContainer
 * JD-Core Version:    0.6.2
 */