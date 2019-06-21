package com.tencent.mm.ui.statusbar;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.widget.SwipeBackLayout;

public class DrawStatusBarPreference extends MMPreference
{
  private b iFI = null;

  public int JC()
  {
    return 0;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    return false;
  }

  public void initSwipeBack()
  {
    AppMethodBeat.i(107548);
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
    AppMethodBeat.o(107548);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.statusbar.DrawStatusBarPreference
 * JD-Core Version:    0.6.2
 */