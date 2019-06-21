package com.tencent.mm.plugin.base.stub;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.game.a.a.a;
import com.tencent.mm.ui.base.h;

public final class a extends d
{
  public a(Context paramContext, String paramString1, String paramString2, d.a parama)
  {
    super(paramContext, paramString1, paramString2, parama);
  }

  protected final void aVh()
  {
    AppMethodBeat.i(18110);
    h.a(this.context, 2131300329, 2131297061, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(18109);
        paramAnonymousDialogInterface = a.a.bDb();
        if (paramAnonymousDialogInterface != null)
          paramAnonymousDialogInterface.m(a.this.openId, r.YC(), a.this.appId);
        a.this.jDq.ft(false);
        AppMethodBeat.o(18109);
      }
    });
    AppMethodBeat.o(18110);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.a
 * JD-Core Version:    0.6.2
 */