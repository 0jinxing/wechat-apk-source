package com.tencent.mm.wallet_core.d;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import java.util.HashSet;
import java.util.Iterator;

final class i$7
  implements DialogInterface.OnCancelListener
{
  i$7(i parami)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(49145);
    if ((this.Agr.gII != null) && (this.Agr.gIG.isEmpty()))
    {
      this.Agr.gII.dismiss();
      paramDialogInterface = this.Agr.gIH.iterator();
      while (paramDialogInterface.hasNext())
      {
        m localm = (m)paramDialogInterface.next();
        g.RQ();
        g.RO().eJo.c(localm);
      }
      this.Agr.gIH.clear();
    }
    AppMethodBeat.o(49145);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.d.i.7
 * JD-Core Version:    0.6.2
 */