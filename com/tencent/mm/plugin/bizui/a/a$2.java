package com.tencent.mm.plugin.bizui.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.ui.widget.a.c;

final class a$2
  implements DialogInterface.OnClickListener
{
  a$2(c paramc, q.a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(70043);
    this.jEA.dismiss();
    if (this.jEC != null)
      this.jEC.a(false, null, 0);
    AppMethodBeat.o(70043);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bizui.a.a.2
 * JD-Core Version:    0.6.2
 */