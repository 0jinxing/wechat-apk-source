package com.tencent.mm.plugin.d.a.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class b$c
{
  public int enR = 0;
  public int enV = 0;
  public int jHA = 0;
  public int jHB = 0;
  public int jHC = 0;
  public int jHz = 0;

  public final boolean M(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(18459);
    String str = b.access$000();
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      ab.d(str, "data size = %d, offset = %d, lenght = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(7) });
      if ((paramArrayOfByte != null) && (paramInt >= 0) && (paramArrayOfByte.length >= paramInt + 7))
        break label94;
      ab.e(b.access$000(), "data input error");
      AppMethodBeat.o(18459);
    }
    while (true)
    {
      return bool;
      i = paramArrayOfByte.length;
      break;
      label94: this.enV = ((paramArrayOfByte[paramInt] & 0xFF) + ((paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8));
      this.enR = (paramArrayOfByte[(paramInt + 2)] & 0xFF);
      this.jHz = (paramArrayOfByte[(paramInt + 3)] & 0xFF);
      this.jHA = (paramArrayOfByte[(paramInt + 4)] & 0xFF);
      this.jHB = (paramArrayOfByte[(paramInt + 5)] & 0xFF);
      this.jHC = (paramArrayOfByte[(paramInt + 6)] & 0xFF);
      ab.d(b.access$000(), "year = %d, month = %d, day = %d, hours = %d, minutes = %d, seconds = %d", new Object[] { Integer.valueOf(this.enV), Integer.valueOf(this.enR), Integer.valueOf(this.jHz), Integer.valueOf(this.jHA), Integer.valueOf(this.jHB), Integer.valueOf(this.jHC) });
      AppMethodBeat.o(18459);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.a.b.c
 * JD-Core Version:    0.6.2
 */