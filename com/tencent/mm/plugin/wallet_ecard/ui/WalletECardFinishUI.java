package com.tencent.mm.plugin.wallet_ecard.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.protocal.protobuf.bhg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(19)
public class WalletECardFinishUI extends WalletECardBaseUI
{
  private TextView kEq;
  private Button nsJ;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130969311;
  }

  public final void initView()
  {
    AppMethodBeat.i(48147);
    this.kEq = ((TextView)findViewById(2131820991));
    Object localObject = this.mBundle.getByteArray(com.tencent.mm.plugin.wallet_ecard.a.a.tQa);
    if (localObject != null);
    try
    {
      if (localObject.length != 0)
      {
        bhg localbhg = new com/tencent/mm/protocal/protobuf/bhg;
        localbhg.<init>();
        localObject = (bhg)localbhg.parseFrom((byte[])localObject);
        if ((localObject != null) && (!bo.isNullOrNil(((bhg)localObject).desc)))
          this.kEq.setText(((bhg)localObject).desc);
      }
      this.nsJ = ((Button)findViewById(2131823370));
      this.nsJ.setOnClickListener(new WalletECardFinishUI.2(this));
      AppMethodBeat.o(48147);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.WalletECardFinishUI", localException, "", new Object[0]);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48146);
    super.onCreate(paramBundle);
    xE(getResources().getColor(2131690691));
    dyb();
    setMMTitle("");
    enableBackMenu(false);
    setBackBtn(new WalletECardFinishUI.1(this));
    showHomeBtn(false);
    initView();
    AppMethodBeat.o(48146);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.ui.WalletECardFinishUI
 * JD-Core Version:    0.6.2
 */