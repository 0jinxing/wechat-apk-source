package com.tencent.mm.emoji.loader.f;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.loader.c.h;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/verify/EmojiVerifyFactory;", "", "()V", "createVerifyConfig", "Lcom/tencent/mm/emoji/loader/verify/EmojiVerifyConfig;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "verify", "", "plugin-emojisdk_release"})
public final class c
{
  public static final c eyt;

  static
  {
    AppMethodBeat.i(63236);
    eyt = new c();
    AppMethodBeat.o(63236);
  }

  public static boolean i(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63235);
    j.p(paramEmojiInfo, "emojiInfo");
    a locala = new a();
    j.p(paramEmojiInfo, "emojiInfo");
    Object localObject1 = paramEmojiInfo.Aq();
    String str1 = paramEmojiInfo.dve() + "_temp";
    int i;
    boolean bool;
    if (h.f(paramEmojiInfo))
    {
      i = 3;
      bool = true;
    }
    while (true)
    {
      Object localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = "";
      Object localObject3 = paramEmojiInfo.field_aeskey;
      localObject1 = localObject3;
      if (localObject3 == null)
        localObject1 = "";
      String str2 = paramEmojiInfo.dve();
      localObject3 = str2;
      if (str2 == null)
        localObject3 = "";
      bool = locala.a(new b(paramEmojiInfo, (String)localObject2, bool, (String)localObject1, (String)localObject3, str1, i));
      AppMethodBeat.o(63235);
      return bool;
      if (h.g(paramEmojiInfo))
      {
        localObject1 = paramEmojiInfo.field_externMd5;
        i = 2;
        bool = true;
      }
      else if (h.h(paramEmojiInfo))
      {
        i = 1;
        bool = true;
      }
      else
      {
        i = 0;
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.f.c
 * JD-Core Version:    0.6.2
 */