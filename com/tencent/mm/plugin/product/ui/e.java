package com.tencent.mm.plugin.product.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class e
{
  int piG;
  private int piH;

  public e(int paramInt1, int paramInt2)
  {
    this.piH = paramInt1;
    this.piG = paramInt2;
  }

  public final boolean cab()
  {
    AppMethodBeat.i(44052);
    if ((this.piH & 0x1) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.MallProductConfig", "isFreePost, ret = ".concat(String.valueOf(bool)));
      AppMethodBeat.o(44052);
      return bool;
    }
  }

  public final boolean cac()
  {
    AppMethodBeat.i(44053);
    if ((this.piH & 0x2) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.MallProductConfig", "hasReceipt, ret = ".concat(String.valueOf(bool)));
      AppMethodBeat.o(44053);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.e
 * JD-Core Version:    0.6.2
 */