package com.tencent.mm.wallet_core.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class k$6
  implements DialogInterface.OnClickListener
{
  k$6(k paramk, g paramg)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(49048);
    ab.i("MicroMsg.JumpRemind", "onClick1 ");
    if ((this.Afs.Afp != null) && (this.Afs.Afp.tff.equals("right_button_wording")))
    {
      this.Afv.aQ(this.Afs.Afp.type, this.Afs.Afp.path);
      AppMethodBeat.o(49048);
    }
    while (true)
    {
      return;
      this.Afv.onCancel();
      AppMethodBeat.o(49048);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.k.6
 * JD-Core Version:    0.6.2
 */