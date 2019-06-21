package com.tencent.mm.plugin.story.model.g;

import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.g.b.a.al;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.story.e.b.a;
import com.tencent.mm.plugin.story.h.a.a;
import com.tencent.mm.plugin.story.h.a.c;
import com.tencent.mm.plugin.story.h.i;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.m;
import com.tencent.mm.plugin.story.model.q;
import com.tencent.mm.plugin.story.model.q.a;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cei;
import com.tencent.mm.protocal.protobuf.cej;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cel;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.regex.Pattern;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/upload/UploadPackHelper;", "", "()V", "extInfo", "Lcom/tencent/mm/protocal/protobuf/MMSightExtInfo;", "postInfo", "Lcom/tencent/mm/protocal/protobuf/StoryMediaPostInfo;", "storyInfo", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "timelineInfo", "Lcom/tencent/mm/protocal/protobuf/StoryTimelineObject;", "checkToCreateDir", "", "newVideoPath", "", "commit", "", "createStory", "", "storyEditorData", "Lcom/tencent/mm/plugin/story/storage/StoryEditorData;", "thumbPath", "path", "videoMd5", "setEditorData", "editorInfo", "Lcom/tencent/mm/protocal/protobuf/StoryMediaEditorInfo;", "setFavorite", "favorite", "setLocation", "location", "Lcom/tencent/mm/protocal/protobuf/StoryLocation;", "setPublishObjId", "publishObjId", "setScope", "scope", "setSightExtInfo", "Companion", "plugin-story_release"})
public final class d
{
  private static final String TAG = "MicroMsg.StoryUploadPackHelper";
  private static final Pattern gIU;
  public static final d.a rXT;
  private cel rXR;
  private cfb rXS;
  private com.tencent.mm.plugin.story.h.j rXz;
  private baa rkB;

  static
  {
    AppMethodBeat.i(109475);
    rXT = new d.a((byte)0);
    TAG = "MicroMsg.StoryUploadPackHelper";
    gIU = Pattern.compile("(\n){3,}");
    AppMethodBeat.o(109475);
  }

  public d()
  {
    AppMethodBeat.i(109474);
    this.rXz = new com.tencent.mm.plugin.story.h.j();
    this.rXz.cBS();
    Object localObject1 = this.rXz;
    Object localObject2 = com.tencent.mm.plugin.story.h.a.sdm;
    int i = com.tencent.mm.plugin.story.h.a.cAO();
    localObject2 = com.tencent.mm.plugin.story.h.a.sdm;
    ((com.tencent.mm.plugin.story.h.j)localObject1).DF(i | com.tencent.mm.plugin.story.h.a.cAQ());
    localObject1 = this.rXz;
    localObject2 = com.tencent.mm.plugin.story.model.j.rST;
    ((com.tencent.mm.plugin.story.h.j)localObject1).field_userName = j.a.cnk();
    this.rXz.field_createTime = cb.aaF();
    this.rXR = new cel();
    this.rkB = new baa();
    localObject1 = this.rXR;
    Object localObject3 = new StringBuilder();
    localObject2 = com.tencent.mm.plugin.story.model.j.rST;
    localObject2 = j.a.cnk() + bo.yz() + cb.aaE();
    localObject3 = a.k.d.UTF_8;
    if (localObject2 == null)
    {
      localObject1 = new v("null cannot be cast to non-null type java.lang.String");
      AppMethodBeat.o(109474);
      throw ((Throwable)localObject1);
    }
    localObject2 = ((String)localObject2).getBytes((Charset)localObject3);
    a.f.b.j.o(localObject2, "(this as java.lang.String).getBytes(charset)");
    ((cel)localObject1).ptv = g.x((byte[])localObject2);
    localObject1 = q.rTk;
    this.rXS = q.a.cyq();
    localObject1 = this.rXS;
    localObject2 = com.tencent.mm.plugin.story.model.j.rST;
    ((cfb)localObject1).jBB = j.a.cnk();
    this.rXS.pcX = this.rXz.field_createTime;
    localObject1 = com.tencent.mm.plugin.story.g.h.scu;
    localObject2 = com.tencent.mm.plugin.story.g.h.cAm().Fv();
    localObject1 = localObject2;
    if (localObject2 == null)
      localObject1 = "";
    a.f.b.j.p(localObject1, "publishObjId");
    this.rXS.xeB = ((String)localObject1);
    ab.d(TAG, "storyInfo.createTime=%s timelineInfo.CreateTime=%s", new Object[] { Integer.valueOf(this.rXz.field_createTime), Integer.valueOf(this.rXS.pcX) });
    AppMethodBeat.o(109474);
  }

  private static void Yw(String paramString)
  {
    AppMethodBeat.i(109468);
    e.tf(e.atb(paramString));
    AppMethodBeat.o(109468);
  }

  public final void EM(int paramInt)
  {
    this.rXS.xeC = paramInt;
  }

  public final void EN(int paramInt)
  {
    AppMethodBeat.i(138797);
    this.rXS.xeD = paramInt;
    if (paramInt == 1)
    {
      com.tencent.mm.plugin.story.h.j localj = this.rXz;
      a.a locala = com.tencent.mm.plugin.story.h.a.sdm;
      localj.Fc(com.tencent.mm.plugin.story.h.a.cBn());
    }
    AppMethodBeat.o(138797);
  }

  public final d a(cei paramcei)
  {
    if (paramcei != null)
      this.rXS.xez = paramcei;
    return this;
  }

  public final void a(cej paramcej)
  {
    AppMethodBeat.i(109471);
    a.f.b.j.p(paramcej, "editorInfo");
    this.rXR.xej = paramcej;
    AppMethodBeat.o(109471);
  }

  public final boolean a(com.tencent.mm.plugin.story.h.d paramd, String paramString)
  {
    AppMethodBeat.i(109473);
    a.f.b.j.p(paramd, "storyEditorData");
    a.f.b.j.p(paramString, "thumbPath");
    Object localObject1 = q.rTk;
    localObject1 = new cek();
    Object localObject2 = new StringBuilder();
    Object localObject3 = com.tencent.mm.plugin.story.e.c.rRS;
    localObject3 = ((StringBuilder)localObject2).append(com.tencent.mm.plugin.story.e.c.cxr());
    localObject2 = cb.aaE() + '-' + bo.yz();
    Charset localCharset = a.k.d.UTF_8;
    if (localObject2 == null)
    {
      paramd = new v("null cannot be cast to non-null type java.lang.String");
      AppMethodBeat.o(109473);
      throw paramd;
    }
    localObject2 = ((String)localObject2).getBytes(localCharset);
    a.f.b.j.o(localObject2, "(this as java.lang.String).getBytes(charset)");
    ((cek)localObject1).Id = g.x((byte[])localObject2);
    localObject3 = com.tencent.mm.plugin.story.model.l.rTg;
    localObject3 = com.tencent.mm.plugin.story.model.l.aas(((cek)localObject1).Id);
    Yw((String)localObject3);
    e.y(paramString, (String)localObject3);
    ((cek)localObject1).cNE = ((int)paramd.xDa);
    this.rXS.xeA.wbK.add(localObject1);
    paramString = this.rXz;
    int i = paramString.field_localFlag;
    paramd = a.c.sds;
    paramString.field_localFlag = (i | a.c.cBw());
    paramString = this.rXz;
    i = paramString.field_localFlag;
    paramd = a.c.sds;
    paramString.field_localFlag = (i & (a.c.cBu() ^ 0xFFFFFFFF));
    AppMethodBeat.o(109473);
    return true;
  }

  public final boolean am(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(109472);
    a.f.b.j.p(paramString1, "path");
    a.f.b.j.p(paramString2, "thumbPath");
    a.f.b.j.p(paramString3, "videoMd5");
    paramString3 = q.rTk;
    paramString3 = new cek();
    Object localObject1 = new StringBuilder();
    Object localObject2 = com.tencent.mm.plugin.story.e.c.rRS;
    localObject1 = ((StringBuilder)localObject1).append(com.tencent.mm.plugin.story.e.c.cxr());
    Object localObject3 = cb.aaE() + '-' + bo.yz();
    localObject2 = a.k.d.UTF_8;
    if (localObject3 == null)
    {
      paramString1 = new v("null cannot be cast to non-null type java.lang.String");
      AppMethodBeat.o(109472);
      throw paramString1;
    }
    localObject2 = ((String)localObject3).getBytes((Charset)localObject2);
    a.f.b.j.o(localObject2, "(this as java.lang.String).getBytes(charset)");
    paramString3.Id = g.x((byte[])localObject2);
    localObject1 = com.tencent.mm.plugin.story.model.l.rTg;
    localObject1 = com.tencent.mm.plugin.story.model.l.aat(paramString3.Id);
    localObject2 = com.tencent.mm.plugin.story.model.l.rTg;
    localObject2 = com.tencent.mm.plugin.story.model.l.aas(paramString3.Id);
    localObject3 = com.tencent.mm.plugin.story.model.l.rTg;
    com.tencent.mm.plugin.story.model.l.aax((String)localObject1);
    localObject3 = com.tencent.mm.plugin.story.model.l.rTg;
    com.tencent.mm.plugin.story.model.l.aax((String)localObject2);
    Yw((String)localObject1);
    Yw((String)localObject2);
    e.y(paramString1, (String)localObject1);
    e.y(paramString2, (String)localObject2);
    paramString3.duration = (com.tencent.mm.plugin.sight.base.d.WR((String)localObject1).eWK / 1000.0F);
    this.rXS.xeA.wbK.add(paramString3);
    AppMethodBeat.o(109472);
    return true;
  }

  public final void b(baa parambaa)
  {
    AppMethodBeat.i(109470);
    a.f.b.j.p(parambaa, "extInfo");
    this.rkB = parambaa;
    AppMethodBeat.o(109470);
  }

  public final int commit()
  {
    AppMethodBeat.i(109469);
    try
    {
      this.rXR.wFi = cb.aaF();
      this.rXR.eRu = 0;
      Object localObject1 = this.rXz;
      Object localObject2 = this.rXR.toByteArray();
      a.f.b.j.o(localObject2, "postInfo.toByteArray()");
      ((com.tencent.mm.plugin.story.h.j)localObject1).bk((byte[])localObject2);
      this.rXz.b(this.rXS);
      localObject2 = com.tencent.mm.plugin.story.model.j.rST;
      int i = j.a.cxT().d(this.rXz);
      localObject2 = com.tencent.mm.plugin.story.model.j.rST;
      localObject2 = j.a.cya();
      com.tencent.mm.ab.b.a((a.f.a.a)new c.e((c)localObject2, i));
      ((c)localObject2).checkPost();
      localObject2 = m.rTh;
      localObject1 = this.rXz;
      a.f.b.j.p(localObject1, "storyInfo");
      if (i != -1)
      {
        localObject2 = com.tencent.mm.plugin.story.e.b.rRO;
        String str = b.a.j(Integer.valueOf(((com.tencent.mm.plugin.story.h.j)localObject1).field_createTime));
        ab.d(m.access$getTAG$cp(), "insertByLocalStory date=".concat(String.valueOf(str)));
        localObject2 = com.tencent.mm.plugin.story.model.j.rST;
        localObject1 = j.a.cxZ().aaZ(str);
        localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = new com.tencent.mm.plugin.story.h.h();
        a.f.b.j.p(str, "value");
        ((com.tencent.mm.plugin.story.h.h)localObject2).field_date = str;
        ((com.tencent.mm.plugin.story.h.h)localObject2).field_count += 1;
        ab.d(m.access$getTAG$cp(), "storyHistory.count=" + ((com.tencent.mm.plugin.story.h.h)localObject2).field_count);
        localObject1 = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cxZ().a((com.tencent.mm.plugin.story.h.h)localObject2);
      }
      ab.d(TAG, "save story to db: ".concat(String.valueOf(i)));
      AppMethodBeat.o(109469);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace(TAG, (Throwable)localException, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.g.d
 * JD-Core Version:    0.6.2
 */