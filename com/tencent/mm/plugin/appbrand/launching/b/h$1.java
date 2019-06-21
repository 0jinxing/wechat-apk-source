package com.tencent.mm.plugin.appbrand.launching.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.a;
import com.tencent.mm.plugin.appbrand.launching.aa;
import com.tencent.mm.plugin.appbrand.service.d.a;
import com.tencent.mm.sdk.platformtools.ab;

final class h$1
  implements d.a
{
  h$1(h.a parama, aa paramaa)
  {
  }

  public final void d(WxaAttributes paramWxaAttributes)
  {
    AppMethodBeat.i(132044);
    if (paramWxaAttributes == null)
    {
      ab.i("MicroMsg.AppBrand.WxaBanJumpHelper", "[banjump] shouldBanJump, get contact info fail");
      h.a(this.ijt);
      AppMethodBeat.o(132044);
    }
    while (true)
    {
      return;
      boolean bool = paramWxaAttributes.ayJ().xy();
      if (((this.iju.Cj("banJumpGame")) && (bool)) || ((this.iju.Cj("banJumpApp")) && (!bool)))
      {
        ab.i("MicroMsg.AppBrand.WxaBanJumpHelper", "[banjump] shouldBanJump, return should ban jump");
        paramWxaAttributes = this.ijt;
        if (paramWxaAttributes != null)
          paramWxaAttributes.aHG();
        AppMethodBeat.o(132044);
      }
      else
      {
        ab.i("MicroMsg.AppBrand.WxaBanJumpHelper", "[banjump] shouldBanJump, no need to ban jump");
        h.a(this.ijt);
        AppMethodBeat.o(132044);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.b.h.1
 * JD-Core Version:    0.6.2
 */