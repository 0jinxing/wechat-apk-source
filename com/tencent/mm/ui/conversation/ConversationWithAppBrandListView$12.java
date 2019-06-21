package com.tencent.mm.ui.conversation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ConversationWithAppBrandListView$12
  implements Animator.AnimatorListener
{
  ConversationWithAppBrandListView$12(ConversationWithAppBrandListView paramConversationWithAppBrandListView)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(34279);
    ConversationWithAppBrandListView.k(this.ztq);
    AppMethodBeat.o(34279);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(34278);
    ConversationWithAppBrandListView.k(this.ztq);
    AppMethodBeat.o(34278);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationWithAppBrandListView.12
 * JD-Core Version:    0.6.2
 */