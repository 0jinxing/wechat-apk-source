package com.tencent.mm.plugin.story.ui.view.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.sdk.platformtools.ab;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class l$d
  implements Runnable
{
  l$d(l paraml)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110788);
    Object localObject1 = l.A(this.spK);
    if ((localObject1 != null) && (((StoryGalleryItemView)localObject1).getVideoItem() != null))
    {
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      localObject1 = j.a.cxT();
      Object localObject2 = l.A(this.spK);
      if (localObject2 == null)
        a.f.b.j.dWJ();
      localObject2 = ((StoryGalleryItemView)localObject2).getVideoItem();
      if (localObject2 == null)
        a.f.b.j.dWJ();
      int i = k.b((k)localObject1, ((i)localObject2).rUJ);
      localObject1 = l.spJ;
      localObject1 = l.access$getTAG$cp();
      localObject2 = new StringBuilder("storyId :");
      Object localObject3 = l.A(this.spK);
      if (localObject3 == null)
        a.f.b.j.dWJ();
      localObject3 = ((StoryGalleryItemView)localObject3).getVideoItem();
      if (localObject3 == null)
        a.f.b.j.dWJ();
      ab.i((String)localObject1, ((i)localObject3).rUJ + " read times + 1  ,result:" + i);
      AppMethodBeat.o(110788);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110788);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l.d
 * JD-Core Version:    0.6.2
 */