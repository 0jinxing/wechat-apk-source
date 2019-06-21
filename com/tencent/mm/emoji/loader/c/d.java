package com.tencent.mm.emoji.loader.c;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/fetcher/EmojiFetcherConfig;", "", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "url", "", "path", "authKey", "fetcherType", "", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAuthKey", "()Ljava/lang/String;", "getEmojiInfo", "()Lcom/tencent/mm/storage/emotion/EmojiInfo;", "getFetcherType", "()I", "getPath", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "plugin-emojisdk_release"})
public final class d
{
  final EmojiInfo exP;
  final String exQ;
  final int exR;
  final String path;
  final String url;

  public d(EmojiInfo paramEmojiInfo, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(63181);
    this.exP = paramEmojiInfo;
    this.url = paramString1;
    this.path = paramString2;
    this.exQ = paramString3;
    this.exR = paramInt;
    AppMethodBeat.o(63181);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(63184);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof d))
        break label111;
      paramObject = (d)paramObject;
      if ((!j.j(this.exP, paramObject.exP)) || (!j.j(this.url, paramObject.url)) || (!j.j(this.path, paramObject.path)) || (!j.j(this.exQ, paramObject.exQ)))
        break label111;
      if (this.exR == paramObject.exR)
      {
        i = 1;
        if (i == 0)
          break label111;
      }
    }
    else
    {
      AppMethodBeat.o(63184);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label111: AppMethodBeat.o(63184);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(63183);
    Object localObject = this.exP;
    int j;
    int k;
    if (localObject != null)
    {
      j = localObject.hashCode();
      localObject = this.url;
      if (localObject == null)
        break label106;
      k = localObject.hashCode();
      label36: localObject = this.path;
      if (localObject == null)
        break label112;
    }
    label106: label112: for (int m = localObject.hashCode(); ; m = 0)
    {
      localObject = this.exQ;
      if (localObject != null)
        i = localObject.hashCode();
      int n = this.exR;
      AppMethodBeat.o(63183);
      return ((m + (k + j * 31) * 31) * 31 + i) * 31 + n;
      j = 0;
      break;
      k = 0;
      break label36;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(63182);
    String str = "EmojiFetcherConfig(emojiInfo=" + this.exP + ", url=" + this.url + ", path=" + this.path + ", authKey=" + this.exQ + ", fetcherType=" + this.exR + ")";
    AppMethodBeat.o(63182);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.c.d
 * JD-Core Version:    0.6.2
 */