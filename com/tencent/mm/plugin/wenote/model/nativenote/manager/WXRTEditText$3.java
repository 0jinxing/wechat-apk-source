package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.c.b;
import com.tencent.mm.sdk.platformtools.ap.a;

final class WXRTEditText$3
  implements ap.a
{
  WXRTEditText$3(WXRTEditText paramWXRTEditText)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(26788);
    if ((WXRTEditText.o(this.uQo) != null) && (WXRTEditText.o(this.uQo).getType() == 1))
    {
      int i = WXRTEditText.o(this.uQo).uQW;
      WXRTEditText.p(this.uQo);
      this.uQo.ax(i, false);
    }
    AppMethodBeat.o(26788);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText.3
 * JD-Core Version:    0.6.2
 */