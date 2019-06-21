package com.google.android.exoplayer2.h;

import com.google.android.exoplayer2.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public final class h extends InputStream
{
  private final f aSF;
  private final i bib;
  private final byte[] bpN;
  long bpO;
  private boolean closed;
  private boolean opened;

  public h(f paramf, i parami)
  {
    AppMethodBeat.i(95795);
    this.opened = false;
    this.closed = false;
    this.aSF = paramf;
    this.bib = parami;
    this.bpN = new byte[1];
    AppMethodBeat.o(95795);
  }

  public final void close()
  {
    AppMethodBeat.i(95799);
    if (!this.closed)
    {
      this.aSF.close();
      this.closed = true;
    }
    AppMethodBeat.o(95799);
  }

  public final int read()
  {
    int i = -1;
    AppMethodBeat.i(95796);
    if (read(this.bpN) == -1)
      AppMethodBeat.o(95796);
    while (true)
    {
      return i;
      i = this.bpN[0] & 0xFF;
      AppMethodBeat.o(95796);
    }
  }

  public final int read(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(95797);
    int i = read(paramArrayOfByte, 0, paramArrayOfByte.length);
    AppMethodBeat.o(95797);
    return i;
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95798);
    boolean bool;
    if (!this.closed)
    {
      bool = true;
      a.checkState(bool);
      tn();
      paramInt1 = this.aSF.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 != -1)
        break label57;
      AppMethodBeat.o(95798);
      paramInt1 = -1;
    }
    while (true)
    {
      return paramInt1;
      bool = false;
      break;
      label57: this.bpO += paramInt1;
      AppMethodBeat.o(95798);
    }
  }

  final void tn()
  {
    AppMethodBeat.i(95800);
    if (!this.opened)
    {
      this.aSF.a(this.bib);
      this.opened = true;
    }
    AppMethodBeat.o(95800);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.h
 * JD-Core Version:    0.6.2
 */