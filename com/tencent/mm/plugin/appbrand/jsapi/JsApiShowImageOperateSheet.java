package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.s.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;

public final class JsApiShowImageOperateSheet extends a<w>
{
  public static final int CTRL_INDEX = 626;
  public static final String NAME = "showImageOperateSheet";

  static final class BottomSheetLogicHelper$b extends AppBrandProxyUIProcessTask
  {
    public final void a(AppBrandProxyUIProcessTask.ProcessRequest paramProcessRequest)
    {
      AppMethodBeat.i(130590);
      if (!(paramProcessRequest instanceof JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCProcessQRCodeResultRequest))
      {
        ab.e("MicroMsg.JsApiShowImageOperateSheet", "IPCProcessQRCodeResultTask request instance not valid");
        AppMethodBeat.o(130590);
      }
      while (true)
      {
        return;
        JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCProcessQRCodeResultRequest localIPCProcessQRCodeResultRequest = (JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCProcessQRCodeResultRequest)paramProcessRequest;
        paramProcessRequest = new cf();
        paramProcessRequest.cvm.activity = aBQ();
        paramProcessRequest.cvm.ctB = JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult.a(JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCProcessQRCodeResultRequest.a(localIPCProcessQRCodeResultRequest));
        paramProcessRequest.cvm.cvn = JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult.b(JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCProcessQRCodeResultRequest.a(localIPCProcessQRCodeResultRequest));
        paramProcessRequest.cvm.cvo = JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult.c(JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCProcessQRCodeResultRequest.a(localIPCProcessQRCodeResultRequest));
        paramProcessRequest.cvm.scene = 44;
        Bundle localBundle = new Bundle();
        localBundle.putInt("stat_scene", 6);
        localBundle.putString("stat_app_id", JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCProcessQRCodeResultRequest.b(localIPCProcessQRCodeResultRequest));
        localBundle.putString("stat_url", JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCProcessQRCodeResultRequest.c(localIPCProcessQRCodeResultRequest));
        paramProcessRequest.cvm.cvs = localBundle;
        com.tencent.mm.sdk.b.a.xxA.m(paramProcessRequest);
        AppMethodBeat.o(130590);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet
 * JD-Core Version:    0.6.2
 */