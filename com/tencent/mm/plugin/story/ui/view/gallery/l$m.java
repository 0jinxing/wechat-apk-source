package com.tencent.mm.plugin.story.ui.view.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.api.j;
import com.tencent.mm.plugin.story.f.h;
import com.tencent.mm.plugin.story.model.i;
import com.tencent.mm.plugin.story.model.i.a.b;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.ArrayList;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$postListener$1", "Lcom/tencent/mm/plugin/story/api/IStoryPostListener;", "onPostEnd", "", "localId", "", "isOk", "", "onPostNotify", "onPostStart", "plugin-story_release"})
public final class l$m
  implements j
{
  public final void EI(int paramInt)
  {
    AppMethodBeat.i(110815);
    Object localObject = l.spJ;
    ab.i(l.access$getTAG$cp(), "onPostStart ".concat(String.valueOf(paramInt)));
    if (l.j(this.spK))
      if (l.k(this.spK))
      {
        this.spK.setNeedReset(true);
        AppMethodBeat.o(110815);
      }
    while (true)
    {
      return;
      localObject = l.l(this.spK);
      if (localObject != null)
        ((h)localObject).czC();
      if ((l.h(this.spK).size() == 1) && (((ArrayList)l.h(this.spK).get(0)).size() > 0))
        this.spK.setCurrentHItem(0);
      if ((l.h(this.spK).size() == 1) && (((ArrayList)l.h(this.spK).get(0)).size() == 1))
        al.d((Runnable)new l.m.a(this, paramInt));
      AppMethodBeat.o(110815);
    }
  }

  public final void cwW()
  {
    AppMethodBeat.i(110816);
    Object localObject = i.rSv;
    d.post((Runnable)i.a.b.rSx, "Story_cleanAudioFile");
    if (l.j(this.spK))
      if (l.k(this.spK))
      {
        this.spK.setNeedReset(true);
        AppMethodBeat.o(110816);
      }
    while (true)
    {
      return;
      localObject = l.l(this.spK);
      if (localObject != null)
      {
        ((h)localObject).czC();
        AppMethodBeat.o(110816);
      }
      else
      {
        AppMethodBeat.o(110816);
      }
    }
  }

  public final void cwX()
  {
    AppMethodBeat.i(110814);
    if (l.j(this.spK))
    {
      h localh = l.l(this.spK);
      if (localh != null)
      {
        localh.czC();
        AppMethodBeat.o(110814);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110814);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l.m
 * JD-Core Version:    0.6.2
 */