package com.tencent.mm.plugin.aa.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class BaseAAPresenterActivity$1$2
  implements Runnable
{
  BaseAAPresenterActivity$1$2(BaseAAPresenterActivity.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(40776);
    this.gnZ.gnY.aoB();
    if (this.gnZ.gnT)
      ((InputMethodManager)this.gnZ.gnY.mController.ylL.getSystemService("input_method")).showSoftInput(this.gnZ.gnV, 0);
    AppMethodBeat.o(40776);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity.1.2
 * JD-Core Version:    0.6.2
 */