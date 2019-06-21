package com.tencent.mm.plugin.readerapp.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.readerapp.c.g;
import com.tencent.mm.ui.base.h;

final class b$1
  implements DialogInterface.OnClickListener
{
  b$1(b paramb)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(76785);
    g.a(new b.1.1(this, h.b(this.pES.context, this.pES.context.getString(2131302140), false, null)));
    AppMethodBeat.o(76785);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.b.1
 * JD-Core Version:    0.6.2
 */