package com.tencent.mm.plugin.emoji.ui;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.i;
import com.tencent.mm.sdk.platformtools.ab;

final class EmojiStoreDetailUI$20
  implements i
{
  EmojiStoreDetailUI$20(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
  }

  public final void a(String paramString, View paramView, Bitmap paramBitmap, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(53437);
    ab.d("MicroMsg.emoji.EmojiStoreDetailUI", "[cpan] on image load complete url:%s", new Object[] { paramString });
    if (paramBitmap != null)
      this.lbG.uh(1006);
    AppMethodBeat.o(53437);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.20
 * JD-Core Version:    0.6.2
 */