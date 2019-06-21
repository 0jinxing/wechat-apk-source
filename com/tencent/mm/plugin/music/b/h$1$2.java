package com.tencent.mm.plugin.music.b;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.cache.c;
import com.tencent.mm.plugin.music.cache.e;
import com.tencent.mm.plugin.music.f.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class h$1$2
  implements Runnable
{
  h$1$2(h.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137348);
    if (e.bTG());
    for (boolean bool = ((c)b.ar(c.class)).bTz(); ; bool = false)
    {
      if (bool)
        Toast.makeText(ah.getContext(), ah.getContext().getString(2131301592), 0).show();
      AppMethodBeat.o(137348);
      return;
      ab.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.h.1.2
 * JD-Core Version:    0.6.2
 */