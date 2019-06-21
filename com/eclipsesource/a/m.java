package com.eclipsesource.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Writer;

final class m extends Writer
{
  private final char[] aLx;
  private int aLz;
  private final Writer writer;

  m(Writer paramWriter)
  {
    AppMethodBeat.i(70608);
    this.aLz = 0;
    this.writer = paramWriter;
    this.aLx = new char[''];
    AppMethodBeat.o(70608);
  }

  public final void close()
  {
  }

  public final void flush()
  {
    AppMethodBeat.i(70612);
    this.writer.write(this.aLx, 0, this.aLz);
    this.aLz = 0;
    AppMethodBeat.o(70612);
  }

  public final void write(int paramInt)
  {
    AppMethodBeat.i(70609);
    if (this.aLz > this.aLx.length - 1)
      flush();
    char[] arrayOfChar = this.aLx;
    int i = this.aLz;
    this.aLz = (i + 1);
    arrayOfChar[i] = ((char)(char)paramInt);
    AppMethodBeat.o(70609);
  }

  public final void write(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(70611);
    if (this.aLz > this.aLx.length - paramInt2)
    {
      flush();
      if (paramInt2 > this.aLx.length)
      {
        this.writer.write(paramString, paramInt1, paramInt2);
        AppMethodBeat.o(70611);
      }
    }
    while (true)
    {
      return;
      paramString.getChars(paramInt1, paramInt1 + paramInt2, this.aLx, this.aLz);
      this.aLz += paramInt2;
      AppMethodBeat.o(70611);
    }
  }

  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(70610);
    if (this.aLz > this.aLx.length - paramInt2)
    {
      flush();
      if (paramInt2 > this.aLx.length)
      {
        this.writer.write(paramArrayOfChar, paramInt1, paramInt2);
        AppMethodBeat.o(70610);
      }
    }
    while (true)
    {
      return;
      System.arraycopy(paramArrayOfChar, paramInt1, this.aLx, this.aLz, paramInt2);
      this.aLz += paramInt2;
      AppMethodBeat.o(70610);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.eclipsesource.a.m
 * JD-Core Version:    0.6.2
 */