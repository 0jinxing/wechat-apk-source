package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;

final class e$1
  implements MMActivity.a
{
  e$1(e parame, u paramu, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(130899);
    ab.i("MicroMsg.JsApiOpenRealnameAuth", "mmOnActivityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    HashMap localHashMap;
    if (paramInt1 == 1)
    {
      localHashMap = new HashMap();
      if (paramInt2 == -1)
      {
        ab.i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth ok");
        paramIntent = paramIntent.getStringExtra("intent_auth_token");
        if (!bo.isNullOrNil(paramIntent))
        {
          localHashMap.put("errCode", Integer.valueOf(0));
          localHashMap.put("auth_token", paramIntent);
          this.hCx.M(this.eIl, this.hCD.j("ok", localHashMap));
          ab.d("MicroMsg.JsApiOpenRealnameAuth", "authToken:%s", new Object[] { paramIntent });
          AppMethodBeat.o(130899);
        }
      }
    }
    while (true)
    {
      return;
      this.hCx.M(this.eIl, this.hCD.j("fail", localHashMap));
      AppMethodBeat.o(130899);
      continue;
      if (paramInt2 == 0)
      {
        ab.i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth cancel");
        this.hCx.M(this.eIl, this.hCD.j("cancel", null));
        AppMethodBeat.o(130899);
      }
      else if (paramInt2 == 1)
      {
        ab.i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth fail");
        if (paramIntent != null)
        {
          paramInt1 = paramIntent.getIntExtra("intent_err_code", -1);
          paramIntent = paramIntent.getStringExtra("intent_err_msg");
          localHashMap.put("errCode", Integer.valueOf(paramInt1));
          this.hCx.M(this.eIl, this.hCD.j("fail:" + bo.nullAsNil(paramIntent), localHashMap));
          ab.i("MicroMsg.JsApiOpenRealnameAuth", "openRealnameAuth errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), paramIntent });
          AppMethodBeat.o(130899);
        }
        else
        {
          this.hCx.M(this.eIl, this.hCD.j("fail", localHashMap));
        }
      }
      else
      {
        AppMethodBeat.o(130899);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.a.e.1
 * JD-Core Version:    0.6.2
 */