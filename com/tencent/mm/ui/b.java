package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  private Context mContext;
  private int voj;
  private boolean yeG;
  private View yeH;
  private int yeI;
  private ViewGroup.LayoutParams yeJ;
  private int yeK;

  private b(Activity paramActivity, boolean paramBoolean)
  {
    AppMethodBeat.i(105945);
    this.yeG = false;
    this.mContext = paramActivity;
    this.yeG = paramBoolean;
    this.yeH = ((FrameLayout)paramActivity.findViewById(16908290)).getChildAt(0);
    this.yeH.getViewTreeObserver().addOnGlobalLayoutListener(new b.1(this));
    this.yeJ = this.yeH.getLayoutParams();
    AppMethodBeat.o(105945);
  }

  private b(Activity paramActivity, boolean paramBoolean, View paramView)
  {
    AppMethodBeat.i(105946);
    this.yeG = false;
    this.mContext = paramActivity;
    this.yeG = paramBoolean;
    this.yeH = paramView;
    this.yeH.getViewTreeObserver().addOnGlobalLayoutListener(new b.2(this));
    this.yeJ = this.yeH.getLayoutParams();
    AppMethodBeat.o(105946);
  }

  public static void a(Activity paramActivity, boolean paramBoolean, View paramView)
  {
    AppMethodBeat.i(105944);
    new b(paramActivity, paramBoolean, paramView);
    AppMethodBeat.o(105944);
  }

  public static void c(Activity paramActivity, boolean paramBoolean)
  {
    AppMethodBeat.i(105943);
    new b(paramActivity, paramBoolean);
    AppMethodBeat.o(105943);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b
 * JD-Core Version:    0.6.2
 */