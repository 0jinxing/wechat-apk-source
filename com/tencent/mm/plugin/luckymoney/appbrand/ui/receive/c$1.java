package com.tencent.mm.plugin.luckymoney.appbrand.ui.receive;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.protocal.protobuf.bqb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.c.a;

final class c$1
  implements a<Void, a.a<bqb>>
{
  c$1(c paramc)
  {
  }

  private Void d(a.a<bqb> parama)
  {
    AppMethodBeat.i(42123);
    Object localObject1;
    if ((parama.errType == 0) && (parama.errCode == 0))
    {
      ab.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiReceiveWxaHB succeed, wxahb_status = [%d],receive_status = [%d],sendId = [%s]", new Object[] { Integer.valueOf(((bqb)parama.fsy).wKy), Integer.valueOf(((bqb)parama.fsy).nSb), this.nTO.nSX });
      if ((((bqb)parama.fsy).wKy != 1) && (((bqb)parama.fsy).wKx != null))
        this.nTO.nTL = ((bqb)parama.fsy).wKx.toByteArray();
      this.nTO.state = ((bqb)parama.fsy).wKy;
      localObject1 = this.nTO;
      parama = (bqb)parama.fsy;
      if (((c)localObject1).nTK == null)
      {
        ab.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiReceiveWxaHB succeed but ui == null");
        AppMethodBeat.o(42123);
      }
    }
    while (true)
    {
      return null;
      int i;
      if ((parama.wKH == 1) && (parama.nSc == 0))
        i = 1;
      while (true)
      {
        if (i == 0)
          break label223;
        ab.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onLuckyMoneyReceived shouldSkipToDetailUI");
        ((c)localObject1).bLg();
        break;
        if (parama.nSb == 2)
          i = 1;
        else
          i = 0;
      }
      label223: Object localObject2;
      String str1;
      Object localObject3;
      boolean bool1;
      label270: boolean bool2;
      if (parama.wKy == 1)
      {
        localObject2 = ((c)localObject1).nTK;
        str1 = parama.wKF;
        localObject3 = parama.wKG;
        i = parama.wKy;
        localObject1 = parama.wKJ;
        if (parama.wKH == 1)
        {
          bool1 = true;
          if (parama.nSc != 1)
            break label307;
        }
        label307: for (bool2 = true; ; bool2 = false)
        {
          ((b)localObject2).a(str1, (String)localObject3, i, (String)localObject1, bool1, bool2);
          break;
          bool1 = false;
          break label270;
        }
      }
      if (parama.wKy == 0)
      {
        localObject3 = ((c)localObject1).nTK;
        String str2 = parama.wKF;
        localObject1 = parama.wKG;
        str1 = parama.kfM;
        localObject2 = parama.nSd;
        if (parama.wKH == 1)
        {
          bool1 = true;
          label360: if (parama.nSc != 1)
            break label398;
        }
        label398: for (bool2 = true; ; bool2 = false)
        {
          ((b)localObject3).a(str2, (String)localObject1, str1, (String)localObject2, bool1, bool2);
          break;
          bool1 = false;
          break label360;
        }
      }
      ab.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "back.resp.wxahb_status is invalid.resp. wxahb_status = [%d] receive_status = [%d] hb_type = [%d]", new Object[] { Integer.valueOf(parama.wKy), Integer.valueOf(parama.nSb), Integer.valueOf(parama.nSc) });
      break;
      ab.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "CgiReceiveWxaHB failed [%d, %d, %s]", new Object[] { Integer.valueOf(parama.errType), Integer.valueOf(parama.errCode), parama.aIm });
      this.nTO.af(new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error Receive errType = " + parama.errType + ",errCode" + parama.errCode + "}}"));
      AppMethodBeat.o(42123);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.c.1
 * JD-Core Version:    0.6.2
 */