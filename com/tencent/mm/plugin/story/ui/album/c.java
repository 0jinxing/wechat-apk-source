package com.tencent.mm.plugin.story.ui.album;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.h.h;
import com.tencent.mm.plugin.story.h.j;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cfb;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumInfo;", "", "label", "", "storyInfos", "", "Lcom/tencent/mm/plugin/story/storage/StoryHistoryInfo;", "(Ljava/lang/String;Ljava/util/List;)V", "getLabel", "()Ljava/lang/String;", "getStoryInfos", "()Ljava/util/List;", "toString", "plugin-story_release"})
public final class c
{
  final String label;
  final List<h> sgn;

  public c()
  {
    this(null, null, 3);
  }

  public c(String paramString, List<h> paramList)
  {
    AppMethodBeat.i(110159);
    this.label = paramString;
    this.sgn = paramList;
    AppMethodBeat.o(110159);
  }

  public final String toString()
  {
    AppMethodBeat.i(110158);
    StringBuilder localStringBuilder1 = new StringBuilder();
    Iterator localIterator = ((Iterable)this.sgn).iterator();
    if (localIterator.hasNext())
    {
      Object localObject1 = (h)localIterator.next();
      if (((h)localObject1).rXz.cBR().xeA.wbK.size() > 0)
      {
        localObject2 = (cek)((h)localObject1).rXz.cBR().xeA.wbK.get(0);
        label86: StringBuilder localStringBuilder2 = new StringBuilder("\t[date=").append(((h)localObject1).field_date).append(" localId=").append((int)((h)localObject1).rXz.xDa).append(", storyId=").append(((h)localObject1).rXz.field_storyID).append(", thumb=");
        if (localObject2 == null)
          break label203;
        localObject1 = ((cek)localObject2).wEH;
        label151: localObject1 = localStringBuilder2.append((String)localObject1).append(", video=");
        if (localObject2 == null)
          break label208;
      }
      label203: label208: for (localObject2 = ((cek)localObject2).Url; ; localObject2 = null)
      {
        localStringBuilder1.append((String)localObject2 + "]\n");
        break;
        localObject2 = null;
        break label86;
        localObject1 = null;
        break label151;
      }
    }
    Object localObject2 = "[" + this.label + "] \n " + localStringBuilder1;
    AppMethodBeat.o(110158);
    return localObject2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.c
 * JD-Core Version:    0.6.2
 */