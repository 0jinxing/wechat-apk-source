package com.tencent.mm.plugin.luckymoney.b;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.luckymoney.model.p;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.net.URLDecoder;
import java.util.Map;

final class a$3
  implements bz.a
{
  a$3(a parama)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(41968);
    Object localObject1 = br.z(aa.a(parama.eAB.vED), "sysmsg");
    ab.i("MicroMsg.SubCoreLuckyMoney", "helios::::mPayMsgListener");
    if (localObject1 == null)
    {
      ab.e("MicroMsg.SubCoreLuckyMoney", "Resolve msg error");
      AppMethodBeat.o(41968);
    }
    while (true)
    {
      return;
      if ("14".equals((String)((Map)localObject1).get(".sysmsg.paymsg.PayMsgType")))
      {
        parama = URLDecoder.decode((String)((Map)localObject1).get(".sysmsg.paymsg.appmsgcontent"));
        if (TextUtils.isEmpty(parama))
        {
          ab.e("MicroMsg.SubCoreLuckyMoney", "msgxml illegal");
          AppMethodBeat.o(41968);
        }
        else
        {
          Object localObject2 = br.z(parama, "msg");
          if (localObject2 == null)
          {
            ab.e("MicroMsg.SubCoreLuckyMoney", "Resolve appmsgxml error");
            AppMethodBeat.o(41968);
          }
          else
          {
            localObject2 = (String)((Map)localObject2).get(".msg.appmsg.wcpayinfo.paymsgid");
            if (bo.isNullOrNil((String)localObject2))
            {
              ab.e("MicroMsg.SubCoreLuckyMoney", "paymsgid is null");
              AppMethodBeat.o(41968);
            }
            else
            {
              localObject1 = (String)((Map)localObject1).get(".sysmsg.paymsg.tousername");
              if ((bo.isNullOrNil(parama)) || (bo.isNullOrNil((String)localObject1)))
              {
                ab.e("MicroMsg.SubCoreLuckyMoney", "onRecieveMsg get a illegal msg,which content or toUserName is null");
                AppMethodBeat.o(41968);
              }
              else if (this.nRI.bKQ().Qh((String)localObject2))
              {
                ab.i("MicroMsg.SubCoreLuckyMoney", "insert a local msg for luckymoney");
                if (!x.E(parama, (String)localObject1, 1))
                  this.nRI.bKQ().Qi((String)localObject2);
              }
            }
          }
        }
      }
      else
      {
        AppMethodBeat.o(41968);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.b.a.3
 * JD-Core Version:    0.6.2
 */