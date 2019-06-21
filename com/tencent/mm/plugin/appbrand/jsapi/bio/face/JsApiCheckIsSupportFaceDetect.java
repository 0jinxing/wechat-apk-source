package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.r.h;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class JsApiCheckIsSupportFaceDetect extends a
{
  public static final int CTRL_INDEX = 214;
  public static final String NAME = "checkIsSupportFacialRecognition";
  private JsApiCheckIsSupportFaceDetect.GetIsSupportFaceTask hCW = null;

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(3200);
    ab.i("MicroMsg.JsApiCheckIsSupportFaceDetect", "hy: subapp start do check is support face detect");
    this.hCW = new JsApiCheckIsSupportFaceDetect.GetIsSupportFaceTask(paramc, paramInt, this);
    h.bB(this.hCW);
    AppBrandMainProcessService.a(this.hCW);
    AppMethodBeat.o(3200);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect
 * JD-Core Version:    0.6.2
 */