package com.google.android.exoplayer2.f.g;

import android.text.Layout.Alignment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

final class d
{
  int backgroundColor;
  String bnS;
  int bnT;
  boolean bnU;
  boolean bnV;
  int bnW;
  int bnX;
  int bnY;
  int bnZ;
  List<String> boA;
  String boB;
  int boa;
  Layout.Alignment boc;
  String boy;
  String boz;
  float fontSize;

  public d()
  {
    AppMethodBeat.i(95723);
    this.boy = "";
    this.boz = "";
    this.boA = Collections.emptyList();
    this.boB = "";
    this.bnS = null;
    this.bnU = false;
    this.bnV = false;
    this.bnW = -1;
    this.bnX = -1;
    this.bnY = -1;
    this.bnZ = -1;
    this.boa = -1;
    this.boc = null;
    AppMethodBeat.o(95723);
  }

  static int a(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    AppMethodBeat.i(95724);
    if ((paramString1.isEmpty()) || (paramInt1 == -1))
      AppMethodBeat.o(95724);
    while (true)
    {
      return paramInt1;
      if (paramString1.equals(paramString2))
      {
        paramInt1 += paramInt2;
        AppMethodBeat.o(95724);
      }
      else
      {
        AppMethodBeat.o(95724);
        paramInt1 = -1;
      }
    }
  }

  public final int getStyle()
  {
    int i = 0;
    int j = -1;
    if ((this.bnY == -1) && (this.bnZ == -1))
      return j;
    if (this.bnY == 1);
    for (j = 1; ; j = 0)
    {
      if (this.bnZ == 1)
        i = 2;
      j |= i;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.g.d
 * JD-Core Version:    0.6.2
 */