package com.tencent.mm.plugin.sport.ui.a;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sport.a.b;

final class a$2
  implements DialogInterface.OnClickListener
{
  a$2(a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(25146);
    paramDialogInterface = f.qX(this.rQp.ehM.field_username);
    ((com.tencent.mm.pluginsdk.h)g.K(com.tencent.mm.pluginsdk.h.class)).a(paramDialogInterface, (Activity)this.rQp.context, this.rQp.ehM);
    this.rQp.biW();
    ((b)g.K(b.class)).cwc();
    com.tencent.mm.plugin.sport.model.h.lp(false);
    AppMethodBeat.o(25146);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.ui.a.a.2
 * JD-Core Version:    0.6.2
 */