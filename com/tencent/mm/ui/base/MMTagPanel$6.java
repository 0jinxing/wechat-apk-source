package com.tencent.mm.ui.base;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMEditText;

final class MMTagPanel$6
  implements View.OnClickListener
{
  MMTagPanel$6(MMTagPanel paramMMTagPanel)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(106815);
    ab.d("MicroMsg.MMTagPanel", "on panel click, enableEditMode %B", new Object[] { Boolean.valueOf(MMTagPanel.f(this.yxC)) });
    if (MMTagPanel.f(this.yxC))
    {
      this.yxC.dAf();
      MMTagPanel.a(this.yxC).requestFocus();
      MMTagPanel.a(this.yxC).setSelection(MMTagPanel.a(this.yxC).getText().length());
      ((InputMethodManager)this.yxC.getContext().getSystemService("input_method")).showSoftInput(MMTagPanel.a(this.yxC), 0);
      ab.d("MicroMsg.MMTagPanel", "on content click");
      if (MMTagPanel.e(this.yxC) != null)
        MMTagPanel.e(this.yxC).bmm();
    }
    AppMethodBeat.o(106815);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTagPanel.6
 * JD-Core Version:    0.6.2
 */