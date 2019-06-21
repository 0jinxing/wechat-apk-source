package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.appbrand.a.e;
import com.tencent.mm.protocal.protobuf.bsu;
import com.tencent.mm.protocal.protobuf.bsv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity.a;

public final class d
  implements a, MMActivity.a
{
  private String appId;
  c nTw;
  bsv nTx;
  boolean nTy;
  final int nTz;

  public d()
  {
    AppMethodBeat.i(42091);
    this.appId = null;
    this.nTz = (hashCode() & 0xFFFF);
    AppMethodBeat.o(42091);
  }

  private void a(bsu parambsu)
  {
    AppMethodBeat.i(42095);
    ab.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareImpl ");
    if (this.nTy)
    {
      ab.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareImpl isRequesting");
      AppMethodBeat.o(42095);
    }
    while (true)
    {
      return;
      this.nTy = true;
      new e(parambsu).b(new d.1(this));
      AppMethodBeat.o(42095);
    }
  }

  final void af(Intent paramIntent)
  {
    AppMethodBeat.i(42096);
    this.nTy = false;
    if (this.nTw == null)
      AppMethodBeat.o(42096);
    while (true)
    {
      return;
      this.nTw.c(0, paramIntent);
      AppMethodBeat.o(42096);
    }
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(42097);
    ab.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "mmOnActivityResult() called with: requestCode = [" + paramInt1 + "], resultCode = [" + paramInt2 + "], data = [" + paramIntent + "]");
    if (paramInt1 == this.nTz)
      if (paramInt2 == -1)
      {
        paramIntent = new Intent();
        this.nTw.a(b.class, paramIntent, new d.2(this));
        AppMethodBeat.o(42097);
      }
    while (true)
    {
      return;
      ab.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "mmOnActivityResult() REQUEST_CODE_WALLET called cancel ");
      af(new Intent().putExtra("result_error_code", 10001).putExtra("result_error_msg", "fail:pay fail"));
      AppMethodBeat.o(42097);
    }
  }

  public final void c(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    AppMethodBeat.i(42093);
    ab.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareRandomLuckyMoney() called with: moneyTotalAmount = [" + paramInt1 + "], packageAmount = [" + paramInt2 + "], wishing = [" + paramString + "], scope = [" + paramInt3 + "]");
    if (this.nTw == null)
      AppMethodBeat.o(42093);
    while (true)
    {
      return;
      bsu localbsu = new bsu();
      localbsu.csB = this.appId;
      localbsu.nSc = 1;
      localbsu.vzO = paramInt2;
      localbsu.wKC = paramInt1;
      localbsu.nSd = paramString;
      localbsu.wUS = paramInt3;
      a(localbsu);
      AppMethodBeat.o(42093);
    }
  }

  public final void d(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    AppMethodBeat.i(42094);
    ab.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareFixLuckyMoney() called with: packageMoneyAmount = [" + paramInt1 + "], packageAmount = [" + paramInt2 + "], wishing = [" + paramString + "], scope = [" + paramInt3 + "]");
    if (this.nTw == null)
      AppMethodBeat.o(42094);
    while (true)
    {
      return;
      bsu localbsu = new bsu();
      localbsu.csB = this.appId;
      localbsu.nSc = 0;
      localbsu.vzO = paramInt2;
      localbsu.wUR = paramInt1;
      localbsu.nSd = paramString;
      localbsu.wUS = paramInt3;
      a(localbsu);
      AppMethodBeat.o(42094);
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(42092);
    ab.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "onDestroy ");
    this.nTw = null;
    AppMethodBeat.o(42092);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.d
 * JD-Core Version:    0.6.2
 */