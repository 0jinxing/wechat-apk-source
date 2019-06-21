package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class ShuffleView$14
  implements GestureDetector.OnGestureListener
{
  ShuffleView$14(ShuffleView paramShuffleView)
  {
  }

  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(42239);
    ab.d("ShuffleView", "gesture down");
    switch (ShuffleView.l(this.nWl).nWq)
    {
    default:
    case 4:
    }
    label200: 
    while (true)
    {
      AppMethodBeat.o(42239);
      return bool;
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      for (int k = 0; ; k++)
      {
        if (k >= ShuffleView.d(this.nWl))
          break label200;
        paramMotionEvent = ShuffleView.a(this.nWl, k);
        if ((paramMotionEvent != null) && (paramMotionEvent.contains(i, j)))
        {
          paramMotionEvent = (View)ShuffleView.e(this.nWl).get(k);
          if ((ShuffleView.h(this.nWl) != paramMotionEvent) && (ShuffleView.h(this.nWl) != null))
            ShuffleView.m(this.nWl);
          while (ShuffleView.h(this.nWl) != paramMotionEvent)
          {
            ShuffleView.b(this.nWl, k);
            AppMethodBeat.o(42239);
            bool = true;
            break;
          }
          ab.i("ShuffleView", "down on the select card");
          AppMethodBeat.o(42239);
          bool = true;
          break;
        }
      }
    }
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(42242);
    ab.i("ShuffleView", "fling up ".concat(String.valueOf(paramFloat2)));
    boolean bool;
    if (paramFloat2 < -ShuffleView.r(this.nWl))
      switch (ShuffleView.l(this.nWl).nWq)
      {
      default:
        bool = true;
        AppMethodBeat.o(42242);
      case 4:
      }
    while (true)
    {
      return bool;
      if (ShuffleView.h(this.nWl) != null)
        ShuffleView.m(this.nWl);
      if (ShuffleView.k(this.nWl) == null)
        break;
      if (ShuffleView.n(this.nWl) != null)
      {
        paramMotionEvent1 = ShuffleView.n(this.nWl);
        ShuffleView.i(this.nWl);
        paramMotionEvent1.xL(ShuffleView.d(this.nWl));
      }
      ShuffleView.c(this.nWl, ShuffleView.i(this.nWl));
      break;
      bool = false;
      AppMethodBeat.o(42242);
    }
  }

  public final void onLongPress(MotionEvent paramMotionEvent)
  {
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(42241);
    int i;
    int j;
    if (paramMotionEvent2.getActionMasked() == 2)
    {
      i = (int)paramMotionEvent2.getX();
      j = (int)paramMotionEvent2.getY();
      switch (ShuffleView.l(this.nWl).nWq)
      {
      default:
      case 4:
      }
    }
    label199: 
    do
    {
      AppMethodBeat.o(42241);
      return false;
      if (Math.abs(paramFloat2) < ShuffleView.o(this.nWl))
      {
        int k = 0;
        if (k < ShuffleView.d(this.nWl))
        {
          paramMotionEvent1 = ShuffleView.a(this.nWl, k);
          if ((paramMotionEvent1 != null) && (paramMotionEvent1.contains(i, j)))
          {
            paramMotionEvent1 = (View)ShuffleView.e(this.nWl).get(k);
            if ((ShuffleView.h(this.nWl) == paramMotionEvent1) || (ShuffleView.h(this.nWl) == null))
              break label199;
            ShuffleView.m(this.nWl);
          }
          while (ShuffleView.h(this.nWl) != paramMotionEvent1)
          {
            if (ShuffleView.k(this.nWl) != paramMotionEvent1)
            {
              ShuffleView.p(this.nWl);
              ShuffleView.b(this.nWl, k);
            }
            k++;
            break;
          }
          ab.i("ShuffleView", "scroll on the select card");
        }
      }
    }
    while (Math.abs(paramFloat1) >= ShuffleView.o(this.nWl));
    ab.d("ShuffleView", "scroll distanceY:".concat(String.valueOf(paramFloat2)));
    if (ShuffleView.k(this.nWl) != null)
      paramMotionEvent1 = ShuffleView.k(this.nWl);
    while (true)
    {
      label266: if (paramMotionEvent1 != null)
      {
        ab.i("ShuffleView", "scroll translationY:" + paramMotionEvent1.getTranslationY() + "," + paramMotionEvent1.getHeight() / 7);
        if ((int)paramMotionEvent1.getTranslationY() > -paramMotionEvent1.getHeight() / 7)
          break label500;
        if ((paramFloat2 < 0.0F) && (Math.abs(paramFloat2) > ShuffleView.o(this.nWl)))
        {
          if ((int)paramFloat2 > -paramMotionEvent1.getHeight() / 7)
            break label486;
          paramMotionEvent1.setTranslationY(0.0F);
          label368: if (paramMotionEvent1 == ShuffleView.h(this.nWl))
          {
            ShuffleView.a(this.nWl, ShuffleView.h(this.nWl));
            ShuffleView.d(this.nWl, ShuffleView.f(this.nWl));
            if (ShuffleView.q(this.nWl).isStarted())
            {
              ab.i("ShuffleView", "scroll when select view is animation");
              ShuffleView.q(this.nWl).cancel();
            }
            ShuffleView.b(this.nWl, null);
            ShuffleView.e(this.nWl, 0);
          }
        }
      }
      while (true)
      {
        AppMethodBeat.o(42241);
        break;
        if (ShuffleView.h(this.nWl) == null)
          break label666;
        paramMotionEvent1 = ShuffleView.h(this.nWl);
        break label266;
        label486: paramMotionEvent1.setTranslationY(paramMotionEvent1.getTranslationY() - paramFloat2);
        break label368;
        label500: if (paramMotionEvent1.getTranslationY() == 0.0F)
        {
          if ((paramFloat2 > 0.0F) && (Math.abs(paramFloat2) > ShuffleView.o(this.nWl)))
            if ((int)paramFloat2 >= paramMotionEvent1.getHeight() / 7)
              paramMotionEvent1.setTranslationY(-paramMotionEvent1.getHeight() / 7);
            else
              paramMotionEvent1.setTranslationY(paramMotionEvent1.getTranslationY() - paramFloat2);
        }
        else if (paramFloat2 < 0.0F)
        {
          if (paramMotionEvent1.getTranslationY() - paramFloat2 >= 0.0F)
            paramMotionEvent1.setTranslationY(0.0F);
          else
            paramMotionEvent1.setTranslationY(paramMotionEvent1.getTranslationY() - paramFloat2);
        }
        else if ((int)(paramMotionEvent1.getTranslationY() - paramFloat2) <= -paramMotionEvent1.getHeight() / 7)
          paramMotionEvent1.setTranslationY(-paramMotionEvent1.getHeight() / 7);
        else
          paramMotionEvent1.setTranslationY(paramMotionEvent1.getTranslationY() - paramFloat2);
      }
      label666: paramMotionEvent1 = null;
    }
  }

  public final void onShowPress(MotionEvent paramMotionEvent)
  {
  }

  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(42240);
    boolean bool;
    switch (ShuffleView.l(this.nWl).nWq)
    {
    default:
      bool = false;
      AppMethodBeat.o(42240);
    case 4:
    }
    while (true)
    {
      return bool;
      if (ShuffleView.h(this.nWl) != null)
      {
        ab.d("ShuffleView", "click the select card");
        if (ShuffleView.n(this.nWl) != null)
          ShuffleView.n(this.nWl).es(ShuffleView.f(this.nWl), ShuffleView.d(this.nWl));
        ShuffleView.m(this.nWl);
      }
      if (ShuffleView.k(this.nWl) != null)
      {
        if (ShuffleView.n(this.nWl) != null)
        {
          paramMotionEvent = ShuffleView.n(this.nWl);
          ShuffleView.i(this.nWl);
          paramMotionEvent.xL(ShuffleView.d(this.nWl));
        }
        ShuffleView.c(this.nWl, ShuffleView.i(this.nWl));
      }
      bool = true;
      AppMethodBeat.o(42240);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView.14
 * JD-Core Version:    0.6.2
 */