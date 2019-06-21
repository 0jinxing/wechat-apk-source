package com.tencent.mm.emoji.loader.c;

import a.f.a.b;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.c;
import com.tencent.mm.i.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.ByteArrayOutputStream;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/emoji/loader/fetcher/EmojiCdnFetcher$cdnCallback$1", "Lcom/tencent/mm/cdn/keep_TaskInfo$TaskCallback;", "callback", "", "mediaId", "", "startRet", "progressInfo", "Lcom/tencent/mm/cdn/keep_ProgressInfo;", "sceneResult", "Lcom/tencent/mm/cdn/keep_SceneResult;", "onlyCheckExist", "", "decodePrepareResponse", "", "inbuf", "getCdnAuthInfo", "", "buff", "Ljava/io/ByteArrayOutputStream;", "plugin-emojisdk_release"})
public final class a$a
  implements g.a
{
  public final int a(String paramString, int paramInt, c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(63172);
    ab.d(this.exF.TAG, "callback " + paramInt + ' ' + paramc + ' ' + paramd);
    if ((paramInt == 0) && (paramd != null) && (paramd.field_retCode == 0))
    {
      ab.i(this.exF.TAG, "download " + a.a(this.exF).exP.Aq() + " finish");
      paramString = a.b(this.exF);
      if (paramString != null)
        paramString.am(Boolean.TRUE);
      AppMethodBeat.o(63172);
    }
    while (true)
    {
      return 0;
      if ((paramInt != 0) || ((paramd != null) && (paramd.field_retCode != 0)))
      {
        paramString = a.b(this.exF);
        if (paramString != null)
          paramString.am(Boolean.FALSE);
      }
      AppMethodBeat.o(63172);
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return new byte[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.c.a.a
 * JD-Core Version:    0.6.2
 */