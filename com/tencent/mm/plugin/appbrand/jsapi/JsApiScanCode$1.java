package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;

final class JsApiScanCode$1
  implements MMActivity.a
{
  JsApiScanCode$1(JsApiScanCode paramJsApiScanCode, s params, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(130556);
    JsApiScanCode.Pu();
    if (paramInt1 != (this.hyH.hashCode() & 0xFFFF))
      AppMethodBeat.o(130556);
    while (true)
    {
      return;
      switch (paramInt2)
      {
      default:
        this.hsj.M(this.eIl, this.hyH.j("fail", null));
        AppMethodBeat.o(130556);
      case -1:
      case 0:
      }
    }
    Object localObject1 = "";
    Object localObject2 = Base64.encodeToString(new byte[0], 2);
    if (paramIntent != null)
    {
      localObject1 = paramIntent.getStringExtra("key_scan_result");
      byte[] arrayOfByte = paramIntent.getByteArrayExtra("key_scan_result_raw");
      if (arrayOfByte != null)
        localObject2 = Base64.encodeToString(arrayOfByte, 2);
      paramIntent.getIntExtra("key_scan_result_type", 0);
      paramInt2 = paramIntent.getIntExtra("key_scan_result_code_type", 0);
      paramInt1 = paramIntent.getIntExtra("key_scan_result_code_version", 0);
    }
    for (paramIntent = (Intent)localObject1; ; paramIntent = (Intent)localObject1)
    {
      localObject1 = new HashMap();
      ((HashMap)localObject1).put("charSet", "utf-8");
      ((HashMap)localObject1).put("rawData", localObject2);
      if ((paramInt2 != 19) && (paramInt2 != 22))
      {
        localObject2 = paramIntent.split(",");
        if (localObject2.length > 1)
          paramIntent = localObject2[1];
        ((HashMap)localObject1).put("result", paramIntent);
        if (localObject2.length > 1);
        for (paramIntent = localObject2[0]; ; paramIntent = "")
        {
          ((HashMap)localObject1).put("scanType", paramIntent);
          this.hsj.M(this.eIl, this.hyH.j("ok", (Map)localObject1));
          AppMethodBeat.o(130556);
          break;
        }
      }
      if (paramInt2 == 22)
      {
        localObject2 = "";
        label291: ((HashMap)localObject1).put("result", localObject2);
        if (paramInt2 != 22)
          break label389;
      }
      label389: for (localObject2 = "WX_CODE"; ; localObject2 = "QR_CODE")
      {
        ((HashMap)localObject1).put("scanType", localObject2);
        localObject2 = new JsApiScanCode.GetA8KeyTask();
        ((JsApiScanCode.GetA8KeyTask)localObject2).hyL = paramIntent;
        ((JsApiScanCode.GetA8KeyTask)localObject2).cvn = paramInt2;
        ((JsApiScanCode.GetA8KeyTask)localObject2).cvo = paramInt1;
        ((JsApiScanCode.GetA8KeyTask)localObject2).hyN = new JsApiScanCode.1.1(this, (JsApiScanCode.GetA8KeyTask)localObject2, (HashMap)localObject1);
        ((JsApiScanCode.GetA8KeyTask)localObject2).aBV();
        AppBrandMainProcessService.a((MainProcessTask)localObject2);
        AppMethodBeat.o(130556);
        break;
        localObject2 = paramIntent;
        break label291;
      }
      this.hsj.M(this.eIl, this.hyH.j("cancel", null));
      AppMethodBeat.o(130556);
      break;
      paramInt1 = 0;
      paramInt2 = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiScanCode.1
 * JD-Core Version:    0.6.2
 */