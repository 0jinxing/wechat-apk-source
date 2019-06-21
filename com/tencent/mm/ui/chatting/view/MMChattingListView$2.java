package com.tencent.mm.ui.chatting.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Paint;
import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMChattingListView$2
  implements ValueAnimator.AnimatorUpdateListener
{
  MMChattingListView$2(MMChattingListView paramMMChattingListView, View paramView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(32762);
    this.zaT.getGlobalVisibleRect(MMChattingListView.a(this.zaS));
    MMChattingListView.a(this.zaS).top = this.zaT.getTop();
    MMChattingListView.a(this.zaS).bottom = this.zaT.getBottom();
    float f = ((Float)paramValueAnimator.getAnimatedValue("alpha")).floatValue();
    MMChattingListView.c(this.zaS).setAlpha((int)(f * 255.0F));
    MMChattingListView.b(this.zaS).postInvalidate();
    AppMethodBeat.o(32762);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.view.MMChattingListView.2
 * JD-Core Version:    0.6.2
 */