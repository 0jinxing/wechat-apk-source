package com.tencent.mm.plugin.luckymoney.model;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import java.util.HashSet;
import java.util.Iterator;

final class s$2
  implements DialogInterface.OnCancelListener
{
  s$2(s params)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(42340);
    if ((this.nXT.tipDialog != null) && (this.nXT.gIG.isEmpty()))
    {
      this.nXT.tipDialog.dismiss();
      paramDialogInterface = this.nXT.gIH.iterator();
      while (paramDialogInterface.hasNext())
      {
        m localm = (m)paramDialogInterface.next();
        g.RQ();
        g.RO().eJo.c(localm);
      }
      this.nXT.gIH.clear();
    }
    AppMethodBeat.o(42340);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.s.2
 * JD-Core Version:    0.6.2
 */