package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.qqmail.b.t;
import com.tencent.mm.ui.base.h;

final class a$5
  implements DialogInterface.OnClickListener
{
  a$5(a parama, boolean paramBoolean, EditText paramEditText)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(68266);
    t localt = new t(this.mgZ, com.tencent.mm.a.g.x(this.pxF.getText().toString().trim().getBytes()));
    com.tencent.mm.kernel.g.RO().eJo.a(localt, 0);
    paramDialogInterface = this.pxD;
    Context localContext = a.a(this.pxD);
    a.a(this.pxD).getString(2131298624);
    a.a(paramDialogInterface, h.b(localContext, a.a(this.pxD).getString(2131297086), true, new a.5.1(this, localt)));
    AppMethodBeat.o(68266);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.a.5
 * JD-Core Version:    0.6.2
 */