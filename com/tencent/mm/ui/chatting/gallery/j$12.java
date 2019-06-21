package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;

final class j$12
  implements Runnable
{
  j$12(j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32327);
    try
    {
      if (bo.isNullOrNil(this.yWZ.yTG.dFP().dGH().yXp.getVideoPath()));
      for (int i = u.A(j.f(this.yWZ).fUR, j.a(this.yWZ)); ; i = this.yWZ.yTG.dFP().dGH().yXp.getCurrentPosition() / 1000)
      {
        j.f(this.yWZ).mm(i);
        j.m(this.yWZ).ae(500L, 500L);
        AppMethodBeat.o(32327);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Imagegallery.handler.video", localException, "start timer error[%s]", new Object[] { localException.toString() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.j.12
 * JD-Core Version:    0.6.2
 */