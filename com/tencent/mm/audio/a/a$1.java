package com.tencent.mm.audio.a;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.b.a;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a$1
  implements b.a
{
  a$1(a parama)
  {
  }

  public final void gF(int paramInt)
  {
    AppMethodBeat.i(116448);
    ab.i("MicroMsg.SceneVoicePlayer", "on audio focus chage: %s", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt == -2) || (paramInt == -3))
    {
      if (!this.coE.isPlaying())
        break label230;
      ab.v("MicroMsg.SceneVoicePlayer", "alvinluo current fileName: %s, lastFileName: %s", new Object[] { a.a(this.coE), a.access$100() });
      if ((a.a(this.coE) != null) && (!a.a(this.coE).equals(a.access$100())))
        break label230;
      if (bo.gW(((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lJh, 0), 0))
      {
        if ((paramInt != -3) || (!d.iW(26)))
          break label169;
        ab.i("MicroMsg.SceneVoicePlayer", "focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK %s", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
        AppMethodBeat.o(116448);
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.SceneVoicePlayer", "no shield");
      label169: this.coE.bn(false);
      AppMethodBeat.o(116448);
      continue;
      if ((paramInt == 1) || (paramInt == 2) || (paramInt == 3))
      {
        this.coE.Ew();
        AppMethodBeat.o(116448);
      }
      else
      {
        if (paramInt == -1)
          this.coE.stop(false);
        label230: AppMethodBeat.o(116448);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.a.a.1
 * JD-Core Version:    0.6.2
 */