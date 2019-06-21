package com.tencent.mm.plugin.sns.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsOnlineVideoActivity$9
  implements View.OnTouchListener
{
  SnsOnlineVideoActivity$9(SnsOnlineVideoActivity paramSnsOnlineVideoActivity)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    float f1 = 1.0F;
    AppMethodBeat.i(39154);
    SnsOnlineVideoActivity.f(this.rvf).onTouchEvent(paramMotionEvent);
    if (SnsOnlineVideoActivity.g(this.rvf) == null)
      SnsOnlineVideoActivity.a(this.rvf, VelocityTracker.obtain());
    if (SnsOnlineVideoActivity.g(this.rvf) != null)
      SnsOnlineVideoActivity.g(this.rvf).addMovement(paramMotionEvent);
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default:
    case 0:
    case 1:
      while (true)
      {
        AppMethodBeat.o(39154);
        bool = false;
        while (true)
        {
          label107: return bool;
          SnsOnlineVideoActivity.a(this.rvf, paramMotionEvent.getX());
          SnsOnlineVideoActivity.b(this.rvf, paramMotionEvent.getY());
          if (!SnsOnlineVideoActivity.h(this.rvf))
            break;
          SnsOnlineVideoActivity.i(this.rvf);
          SnsOnlineVideoActivity.c(this.rvf, false);
          break;
          if (SnsOnlineVideoActivity.h(this.rvf))
          {
            SnsOnlineVideoActivity.d(this.rvf).setPivotX(SnsOnlineVideoActivity.b(this.rvf).getWidth() / 2);
            SnsOnlineVideoActivity.d(this.rvf).setPivotY(SnsOnlineVideoActivity.b(this.rvf).getHeight() / 2);
            SnsOnlineVideoActivity.d(this.rvf).setScaleX(1.0F);
            SnsOnlineVideoActivity.d(this.rvf).setScaleY(1.0F);
            SnsOnlineVideoActivity.d(this.rvf).setTranslationX(0.0F);
            SnsOnlineVideoActivity.d(this.rvf).setTranslationY(0.0F);
            SnsOnlineVideoActivity.j(this.rvf).setAlpha(1.0F);
            SnsOnlineVideoActivity.c(this.rvf, 1.0F);
            SnsOnlineVideoActivity.d(this.rvf, false);
            SnsOnlineVideoActivity.b(this.rvf, false);
            AppMethodBeat.o(39154);
          }
          else
          {
            if ((!SnsOnlineVideoActivity.c(this.rvf)) || (SnsOnlineVideoActivity.k(this.rvf)))
              break label352;
            this.rvf.bcW();
            SnsOnlineVideoActivity.b(this.rvf, false);
            AppMethodBeat.o(39154);
          }
        }
        label352: SnsOnlineVideoActivity.b(this.rvf, false);
      }
    case 2:
    }
    paramView = SnsOnlineVideoActivity.g(this.rvf);
    paramView.computeCurrentVelocity(1000);
    int i = (int)paramView.getXVelocity();
    int j = (int)paramView.getYVelocity();
    float f2 = SnsOnlineVideoActivity.d(this.rvf).getTranslationX();
    float f3 = SnsOnlineVideoActivity.d(this.rvf).getTranslationY();
    SnsOnlineVideoActivity.a(this.rvf, (int)f2);
    SnsOnlineVideoActivity.b(this.rvf, (int)f3);
    ab.d("MicroMsg.SnsOnlineVideoActivity", "dancy scaled:%s, tx:%s, ty:%s, vx:%s, vy:%s", new Object[] { Boolean.valueOf(SnsOnlineVideoActivity.c(this.rvf)), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i), Integer.valueOf(j) });
    if (((Math.abs(f2) <= 250.0F) && (Math.abs(j) > Math.abs(i)) && (j > 0) && (!SnsOnlineVideoActivity.k(this.rvf))) || (SnsOnlineVideoActivity.c(this.rvf)))
    {
      f2 = 1.0F - f3 / SnsOnlineVideoActivity.b(this.rvf).getHeight();
      if (f2 > 1.0F)
      {
        label569: if (((j > 0) && (f1 < SnsOnlineVideoActivity.l(this.rvf))) || ((j < 0) && (f1 >= 0.5D)))
        {
          ab.d("MicroMsg.SnsOnlineVideoActivity", "dancy scale:%s", new Object[] { Float.valueOf(f1) });
          SnsOnlineVideoActivity.c(this.rvf, f1);
          SnsOnlineVideoActivity.d(this.rvf).setPivotX(SnsOnlineVideoActivity.b(this.rvf).getWidth() / 2);
          SnsOnlineVideoActivity.d(this.rvf).setPivotY(SnsOnlineVideoActivity.b(this.rvf).getHeight() / 2);
          SnsOnlineVideoActivity.d(this.rvf).setScaleX(f1);
          SnsOnlineVideoActivity.d(this.rvf).setScaleY(f1);
          SnsOnlineVideoActivity.d(this.rvf).setTranslationY(f3);
          SnsOnlineVideoActivity.j(this.rvf).setAlpha(f1);
        }
        SnsOnlineVideoActivity.d(this.rvf, true);
        label734: if (f3 <= 200.0F)
          break label836;
        SnsOnlineVideoActivity.c(this.rvf, false);
      }
    }
    while (true)
    {
      if (f3 > 50.0F)
        SnsOnlineVideoActivity.d(this.rvf).setOnLongClickListener(null);
      if (SnsOnlineVideoActivity.g(this.rvf) != null)
      {
        SnsOnlineVideoActivity.g(this.rvf).recycle();
        SnsOnlineVideoActivity.a(this.rvf, null);
      }
      if (!SnsOnlineVideoActivity.c(this.rvf))
        break;
      AppMethodBeat.o(39154);
      break label107;
      f1 = f2;
      break label569;
      SnsOnlineVideoActivity.d(this.rvf, false);
      break label734;
      label836: if (f3 > 10.0F)
        SnsOnlineVideoActivity.c(this.rvf, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.9
 * JD-Core Version:    0.6.2
 */