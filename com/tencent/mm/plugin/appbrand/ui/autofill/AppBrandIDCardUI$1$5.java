package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.protocal.protobuf.bwu;
import com.tencent.mm.protocal.protobuf.fz;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandIDCardUI$1$5
  implements b.a
{
  AppBrandIDCardUI$1$5(AppBrandIDCardUI.1 param1)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(133219);
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paramb.fsH.fsP == null))
    {
      ab.e("MicroMsg.AppBrandIDCardUI", "sendSms cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramb.fsH.fsP });
      Toast.makeText(this.iKk.iKj, this.iKk.iKj.getString(2131296660), 0).show();
      AppMethodBeat.o(133219);
    }
    while (true)
    {
      return;
      paramString = (bwu)paramb.fsH.fsP;
      if (paramString.wXh != null)
      {
        ab.i("MicroMsg.AppBrandIDCardUI", "SendSmsResp.auth_base_response.err_code:%d", new Object[] { Integer.valueOf(paramString.wXh.cCJ) });
        if (paramString.wXh.cCJ == 0)
        {
          AppBrandIDCardUI.b(this.iKk.iKj, paramString.wXi);
          ab.i("MicroMsg.AppBrandIDCardUI", "send success, verifyToken:%s", new Object[] { paramString.wXi });
          AppMethodBeat.o(133219);
        }
        else
        {
          AppBrandIDCardUI.1.a(this.iKk, this.iKk.iKj.getString(2131296666));
          AppMethodBeat.o(133219);
        }
      }
      else
      {
        ab.i("MicroMsg.AppBrandIDCardUI", "SendSmsResp.auth_base_response is null");
        AppBrandIDCardUI.1.a(this.iKk, this.iKk.iKj.getString(2131296666));
        AppMethodBeat.o(133219);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.1.5
 * JD-Core Version:    0.6.2
 */