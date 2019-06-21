package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.compat.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiOpenWeRunSetting$OpenWeRunSetting$1
  implements a.a
{
  JsApiOpenWeRunSetting$OpenWeRunSetting$1(JsApiOpenWeRunSetting.OpenWeRunSetting paramOpenWeRunSetting)
  {
  }

  public final void q(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(130528);
    JsApiOpenWeRunSetting.OpenWeRunSetting localOpenWeRunSetting = this.hyu;
    if ((paramBoolean1) && (paramBoolean2));
    for (boolean bool = true; ; bool = false)
    {
      JsApiOpenWeRunSetting.OpenWeRunSetting.a(localOpenWeRunSetting, bool);
      ab.i("MicroMsg.JsApiOpenWeRunSetting", "After getUserState requestOk %b, hasStep %b", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
      JsApiOpenWeRunSetting.OpenWeRunSetting.a(this.hyu);
      AppMethodBeat.o(130528);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting.OpenWeRunSetting.1
 * JD-Core Version:    0.6.2
 */