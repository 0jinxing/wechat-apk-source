package com.tencent.mm.plugin.luckymoney.ui.a;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;

final class a$1
  implements Animation.AnimationListener
{
  a$1(ChatFooterPanel paramChatFooterPanel)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(43087);
    this.oiA.onPause();
    this.oiA.setVisibility(8);
    AppMethodBeat.o(43087);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(43086);
    this.oiA.setVisibility(0);
    AppMethodBeat.o(43086);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.a.a.1
 * JD-Core Version:    0.6.2
 */