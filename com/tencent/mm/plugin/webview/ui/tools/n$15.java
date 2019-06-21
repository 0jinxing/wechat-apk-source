package com.tencent.mm.plugin.webview.ui.tools;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.a.b;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import org.json.JSONArray;
import org.json.JSONObject;

final class n$15
  implements Runnable
{
  n$15(n paramn, WebViewUI paramWebViewUI, d paramd, String paramString, byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2, k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7727);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7727);
    while (true)
    {
      return;
      if (this.uum != null)
      {
        Object localObject1 = this.uum;
        String str = this.uuv;
        byte[] arrayOfByte = this.uuw;
        boolean bool1 = this.uux;
        boolean bool2 = this.uuy;
        if (!((d)localObject1).ready)
        {
          ab.e("MicroMsg.JsApiHandler", "onScanWXDeviceResult fail, not ready");
          AppMethodBeat.o(7727);
        }
        else
        {
          if (arrayOfByte == null);
          for (int i = 0; ; i = arrayOfByte.length)
          {
            ab.i("MicroMsg.JsApiHandler", "onScanWXDeviceResult: device id = %s, isCompleted = %s, %s", new Object[] { str, Boolean.valueOf(bool1), Integer.valueOf(i) });
            if (!bo.isNullOrNil(str))
              break label155;
            ab.e("MicroMsg.JsApiHandler", "parameter error!!!");
            AppMethodBeat.o(7727);
            break;
          }
          label155: Object localObject2 = new JSONObject();
          try
          {
            localObject3 = new org/json/JSONArray;
            ((JSONArray)localObject3).<init>();
            JSONObject localJSONObject = new org/json/JSONObject;
            localJSONObject.<init>();
            localJSONObject.put("deviceId", str);
            b.dbr();
            if ((b.bE(arrayOfByte)) || ((arrayOfByte != null) && (bool2)))
              localJSONObject.put("base64BroadcastData", Base64.encodeToString(arrayOfByte, 2));
            ((JSONArray)localObject3).put(localJSONObject);
            ((JSONObject)localObject2).put("devices", localObject3);
            if (bool1)
            {
              ((JSONObject)localObject2).put("isCompleted", "1");
              localObject2 = i.a.a("onScanWXDeviceResult", (JSONObject)localObject2, ((d)localObject1).uFv, ((d)localObject1).uFw);
            }
          }
          catch (Exception localException2)
          {
            try
            {
              while (true)
              {
                ab.i("MicroMsg.JsApiHandler", "hakon onScanWXDeviceResult, %s", new Object[] { localObject2 });
                localObject1 = ((d)localObject1).uFo;
                Object localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
                ((MMWebView)localObject1).evaluateJavascript((String)localObject2 + ")", null);
                if (!bool2)
                  b.dbr().uAa = arrayOfByte;
                AppMethodBeat.o(7727);
                break;
                ((JSONObject)localObject2).put("isCompleted", "0");
              }
              localException2 = localException2;
              ab.e("MicroMsg.JsApiHandler", "Ex in onScanWXDeviceResult, %s", new Object[] { localException2.getMessage() });
            }
            catch (Exception localException1)
            {
              while (true)
                ab.w("MicroMsg.JsApiHandler", "onScanWXDeviceResult, %s", new Object[] { localException1.getMessage() });
            }
          }
        }
      }
      else
      {
        ab.e("MicroMsg.WebViewStubCallbackAIDLStub", "hakon can not call onScanWXDeviceResult, %s, %s", new Object[] { this.uum, this.uun });
        AppMethodBeat.o(7727);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.15
 * JD-Core Version:    0.6.2
 */