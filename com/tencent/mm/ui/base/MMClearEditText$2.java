package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMClearEditText$2
  implements View.OnFocusChangeListener
{
  MMClearEditText$2(MMClearEditText paramMMClearEditText)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(106505);
    if (MMClearEditText.b(this.ytW) != null)
      MMClearEditText.b(this.ytW).onFocusChange(paramView, paramBoolean);
    MMClearEditText.a(this.ytW);
    AppMethodBeat.o(106505);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMClearEditText.2
 * JD-Core Version:    0.6.2
 */