package com.tencent.mm.plugin.card.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.card.model.CardGiftInfo;
import com.tencent.mm.sdk.platformtools.bo;

final class CardGiftReceiveUI$4$2
  implements Runnable
{
  CardGiftReceiveUI$4$2(CardGiftReceiveUI.4 param4, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(88419);
    if (CardGiftReceiveUI.f(this.kll.klk).getVisibility() != 8)
      CardGiftReceiveUI.f(this.kll.klk).setVisibility(8);
    Bitmap localBitmap;
    if ((!bo.isNullOrNil(this.fWt)) && (!bo.isNullOrNil(CardGiftReceiveUI.b(this.kll.klk).kcp)) && (this.fWt.equals(CardGiftReceiveUI.b(this.kll.klk).kcp)))
    {
      CardGiftReceiveUI.h(this.kll.klk).setVisibility(0);
      localBitmap = x.vv(this.val$filePath);
      if (localBitmap != null)
        break label155;
      CardGiftReceiveUI.i(this.kll.klk).setImageResource(2131231218);
      AppMethodBeat.o(88419);
    }
    while (true)
    {
      return;
      CardGiftReceiveUI.h(this.kll.klk).setVisibility(8);
      break;
      label155: CardGiftReceiveUI.i(this.kll.klk).setImageBitmap(localBitmap);
      AppMethodBeat.o(88419);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftReceiveUI.4.2
 * JD-Core Version:    0.6.2
 */