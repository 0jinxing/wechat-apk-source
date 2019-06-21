package com.tencent.mm.plugin.appbrand.jsapi.a;

import a.f.b.j;
import a.l;
import android.content.Intent;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/autofill/JsApiGetPhoneNumberNew;", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandAsyncJsApi;", "Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;", "()V", "invoke", "", "env", "data", "Lorg/json/JSONObject;", "callbackId", "", "Companion", "plugin-appbrand-integration_release"})
public final class c extends a<u>
{
  private static final int CTRL_INDEX = 209;
  private static final String NAME = "getPhoneNumber";
  public static final c.a hCz;

  static
  {
    AppMethodBeat.i(134663);
    hCz = new c.a((byte)0);
    NAME = "getPhoneNumber";
    CTRL_INDEX = 209;
    AppMethodBeat.o(134663);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "mmOnActivityResult"})
  static final class b
    implements MMActivity.a
  {
    b(c paramc, u paramu, int paramInt)
    {
    }

    public final void c(int paramInt1, int paramInt2, Intent paramIntent)
    {
      AppMethodBeat.i(134661);
      d.i("MicroMsg.JsApiGetPhoneNumberNew", "requestCode:%d resultCode:%d data:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramIntent });
      Object localObject1;
      if (paramInt1 == 291)
        localObject1 = new HashMap();
      Object localObject2;
      switch (paramInt2)
      {
      default:
        AppMethodBeat.o(134661);
      case -1:
        while (true)
        {
          return;
          if (paramIntent == null)
            break;
          localObject2 = (Map)localObject1;
          String str = paramIntent.getStringExtra("encryptedData");
          j.o(str, "data.getStringExtra(Phon…berProxyUI.ENCRYPTEDDATA)");
          ((Map)localObject2).put("encryptedData", str);
          localObject2 = (Map)localObject1;
          paramIntent = paramIntent.getStringExtra("iv");
          j.o(paramIntent, "data.getStringExtra(PhoneNumberProxyUI.IV)");
          ((Map)localObject2).put("iv", paramIntent);
          this.hCB.M(this.hBE, this.hCA.j("ok", (Map)localObject1));
          AppMethodBeat.o(134661);
        }
        localObject2 = this.hCB;
        paramInt1 = this.hBE;
        localObject1 = this.hCA;
        paramIntent = "fail";
      case 0:
      case 1:
      }
      while (true)
      {
        ((u)localObject2).M(paramInt1, ((c)localObject1).AK(paramIntent));
        break;
        localObject2 = this.hCB;
        paramInt1 = this.hBE;
        localObject1 = this.hCA;
        paramIntent = "fail:cancel";
        continue;
        localObject2 = this.hCB;
        paramInt1 = this.hBE;
        localObject1 = this.hCA;
        if (paramIntent != null)
          paramIntent = paramIntent.getStringExtra("errMsg");
        else
          paramIntent = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.a.c
 * JD-Core Version:    0.6.2
 */