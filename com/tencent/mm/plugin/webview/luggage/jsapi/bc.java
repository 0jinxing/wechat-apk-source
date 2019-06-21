package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.luggage.d.n;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask;
import com.tencent.mm.plugin.webview.luggage.ipc.b;
import com.tencent.mm.plugin.webview.luggage.ipc.d;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public abstract class bc<T extends n> extends a<T>
{
  public abstract void a(Context paramContext, String paramString, bc.a parama);

  public void a(a<T>.a parama)
  {
    Object localObject;
    if (biG() == 1)
    {
      localObject = new JsApiMMTask();
      ((JsApiMMTask)localObject).ujK = parama;
      ((JsApiMMTask)localObject).ujL = getClass().getName();
      ((JsApiMMTask)localObject).hAP = parama.bPa.bOf.toString();
      ((JsApiMMTask)localObject).aBV();
      AppBrandMainProcessService.a((MainProcessTask)localObject);
    }
    while (true)
    {
      return;
      if (biG() == 2)
      {
        localObject = new Bundle();
        ((Bundle)localObject).putString("jsapi_name", getClass().getName());
        ((Bundle)localObject).putString("data", parama.bPa.bOf.toString());
        b.a((MMActivity)((n)parama.bOZ).mContext, (Bundle)localObject, d.class, new bc.1(this, parama));
      }
      else
      {
        b(parama);
      }
    }
  }

  public abstract void b(a<T>.a parama);

  public abstract int biG();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.bc
 * JD-Core Version:    0.6.2
 */