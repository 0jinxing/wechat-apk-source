package com.tencent.mm.ui.chatting.gallery;

import android.util.SparseArray;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class j$14
  implements ap.a
{
  j$14(j paramj)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(32329);
    boolean bool;
    if (this.yWZ.yTG == null)
    {
      ab.w("MicroMsg.Imagegallery.handler.video", "[onTimerExpired] null == adapter");
      AppMethodBeat.o(32329);
      bool = false;
    }
    while (true)
    {
      return bool;
      k localk = this.yWZ.yTG.dFP();
      if (localk == null)
      {
        AppMethodBeat.o(32329);
        bool = false;
      }
      else if (localk.yXm == null)
      {
        AppMethodBeat.o(32329);
        bool = false;
      }
      else if (localk.dGH().yXm.getVisibility() != 0)
      {
        AppMethodBeat.o(32329);
        bool = false;
      }
      else
      {
        int i = this.yWZ.yTG.yTI.getCurrentItem();
        if ((s)this.yWZ.yWJ.get(i) == null)
        {
          this.yWZ.Pf(i);
          AppMethodBeat.o(32329);
          bool = false;
        }
        else if (!localk.dGH().yXp.isPlaying())
        {
          ab.i("MicroMsg.Imagegallery.handler.video", "it is not playing, stop offline timer");
          AppMethodBeat.o(32329);
          bool = false;
        }
        else
        {
          j.a(this.yWZ, localk.dGH().yXp.getCurrentPosition());
          this.yWZ.Pg(j.n(this.yWZ) / 1000);
          bool = true;
          AppMethodBeat.o(32329);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.j.14
 * JD-Core Version:    0.6.2
 */