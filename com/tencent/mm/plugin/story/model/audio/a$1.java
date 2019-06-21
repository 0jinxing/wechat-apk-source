package com.tencent.mm.plugin.story.model.audio;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.io.ByteArrayOutputStream;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/model/audio/AudioDownloadTask$2", "Lcom/tencent/mm/cdn/keep_TaskInfo$TaskCallback;", "callback", "", "mediaId", "", "startRet", "progressInfo", "Lcom/tencent/mm/cdn/keep_ProgressInfo;", "sceneResult", "Lcom/tencent/mm/cdn/keep_SceneResult;", "onlyCheckExist", "", "decodePrepareResponse", "", "inbuf", "getCdnAuthInfo", "", "buff", "Ljava/io/ByteArrayOutputStream;", "plugin-story_release"})
public final class a$1
  implements g.a
{
  a$1(String paramString1, String paramString2)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(109177);
    j.p(paramString, "mediaId");
    String str1 = this.rUm.TAG;
    Object localObject;
    if (paramc != null)
    {
      localObject = paramc.toString();
      paramc = (c)localObject;
      if (localObject != null);
    }
    else
    {
      paramc = "null";
    }
    if (paramd != null)
    {
      String str2 = paramd.toString();
      localObject = str2;
      if (str2 != null);
    }
    else
    {
      localObject = "null";
    }
    ab.d(str1, "AudioDownloadTask on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", new Object[] { paramString, Integer.valueOf(paramInt), paramc, localObject });
    if (paramd != null)
      if (paramd.field_retCode == 0)
      {
        ab.i(this.rUm.TAG, "download success " + paramString + ' ' + this.rUn);
        e.aQ(this.rUo, this.rUn);
        a.a(this.rUm, true, this.rUn);
      }
    while (true)
    {
      AppMethodBeat.o(109177);
      return 0;
      ab.w(this.rUm.TAG, "download fail sceneResult " + paramd.field_retCode);
      a.a(this.rUm, false, null);
      continue;
      if (paramInt != 0)
      {
        ab.w(this.rUm.TAG, "download fail startRet ".concat(String.valueOf(paramInt)));
        a.a(this.rUm, false, null);
      }
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    AppMethodBeat.i(109178);
    j.p(paramString, "mediaId");
    j.p(paramByteArrayOutputStream, "buff");
    AppMethodBeat.o(109178);
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(109179);
    j.p(paramString, "mediaId");
    j.p(paramArrayOfByte, "inbuf");
    AppMethodBeat.o(109179);
    return new byte[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.audio.a.1
 * JD-Core Version:    0.6.2
 */