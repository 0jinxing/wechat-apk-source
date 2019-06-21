package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class p$1
  implements Runnable
{
  p$1(p paramp)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(105984);
    if (p.a(this.ylj) != 0)
    {
      ab.v("MicroMsg.MListAdapter", "ashutest:: onResetCursorJobRun, current AbsListViewScrollType %d, post resetCursorJob, retryTimes %d", new Object[] { Integer.valueOf(p.a(this.ylj)), Integer.valueOf(p.b(this.ylj)) });
      p.d(this.ylj).removeCallbacks(p.c(this.ylj));
      if (20 > p.e(this.ylj))
      {
        p.d(this.ylj).postDelayed(p.c(this.ylj), 100L);
        AppMethodBeat.o(105984);
      }
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.MListAdapter", "ashutest:: onResetCursorJobRun, current AbsListViewScrollType %d, do resetCursorJob, retryTimes %d", new Object[] { Integer.valueOf(p.a(this.ylj)), Integer.valueOf(p.e(this.ylj)) });
      ab.d("MicroMsg.MListAdapter", "ashutest:: do resetCursorJob");
      p.f(this.ylj);
      p.g(this.ylj);
      AppMethodBeat.o(105984);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.p.1
 * JD-Core Version:    0.6.2
 */