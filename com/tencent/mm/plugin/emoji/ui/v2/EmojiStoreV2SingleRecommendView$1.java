package com.tencent.mm.plugin.emoji.ui.v2;

import android.os.Bundle;
import android.os.Message;
import android.widget.Button;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class EmojiStoreV2SingleRecommendView$1 extends ak
{
  EmojiStoreV2SingleRecommendView$1(EmojiStoreV2SingleRecommendView paramEmojiStoreV2SingleRecommendView)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(53783);
    switch (paramMessage.what)
    {
    default:
    case 131074:
    case 131075:
    case 131076:
    }
    while (true)
    {
      AppMethodBeat.o(53783);
      while (true)
      {
        return;
        AppMethodBeat.o(53783);
        continue;
        int i = paramMessage.getData().getInt("progress");
        if (bo.isNullOrNil(paramMessage.getData().getString("product_id")))
        {
          ab.w("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product id is null");
          AppMethodBeat.o(53783);
        }
        else
        {
          if (EmojiStoreV2SingleRecommendView.a(this.lfM) != null)
            EmojiStoreV2SingleRecommendView.a(this.lfM).setVisibility(8);
          if (EmojiStoreV2SingleRecommendView.b(this.lfM) == null)
            break;
          EmojiStoreV2SingleRecommendView.b(this.lfM).setVisibility(0);
          EmojiStoreV2SingleRecommendView.b(this.lfM).setProgress(i);
          AppMethodBeat.o(53783);
          continue;
          paramMessage.getData().getInt("status");
          if (!bo.isNullOrNil(paramMessage.getData().getString("product_id")))
            break label192;
          ab.w("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product id is null");
          AppMethodBeat.o(53783);
        }
      }
      label192: if (EmojiStoreV2SingleRecommendView.a(this.lfM) != null)
      {
        EmojiStoreV2SingleRecommendView.a(this.lfM).setVisibility(0);
        EmojiStoreV2SingleRecommendView.bmn();
      }
      if (EmojiStoreV2SingleRecommendView.b(this.lfM) != null)
      {
        EmojiStoreV2SingleRecommendView.b(this.lfM).setVisibility(8);
        EmojiStoreV2SingleRecommendView.b(this.lfM).setProgress(0);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView.1
 * JD-Core Version:    0.6.2
 */