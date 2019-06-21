package com.tencent.mm.audio.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ay.a;

final class a$4$1$1$1
  implements ay.a
{
  a$4$1$1$1(a.4.1.1 param1)
  {
  }

  public final void EA()
  {
    AppMethodBeat.i(116452);
    ab.i("MicroMsg.SceneVoicePlayer", "play sound end onCompletion");
    if (!this.coJ.coI.coH.coE.isPlaying())
    {
      g.KK().b(this.coJ.coI.coH.coE);
      ab.i("MicroMsg.SceneVoicePlayer", "onCompletion() continuousPlay:%s", new Object[] { Boolean.valueOf(a.m(this.coJ.coI.coH.coE)) });
      if (!a.m(this.coJ.coI.coH.coE))
        g.KK().KN();
      a.n(this.coJ.coI.coH.coE);
      a.c(this.coJ.coI.coH.coE);
      g.KK().setMode(0);
      ab.i("MicroMsg.SceneVoicePlayer", "onCompletion() abandon focus, needFocusOnPlay: %s, hasAudioFocus: %s", new Object[] { Boolean.valueOf(a.d(this.coJ.coI.coH.coE)), Boolean.valueOf(a.e(this.coJ.coI.coH.coE)) });
      if (a.e(this.coJ.coI.coH.coE))
      {
        a.f(this.coJ.coI.coH.coE).Mm();
        a.g(this.coJ.coI.coH.coE);
      }
      ab.i("MicroMsg.SceneVoicePlayer", "onCompletion() resetSpeaker");
    }
    AppMethodBeat.o(116452);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.a.a.4.1.1.1
 * JD-Core Version:    0.6.2
 */