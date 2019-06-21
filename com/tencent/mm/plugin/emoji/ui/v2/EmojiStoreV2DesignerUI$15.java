package com.tencent.mm.plugin.emoji.ui.v2;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.i;
import com.tencent.mm.sdk.platformtools.ak;

final class EmojiStoreV2DesignerUI$15
  implements i
{
  EmojiStoreV2DesignerUI$15(EmojiStoreV2DesignerUI paramEmojiStoreV2DesignerUI)
  {
  }

  public final void a(String paramString, View paramView, Bitmap paramBitmap, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(53593);
    if (EmojiStoreV2DesignerUI.k(this.ldL) != null)
      EmojiStoreV2DesignerUI.k(this.ldL).sendEmptyMessage(10001);
    AppMethodBeat.o(53593);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI.15
 * JD-Core Version:    0.6.2
 */