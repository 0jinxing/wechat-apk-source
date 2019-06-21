package com.tencent.mm.plugin.emoji.ui.v2;

import android.graphics.drawable.AnimationDrawable;
import android.os.Message;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

final class EmojiStoreV2RewardUI$1 extends ak
{
  EmojiStoreV2RewardUI$1(EmojiStoreV2RewardUI paramEmojiStoreV2RewardUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(53695);
    switch (paramMessage.what)
    {
    default:
    case 1001:
    case 1002:
    }
    while (true)
    {
      AppMethodBeat.o(53695);
      while (true)
      {
        return;
        paramMessage = (String)paramMessage.obj;
        if ((!bo.isNullOrNil(paramMessage)) && (e.ct(paramMessage)))
        {
          EmojiStoreV2RewardUI.a(this.leK).setImageFilePath(paramMessage);
          EmojiStoreV2RewardUI.a(this.leK).setScaleType(ImageView.ScaleType.FIT_XY);
          if ((EmojiStoreV2RewardUI.b(this.leK) == null) || (!EmojiStoreV2RewardUI.b(this.leK).isRunning()))
            break;
          EmojiStoreV2RewardUI.b(this.leK).stop();
          AppMethodBeat.o(53695);
          continue;
        }
        ab.i("MicroMsg.emoji.EmojiStoreV2RewardUI", "path is null or file no exists");
        AppMethodBeat.o(53695);
      }
      EmojiStoreV2RewardUI.c(this.leK);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI.1
 * JD-Core Version:    0.6.2
 */