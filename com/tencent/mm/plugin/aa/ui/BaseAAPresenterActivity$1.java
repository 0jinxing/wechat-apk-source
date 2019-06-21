package com.tencent.mm.plugin.aa.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class BaseAAPresenterActivity$1
  implements View.OnFocusChangeListener
{
  BaseAAPresenterActivity$1(BaseAAPresenterActivity paramBaseAAPresenterActivity, boolean paramBoolean1, boolean paramBoolean2, EditText paramEditText, View paramView, int paramInt)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(40777);
    if ((paramView.isFocused()) && (!this.gnT))
    {
      ((InputMethodManager)this.gnY.mController.ylL.getSystemService("input_method")).hideSoftInputFromWindow(paramView.getWindowToken(), 0);
      new ak().postDelayed(new BaseAAPresenterActivity.1.1(this, paramView), 300L);
      AppMethodBeat.o(40777);
    }
    while (true)
    {
      return;
      new ak().postDelayed(new BaseAAPresenterActivity.1.2(this), 200L);
      AppMethodBeat.o(40777);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity.1
 * JD-Core Version:    0.6.2
 */