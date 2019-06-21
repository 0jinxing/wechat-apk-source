package com.google.android.exoplayer2.f.b;

import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class a extends com.google.android.exoplayer2.f.b
{
  private final b bmA;

  public a(List<byte[]> paramList)
  {
    super("DvbDecoder");
    AppMethodBeat.i(95622);
    paramList = new l((byte[])paramList.get(0));
    this.bmA = new b(paramList.readUnsignedShort(), paramList.readUnsignedShort());
    AppMethodBeat.o(95622);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.b.a
 * JD-Core Version:    0.6.2
 */