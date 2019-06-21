package com.tencent.mm.ui.base;

import android.database.DataSetObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMListPopupWindow$c extends DataSetObserver
{
  private MMListPopupWindow$c(MMListPopupWindow paramMMListPopupWindow)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(112514);
    if (this.yvN.gKG.isShowing())
      this.yvN.show();
    AppMethodBeat.o(112514);
  }

  public final void onInvalidated()
  {
    AppMethodBeat.i(112515);
    this.yvN.dismiss();
    AppMethodBeat.o(112515);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMListPopupWindow.c
 * JD-Core Version:    0.6.2
 */