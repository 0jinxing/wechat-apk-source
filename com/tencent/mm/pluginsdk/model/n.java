package com.tencent.mm.pluginsdk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class n
{
  public String cwg;
  private int vbp;
  public String vbq;
  public String vbr;
  public String vbs;
  public int vbt;

  n(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2)
  {
    this.vbp = paramInt1;
    this.cwg = paramString1;
    this.vbq = paramString2;
    this.vbt = paramInt2;
    this.vbr = paramString3;
    this.vbs = paramString4;
  }

  public final String toString()
  {
    AppMethodBeat.i(79224);
    String str = "id:" + this.vbp + ";productId:" + this.cwg + ";full:" + this.vbq + ";productState:" + this.vbt + ";priceCurrencyCode:" + this.vbr + ";priceAmountMicros:" + this.vbs;
    AppMethodBeat.o(79224);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.n
 * JD-Core Version:    0.6.2
 */