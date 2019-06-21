package com.tencent.mm.plugin.address.e;

import android.annotation.TargetApi;
import android.content.ClipboardManager;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class b
{
  @TargetApi(11)
  public static void wG(String paramString)
  {
    AppMethodBeat.i(17011);
    ((ClipboardManager)ah.getContext().getSystemService("clipboard")).setText(paramString);
    AppMethodBeat.o(17011);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.e.b
 * JD-Core Version:    0.6.2
 */