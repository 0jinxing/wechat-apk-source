package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.choosemsgfile.compat.MsgFile;
import com.tencent.mm.choosemsgfile.compat.a.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

final class c$1
  implements a.a
{
  c$1(c paramc, com.tencent.mm.plugin.appbrand.jsapi.c paramc1, int paramInt)
  {
  }

  public final void a(int paramInt, String paramString, ArrayList<MsgFile> paramArrayList)
  {
    AppMethodBeat.i(131215);
    d.i("MicroMsg.JsApiChooseMessageFile", "resultCode:%d filePaths:%s", new Object[] { Integer.valueOf(paramInt), paramArrayList });
    switch (paramInt)
    {
    default:
    case -1:
    case 1:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(131215);
      while (true)
      {
        return;
        com.tencent.mm.plugin.appbrand.r.m.aNS().aa(new c.1.1(this, paramArrayList));
        AppMethodBeat.o(131215);
        continue;
        if (bo.isNullOrNil(paramString))
        {
          this.hIt.M(this.eIl, this.hPz.j("fail", null));
          AppMethodBeat.o(131215);
        }
        else
        {
          this.hIt.M(this.eIl, this.hPz.j("fail:".concat(String.valueOf(paramString)), null));
          AppMethodBeat.o(131215);
        }
      }
      this.hIt.M(this.eIl, this.hPz.j("fail:cancel", null));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.c.1
 * JD-Core Version:    0.6.2
 */