package com.qq.wx.voice.embed.recognizer;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e
{
  g bCA;
  public Grammar bCz;
  byte[] c;
  public boolean d;
  public boolean e;

  public e()
  {
    AppMethodBeat.i(123211);
    this.bCz = null;
    this.bCA = new g();
    this.c = null;
    this.d = false;
    this.e = false;
    this.bCz = new Grammar();
    AppMethodBeat.o(123211);
  }

  public final int a(c paramc, byte[] paramArrayOfByte)
  {
    int i = -302;
    AppMethodBeat.i(123212);
    if (!this.d)
    {
      i = -304;
      AppMethodBeat.o(123212);
    }
    while (true)
    {
      return i;
      if (!this.e)
      {
        AppMethodBeat.o(123212);
      }
      else
      {
        this.bCA.bCB = paramc;
        this.c = paramArrayOfByte;
        if (this.c == null)
        {
          i = -301;
          AppMethodBeat.o(123212);
        }
        else
        {
          try
          {
            paramc = new com/qq/wx/voice/embed/recognizer/e$a;
            paramc.<init>(this, (byte)0);
            paramArrayOfByte = new java/lang/Thread;
            paramArrayOfByte.<init>(paramc);
            paramArrayOfByte.start();
            AppMethodBeat.o(123212);
            i = 0;
          }
          catch (Exception paramc)
          {
            AppMethodBeat.o(123212);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.qq.wx.voice.embed.recognizer.e
 * JD-Core Version:    0.6.2
 */