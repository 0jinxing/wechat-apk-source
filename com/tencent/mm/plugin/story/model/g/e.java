package com.tencent.mm.plugin.story.model.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ak;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.story.c.a.c.a;
import com.tencent.mm.plugin.story.h.a.e;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.g.a;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.s;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cel;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/upload/UploadTask;", "Lcom/tencent/mm/loader/loader/IWorkTask;", "storyInfo", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "(Lcom/tencent/mm/plugin/story/storage/StoryInfo;)V", "getStoryInfo", "()Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "setStoryInfo", "call", "", "checkRemuxVideo", "", "filePath", "", "postInfo", "Lcom/tencent/mm/protocal/protobuf/StoryMediaPostInfo;", "doUploadStory", "uniqueId", "Companion", "plugin-story_release"})
public final class e extends com.tencent.mm.loader.g.c
{
  private static final String TAG = "MicroMsg.StoryUploadTask";
  public static final e.a rXU;
  private com.tencent.mm.plugin.story.h.j rXz;

  static
  {
    AppMethodBeat.i(109482);
    rXU = new e.a((byte)0);
    TAG = "MicroMsg.StoryUploadTask";
    AppMethodBeat.o(109482);
  }

  public e(com.tencent.mm.plugin.story.h.j paramj)
  {
    AppMethodBeat.i(109481);
    this.rXz = paramj;
    AppMethodBeat.o(109481);
  }

  public final void Pa()
  {
    AppMethodBeat.i(109479);
    Object localObject1 = this.rXz.cBU();
    Object localObject2 = (cek)this.rXz.cBR().xeA.wbK.get(0);
    Object localObject3 = com.tencent.mm.plugin.story.model.l.rTg;
    localObject3 = com.tencent.mm.plugin.story.model.l.aat(((cek)localObject2).Id);
    Object localObject4 = com.tencent.mm.plugin.story.model.l.rTg;
    localObject4 = com.tencent.mm.plugin.story.model.l.aas(((cek)localObject2).Id);
    int i = ((cel)localObject1).wFD;
    Object localObject5 = a.e.sdz;
    if (i == a.e.cBz())
    {
      a(com.tencent.mm.loader.g.h.eRj);
      AppMethodBeat.o(109479);
    }
    while (true)
    {
      return;
      if (((cel)localObject1).eRu > 5)
      {
        localObject3 = f.rXY;
        f.a(this.rXz, -1, "", (a.f.a.a)e.b.rXV);
        a(com.tencent.mm.loader.g.h.eRk);
        AppMethodBeat.o(109479);
      }
      else
      {
        if (com.tencent.mm.vfs.e.asZ((String)localObject3) >= 0L)
          break;
        localObject3 = f.rXY;
        f.a(this.rXz, -1, "", (a.f.a.a)e.c.rXW);
        a(com.tencent.mm.loader.g.h.eRk);
        AppMethodBeat.o(109479);
      }
    }
    localObject5 = a.e.sdz;
    ((cel)localObject1).wFD = a.e.cBB();
    Object localObject6 = this.rXz;
    localObject5 = ((cel)localObject1).toByteArray();
    a.f.b.j.o(localObject5, "postInfo.toByteArray()");
    ((com.tencent.mm.plugin.story.h.j)localObject6).bk((byte[])localObject5);
    localObject5 = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxT().a((int)this.rXz.xDa, this.rXz);
    localObject5 = s.rTV;
    localObject5 = s.a((cek)localObject2);
    localObject2 = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class);
    a.f.b.j.o(localObject2, "MMKernel.service<IConfig…onfigService::class.java)");
    if ((bo.getInt(((com.tencent.mm.plugin.zero.b.a)localObject2).Nu().getValue("StoryCheckSendVideoBitrateExceed"), 0) == 1) && (!bo.isNullOrNil((String)localObject5)))
    {
      ab.i(TAG, "checkRemuxVideo, filePath:".concat(String.valueOf(localObject5)));
      localObject6 = (c.a)com.tencent.mm.plugin.story.c.a.c.rRk.Uw();
      if (localObject5 == null)
        a.f.b.j.dWJ();
      if (!((c.a)localObject6).aab((String)localObject5))
        break label640;
      ab.i(TAG, "checkRemuxVideo, exceed bitrate:".concat(String.valueOf(localObject5)));
      localObject2 = com.tencent.mm.plugin.story.g.g.sbU;
      com.tencent.mm.plugin.story.g.g.cAk();
      ((c.a)localObject6).aaa((String)localObject5);
      localObject2 = (String)localObject5 + ".remux";
      ab.i(TAG, "remux outputFilepath:".concat(String.valueOf(localObject2)));
      long l = bo.yz();
      i = SightVideoJNI.remuxing((String)localObject5, (String)localObject2, ((c.a)localObject6).eTi, ((c.a)localObject6).eTj, ((c.a)localObject6).videoBitrate, com.tencent.mm.plugin.sight.base.b.qwY, 8, 2, 25.0F, ((c.a)localObject6).eTk, null, 0, com.tencent.mm.plugin.sight.base.b.qwX);
      ab.i(TAG, "remux cost:" + bo.az(l) + "ms, ret:" + i);
      if (i < 0)
        break label566;
      com.tencent.mm.vfs.e.aQ((String)localObject2, (String)localObject5);
    }
    while (true)
    {
      for (i = 0; ; i = 1)
      {
        if (i == 0)
        {
          localObject1 = com.tencent.mm.plugin.story.g.h.scu;
          com.tencent.mm.plugin.story.g.h.cAC().aV(System.currentTimeMillis());
          new b(this.rXz, (String)localObject3, (String)localObject4, (g.a)new d(this)).cne();
        }
        AppMethodBeat.o(109479);
        break;
        label566: ((cel)localObject1).eRu += 1;
        localObject5 = this.rXz;
        localObject1 = ((cel)localObject1).toByteArray();
        a.f.b.j.o(localObject1, "postInfo.toByteArray()");
        ((com.tencent.mm.plugin.story.h.j)localObject5).bk((byte[])localObject1);
        localObject1 = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cxT().a((int)this.rXz.xDa, this.rXz);
        com.tencent.mm.vfs.e.deleteFile((String)localObject2);
        a(com.tencent.mm.loader.g.h.eRk);
      }
      label640: ab.i(TAG, "checkRemuxVideo, no need remux");
    }
  }

  public final String Pc()
  {
    AppMethodBeat.i(109480);
    int i = (int)this.rXz.xDa;
    AppMethodBeat.o(109480);
    return String.valueOf(i);
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/model/upload/UploadTask$doUploadStory$sightUpload$1", "Lcom/tencent/mm/plugin/story/model/StoryCdnUpload$ISightCdnUploadCallback;", "onSightUpLoadEnd", "", "errorCode", "", "isOk", "", "upload", "Lcom/tencent/mm/plugin/story/model/StoryCdnUpload;", "plugin-story_release"})
  public static final class d
    implements g.a
  {
    public final void a(int paramInt, boolean paramBoolean, com.tencent.mm.plugin.story.model.g paramg)
    {
      AppMethodBeat.i(109478);
      a.f.b.j.p(paramg, "upload");
      paramg = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.cAC().aW(paramInt);
      paramg = com.tencent.mm.plugin.story.g.h.scu;
      ak localak = com.tencent.mm.plugin.story.g.h.cAC();
      long l = System.currentTimeMillis();
      paramg = com.tencent.mm.plugin.story.g.h.scu;
      localak.aV(l - com.tencent.mm.plugin.story.g.h.cAC().Fu());
      paramg = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.cAD();
      if (paramBoolean)
      {
        this.rXX.a(com.tencent.mm.loader.g.h.eRj);
        AppMethodBeat.o(109478);
      }
      while (true)
      {
        return;
        this.rXX.a(com.tencent.mm.loader.g.h.eRk);
        AppMethodBeat.o(109478);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.g.e
 * JD-Core Version:    0.6.2
 */