package com.tencent.mm.ui.conversation;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$4
  implements ValueAnimator.AnimatorUpdateListener
{
  h$4(h paramh)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(34357);
    int i = ((Integer)paramValueAnimator.getAnimatedValue("alpha")).intValue();
    h.f(this.ztS).setAlpha(i);
    AppMethodBeat.o(34357);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.h.4
 * JD-Core Version:    0.6.2
 */