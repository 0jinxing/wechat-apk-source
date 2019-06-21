package com.tencent.mm.plugin.emoji.ui.v2;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.contact.LabelContainerView;
import com.tencent.mm.ui.contact.LabelContainerView.a;

final class EmojiStoreV2SingleProductUI$11
  implements LabelContainerView.a
{
  EmojiStoreV2SingleProductUI$11(EmojiStoreV2SingleProductUI paramEmojiStoreV2SingleProductUI)
  {
  }

  public final void bmk()
  {
    AppMethodBeat.i(53755);
    if (EmojiStoreV2SingleProductUI.f(this.lfC) != null)
      EmojiStoreV2SingleProductUI.f(this.lfC).clearFocus();
    EmojiStoreV2SingleProductUI.f(this.lfC).requestFocus();
    EmojiStoreV2SingleProductUI.f(this.lfC).setVisibility(8);
    EmojiStoreV2SingleProductUI localEmojiStoreV2SingleProductUI = this.lfC;
    if (EmojiStoreV2SingleProductUI.g(this.lfC));
    for (boolean bool = true; ; bool = false)
    {
      localEmojiStoreV2SingleProductUI.showOptionMenu(1001, bool);
      this.lfC.setMMTitle(2131299132);
      AppMethodBeat.o(53755);
      return;
    }
  }

  public final void bml()
  {
    AppMethodBeat.i(53756);
    this.lfC.aqX();
    AppMethodBeat.o(53756);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.11
 * JD-Core Version:    0.6.2
 */