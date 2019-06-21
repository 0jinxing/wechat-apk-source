package com.tencent.mm.plugin.music.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.e;
import com.tencent.mm.plugin.music.c.b.b;
import com.tencent.mm.plugin.music.e.k;
import com.tencent.mm.plugin.music.h.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class d$2
  implements b.b
{
  d$2(d paramd)
  {
  }

  public final void zD(int paramInt)
  {
    AppMethodBeat.i(137584);
    d locald;
    if (paramInt == 1)
    {
      if ((this.oNF.oNh == null) || (this.oNF.oKe) || (this.oNF.oNA == null))
        break label239;
      String str = com.tencent.mm.plugin.music.h.b.aW(this.oNF.oNh.oLt.fJU, this.oNF.oNh.mgU);
      this.oNF.oNA.Tr(str);
      locald = this.oNF;
      if (k.bUh().requestFocus())
        ab.i("MicroMsg.Music.MusicPlayer", "startPlay");
    }
    while (true)
    {
      try
      {
        if (locald.oNA != null)
          locald.oNA.play();
        locald.oKe = true;
        locald.oNB = false;
        AppMethodBeat.o(137584);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "startPlay", new Object[0]);
        continue;
      }
      ab.e("MicroMsg.Music.MusicPlayer", "request focus error");
      AppMethodBeat.o(137584);
      continue;
      if ((paramInt == -2) || (paramInt == 5) || (paramInt == 19))
      {
        al.d(new d.2.1(this, paramInt));
        AppMethodBeat.o(137584);
      }
      else
      {
        if ((paramInt == -1) || (paramInt == 6) || (paramInt == 4))
        {
          al.d(new d.2.2(this));
          d.a(this.oNF, this.oNF.oLA, paramInt);
        }
        label239: AppMethodBeat.o(137584);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.d.2
 * JD-Core Version:    0.6.2
 */