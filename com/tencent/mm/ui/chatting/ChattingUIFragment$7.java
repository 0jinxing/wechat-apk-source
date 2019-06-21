package com.tencent.mm.ui.chatting;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.n;

final class ChattingUIFragment$7
  implements Runnable
{
  ChattingUIFragment$7(ChattingUIFragment paramChattingUIFragment, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30837);
    ab.i("MicroMsg.ChattingUIFragment", "[scrollToPosition] scroll to pos:%d", new Object[] { Integer.valueOf(this.gvp) });
    n localn = new n(this.yLv.yLl);
    int i = this.gvp;
    int j = ChattingUIFragment.a(this.yLv).getHeaderViewsCount() + i;
    localn.Ej.removeCallbacks(localn);
    localn.zGO = System.currentTimeMillis();
    localn.zGT = 0;
    int k = localn.Ej.getFirstVisiblePosition();
    i = localn.Ej.getChildCount() + k - 1;
    if (j <= k)
    {
      i = k - j + 1;
      localn.mMode = 2;
      if (i <= 0)
        break label188;
    }
    label188: for (localn.zGR = (1000 / i); ; localn.zGR = 1000)
    {
      localn.zGP = j;
      localn.zGQ = -1;
      localn.Ej.post(localn);
      AppMethodBeat.o(30837);
      while (true)
      {
        return;
        if (j >= i)
        {
          i = j - i + 1;
          localn.mMode = 1;
          break;
        }
        AppMethodBeat.o(30837);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingUIFragment.7
 * JD-Core Version:    0.6.2
 */