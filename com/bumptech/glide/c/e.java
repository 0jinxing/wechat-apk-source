package com.bumptech.glide.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

public final class e extends IOException
{
  private final int statusCode;

  public e(int paramInt)
  {
    this("Http request failed with status code: ".concat(String.valueOf(paramInt)), paramInt);
    AppMethodBeat.i(91673);
    AppMethodBeat.o(91673);
  }

  public e(String paramString)
  {
    this(paramString, -1);
  }

  public e(String paramString, int paramInt)
  {
    this(paramString, paramInt, (byte)0);
  }

  private e(String paramString, int paramInt, byte paramByte)
  {
    super(paramString, null);
    this.statusCode = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.e
 * JD-Core Version:    0.6.2
 */