package com.tencent.mm.plugin.story.model.d;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cee;
import com.tencent.mm.protocal.protobuf.cei;
import com.tencent.mm.protocal.protobuf.cek;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "", "localId", "", "storyId", "", "createTime", "username", "", "(IJILjava/lang/String;)V", "getCreateTime", "()I", "setCreateTime", "(I)V", "fakeVideoData", "Lcom/tencent/mm/protocal/protobuf/StoryEditorProtoData;", "getFakeVideoData", "()Lcom/tencent/mm/protocal/protobuf/StoryEditorProtoData;", "setFakeVideoData", "(Lcom/tencent/mm/protocal/protobuf/StoryEditorProtoData;)V", "getLocalId", "setLocalId", "location", "Lcom/tencent/mm/protocal/protobuf/StoryLocation;", "getLocation", "()Lcom/tencent/mm/protocal/protobuf/StoryLocation;", "setLocation", "(Lcom/tencent/mm/protocal/protobuf/StoryLocation;)V", "media", "Lcom/tencent/mm/protocal/protobuf/StoryMediaObj;", "getMedia", "()Lcom/tencent/mm/protocal/protobuf/StoryMediaObj;", "setMedia", "(Lcom/tencent/mm/protocal/protobuf/StoryMediaObj;)V", "getStoryId", "()J", "timeStamp", "getTimeStamp", "setTimeStamp", "(J)V", "getUsername", "()Ljava/lang/String;", "setUsername", "(Ljava/lang/String;)V", "videoType", "Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoState;", "getVideoType", "()Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoState;", "setVideoType", "(Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoState;)V", "canPlay", "", "equals", "other", "hashCode", "isFakeVideo", "isNormalVideo", "toString", "plugin-story_release"})
public final class i
{
  public int cNE;
  public int fDG;
  public final long rUJ;
  j rWi;
  public cek rWj;
  cei rWk;
  public cee rWl;
  public long timeStamp;
  public String username;

  public i(int paramInt1, long paramLong, int paramInt2, String paramString)
  {
    AppMethodBeat.i(109323);
    this.cNE = paramInt1;
    this.rUJ = paramLong;
    this.fDG = paramInt2;
    this.username = paramString;
    this.rWi = j.rWp;
    paramString = new cek();
    paramString.Url = "";
    paramString.wEH = "";
    paramString.Id = "";
    this.rWj = paramString;
    AppMethodBeat.o(109323);
  }

  private boolean czd()
  {
    if (this.rWi == j.rWp);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean cze()
  {
    if (this.rWi == j.rWn);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean czf()
  {
    if (this.rWi != j.rWm);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(109320);
    boolean bool;
    if (!(paramObject instanceof i))
    {
      AppMethodBeat.o(109320);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((i)this == paramObject)
      {
        AppMethodBeat.o(109320);
        bool = true;
      }
      else if ((this.rWi == j.rWm) && (((i)paramObject).rWi == j.rWm))
      {
        AppMethodBeat.o(109320);
        bool = true;
      }
      else if ((cze()) && (((i)paramObject).cze()) && (this.timeStamp == ((i)paramObject).timeStamp))
      {
        AppMethodBeat.o(109320);
        bool = true;
      }
      else if ((czd()) && (((i)paramObject).czd()) && (this.cNE == ((i)paramObject).cNE))
      {
        AppMethodBeat.o(109320);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(109320);
        bool = false;
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(109321);
    int i = super.hashCode();
    AppMethodBeat.o(109321);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(109322);
    String str = "[VideoItem=" + hashCode() + ",localId=:" + this.cNE + ",storyId=" + this.rUJ + ",videoType:=" + this.rWi + ", username=" + this.username + ", url=" + this.rWj.Url + ']';
    AppMethodBeat.o(109322);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.d.i
 * JD-Core Version:    0.6.2
 */