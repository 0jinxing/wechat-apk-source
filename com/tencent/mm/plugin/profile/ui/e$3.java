package com.tencent.mm.plugin.profile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bf.a;
import com.tencent.mm.ui.base.p;

final class e$3
  implements bf.a
{
  e$3(e parame)
  {
  }

  public final boolean JU()
  {
    return this.pmR.isDeleteCancel;
  }

  public final void JV()
  {
    AppMethodBeat.i(23503);
    if (this.pmR.tipDialog != null)
    {
      this.pmR.tipDialog.dismiss();
      this.pmR.tipDialog = null;
    }
    AppMethodBeat.o(23503);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.e.3
 * JD-Core Version:    0.6.2
 */