package com.tencent.mm.plugin.card.d;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ik;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class d$10
  implements DialogInterface.OnClickListener
{
  d$10(Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(88834);
    paramDialogInterface.dismiss();
    paramDialogInterface = new ik();
    paramDialogInterface.cDz.context = this.val$context;
    a.xxA.m(paramDialogInterface);
    ab.i("MicroMsg.CardDialogHelper", "enter to cardhome");
    AppMethodBeat.o(88834);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.d.10
 * JD-Core Version:    0.6.2
 */