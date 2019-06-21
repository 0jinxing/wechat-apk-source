package com.tencent.mm.plugin.appbrand.jsapi.auth;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.widget.b.h.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class JsApiOperateWXData$OperateWXDataTask$2$1
  implements h.d
{
  JsApiOperateWXData$OperateWXDataTask$2$1(JsApiOperateWXData.OperateWXDataTask.2 param2)
  {
  }

  public final void a(int paramInt, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(130879);
    ab.i("MicroMsg.JsApiOperateWXData", "stev onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      ab.d("MicroMsg.JsApiOperateWXData", "press back button!");
      this.hCt.hCr.hBQ.b(this.hCt.hCr.hBR, this.hCt.hCr.hwi, "fail auth cancel");
      this.hCt.hCr.hBS.aCB();
      AppMethodBeat.o(130879);
      label110: return;
    case 1:
    case 2:
    }
    this.hCt.hCr.hBU = "operateWXDataConfirm";
    JsApiOperateWXData.OperateWXDataTask localOperateWXDataTask = this.hCt.hCr;
    if (paramArrayList.size() > 0);
    for (paramArrayList = (String)paramArrayList.get(0); ; paramArrayList = "")
    {
      localOperateWXDataTask.hCq = paramArrayList;
      this.hCt.hCr.hBW = paramInt;
      AppBrandMainProcessService.a(this.hCt.hCr);
      if (paramInt != 2)
        break;
      this.hCt.hCr.hBQ.b(this.hCt.hCr.hBR, this.hCt.hCr.hwi, "fail auth deny");
      this.hCt.hCr.hBS.aCB();
      AppMethodBeat.o(130879);
      break label110;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData.OperateWXDataTask.2.1
 * JD-Core Version:    0.6.2
 */