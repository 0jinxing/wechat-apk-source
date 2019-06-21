package com.tencent.mm.plugin.music.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$f
{
  int[] oLP;

  private a$f()
  {
    AppMethodBeat.i(137500);
    this.oLP = new int[] { 1, 1, 1, 1 };
    AppMethodBeat.o(137500);
  }

  static int z(boolean paramBoolean, int paramInt)
  {
    if (paramBoolean);
    for (int i = -268435456; ; i = 0)
      return i | paramInt;
  }

  final boolean b(int[] paramArrayOfInt, boolean paramBoolean)
  {
    int i;
    int k;
    if (paramBoolean)
    {
      i = 268435455;
      int j = this.oLP.length - paramArrayOfInt.length;
      k = j;
      paramBoolean = true;
      label23: if (k >= this.oLP.length)
        break label79;
      if ((this.oLP[k] & i) != (paramArrayOfInt[(k - j)] & i))
        break label73;
    }
    label73: for (boolean bool = true; ; bool = false)
    {
      paramBoolean &= bool;
      k++;
      break label23;
      i = -1;
      break;
    }
    label79: return paramBoolean;
  }

  final void y(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(137501);
    int i = z(paramBoolean, paramInt);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "request setMostRecentState [" + paramBoolean + "," + paramInt + "], lastState=" + this.oLP[3] + ",newState=" + i);
    if (this.oLP[3] == i)
      AppMethodBeat.o(137501);
    while (true)
    {
      return;
      this.oLP[0] = this.oLP[1];
      this.oLP[1] = this.oLP[2];
      this.oLP[2] = this.oLP[3];
      this.oLP[3] = i;
      ab.v("MicroMsg.Music.ExoMusicPlayer", "MostRecentState [" + this.oLP[0] + "," + this.oLP[1] + "," + this.oLP[2] + "," + this.oLP[3] + "]");
      AppMethodBeat.o(137501);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.d.a.f
 * JD-Core Version:    0.6.2
 */