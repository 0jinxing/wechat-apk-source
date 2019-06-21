package com.bumptech.glide.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum f$a
{
  public final boolean aza;

  static
  {
    AppMethodBeat.i(91676);
    ayS = new a("GIF", 0, true);
    ayT = new a("JPEG", 1, false);
    ayU = new a("RAW", 2, false);
    ayV = new a("PNG_A", 3, true);
    ayW = new a("PNG", 4, false);
    ayX = new a("WEBP_A", 5, true);
    ayY = new a("WEBP", 6, false);
    ayZ = new a("UNKNOWN", 7, false);
    azb = new a[] { ayS, ayT, ayU, ayV, ayW, ayX, ayY, ayZ };
    AppMethodBeat.o(91676);
  }

  private f$a(boolean paramBoolean)
  {
    this.aza = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.f.a
 * JD-Core Version:    0.6.2
 */