package com.tencent.mm.plugin.aa.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class BaseAAPresenterActivity$2
  implements View.OnClickListener
{
  BaseAAPresenterActivity$2(BaseAAPresenterActivity paramBaseAAPresenterActivity, boolean paramBoolean, EditText paramEditText, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40778);
    if ((!BaseAAPresenterActivity.h(this.gnY).isShown()) && (!this.gnT))
    {
      this.gnY.dOC();
      BaseAAPresenterActivity.a(this.gnY, this.gnV);
      BaseAAPresenterActivity.b(this.gnY, this.gnX);
      AppMethodBeat.o(40778);
    }
    while (true)
    {
      return;
      if (this.gnT)
      {
        this.gnY.aoB();
        ((InputMethodManager)this.gnY.mController.ylL.getSystemService("input_method")).showSoftInput(this.gnV, 0);
      }
      AppMethodBeat.o(40778);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity.2
 * JD-Core Version:    0.6.2
 */