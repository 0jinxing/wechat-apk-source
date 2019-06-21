package com.tencent.mm.plugin.webview.fts.c;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView.a;
import com.tencent.mm.plugin.webview.fts.ui.b.4;
import com.tencent.mm.plugin.webview.fts.ui.b.5;
import com.tencent.mm.sdk.platformtools.bj;

final class b$2
  implements FtsWebVideoView.a
{
  b$2(b paramb, int paramInt, a parama)
  {
  }

  public final void aDF()
  {
    AppMethodBeat.i(5931);
    com.tencent.mm.plugin.webview.fts.ui.b localb = this.uhD.uhA;
    int i = this.uhE;
    b.5 local5 = new b.5(localb, Boolean.FALSE, i);
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      ((Boolean)local5.b(null)).booleanValue();
      AppMethodBeat.o(5931);
    }
    while (true)
    {
      return;
      ((Boolean)local5.b(localb.mHandler)).booleanValue();
      AppMethodBeat.o(5931);
    }
  }

  public final boolean isFullScreen()
  {
    AppMethodBeat.i(5932);
    boolean bool = this.uhD.uhA.pB(this.uhE);
    AppMethodBeat.o(5932);
    return bool;
  }

  public final void nI(boolean paramBoolean)
  {
    AppMethodBeat.i(5930);
    com.tencent.mm.plugin.webview.fts.ui.b localb = this.uhD.uhA;
    int i = this.uhE;
    Object localObject = this.uhF;
    localObject = new b.4(localb, Boolean.FALSE, i, (a)localObject, paramBoolean);
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      ((Boolean)((bj)localObject).b(null)).booleanValue();
      AppMethodBeat.o(5930);
    }
    while (true)
    {
      return;
      ((Boolean)((bj)localObject).b(localb.mHandler)).booleanValue();
      AppMethodBeat.o(5930);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.c.b.2
 * JD-Core Version:    0.6.2
 */