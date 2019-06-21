package com.tencent.mm.plugin.music.d;

import com.google.android.exoplayer2.e;
import com.google.android.exoplayer2.e.b.a;
import com.google.android.exoplayer2.f.a;
import com.google.android.exoplayer2.h.r.c;
import com.google.android.exoplayer2.h.r.e;
import com.google.android.exoplayer2.p;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

final class a$a
  implements f.a
{
  private a$a(a parama)
  {
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(137479);
    ab.printErrStackTrace("MicroMsg.Music.ExoMusicPlayer", parame, "playerFailed [" + this.oLO.bTJ() + "]", new Object[0]);
    a locala = this.oLO;
    Object localObject;
    if (parame != null)
    {
      localObject = parame.getCause();
      if (localObject == null)
        break label348;
      if (!(localObject instanceof r.c))
        break label283;
      if (((Throwable)localObject).toString().contains("Unable to connect"))
      {
        boolean bool = at.isNetworkConnected(ah.getContext());
        ab.e("MicroMsg.Music.ExoMusicPlayer", "ExoPlaybackException hasNetwork=" + bool + " caused by:\n" + ((Throwable)localObject).toString());
        if (!bool)
        {
          locala.eF(-4000, -2);
          AppMethodBeat.o(137479);
        }
        while (true)
        {
          return;
          locala.eF(-4000, -3);
          AppMethodBeat.o(137479);
        }
      }
      if ((localObject instanceof r.e))
      {
        localObject = ((Throwable)localObject).toString();
        if (!((String)localObject).contains("403"))
          break label208;
        locala.eF(-4000, -10);
      }
    }
    label283: 
    while (true)
    {
      ab.printErrStackTrace("MicroMsg.Music.ExoMusicPlayer", parame, "ExoPlaybackException", new Object[0]);
      AppMethodBeat.o(137479);
      break;
      label208: if (((String)localObject).contains("404"))
      {
        locala.eF(-4000, -11);
      }
      else if (((String)localObject).contains("500"))
      {
        locala.eF(-4000, -12);
      }
      else if (((String)localObject).contains("502"))
      {
        locala.eF(-4000, -13);
      }
      else
      {
        locala.eF(-4000, -30);
        continue;
        if ((localObject instanceof q))
        {
          locala.eF(-4001, -1);
        }
        else if ((localObject instanceof IllegalStateException))
        {
          locala.eF(-4002, -1);
        }
        else if ((localObject instanceof b.a))
        {
          locala.eF(-4003, -1);
        }
        else
        {
          locala.eF(-4999, -1);
          continue;
          label348: locala.eF(-4999, -1);
        }
      }
    }
  }

  public final void a(p paramp)
  {
    AppMethodBeat.i(137481);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "playbackParameters " + String.format("[speed=%.2f, pitch=%.2f]", new Object[] { Float.valueOf(paramp.speed), Float.valueOf(paramp.pitch) }));
    AppMethodBeat.o(137481);
  }

  public final void aH(boolean paramBoolean)
  {
    AppMethodBeat.i(137477);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "loading [" + paramBoolean + "]");
    AppMethodBeat.o(137477);
  }

  public final void c(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(137478);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "state [" + this.oLO.bTJ() + ", " + paramBoolean + ", " + com.tencent.mm.plugin.music.f.b.a.zT(paramInt) + "]");
    a locala = this.oLO;
    int i;
    if (locala.oLD != null)
    {
      paramBoolean = locala.oLD.pP();
      i = locala.oLD.pO();
      if ((paramBoolean) && (i == 3))
      {
        ab.i("MicroMsg.Music.ExoMusicPlayer", "onStart");
        if (locala.oLM != null)
          locala.oLM.bTL();
        paramInt = a.f.z(paramBoolean, i);
        if (paramInt == locala.oLI.oLP[3])
          break label598;
        ab.i("MicroMsg.Music.ExoMusicPlayer", "setMostRecentState [" + paramBoolean + "," + i + "]");
        locala.oLI.y(paramBoolean, i);
        if (paramInt != a.f.z(true, 4))
          break label312;
        ab.i("MicroMsg.Music.ExoMusicPlayer", "onComplete");
        if (locala.oLM != null)
          locala.oLM.bTP();
        AppMethodBeat.o(137478);
      }
    }
    while (true)
    {
      return;
      if ((!paramBoolean) && (i == 3) && (locala.oLC == 2))
      {
        ab.i("MicroMsg.Music.ExoMusicPlayer", "onPause");
        if (locala.oLM == null)
          break;
        locala.oLM.bTM();
        break;
      }
      if ((paramBoolean) || (i != 3) || (locala.oLC != 3))
        break;
      ab.i("MicroMsg.Music.ExoMusicPlayer", "onStop");
      if (locala.oLM == null)
        break;
      locala.oLM.bTN();
      break;
      label312: if (locala.oLI.b(new int[] { a.f.z(false, 1), a.f.z(false, 2), a.f.z(false, 3) }, false))
      {
        ab.i("MicroMsg.Music.ExoMusicPlayer", "onPrepared");
        if (locala.oLM != null)
          locala.oLM.bTK();
        AppMethodBeat.o(137478);
      }
      else if ((locala.oLI.b(new int[] { 100, 2, 3 }, true) | locala.oLI.b(new int[] { 2, 100, 3 }, true) | locala.oLI.b(new int[] { 100, 3, 2, 3 }, true)))
      {
        ab.i("MicroMsg.Music.ExoMusicPlayer", "onSeekComplete");
        if (locala.oLM != null)
          locala.oLM.bTO();
        AppMethodBeat.o(137478);
      }
      else if (locala.oLI.b(new int[] { a.f.z(true, 3), a.f.z(true, 2) }, false))
      {
        ab.i("MicroMsg.Music.ExoMusicPlayer", "MEDIA_INFO_BUFFERING_START");
        locala.eG(701, locala.getDownloadPercent());
        AppMethodBeat.o(137478);
      }
      else
      {
        if (locala.oLI.b(new int[] { a.f.z(true, 2), a.f.z(true, 3) }, false))
        {
          ab.i("MicroMsg.Music.ExoMusicPlayer", "MEDIA_INFO_BUFFERING_END");
          locala.eG(702, locala.getDownloadPercent());
        }
        label598: AppMethodBeat.o(137478);
      }
    }
  }

  public final void qe()
  {
    AppMethodBeat.i(137480);
    ab.i("MicroMsg.Music.ExoMusicPlayer", "positionDiscontinuity");
    AppMethodBeat.o(137480);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.d.a.a
 * JD-Core Version:    0.6.2
 */