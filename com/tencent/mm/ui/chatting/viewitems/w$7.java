package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.service.d.a;
import com.tencent.mm.sdk.platformtools.al;

final class w$7
  implements d.a
{
  w$7(w paramw, bd parambd, String paramString)
  {
  }

  public final void d(WxaAttributes paramWxaAttributes)
  {
    AppMethodBeat.i(33134);
    if (paramWxaAttributes == null)
      AppMethodBeat.o(33134);
    while (true)
    {
      return;
      al.d(new w.7.1(this, paramWxaAttributes.field_brandIconURL, paramWxaAttributes.field_nickname));
      AppMethodBeat.o(33134);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.7
 * JD-Core Version:    0.6.2
 */