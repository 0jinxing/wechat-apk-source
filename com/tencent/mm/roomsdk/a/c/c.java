package com.tencent.mm.roomsdk.a.c;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.i.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

public final class c extends a
{
  com.tencent.mm.sdk.b.c ekk;
  public j.b xvc;
  boolean xvd;
  i.a xve;

  public c(boolean paramBoolean)
  {
    AppMethodBeat.i(80266);
    this.xvd = false;
    this.ekk = new c.1(this);
    this.xve = new c.2(this);
    this.xuX = paramBoolean;
    AppMethodBeat.o(80266);
  }

  public final void a(Context paramContext, String paramString, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(80269);
    this.tipDialog = h.b(paramContext, paramString, paramBoolean, paramOnCancelListener);
    dmX();
    AppMethodBeat.o(80269);
  }

  public final void cancel()
  {
    AppMethodBeat.i(80267);
    ((j)g.K(j.class)).XL().d(this.xvc);
    ((j)g.K(j.class)).XL().b(this.xvc.getCmdId(), this.xve);
    this.ekk.dead();
    AppMethodBeat.o(80267);
  }

  public final void dmX()
  {
    AppMethodBeat.i(80268);
    ab.i("MicroMsg.RoomCallbackFactory", "request oplog %s", new Object[] { this.xvc });
    if ((this.xuY != null) || (this.xuZ != null) || (this.xva != null))
    {
      this.ekk.dnU();
      ((j)g.K(j.class)).XL().a(this.xvc.getCmdId(), this.xve);
    }
    ((j)g.K(j.class)).XL().c(this.xvc);
    AppMethodBeat.o(80268);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.roomsdk.a.c.c
 * JD-Core Version:    0.6.2
 */