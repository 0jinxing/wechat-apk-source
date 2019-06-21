package com.tencent.mm.plugin.story.h;

import a.l;
import a.v;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cx;
import com.tencent.mm.model.cb;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.story.e.b.a;
import com.tencent.mm.plugin.story.model.q;
import com.tencent.mm.plugin.story.model.q.a;
import com.tencent.mm.protocal.protobuf.cel;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "Lcom/tencent/mm/autogen/table/BaseMMStoryInfo;", "()V", "value", "", "createTime", "getCreateTime", "()I", "setCreateTime", "(I)V", "date", "getDate", "setDate", "localId", "getLocalId", "setLocalId", "readCount", "getReadCount", "setReadCount", "", "storyId", "getStoryId", "()J", "setStoryId", "(J)V", "type", "getType", "setType", "", "userName", "getUserName", "()Ljava/lang/String;", "setUserName", "(Ljava/lang/String;)V", "addSourceFlag", "", "mmsourceType", "addStoryItemFlag", "storyItemFlag", "checkFavorite", "", "checkNotifySns", "checkVisiableSelfOnly", "cleanPostFinish", "clearItemDie", "convertFrom", "cu", "Landroid/database/Cursor;", "getDBInfo", "Lcom/tencent/mm/sdk/storage/IAutoDBItem$MAutoDBInfo;", "getPostInfo", "Lcom/tencent/mm/protocal/protobuf/StoryMediaPostInfo;", "getTimeLine", "Lcom/tencent/mm/protocal/protobuf/StoryTimelineObject;", "isDeprecated", "isDeprecatedForFav", "isItemDie", "isItemFinish", "isReadStatus", "isTimeLimit", "tryCount", "startTime", "isUnreadStatus", "removeSourceFlag", "removeStoryItemFlag", "setContent", "contentObj", "setItemDie", "setPostBuf", "postBuf", "", "setPostFinish", "setPostMixFinish", "setPostMixWaiting", "setPostWaiting", "setReadStatus", "setTimeLine", "timeline", "setUnreadStatus", "Companion", "plugin-story_release"})
public final class j extends cx
{
  private static final String TAG = "MicroMsg.StoryInfo";
  private static final c.a ccO;
  private static final String sdW = "rowid";
  private static final String sdX = "serverStoryNameIndex";
  private static final String sdY = "serverStoryNameTimeIndex";
  private static final String sdZ = "serverStoryUsernameCreateTimeIndex";
  public static final j.a sea;
  public int cNE;
  public int sdV;

  static
  {
    AppMethodBeat.i(109928);
    sea = new j.a((byte)0);
    TAG = "MicroMsg.StoryInfo";
    ccO = cx.Hm();
    sdW = "rowid";
    sdX = "serverStoryNameIndex";
    sdY = "serverStoryNameTimeIndex";
    sdZ = "serverStoryUsernameCreateTimeIndex";
    AppMethodBeat.o(109928);
  }

  public static boolean ac(int paramInt, long paramLong)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(109926);
    if (ae.gjB)
    {
      ab.i(TAG, "Android Test time limit fail " + ae.gjB);
      AppMethodBeat.o(109926);
      return bool2;
    }
    int i = cb.aaF();
    int j = (int)paramLong;
    a.a locala = a.sdm;
    boolean bool3;
    label76: boolean bool4;
    if (i - j > a.cBj())
    {
      bool3 = true;
      if (paramInt <= 5)
        break label181;
      bool4 = true;
      label84: bool2 = bool1;
      if (!bool3)
        if (!bool4)
          break label187;
    }
    label181: label187: for (bool2 = bool1; ; bool2 = false)
    {
      if (bool2)
        ab.i(TAG, "isTimeLimit " + bool3 + "  " + bool4 + " tryCount:" + paramInt + " startTime " + paramLong + "  svr: " + cb.aaF());
      AppMethodBeat.o(109926);
      break;
      bool3 = false;
      break label76;
      bool4 = false;
      break label84;
    }
  }

  public final c.a Ag()
  {
    AppMethodBeat.i(109913);
    c.a locala = ccO;
    a.f.b.j.o(locala, "info");
    AppMethodBeat.o(109913);
    return locala;
  }

  public final void DF(int paramInt)
  {
    this.field_sourceType |= paramInt;
  }

  public final void Fc(int paramInt)
  {
    this.field_itemStoryFlag |= paramInt;
  }

  public final void Fd(int paramInt)
  {
    this.field_itemStoryFlag &= (paramInt ^ 0xFFFFFFFF);
  }

  public final void b(cfb paramcfb)
  {
    AppMethodBeat.i(109916);
    a.f.b.j.p(paramcfb, "timeline");
    try
    {
      this.field_content = paramcfb.toByteArray();
      AppMethodBeat.o(109916);
      return;
    }
    catch (Exception paramcfb)
    {
      while (true)
      {
        ab.printErrStackTrace(TAG, (Throwable)paramcfb, "", new Object[0]);
        AppMethodBeat.o(109916);
      }
    }
  }

  public final void bk(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(109917);
    a.f.b.j.p(paramArrayOfByte, "postBuf");
    this.field_postBuf = paramArrayOfByte;
    AppMethodBeat.o(109917);
  }

  public final boolean c(cfb paramcfb)
  {
    AppMethodBeat.i(109922);
    a.f.b.j.p(paramcfb, "contentObj");
    try
    {
      this.field_content = paramcfb.toByteArray();
      bool = true;
      AppMethodBeat.o(109922);
      return bool;
    }
    catch (Exception paramcfb)
    {
      while (true)
      {
        ab.printErrStackTrace(TAG, (Throwable)paramcfb, "", new Object[0]);
        AppMethodBeat.o(109922);
        boolean bool = false;
      }
    }
  }

  public final cfb cBR()
  {
    AppMethodBeat.i(109915);
    Object localObject1;
    if (this.field_content == null)
    {
      localObject1 = q.rTk;
      localObject1 = q.a.cyq();
      AppMethodBeat.o(109915);
    }
    while (true)
    {
      return localObject1;
      try
      {
        localObject1 = new com/tencent/mm/protocal/protobuf/cfb;
        ((cfb)localObject1).<init>();
        localObject1 = ((cfb)localObject1).parseFrom(this.field_content);
        if (localObject1 != null)
          break label96;
        localObject1 = new a/v;
        ((v)localObject1).<init>("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryTimelineObject");
        AppMethodBeat.o(109915);
        throw ((Throwable)localObject1);
      }
      catch (Exception localException)
      {
        ab.e(TAG, "error get storyinfo timeline!");
        localObject2 = q.rTk;
        localObject2 = q.a.cyq();
        AppMethodBeat.o(109915);
      }
      continue;
      label96: Object localObject2 = (cfb)localObject2;
      AppMethodBeat.o(109915);
    }
  }

  public final void cBS()
  {
    AppMethodBeat.i(109918);
    int i = this.field_localFlag;
    a.c localc = a.c.sds;
    this.field_localFlag = (i | a.c.cBu());
    AppMethodBeat.o(109918);
  }

  public final boolean cBT()
  {
    AppMethodBeat.i(109921);
    int i = this.field_localFlag;
    a.c localc = a.c.sds;
    boolean bool;
    if ((i & a.c.cBv()) != 0)
    {
      bool = true;
      AppMethodBeat.o(109921);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(109921);
    }
  }

  public final cel cBU()
  {
    AppMethodBeat.i(109923);
    Object localObject = new cel();
    if (this.field_postBuf == null)
      AppMethodBeat.o(109923);
    while (true)
    {
      return localObject;
      try
      {
        localObject = new com/tencent/mm/protocal/protobuf/cel;
        ((cel)localObject).<init>();
        localObject = ((cel)localObject).parseFrom(this.field_postBuf);
        if (localObject != null)
          break label113;
        localObject = new a/v;
        ((v)localObject).<init>("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryMediaPostInfo");
        AppMethodBeat.o(109923);
        throw ((Throwable)localObject);
      }
      catch (Exception localException)
      {
        ab.e(TAG, "error get StoryMediaPostInfo " + this.field_storyID);
        localcel = new cel();
        AppMethodBeat.o(109923);
      }
      continue;
      label113: cel localcel = (cel)localcel;
      AppMethodBeat.o(109923);
    }
  }

  public final boolean cBV()
  {
    AppMethodBeat.i(109924);
    int i = this.field_itemStoryFlag;
    a.a locala = a.sdm;
    boolean bool = com.tencent.mm.ab.b.cf(i, a.cBm());
    AppMethodBeat.o(109924);
    return bool;
  }

  public final boolean cBW()
  {
    AppMethodBeat.i(109925);
    int i = this.field_itemStoryFlag;
    a.a locala = a.sdm;
    boolean bool = com.tencent.mm.ab.b.cf(i, a.cBn());
    AppMethodBeat.o(109925);
    return bool;
  }

  public final boolean cBX()
  {
    AppMethodBeat.i(109927);
    boolean bool;
    if (this.field_createTime <= cb.aaF() - 86400)
    {
      bool = true;
      AppMethodBeat.o(109927);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(109927);
    }
  }

  public final void cqX()
  {
    AppMethodBeat.i(109920);
    int i = this.field_localFlag;
    a.c localc = a.c.sds;
    this.field_localFlag = (i & (a.c.cBv() ^ 0xFFFFFFFF));
    AppMethodBeat.o(109920);
  }

  public final void cqY()
  {
    AppMethodBeat.i(109919);
    int i = this.field_localFlag;
    a.c localc = a.c.sds;
    this.field_localFlag = (i | a.c.cBv());
    AppMethodBeat.o(109919);
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(109914);
    a.f.b.j.p(paramCursor, "cu");
    super.d(paramCursor);
    this.cNE = ((int)this.xDa);
    paramCursor = com.tencent.mm.plugin.story.e.b.rRO;
    this.sdV = b.a.kX(this.field_createTime * 1000L);
    AppMethodBeat.o(109914);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.j
 * JD-Core Version:    0.6.2
 */