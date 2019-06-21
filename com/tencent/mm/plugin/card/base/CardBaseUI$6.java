package com.tencent.mm.plugin.card.base;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.ui.base.h;

final class CardBaseUI$6
  implements q.a
{
  CardBaseUI$6(CardBaseUI paramCardBaseUI, String paramString, boolean paramBoolean)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(87622);
    if (paramBoolean)
    {
      CardBaseUI.c(this.kav, this.eiH);
      h.bQ(this.kav, this.kav.getResources().getString(2131297877));
      if (this.kay)
        this.kav.finish();
    }
    AppMethodBeat.o(87622);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.base.CardBaseUI.6
 * JD-Core Version:    0.6.2
 */