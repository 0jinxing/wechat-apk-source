package com.tencent.mm.plugin.sns.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.j;

final class SnsSightPlayerUI$13
  implements View.OnTouchListener
{
  SnsSightPlayerUI$13(SnsSightPlayerUI paramSnsSightPlayerUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    float f1 = 1.0F;
    AppMethodBeat.i(39267);
    SnsSightPlayerUI.n(this.rwT).onTouchEvent(paramMotionEvent);
    if (SnsSightPlayerUI.o(this.rwT) == null)
      SnsSightPlayerUI.a(this.rwT, VelocityTracker.obtain());
    SnsSightPlayerUI.o(this.rwT).addMovement(paramMotionEvent);
    boolean bool;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default:
    case 0:
    case 1:
      while (true)
      {
        AppMethodBeat.o(39267);
        for (bool = false; ; bool = true)
        {
          label92: return bool;
          SnsSightPlayerUI.a(this.rwT, paramMotionEvent.getX());
          SnsSightPlayerUI.b(this.rwT, paramMotionEvent.getY());
          break;
          if (SnsSightPlayerUI.p(this.rwT))
          {
            ((View)SnsSightPlayerUI.g(this.rwT)).setPivotX(this.rwT.qzb.getWidth() / 2);
            ((View)SnsSightPlayerUI.g(this.rwT)).setPivotY(this.rwT.qzb.getHeight() / 2);
            ((View)SnsSightPlayerUI.g(this.rwT)).setScaleX(1.0F);
            ((View)SnsSightPlayerUI.g(this.rwT)).setScaleY(1.0F);
            ((View)SnsSightPlayerUI.g(this.rwT)).setTranslationX(0.0F);
            ((View)SnsSightPlayerUI.g(this.rwT)).setTranslationY(0.0F);
            paramView = this.rwT;
            if (paramView.contextMenuHelper == null)
              paramView.contextMenuHelper = new j(paramView.mController.ylL);
            paramView.contextMenuHelper.a((View)paramView.klq, paramView.rwS, paramView.jOb);
            if (SnsSightPlayerUI.q(this.rwT) != null)
              SnsSightPlayerUI.q(this.rwT).setVisibility(0);
            SnsSightPlayerUI.c(this.rwT, false);
            SnsSightPlayerUI.b(this.rwT, false);
            break;
          }
          if ((!SnsSightPlayerUI.m(this.rwT)) || (SnsSightPlayerUI.r(this.rwT)))
            break label381;
          this.rwT.bcW();
          SnsSightPlayerUI.b(this.rwT, false);
          AppMethodBeat.o(39267);
        }
        label381: SnsSightPlayerUI.b(this.rwT, false);
      }
    case 2:
    }
    float f2 = ((View)SnsSightPlayerUI.g(this.rwT)).getTranslationX();
    float f3 = ((View)SnsSightPlayerUI.g(this.rwT)).getTranslationY();
    paramView = SnsSightPlayerUI.o(this.rwT);
    paramView.computeCurrentVelocity(1000);
    int i = (int)paramView.getXVelocity();
    int j = (int)paramView.getYVelocity();
    if (((Math.abs(f2) <= 250.0F) && (Math.abs(j) > Math.abs(i)) && (j > 0) && (!SnsSightPlayerUI.r(this.rwT))) || (SnsSightPlayerUI.m(this.rwT)))
    {
      float f4 = 1.0F - f3 / this.rwT.qzb.getHeight();
      if (f4 > 1.0F)
      {
        f4 = f1;
        label529: if (((j > 0) && (f4 < SnsSightPlayerUI.s(this.rwT))) || ((j < 0) && (f4 >= 0.5D)))
        {
          SnsSightPlayerUI.a(this.rwT, (int)f2);
          SnsSightPlayerUI.b(this.rwT, (int)f3);
          SnsSightPlayerUI.c(this.rwT, f4);
          if (SnsSightPlayerUI.q(this.rwT) != null)
            SnsSightPlayerUI.q(this.rwT).setVisibility(8);
          ((View)SnsSightPlayerUI.g(this.rwT)).setPivotX(this.rwT.qzb.getWidth() / 2);
          ((View)SnsSightPlayerUI.g(this.rwT)).setPivotY(this.rwT.qzb.getHeight() / 2);
          ((View)SnsSightPlayerUI.g(this.rwT)).setScaleX(f4);
          ((View)SnsSightPlayerUI.g(this.rwT)).setScaleY(f4);
          SnsSightPlayerUI.t(this.rwT).setAlpha(f4);
        }
        SnsSightPlayerUI.c(this.rwT, true);
        label719: if (f3 <= 200.0F)
          break label823;
        SnsSightPlayerUI.d(this.rwT, false);
      }
    }
    while (true)
    {
      if (f3 > 50.0F)
        ((View)SnsSightPlayerUI.g(this.rwT)).setOnLongClickListener(null);
      if (SnsSightPlayerUI.o(this.rwT) != null)
      {
        SnsSightPlayerUI.o(this.rwT).recycle();
        SnsSightPlayerUI.a(this.rwT, null);
      }
      if (!SnsSightPlayerUI.m(this.rwT))
        break;
      AppMethodBeat.o(39267);
      bool = true;
      break label92;
      break label529;
      SnsSightPlayerUI.c(this.rwT, false);
      break label719;
      label823: if (f3 > 10.0F)
        SnsSightPlayerUI.d(this.rwT, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.13
 * JD-Core Version:    0.6.2
 */