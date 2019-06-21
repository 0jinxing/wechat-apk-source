package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gif.MMAnimateView;
import java.util.List;

final class ChattingAnimFrame$c$2
  implements Runnable
{
  ChattingAnimFrame$c$2(ChattingAnimFrame.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30514);
    MMAnimateView localMMAnimateView;
    if (this.yIq.yIo != null)
    {
      this.yIq.yIo.clearAnimation();
      ChattingAnimFrame localChattingAnimFrame = this.yIq.yHZ;
      localMMAnimateView = this.yIq.yIo;
      if ((localMMAnimateView != null) && (localChattingAnimFrame.yHT != null))
      {
        localChattingAnimFrame.yHT.remove(localMMAnimateView);
        localMMAnimateView.recycle();
        if (localChattingAnimFrame.yHT.isEmpty())
        {
          localMMAnimateView.setLayerType(0, null);
          localChattingAnimFrame.removeAllViews();
          AppMethodBeat.o(30514);
        }
      }
    }
    while (true)
    {
      return;
      localMMAnimateView.setVisibility(4);
      localMMAnimateView.setLayerType(0, null);
      AppMethodBeat.o(30514);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingAnimFrame.c.2
 * JD-Core Version:    0.6.2
 */