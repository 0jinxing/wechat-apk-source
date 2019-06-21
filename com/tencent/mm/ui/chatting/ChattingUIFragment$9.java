package com.tencent.mm.ui.chatting;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ChattingUIFragment$9
  implements Runnable
{
  ChattingUIFragment$9(ChattingUIFragment paramChattingUIFragment)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30839);
    if ((ChattingUIFragment.b(this.yLv)) || (ChattingUIFragment.c(this.yLv) != 0))
    {
      ChattingUIFragment.d(this.yLv);
      ab.i("MicroMsg.ChattingUIFragment", "scrollToLastProtect userTouched: %s state: %s", new Object[] { Boolean.valueOf(ChattingUIFragment.b(this.yLv)), Integer.valueOf(ChattingUIFragment.c(this.yLv)) });
      AppMethodBeat.o(30839);
    }
    while (true)
    {
      return;
      int i = ChattingUIFragment.a(this.yLv).getLastVisiblePosition();
      int j = ChattingUIFragment.a(this.yLv).getCount() - 1;
      ab.i("MicroMsg.ChattingUIFragment", "scrollToLastProtect tryScrollTimes : %s, lastvisible/total=%s/%s", new Object[] { Integer.valueOf(ChattingUIFragment.e(this.yLv)), Integer.valueOf(i), Integer.valueOf(j) });
      if (i < j)
      {
        ChattingUIFragment.a(this.yLv, true);
        this.yLv.dCD();
        AppMethodBeat.o(30839);
      }
      else
      {
        ChattingUIFragment.d(this.yLv);
        AppMethodBeat.o(30839);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingUIFragment.9
 * JD-Core Version:    0.6.2
 */