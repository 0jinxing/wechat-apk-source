package com.tencent.mm.plugin.card.ui;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.sdk.platformtools.bo;

final class CardGiftVideoUI$4
  implements Runnable
{
  CardGiftVideoUI$4(CardGiftVideoUI paramCardGiftVideoUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(88451);
    if (bo.isNullOrNil(CardGiftVideoUI.a(this.klx)))
    {
      CardGiftVideoUI.f(this.klx).setVisibility(0);
      Object localObject = new c.a();
      ((c.a)localObject).ePK = e.eSn;
      o.ahq();
      ((c.a)localObject).ePY = null;
      ((c.a)localObject).ePJ = m.Gz(this.val$filePath);
      ((c.a)localObject).fHe = 1;
      ((c.a)localObject).ePH = true;
      ((c.a)localObject).ePF = true;
      localObject = ((c.a)localObject).ahG();
      o.ahp().a(this.val$filePath, CardGiftVideoUI.f(this.klx), (c)localObject);
    }
    AppMethodBeat.o(88451);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardGiftVideoUI.4
 * JD-Core Version:    0.6.2
 */