package com.tencent.mm.modelsfs;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends SFSInputStream
{
  private a fNS;

  public d(long paramLong1, long paramLong2)
  {
    super(paramLong1);
    AppMethodBeat.i(93164);
    this.fNS = new a(paramLong2);
    AppMethodBeat.o(93164);
  }

  public final void close()
  {
    AppMethodBeat.i(93170);
    super.close();
    if (this.fNS != null)
      this.fNS.free();
    AppMethodBeat.o(93170);
  }

  public final void mark(int paramInt)
  {
    AppMethodBeat.i(93165);
    super.mark(paramInt);
    this.fNS.aiO();
    AppMethodBeat.o(93165);
  }

  public final int read()
  {
    AppMethodBeat.i(93167);
    int i = super.read();
    AppMethodBeat.o(93167);
    return i;
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(93168);
    paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 < 0)
      AppMethodBeat.o(93168);
    while (true)
    {
      return paramInt1;
      this.fNS.z(paramArrayOfByte, paramInt2);
      AppMethodBeat.o(93168);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(93166);
    super.reset();
    this.fNS.reset();
    AppMethodBeat.o(93166);
  }

  public final long skip(long paramLong)
  {
    AppMethodBeat.i(93169);
    long l = super.skip(paramLong);
    this.fNS.seek(paramLong);
    AppMethodBeat.o(93169);
    return l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsfs.d
 * JD-Core Version:    0.6.2
 */