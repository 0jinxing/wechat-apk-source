package com.tencent.mm.plugin.emoji.a;

import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.emoji.StoreBannerEmojiView;

final class i$b
{
  StoreBannerEmojiView kSL;
  ImageView kSM;

  public i$b(i parami, View paramView)
  {
    AppMethodBeat.i(52765);
    this.kSL = ((StoreBannerEmojiView)paramView.findViewById(2131823548));
    this.kSM = ((ImageView)paramView.findViewById(2131823549));
    this.kSL.setDefaultImageResource(0);
    AppMethodBeat.o(52765);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.i.b
 * JD-Core Version:    0.6.2
 */