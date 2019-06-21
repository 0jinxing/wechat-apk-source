package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  public String cEh;
  public String kCs;
  public String nZb;
  public String nZc;

  public final boolean cPa()
  {
    AppMethodBeat.i(46694);
    boolean bool;
    if ((!bo.isNullOrNil(this.cEh)) && (!bo.isNullOrNil(this.nZb)) && (!bo.isNullOrNil(this.nZc)) && (!bo.isNullOrNil(this.kCs)))
    {
      bool = true;
      AppMethodBeat.o(46694);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46694);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.a
 * JD-Core Version:    0.6.2
 */