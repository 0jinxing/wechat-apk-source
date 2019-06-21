package com.tencent.mm.plugin.music.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;

final class f$1
  implements c
{
  f$1(f paramf)
  {
  }

  public final void Lu(String paramString)
  {
    AppMethodBeat.i(137268);
    h localh = this.oJW.SB(paramString);
    if (localh == null)
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "onStop player is null");
      AppMethodBeat.o(137268);
    }
    while (true)
    {
      return;
      this.oJW.b(paramString, localh);
      this.oJW.f(paramString, localh);
      f.a(this.oJW);
      this.oJW.bSD();
      f.a(this.oJW, paramString);
      this.oJW.SM(paramString);
      AppMethodBeat.o(137268);
    }
  }

  public final void Ss(String paramString)
  {
    AppMethodBeat.i(137267);
    h localh = this.oJW.SB(paramString);
    if (localh == null)
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "onPause player is null");
      AppMethodBeat.o(137267);
    }
    while (true)
    {
      return;
      this.oJW.b(paramString, localh);
      this.oJW.f(paramString, localh);
      f.a(this.oJW);
      this.oJW.bSD();
      AppMethodBeat.o(137267);
    }
  }

  public final void dO(String paramString)
  {
    AppMethodBeat.i(137269);
    h localh = this.oJW.SB(paramString);
    if (localh == null)
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "onComplete player is null");
      AppMethodBeat.o(137269);
    }
    while (true)
    {
      return;
      this.oJW.b(paramString, localh);
      this.oJW.f(paramString, localh);
      f.a(this.oJW);
      this.oJW.bSD();
      f.a(this.oJW, paramString);
      this.oJW.SM(paramString);
      AppMethodBeat.o(137269);
    }
  }

  public final void onError(String paramString)
  {
    AppMethodBeat.i(137270);
    h localh = this.oJW.SB(paramString);
    if (localh == null)
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "onError player is null");
      AppMethodBeat.o(137270);
      return;
    }
    this.oJW.b(paramString, localh);
    f localf = this.oJW;
    int i = localh.lqz;
    if (localf.oJF.containsKey(paramString));
    for (int j = ((Integer)localf.oJF.get(paramString)).intValue(); ; j = 0)
    {
      if (j > 0)
      {
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "try it one time, don't try again");
        localf.oJF.remove(paramString);
      }
      label99: for (j = 0; ; j = 1)
      {
        if (j == 0)
          break label188;
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "try to stop same url players and play again");
        this.oJW.bSH();
        this.oJW.b(paramString, null);
        AppMethodBeat.o(137270);
        break;
        if (66 != i)
        {
          localf.oJF.remove(paramString);
          break label99;
        }
        if (!localf.SL(paramString))
          break label99;
        localf.oJF.put(paramString, Integer.valueOf(j + 1));
      }
      label188: ab.e("MicroMsg.Audio.AudioPlayerMgr", "not try to play again");
      this.oJW.f(paramString, localh);
      f.a(this.oJW);
      this.oJW.bSD();
      AppMethodBeat.o(137270);
      break;
    }
  }

  public final void onStart(String arg1)
  {
    AppMethodBeat.i(137266);
    h localh = this.oJW.SB(???);
    if (localh == null)
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "onStart player is null");
      AppMethodBeat.o(137266);
    }
    while (true)
    {
      return;
      this.oJW.e(???, localh);
      synchronized (this.oJW.lrj)
      {
        this.oJW.oJH = false;
        al.af(this.oJW.oJT);
        AppMethodBeat.o(137266);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.f.1
 * JD-Core Version:    0.6.2
 */