package com.tencent.mm.plugin.bizui.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.ui.widget.a.c;

final class a$1
  implements DialogInterface.OnClickListener
{
  a$1(c paramc, q.a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(70042);
    this.jEA.dismiss();
    if (this.jEB != null)
      this.jEB.a(true, this.jEA.dKV(), this.jEA.dKW());
    AppMethodBeat.o(70042);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bizui.a.a.1
 * JD-Core Version:    0.6.2
 */