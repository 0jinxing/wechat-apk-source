package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

final class ay$1
  implements MMActivity.a
{
  ay$1(ay paramay, q paramq, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(73153);
    ay.Pu();
    if (paramInt1 != (this.hyi.hashCode() & 0xFFFF))
      AppMethodBeat.o(73153);
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiOpenQRCode", "onActivityResult requestCode:%d  resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      switch (paramInt2)
      {
      default:
        this.hsD.M(this.eIl, this.hyi.j("fail", null));
        AppMethodBeat.o(73153);
        break;
      case -1:
        if (paramIntent == null)
        {
          ab.e("MicroMsg.JsApiOpenQRCode", "data is null, err");
          this.hsD.M(this.eIl, this.hyi.j("fail:unknown err", null));
          AppMethodBeat.o(73153);
        }
        else
        {
          HashMap localHashMap = new HashMap();
          String str = paramIntent.getStringExtra("key_scan_result");
          paramInt1 = paramIntent.getIntExtra("key_scan_result_type", 0);
          ab.d("MicroMsg.JsApiOpenQRCode", "result:%s, resultType:%d", new Object[] { str, Integer.valueOf(paramInt1) });
          JSONObject localJSONObject = new JSONObject();
          if (paramInt1 == 1)
            paramIntent = "qrcode";
          try
          {
            localJSONObject.put("scan_type", paramIntent);
            localJSONObject.put("scan_result", str);
            paramIntent = new JSONObject();
          }
          catch (JSONException paramIntent)
          {
            try
            {
              while (true)
              {
                paramIntent.put("scan_code", localJSONObject);
                localHashMap.put("resultStr", paramIntent.toString());
                ab.d("MicroMsg.JsApiOpenQRCode", "ret:%s", new Object[] { localHashMap });
                this.hsD.M(this.eIl, this.hyi.j("ok", localHashMap));
                AppMethodBeat.o(73153);
                break;
                paramIntent = "barcode";
              }
              paramIntent = paramIntent;
              ab.printErrStackTrace("MicroMsg.JsApiOpenQRCode", paramIntent, "", new Object[0]);
            }
            catch (JSONException localJSONException)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.JsApiOpenQRCode", localJSONException, "", new Object[0]);
            }
          }
        }
        break;
      case 0:
        this.hsD.M(this.eIl, this.hyi.j("cancel", null));
        AppMethodBeat.o(73153);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.ay.1
 * JD-Core Version:    0.6.2
 */