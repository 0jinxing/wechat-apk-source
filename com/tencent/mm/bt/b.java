package com.tencent.mm.bt;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;

public final class b
{
  public byte[] wR;

  private b()
  {
  }

  public b(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, 0, paramArrayOfByte.length);
    AppMethodBeat.i(51823);
    AppMethodBeat.o(51823);
  }

  public b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51824);
    this.wR = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, this.wR, 0, paramInt2);
    AppMethodBeat.o(51824);
  }

  public static b akB(String paramString)
  {
    AppMethodBeat.i(51827);
    try
    {
      b localb = new com/tencent/mm/bt/b;
      localb.<init>();
      localb.wR = paramString.getBytes("UTF-8");
      AppMethodBeat.o(51827);
      return localb;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString = new RuntimeException("UTF-8 not supported?", paramString);
      AppMethodBeat.o(51827);
    }
    throw paramString;
  }

  public static b bI(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(51826);
    if (paramArrayOfByte != null);
    while (true)
    {
      paramArrayOfByte = new b(paramArrayOfByte);
      AppMethodBeat.o(51826);
      return paramArrayOfByte;
      paramArrayOfByte = new byte[0];
    }
  }

  public static b y(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51825);
    paramArrayOfByte = new b(paramArrayOfByte, paramInt1, paramInt2);
    AppMethodBeat.o(51825);
    return paramArrayOfByte;
  }

  public final b Lv(int paramInt)
  {
    AppMethodBeat.i(51828);
    byte[] arrayOfByte = new byte[paramInt];
    if (this.wR.length >= paramInt)
      System.arraycopy(this.wR, 0, arrayOfByte, 0, paramInt - 1);
    for (this.wR = arrayOfByte; ; this.wR = arrayOfByte)
    {
      AppMethodBeat.o(51828);
      return this;
      System.arraycopy(this.wR, 0, arrayOfByte, 0, this.wR.length);
    }
  }

  public final void bJ(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(51829);
    System.arraycopy(this.wR, 0, paramArrayOfByte, 4, this.wR.length);
    AppMethodBeat.o(51829);
  }

  public final String dlY()
  {
    int i = 0;
    AppMethodBeat.i(51832);
    try
    {
      while (true)
      {
        if (i >= this.wR.length);
        int j;
        do
        {
          String str = new String(this.wR, 0, i, "UTF-8");
          AppMethodBeat.o(51832);
          return str;
          j = this.wR[i];
        }
        while (j == 0);
        i++;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      RuntimeException localRuntimeException = new RuntimeException("UTF-8 not supported?");
      AppMethodBeat.o(51832);
      throw localRuntimeException;
    }
  }

  public final void f(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(51830);
    System.arraycopy(this.wR, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
    AppMethodBeat.o(51830);
  }

  public final byte[] getBytes()
  {
    return this.wR;
  }

  public final byte[] toByteArray()
  {
    AppMethodBeat.i(51831);
    int i = this.wR.length;
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(this.wR, 0, arrayOfByte, 0, i);
    AppMethodBeat.o(51831);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bt.b
 * JD-Core Version:    0.6.2
 */