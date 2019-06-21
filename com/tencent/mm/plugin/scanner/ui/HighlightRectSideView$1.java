package com.tencent.mm.plugin.scanner.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;

final class HighlightRectSideView$1
  implements ap.a
{
  HighlightRectSideView$1(HighlightRectSideView paramHighlightRectSideView)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(81023);
    HighlightRectSideView.a(this.qcx);
    this.qcx.invalidate();
    AppMethodBeat.o(81023);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.HighlightRectSideView.1
 * JD-Core Version:    0.6.2
 */