package com.tencent.mm.plugin.webview.luggage.b;

import android.app.Activity;
import android.content.Context;
import com.tencent.luggage.d.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.ui.base.l;

public final class e extends a
{
  public e()
  {
    super(27);
  }

  public final void a(Context paramContext, d paramd)
  {
    AppMethodBeat.i(6432);
    if ((!paramd.cWG()) && (!paramd.bPe.xi().xb()))
      ((Activity)paramd.mContext).finish();
    com.tencent.mm.plugin.report.service.h.pYm.k(982L, 11L, 1L);
    AppMethodBeat.o(6432);
  }

  public final void a(Context paramContext, d paramd, l paraml)
  {
    AppMethodBeat.i(6431);
    if (paramd.isFullScreen())
      paraml.a(27, paramContext.getString(2131302142), 2131230994);
    AppMethodBeat.o(6431);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.b.e
 * JD-Core Version:    0.6.2
 */