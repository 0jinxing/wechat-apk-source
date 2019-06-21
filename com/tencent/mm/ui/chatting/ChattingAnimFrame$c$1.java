package com.tencent.mm.ui.chatting;

import android.view.animation.Animation;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.sdk.platformtools.ab;

final class ChattingAnimFrame$c$1 extends ChattingAnimFrame.a
{
  ChattingAnimFrame$c$1(ChattingAnimFrame.c paramc, ChattingAnimFrame paramChattingAnimFrame)
  {
    super(paramc.yHZ);
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(30513);
    paramAnimation = this.yIq;
    if (paramAnimation.yIo != null)
    {
      paramAnimation.yIo.post(new ChattingAnimFrame.c.2(paramAnimation));
      AppMethodBeat.o(30513);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.ChattingAnimFrame", "mTargetView is NULL.");
      AppMethodBeat.o(30513);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingAnimFrame.c.1
 * JD-Core Version:    0.6.2
 */