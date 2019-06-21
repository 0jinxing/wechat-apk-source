package com.tencent.mm.plugin.story.model.c;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.c.b.a;
import com.tencent.mm.loader.c.e.a;
import com.tencent.mm.loader.f.f;
import com.tencent.mm.plugin.story.c.a.a.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/download/StoryLoader;", "", "()V", "fileNameCreator", "Lcom/tencent/mm/loader/impr/DefaultFileNameCreator;", "mOptionsCommon", "Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;", "mOptionsForAlbum", "mStoryLoader", "Lcom/tencent/mm/loader/Loader;", "Lcom/tencent/mm/plugin/story/model/download/StoryImage;", "loader", "options", "scene", "Lcom/tencent/mm/plugin/story/model/download/LoaderScene;", "plugin-story_release"})
public final class e
{
  public com.tencent.mm.loader.d<d> rVR;
  private final com.tencent.mm.loader.e.a rVS;
  public final com.tencent.mm.loader.c.e rVT;
  public final com.tencent.mm.loader.c.e rVU;

  public e()
  {
    AppMethodBeat.i(109302);
    this.rVS = new com.tencent.mm.loader.e.a();
    Object localObject1 = new e.a().TJ().TI().TL();
    j.o(localObject1, "ImageLoaderOptions.Build…cheInMemory(true).build()");
    this.rVT = ((com.tencent.mm.loader.c.e)localObject1);
    localObject1 = new e.a().TJ().TI().TK().jZ(((a.a)com.tencent.mm.plugin.story.c.a.a.rQZ.Uw()).rRh).jY(((a.a)com.tencent.mm.plugin.story.c.a.a.rQZ.Uw()).rRi).TL();
    j.o(localObject1, "ImageLoaderOptions.Build….albumThumbWidth).build()");
    this.rVU = ((com.tencent.mm.loader.c.e)localObject1);
    localObject1 = new com.tencent.mm.loader.c.a();
    Object localObject2 = (com.tencent.mm.loader.b.a.d)new b();
    j.p(localObject2, "cache");
    ((com.tencent.mm.loader.c.b)localObject1).ePt = ((com.tencent.mm.loader.b.a.d)localObject2);
    localObject2 = (com.tencent.mm.loader.d.b)new c();
    j.p(localObject2, "downloader");
    ((com.tencent.mm.loader.c.b)localObject1).ePu = ((com.tencent.mm.loader.d.b)localObject2);
    localObject2 = (f)this.rVS;
    j.p(localObject2, "creater");
    ((com.tencent.mm.loader.c.b)localObject1).ePv = ((f)localObject2);
    localObject2 = this.rVT;
    j.p(localObject2, "options");
    ((com.tencent.mm.loader.c.b)localObject1).ePr = ((com.tencent.mm.loader.c.e)localObject2);
    localObject1 = (com.tencent.mm.loader.c.d)new b.a((com.tencent.mm.loader.c.b)localObject1);
    localObject2 = com.tencent.mm.loader.e.eOD;
    this.rVR = com.tencent.mm.loader.e.a((com.tencent.mm.loader.c.d)localObject1);
    AppMethodBeat.o(109302);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.c.e
 * JD-Core Version:    0.6.2
 */