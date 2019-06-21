package com.tencent.mm.plugin.music.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.g.a.ke.a;
import com.tencent.mm.plugin.music.model.e;
import com.tencent.mm.plugin.music.model.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class MusicMainUI$3$4
  implements Runnable
{
  MusicMainUI$3$4(MusicMainUI.3 param3, ke paramke)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(105094);
    b localb = MusicMainUI.i(this.oPb.oOZ);
    String str = this.oPa.cFH.cFI;
    Iterator localIterator = localb.oOu.entrySet().iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      b.a locala = (b.a)((View)((Map.Entry)localIterator.next()).getValue()).getTag();
      if (!locala.oMw.field_musicId.equals(str))
        break label133;
      locala.d(e.bUk().Tp(str), true);
      i = 1;
    }
    label133: 
    while (true)
    {
      break;
      if (i == 0)
      {
        ab.i("MicroMsg.Music.MusicMainAdapter", "holder song id is not exist, do refresh all");
        localb.notifyDataSetChanged();
      }
      AppMethodBeat.o(105094);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicMainUI.3.4
 * JD-Core Version:    0.6.2
 */