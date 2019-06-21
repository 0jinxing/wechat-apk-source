package com.tencent.mm.plugin.card.d;

import android.content.Context;
import android.text.ClipboardManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class o
{
  public static void wG(String paramString)
  {
    AppMethodBeat.i(88941);
    ((ClipboardManager)ah.getContext().getSystemService("clipboard")).setText(paramString);
    AppMethodBeat.o(88941);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.o
 * JD-Core Version:    0.6.2
 */