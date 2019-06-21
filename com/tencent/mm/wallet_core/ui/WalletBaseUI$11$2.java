package com.tencent.mm.wallet_core.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class WalletBaseUI$11$2
  implements Runnable
{
  WalletBaseUI$11$2(WalletBaseUI.11 param11)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(49252);
    this.AhD.AhA.aoB();
    if (this.AhD.gnT)
      ((InputMethodManager)this.AhD.AhA.mController.ylL.getSystemService("input_method")).showSoftInput(this.AhD.gnV, 0);
    AppMethodBeat.o(49252);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.WalletBaseUI.11.2
 * JD-Core Version:    0.6.2
 */