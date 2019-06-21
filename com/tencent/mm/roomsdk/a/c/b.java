package com.tencent.mm.roomsdk.a.c;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

public final class b extends a
{
  f fur;
  public m tRR;

  public b(boolean paramBoolean)
  {
    AppMethodBeat.i(80258);
    this.fur = new b.1(this);
    this.xuX = paramBoolean;
    AppMethodBeat.o(80258);
  }

  public final void a(Context paramContext, String paramString, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(80261);
    if (this.tRR == null)
      AppMethodBeat.o(80261);
    while (true)
    {
      return;
      this.tipDialog = h.b(paramContext, paramString, paramBoolean, paramOnCancelListener);
      dmX();
      AppMethodBeat.o(80261);
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(80259);
    if (this.tRR == null)
      AppMethodBeat.o(80259);
    while (true)
    {
      return;
      g.RQ();
      g.RO().eJo.c(this.tRR);
      g.RQ();
      g.RO().eJo.b(this.tRR.getType(), this.fur);
      AppMethodBeat.o(80259);
    }
  }

  public final void dmX()
  {
    AppMethodBeat.i(80260);
    if (this.tRR == null)
      AppMethodBeat.o(80260);
    while (true)
    {
      return;
      ab.i("MicroMsg.RoomCallbackFactory", "request scene %s", new Object[] { this.tRR });
      if ((this.tipDialog != null) || (this.xuY != null) || (this.xuZ != null) || (this.xva != null))
      {
        g.RQ();
        g.RO().eJo.a(this.tRR.getType(), this.fur);
      }
      g.RQ();
      g.RO().eJo.a(this.tRR, 0);
      AppMethodBeat.o(80260);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.roomsdk.a.c.b
 * JD-Core Version:    0.6.2
 */