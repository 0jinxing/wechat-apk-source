package com.tencent.mm.plugin.ipcall.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class a
{
  String countryCode;
  String fHE;
  String fHF;
  private int nzG;

  public a(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    this.fHE = paramString1;
    this.countryCode = paramString2;
    this.nzG = paramInt;
    this.fHF = paramString3;
  }

  public final int bIc()
  {
    int i = 0;
    AppMethodBeat.i(21952);
    if (this.nzG == 0)
      AppMethodBeat.o(21952);
    while (true)
    {
      return i;
      String[] arrayOfString = IPCallCountryCodeScrollbar.nBP;
      int j = arrayOfString.length;
      for (i = 0; ; i++)
      {
        if (i >= j)
          break label74;
        if (arrayOfString[i].equals(String.valueOf((char)this.nzG)))
        {
          i = this.nzG;
          AppMethodBeat.o(21952);
          break;
        }
      }
      label74: i = "#".charAt(0);
      AppMethodBeat.o(21952);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.a
 * JD-Core Version:    0.6.2
 */