package com.davemorrissey.labs.subscaleview.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  public String aIm;
  public int errCode;

  public c(int paramInt, String paramString)
  {
    this.errCode = paramInt;
    this.aIm = paramString;
  }

  public final String toString()
  {
    AppMethodBeat.i(115607);
    String str = String.format("ImageDecodeResult{errCode: %d, errMsg: %s}", new Object[] { Integer.valueOf(this.errCode), this.aIm });
    AppMethodBeat.o(115607);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.a.c
 * JD-Core Version:    0.6.2
 */