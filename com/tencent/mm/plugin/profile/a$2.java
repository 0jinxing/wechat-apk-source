package com.tencent.mm.plugin.profile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.storage.ad;

final class a$2
  implements DialogInterface.OnClickListener
{
  a$2(a parama, ad paramad)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(23204);
    sz localsz = new sz();
    localsz.cPf.cPi = true;
    com.tencent.mm.sdk.b.a.xxA.m(localsz);
    this.pkl.a(this.emj, this.pkl.jiE);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(23204);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a.2
 * JD-Core Version:    0.6.2
 */