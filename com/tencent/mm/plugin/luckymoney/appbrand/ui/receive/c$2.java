package com.tencent.mm.plugin.luckymoney.appbrand.ui.receive;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.protocal.protobuf.bhk;
import com.tencent.mm.protocal.protobuf.bpt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.c.a;

final class c$2
  implements a<Void, a.a<bhk>>
{
  c$2(c paramc)
  {
  }

  private Void d(a.a<bhk> parama)
  {
    AppMethodBeat.i(42125);
    c localc;
    if ((parama.errType == 0) && (parama.errCode == 0))
    {
      ab.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiOpenWxaHB success");
      if (((bhk)parama.fsy).wKy != 0)
      {
        ab.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiOpenWxaHB error wxahb_status = [%d] errorwording = [%s]", new Object[] { Integer.valueOf(((bhk)parama.fsy).wKy), ((bhk)parama.fsy).wKJ });
        localc = this.nTO;
        int i = ((bhk)parama.fsy).wKy;
        switch (i)
        {
        default:
          localc.af(new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{unknow open retun errCode:" + i + "}"));
          AppMethodBeat.o(42125);
        case 1:
        case 2:
        case 3:
        }
      }
    }
    while (true)
    {
      return null;
      localc.af(new Intent().putExtra("result_error_code", 20001).putExtra("result_error_msg", "fail:the red packet is expired"));
      break;
      localc.af(new Intent().putExtra("result_error_code", 20002).putExtra("result_error_msg", "fail:the red packet has been received completly"));
      break;
      localc.af(new Intent().putExtra("result_error_code", 20003).putExtra("result_error_msg", "fail:risk control"));
      break;
      localc = this.nTO;
      parama = (bhk)parama.fsy;
      if (localc.nTK == null)
        ab.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "WxaGetLuckyMoneyLogic.CgiOpenWxaHB end. ui == null");
      while (true)
      {
        AppMethodBeat.o(42125);
        break;
        localc.nTM = parama;
        localc.nTK.bLd();
        if (localc.nTM.vWf != null)
        {
          localc.nTN = new RealnameGuideHelper();
          localc.nTN.a(String.valueOf(localc.nTM.vWf.vAF), localc.nTM.vWf.nZa, localc.nTM.vWf.nZb, localc.nTM.vWf.nZc, localc.nTM.vWf.nZd, 1003);
          parama = localc.nTN;
          Bundle localBundle = new Bundle();
          localBundle.putString("realname_verify_process_jump_activity", ".appbrand.ui.receive.WxaLuckyMoneyReceiveUI");
          localBundle.putString("realname_verify_process_jump_plugin", "luckymoney");
          if (!parama.b(localc.nTK.bKU(), localBundle, new c.4(localc)))
            localc.af(new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{launch realname fail}}"));
        }
        else
        {
          localc.bLg();
        }
      }
      ab.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiOpenWxaHB failed [%d, %d, %s]", new Object[] { Integer.valueOf(parama.errType), Integer.valueOf(parama.errCode), parama.aIm });
      this.nTO.af(new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error open errType = " + parama.errType + ",errCode" + parama.errCode + "}}"));
      AppMethodBeat.o(42125);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.c.2
 * JD-Core Version:    0.6.2
 */