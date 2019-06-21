package com.tencent.mm.plugin.webview.luggage.b;

import android.app.Activity;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;

public final class g extends a
{
  private com.tencent.mm.plugin.webview.modeltools.a uju;

  public g()
  {
    super(7);
    AppMethodBeat.i(6435);
    this.uju = new com.tencent.mm.plugin.webview.modeltools.a();
    AppMethodBeat.o(6435);
  }

  public final void a(Context paramContext, d paramd)
  {
    AppMethodBeat.i(6437);
    String str1 = paramd.cWM().aek(paramd.getUrl());
    String str2 = str1;
    if (bo.isNullOrNil(str1))
      str2 = paramd.getUrl();
    if ((paramContext instanceof Activity))
      com.tencent.mm.plugin.webview.modeltools.a.e((Activity)paramContext, str2);
    h.pYm.k(982L, 6L, 1L);
    AppMethodBeat.o(6437);
  }

  public final void a(Context paramContext, d paramd, l paraml)
  {
    AppMethodBeat.i(6436);
    paraml.a(7, paramContext.getString(2131305692), 2131230985);
    AppMethodBeat.o(6436);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.b.g
 * JD-Core Version:    0.6.2
 */