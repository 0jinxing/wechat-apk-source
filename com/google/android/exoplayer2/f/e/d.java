package com.google.android.exoplayer2.f.e;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d
{
  int backgroundColor;
  String bnS;
  int bnT;
  boolean bnU;
  boolean bnV;
  int bnW = -1;
  int bnX = -1;
  int bnY = -1;
  int bnZ = -1;
  int boa = -1;
  d bob;
  Layout.Alignment boc;
  float fontSize;
  String id;

  public final d aK(boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(95690);
    boolean bool;
    if (this.bob == null)
    {
      bool = true;
      a.checkState(bool);
      if (!paramBoolean)
        break label41;
    }
    while (true)
    {
      this.bnW = i;
      AppMethodBeat.o(95690);
      return this;
      bool = false;
      break;
      label41: i = 0;
    }
  }

  public final d aL(boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(95691);
    boolean bool;
    if (this.bob == null)
    {
      bool = true;
      a.checkState(bool);
      if (!paramBoolean)
        break label41;
    }
    while (true)
    {
      this.bnX = i;
      AppMethodBeat.o(95691);
      return this;
      bool = false;
      break;
      label41: i = 0;
    }
  }

  final d b(d paramd)
  {
    AppMethodBeat.i(95693);
    if (paramd != null)
    {
      if ((!this.bnU) && (paramd.bnU))
        eE(paramd.bnT);
      if (this.bnY == -1)
        this.bnY = paramd.bnY;
      if (this.bnZ == -1)
        this.bnZ = paramd.bnZ;
      if (this.bnS == null)
        this.bnS = paramd.bnS;
      if (this.bnW == -1)
        this.bnW = paramd.bnW;
      if (this.bnX == -1)
        this.bnX = paramd.bnX;
      if (this.boc == null)
        this.boc = paramd.boc;
      if (this.boa == -1)
      {
        this.boa = paramd.boa;
        this.fontSize = paramd.fontSize;
      }
      if ((!this.bnV) && (paramd.bnV))
        eF(paramd.backgroundColor);
    }
    AppMethodBeat.o(95693);
    return this;
  }

  public final d eE(int paramInt)
  {
    AppMethodBeat.i(95692);
    if (this.bob == null);
    for (boolean bool = true; ; bool = false)
    {
      a.checkState(bool);
      this.bnT = paramInt;
      this.bnU = true;
      AppMethodBeat.o(95692);
      return this;
    }
  }

  public final d eF(int paramInt)
  {
    this.backgroundColor = paramInt;
    this.bnV = true;
    return this;
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.e.d
 * JD-Core Version:    0.6.2
 */