package com.tencent.mm.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum QImageView$a
{
  final int zNV;

  static
  {
    AppMethodBeat.i(115515);
    zNN = new a("MATRIX", 0, 0);
    zNO = new a("FIT_XY", 1, 1);
    zNP = new a("FIT_START", 2, 2);
    zNQ = new a("FIT_CENTER", 3, 3);
    zNR = new a("FIT_END", 4, 4);
    zNS = new a("CENTER", 5, 5);
    zNT = new a("CENTER_CROP", 6, 6);
    zNU = new a("CENTER_INSIDE", 7, 7);
    zNW = new a[] { zNN, zNO, zNP, zNQ, zNR, zNS, zNT, zNU };
    AppMethodBeat.o(115515);
  }

  private QImageView$a(int paramInt)
  {
    this.zNV = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.QImageView.a
 * JD-Core Version:    0.6.2
 */