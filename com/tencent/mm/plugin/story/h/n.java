package com.tencent.mm.plugin.story.h;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.et;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.vfs.e;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryVideoCache;", "Lcom/tencent/mm/autogen/table/BaseStoryVideoCacheInfo;", "()V", "value", "", "cacheSize", "getCacheSize", "()I", "setCacheSize", "(I)V", "", "filePath", "getFilePath", "()Ljava/lang/String;", "setFilePath", "(Ljava/lang/String;)V", "", "storyId", "getStoryId", "()J", "setStoryId", "(J)V", "totalSize", "getTotalSize", "setTotalSize", "url", "getUrl", "setUrl", "downloadFinish", "", "downloadFinishAndCheckFile", "getDBInfo", "Lcom/tencent/mm/sdk/storage/IAutoDBItem$MAutoDBInfo;", "resetVideo", "", "toString", "Companion", "plugin-story_release"})
public final class n extends et
{
  private static final c.a ccO;
  public static final n.a seo;

  static
  {
    AppMethodBeat.i(109978);
    seo = new n.a((byte)0);
    ccO = et.Hm();
    AppMethodBeat.o(109978);
  }

  public final c.a Ag()
  {
    AppMethodBeat.i(109976);
    c.a locala = ccO;
    j.o(locala, "info");
    AppMethodBeat.o(109976);
    return locala;
  }

  public final boolean Jo()
  {
    if ((this.field_totalSize > 0) && (this.field_cacheSize == this.field_totalSize));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean cCd()
  {
    AppMethodBeat.i(109975);
    boolean bool;
    if ((Jo()) && (e.ct(this.field_filePath)))
    {
      bool = true;
      AppMethodBeat.o(109975);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(109975);
    }
  }

  public final void cCe()
  {
    this.field_cacheSize = 0;
    this.field_totalSize = 0;
  }

  public final String toString()
  {
    AppMethodBeat.i(109977);
    String str = this.field_storyId + ", " + this.field_filePath + ", cacheSize:" + this.field_cacheSize + ", totalSize:" + this.field_totalSize;
    AppMethodBeat.o(109977);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.n
 * JD-Core Version:    0.6.2
 */