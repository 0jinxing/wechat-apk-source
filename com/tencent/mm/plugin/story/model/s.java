package com.tencent.mm.plugin.story.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.c;
import com.tencent.mm.plugin.story.h.n;
import com.tencent.mm.plugin.story.h.o;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.protocal.protobuf.cee;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/StoryVideoLogic;", "", "()V", "STORY_VIDEO_PREFIX", "", "TAG", "createForFake", "Lcom/tencent/mm/plugin/story/storage/StoryVideoCache;", "videoItem", "Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "createForPost", "", "storyId", "", "media", "Lcom/tencent/mm/protocal/protobuf/StoryMediaObj;", "username", "genCdnMediaId", "createTime", "", "url", "genFileName", "snsLocalId", "getOrCreate", "getStoryVideoDir", "getStoryVideoPath", "getStoryVideoTmpPath", "plugin-story_release"})
public final class s
{
  private static final String TAG = "MicroMsg.StoryVideoLogic";
  private static final String rTU = "STORY_";
  public static final s rTV;

  static
  {
    AppMethodBeat.i(109170);
    rTV = new s();
    TAG = "MicroMsg.StoryVideoLogic";
    rTU = "STORY_";
    AppMethodBeat.o(109170);
  }

  public static n a(i parami)
  {
    AppMethodBeat.i(109169);
    a.f.b.j.p(parami, "videoItem");
    int i;
    if (parami.cze())
    {
      a.f.b.j.p(parami, "videoItem");
      localObject1 = parami.rWl;
      if (localObject1 != null);
      for (localObject1 = ((cee)localObject1).videoPath; ; localObject1 = null)
      {
        i = (int)e.asZ((String)localObject1);
        localObject2 = new n();
        ((n)localObject2).field_storyId = parami.rUJ;
        ((n)localObject2).field_url = "";
        ((n)localObject2).field_cacheSize = i;
        ((n)localObject2).field_totalSize = i;
        ((n)localObject2).field_filePath = ((String)localObject1);
        AppMethodBeat.o(109169);
        parami = (i)localObject2;
        return parami;
      }
    }
    Object localObject2 = a(parami.rWj, parami.username);
    Object localObject1 = l.rTg;
    if (localObject2 == null);
    for (localObject1 = ""; ; localObject1 = localObject2)
    {
      l.aax((String)localObject1);
      localObject1 = j.rST;
      localObject1 = j.a.cxX().lz(parami.rUJ);
      if (localObject1 == null)
      {
        localObject1 = new n();
        ((n)localObject1).field_storyId = parami.rUJ;
        ((n)localObject1).field_url = parami.rWj.Url;
        ((n)localObject1).field_cacheSize = 0;
        ((n)localObject1).field_totalSize = 0;
        ((n)localObject1).field_filePath = ((String)localObject2);
        parami = j.rST;
        j.a.cxX().a((n)localObject1);
      }
      for (parami = (i)localObject1; ; parami = (i)localObject1)
      {
        localObject1 = (CharSequence)parami.field_filePath;
        if ((localObject1 == null) || (((CharSequence)localObject1).length() == 0));
        for (i = 1; ; i = 0)
        {
          if (i != 0)
            parami.field_filePath = ((String)localObject2);
          AppMethodBeat.o(109169);
          break;
        }
      }
    }
  }

  public static String a(cek paramcek)
  {
    AppMethodBeat.i(109168);
    if (paramcek == null)
    {
      paramcek = null;
      AppMethodBeat.o(109168);
    }
    while (true)
    {
      return paramcek;
      l locall = l.rTg;
      paramcek = l.aat(paramcek.Id);
      AppMethodBeat.o(109168);
    }
  }

  public static String a(cek paramcek, String paramString)
  {
    AppMethodBeat.i(109167);
    if (paramcek == null)
    {
      paramcek = null;
      AppMethodBeat.o(109167);
    }
    while (true)
    {
      return paramcek;
      l locall = l.rTg;
      paramcek = l.gy(paramcek.Url, paramString);
      ab.i(TAG, "get story video path %s", new Object[] { paramcek });
      AppMethodBeat.o(109167);
    }
  }

  public static String aaF(String paramString)
  {
    AppMethodBeat.i(109166);
    Object localObject = l.rTg;
    localObject = l.aar(paramString) + "/video/";
    ab.i(TAG, "get story video dir %s username %s", new Object[] { localObject, paramString });
    AppMethodBeat.o(109166);
    return localObject;
  }

  public static String be(int paramInt, String paramString)
  {
    AppMethodBeat.i(109165);
    if (paramString == null)
    {
      paramString = "story_local_video_".concat(String.valueOf(paramInt));
      if (!bo.isNullOrNil(paramString))
        break label49;
      paramString = null;
      AppMethodBeat.o(109165);
    }
    while (true)
    {
      return paramString;
      paramString = c.a("storyvideo", paramInt, "story", paramString);
      break;
      label49: AppMethodBeat.o(109165);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.s
 * JD-Core Version:    0.6.2
 */