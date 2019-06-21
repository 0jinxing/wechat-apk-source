package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Ftyp extends Box
{
  int[] compatibleBrands;
  int majorBrand;
  int minorVersion;

  public void parse(Parsable paramParsable, Box paramBox)
  {
    AppMethodBeat.i(128486);
    super.parse(paramParsable, paramBox);
    this.majorBrand = paramParsable.readInt();
    this.minorVersion = paramParsable.readInt();
    int i = (int)paramParsable.available() / 4;
    if (i > 0)
      this.compatibleBrands = paramParsable.readIntArray(i);
    AppMethodBeat.o(128486);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Ftyp
 * JD-Core Version:    0.6.2
 */