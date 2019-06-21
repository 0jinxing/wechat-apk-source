package com.tencent.mm.plugin.story.model.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.h.d;
import com.tencent.mm.plugin.story.model.b.a;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.s;
import com.tencent.mm.protocal.protobuf.cdv;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cee;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cel;
import com.tencent.mm.protocal.protobuf.cer;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "", "story", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "storyTImeline", "Lcom/tencent/mm/protocal/protobuf/StoryTimelineObject;", "storyItemScene", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItemScene;", "(Lcom/tencent/mm/plugin/story/storage/StoryInfo;Lcom/tencent/mm/protocal/protobuf/StoryTimelineObject;Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItemScene;)V", "TAG", "", "comment", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;", "getComment", "()Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryComment;", "getStory", "()Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "storyId", "", "getStoryId", "()J", "getStoryItemScene", "()Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItemScene;", "getStoryTImeline", "()Lcom/tencent/mm/protocal/protobuf/StoryTimelineObject;", "userName", "getUserName", "()Ljava/lang/String;", "setUserName", "(Ljava/lang/String;)V", "videoItem", "Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "getVideoItem", "()Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "convertFromFakeDB", "", "timeStamp", "convertFromStoryInfo", "equals", "other", "toString", "Companion", "plugin-story_release"})
public final class g
{
  public static final g.a rWe;
  private final String TAG;
  public final long rUJ;
  public final i rVZ;
  public final f rWa;
  public final com.tencent.mm.plugin.story.h.j rWb;
  private final cfb rWc;
  public final h rWd;
  public String userName;

  static
  {
    AppMethodBeat.i(109319);
    rWe = new g.a((byte)0);
    AppMethodBeat.o(109319);
  }

  public g(com.tencent.mm.plugin.story.h.j paramj, cfb paramcfb, h paramh)
  {
    AppMethodBeat.i(138773);
    this.rWb = paramj;
    this.rWc = paramcfb;
    this.rWd = paramh;
    this.TAG = "MicroMsg.StoryGalleryItem";
    this.rUJ = this.rWb.field_storyID;
    int i = (int)this.rWb.xDa;
    long l = this.rWb.field_storyID;
    int j = this.rWb.field_createTime;
    paramcfb = this.rWb.field_userName;
    paramj = paramcfb;
    if (paramcfb == null)
      paramj = "";
    paramj = new i(i, l, j, paramj);
    paramcfb = this.rWc;
    if (paramcfb.xeA.wbK.size() > 0)
    {
      paramh = paramcfb.xeA.wbK.get(0);
      a.f.b.j.o(paramh, "timeline.ContentObj.MediaObjList[0]");
      paramh = (cek)paramh;
      a.f.b.j.p(paramh, "<set-?>");
      paramj.rWj = paramh;
    }
    paramj.rWk = paramcfb.xez;
    this.rVZ = paramj;
    this.rWa = new f();
    b(this.rWb);
    AppMethodBeat.o(138773);
  }

  private final boolean b(com.tencent.mm.plugin.story.h.j paramj)
  {
    int i = 0;
    AppMethodBeat.i(109315);
    Object localObject1 = new cer();
    try
    {
      ((cer)localObject1).parseFrom(paramj.field_attrBuf);
      Object localObject2 = this.rWa;
      Object localObject3 = paramj.field_userName;
      Object localObject4 = localObject3;
      if (localObject3 == null)
      {
        localObject4 = com.tencent.mm.plugin.story.model.j.rST;
        localObject4 = j.a.cnk();
      }
      a.f.b.j.p(localObject4, "<set-?>");
      ((f)localObject2).rVl = ((String)localObject4);
      this.rWa.rUJ = paramj.field_storyID;
      this.rWa.rqw = 0;
      localObject4 = com.tencent.mm.plugin.story.model.j.rST;
      localObject4 = j.a.cxW().lr(paramj.field_storyID);
      if ((localObject4 == null) || (((com.tencent.mm.plugin.story.h.c)localObject4).field_readCommentTime == 0));
      boolean bool;
      Object localObject5;
      for (int j = 1; ; j = 0)
      {
        localObject3 = ((cer)localObject1).xeo.iterator();
        bool = false;
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (cdv)((Iterator)localObject3).next();
          a.f.b.j.o(localObject2, "commentDetail");
          localObject5 = new a((cdv)localObject2);
          if ((localObject4 == null) || (((com.tencent.mm.plugin.story.h.c)localObject4).field_readCommentTime <= 0) || (((a)localObject5).fDG <= ((com.tencent.mm.plugin.story.h.c)localObject4).field_readCommentTime))
            break label983;
          String str = ((a)localObject5).cEV;
          localObject2 = com.tencent.mm.plugin.story.model.j.rST;
          if (bo.isEqual(str, j.a.cnk()))
            break label983;
          ((a)localObject5).rVh = true;
          bool = true;
          this.rWa.rrj.add(localObject5);
          ((a)localObject5).aaG(this.rWa.rVl);
          ((a)localObject5).rVn = paramj.cBX();
        }
      }
      localObject3 = ((cer)localObject1).xeq.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = (cdv)((Iterator)localObject3).next();
        a.f.b.j.o(localObject1, "bubleDetail");
        localObject2 = new a((cdv)localObject1);
        if ((localObject4 == null) || (((com.tencent.mm.plugin.story.h.c)localObject4).field_readCommentTime <= 0) || (((a)localObject2).fDG <= ((com.tencent.mm.plugin.story.h.c)localObject4).field_readCommentTime))
          break label980;
        localObject5 = ((a)localObject2).cEV;
        localObject1 = com.tencent.mm.plugin.story.model.j.rST;
        if (bo.isEqual((String)localObject5, j.a.cnk()))
          break label980;
        ((a)localObject2).rVh = true;
        bool = true;
        this.rWa.rrj.add(localObject2);
        ((a)localObject2).aaG(this.rWa.rVl);
        ((a)localObject2).rVn = paramj.cBX();
      }
      localObject4 = (List)this.rWa.rrj;
      if (((List)localObject4).size() > 1)
        a.a.j.a((List)localObject4, (Comparator)new g.b());
      long l;
      if ((j != 0) && (this.rWa.rrj.size() > 0))
      {
        localObject4 = com.tencent.mm.plugin.story.model.b.b.rVw;
        l = this.rUJ;
        localObject4 = this.rWa.rrj.get(0);
        a.f.b.j.o(localObject4, "comment.commentList[0]");
        com.tencent.mm.plugin.story.model.b.b.a(l, (a)localObject4);
      }
      this.rWa.rVh = bool;
      if (paramj != null)
      {
        localObject4 = paramj.field_userName;
        this.userName = ((String)localObject4);
        localObject4 = s.rTV;
        localObject3 = this.rVZ.rWj;
        localObject4 = paramj.field_userName;
        paramj = (com.tencent.mm.plugin.story.h.j)localObject4;
        if (localObject4 == null)
          paramj = "";
        if (!com.tencent.mm.vfs.e.ct(s.a((cek)localObject3, paramj)))
        {
          paramj = s.rTV;
          j = i;
          if (!com.tencent.mm.vfs.e.ct(s.a(this.rVZ.rWj)));
        }
        else
        {
          j = 1;
        }
        if ((j == 0) && (this.rVZ.rWj.cNE >= 0))
        {
          paramj = com.tencent.mm.plugin.story.model.j.rST;
          localObject2 = j.a.cxY().ls(this.rVZ.rWj.cNE);
          if (localObject2 != null)
          {
            localObject3 = this.TAG;
            localObject1 = new StringBuilder("find fake video ").append(this.rVZ).append(" media ");
            paramj = com.tencent.mm.plugin.story.e.c.rRS;
            paramj = this.rVZ.rWj;
            if (paramj != null)
            {
              localObject4 = "Media localId " + paramj.cNE + " url " + paramj.Url + " thumb " + paramj.wEH + " duration " + paramj.duration;
              paramj = (com.tencent.mm.plugin.story.h.j)localObject4;
              if (localObject4 != null);
            }
            else
            {
              paramj = "";
            }
            ab.i((String)localObject3, paramj);
            l = ((d)localObject2).field_timeStamp;
            paramj = com.tencent.mm.plugin.story.f.l.sac;
            paramj = com.tencent.mm.plugin.story.f.l.lh(l);
            if (paramj != null)
            {
              localObject3 = this.rVZ;
              localObject4 = j.rWn;
              a.f.b.j.p(localObject4, "<set-?>");
              ((i)localObject3).rWi = ((j)localObject4);
              this.rVZ.timeStamp = paramj.timeStamp;
              this.rVZ.rWj.wEH = paramj.thumbPath;
              this.rVZ.rWj.Id = ("fake_" + paramj.timeStamp);
              this.rVZ.rWk = paramj.smk;
              if (com.tencent.mm.vfs.e.ct(paramj.videoPath))
                break label949;
              localObject4 = com.tencent.mm.plugin.story.f.l.sac;
              com.tencent.mm.plugin.story.f.l.li(paramj.timeStamp);
            }
          }
        }
      }
      while (true)
      {
        ab.i(this.TAG, "LogStory: ".concat(String.valueOf(this)));
        AppMethodBeat.o(109315);
        return true;
        localObject4 = null;
        break;
        label949: localObject3 = this.rVZ;
        localObject4 = com.tencent.mm.plugin.story.f.l.sac;
        ((i)localObject3).rWl = com.tencent.mm.plugin.story.f.l.lh(paramj.timeStamp);
      }
    }
    catch (Exception localException)
    {
      label980: label983: 
      while (true)
        continue;
    }
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(109317);
    boolean bool;
    if (!(paramObject instanceof g))
    {
      AppMethodBeat.o(109317);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((g)this == paramObject)
      {
        AppMethodBeat.o(109317);
        bool = true;
      }
      else if ((this.rUJ == ((g)paramObject).rUJ) && (a.f.b.j.j(this.rVZ, ((g)paramObject).rVZ)) && (a.f.b.j.j(this.rWa, ((g)paramObject).rWa)) && (this.rWb.cBU().eRu == ((g)paramObject).rWb.cBU().eRu))
      {
        AppMethodBeat.o(109317);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(109317);
        bool = false;
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(109316);
    String str = "StoryGalleryItem(videoItem=" + this.rVZ + ", comment=" + this.rWa + ')';
    AppMethodBeat.o(109316);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.d.g
 * JD-Core Version:    0.6.2
 */