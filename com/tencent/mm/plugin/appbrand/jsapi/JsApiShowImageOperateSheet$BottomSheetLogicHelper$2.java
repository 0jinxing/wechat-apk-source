package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class JsApiShowImageOperateSheet$BottomSheetLogicHelper$2
  implements n.c
{
  JsApiShowImageOperateSheet$BottomSheetLogicHelper$2(JsApiShowImageOperateSheet.BottomSheetLogicHelper paramBottomSheetLogicHelper, Context paramContext)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(130575);
    paraml.clear();
    paraml.hi(1, 2131302491);
    paraml.hi(2, 2131302709);
    paraml.hi(3, 2131301955);
    if ((JsApiShowImageOperateSheet.BottomSheetLogicHelper.b(this.hyY) != null) && (!bo.isNullOrNil(JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult.a(JsApiShowImageOperateSheet.BottomSheetLogicHelper.b(this.hyY)))))
      if (a.ba(JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult.b(JsApiShowImageOperateSheet.BottomSheetLogicHelper.b(this.hyY)), JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult.a(JsApiShowImageOperateSheet.BottomSheetLogicHelper.b(this.hyY))))
      {
        paraml.e(4, this.val$context.getString(2131302188));
        AppMethodBeat.o(130575);
      }
    while (true)
    {
      return;
      ab.w("MicroMsg.JsApiShowImageOperateSheet", "showBottomSheet not WXCode codeType:%d result:%s", new Object[] { Integer.valueOf(JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult.b(JsApiShowImageOperateSheet.BottomSheetLogicHelper.b(this.hyY))), JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult.a(JsApiShowImageOperateSheet.BottomSheetLogicHelper.b(this.hyY)) });
      AppMethodBeat.o(130575);
      continue;
      JsApiShowImageOperateSheet.BottomSheetLogicHelper.a(this.hyY, JsApiShowImageOperateSheet.BottomSheetLogicHelper.c(this.hyY));
      AppMethodBeat.o(130575);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet.BottomSheetLogicHelper.2
 * JD-Core Version:    0.6.2
 */