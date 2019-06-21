package com.tencent.mm.plugin.story.h;

import a.f.a.m;
import a.l;
import a.v;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.er;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.protocal.protobuf.cfc;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryExtInfo;", "Lcom/tencent/mm/autogen/table/BaseStoryExtItem;", "()V", "value", "", "duration", "getDuration", "()J", "setDuration", "(J)V", "isContact", "", "()Ljava/lang/Boolean;", "setContact", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "localId", "", "getLocalId", "()I", "setLocalId", "(I)V", "oneDayCount", "getOneDayCount", "setOneDayCount", "postTime", "getPostTime", "setPostTime", "preLoadCache", "getPreLoadCache", "setPreLoadCache", "", "preloadMediaId", "getPreloadMediaId", "()Ljava/lang/String;", "setPreloadMediaId", "(Ljava/lang/String;)V", "preloadStoryId", "getPreloadStoryId", "setPreloadStoryId", "readId", "getReadId", "setReadId", "readTime", "getReadTime", "setReadTime", "syncId", "getSyncId", "setSyncId", "thumbUrl", "getThumbUrl", "setThumbUrl", "updateTime", "getUpdateTime", "setUpdateTime", "Lcom/tencent/mm/protocal/protobuf/StoryUserInfo;", "userInfo", "getUserInfo", "()Lcom/tencent/mm/protocal/protobuf/StoryUserInfo;", "setUserInfo", "(Lcom/tencent/mm/protocal/protobuf/StoryUserInfo;)V", "userName", "getUserName", "setUserName", "videoUrl", "getVideoUrl", "setVideoUrl", "convertFrom", "", "cu", "Landroid/database/Cursor;", "getDBInfo", "Lcom/tencent/mm/sdk/storage/IAutoDBItem$MAutoDBInfo;", "hasUnread", "isEmpty", "isValid", "markPreloadCompleted", "storyId", "mediaId", "cacheSize", "resetPreLoad", "Companion", "plugin-story_release"})
public final class f extends er
{
  private static final String TAG = "MicroMsg.StoryExtInfo";
  private static final c.a ccO;
  private static final m<Long, Long, Boolean> sdI;
  public static final f.a sdJ;
  private int cNE;

  static
  {
    AppMethodBeat.i(109882);
    sdJ = new f.a((byte)0);
    TAG = "MicroMsg.StoryExtInfo";
    ccO = er.Hm();
    sdI = (m)f.b.sdK;
    AppMethodBeat.o(109882);
  }

  public f()
  {
    AppMethodBeat.i(109881);
    setUserName("");
    AppMethodBeat.o(109881);
  }

  public final c.a Ag()
  {
    AppMethodBeat.i(109880);
    c.a locala = ccO;
    a.f.b.j.o(locala, "StoryExtInfo.info");
    AppMethodBeat.o(109880);
    return locala;
  }

  public final void aaT(String paramString)
  {
    AppMethodBeat.i(109874);
    a.f.b.j.p(paramString, "value");
    this.field_preloadMediaId = paramString;
    AppMethodBeat.o(109874);
  }

  public final boolean b(long paramLong, String paramString, int paramInt)
  {
    AppMethodBeat.i(109876);
    a.f.b.j.p(paramString, "mediaId");
    boolean bool;
    if (paramLong == this.field_syncId)
    {
      this.field_preloadStoryId = paramLong;
      aaT(paramString);
      this.field_preLoadResource = paramInt;
      bool = true;
      AppMethodBeat.o(109876);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(109876);
    }
  }

  public final String cBJ()
  {
    String str1 = this.field_newVideoUrl;
    String str2 = str1;
    if (str1 == null)
      str2 = "";
    return str2;
  }

  public final String cBK()
  {
    String str1 = this.field_newThumbUrl;
    String str2 = str1;
    if (str1 == null)
      str2 = "";
    return str2;
  }

  public final long cBL()
  {
    if (this.field_preloadStoryId == this.field_syncId);
    for (long l = this.field_preLoadResource; ; l = 0L)
      return l;
  }

  public final cfc cBM()
  {
    AppMethodBeat.i(109875);
    Object localObject;
    if (this.field_userInfo == null)
    {
      localObject = new cfc();
      AppMethodBeat.o(109875);
      return localObject;
    }
    cfc localcfc;
    try
    {
      localObject = new com/tencent/mm/protocal/protobuf/cfc;
      ((cfc)localObject).<init>();
      localObject = ((cfc)localObject).parseFrom(this.field_userInfo);
      if (localObject == null)
      {
        localObject = new a/v;
        ((v)localObject).<init>("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryUserInfo");
        AppMethodBeat.o(109875);
        throw ((Throwable)localObject);
      }
    }
    catch (Exception localException)
    {
      ab.e(TAG, "error get storyUserInfo!");
      localcfc = new cfc();
    }
    while (true)
    {
      AppMethodBeat.o(109875);
      break;
      localcfc = (cfc)localcfc;
    }
  }

  public final boolean cBN()
  {
    AppMethodBeat.i(109878);
    boolean bool;
    if ((isValid()) && (((Boolean)sdI.m(Long.valueOf(this.field_readId), Long.valueOf(this.field_syncId))).booleanValue()))
    {
      m localm = sdI;
      j.a locala = com.tencent.mm.plugin.story.model.j.rST;
      if (((Boolean)localm.m(Long.valueOf(j.a.cyh()), Long.valueOf(this.field_updateTime))).booleanValue())
      {
        bool = true;
        AppMethodBeat.o(109878);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(109878);
    }
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(109877);
    a.f.b.j.p(paramCursor, "cu");
    super.d(paramCursor);
    this.cNE = ((int)this.xDa);
    AppMethodBeat.o(109877);
  }

  public final String getUserName()
  {
    AppMethodBeat.i(109872);
    String str = this.field_userName;
    a.f.b.j.o(str, "field_userName");
    AppMethodBeat.o(109872);
    return str;
  }

  public final boolean isValid()
  {
    AppMethodBeat.i(109879);
    boolean bool;
    if ((this.field_syncId != 0L) && (this.field_storyPostTime + 86400 >= cb.aaF()))
    {
      bool = true;
      AppMethodBeat.o(109879);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(109879);
    }
  }

  public final void setUserName(String paramString)
  {
    AppMethodBeat.i(109873);
    a.f.b.j.p(paramString, "value");
    this.field_userName = paramString;
    AppMethodBeat.o(109873);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.f
 * JD-Core Version:    0.6.2
 */