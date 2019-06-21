package com.tencent.mm.emoji.d;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.g.a.a;
import com.tencent.mm.loader.g.a.g;
import com.tencent.mm.loader.g.a.h;
import com.tencent.mm.loader.g.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/upload/EmojiUploadManager;", "", "()V", "emojiCaptureUploadQueue", "Lcom/tencent/mm/loader/loader/LoaderCore;", "Lcom/tencent/mm/emoji/upload/EmojiCaptureUploadTask;", "uploadCallback", "com/tencent/mm/emoji/upload/EmojiUploadManager$uploadCallback$1", "Lcom/tencent/mm/emoji/upload/EmojiUploadManager$uploadCallback$1;", "addUploadTask", "", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "timeEnter", "", "plugin-emojisdk_release"})
public final class d
{
  private static final com.tencent.mm.loader.g.d<c> eAf;
  private static final d.a eAg;
  public static final d eAh;

  static
  {
    AppMethodBeat.i(63303);
    eAh = new d();
    eAf = new com.tencent.mm.loader.g.d((com.tencent.mm.loader.g.a.d)new g((com.tencent.mm.loader.g.a.c)new a(20), new h(), "EmojiUpload"));
    eAg = new d.a();
    eAf.a((f)eAg);
    AppMethodBeat.o(63303);
  }

  public static void eY(long paramLong)
  {
    AppMethodBeat.i(63302);
    ab.i(e.Ow(), "addUploadTask: ".concat(String.valueOf(paramLong)));
    Object localObject = at.dsZ();
    j.o(localObject, "EmojiStorageMgr.getInstance()");
    EmojiInfo localEmojiInfo = ((at)localObject).aUp().mU(paramLong);
    String str = e.Ow();
    StringBuilder localStringBuilder = new StringBuilder("addUploadTask: ");
    if (localEmojiInfo != null)
    {
      localObject = localEmojiInfo.Aq();
      ab.i(str, (String)localObject);
      if (localEmojiInfo == null)
        break label97;
      k(localEmojiInfo);
      AppMethodBeat.o(63302);
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label97: AppMethodBeat.o(63302);
    }
  }

  public static void k(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63301);
    j.p(paramEmojiInfo, "emojiInfo");
    ab.i(e.Ow(), "addUploadTask: " + paramEmojiInfo.Aq());
    eAf.a((com.tencent.mm.loader.g.c)new c(paramEmojiInfo));
    AppMethodBeat.o(63301);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.d.d
 * JD-Core Version:    0.6.2
 */