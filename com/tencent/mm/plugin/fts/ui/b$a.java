package com.tencent.mm.plugin.fts.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;

public final class b$a
{
  public static int mHq;

  static
  {
    AppMethodBeat.i(61717);
    mHq = 0;
    Context localContext = ah.getContext();
    mHq = a.gd(localContext) - a.al(localContext, 2131427840) * 2 - a.al(localContext, 2131427804) - a.al(localContext, 2131427840);
    AppMethodBeat.o(61717);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.b.a
 * JD-Core Version:    0.6.2
 */