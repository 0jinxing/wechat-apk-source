package com.tencent.mm.ui.conversation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class h$5 extends AnimatorListenerAdapter
{
  h$5(h paramh, View paramView, h.f paramf)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(34358);
    super.onAnimationEnd(paramAnimator);
    h.a(this.ztS, this.ztT, this.ztU);
    ab.i("MicroMsg.ConversationWithCacheAdapter", "[dismissClickStatus] setBackground back!");
    AppMethodBeat.o(34358);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.h.5
 * JD-Core Version:    0.6.2
 */