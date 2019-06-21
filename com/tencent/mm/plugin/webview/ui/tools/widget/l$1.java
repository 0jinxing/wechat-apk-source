package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class l$1 extends m
{
  l$1(l paraml)
  {
  }

  public final void W(Bundle paramBundle)
  {
    AppMethodBeat.i(10022);
    if (((this.uJJ.uJH instanceof e)) && (((e)this.uJJ.uJH).aba()))
      AppMethodBeat.o(10022);
    while (true)
    {
      return;
      super.W(paramBundle);
      AppMethodBeat.o(10022);
    }
  }

  public final boolean c(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(10021);
    boolean bool;
    if (this.uJJ.uJH != null)
    {
      bool = this.uJJ.uJH.c(paramInt, paramBundle);
      AppMethodBeat.o(10021);
    }
    while (true)
    {
      return bool;
      bool = super.c(paramInt, paramBundle);
      AppMethodBeat.o(10021);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.l.1
 * JD-Core Version:    0.6.2
 */