package com.google.android.exoplayer2.h;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class p
  implements f
{
  private final u<? super p> bpJ;
  private long bpK;
  private RandomAccessFile bqD;
  private boolean opened;
  private Uri uri;

  public p()
  {
    this(null);
  }

  public p(u<? super p> paramu)
  {
    this.bpJ = paramu;
  }

  public final long a(i parami)
  {
    AppMethodBeat.i(95835);
    while (true)
    {
      try
      {
        this.uri = parami.uri;
        RandomAccessFile localRandomAccessFile = new java/io/RandomAccessFile;
        localRandomAccessFile.<init>(parami.uri.getPath(), "r");
        this.bqD = localRandomAccessFile;
        this.bqD.seek(parami.position);
        if (parami.bgY == -1L)
        {
          l = this.bqD.length() - parami.position;
          this.bpK = l;
          if (this.bpK >= 0L)
            break;
          parami = new java/io/EOFException;
          parami.<init>();
          AppMethodBeat.o(95835);
          throw parami;
        }
      }
      catch (IOException parami)
      {
        parami = new p.a(parami);
        AppMethodBeat.o(95835);
        throw parami;
      }
      l = parami.bgY;
    }
    this.opened = true;
    if (this.bpJ != null)
      this.bpJ.tq();
    long l = this.bpK;
    AppMethodBeat.o(95835);
    return l;
  }

  public final void close()
  {
    AppMethodBeat.i(95837);
    this.uri = null;
    while (true)
    {
      try
      {
        if (this.bqD != null)
          this.bqD.close();
        return;
      }
      catch (IOException localIOException)
      {
        p.a locala = new com/google/android/exoplayer2/h/p$a;
        locala.<init>(localIOException);
        AppMethodBeat.o(95837);
        throw locala;
      }
      finally
      {
        this.bqD = null;
        if (this.opened)
        {
          this.opened = false;
          if (this.bpJ != null)
            this.bpJ.tr();
        }
        AppMethodBeat.o(95837);
      }
      AppMethodBeat.o(95837);
    }
  }

  public final Uri getUri()
  {
    return this.uri;
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95836);
    if (paramInt2 == 0)
    {
      paramInt1 = 0;
      AppMethodBeat.o(95836);
    }
    while (true)
    {
      return paramInt1;
      if (this.bpK == 0L)
      {
        paramInt1 = -1;
        AppMethodBeat.o(95836);
      }
      else
      {
        try
        {
          paramInt1 = this.bqD.read(paramArrayOfByte, paramInt1, (int)Math.min(this.bpK, paramInt2));
          if (paramInt1 > 0)
          {
            this.bpK -= paramInt1;
            if (this.bpJ != null)
              this.bpJ.eK(paramInt1);
          }
          AppMethodBeat.o(95836);
        }
        catch (IOException paramArrayOfByte)
        {
          paramArrayOfByte = new p.a(paramArrayOfByte);
          AppMethodBeat.o(95836);
        }
      }
    }
    throw paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.p
 * JD-Core Version:    0.6.2
 */