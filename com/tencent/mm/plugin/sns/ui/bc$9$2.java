package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;

final class bc$9$2
  implements DialogInterface.OnCancelListener
{
  bc$9$2(bc.9 param9, az paramaz)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(39871);
    ao.a.flu.or(this.rDI.rDc);
    AppMethodBeat.o(39871);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bc.9.2
 * JD-Core Version:    0.6.2
 */