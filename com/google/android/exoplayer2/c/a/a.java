package com.google.android.exoplayer2.c.a;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.c;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;

final class a extends d
{
  private static final int[] aTd = { 5512, 11025, 22050, 44100 };
  private boolean aTe;
  private boolean aTf;
  private int aTg;

  public a(m paramm)
  {
    super(paramm);
  }

  protected final void a(l paraml, long paramLong)
  {
    AppMethodBeat.i(94862);
    int i;
    if (this.aTg == 2)
    {
      i = paraml.tB();
      this.aTw.a(paraml, i);
      this.aTw.a(paramLong, 1, i, 0, null);
      AppMethodBeat.o(94862);
    }
    while (true)
    {
      return;
      i = paraml.readUnsignedByte();
      if ((i == 0) && (!this.aTf))
      {
        byte[] arrayOfByte = new byte[paraml.tB()];
        paraml.readBytes(arrayOfByte, 0, arrayOfByte.length);
        paraml = c.q(arrayOfByte);
        paraml = Format.a(null, "audio/mp4a-latm", -1, -1, ((Integer)paraml.second).intValue(), ((Integer)paraml.first).intValue(), Collections.singletonList(arrayOfByte), null, null);
        this.aTw.f(paraml);
        this.aTf = true;
        AppMethodBeat.o(94862);
      }
      else
      {
        if ((this.aTg != 10) || (i == 1))
        {
          i = paraml.tB();
          this.aTw.a(paraml, i);
          this.aTw.a(paramLong, 1, i, 0, null);
        }
        AppMethodBeat.o(94862);
      }
    }
  }

  protected final boolean a(l paraml)
  {
    int i = 2;
    AppMethodBeat.i(94861);
    int j;
    if (!this.aTe)
    {
      j = paraml.readUnsignedByte();
      this.aTg = (j >> 4 & 0xF);
      if (this.aTg == 2)
      {
        paraml = Format.a(null, "audio/mpeg", -1, -1, 1, aTd[(j >> 2 & 0x3)], null, null, null);
        this.aTw.f(paraml);
        this.aTf = true;
        this.aTe = true;
      }
    }
    while (true)
    {
      AppMethodBeat.o(94861);
      return true;
      if ((this.aTg == 7) || (this.aTg == 8))
      {
        if (this.aTg == 7)
        {
          paraml = "audio/g711-alaw";
          label116: if ((j & 0x1) != 1)
            break label164;
        }
        while (true)
        {
          paraml = Format.a(null, paraml, -1, -1, 1, 8000, i, null, null, 0, null);
          this.aTw.f(paraml);
          this.aTf = true;
          break;
          paraml = "audio/g711-mlaw";
          break label116;
          label164: i = 3;
        }
      }
      if (this.aTg == 10)
        break;
      paraml = new d.a("Audio format not supported: " + this.aTg);
      AppMethodBeat.o(94861);
      throw paraml;
      paraml.eM(1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.a.a
 * JD-Core Version:    0.6.2
 */