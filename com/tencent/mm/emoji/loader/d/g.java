package com.tencent.mm.emoji.loader.d;

import a.l;
import a.y;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.sync.EmojiUpdateReceiver;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/request/ProcessRequest;", "Lcom/tencent/mm/emoji/loader/request/Request;", "", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;)V", "onLoad", "success", "", "plugin-emojisdk_release"})
public final class g extends h<y>
{
  public g(EmojiInfo paramEmojiInfo)
  {
    super(paramEmojiInfo);
    AppMethodBeat.i(63216);
    AppMethodBeat.o(63216);
  }

  public final void bX(boolean paramBoolean)
  {
    AppMethodBeat.i(63215);
    Intent localIntent = new Intent();
    localIntent.setAction(EmojiUpdateReceiver.ACTION);
    localIntent.putExtra(EmojiUpdateReceiver.ezN, EmojiUpdateReceiver.ezT);
    localIntent.putExtra("md5", this.exP.Aq());
    localIntent.putExtra("result", paramBoolean);
    ah.getContext().sendBroadcast(localIntent);
    AppMethodBeat.o(63215);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.d.g
 * JD-Core Version:    0.6.2
 */