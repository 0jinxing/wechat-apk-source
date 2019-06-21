package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cv;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.h;

public final class s$m extends s.e
{
  public s$m(com.tencent.mm.ui.chatting.d.a parama)
  {
    super(parama);
  }

  public final void a(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(30733);
    h.d(parama.yTx.getContext(), parama.yTx.getMMResources().getString(2131299036), "", parama.yTx.getMMResources().getString(2131299038), parama.yTx.getMMResources().getString(2131299035), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(30731);
        paramAnonymousDialogInterface = new cv();
        paramAnonymousDialogInterface.cvX.enable = true;
        com.tencent.mm.sdk.b.a.xxA.m(paramAnonymousDialogInterface);
        AppMethodBeat.o(30731);
      }
    }
    , new s.m.2(this));
    AppMethodBeat.o(30733);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.s.m
 * JD-Core Version:    0.6.2
 */