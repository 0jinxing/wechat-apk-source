package com.tencent.mm.plugin.hp.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.hp.d.b;
import com.tencent.mm.plugin.hp.tinker.g;

final class e$2
  implements DialogInterface.OnClickListener
{
  e$2(e parame, Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(90594);
    g.aA(this.val$context, this.ntK.ntI.num);
    AppMethodBeat.o(90594);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.b.e.2
 * JD-Core Version:    0.6.2
 */