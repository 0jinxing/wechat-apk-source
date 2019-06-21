package com.tencent.mm.plugin.emoji.ui.v2;

import android.graphics.drawable.AnimationDrawable;
import android.os.Message;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

final class EmojiStoreV2RewardThanksUI$1 extends ak
{
  EmojiStoreV2RewardThanksUI$1(EmojiStoreV2RewardThanksUI paramEmojiStoreV2RewardThanksUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(53688);
    switch (paramMessage.what)
    {
    default:
    case 1001:
    }
    while (true)
    {
      AppMethodBeat.o(53688);
      while (true)
      {
        return;
        paramMessage = (String)paramMessage.obj;
        if ((bo.isNullOrNil(paramMessage)) || (!e.ct(paramMessage)))
          break label121;
        EmojiStoreV2RewardThanksUI.a(this.leq).setImageFilePath(paramMessage);
        EmojiStoreV2RewardThanksUI.a(this.leq).setScaleType(ImageView.ScaleType.FIT_XY);
        if ((EmojiStoreV2RewardThanksUI.b(this.leq) == null) || (!EmojiStoreV2RewardThanksUI.b(this.leq).isRunning()))
          break;
        EmojiStoreV2RewardThanksUI.b(this.leq).stop();
        AppMethodBeat.o(53688);
      }
      label121: ab.i("MicroMsg.emoji.EmojiStoreV2RewardThanksUI", "path is null or file no exists");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardThanksUI.1
 * JD-Core Version:    0.6.2
 */