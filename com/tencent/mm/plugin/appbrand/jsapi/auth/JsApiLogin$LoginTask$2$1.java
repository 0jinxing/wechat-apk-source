package com.tencent.mm.plugin.appbrand.jsapi.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.widget.b.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class JsApiLogin$LoginTask$2$1
  implements c.a
{
  JsApiLogin$LoginTask$2$1(JsApiLogin.LoginTask.2 param2)
  {
  }

  public final void b(int paramInt, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(130857);
    ab.i("MicroMsg.JsApiLogin", "stev onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      ab.d("MicroMsg.JsApiLogin", "press back button!");
      this.hCm.hCl.hBQ.b(this.hCm.hCl.hBR, this.hCm.hCl.hwi, "fail auth cancel");
      this.hCm.hCl.hBS.aCB();
      AppMethodBeat.o(130857);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      this.hCm.hCl.hBU = "loginConfirm";
      this.hCm.hCl.hBT = paramArrayList;
      this.hCm.hCl.hBW = paramInt;
      AppBrandMainProcessService.a(this.hCm.hCl);
      if (paramInt != 2)
        break;
      this.hCm.hCl.hBQ.b(this.hCm.hCl.hBR, this.hCm.hCl.hwi, "fail auth deny");
      this.hCm.hCl.hBS.aCB();
      AppMethodBeat.o(130857);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin.LoginTask.2.1
 * JD-Core Version:    0.6.2
 */