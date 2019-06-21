package com.tencent.mm.plugin.emoji.ui.v2;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.i;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class EmojiStoreV2RewardUI$5
  implements i
{
  EmojiStoreV2RewardUI$5(EmojiStoreV2RewardUI paramEmojiStoreV2RewardUI)
  {
  }

  public final void a(String paramString, View paramView, Bitmap paramBitmap, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(53699);
    if ((!bo.isNullOrNil(paramString)) && (paramString.equalsIgnoreCase(EmojiStoreV2RewardUI.i(this.leK))))
    {
      paramString = new Message();
      paramString.what = 1001;
      paramString.obj = EmojiStoreV2RewardUI.j(this.leK);
      EmojiStoreV2RewardUI.k(this.leK).sendMessage(paramString);
    }
    AppMethodBeat.o(53699);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI.5
 * JD-Core Version:    0.6.2
 */