package com.tencent.mm.wallet_core.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.keyboard.WcPayKeyboard;

final class WalletBaseUI$9
  implements View.OnFocusChangeListener
{
  private boolean ohP = true;

  WalletBaseUI$9(WalletBaseUI paramWalletBaseUI, EditText paramEditText)
  {
  }

  public final void onFocusChange(final View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(49249);
    if (paramBoolean)
    {
      ((InputMethodManager)this.AhA.mController.ylL.getSystemService("input_method")).hideSoftInputFromWindow(paramView.getWindowToken(), 0);
      new ak().postDelayed(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(49247);
          if ((!WalletBaseUI.9.this.AhA.Ahv.isShown()) && (paramView.isShown()))
          {
            if ((WalletBaseUI.9.this.gnU) || (!WalletBaseUI.9.a(WalletBaseUI.9.this)))
              WalletBaseUI.9.this.AhA.dOA();
            WalletBaseUI.9.b(WalletBaseUI.9.this);
          }
          WalletBaseUI.9.this.AhA.Ahv.setInputEditText(WalletBaseUI.9.this.mTD);
          ((InputMethodManager)WalletBaseUI.9.this.AhA.mController.ylL.getSystemService("input_method")).hideSoftInputFromWindow(paramView.getWindowToken(), 0);
          AppMethodBeat.o(49247);
        }
      }
      , 300L);
    }
    while (true)
    {
      if (this.AhB != null)
        this.AhB.onFocusChange(paramView, paramBoolean);
      AppMethodBeat.o(49249);
      return;
      new ak().postDelayed(new WalletBaseUI.9.2(this), 200L);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.WalletBaseUI.9
 * JD-Core Version:    0.6.2
 */