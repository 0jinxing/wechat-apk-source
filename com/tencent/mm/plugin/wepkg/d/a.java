package com.tencent.mm.plugin.wepkg.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public final class a extends c
{
  int count;

  public a(InputStream paramInputStream)
  {
    super(paramInputStream);
  }

  public final int dgF()
  {
    try
    {
      int i = this.count;
      this.count = 0;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int read()
  {
    AppMethodBeat.i(63612);
    int i = super.read();
    int j = this.count;
    if (i >= 0);
    for (int k = 1; ; k = 0)
    {
      this.count = (k + j);
      AppMethodBeat.o(63612);
      return i;
    }
  }

  public final int read(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(63610);
    int i = super.read(paramArrayOfByte);
    int j = this.count;
    if (i >= 0);
    for (int k = i; ; k = 0)
    {
      this.count = (k + j);
      AppMethodBeat.o(63610);
      return i;
    }
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(63611);
    paramInt2 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    int i = this.count;
    if (paramInt2 >= 0);
    for (paramInt1 = paramInt2; ; paramInt1 = 0)
    {
      this.count = (paramInt1 + i);
      AppMethodBeat.o(63611);
      return paramInt2;
    }
  }

  public final long skip(long paramLong)
  {
    AppMethodBeat.i(63613);
    paramLong = super.skip(paramLong);
    this.count = ((int)(this.count + paramLong));
    AppMethodBeat.o(63613);
    return paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.d.a
 * JD-Core Version:    0.6.2
 */