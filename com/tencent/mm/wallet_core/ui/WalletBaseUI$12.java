package com.tencent.mm.wallet_core.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class WalletBaseUI$12
  implements View.OnClickListener
{
  WalletBaseUI$12(WalletBaseUI paramWalletBaseUI, boolean paramBoolean, int paramInt, EditText paramEditText)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(49254);
    if ((!this.AhA.nTi.isShown()) && (!this.gnT))
    {
      this.AhA.dOC();
      this.AhA.QP(this.gnX);
      AppMethodBeat.o(49254);
    }
    while (true)
    {
      return;
      if (this.gnT)
      {
        this.AhA.aoB();
        ((InputMethodManager)this.AhA.mController.ylL.getSystemService("input_method")).showSoftInput(this.gnV, 0);
      }
      AppMethodBeat.o(49254);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.WalletBaseUI.12
 * JD-Core Version:    0.6.2
 */