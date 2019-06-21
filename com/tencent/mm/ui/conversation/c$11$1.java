package com.tencent.mm.ui.conversation;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.model.bf.a;
import com.tencent.mm.pointers.PBool;

final class c$11$1
  implements bf.a
{
  c$11$1(c.11 param11)
  {
  }

  public final boolean JU()
  {
    AppMethodBeat.i(34164);
    boolean bool;
    if ((this.zqZ.zqU.value) || (this.zqZ.eiD == null) || (!this.zqZ.eiD.isShowing()))
    {
      bool = true;
      AppMethodBeat.o(34164);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(34164);
    }
  }

  public final void JV()
  {
    AppMethodBeat.i(34165);
    e.G(this.zqZ.ygZ, false);
    if (this.zqZ.eiD != null)
      this.zqZ.eiD.dismiss();
    AppMethodBeat.o(34165);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.c.11.1
 * JD-Core Version:    0.6.2
 */