package com.tencent.mm.plugin.emoji.ui;

import android.os.Message;
import android.support.v4.view.ViewPager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.LinkedList;

final class EmojiStoreVpHeader$a extends ak
{
  private EmojiStoreVpHeader$a(EmojiStoreVpHeader paramEmojiStoreVpHeader)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(53510);
    if ((!EmojiStoreVpHeader.d(this.lbY)) && (paramMessage.what != 0))
      AppMethodBeat.o(53510);
    while (true)
    {
      return;
      if ((EmojiStoreVpHeader.b(this.lbY) == null) || (EmojiStoreVpHeader.b(this.lbY).size() <= 1))
      {
        ab.w("MicroMsg.emoji.EmojiStoreVpHeader", "list is null");
        AppMethodBeat.o(53510);
      }
      else if (EmojiStoreVpHeader.a(this.lbY) == null)
      {
        ab.w("MicroMsg.emoji.EmojiStoreVpHeader", "adapter is null");
        AppMethodBeat.o(53510);
      }
      else
      {
        int i = EmojiStoreVpHeader.e(this.lbY).getCurrentItem() + 1;
        int j = i;
        if (i >= EmojiStoreVpHeader.a(this.lbY).getCount())
          j = EmojiStoreVpHeader.b(this.lbY).size() * i.kSE / 2;
        EmojiStoreVpHeader.e(this.lbY).setCurrentItem(j);
        if ((EmojiStoreVpHeader.d(this.lbY)) && (EmojiStoreVpHeader.f(this.lbY) != null))
          sendMessageDelayed(EmojiStoreVpHeader.f(this.lbY).obtainMessage(0), 5000L);
        AppMethodBeat.o(53510);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader.a
 * JD-Core Version:    0.6.2
 */