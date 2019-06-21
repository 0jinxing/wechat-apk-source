package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.b;

final class e$4
  implements View.OnClickListener
{
  e$4(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(1886);
    this.sFU.getFSVideoUIComponent().cFV().sFy = true;
    AppMethodBeat.o(1886);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.e.4
 * JD-Core Version:    0.6.2
 */