package com.tencent.mm.plugin.card.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.d.a.a;
import com.tencent.mm.plugin.card.model.CardGiftInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class CardGiftReceiveUI$4
  implements a.a
{
  CardGiftReceiveUI$4(CardGiftReceiveUI paramCardGiftReceiveUI)
  {
  }

  public final void GS(String paramString)
  {
    AppMethodBeat.i(88421);
    ab.e("MicroMsg.CardGiftReceiveUI", "CDN download pic failure! fieldId:".concat(String.valueOf(paramString)));
    AppMethodBeat.o(88421);
  }

  public final void bN(String paramString, int paramInt)
  {
    AppMethodBeat.i(88420);
    if (CardGiftReceiveUI.b(this.klk) == null)
    {
      ab.e("MicroMsg.CardGiftReceiveUI", "CDN  updateProgress cardGiftInfo is null return!");
      AppMethodBeat.o(88420);
    }
    while (true)
    {
      return;
      if ((!bo.isNullOrNil(paramString)) && (!bo.isNullOrNil(CardGiftReceiveUI.b(this.klk).kco)) && (paramString.equals(CardGiftReceiveUI.b(this.klk).kco)))
      {
        ab.i("MicroMsg.CardGiftReceiveUI", "CDN  updateProgress fromUserContentVideoUrl return!");
        AppMethodBeat.o(88420);
      }
      else
      {
        CardGiftReceiveUI.g(this.klk).post(new CardGiftReceiveUI.4.1(this));
        AppMethodBeat.o(88420);
      }
    }
  }

  public final void dr(String paramString1, String paramString2)
  {
    AppMethodBeat.i(88422);
    ab.i("MicroMsg.CardGiftReceiveUI", "CDN  download success! fieldId:".concat(String.valueOf(paramString1)));
    if (CardGiftReceiveUI.b(this.klk) == null)
    {
      ab.e("MicroMsg.CardGiftReceiveUI", "CDN  download cardGiftInfo is null return!");
      AppMethodBeat.o(88422);
    }
    while (true)
    {
      return;
      if ((!bo.isNullOrNil(paramString1)) && (!bo.isNullOrNil(CardGiftReceiveUI.b(this.klk).kco)) && (paramString1.equals(CardGiftReceiveUI.b(this.klk).kco)))
      {
        ab.i("MicroMsg.CardGiftReceiveUI", "CDN  download fromUserContentVideoUrl! return");
        AppMethodBeat.o(88422);
      }
      else
      {
        CardGiftReceiveUI.g(this.klk).post(new CardGiftReceiveUI.4.2(this, paramString1, paramString2));
        AppMethodBeat.o(88422);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftReceiveUI.4
 * JD-Core Version:    0.6.2
 */