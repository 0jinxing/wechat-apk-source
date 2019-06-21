package com.tencent.mm.plugin.address.e;

import android.content.Context;
import android.text.ClipboardManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class c
{
  public static void wG(String paramString)
  {
    AppMethodBeat.i(17012);
    ((ClipboardManager)ah.getContext().getSystemService("clipboard")).setText(paramString);
    AppMethodBeat.o(17012);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.e.c
 * JD-Core Version:    0.6.2
 */