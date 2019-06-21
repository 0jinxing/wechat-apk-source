package com.tencent.mm.plugin.address.c;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import java.util.HashSet;
import java.util.Iterator;

final class b$1
  implements DialogInterface.OnCancelListener
{
  b$1(b paramb)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(16778);
    if ((this.gIX.gII != null) && (this.gIX.gIG.isEmpty()))
    {
      this.gIX.gII.dismiss();
      Iterator localIterator = this.gIX.gIH.iterator();
      while (localIterator.hasNext())
      {
        paramDialogInterface = (m)localIterator.next();
        aw.Rg().c(paramDialogInterface);
      }
      this.gIX.gIH.clear();
    }
    AppMethodBeat.o(16778);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.c.b.1
 * JD-Core Version:    0.6.2
 */