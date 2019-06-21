package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class l$m$a
  implements Runnable
{
  l$m$a(l.m paramm, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110813);
    Object localObject = g.RP();
    j.o(localObject, "MMKernel.storage()");
    boolean bool = ((e)localObject).Ry().getBoolean(ac.a.xWM, true);
    localObject = l.spJ;
    ab.i(l.access$getTAG$cp(), "onPostStart " + this.rXD + " and ret " + bool);
    if (bool)
    {
      this.spS.spK.setFirstPost(true);
      this.spS.spK.K(true, false);
    }
    AppMethodBeat.o(110813);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l.m.a
 * JD-Core Version:    0.6.2
 */