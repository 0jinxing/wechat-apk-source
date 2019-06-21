package com.tencent.mm.ui.websearch;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.statusbar.a;
import com.tencent.mm.ui.statusbar.b;
import com.tencent.mm.ui.widget.SwipeBackLayout;

public abstract class CustomStatusBarMMActivity extends MMActivity
{
  private b iFI = null;

  protected int getStatusBarColor()
  {
    return getResources().getColor(2131690513);
  }

  public boolean initNavigationSwipeBack()
  {
    boolean bool = super.initNavigationSwipeBack();
    if (!isSupportNavigationSwipeBack())
      a.d(this.mController.contentView, getStatusBarColor(), true);
    return bool;
  }

  public void initSwipeBack()
  {
    super.initSwipeBack();
    if ((getSwipeBackLayout() != null) && (getSwipeBackLayout().getChildCount() > 0))
    {
      View localView = getSwipeBackLayout().getChildAt(0);
      getSwipeBackLayout().removeView(localView);
      this.iFI = new b(this);
      this.iFI.addView(localView, new FrameLayout.LayoutParams(-1, -1));
      getSwipeBackLayout().addView(this.iFI);
      getSwipeBackLayout().setContentView(this.iFI);
    }
    a.d(this.mController.contentView, getStatusBarColor(), true);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.websearch.CustomStatusBarMMActivity
 * JD-Core Version:    0.6.2
 */