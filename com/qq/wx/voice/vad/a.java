package com.qq.wx.voice.vad;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintStream;

public final class a
{
  public static boolean DEBUG = false;
  public static boolean bCE = false;
  public EVadNative bCC;
  public MMVoipVadNative bCD;
  public long handle;

  public a()
  {
    AppMethodBeat.i(93970);
    this.handle = 0L;
    this.bCC = new EVadNative();
    this.bCD = new MMVoipVadNative();
    AppMethodBeat.o(93970);
  }

  public static void aU(boolean paramBoolean)
  {
    AppMethodBeat.i(93971);
    bCE = paramBoolean;
    if (paramBoolean)
    {
      System.loadLibrary("MMVoipVadEmbed");
      if (!DEBUG)
        break label57;
      System.out.println("EVad loadLib MMVoipVadEmbed");
      AppMethodBeat.o(93971);
    }
    while (true)
    {
      return;
      System.loadLibrary("EVadEmbed");
      if (DEBUG)
        System.out.println("EVad loadLib EVadEmbed");
      label57: AppMethodBeat.o(93971);
    }
  }

  public final int b(short[] paramArrayOfShort, int paramInt)
  {
    AppMethodBeat.i(93972);
    if (this.handle == 0L)
    {
      paramInt = 1;
      AppMethodBeat.o(93972);
    }
    while (true)
    {
      return paramInt;
      if (DEBUG)
        System.out.println("EVad AddData handle = " + this.handle);
      if (bCE)
      {
        paramInt = this.bCD.AddData(this.handle, paramArrayOfShort, paramInt);
        AppMethodBeat.o(93972);
      }
      else
      {
        paramInt = this.bCC.AddData(this.handle, paramArrayOfShort, paramInt);
        AppMethodBeat.o(93972);
      }
    }
  }

  public final int vU()
  {
    AppMethodBeat.i(93973);
    int i;
    if (this.handle == 0L)
    {
      i = 1;
      AppMethodBeat.o(93973);
    }
    while (true)
    {
      return i;
      if (DEBUG)
        System.out.println("EVad Release handle = " + this.handle);
      if (bCE)
      {
        i = this.bCD.Release(this.handle);
        AppMethodBeat.o(93973);
      }
      else
      {
        i = this.bCC.Release(this.handle);
        AppMethodBeat.o(93973);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.qq.wx.voice.vad.a
 * JD-Core Version:    0.6.2
 */