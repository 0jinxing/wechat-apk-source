package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.content.Intent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bzo;
import com.tencent.mm.protocal.protobuf.cne;
import com.tencent.mm.protocal.protobuf.fz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class AppBrandIDCardUI$1$6
  implements b.a
{
  AppBrandIDCardUI$1$6(AppBrandIDCardUI.1 param1)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(133220);
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paramb.fsH.fsP == null))
    {
      ab.e("MicroMsg.AppBrandIDCardUI", "SubmitAuthorizeUserID cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramb.fsH.fsP });
      Toast.makeText(this.iKk.iKj, this.iKk.iKj.getString(2131296660), 0).show();
      AppMethodBeat.o(133220);
    }
    while (true)
    {
      return;
      paramString = (cne)paramb.fsH.fsP;
      if (paramString.wXh != null)
      {
        ab.i("MicroMsg.AppBrandIDCardUI", "VerifySmsCodeResp.auth_base_response errcode:%s, errMsg:%s", new Object[] { Integer.valueOf(paramString.wXh.cCJ), bo.nullAsNil(paramString.wXh.cCK) });
        h.pYm.e(14943, new Object[] { AppBrandIDCardUI.a(this.iKk.iKj), Integer.valueOf(8), AppBrandIDCardUI.g(this.iKk.iKj).cxb });
        if (paramString.wXh.cCJ == 0)
        {
          h.pYm.e(14943, new Object[] { AppBrandIDCardUI.a(this.iKk.iKj), Integer.valueOf(9), AppBrandIDCardUI.g(this.iKk.iKj).cxb });
          ab.i("MicroMsg.AppBrandIDCardUI", "verify success");
          ab.d("MicroMsg.AppBrandIDCardUI", "resq.auth_token", new Object[] { paramString.wcg });
          paramb = new Intent();
          paramb.putExtra("intent_err_code", paramString.wXh.cCJ);
          paramb.putExtra("intent_auth_token", paramString.wcg);
          this.iKk.iKj.setResult(-1, paramb);
          this.iKk.iKj.finish();
          AppMethodBeat.o(133220);
        }
        else if (paramString.wXh.cCJ == 40013)
        {
          AppBrandIDCardUI.1.a(this.iKk, this.iKk.iKj.getString(2131296665));
          AppMethodBeat.o(133220);
        }
        else
        {
          AppBrandIDCardUI.1.a(this.iKk, this.iKk.iKj.getString(2131296664));
          AppMethodBeat.o(133220);
        }
      }
      else
      {
        ab.e("MicroMsg.AppBrandIDCardUI", "VerifySmsCodeResp.auth_base_response is null");
        AppMethodBeat.o(133220);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.1.6
 * JD-Core Version:    0.6.2
 */