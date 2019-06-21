package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.j;

public final class b$a
{
  public String pcj;
  public j tDR;
  public double tDS;
  public String tDT;

  public final String toString()
  {
    AppMethodBeat.i(47098);
    Object localObject = new StringBuffer();
    if (this.tDR != null)
      ((StringBuffer)localObject).append("|faovrComposeId: " + this.tDR.tnk);
    ((StringBuffer)localObject).append("|bankName: " + this.pcj);
    ((StringBuffer)localObject).append("|bankFavorAmount: " + this.tDS);
    ((StringBuffer)localObject).append("|bankType: " + this.tDT);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(47098);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.b.a
 * JD-Core Version:    0.6.2
 */