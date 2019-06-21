package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

final class j$2
  implements b
{
  j$2(j paramj)
  {
  }

  public final void aFw()
  {
    AppMethodBeat.i(32314);
    if (this.yWZ.yTG.dFP() != null)
      j.a(this.yWZ, this.yWZ.yTG.dFP());
    this.yWZ.yTG.yTI.yWv.stopTimer();
    AppMethodBeat.o(32314);
  }

  public final void oA(int paramInt)
  {
    AppMethodBeat.i(32315);
    Object localObject = null;
    try
    {
      String str = this.yWZ.yTG.dFP().dGH().yXp.getVideoPath();
      localObject = str;
      ab.i("MicroMsg.Imagegallery.handler.video", "on seek to time[%d] isOnlinePlay[%b] videoPath[%s]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(j.c(this.yWZ)), localObject });
      if (!bo.isNullOrNil((String)localObject))
        if (!j.c(this.yWZ))
        {
          this.yWZ.ae(paramInt, true);
          bool = true;
          if (bool)
            this.yWZ.cV(false);
          this.yWZ.yTG.yTI.dGk();
          AppMethodBeat.o(32315);
          return;
        }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Imagegallery.handler.video", localException, "", new Object[0]);
        ab.e("MicroMsg.Imagegallery.handler.video", "on seek get video path error: " + localException.toString());
        continue;
        boolean bool = j.f(this.yWZ).aG(paramInt, true);
        continue;
        localObject = this.yWZ.yTG.dFO();
        if ((localObject != null) && (((bi)localObject).bws()))
          u.f(((cy)localObject).field_imgPath, paramInt * 1000, j.c(this.yWZ));
        this.yWZ.yTG.OP(this.yWZ.yTG.yTI.getCurrentItem());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.j.2
 * JD-Core Version:    0.6.2
 */