package com.tencent.mm.plugin.product.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.product.b.m;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.wallet_core.ui.e;

final class MallProductUI$7$1
  implements h.c
{
  MallProductUI$7$1(MallProductUI.7 param7)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(44163);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(44163);
      while (true)
      {
        return;
        localf = MallProductUI.e(this.pkg.pke);
        Object localObject1 = localf.piK.bZV();
        Object localObject2 = new Intent();
        ((Intent)localObject2).putExtra("Retr_Msg_content", (String)localObject1);
        ((Intent)localObject2).putExtra("Retr_Msg_Type", 2);
        if (!bo.isNullOrNil(localf.piK.pgO.bZY()))
          ((Intent)localObject2).putExtra("Retr_Msg_thumb_path", localf.piK.bZM());
        ((Intent)localObject2).putExtra("Retr_go_to_chattingUI", false);
        ((Intent)localObject2).putExtra("Retr_show_success_tips", true);
        ((Intent)localObject2).putExtra("Retr_Msg_Type", 2);
        d.f(localf.gNy, ".ui.transmit.MsgRetransmitUI", (Intent)localObject2);
        if (f.gOW == 4)
          h.pYm.e(10651, new Object[] { Integer.valueOf(11), Integer.valueOf(1), Integer.valueOf(0) });
        AppMethodBeat.o(44163);
        continue;
        localf = MallProductUI.e(this.pkg.pke);
        localObject2 = localf.piK.pgO;
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("KContentObjDesc", localf.piK.bZW());
        ((Intent)localObject1).putExtra("Ksnsupload_title", ((m)localObject2).phs.name);
        ((Intent)localObject1).putExtra("Ksnsupload_link", localf.piK.bZN());
        ((Intent)localObject1).putExtra("Ksnsupload_imgurl", localf.piK.pgO.bZY());
        if (!bo.isNullOrNil(localf.piK.pgO.bZY()))
          ((Intent)localObject1).putExtra("KsnsUpload_imgPath", localf.piK.bZM());
        ((Intent)localObject1).putExtra("Ksnsupload_type", 6);
        ((Intent)localObject1).putExtra("KUploadProduct_UserData", localf.piK.a((m)localObject2));
        ((Intent)localObject1).putExtra("KUploadProduct_subType", ((m)localObject2).php);
        localObject2 = v.nW("scan_product");
        v.Zp().y((String)localObject2, true).j("prePublishId", "scan_product");
        ((Intent)localObject1).putExtra("reportSessionId", (String)localObject2);
        d.b(localf.gNy, "sns", ".ui.SnsUploadUI", (Intent)localObject1);
        if (f.gOW == 4)
          h.pYm.e(10651, new Object[] { Integer.valueOf(11), Integer.valueOf(0), Integer.valueOf(0) });
        AppMethodBeat.o(44163);
        continue;
        MallProductUI.e(this.pkg.pke).cad();
        AppMethodBeat.o(44163);
      }
      f localf = MallProductUI.e(this.pkg.pke);
      e.ae(localf.gNy, localf.piK.bZL());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductUI.7.1
 * JD-Core Version:    0.6.2
 */