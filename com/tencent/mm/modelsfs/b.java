package com.tencent.mm.modelsfs;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.io.FilterInputStream;

public final class b extends FilterInputStream
{
  private boolean fNO;
  private a fNS;

  public b(String paramString, long paramLong)
  {
    super(e.openRead(paramString));
    AppMethodBeat.i(93154);
    this.fNO = false;
    this.fNS = new a(paramLong);
    AppMethodBeat.o(93154);
  }

  public final void close()
  {
    AppMethodBeat.i(93157);
    super.close();
    if (this.fNS != null)
      this.fNS.free();
    ab.i("MicroMsg.EncInputStream", "close  hashcode " + hashCode());
    AppMethodBeat.o(93157);
  }

  public final void mark(int paramInt)
  {
    AppMethodBeat.i(93158);
    super.mark(paramInt);
    this.fNS.aiO();
    AppMethodBeat.o(93158);
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(93155);
    if (this.fNO)
      ab.i("MicroMsg.EncInputStream", "read buffer  hashcode " + hashCode() + " " + bo.dpG().toString());
    paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 < 0)
      AppMethodBeat.o(93155);
    while (true)
    {
      return paramInt1;
      this.fNS.z(paramArrayOfByte, paramInt2);
      AppMethodBeat.o(93155);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(93159);
    super.reset();
    this.fNS.reset();
    AppMethodBeat.o(93159);
  }

  public final long skip(long paramLong)
  {
    AppMethodBeat.i(93156);
    long l = super.skip(paramLong);
    this.fNS.seek(paramLong);
    AppMethodBeat.o(93156);
    return l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsfs.b
 * JD-Core Version:    0.6.2
 */