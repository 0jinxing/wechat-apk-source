package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"radius_4dp", "", "getRadius_4dp", "()I", "plugin-card_release"})
public final class e
{
  private static final int kqm;

  static
  {
    AppMethodBeat.i(89328);
    Context localContext = ah.getContext();
    j.o(localContext, "MMApplicationContext.getContext()");
    kqm = localContext.getResources().getDimensionPixelOffset(2131428166);
    AppMethodBeat.o(89328);
  }

  public static final int ber()
  {
    return kqm;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.e
 * JD-Core Version:    0.6.2
 */