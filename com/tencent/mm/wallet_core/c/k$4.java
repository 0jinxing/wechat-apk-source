package com.tencent.mm.wallet_core.c;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class k$4
  implements DialogInterface.OnClickListener
{
  k$4(k paramk, Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(49044);
    ab.i("MicroMsg.JumpRemind", "onClick2");
    if ((this.Afs.Afp != null) && (this.Afs.Afp.tff.equals("left_button_wording")))
    {
      this.Afs.ip(this.ghG);
      AppMethodBeat.o(49044);
    }
    while (true)
    {
      return;
      this.Afs.Afq.onCancel();
      AppMethodBeat.o(49044);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.k.4
 * JD-Core Version:    0.6.2
 */