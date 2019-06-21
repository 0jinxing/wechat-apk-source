package com.tencent.mm.plugin.multitalk.model;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bg.e;

public final class i
{
  private boolean oGP;
  private boolean oGQ;

  public final void Q(Activity paramActivity)
  {
    AppMethodBeat.i(54043);
    if (!this.oGP)
    {
      this.oGP = true;
      e.a(paramActivity, 2131301558, null);
    }
    AppMethodBeat.o(54043);
  }

  public final void R(Activity paramActivity)
  {
    AppMethodBeat.i(54044);
    if (!this.oGQ)
    {
      this.oGQ = true;
      e.a(paramActivity, 2131304448, null);
    }
    AppMethodBeat.o(54044);
  }

  public final void reset()
  {
    this.oGQ = false;
    this.oGP = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.i
 * JD-Core Version:    0.6.2
 */