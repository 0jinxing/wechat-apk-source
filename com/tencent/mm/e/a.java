package com.tencent.mm.e;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a
{
  public int value;

  static
  {
    AppMethodBeat.i(116147);
    ciV = new a("DEFAULT", 0, 0);
    ciW = new a("DOODLE", 1, 2);
    ciX = new a("MOSAIC", 2, 1);
    ciY = new a("EMOJI_AND_TEXT", 3, 3);
    ciZ = new a("CROP_PHOTO", 4, 2147483647);
    cja = new a("CROP_VIDEO", 5, 2147483647);
    cjb = new a[] { ciV, ciW, ciX, ciY, ciZ, cja };
    AppMethodBeat.o(116147);
  }

  private a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.a
 * JD-Core Version:    0.6.2
 */