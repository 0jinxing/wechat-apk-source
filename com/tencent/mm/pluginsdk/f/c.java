package com.tencent.mm.pluginsdk.f;

import android.content.Context;
import android.text.ClipboardManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class c
{
  public static void N(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79449);
    ((ClipboardManager)ah.getContext().getSystemService("clipboard")).setText(paramCharSequence);
    AppMethodBeat.o(79449);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.c
 * JD-Core Version:    0.6.2
 */