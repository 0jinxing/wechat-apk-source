package com.tencent.mm.plugin.emoji.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;

public final class a
{
  public static boolean JW(String paramString)
  {
    AppMethodBeat.i(53866);
    boolean bool;
    if (paramString == null)
    {
      bool = false;
      AppMethodBeat.o(53866);
    }
    while (true)
    {
      return bool;
      bool = paramString.equals(bmu());
      AppMethodBeat.o(53866);
    }
  }

  public static boolean b(EmojiGroupInfo paramEmojiGroupInfo)
  {
    AppMethodBeat.i(53865);
    boolean bool;
    if (paramEmojiGroupInfo == null)
    {
      bool = false;
      AppMethodBeat.o(53865);
    }
    while (true)
    {
      return bool;
      bool = JW(paramEmojiGroupInfo.field_productID);
      AppMethodBeat.o(53865);
    }
  }

  public static boolean blE()
  {
    AppMethodBeat.i(53863);
    boolean bool = j.getEmojiStorageMgr().xYo.duy();
    AppMethodBeat.o(53863);
    return bool;
  }

  public static final String bmu()
  {
    AppMethodBeat.i(53867);
    String str = EmojiGroupInfo.yac;
    AppMethodBeat.o(53867);
    return str;
  }

  public static boolean g(EmotionSummary paramEmotionSummary)
  {
    AppMethodBeat.i(53864);
    boolean bool;
    if (paramEmotionSummary == null)
    {
      bool = false;
      AppMethodBeat.o(53864);
    }
    while (true)
    {
      return bool;
      bool = JW(paramEmotionSummary.ProductID);
      AppMethodBeat.o(53864);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.h.a
 * JD-Core Version:    0.6.2
 */