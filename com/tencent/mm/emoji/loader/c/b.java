package com.tencent.mm.emoji.loader.c;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.decode.MMGIFJNIFactory;
import com.tencent.mm.emoji.decode.MMGIFJNIFactory.Companion;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.IOException;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/fetcher/EmojiCoverFetcher;", "", "()V", "fetch", "Lcom/tencent/mm/emoji/loader/request/Request;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "", "readFromCache", "Companion", "plugin-emojisdk_release"})
public final class b
{
  public static final a exG;

  static
  {
    AppMethodBeat.i(63178);
    exG = new a((byte)0);
    AppMethodBeat.o(63178);
  }

  public static final boolean d(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63179);
    boolean bool = a.d(paramEmojiInfo);
    AppMethodBeat.o(63179);
    return bool;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/fetcher/EmojiCoverFetcher$Companion;", "", "()V", "ThumbSize", "", "createThumb", "", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "plugin-emojisdk_release"})
  public static final class a
  {
    public static boolean d(EmojiInfo paramEmojiInfo)
    {
      boolean bool = true;
      AppMethodBeat.i(63176);
      j.p(paramEmojiInfo, "emojiInfo");
      ab.i("MicroMsg.EmojiCoverFetcher", "createThumb: " + paramEmojiInfo.Aq());
      Object localObject1 = MMGIFJNIFactory.Companion.getDecoder(paramEmojiInfo);
      if (!MMGIFJNIFactory.Companion.isValid((com.tencent.mm.emoji.decode.b)localObject1))
      {
        ((com.tencent.mm.emoji.decode.b)localObject1).destroy();
        AppMethodBeat.o(63176);
        bool = false;
      }
      while (true)
      {
        return bool;
        ((com.tencent.mm.emoji.decode.b)localObject1).Or();
        Object localObject2 = ((com.tencent.mm.emoji.decode.b)localObject1).Os();
        ((com.tencent.mm.emoji.decode.b)localObject1).destroy();
        try
        {
          d.a((Bitmap)localObject2, 100, Bitmap.CompressFormat.PNG, paramEmojiInfo.dvf(), false);
          if (((Bitmap)localObject2).getWidth() <= 120)
          {
            localObject1 = localObject2;
            if (((Bitmap)localObject2).getHeight() <= 120);
          }
          else
          {
            localObject2 = d.a((Bitmap)localObject2, 120, 120, false, true);
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              AppMethodBeat.o(63176);
              bool = false;
              continue;
            }
          }
          localObject2 = com.tencent.mm.emoji.loader.a.b.exB;
          com.tencent.mm.emoji.loader.a.b.c(paramEmojiInfo.Aq(), (Bitmap)localObject1);
          AppMethodBeat.o(63176);
        }
        catch (IOException paramEmojiInfo)
        {
          ab.printErrStackTrace("MicroMsg.EmojiCoverFetcher", (Throwable)paramEmojiInfo, "saveBitmapToImage failed", new Object[0]);
          AppMethodBeat.o(63176);
          bool = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.c.b
 * JD-Core Version:    0.6.2
 */