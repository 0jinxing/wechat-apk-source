package com.tencent.mm.g.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.b.b;

public final class u extends b
{
  public u.a csP;

  public u()
  {
    this((byte)0);
  }

  private u(byte paramByte)
  {
    AppMethodBeat.i(137224);
    this.csP = new u.a();
    this.xxG = false;
    this.callback = null;
    AppMethodBeat.o(137224);
  }

  public static String gI(int paramInt)
  {
    String str;
    if (paramInt == 0)
      str = "play";
    while (true)
    {
      return str;
      if (paramInt == 1)
        str = "play";
      else if (paramInt == 2)
        str = "pause";
      else if (paramInt == 3)
        str = "stop";
      else if (paramInt == 4)
        str = "error";
      else if (paramInt == 5)
        str = "ended";
      else if (paramInt == 6)
        str = "seeked";
      else if (paramInt == 7)
        str = "canplay";
      else if (paramInt == 9)
        str = "waiting";
      else if (paramInt == 10)
        str = "seeking";
      else if (paramInt == 11)
        str = "real_play";
      else if (paramInt == 12)
        str = "mix_play_ready";
      else
        str = "";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.a.u
 * JD-Core Version:    0.6.2
 */