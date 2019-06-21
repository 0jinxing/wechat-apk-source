package com.tencent.mm.plugin.emoji.ui.v2;

import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.i;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class EmojiStoreV2RewardThanksUI$3
  implements i
{
  EmojiStoreV2RewardThanksUI$3(EmojiStoreV2RewardThanksUI paramEmojiStoreV2RewardThanksUI, String paramString1, String paramString2)
  {
  }

  public final void a(String paramString, View paramView, Bitmap paramBitmap, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(53690);
    if ((!bo.isNullOrNil(paramString)) && (paramString.equalsIgnoreCase(this.ler)))
    {
      paramString = new Message();
      paramString.what = 1001;
      paramString.obj = this.bSt;
      EmojiStoreV2RewardThanksUI.c(this.leq).sendMessage(paramString);
    }
    AppMethodBeat.o(53690);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardThanksUI.3
 * JD-Core Version:    0.6.2
 */