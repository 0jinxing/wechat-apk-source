package com.tencent.mm.plugin.luckymoney.appbrand.ui.receive;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.protocal.protobuf.bhk;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public final class c
  implements a
{
  private String appId = null;
  String nSX = null;
  b nTK = null;
  byte[] nTL;
  bhk nTM;
  public RealnameGuideHelper nTN;
  int state = -1;

  final void af(Intent paramIntent)
  {
    AppMethodBeat.i(42133);
    if (this.nTK == null)
    {
      ab.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "WxaGetLuckyMoneyLogic.fail ui == null");
      AppMethodBeat.o(42133);
    }
    while (true)
    {
      return;
      this.nTK.bKV();
      this.nTK.c(0, paramIntent);
      AppMethodBeat.o(42133);
    }
  }

  public final void bLb()
  {
    AppMethodBeat.i(42131);
    if (this.state != 0)
    {
      ab.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onOpenBtnClick return state = %d", new Object[] { Integer.valueOf(this.state) });
      AppMethodBeat.o(42131);
    }
    while (true)
    {
      return;
      if (this.nTK == null)
      {
        ab.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "openLuckyMoney ui == null");
        AppMethodBeat.o(42131);
      }
      else
      {
        new com.tencent.mm.plugin.luckymoney.appbrand.a.b(this.appId, this.nSX, this.nTL).b(new c.2(this));
        AppMethodBeat.o(42131);
      }
    }
  }

  public final void bLc()
  {
    AppMethodBeat.i(42130);
    if (this.nTK == null)
    {
      ab.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onDetailBtnClick ui == null");
      AppMethodBeat.o(42130);
    }
    while (true)
    {
      return;
      bLg();
      AppMethodBeat.o(42130);
    }
  }

  final void bLg()
  {
    AppMethodBeat.i(42132);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_sendid", this.nSX);
    localIntent.putExtra("key_appid", this.appId);
    Bundle localBundle;
    if (this.nTM != null)
      localBundle = new Bundle();
    while (true)
    {
      try
      {
        localBundle.putByteArray("key_data", this.nTM.toByteArray());
        localIntent.putExtras(localBundle);
        localIntent.putExtra("key_from", "value_open");
        this.nTK.a(com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.b.class, localIntent, new c.3(this));
        AppMethodBeat.o(42132);
        return;
      }
      catch (IOException localIOException)
      {
        ab.printErrStackTrace("MicroMsg.WxaReceiveLuckyMoneyLogic", localIOException, "goLuckyMoneyDetailUI WxaDetailResponse putByteArray error", new Object[0]);
        af(new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{byte detail response fail}}"));
        AppMethodBeat.o(42132);
        continue;
      }
      localIntent.putExtra("key_from", "value_query");
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(42129);
    ab.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onDestroy ");
    this.nTK = null;
    this.nTM = null;
    this.nTN = null;
    AppMethodBeat.o(42129);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.c
 * JD-Core Version:    0.6.2
 */