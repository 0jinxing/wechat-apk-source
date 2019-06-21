package com.tencent.mm.pluginsdk.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

final class MultiSelectContactView$2
  implements View.OnKeyListener
{
  MultiSelectContactView$2(MultiSelectContactView paramMultiSelectContactView)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(105159);
    if ((paramInt == 67) && (paramKeyEvent.getAction() == 0) && (MultiSelectContactView.c(this.vii).getSelectionStart() == 0) && (MultiSelectContactView.c(this.vii).getSelectionEnd() == 0))
      MultiSelectContactView.d(this.vii);
    AppMethodBeat.o(105159);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.MultiSelectContactView.2
 * JD-Core Version:    0.6.2
 */