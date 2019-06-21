package com.tencent.mm.plugin.wallet.pay.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ah;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.i;
import com.tencent.mm.ui.base.a;
import java.util.ArrayList;
import java.util.Collections;

@a(3)
public class WalletChangeLoanRepayBankcardUI extends WalletChangeBankcardUI
{
  protected final void Hf(int paramInt)
  {
    AppMethodBeat.i(45990);
    int i;
    Object localObject;
    if (this.tgB != null)
    {
      i = this.tgB.size();
      if ((this.tgB == null) || (paramInt >= i))
        break label127;
      localObject = (Bankcard)this.tgB.get(paramInt);
      this.tgC = ((Bankcard)localObject);
      this.toF.tGL = ((Bankcard)localObject).field_bindSerial;
      this.pTi.setEnabled(true);
      this.toF.notifyDataSetChanged();
      Intent localIntent = new Intent();
      localIntent.putExtra("bindSerial", ((Bankcard)localObject).field_bindSerial);
      localIntent.putExtra("ret", 0);
      setResult(-1, localIntent);
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(45990);
      return;
      i = 0;
      break;
      label127: if (i == paramInt)
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("ret", -1003);
        setResult(-1, (Intent)localObject);
      }
    }
  }

  protected final i cNP()
  {
    AppMethodBeat.i(45989);
    this.tgB = r.cPJ().tCN;
    if (this.tgB != null)
      Collections.sort(this.tgB, new WalletChangeBankcardUI.2(this));
    i locali = new i(this, this.tgB, this.toE, this.pWy);
    AppMethodBeat.o(45989);
    return locali;
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45988);
    super.onCreate(paramBundle);
    setBackBtn(new WalletChangeLoanRepayBankcardUI.1(this));
    AppMethodBeat.o(45988);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletChangeLoanRepayBankcardUI
 * JD-Core Version:    0.6.2
 */