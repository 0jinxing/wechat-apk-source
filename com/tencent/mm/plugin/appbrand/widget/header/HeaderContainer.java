package com.tencent.mm.plugin.appbrand.widget.header;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.mm.plugin.appbrand.widget.header.a.a;
import com.tencent.mm.ui.MMFragmentActivity;

public abstract class HeaderContainer extends FrameLayout
{
  public HeaderContainer(Context paramContext)
  {
    super(paramContext);
  }

  public HeaderContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public HeaderContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public void a(Configuration paramConfiguration)
  {
  }

  public abstract boolean aOV();

  public abstract void aPi();

  public abstract void e(View paramView1, View paramView2);

  public abstract Rect getBackUpFooterRect();

  public abstract View getBackgroundGLSurfaceView();

  public abstract View getBackgroundGradientView();

  public abstract View getEmptyView();

  public abstract int getExtraBottomHeight();

  public abstract GyroView getGyroView();

  public abstract a getHeaderView();

  public abstract View getMaskView();

  public boolean isFullScreen()
  {
    return false;
  }

  public void j(long paramLong, int paramInt)
  {
  }

  public void k(long paramLong, int paramInt)
  {
  }

  public void onDestroy()
  {
  }

  public void onPause()
  {
  }

  public void onResume()
  {
  }

  public abstract void setActivity(MMFragmentActivity paramMMFragmentActivity);

  public abstract void setAnimController(b paramb);

  public abstract void setDynamicBackgroundView(View paramView);

  public abstract void setExtraBottomHeight(int paramInt);

  public abstract void setFixedHeight(boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer
 * JD-Core Version:    0.6.2
 */