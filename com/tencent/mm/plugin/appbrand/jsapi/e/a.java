package com.tencent.mm.plugin.appbrand.jsapi.e;

import android.app.Activity;
import com.tencent.luggage.g.e;
import com.tencent.luggage.g.e.d;
import com.tencent.luggage.g.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

abstract class a<CONTEXT extends c> extends com.tencent.mm.plugin.appbrand.jsapi.a<CONTEXT>
{
  static boolean o(CONTEXT paramCONTEXT)
  {
    return g.o(paramCONTEXT.getContext(), "android.permission.ACCESS_FINE_LOCATION");
  }

  public void a(final CONTEXT paramCONTEXT, final JSONObject paramJSONObject, final int paramInt)
  {
    Activity localActivity;
    boolean bool;
    if ((paramCONTEXT.getContext() instanceof Activity))
    {
      localActivity = (Activity)paramCONTEXT.getContext();
      if (localActivity != null)
        break label82;
      ab.e("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "operateRecorder, pageContext is null");
      paramCONTEXT.M(paramInt, j("fail:internal error invalid android context", null));
      bool = false;
      label52: if (bool)
        break label108;
      ab.e("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "%s requestPermission fail", new Object[] { getName() });
    }
    while (true)
    {
      return;
      localActivity = null;
      break;
      label82: bool = e.ax(localActivity).a("android.permission.ACCESS_FINE_LOCATION", new e.d()
      {
        public final void l(int[] paramAnonymousArrayOfInt)
        {
          AppMethodBeat.i(93820);
          if ((paramAnonymousArrayOfInt != null) && (paramAnonymousArrayOfInt.length > 0) && (paramAnonymousArrayOfInt[0] == 0))
          {
            ab.i("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "PERMISSION_GRANTED, do invoke again");
            a.this.a(paramCONTEXT, paramJSONObject, paramInt);
            AppMethodBeat.o(93820);
          }
          while (true)
          {
            return;
            ab.e("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "SYS_PERM_DENIED");
            paramCONTEXT.M(paramInt, a.this.j("fail:system permission denied", null));
            AppMethodBeat.o(93820);
          }
        }
      });
      break label52;
      label108: if (paramJSONObject == null)
      {
        ab.e("MicroMsg.AppBrand.BaseLbsAsyncJsApi", "%s invalid data", new Object[] { getName() });
        paramCONTEXT.M(paramInt, j("fail:invalid data", null));
      }
      else
      {
        c(paramCONTEXT, paramJSONObject, paramInt);
      }
    }
  }

  protected abstract void c(CONTEXT paramCONTEXT, JSONObject paramJSONObject, int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.a
 * JD-Core Version:    0.6.2
 */