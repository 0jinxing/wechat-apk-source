package com.google.android.exoplayer2.c.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.EOFException;
import java.io.IOException;

final class a
  implements f
{
  final long aXw;
  private final e aZP;
  final long aZQ;
  final h aZR;
  long aZS;
  private long aZT;
  private long aZU;
  private long aZV;
  private long aZW;
  private long aZX;
  private long start;
  private int state;

  public a(long paramLong1, long paramLong2, h paramh, int paramInt, long paramLong3)
  {
    AppMethodBeat.i(95021);
    this.aZP = new e();
    boolean bool;
    if ((paramLong1 >= 0L) && (paramLong2 > paramLong1))
    {
      bool = true;
      com.google.android.exoplayer2.i.a.checkArgument(bool);
      this.aZR = paramh;
      this.aZQ = paramLong1;
      this.aXw = paramLong2;
      if (paramInt != paramLong2 - paramLong1)
        break label89;
      this.aZS = paramLong3;
      this.state = 3;
      AppMethodBeat.o(95021);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label89: this.state = 0;
      AppMethodBeat.o(95021);
    }
  }

  private long a(com.google.android.exoplayer2.c.f paramf, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95025);
    this.aZP.c(paramf, false);
    while (this.aZP.bam < paramLong1)
    {
      paramf.dG(this.aZP.aVG + this.aZP.bar);
      paramLong2 = this.aZP.bam;
      this.aZP.c(paramf, false);
    }
    paramf.qY();
    AppMethodBeat.o(95025);
    return paramLong2;
  }

  private boolean a(com.google.android.exoplayer2.c.f paramf, long paramLong)
  {
    int i = 2048;
    AppMethodBeat.i(95024);
    paramLong = Math.min(3L + paramLong, this.aXw);
    byte[] arrayOfByte = new byte[2048];
    while (true)
    {
      int j = i;
      boolean bool;
      if (paramf.getPosition() + i > paramLong)
      {
        i = (int)(paramLong - paramf.getPosition());
        j = i;
        if (i < 4)
        {
          AppMethodBeat.o(95024);
          bool = false;
          return bool;
        }
      }
      paramf.b(arrayOfByte, 0, j, false);
      for (i = 0; ; i++)
      {
        if (i >= j - 3)
          break label177;
        if ((arrayOfByte[i] == 79) && (arrayOfByte[(i + 1)] == 103) && (arrayOfByte[(i + 2)] == 103) && (arrayOfByte[(i + 3)] == 83))
        {
          paramf.dG(i);
          bool = true;
          AppMethodBeat.o(95024);
          break;
        }
      }
      label177: paramf.dG(j - 3);
      i = j;
    }
  }

  public final long S(long paramLong)
  {
    AppMethodBeat.i(95023);
    boolean bool;
    if ((this.state == 3) || (this.state == 2))
    {
      bool = true;
      com.google.android.exoplayer2.i.a.checkArgument(bool);
      if (paramLong != 0L)
        break label91;
    }
    label91: for (paramLong = 0L; ; paramLong = this.aZR.U(paramLong))
    {
      this.aZU = paramLong;
      this.state = 2;
      this.start = this.aZQ;
      this.aZV = this.aXw;
      this.aZW = 0L;
      this.aZX = this.aZS;
      paramLong = this.aZU;
      AppMethodBeat.o(95023);
      return paramLong;
      bool = false;
      break;
    }
  }

  public final long i(com.google.android.exoplayer2.c.f paramf)
  {
    int i = 1;
    AppMethodBeat.i(95022);
    switch (this.state)
    {
    default:
      paramf = new IllegalStateException();
      AppMethodBeat.o(95022);
      throw paramf;
    case 3:
      l1 = -1L;
      AppMethodBeat.o(95022);
    case 0:
    case 1:
      while (true)
      {
        return l1;
        this.aZT = paramf.getPosition();
        this.state = 1;
        l1 = this.aXw - 65307L;
        if (l1 > this.aZT)
        {
          AppMethodBeat.o(95022);
        }
        else
        {
          if (!a(paramf, this.aXw))
          {
            paramf = new EOFException();
            AppMethodBeat.o(95022);
            throw paramf;
          }
          this.aZP.reset();
          while (((this.aZP.type & 0x4) != 4) && (paramf.getPosition() < this.aXw))
          {
            this.aZP.c(paramf, false);
            paramf.dG(this.aZP.aVG + this.aZP.bar);
          }
          this.aZS = this.aZP.bam;
          this.state = 3;
          l1 = this.aZT;
          AppMethodBeat.o(95022);
        }
      }
    case 2:
    }
    if (this.aZU == 0L);
    label629: for (long l1 = 0L; ; l1 = a(paramf, this.aZU, -(l1 + 2L)))
    {
      this.state = 3;
      l1 = -(l1 + 2L);
      AppMethodBeat.o(95022);
      break;
      long l2 = this.aZU;
      if (this.start == this.aZV)
        l1 = -(this.aZW + 2L);
      while (true)
      {
        if (l1 < 0L)
          break label629;
        AppMethodBeat.o(95022);
        break;
        l1 = paramf.getPosition();
        if (!a(paramf, this.aZV))
        {
          if (this.start == l1)
          {
            paramf = new IOException("No ogg page can be found.");
            AppMethodBeat.o(95022);
            throw paramf;
          }
          l1 = this.start;
        }
        else
        {
          this.aZP.c(paramf, false);
          paramf.qY();
          l2 -= this.aZP.bam;
          int j = this.aZP.aVG + this.aZP.bar;
          if ((l2 < 0L) || (l2 > 72000L))
          {
            if (l2 < 0L)
            {
              this.aZV = l1;
              this.aZX = this.aZP.bam;
            }
            while (true)
              if (this.aZV - this.start < 100000L)
              {
                this.aZV = this.start;
                l1 = this.start;
                break;
                this.start = (paramf.getPosition() + j);
                this.aZW = this.aZP.bam;
                if (this.aZV - this.start + j < 100000L)
                {
                  paramf.dG(j);
                  l1 = -(this.aZW + 2L);
                  break;
                }
              }
            if (l2 <= 0L)
              i = 2;
            l1 = i * j;
            l1 = Math.min(Math.max(paramf.getPosition() - l1 + l2 * (this.aZV - this.start) / (this.aZX - this.aZW), this.start), this.aZV - 1L);
          }
          else
          {
            paramf.dG(j);
            l1 = -(this.aZP.bam + 2L);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.e.a
 * JD-Core Version:    0.6.2
 */