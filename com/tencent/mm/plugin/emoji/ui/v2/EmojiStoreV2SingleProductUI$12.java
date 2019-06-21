package com.tencent.mm.plugin.emoji.ui.v2;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.MMTagPanel.a;

final class EmojiStoreV2SingleProductUI$12
  implements MMTagPanel.a
{
  EmojiStoreV2SingleProductUI$12(EmojiStoreV2SingleProductUI paramEmojiStoreV2SingleProductUI)
  {
  }

  public final void JR(String paramString)
  {
    AppMethodBeat.i(53757);
    if ((!bo.isNullOrNil(EmojiStoreV2SingleProductUI.l(this.lfC))) && (!bo.isNullOrNil(paramString)) && (paramString.equals(EmojiStoreV2SingleProductUI.l(this.lfC))))
      EmojiStoreV2SingleProductUI.m(this.lfC).cd(EmojiStoreV2SingleProductUI.l(this.lfC), true);
    AppMethodBeat.o(53757);
  }

  public final void JS(String paramString)
  {
    AppMethodBeat.i(53758);
    EmojiStoreV2SingleProductUI.a(this.lfC, paramString);
    AppMethodBeat.o(53758);
  }

  public final void JT(String paramString)
  {
  }

  public final void JU(String paramString)
  {
  }

  public final void JV(String paramString)
  {
  }

  public final void bmm()
  {
  }

  public final void q(boolean paramBoolean, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI.12
 * JD-Core Version:    0.6.2
 */