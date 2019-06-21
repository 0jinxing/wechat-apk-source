package com.tencent.mm.plugin.emoji.ui.v2;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmojiStoreV2TabView$1
  implements View.OnClickListener
{
  EmojiStoreV2TabView$1(EmojiStoreV2TabView paramEmojiStoreV2TabView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(53798);
    int i = ((Integer)paramView.getTag()).intValue();
    if (EmojiStoreV2TabView.a(this.lfX) != null)
      EmojiStoreV2TabView.a(this.lfX).onTabClick(i);
    AppMethodBeat.o(53798);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView.1
 * JD-Core Version:    0.6.2
 */