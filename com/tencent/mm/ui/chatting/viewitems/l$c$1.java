package com.tencent.mm.ui.chatting.viewitems;

import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class l$c$1
  implements Runnable
{
  l$c$1(l.c paramc, l.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32959);
    this.zdW.mOX.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(this.zdW.mOX.getWidth(), this.zdW.mOX.getHeight());
    this.zdW.mPb.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(32959);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.l.c.1
 * JD-Core Version:    0.6.2
 */