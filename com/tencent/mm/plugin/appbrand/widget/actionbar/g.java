package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.PopupWindow;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

public final class g extends PopupWindow
{
  private WindowManager gMh;
  private View iVh;
  public FrameLayout iVi;
  private Context mContext;

  public g(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(133660);
    this.mContext = null;
    this.mContext = paramContext;
    this.gMh = ((WindowManager)paramContext.getSystemService("window"));
    this.iVi = new FrameLayout(this.mContext);
    AppMethodBeat.o(133660);
  }

  public final void dismiss()
  {
    AppMethodBeat.i(133662);
    if (this.iVh != null)
    {
      this.gMh.removeViewImmediate(this.iVh);
      this.iVh = null;
    }
    super.dismiss();
    AppMethodBeat.o(133662);
  }

  public final void setContentView(View paramView)
  {
    AppMethodBeat.i(133663);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    localLayoutParams.gravity = 17;
    localLayoutParams.topMargin = a.am(this.mContext, 2131427984);
    localLayoutParams.rightMargin = a.am(this.mContext, 2131427983);
    localLayoutParams.leftMargin = a.am(this.mContext, 2131427983);
    this.iVi.addView(paramView, localLayoutParams);
    super.setContentView(this.iVi);
    AppMethodBeat.o(133663);
  }

  public final void showAsDropDown(View paramView)
  {
    AppMethodBeat.i(133661);
    IBinder localIBinder = paramView.getWindowToken();
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    localLayoutParams.width = -1;
    localLayoutParams.height = -1;
    localLayoutParams.format = -3;
    localLayoutParams.type = 1000;
    localLayoutParams.token = localIBinder;
    this.iVh = new View(this.mContext);
    this.iVh.setBackgroundColor(2130706432);
    this.iVh.setFitsSystemWindows(false);
    this.iVh.setOnTouchListener(new g.1(this));
    this.iVh.setOnKeyListener(new g.2(this));
    this.gMh.addView(this.iVh, localLayoutParams);
    super.showAsDropDown(paramView);
    AppMethodBeat.o(133661);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.actionbar.g
 * JD-Core Version:    0.6.2
 */