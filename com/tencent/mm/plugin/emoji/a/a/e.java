package com.tencent.mm.plugin.emoji.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.EmotionSummary;

public final class e
{
  public static boolean a(EmotionSummary paramEmotionSummary)
  {
    AppMethodBeat.i(52797);
    boolean bool;
    if (paramEmotionSummary == null)
    {
      bool = false;
      AppMethodBeat.o(52797);
    }
    while (true)
    {
      return bool;
      bool = dR(paramEmotionSummary.PackFlag, 1);
      AppMethodBeat.o(52797);
    }
  }

  public static boolean b(EmotionSummary paramEmotionSummary)
  {
    AppMethodBeat.i(52798);
    boolean bool;
    if ((c(paramEmotionSummary)) || (d(paramEmotionSummary)))
    {
      bool = true;
      AppMethodBeat.o(52798);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52798);
    }
  }

  private static boolean c(EmotionSummary paramEmotionSummary)
  {
    AppMethodBeat.i(52800);
    boolean bool;
    if (paramEmotionSummary == null)
    {
      bool = false;
      AppMethodBeat.o(52800);
    }
    while (true)
    {
      return bool;
      bool = dR(paramEmotionSummary.PackType, 4);
      AppMethodBeat.o(52800);
    }
  }

  private static boolean d(EmotionSummary paramEmotionSummary)
  {
    AppMethodBeat.i(52801);
    boolean bool;
    if (paramEmotionSummary == null)
    {
      bool = false;
      AppMethodBeat.o(52801);
    }
    while (true)
    {
      return bool;
      bool = dR(paramEmotionSummary.PackType, 8);
      AppMethodBeat.o(52801);
    }
  }

  public static boolean dR(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & paramInt2) == paramInt2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean e(EmotionSummary paramEmotionSummary)
  {
    AppMethodBeat.i(52802);
    boolean bool;
    if (paramEmotionSummary == null)
    {
      bool = false;
      AppMethodBeat.o(52802);
    }
    while (true)
    {
      return bool;
      bool = dR(paramEmotionSummary.PackFlag, 8);
      AppMethodBeat.o(52802);
    }
  }

  public static boolean uc(int paramInt)
  {
    AppMethodBeat.i(52799);
    boolean bool;
    if ((dR(paramInt, 4)) || (dR(paramInt, 8)))
    {
      bool = true;
      AppMethodBeat.o(52799);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52799);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.a.e
 * JD-Core Version:    0.6.2
 */