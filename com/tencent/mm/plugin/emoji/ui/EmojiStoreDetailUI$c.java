package com.tencent.mm.plugin.emoji.ui;

import android.view.View;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class EmojiStoreDetailUI$c
{
  SquareImageView lbI;

  public EmojiStoreDetailUI$c(EmojiStoreDetailUI paramEmojiStoreDetailUI, View paramView)
  {
    AppMethodBeat.i(53448);
    this.lbI = ((SquareImageView)paramView.findViewById(2131823529));
    this.lbI.setScaleType(ImageView.ScaleType.FIT_CENTER);
    AppMethodBeat.o(53448);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.c
 * JD-Core Version:    0.6.2
 */