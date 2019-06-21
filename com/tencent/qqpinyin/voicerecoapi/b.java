package com.tencent.qqpinyin.voicerecoapi;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends Exception
{
  private String hAa;
  private int mErrorCode;

  public b(int paramInt)
  {
    AppMethodBeat.i(35441);
    this.hAa = "";
    this.mErrorCode = paramInt;
    String str;
    switch (paramInt)
    {
    default:
      str = "unknown error";
    case -101:
    case -100:
    case -102:
    case -103:
    case -104:
    }
    while (true)
    {
      this.hAa = str;
      new StringBuilder("errorCode: ").append(this.mErrorCode).append("\t msg: ").append(this.hAa);
      AppMethodBeat.o(35441);
      return;
      str = "speex engine error";
      continue;
      str = "out of memory";
      continue;
      str = "should init at first";
      continue;
      str = "already init";
      continue;
      str = "null param or 0 length";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqpinyin.voicerecoapi.b
 * JD-Core Version:    0.6.2
 */