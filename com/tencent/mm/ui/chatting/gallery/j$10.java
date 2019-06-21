package com.tencent.mm.ui.chatting.gallery;

import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.d;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class j$10
  implements Runnable
{
  j$10(j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32325);
    j.h(this.yWZ);
    j.a(this.yWZ, j.i(this.yWZ));
    j.d(this.yWZ).cy(false);
    j.j(this.yWZ);
    if (j.c(this.yWZ))
    {
      j.b(this.yWZ, bo.anU());
      j.f(this.yWZ).dGK();
      j.f(this.yWZ).reset();
      j.a(this.yWZ, false);
      j.k(this.yWZ);
    }
    u.f(j.a(this.yWZ), 0, j.c(this.yWZ));
    if (j.l(this.yWZ) != null)
    {
      j.a locala = (j.a)j.l(this.yWZ).get(j.a(this.yWZ));
      if (locala != null)
      {
        k localk = this.yWZ.yTG.dFP();
        localk.dGH().yXp.stop();
        j.a(this.yWZ, 0);
        this.yWZ.a(localk, locala.csG, locala.pos);
        this.yWZ.Pg(0);
        if (localk.dGH().yXx.getVisibility() != 8)
          localk.dGH().yXx.setVisibility(8);
      }
    }
    AppMethodBeat.o(32325);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.j.10
 * JD-Core Version:    0.6.2
 */