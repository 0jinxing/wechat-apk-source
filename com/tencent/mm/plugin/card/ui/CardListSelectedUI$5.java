package com.tencent.mm.plugin.card.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.d.b;
import com.tencent.mm.sdk.platformtools.bo;

final class CardListSelectedUI$5
  implements View.OnClickListener
{
  CardListSelectedUI$5(CardListSelectedUI paramCardListSelectedUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88559);
    if (!bo.isNullOrNil(this.kmz.kmw))
      b.a(this.kmz, this.kmz.kmw, this.kmz.getString(2131297898));
    AppMethodBeat.o(88559);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardListSelectedUI.5
 * JD-Core Version:    0.6.2
 */