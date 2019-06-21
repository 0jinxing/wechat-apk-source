package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

final class j$4
  implements Runnable
{
  j$4(j paramj, String paramString, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32319);
    ab.i("MicroMsg.Imagegallery.handler.video", "prepare video filename %s isOnlinePlay %b ", new Object[] { this.qIE, Boolean.valueOf(this.yXa) });
    if (j.l(this.yWZ) == null)
    {
      ab.w("MicroMsg.Imagegallery.handler.video", "prepare video but cache map is null.");
      AppMethodBeat.o(32319);
    }
    while (true)
    {
      return;
      j.a locala = (j.a)j.l(this.yWZ).get(this.qIE);
      if ((locala == null) || (locala.csG == null))
      {
        AppMethodBeat.o(32319);
      }
      else
      {
        s locals = j.bG(locala.csG);
        if (this.yWZ.yTG.yTI.getCurrentItem() == locala.pos)
        {
          j.a(this.yWZ, locala.csG, locals, locala.pos, this.yXa);
          this.yWZ.arz(this.qIE);
          AppMethodBeat.o(32319);
        }
        else
        {
          ab.w("MicroMsg.Imagegallery.handler.video", "playVideo, but currentItem is not correct.[%d, %d]", new Object[] { Integer.valueOf(this.yWZ.yTG.yTI.getCurrentItem()), Integer.valueOf(locala.pos) });
          AppMethodBeat.o(32319);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.j.4
 * JD-Core Version:    0.6.2
 */