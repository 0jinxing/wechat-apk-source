package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.e;
import com.tencent.mm.plugin.appbrand.widget.input.panel.c;
import com.tencent.mm.sdk.platformtools.ah;

final class ak extends c
{
  private static final int jhe;
  private e jhd = null;

  static
  {
    AppMethodBeat.i(134298);
    jhe = ah.getContext().getResources().getDimensionPixelSize(2131427813);
    AppMethodBeat.o(134298);
  }

  public final e aRr()
  {
    AppMethodBeat.i(134297);
    if (this.jhd == null)
      this.jhd = new ak.a();
    e locale = this.jhd;
    AppMethodBeat.o(134297);
    return locale;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.ak
 * JD-Core Version:    0.6.2
 */