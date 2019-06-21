package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.b;

final class e$1
  implements View.OnClickListener
{
  e$1(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(1877);
    this.sFU.getFSVideoUIComponent().cGf();
    AppMethodBeat.o(1877);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.e.1
 * JD-Core Version:    0.6.2
 */