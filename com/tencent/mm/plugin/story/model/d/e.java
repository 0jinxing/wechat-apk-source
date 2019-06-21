package com.tencent.mm.plugin.story.model.d;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.api.o;
import java.util.ArrayList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"getGalleryFilterList", "", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "dataSeed", "Lcom/tencent/mm/plugin/story/api/StoryDataSeed;", "getGalleryType", "Lcom/tencent/mm/plugin/story/api/IStoryUIFactory$GalleryType;", "getGalleryUserList", "", "plugin-story_release"})
public final class e
{
  public static final List<String> a(o paramo)
  {
    AppMethodBeat.i(109308);
    j.p(paramo, "dataSeed");
    if ((paramo instanceof b))
    {
      paramo = ((b)paramo).fxt;
      AppMethodBeat.o(109308);
    }
    while (true)
    {
      return paramo;
      if ((paramo instanceof a))
      {
        paramo = ((a)paramo).fxt;
        AppMethodBeat.o(109308);
      }
      else if ((paramo instanceof c))
      {
        paramo = ((c)paramo).rVW;
        AppMethodBeat.o(109308);
      }
      else
      {
        paramo = (List)new ArrayList();
        AppMethodBeat.o(109308);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.d.e
 * JD-Core Version:    0.6.2
 */