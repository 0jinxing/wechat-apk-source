package com.tencent.mm.ui.transmit;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

public final class e
{
  Context context;
  Runnable hEw;
  boolean iHj;
  boolean iHk;
  boolean iHl;
  int iHm;
  String text;
  p tipDialog;
  e.a zKR;

  public e(Context paramContext)
  {
    AppMethodBeat.i(35281);
    this.hEw = new e.1(this);
    this.context = paramContext;
    AppMethodBeat.o(35281);
  }

  public final void aMl()
  {
    AppMethodBeat.i(35282);
    if (this.zKR != null)
      this.zKR.z(this.iHl, this.text);
    AppMethodBeat.o(35282);
  }

  public final boolean oC()
  {
    return this.iHj & this.iHk;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.e
 * JD-Core Version:    0.6.2
 */