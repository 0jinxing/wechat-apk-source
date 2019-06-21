package com.tencent.mm.emoji.loader.f;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/verify/EmojiVerifyConfig;", "", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "verifyMd5", "", "needDecrypt", "", "aesKey", "path", "tempPath", "fetcherType", "", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAesKey", "()Ljava/lang/String;", "getEmojiInfo", "()Lcom/tencent/mm/storage/emotion/EmojiInfo;", "getFetcherType", "()I", "getNeedDecrypt", "()Z", "getPath", "getTempPath", "getVerifyMd5", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "plugin-emojisdk_release"})
public final class b
{
  final EmojiInfo exP;
  final int exR;
  final String eyp;
  final boolean eyq;
  final String eyr;
  final String eys;
  final String path;

  public b(EmojiInfo paramEmojiInfo, String paramString1, boolean paramBoolean, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    AppMethodBeat.i(63231);
    this.exP = paramEmojiInfo;
    this.eyp = paramString1;
    this.eyq = paramBoolean;
    this.eyr = paramString2;
    this.path = paramString3;
    this.eys = paramString4;
    this.exR = paramInt;
    AppMethodBeat.o(63231);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(63234);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof b))
        break label147;
      paramObject = (b)paramObject;
      if ((!j.j(this.exP, paramObject.exP)) || (!j.j(this.eyp, paramObject.eyp)))
        break label147;
      if (this.eyq == paramObject.eyq)
      {
        i = 1;
        if ((i == 0) || (!j.j(this.eyr, paramObject.eyr)) || (!j.j(this.path, paramObject.path)) || (!j.j(this.eys, paramObject.eys)))
          break label147;
        if (this.exR != paramObject.exR)
          break label142;
        i = 1;
        label124: if (i == 0)
          break label147;
      }
    }
    else
    {
      AppMethodBeat.o(63234);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label142: i = 0;
      break label124;
      label147: AppMethodBeat.o(63234);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(63233);
    Object localObject = this.exP;
    int j;
    int k;
    label36: int i1;
    int n;
    if (localObject != null)
    {
      j = localObject.hashCode();
      localObject = this.eyp;
      if (localObject == null)
        break label151;
      k = localObject.hashCode();
      int m = this.eyq;
      i1 = m;
      if (m != 0)
        i1 = 1;
      localObject = this.eyr;
      if (localObject == null)
        break label157;
      n = localObject.hashCode();
      label69: localObject = this.path;
      if (localObject == null)
        break label163;
    }
    label151: label157: label163: for (int i2 = localObject.hashCode(); ; i2 = 0)
    {
      localObject = this.eys;
      if (localObject != null)
        i = localObject.hashCode();
      int i3 = this.exR;
      AppMethodBeat.o(63233);
      return ((i2 + (n + (i1 + (k + j * 31) * 31) * 31) * 31) * 31 + i) * 31 + i3;
      j = 0;
      break;
      k = 0;
      break label36;
      n = 0;
      break label69;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(63232);
    String str = "EmojiVerifyConfig(emojiInfo=" + this.exP + ", verifyMd5=" + this.eyp + ", needDecrypt=" + this.eyq + ", aesKey=" + this.eyr + ", path=" + this.path + ", tempPath=" + this.eys + ", fetcherType=" + this.exR + ")";
    AppMethodBeat.o(63232);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.f.b
 * JD-Core Version:    0.6.2
 */