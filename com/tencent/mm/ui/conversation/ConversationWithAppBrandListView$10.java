package com.tencent.mm.ui.conversation;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ConversationWithAppBrandListView$10
  implements ValueAnimator.AnimatorUpdateListener
{
  ConversationWithAppBrandListView$10(ConversationWithAppBrandListView paramConversationWithAppBrandListView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(34276);
    float f1 = ((Float)paramValueAnimator.getAnimatedValue("deltaY")).floatValue();
    float f2 = ((Float)paramValueAnimator.getAnimatedValue("headerDeltaY")).floatValue();
    int i = 0;
    if (i < this.ztq.getChildCount())
    {
      if (i == 0)
        this.ztq.getChildAt(i).setTranslationY(f2);
      while (true)
      {
        ConversationWithAppBrandListView.a(this.ztq, f1);
        i++;
        break;
        this.ztq.getChildAt(i).setTranslationY(f1);
      }
    }
    this.ztq.invalidate();
    AppMethodBeat.o(34276);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationWithAppBrandListView.10
 * JD-Core Version:    0.6.2
 */