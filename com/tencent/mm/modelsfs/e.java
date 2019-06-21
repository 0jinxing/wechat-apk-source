package com.tencent.mm.modelsfs;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e extends SFSOutputStream
{
  private a fNS;

  public e(long paramLong, String paramString)
  {
    super(paramLong);
    AppMethodBeat.i(93171);
    this.fNS = new a(paramString);
    AppMethodBeat.o(93171);
  }

  public final void close()
  {
    AppMethodBeat.i(93174);
    super.close();
    if (this.fNS != null)
      this.fNS.free();
    AppMethodBeat.o(93174);
  }

  protected final void finalize()
  {
    AppMethodBeat.i(93175);
    super.finalize();
    AppMethodBeat.o(93175);
  }

  public final void write(int paramInt)
  {
    AppMethodBeat.i(93172);
    super.write(paramInt);
    AppMethodBeat.o(93172);
  }

  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(93173);
    this.fNS.z(paramArrayOfByte, paramInt2);
    super.write(paramArrayOfByte, paramInt1, paramInt2);
    AppMethodBeat.o(93173);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsfs.e
 * JD-Core Version:    0.6.2
 */