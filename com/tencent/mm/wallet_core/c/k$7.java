package com.tencent.mm.wallet_core.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class k$7
  implements DialogInterface.OnClickListener
{
  k$7(k paramk, g paramg)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(49049);
    ab.i("MicroMsg.JumpRemind", "onClick2");
    if ((this.Afs.Afp != null) && (this.Afs.Afp.tff.equals("left_button_wording")))
    {
      this.Afv.aQ(this.Afs.Afp.type, this.Afs.Afp.path);
      AppMethodBeat.o(49049);
    }
    while (true)
    {
      return;
      this.Afv.onCancel();
      AppMethodBeat.o(49049);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.k.7
 * JD-Core Version:    0.6.2
 */