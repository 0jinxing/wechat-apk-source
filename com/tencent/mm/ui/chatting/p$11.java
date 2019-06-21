package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.multitalk.model.a;
import com.tencent.mm.sdk.platformtools.ah;

final class p$11
  implements DialogInterface.OnClickListener
{
  p$11(p paramp)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(30654);
    if (!((a)g.K(a.class)).RV(this.yJn.getTalkerUserName()))
    {
      Toast.makeText(ah.getContext(), ah.getContext().getString(2131301570), 0).show();
      AppMethodBeat.o(30654);
    }
    while (true)
    {
      return;
      if (!((a)g.K(a.class)).Sb(this.yJn.getTalkerUserName()))
        Toast.makeText(ah.getContext(), ah.getContext().getString(2131301535), 0).show();
      AppMethodBeat.o(30654);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.p.11
 * JD-Core Version:    0.6.2
 */