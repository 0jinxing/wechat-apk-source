package com.bumptech.glide.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public final class d extends InputStream
{
  private static final Queue<d> aHY;
  private InputStream aHZ;
  public IOException aIa;

  static
  {
    AppMethodBeat.i(92576);
    aHY = j.dn(0);
    AppMethodBeat.o(92576);
  }

  public static d e(InputStream paramInputStream)
  {
    AppMethodBeat.i(92565);
    synchronized (aHY)
    {
      d locald = (d)aHY.poll();
      ??? = locald;
      if (locald == null)
        ??? = new d();
      ((d)???).aHZ = paramInputStream;
      AppMethodBeat.o(92565);
      return ???;
    }
  }

  public final int available()
  {
    AppMethodBeat.i(92566);
    int i = this.aHZ.available();
    AppMethodBeat.o(92566);
    return i;
  }

  public final void close()
  {
    AppMethodBeat.i(92567);
    this.aHZ.close();
    AppMethodBeat.o(92567);
  }

  public final void mark(int paramInt)
  {
    AppMethodBeat.i(92568);
    this.aHZ.mark(paramInt);
    AppMethodBeat.o(92568);
  }

  public final boolean markSupported()
  {
    AppMethodBeat.i(92569);
    boolean bool = this.aHZ.markSupported();
    AppMethodBeat.o(92569);
    return bool;
  }

  public final int read()
  {
    AppMethodBeat.i(92574);
    try
    {
      i = this.aHZ.read();
      AppMethodBeat.o(92574);
      return i;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        this.aIa = localIOException;
        int i = -1;
      }
    }
  }

  public final int read(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(92570);
    try
    {
      i = this.aHZ.read(paramArrayOfByte);
      AppMethodBeat.o(92570);
      return i;
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
      {
        this.aIa = paramArrayOfByte;
        int i = -1;
      }
    }
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(92571);
    try
    {
      paramInt1 = this.aHZ.read(paramArrayOfByte, paramInt1, paramInt2);
      AppMethodBeat.o(92571);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
      {
        this.aIa = paramArrayOfByte;
        paramInt1 = -1;
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(92575);
    this.aIa = null;
    this.aHZ = null;
    synchronized (aHY)
    {
      aHY.offer(this);
      AppMethodBeat.o(92575);
      return;
    }
  }

  public final void reset()
  {
    try
    {
      AppMethodBeat.i(92572);
      this.aHZ.reset();
      AppMethodBeat.o(92572);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final long skip(long paramLong)
  {
    AppMethodBeat.i(92573);
    try
    {
      paramLong = this.aHZ.skip(paramLong);
      AppMethodBeat.o(92573);
      return paramLong;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        this.aIa = localIOException;
        paramLong = 0L;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.h.d
 * JD-Core Version:    0.6.2
 */