package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.protocal.protobuf.bzo;
import com.tencent.mm.protocal.protobuf.fy;
import com.tencent.mm.protocal.protobuf.fz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;

final class AppBrandIDCardUI$1$1
  implements b.a
{
  AppBrandIDCardUI$1$1(AppBrandIDCardUI.1 param1)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(133215);
    if ((AppBrandIDCardUI.d(this.iKk.iKj) != null) && (AppBrandIDCardUI.d(this.iKk.iKj).isShowing()))
      AppBrandIDCardUI.d(this.iKk.iKj).dismiss();
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paramb.fsH.fsP == null))
    {
      ab.e("MicroMsg.AppBrandIDCardUI", "getIDCardInfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramb.fsH.fsP });
      paramString = new Intent();
      paramString.putExtra("intent_err_code", 40000);
      paramString.putExtra("intent_err_msg", "network err");
      this.iKk.iKj.setResult(1, paramString);
      this.iKk.iKj.finish();
      AppMethodBeat.o(133215);
    }
    while (true)
    {
      return;
      paramString = (bzo)paramb.fsH.fsP;
      if (paramString.wXh == null)
      {
        ab.e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response is err");
        paramString = new Intent();
        paramString.putExtra("intent_err_code", 40000);
        paramString.putExtra("intent_err_msg", "network err");
        this.iKk.iKj.setResult(1, paramString);
        this.iKk.iKj.finish();
        AppMethodBeat.o(133215);
      }
      else
      {
        ab.e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response.err_code is %d", new Object[] { Integer.valueOf(paramString.wXh.cCJ) });
        ab.i("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.show_status:%d", new Object[] { Integer.valueOf(paramString.wYA) });
        switch (paramString.wYA)
        {
        default:
          ab.e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.show_status error");
          AppMethodBeat.o(133215);
          break;
        case 0:
          if (paramString.wXh.cCJ != 0)
          {
            ab.e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response is not ok");
            paramb = new Intent();
            paramb.putExtra("intent_err_code", paramString.wXh.cCJ);
            paramb.putExtra("intent_err_msg", paramString.wXh.cCK);
            this.iKk.iKj.setResult(1, paramb);
            this.iKk.iKj.finish();
            AppMethodBeat.o(133215);
          }
          else
          {
            AppBrandIDCardUI.a(this.iKk.iKj, paramString);
            AppBrandIDCardUI.e(this.iKk.iKj);
            AppMethodBeat.o(133215);
          }
          break;
        case 1:
          ab.i("MicroMsg.AppBrandIDCardUI", "showAlert errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramString.wXh.cCJ), paramString.wXh.cCK });
          paramb = this.iKk;
          paramInt1 = paramString.wXh.cCJ;
          String str = paramString.wXh.cCK;
          h.a(paramb.iKj, false, paramString.wYB.desc, paramString.wYB.title, paramb.iKj.getString(2131296661), "", new AppBrandIDCardUI.1.2(paramb, paramInt1, str), new AppBrandIDCardUI.1.3(paramb));
          AppMethodBeat.o(133215);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.1.1
 * JD-Core Version:    0.6.2
 */