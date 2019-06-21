package com.tencent.mm.be;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  String fNM;
  double fNN;
  double latitude;
  double longitude;

  public final String toString()
  {
    AppMethodBeat.i(78562);
    String str = "gspType:" + this.fNM + " longitude: " + this.longitude + " latitude: " + this.latitude + " distance: " + this.fNN;
    AppMethodBeat.o(78562);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.be.d
 * JD-Core Version:    0.6.2
 */