package com.tencent.mm.plugin.nearby.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;

final class a$2
  implements DialogInterface.OnClickListener
{
  a$2(a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(55412);
    paramDialogInterface = g.RP().Ry();
    if (!a.b(this.oPV).isChecked());
    for (boolean bool = true; ; bool = false)
    {
      paramDialogInterface.set(4104, Boolean.valueOf(bool));
      com.tencent.mm.bn.a.fy(a.a(this.oPV));
      ((Activity)a.a(this.oPV)).finish();
      AppMethodBeat.o(55412);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.a.2
 * JD-Core Version:    0.6.2
 */