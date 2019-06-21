package com.tencent.mm.plugin.music.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.music.f.c.b;
import com.tencent.mm.plugin.music.model.d;
import com.tencent.mm.plugin.music.model.e.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.z;

final class MusicMainUI$3$3
  implements Runnable
{
  MusicMainUI$3$3(MusicMainUI.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(105093);
    MusicMainUI localMusicMainUI = this.oPb.oOZ;
    if (((Boolean)g.RP().Ry().get(82, Boolean.TRUE)).booleanValue())
    {
      g.RP().Ry().set(82, Boolean.FALSE);
      switch (((com.tencent.mm.plugin.music.e.e)b.ar(com.tencent.mm.plugin.music.e.e.class)).bTU().field_musicType)
      {
      case 2:
      case 3:
      case 5:
      case 7:
      default:
      case 0:
      case 6:
      case 4:
      case 1:
      case 8:
      }
    }
    while (true)
    {
      MusicMainUI.k(this.oPb.oOZ);
      AppMethodBeat.o(105093);
      return;
      d.S(localMusicMainUI, 2131303402);
      continue;
      d.S(localMusicMainUI, 2131303403);
      continue;
      d.S(localMusicMainUI, 2131303404);
      continue;
      d.S(localMusicMainUI, 2131303405);
      continue;
      if (((com.tencent.mm.plugin.music.e.e)b.ar(com.tencent.mm.plugin.music.e.e.class)).getMode() == 2)
        Toast.makeText(ah.getContext(), 2131303985, 0).show();
      else
        Toast.makeText(ah.getContext(), 2131303986, 0).show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicMainUI.3.3
 * JD-Core Version:    0.6.2
 */