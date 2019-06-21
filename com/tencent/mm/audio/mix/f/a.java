package com.tencent.mm.audio.mix.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.h.b;

public final class a
{
  public static boolean E(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    AppMethodBeat.i(137135);
    if (!gA(paramInt1))
      AppMethodBeat.o(137135);
    while (true)
    {
      return bool;
      if (!gB(paramInt2))
      {
        AppMethodBeat.o(137135);
      }
      else if (!gC(paramInt3))
      {
        AppMethodBeat.o(137135);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(137135);
      }
    }
  }

  private static boolean gA(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(137136);
    if (paramInt <= 0)
    {
      b.e("MicroMsg.Mix.AudioMixConfig", "sampleRate is illegal! %d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(137136);
    }
    while (true)
    {
      return bool;
      if (paramInt == 44100)
      {
        AppMethodBeat.o(137136);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(137136);
      }
    }
  }

  private static boolean gB(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(137137);
    if (paramInt <= 0)
    {
      b.e("MicroMsg.Mix.AudioMixConfig", "channels is illegal, %d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(137137);
    }
    while (true)
    {
      return bool;
      if (paramInt == 2)
      {
        AppMethodBeat.o(137137);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(137137);
      }
    }
  }

  private static boolean gC(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(137138);
    if (paramInt <= 0)
      b.e("MicroMsg.Mix.AudioMixConfig", "encode is illegal, %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == 2)
      AppMethodBeat.o(137138);
    while (true)
    {
      return bool;
      AppMethodBeat.o(137138);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.f.a
 * JD-Core Version:    0.6.2
 */