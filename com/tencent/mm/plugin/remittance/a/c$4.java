package com.tencent.mm.plugin.remittance.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.remittance.b.b;
import com.tencent.mm.plugin.remittance.b.d;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;

final class c$4
  implements bz.a
{
  c$4(c paramc)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(44427);
    ab.i("MicroMsg.SubCoreRemittance", "hy: received AddMsg");
    parama = parama.eAB;
    if (parama == null)
    {
      ab.e("MicroMsg.SubCoreRemittance", "recieve a null msg");
      AppMethodBeat.o(44427);
    }
    while (true)
    {
      return;
      parama = com.tencent.mm.platformtools.aa.a(parama.vED);
      if (bo.isNullOrNil(parama))
      {
        ab.e("MicroMsg.SubCoreRemittance", "msg illegal,content is null");
        AppMethodBeat.o(44427);
      }
      else
      {
        parama = br.z(parama, "sysmsg");
        if (parama == null)
        {
          ab.e("MicroMsg.SubCoreRemittance", "Resolve msg error");
          AppMethodBeat.o(44427);
        }
        else
        {
          Object localObject1 = (String)parama.get(".sysmsg.paymsg.PayMsgType");
          Object localObject2;
          if ("15".equals(localObject1))
          {
            localObject1 = URLDecoder.decode((String)parama.get(".sysmsg.paymsg.appmsgcontent"));
            if (TextUtils.isEmpty((CharSequence)localObject1))
            {
              ab.e("MicroMsg.SubCoreRemittance", "appmsgcontent is null");
              AppMethodBeat.o(44427);
            }
            else
            {
              localObject2 = br.z((String)localObject1, "msg");
              if (localObject2 == null)
              {
                ab.e("MicroMsg.SubCoreRemittance", "Resolve appmsgcontent error");
                AppMethodBeat.o(44427);
              }
              else
              {
                localObject2 = (String)((Map)localObject2).get(".msg.appmsg.wcpayinfo.transferid");
                if (bo.isNullOrNil((String)localObject2))
                {
                  ab.e("MicroMsg.SubCoreRemittance", "paymsgid is null");
                  AppMethodBeat.o(44427);
                }
                else if (this.pLr.ceZ().VO((String)localObject2))
                {
                  ab.e("MicroMsg.SubCoreRemittance", "it is a duplicate msg");
                  AppMethodBeat.o(44427);
                }
                else
                {
                  parama = (String)parama.get(".sysmsg.paymsg.tousername");
                  if ((bo.isNullOrNil((String)localObject1)) || (bo.isNullOrNil(parama)))
                  {
                    ab.e("MicroMsg.SubCoreRemittance", "onRecieveMsg get a illegal msg,which content or toUserName is null");
                    AppMethodBeat.o(44427);
                  }
                  else
                  {
                    this.pLr.ceZ().Z((String)localObject2, (String)localObject1, parama);
                    AppMethodBeat.o(44427);
                  }
                }
              }
            }
          }
          else
          {
            label396: int i;
            bi localbi;
            if ("22".equals(localObject1))
            {
              localObject1 = (String)parama.get(".sysmsg.paymsg.tousername");
              String str1 = (String)parama.get(".sysmsg.paymsg.fromusername");
              String str2;
              try
              {
                str2 = URLDecoder.decode((String)parama.get(".sysmsg.paymsg.appmsgcontent"), "UTF-8");
                if (!bo.isNullOrNil(str2))
                  break label396;
                ab.e("MicroMsg.SubCoreRemittance", "appmsgcontent is null");
                AppMethodBeat.o(44427);
              }
              catch (UnsupportedEncodingException parama)
              {
                ab.printErrStackTrace("MicroMsg.SubCoreRemittance", parama, "", new Object[0]);
                AppMethodBeat.o(44427);
              }
              continue;
              parama = br.z(str2, "msg");
              if (parama == null)
              {
                ab.e("MicroMsg.SubCoreRemittance", "Resolve appmsgcontent error");
                AppMethodBeat.o(44427);
              }
              else
              {
                localObject2 = (String)parama.get(".msg.appmsg.wcpayinfo.transferid");
                i = bo.getInt((String)parama.get(".msg.appmsg.wcpayinfo.paysubtype"), -1);
                ab.i("MicroMsg.SubCoreRemittance", "receive delay transfer newxml, fromusername: %s, tousername: %s, transferId: %s, paysubtype: %d", new Object[] { str1, localObject1, localObject2, Integer.valueOf(i) });
                parama = null;
                try
                {
                  c.ceW();
                  localObject1 = c.ceX().VM((String)localObject2);
                  parama = (e.a)localObject1;
                  if (parama == null)
                  {
                    ab.i("MicroMsg.SubCoreRemittance", "empty record");
                    AppMethodBeat.o(44427);
                  }
                }
                catch (Exception localException)
                {
                  while (true)
                    ab.printErrStackTrace("MicroMsg.SubCoreRemittance", localException, "", new Object[0]);
                  localbi = ((j)g.K(j.class)).bOr().jf(parama.field_msgId);
                  if (localbi.field_msgId <= 0L)
                  {
                    ab.i("MicroMsg.SubCoreRemittance", "has delete msg");
                    c.ceW();
                    c.ceX().a(parama, new String[0]);
                    AppMethodBeat.o(44427);
                    continue;
                  }
                  ab.i("MicroMsg.SubCoreRemittance", "update msg: %s", new Object[] { Long.valueOf(localbi.field_msgId) });
                  localbi.setContent(str2);
                  ((j)g.K(j.class)).bOr().a(localbi.field_msgId, localbi);
                  parama = c.ceY().VN((String)localObject2);
                  if (parama != null)
                  {
                    parama.field_receiveStatus = i;
                    c.ceY().a(parama);
                    AppMethodBeat.o(44427);
                    continue;
                  }
                  if (!localbi.field_talker.equals(r.Yz()))
                  {
                    parama = new com.tencent.mm.plugin.remittance.b.c();
                    parama.field_locaMsgId = localbi.field_msgId;
                    parama.field_transferId = ((String)localObject2);
                    parama.field_receiveStatus = i;
                    parama.field_isSend = false;
                    c.ceY().a(parama);
                  }
                  AppMethodBeat.o(44427);
                }
              }
            }
            else
            {
              if ("33".equals(localbi))
              {
                i = bo.getInt((String)parama.get(".sysmsg.paymsg.opentransferbankcard"), 0);
                parama = g.RP().Ry();
                parama.set(ac.a.xTT, Integer.valueOf(i));
                int j = ((Integer)parama.get(ac.a.xTU, Integer.valueOf(0))).intValue();
                ab.i("MicroMsg.SubCoreRemittance", "receive open bank remit: %s, %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
                if (j == 0)
                {
                  com.tencent.mm.x.c.PK().b(ac.a.xTO, true);
                  parama.set(ac.a.xTU, Integer.valueOf(1));
                  g.RP().Ry().set(ac.a.xTP, Boolean.FALSE);
                }
              }
              AppMethodBeat.o(44427);
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.a.c.4
 * JD-Core Version:    0.6.2
 */