package com.tencent.mm.plugin.story.ui.view.gallery;

import android.support.v7.widget.RecyclerView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class l$n
  implements Runnable
{
  l$n(l paraml, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110817);
    Object localObject = l.spJ;
    ab.d(l.access$getTAG$cp(), "setCurrentHItem=" + l.g(this.spK) + " galleryGroups.size=" + l.h(this.spK).size() + " galleryGroups[selectedRow].size=" + ((ArrayList)l.h(this.spK).get(l.g(this.spK))).size() + " hRecyclerView=" + l.i(this.spK));
    localObject = l.i(this.spK);
    if (localObject != null)
    {
      ((RecyclerView)localObject).bY(this.exi);
      AppMethodBeat.o(110817);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110817);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l.n
 * JD-Core Version:    0.6.2
 */