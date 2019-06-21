package com.tencent.mm.plugin.emoji.ui;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.i;

final class EmojiStoreTopicUI$2
  implements i
{
  EmojiStoreTopicUI$2(EmojiStoreTopicUI paramEmojiStoreTopicUI)
  {
  }

  public final void a(String paramString, View paramView, Bitmap paramBitmap, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(53492);
    paramString = this.lbP;
    if (paramString.kZl != null)
      paramString.kZl.sendEmptyMessage(1009);
    AppMethodBeat.o(53492);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI.2
 * JD-Core Version:    0.6.2
 */