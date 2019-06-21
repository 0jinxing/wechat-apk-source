package com.tencent.mm.plugin.wallet_core.id_verify.util;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

final class a$7
  implements DialogInterface.OnClickListener
{
  a$7(a parama, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46672);
    com.tencent.mm.wallet_core.ui.e.a(2, bo.anT(), this.tvW);
    if ((this.tvY.tvT != null) && (this.tvY.tvT.get() != null))
    {
      g.RQ();
      g.RO().eJo.a(385, this.tvY);
      paramDialogInterface = new com.tencent.mm.plugin.wallet_core.id_verify.model.a(this.tvY.gOW);
      ((com.tencent.mm.wallet_core.d.e)this.tvY.tvT.get()).a(paramDialogInterface, true);
    }
    AppMethodBeat.o(46672);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.util.a.7
 * JD-Core Version:    0.6.2
 */