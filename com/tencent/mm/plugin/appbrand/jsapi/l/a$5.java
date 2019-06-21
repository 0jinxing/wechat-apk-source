package com.tencent.mm.plugin.appbrand.jsapi.l;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity.a;

final class a$5
  implements MMActivity.a
{
  a$5(a parama, b.b paramb)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131405);
    if (paramInt1 != (this.hTM.hashCode() & 0xFFFF))
      AppMethodBeat.o(131405);
    while (true)
    {
      return;
      if (paramInt2 == -1)
      {
        String str = "";
        if (paramIntent != null)
          str = bo.bc(paramIntent.getStringExtra("token"), "");
        if (!TextUtils.isEmpty(str))
        {
          ab.i("MicroMsg.AppBrandJsApiPayService", "checkPwdToken is valid, verifyWCPayPassword:ok");
          if (this.hTN != null)
          {
            this.hTN.h(true, str);
            AppMethodBeat.o(131405);
          }
        }
        else
        {
          ab.i("MicroMsg.AppBrandJsApiPayService", "checkPwdToken is empty, verifyWCPayPassword:fail");
          if (this.hTN != null)
            this.hTN.h(false, null);
          AppMethodBeat.o(131405);
        }
      }
      else
      {
        if (this.hTN != null)
          this.hTN.h(false, null);
        AppMethodBeat.o(131405);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.l.a.5
 * JD-Core Version:    0.6.2
 */