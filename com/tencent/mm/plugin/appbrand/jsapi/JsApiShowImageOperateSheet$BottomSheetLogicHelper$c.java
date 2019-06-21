package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.np;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class JsApiShowImageOperateSheet$BottomSheetLogicHelper$c
  implements com.tencent.mm.ipcinvoker.a<JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeParam, JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult>
{
  private boolean hzk = false;

  private void a(JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeParam paramIPCQRCodeRecognizeParam, c<JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult> paramc, boolean paramBoolean)
  {
    AppMethodBeat.i(130595);
    String str;
    if (paramBoolean)
    {
      str = JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeParam.a(paramIPCQRCodeRecognizeParam);
      ab.i("MicroMsg.JsApiShowImageOperateSheet", "doRecognizeLogic mIsBakPathUsed:%b useBak:%b path:%s", new Object[] { Boolean.valueOf(this.hzk), Boolean.valueOf(paramBoolean), str });
      this.hzk = paramBoolean;
      if (!bo.isNullOrNil(str))
        break label76;
      AppMethodBeat.o(130595);
    }
    while (true)
    {
      return;
      str = JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeParam.b(paramIPCQRCodeRecognizeParam);
      break;
      label76: j localj1 = new j();
      j localj2 = new j();
      JsApiShowImageOperateSheet.BottomSheetLogicHelper.c.1 local1 = new JsApiShowImageOperateSheet.BottomSheetLogicHelper.c.1(this, localj1, localj2, str, paramc);
      localj1.value = local1;
      paramIPCQRCodeRecognizeParam = new JsApiShowImageOperateSheet.BottomSheetLogicHelper.c.2(this, localj1, localj2, str, paramIPCQRCodeRecognizeParam, paramc);
      localj2.value = paramIPCQRCodeRecognizeParam;
      com.tencent.mm.sdk.b.a.xxA.c(local1);
      com.tencent.mm.sdk.b.a.xxA.c(paramIPCQRCodeRecognizeParam);
      paramIPCQRCodeRecognizeParam = new np();
      paramIPCQRCodeRecognizeParam.cJU.filePath = str;
      paramIPCQRCodeRecognizeParam.cJU.cJV = JsApiShowImageOperateSheet.BottomSheetLogicHelper.aCo();
      com.tencent.mm.sdk.b.a.xxA.m(paramIPCQRCodeRecognizeParam);
      AppMethodBeat.o(130595);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet.BottomSheetLogicHelper.c
 * JD-Core Version:    0.6.2
 */