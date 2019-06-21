package com.tencent.mm.plugin.story.model.g;

import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.f;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.story.c.a.c;
import com.tencent.mm.plugin.story.c.a.c.a;
import com.tencent.mm.plugin.story.h.a.e;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cel;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/upload/StorySightCdnUpload;", "Lcom/tencent/mm/plugin/story/model/StoryCdnUpload;", "storyInfo", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "mPath", "", "thumbPath", "callback", "Lcom/tencent/mm/plugin/story/model/StoryCdnUpload$ISightCdnUploadCallback;", "(Lcom/tencent/mm/plugin/story/storage/StoryInfo;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/story/model/StoryCdnUpload$ISightCdnUploadCallback;)V", "TAG", "cdnCallback", "com/tencent/mm/plugin/story/model/upload/StorySightCdnUpload$cdnCallback$1", "Lcom/tencent/mm/plugin/story/model/upload/StorySightCdnUpload$cdnCallback$1;", "cdnMediaType", "", "clientId", "mMd5", "postinfo", "Lcom/tencent/mm/protocal/protobuf/StoryMediaPostInfo;", "sendScene", "st_new", "", "startTime", "useCdnTransClientId", "checkUpload", "", "doUpload", "extInfo", "Lcom/tencent/mm/protocal/protobuf/MMSightExtInfo;", "onErrorServer", "", "errCode", "onPostScene", "url", "urlType", "thumbUrl", "thumbType", "meidiaId", "updateMd5Info", "updatePostInfo", "isOk", "plugin-story_release"})
public final class b
  implements com.tencent.mm.plugin.story.model.g
{
  final String TAG;
  private String clientId;
  String fFa;
  private int fWD;
  private String hxH;
  private final String mPath;
  private long qKa;
  private cel rXG;
  private final b.a rXH;
  final com.tencent.mm.plugin.story.model.g.a rXI;
  private final com.tencent.mm.plugin.story.h.j rXz;
  private final String thumbPath;

  public b(com.tencent.mm.plugin.story.h.j paramj, String paramString1, String paramString2, com.tencent.mm.plugin.story.model.g.a parama)
  {
    AppMethodBeat.i(109449);
    this.rXz = paramj;
    this.mPath = paramString1;
    this.thumbPath = paramString2;
    this.rXI = parama;
    this.clientId = "";
    this.hxH = "";
    this.rXG = new cel();
    this.TAG = "MicroMsg.StorySightCdnUpload";
    this.rXH = new b.a(this);
    this.qKa = cb.aaE();
    this.rXG = this.rXz.cBU();
    paramString1 = this.rXG.ptv;
    paramj = paramString1;
    if (paramString1 == null)
      paramj = "";
    this.clientId = paramj;
    paramString1 = this.rXG.cvZ;
    paramj = paramString1;
    if (paramString1 == null)
      paramj = "";
    this.hxH = paramj;
    if (bo.isNullOrNil(this.clientId))
    {
      paramj = bo.yz();
      paramString1 = a.k.d.UTF_8;
      if (paramj == null)
      {
        paramj = new v("null cannot be cast to non-null type java.lang.String");
        AppMethodBeat.o(109449);
        throw paramj;
      }
      paramj = paramj.getBytes(paramString1);
      a.f.b.j.o(paramj, "(this as java.lang.String).getBytes(charset)");
      this.clientId = com.tencent.mm.a.g.x(paramj);
      this.rXG.ptv = this.clientId;
    }
    try
    {
      paramString1 = this.rXz;
      paramj = this.rXG.toByteArray();
      a.f.b.j.o(paramj, "postinfo.toByteArray()");
      paramString1.bk(paramj);
      paramj = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cxT().a((int)this.rXz.xDa, this.rXz);
      int i = (int)e.asZ(this.mPath);
      ab.i(this.TAG, "storyUpload  videopath %s sightFileSize %d md5 %s", new Object[] { this.mPath, Integer.valueOf(i), this.hxH });
      AppMethodBeat.o(109449);
      return;
    }
    catch (Exception paramj)
    {
      while (true)
        ab.printErrStackTrace(this.TAG, (Throwable)paramj, "", new Object[0]);
    }
  }

  public final boolean a(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3)
  {
    AppMethodBeat.i(109447);
    a.f.b.j.p(paramString1, "url");
    a.f.b.j.p(paramString2, "thumbUrl");
    a.f.b.j.p(paramString3, "meidiaId");
    ab.d(this.TAG, "upload ok " + paramString1 + "  " + paramString3 + "  " + paramInt1);
    Object localObject = this.rXG;
    paramString3 = a.e.sdz;
    ((cel)localObject).wFD = a.e.cBz();
    this.rXG.eRu = 0;
    this.rXG.wFi = cb.aaF();
    localObject = this.rXz;
    paramString3 = this.rXG.toByteArray();
    a.f.b.j.o(paramString3, "postinfo.toByteArray()");
    ((com.tencent.mm.plugin.story.h.j)localObject).bk(paramString3);
    paramString3 = (cek)this.rXz.cBR().xeA.wbK.get(0);
    paramString3.Url = paramString1;
    paramString3.jCt = paramInt1;
    paramString3.wEH = paramString2;
    paramString3.jCt = paramInt2;
    f.afy();
    paramString3.wFc = com.tencent.mm.al.a.rJ(this.mPath);
    ab.i(this.TAG, "mediaObj.videomd5 " + paramString3.wFc);
    paramString1 = this.rXz.cBR();
    paramString1.xeA.wbK.set(0, paramString3);
    this.rXz.b(paramString1);
    paramString1 = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxT().a((int)this.rXz.xDa, this.rXz);
    AppMethodBeat.o(109447);
    return true;
  }

  public final boolean cne()
  {
    AppMethodBeat.i(109448);
    Object localObject1 = com.tencent.mm.a.g.cz(this.mPath);
    boolean bool;
    if ((!bo.isNullOrNil(this.hxH)) && ((a.f.b.j.j(this.hxH, localObject1) ^ true)))
    {
      ab.i(this.TAG, "checkUpload isNotSafeSightVideo old srcmd5 %s newmd5 %s ", new Object[] { this.hxH, localObject1 });
      czv();
      this.rXI.a(-2, false, (com.tencent.mm.plugin.story.model.g)this);
      AppMethodBeat.o(109448);
      bool = false;
    }
    while (true)
    {
      return bool;
      localObject1 = new baa();
      ab.i(this.TAG, "check upload %s %d %s", new Object[] { this.mPath, Integer.valueOf(((baa)localObject1).wDQ), Boolean.valueOf(((baa)localObject1).wDP) });
      Object localObject2 = com.tencent.mm.plugin.sight.base.d.WR(this.mPath);
      if (localObject2 != null)
        ab.i(this.TAG, "mediaInfo: %s", new Object[] { localObject2 });
      if ((this.rXG.xei & 0x1) == 0)
        SightVideoJNI.optimizeMP4(this.mPath);
      try
      {
        localObject2 = com.tencent.mm.a.g.cz(this.mPath);
        a.f.b.j.o(localObject2, "MD5.getMD5(mPath)");
        this.hxH = ((String)localObject2);
        this.rXG.cvZ = this.hxH;
        this.rXG.xei |= 1;
        Object localObject3 = this.rXz;
        localObject2 = this.rXG.toByteArray();
        a.f.b.j.o(localObject2, "postinfo.toByteArray()");
        ((com.tencent.mm.plugin.story.h.j)localObject3).bk((byte[])localObject2);
        ab.i(this.TAG, "new md5 is %s %s", new Object[] { this.mPath, this.hxH });
        localObject2 = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cxT().a((int)this.rXz.xDa, this.rXz);
        this.fFa = this.clientId;
        localObject2 = new com.tencent.mm.i.g();
        ((com.tencent.mm.i.g)localObject2).egl = ((com.tencent.mm.i.g.a)this.rXH);
        ((com.tencent.mm.i.g)localObject2).field_mediaId = this.fFa;
        ((com.tencent.mm.i.g)localObject2).field_fullpath = this.mPath;
        ((com.tencent.mm.i.g)localObject2).field_thumbpath = this.thumbPath;
        ((com.tencent.mm.i.g)localObject2).field_fileType = 20302;
        ((com.tencent.mm.i.g)localObject2).field_talker = "";
        ((com.tencent.mm.i.g)localObject2).field_priority = com.tencent.mm.i.a.efC;
        ((com.tencent.mm.i.g)localObject2).field_needStorage = true;
        ((com.tencent.mm.i.g)localObject2).field_isStreamMedia = false;
        ((com.tencent.mm.i.g)localObject2).field_appType = 205;
        ((com.tencent.mm.i.g)localObject2).field_bzScene = 2;
        localObject3 = (c.a)c.rRk.Uw();
        if (localObject3 != null)
        {
          ab.i(this.TAG, "StoryEncodeElementConfig " + ((c.a)localObject3).duration);
          ((com.tencent.mm.i.g)localObject2).field_largesvideo = (((c.a)localObject3).duration + 3);
          ((com.tencent.mm.i.g)localObject2).egy = 6;
          localObject3 = com.tencent.mm.a.g.cz(this.mPath);
          if ((bo.isNullOrNil(this.hxH)) || (!(a.f.b.j.j(this.hxH, localObject3) ^ true)))
            break label592;
          ab.i(this.TAG, "isNotSafeSightVideo old srcmd5 %s newmd5 %s ", new Object[] { this.hxH, localObject3 });
          czv();
          this.rXI.a(-2, false, (com.tencent.mm.plugin.story.model.g)this);
          AppMethodBeat.o(109448);
          bool = false;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e(this.TAG, "parseFrom MediaUploadInfo error in updateMd5Info %s", new Object[] { localException.getMessage() });
          continue;
          localException.field_largesvideo = 18;
        }
        label592: ab.d(this.TAG, "will addSendTask");
        if (!f.afx().e(localException))
        {
          ab.e(this.TAG, "cdntra addSendTask failed. clientid:%s", new Object[] { this.fFa });
          this.rXI.a(-3, false, (com.tencent.mm.plugin.story.model.g)this);
          AppMethodBeat.o(109448);
          bool = false;
        }
        else if (!((baa)localObject1).wDP);
      }
    }
    for (int i = 4; ; i = 5)
    {
      this.fWD = i;
      AppMethodBeat.o(109448);
      bool = true;
      break;
    }
  }

  final void czv()
  {
    AppMethodBeat.i(109446);
    ab.i(this.TAG, "snsupload sight by cdn error! " + bo.dpG());
    try
    {
      this.rXG.eRu += 1;
      Object localObject1 = this.rXG;
      Object localObject2 = a.e.sdz;
      ((cel)localObject1).wFD = a.e.cBA();
      localObject1 = this.rXz;
      localObject2 = this.rXG.toByteArray();
      a.f.b.j.o(localObject2, "postinfo.toByteArray()");
      ((com.tencent.mm.plugin.story.h.j)localObject1).bk((byte[])localObject2);
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cxT().a((int)this.rXz.xDa, this.rXz);
      AppMethodBeat.o(109446);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)localException, "", new Object[0]);
        AppMethodBeat.o(109446);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.g.b
 * JD-Core Version:    0.6.2
 */