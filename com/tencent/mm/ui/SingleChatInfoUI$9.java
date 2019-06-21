package com.tencent.mm.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bf.a;

final class SingleChatInfoUI$9
  implements bf.a
{
  SingleChatInfoUI$9(SingleChatInfoUI paramSingleChatInfoUI, ProgressDialog paramProgressDialog)
  {
  }

  public final boolean JU()
  {
    AppMethodBeat.i(29876);
    boolean bool = SingleChatInfoUI.cXE();
    AppMethodBeat.o(29876);
    return bool;
  }

  public final void JV()
  {
    AppMethodBeat.i(29877);
    if (this.eiD != null)
      this.eiD.dismiss();
    AppMethodBeat.o(29877);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.SingleChatInfoUI.9
 * JD-Core Version:    0.6.2
 */