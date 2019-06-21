package com.tencent.mm.plugin.wallet.pay.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.w;
import com.tencent.mm.plugin.wallet_core.ui.p;
import com.tencent.mm.protocal.protobuf.chl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(7)
public class WalletPayCustomUI extends WalletBaseUI
{
  private int gOW = 0;
  private String mTitle = "";
  private chl nrb;
  protected p toZ;
  private String tpa = "";
  private boolean tpb = false;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(46016);
    ab.i("MicroMsg.WalletPayCustomUI", "errorType %s errCode %s, errmsg %s, scene %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm });
    if ((paramm instanceof w))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (w)paramm;
        paramm = new Intent();
        paramm.putExtra("INTENT_RESULT_TOKEN", paramString.tuu);
        paramm.putExtras(getIntent());
        setResult(-1, paramm);
      }
      finish();
    }
    AppMethodBeat.o(46016);
    return false;
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46012);
    super.onCreate(paramBundle);
    AM(8);
    this.tpa = getIntent().getStringExtra("INTENT_PAYFEE");
    this.mTitle = getIntent().getStringExtra("INTENT_TITLE");
    boolean bool;
    if (getIntent().getIntExtra("INTENT_CAN_TOUCH", 0) == 1)
      bool = true;
    while (true)
    {
      this.tpb = bool;
      paramBundle = getIntent().getByteArrayExtra("INTENT_TOKENMESS");
      this.nrb = new chl();
      try
      {
        this.nrb.parseFrom(paramBundle);
        ab.i("MicroMsg.WalletPayCustomUI", "mTokeMess packageex:%s busi_id:%s sign:%s can_use_touch %s mPayFee %s mTitle %s", new Object[] { this.nrb.xgh, this.nrb.wmb, this.nrb.sign, Boolean.valueOf(this.tpb), this.tpa, this.mTitle });
        this.toZ = p.a(this, this.mTitle, this.tpa, "", this.tpb, new WalletPayCustomUI.1(this), new WalletPayCustomUI.2(this), new WalletPayCustomUI.3(this));
        AppMethodBeat.o(46012);
        return;
        bool = false;
      }
      catch (Exception paramBundle)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.WalletPayCustomUI", paramBundle, "", new Object[0]);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(46015);
    super.onDestroy();
    AppMethodBeat.o(46015);
  }

  public void onPause()
  {
    AppMethodBeat.i(46014);
    super.onPause();
    AppMethodBeat.o(46014);
  }

  public void onResume()
  {
    AppMethodBeat.i(46013);
    super.onResume();
    AppMethodBeat.o(46013);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayCustomUI
 * JD-Core Version:    0.6.2
 */