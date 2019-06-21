package com.tencent.mm.plugin.location.ui.impl;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class h$3
  implements View.OnClickListener
{
  h$3(h paramh)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(113697);
    ab.d("MicroMsg.TrackMapUI", "newpoi old go back onclick");
    this.nRb.czL = 0;
    this.nRb.bKB();
    this.nRb.bKK();
    AppMethodBeat.o(113697);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.h.3
 * JD-Core Version:    0.6.2
 */