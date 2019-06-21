package com.tencent.mm.plugin.story.model.c;

import a.f.b.j;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.sdk.platformtools.ab;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/download/StoryDiskCache;", "Lcom/tencent/mm/loader/cache/disk/BitmapDiskCache;", "Lcom/tencent/mm/plugin/story/model/download/StoryImage;", "()V", "buildFilePath", "", "url", "Lcom/tencent/mm/loader/model/data/DataItem;", "opts", "Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;", "reaper", "Lcom/tencent/mm/loader/Reaper;", "Landroid/graphics/Bitmap;", "clear", "", "get", "Lcom/tencent/mm/loader/model/datasource/DataSource;", "onSaveCompleted", "", "diskResource", "Lcom/tencent/mm/loader/model/Resource;", "onSaveStarted", "httpResponse", "Lcom/tencent/mm/loader/model/Response;", "resource", "plugin-story_release"})
public final class b extends com.tencent.mm.loader.b.a.a<d>
{
  public final String a(com.tencent.mm.loader.h.a.a<d> parama, com.tencent.mm.loader.c.e parame, com.tencent.mm.loader.f<?, Bitmap> paramf)
  {
    AppMethodBeat.i(109290);
    j.p(parama, "url");
    j.p(parame, "opts");
    j.p(paramf, "reaper");
    parame = com.tencent.mm.plugin.story.model.l.rTg;
    parama = com.tencent.mm.plugin.story.model.l.gx(((d)parama.value()).rVQ.Id, ((d)parama.value()).username);
    parame = com.tencent.mm.plugin.story.model.l.rTg;
    com.tencent.mm.plugin.story.model.l.aax(parama);
    AppMethodBeat.o(109290);
    return parama;
  }

  public final boolean a(com.tencent.mm.loader.h.a.a<d> parama, com.tencent.mm.loader.h.f<?> paramf, com.tencent.mm.loader.c.e parame, com.tencent.mm.loader.f<?, Bitmap> paramf1)
  {
    AppMethodBeat.i(109288);
    j.p(parama, "url");
    j.p(paramf, "httpResponse");
    j.p(parame, "opts");
    j.p(paramf1, "reaper");
    AppMethodBeat.o(109288);
    return true;
  }

  public final boolean b(com.tencent.mm.loader.h.a.a<d> parama, com.tencent.mm.loader.c.e parame, com.tencent.mm.loader.f<?, Bitmap> paramf)
  {
    AppMethodBeat.i(109289);
    j.p(parama, "url");
    j.p(parame, "opts");
    j.p(paramf, "reaper");
    AppMethodBeat.o(109289);
    return true;
  }

  public final com.tencent.mm.loader.h.b.a c(com.tencent.mm.loader.h.a.a<d> parama, com.tencent.mm.loader.c.e parame, com.tencent.mm.loader.f<?, Bitmap> paramf)
  {
    AppMethodBeat.i(109291);
    j.p(parama, "url");
    j.p(parame, "opts");
    j.p(paramf, "reaper");
    parame = a(parama, parame, paramf);
    ab.v(g.getTAG(), "url " + parama + " and path " + parame);
    if (com.tencent.mm.vfs.e.ct(parame))
    {
      parama = com.tencent.mm.loader.h.b.a.lT(parame);
      AppMethodBeat.o(109291);
    }
    while (true)
    {
      return parama;
      parame = com.tencent.mm.plugin.story.model.l.rTg;
      parama = com.tencent.mm.plugin.story.model.l.aas(((d)parama.value()).rVQ.Id);
      if (com.tencent.mm.vfs.e.ct(parama))
      {
        parama = com.tencent.mm.loader.h.b.a.lT(parama);
        AppMethodBeat.o(109291);
      }
      else
      {
        parama = null;
        AppMethodBeat.o(109291);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.c.b
 * JD-Core Version:    0.6.2
 */