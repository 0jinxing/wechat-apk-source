package com.tencent.mm.plugin.sns.ui;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsSightPlayerUI$12 extends GestureDetector.SimpleOnGestureListener
{
  SnsSightPlayerUI$12(SnsSightPlayerUI paramSnsSightPlayerUI)
  {
  }

  public final void onLongPress(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(39266);
    SnsSightPlayerUI.b(this.rwT, true);
    super.onLongPress(paramMotionEvent);
    AppMethodBeat.o(39266);
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(39265);
    float f1 = ((View)SnsSightPlayerUI.g(this.rwT)).getTranslationX();
    float f2 = paramMotionEvent2.getX();
    float f3 = paramMotionEvent1.getX();
    float f4 = ((View)SnsSightPlayerUI.g(this.rwT)).getTranslationY();
    paramFloat2 = paramMotionEvent2.getY();
    paramFloat1 = paramMotionEvent1.getY();
    if (SnsSightPlayerUI.m(this.rwT))
    {
      ((View)SnsSightPlayerUI.g(this.rwT)).setTranslationX(f1 + f2 - f3);
      ((View)SnsSightPlayerUI.g(this.rwT)).setTranslationY(f4 + paramFloat2 - paramFloat1);
    }
    AppMethodBeat.o(39265);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.12
 * JD-Core Version:    0.6.2
 */