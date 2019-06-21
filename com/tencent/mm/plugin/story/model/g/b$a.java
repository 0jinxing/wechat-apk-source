package com.tencent.mm.plugin.story.model.g;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.plugin.story.h.a;
import com.tencent.mm.plugin.story.model.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/model/upload/StorySightCdnUpload$cdnCallback$1", "Lcom/tencent/mm/cdn/keep_TaskInfo$TaskCallback;", "callback", "", "mediaId", "", "startRet", "progressInfo", "Lcom/tencent/mm/cdn/keep_ProgressInfo;", "sceneResult", "Lcom/tencent/mm/cdn/keep_SceneResult;", "onlyCheckExist", "", "decodePrepareResponse", "", "inbuf", "getCdnAuthInfo", "", "buff", "Ljava/io/ByteArrayOutputStream;", "plugin-story_release"})
public final class b$a
  implements com.tencent.mm.i.g.a
{
  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(109443);
    j.p(paramString, "mediaId");
    if (paramInt == -21005)
    {
      ab.d(this.rXJ.TAG, "cdntra cdnCallback1 clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { this.rXJ.fFa, Integer.valueOf(paramInt), paramc, paramd });
      this.rXJ.rXI.a(0, true, (g)this.rXJ);
      AppMethodBeat.o(109443);
    }
    while (true)
    {
      return 0;
      if ((paramd != null) && (paramd.field_retCode == 0))
      {
        ab.i(this.rXJ.TAG, "cdntra cdnCallback2 clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { this.rXJ.fFa, Integer.valueOf(paramInt), paramc, paramd });
        b localb = this.rXJ;
        String str = paramd.field_fileUrl;
        j.o(str, "sceneResult.field_fileUrl");
        paramString = a.sdm;
        paramInt = a.cAU();
        paramd = paramd.field_thumbUrl;
        j.o(paramd, "sceneResult.field_thumbUrl");
        paramString = a.sdm;
        int i = a.cAU();
        StringBuilder localStringBuilder = new StringBuilder("upload_ + ");
        paramc = this.rXJ.fFa;
        paramString = paramc;
        if (paramc == null)
          paramString = "null";
        localb.a(str, paramInt, paramd, i, paramString);
        this.rXJ.rXI.a(0, true, (g)this.rXJ);
        AppMethodBeat.o(109443);
      }
      else if ((paramd != null) && (paramd.field_retCode != 0))
      {
        ab.i(this.rXJ.TAG, "cdntra cdnCallback3 clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { this.rXJ.fFa, Integer.valueOf(paramInt), paramc, paramd });
        this.rXJ.czv();
        this.rXJ.rXI.a(paramd.field_retCode, false, (g)this.rXJ);
        AppMethodBeat.o(109443);
      }
      else if (paramInt != 0)
      {
        ab.i(this.rXJ.TAG, "cdntra cdnCallback4 clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { this.rXJ.fFa, Integer.valueOf(paramInt), paramc, paramd });
        this.rXJ.czv();
        this.rXJ.rXI.a(paramInt, false, (g)this.rXJ);
        AppMethodBeat.o(109443);
      }
      else
      {
        ab.d(this.rXJ.TAG, "cdntra cdnCallback5 clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { this.rXJ.fFa, Integer.valueOf(paramInt), paramc, paramd });
        AppMethodBeat.o(109443);
      }
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    AppMethodBeat.i(109444);
    j.p(paramString, "mediaId");
    j.p(paramByteArrayOutputStream, "buff");
    AppMethodBeat.o(109444);
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(109445);
    j.p(paramString, "mediaId");
    j.p(paramArrayOfByte, "inbuf");
    AppMethodBeat.o(109445);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.g.b.a
 * JD-Core Version:    0.6.2
 */