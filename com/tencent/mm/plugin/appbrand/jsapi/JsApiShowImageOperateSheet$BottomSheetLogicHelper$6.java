package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.s.b.a;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class JsApiShowImageOperateSheet$BottomSheetLogicHelper$6
  implements b.a
{
  JsApiShowImageOperateSheet$BottomSheetLogicHelper$6(JsApiShowImageOperateSheet.BottomSheetLogicHelper paramBottomSheetLogicHelper)
  {
  }

  public final void AN(String paramString)
  {
    AppMethodBeat.i(130579);
    ab.i("MicroMsg.JsApiShowImageOperateSheet", "saveToSDCard localPath:%s", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(130579);
    while (true)
    {
      return;
      n.j(paramString, JsApiShowImageOperateSheet.BottomSheetLogicHelper.c(this.hyY).mContext);
      AppMethodBeat.o(130579);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet.BottomSheetLogicHelper.6
 * JD-Core Version:    0.6.2
 */