package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.oc;
import com.tencent.mm.plugin.remittance.model.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.s;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(7)
public class RemittanceResendMsgUI extends WalletBaseUI
{
  public boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(45112);
    ab.i("MicroMsg.RemittanceResendMsgUI", "onSceneEnd() errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString + " netsceneType:" + paramm.getType());
    if ((paramm instanceof x))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        s.a(this.mController.ylL.getResources().getString(2131300520), this.mController.ylL);
        finish();
        com.tencent.mm.sdk.b.a.xxA.m(new oc());
        AppMethodBeat.o(45112);
      }
    while (true)
    {
      return bool;
      h.bQ(this, paramString);
      finish();
      AppMethodBeat.o(45112);
      continue;
      bool = false;
      AppMethodBeat.o(45112);
    }
  }

  protected void f(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(45111);
    paramString1 = new x(paramString1, paramString2, paramString3, paramInt1, paramInt2);
    paramString1.eHT = "RemittanceProcess";
    a(paramString1, true, true);
    AppMethodBeat.o(45111);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45110);
    super.onCreate(paramBundle);
    this.mController.contentView.setVisibility(8);
    setTitleVisibility(8);
    String str1 = getIntent().getStringExtra("transaction_id");
    paramBundle = getIntent().getStringExtra("transfer_id");
    String str2 = getIntent().getStringExtra("receiver_name");
    int i = getIntent().getIntExtra("resend_msg_from_flag", 1);
    int j = getIntent().getIntExtra("invalid_time", 0);
    if (!bo.isNullOrNil(str2))
    {
      f(str1, paramBundle, str2, j, i);
      AppMethodBeat.o(45110);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.RemittanceResendMsgUI", "onCreate() receiverName == null");
      AppMethodBeat.o(45110);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceResendMsgUI
 * JD-Core Version:    0.6.2
 */