package com.tencent.mm.plugin.fts.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

public final class b$b
{
  public static final int mHr;
  public static final int mHs;
  public static final int mHt;

  static
  {
    AppMethodBeat.i(61718);
    mHr = ah.getContext().getResources().getColor(2131690683);
    mHs = Color.parseColor("#661AAD19");
    mHt = Color.parseColor("#801AAD19");
    AppMethodBeat.o(61718);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.b.b
 * JD-Core Version:    0.6.2
 */