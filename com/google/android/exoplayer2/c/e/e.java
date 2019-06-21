package com.google.android.exoplayer2.c.e;

import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.EOFException;

final class e
{
  private static final int bak;
  private final l aTj;
  public int aVG;
  public int bal;
  public long bam;
  public long ban;
  public long bao;
  public long bap;
  public int baq;
  public int bar;
  public final int[] bas;
  public int type;

  static
  {
    AppMethodBeat.i(95043);
    bak = v.aT("OggS");
    AppMethodBeat.o(95043);
  }

  e()
  {
    AppMethodBeat.i(95041);
    this.bas = new int['ÿ'];
    this.aTj = new l(255);
    AppMethodBeat.o(95041);
  }

  public final boolean c(f paramf, boolean paramBoolean)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(95042);
    this.aTj.reset();
    reset();
    int j;
    if ((paramf.getLength() == -1L) || (paramf.getLength() - paramf.qZ() >= 27L))
    {
      j = 1;
      if ((j != 0) && (paramf.b(this.aTj.data, 0, 27, true)))
        break label117;
      if (!paramBoolean)
        break label102;
      AppMethodBeat.o(95042);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      j = 0;
      break;
      label102: paramf = new EOFException();
      AppMethodBeat.o(95042);
      throw paramf;
      label117: if (this.aTj.cM() != bak)
      {
        if (paramBoolean)
        {
          AppMethodBeat.o(95042);
          paramBoolean = bool;
        }
        else
        {
          paramf = new o("expected OggS capture pattern at begin of page");
          AppMethodBeat.o(95042);
          throw paramf;
        }
      }
      else
      {
        this.bal = this.aTj.readUnsignedByte();
        if (this.bal != 0)
        {
          if (paramBoolean)
          {
            AppMethodBeat.o(95042);
            paramBoolean = bool;
          }
          else
          {
            paramf = new o("unsupported bit stream revision");
            AppMethodBeat.o(95042);
            throw paramf;
          }
        }
        else
        {
          this.type = this.aTj.readUnsignedByte();
          this.bam = this.aTj.tG();
          this.ban = this.aTj.tE();
          this.bao = this.aTj.tE();
          this.bap = this.aTj.tE();
          this.baq = this.aTj.readUnsignedByte();
          this.aVG = (this.baq + 27);
          this.aTj.reset();
          paramf.b(this.aTj.data, 0, this.baq);
          for (j = i; j < this.baq; j++)
          {
            this.bas[j] = this.aTj.readUnsignedByte();
            this.bar += this.bas[j];
          }
          AppMethodBeat.o(95042);
          paramBoolean = true;
        }
      }
    }
  }

  public final void reset()
  {
    this.bal = 0;
    this.type = 0;
    this.bam = 0L;
    this.ban = 0L;
    this.bao = 0L;
    this.bap = 0L;
    this.baq = 0;
    this.aVG = 0;
    this.bar = 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.e.e
 * JD-Core Version:    0.6.2
 */