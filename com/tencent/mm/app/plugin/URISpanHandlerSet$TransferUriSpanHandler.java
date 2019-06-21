package com.tencent.mm.app.plugin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.od;
import com.tencent.mm.plugin.remittance.model.NetSceneTenpayRemittanceQuery.ResendMsgInfo;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

@URISpanHandlerSet.a
class URISpanHandlerSet$TransferUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$TransferUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 39, 40, 41, 42, 49 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15716);
    boolean bool;
    if (paramm != null)
      if (paramm.type == 42)
      {
        com.tencent.mm.bp.d.H(URISpanHandlerSet.a(this.cgy), "wallet", ".balance.ui.lqt.WalletLqtDetailUI");
        AppMethodBeat.o(15716);
        bool = true;
      }
    while (true)
    {
      return bool;
      if (paramm.type == 41)
      {
        com.tencent.mm.bp.d.H(URISpanHandlerSet.a(this.cgy), "wallet", ".balance.ui.WalletBalanceManagerUI");
        AppMethodBeat.o(15716);
        bool = true;
      }
      else if (paramm.type == 39)
      {
        if ((paramm.data != null) && ((paramm.data instanceof Bundle)))
        {
          paramg = (Bundle)paramm.data;
          paramm = (NetSceneTenpayRemittanceQuery.ResendMsgInfo)paramg.getParcelable("resend_msg_info");
          new com.tencent.mm.plugin.remittance.ui.d(URISpanHandlerSet.a(this.cgy)).a(paramm, new URISpanHandlerSet.TransferUriSpanHandler.1(this, paramg));
        }
        AppMethodBeat.o(15716);
        bool = true;
      }
      else if (paramm.type == 40)
      {
        if ((paramm.data != null) && ((paramm.data instanceof Bundle)))
        {
          paramm = (Bundle)paramm.data;
          paramg = new od();
          paramg.cKt.cAa = paramm.getString("transaction_id");
          paramg.cKt.cEa = paramm.getString("transfer_id");
          paramg.cKt.cKu = paramm.getInt("total_fee");
          paramg.cKt.cKv = paramm.getString("sender_name");
          a.xxA.m(paramg);
        }
        AppMethodBeat.o(15716);
        bool = true;
      }
      else
      {
        if (paramm.type == 49)
        {
          paramg = Uri.parse(paramm.url);
          String str1 = paramg.getQueryParameter("transfer_id");
          String str2 = paramg.getQueryParameter("trans_id");
          paramg = "";
          if ((paramm.data != null) && ((paramm.data instanceof Bundle)));
          for (paramm = ((Bundle)paramm.data).getString("sender_name"); ; paramm = paramg)
          {
            paramg = new Intent();
            paramg.putExtra("transfer_id", str1);
            paramg.putExtra("transaction_id", str2);
            paramg.putExtra("sender_name", paramm);
            com.tencent.mm.bp.d.b(ah.getContext(), "remittance", ".ui.RemittanceDetailUI", paramg);
            AppMethodBeat.o(15716);
            bool = true;
            break;
            ab.i("MicroMsg.URISpanHandlerSet", "hrefInfo.getType() == TYPE_TRANSFER_QUERY_MSG senderName == null");
          }
        }
        bool = false;
        AppMethodBeat.o(15716);
      }
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    return false;
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15715);
    if (paramString.trim().toLowerCase().startsWith("weixin://wcpay/transfer/retrysendmsg"))
    {
      paramString = new m(paramString, 39, null);
      AppMethodBeat.o(15715);
    }
    while (true)
    {
      return paramString;
      if (paramString.trim().toLowerCase().startsWith("weixin://wcpay/transfer/rebacksendmsg"))
      {
        paramString = new m(paramString, 40, null);
        AppMethodBeat.o(15715);
      }
      else if (paramString.trim().toLowerCase().startsWith("weixin://wcpay/transfer/watchbalance"))
      {
        paramString = new m(paramString, 41, null);
        AppMethodBeat.o(15715);
      }
      else if (paramString.trim().toLowerCase().startsWith("weixin://wcpay/transfer/watchlqt"))
      {
        paramString = new m(paramString, 42, null);
        AppMethodBeat.o(15715);
      }
      else if (paramString.trim().toLowerCase().startsWith("wechat://wcpay/transfer/transferquery"))
      {
        paramString = new m(paramString, 49, null);
        AppMethodBeat.o(15715);
      }
      else
      {
        AppMethodBeat.o(15715);
        paramString = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.TransferUriSpanHandler
 * JD-Core Version:    0.6.2
 */