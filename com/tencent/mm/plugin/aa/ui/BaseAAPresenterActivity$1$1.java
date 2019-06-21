package com.tencent.mm.plugin.aa.ui;

import android.os.Build.VERSION;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.a.c;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tenpay.android.wechat.MyKeyboardWindow;

final class BaseAAPresenterActivity$1$1
  implements Runnable
{
  BaseAAPresenterActivity$1$1(BaseAAPresenterActivity.1 param1, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(40775);
    Object localObject;
    if ((!BaseAAPresenterActivity.a(this.gnZ.gnY).isShown()) && (this.val$view.isShown()))
    {
      if (this.gnZ.gnU)
      {
        this.gnZ.gnY.dOC();
        BaseAAPresenterActivity.c(this.gnZ.gnY);
        BaseAAPresenterActivity.a(this.gnZ.gnY, this.gnZ.gnV);
      }
    }
    else if (((this.gnZ.gnW instanceof WalletFormView)) && (Build.VERSION.SDK_INT >= 14))
    {
      localObject = (WalletFormView)this.gnZ.gnW;
      if (((r.YM()) || (((WalletFormView)localObject).getEncrptType() == 100)) && ((!r.YM()) || (((WalletFormView)localObject).getEncrptType() == 0)))
        break label328;
      localObject = new c();
      BaseAAPresenterActivity.d(this.gnZ.gnY).setSecureAccessibility((View.AccessibilityDelegate)localObject);
      this.gnZ.gnV.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
    }
    while (true)
    {
      if (((this.gnZ.gnW instanceof EditHintPasswdView)) && (Build.VERSION.SDK_INT >= 14))
      {
        localObject = new c();
        BaseAAPresenterActivity.f(this.gnZ.gnY).setSecureAccessibility((View.AccessibilityDelegate)localObject);
        this.gnZ.gnV.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
      }
      BaseAAPresenterActivity.a(this.gnZ.gnY, this.gnZ.gnX);
      BaseAAPresenterActivity.g(this.gnZ.gnY).setInputEditText((EditText)this.val$view);
      ((InputMethodManager)this.gnZ.gnY.mController.ylL.getSystemService("input_method")).hideSoftInputFromWindow(this.val$view.getWindowToken(), 0);
      AppMethodBeat.o(40775);
      return;
      if (BaseAAPresenterActivity.b(this.gnZ.gnY))
        break;
      this.gnZ.gnY.dOC();
      break;
      label328: BaseAAPresenterActivity.e(this.gnZ.gnY).resetSecureAccessibility();
      this.gnZ.gnV.setAccessibilityDelegate(null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity.1.1
 * JD-Core Version:    0.6.2
 */