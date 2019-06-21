package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.content.Intent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bzo;
import com.tencent.mm.protocal.protobuf.cfj;
import com.tencent.mm.protocal.protobuf.cfk;
import com.tencent.mm.protocal.protobuf.fz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.p;

final class AppBrandIDCardUI$1$4
  implements com.tencent.mm.plugin.appbrand.jsapi.l.b.b
{
  AppBrandIDCardUI$1$4(AppBrandIDCardUI.1 param1)
  {
  }

  public final void h(boolean paramBoolean, final String paramString)
  {
    AppMethodBeat.i(133218);
    if (paramBoolean)
    {
      h.pYm.e(14943, new Object[] { AppBrandIDCardUI.a(this.iKk.iKj), Integer.valueOf(4), AppBrandIDCardUI.g(this.iKk.iKj).cxb });
      Object localObject = new com.tencent.mm.ai.b.a();
      ((com.tencent.mm.ai.b.a)localObject).fsJ = new cfj();
      ((com.tencent.mm.ai.b.a)localObject).fsK = new cfk();
      ((com.tencent.mm.ai.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/userdata/submitauthorizeuserid";
      ((com.tencent.mm.ai.b.a)localObject).fsI = 1721;
      ((com.tencent.mm.ai.b.a)localObject).fsL = 0;
      ((com.tencent.mm.ai.b.a)localObject).fsM = 0;
      localObject = ((com.tencent.mm.ai.b.a)localObject).acD();
      cfj localcfj = (cfj)((com.tencent.mm.ai.b)localObject).fsG.fsP;
      localcfj.csB = AppBrandIDCardUI.a(this.iKk.iKj);
      localcfj.wXf = AppBrandIDCardUI.b(this.iKk.iKj);
      localcfj.wXg = paramString;
      localcfj.cxb = AppBrandIDCardUI.g(this.iKk.iKj).cxb;
      AppBrandIDCardUI.d(this.iKk.iKj).show();
      com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ai.b)localObject, new com.tencent.mm.ipcinvoker.wx_extension.b.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.b paramAnonymousb)
        {
          AppMethodBeat.i(133217);
          if ((AppBrandIDCardUI.d(AppBrandIDCardUI.1.4.this.iKk.iKj) != null) && (AppBrandIDCardUI.d(AppBrandIDCardUI.1.4.this.iKk.iKj).isShowing()))
            AppBrandIDCardUI.d(AppBrandIDCardUI.1.4.this.iKk.iKj).dismiss();
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.fsH.fsP == null))
          {
            ab.e("MicroMsg.AppBrandIDCardUI", "SubmitAuthorizeUserID cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.fsH.fsP });
            AppMethodBeat.o(133217);
          }
          while (true)
          {
            return;
            paramAnonymousString = (cfk)paramAnonymousb.fsH.fsP;
            if (paramAnonymousString.wXh != null)
              break;
            ab.e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response is err");
            Toast.makeText(AppBrandIDCardUI.1.4.this.iKk.iKj, AppBrandIDCardUI.1.4.this.iKk.iKj.getString(2131296660), 0).show();
            AppMethodBeat.o(133217);
          }
          ab.i("MicroMsg.AppBrandIDCardUI", "resp.auth_status:%d", new Object[] { Integer.valueOf(paramAnonymousString.vIc) });
          switch (paramAnonymousString.vIc)
          {
          default:
          case 0:
          case 1:
          }
          while (true)
          {
            AppMethodBeat.o(133217);
            break;
            ab.d("MicroMsg.AppBrandIDCardUI", "resq.auth_token", new Object[] { paramAnonymousString.wcg });
            h.pYm.e(14943, new Object[] { AppBrandIDCardUI.a(AppBrandIDCardUI.1.4.this.iKk.iKj), Integer.valueOf(9), AppBrandIDCardUI.g(AppBrandIDCardUI.1.4.this.iKk.iKj).cxb });
            paramAnonymousb = new Intent();
            paramAnonymousb.putExtra("intent_err_code", paramAnonymousString.wXh.cCJ);
            paramAnonymousb.putExtra("intent_auth_token", paramAnonymousString.wcg);
            AppBrandIDCardUI.1.4.this.iKk.iKj.setResult(-1, paramAnonymousb);
            AppBrandIDCardUI.1.4.this.iKk.iKj.finish();
            AppMethodBeat.o(133217);
            break;
            h.pYm.e(14943, new Object[] { AppBrandIDCardUI.a(AppBrandIDCardUI.1.4.this.iKk.iKj), Integer.valueOf(5), AppBrandIDCardUI.g(AppBrandIDCardUI.1.4.this.iKk.iKj).cxb });
            AppBrandIDCardUI.a(AppBrandIDCardUI.1.4.this.iKk.iKj, paramString);
            AppBrandIDCardUI.a(AppBrandIDCardUI.1.4.this.iKk.iKj, paramAnonymousString.xeO);
            AppBrandIDCardUI.h(AppBrandIDCardUI.1.4.this.iKk.iKj);
          }
        }
      });
    }
    ab.i("MicroMsg.AppBrandIDCardUI", "verifyOk:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(133218);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.1.4
 * JD-Core Version:    0.6.2
 */