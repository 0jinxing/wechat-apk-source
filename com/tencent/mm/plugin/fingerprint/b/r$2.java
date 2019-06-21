package com.tencent.mm.plugin.fingerprint.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class r$2
  implements DialogInterface.OnClickListener
{
  r$2(r paramr, CheckBox paramCheckBox)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(41562);
    if (this.msk.isChecked())
      g.RP().Ry().set(ac.a.xKQ, Boolean.TRUE);
    AppMethodBeat.o(41562);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.r.2
 * JD-Core Version:    0.6.2
 */