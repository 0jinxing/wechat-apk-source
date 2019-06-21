package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.service.d.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.bi;
import java.util.Map;

final class w$17
  implements d.a
{
  w$17(w paramw, Map paramMap, bi parambi, bd parambd)
  {
  }

  public final void d(WxaAttributes paramWxaAttributes)
  {
    AppMethodBeat.i(33147);
    if (paramWxaAttributes == null)
    {
      AppMethodBeat.o(33147);
      return;
    }
    w.b(this.zeW, paramWxaAttributes.field_appId);
    if ((paramWxaAttributes.field_appOpt & 0x1) > 0);
    for (boolean bool = true; ; bool = false)
    {
      al.d(new w.17.1(this, bool));
      AppMethodBeat.o(33147);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.17
 * JD-Core Version:    0.6.2
 */