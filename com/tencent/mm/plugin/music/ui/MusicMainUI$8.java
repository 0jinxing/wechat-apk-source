package com.tencent.mm.plugin.music.ui;

import android.content.Intent;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.f.a.d.a;
import com.tencent.mm.sdk.platformtools.ak;

final class MusicMainUI$8
  implements d.a
{
  MusicMainUI$8(MusicMainUI paramMusicMainUI)
  {
  }

  public final void dN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105103);
    if ((MusicMainUI.m(this.oOZ) == 1) && (!MusicMainUI.n(this.oOZ)))
    {
      float f = this.oOZ.getIntent().getFloatExtra("key_offset", 0.0F);
      long l = this.oOZ.getIntent().getLongExtra("music_player_beg_time", 0L);
      l = ()(f * 1000.0F + (float)(System.currentTimeMillis() - l));
      if (l >= 0L)
        MusicMainUI.i(this.oOZ).T(MusicMainUI.j(this.oOZ).getCurrentItem(), l + 200L);
    }
    while (true)
    {
      Message localMessage = new Message();
      localMessage.what = 1;
      MusicMainUI.o(this.oOZ).sendMessage(localMessage);
      AppMethodBeat.o(105103);
      return;
      if ((paramInt1 >= 0) && (paramInt2 > 0))
        MusicMainUI.i(this.oOZ).T(MusicMainUI.j(this.oOZ).getCurrentItem(), paramInt1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicMainUI.8
 * JD-Core Version:    0.6.2
 */