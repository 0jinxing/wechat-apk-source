package com.tencent.mm.plugin.emoji.ui.v2;

import android.os.Bundle;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.a.a.a;
import com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader;
import com.tencent.mm.sdk.platformtools.ak;

final class EmojiStoreV2BaseFragment$1 extends ak
{
  EmojiStoreV2BaseFragment$1(EmojiStoreV2BaseFragment paramEmojiStoreV2BaseFragment)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(53571);
    EmojiStoreV2BaseFragment localEmojiStoreV2BaseFragment = this.ldc;
    switch (paramMessage.what)
    {
    default:
    case 131074:
    case 131075:
    case 131076:
    case 131077:
    }
    while (true)
    {
      AppMethodBeat.o(53571);
      while (true)
      {
        return;
        if (localEmojiStoreV2BaseFragment.kVA == null)
          break;
        localEmojiStoreV2BaseFragment.kVA.notifyDataSetChanged();
        AppMethodBeat.o(53571);
        continue;
        if ((localEmojiStoreV2BaseFragment.kVA == null) || (paramMessage.getData() == null))
        {
          AppMethodBeat.o(53571);
        }
        else
        {
          String str = paramMessage.getData().getString("product_id");
          if (str == null)
            break;
          int i = paramMessage.getData().getInt("progress");
          localEmojiStoreV2BaseFragment.kVA.bX(str, i);
          AppMethodBeat.o(53571);
          continue;
          if ((localEmojiStoreV2BaseFragment.kVA == null) || (paramMessage.getData() == null))
          {
            AppMethodBeat.o(53571);
          }
          else
          {
            str = paramMessage.getData().getString("product_id");
            if (str == null)
              break;
            i = paramMessage.getData().getInt("status");
            localEmojiStoreV2BaseFragment.kVA.bW(str, i);
            AppMethodBeat.o(53571);
          }
        }
      }
      if (localEmojiStoreV2BaseFragment.kXW != null)
        localEmojiStoreV2BaseFragment.kXW.blS();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment.1
 * JD-Core Version:    0.6.2
 */