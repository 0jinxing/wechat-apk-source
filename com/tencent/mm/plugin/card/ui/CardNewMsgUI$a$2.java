package com.tencent.mm.plugin.card.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.d.b;
import com.tencent.mm.plugin.card.model.g.b;
import com.tencent.mm.sdk.platformtools.ab;

final class CardNewMsgUI$a$2
  implements View.OnClickListener
{
  CardNewMsgUI$a$2(CardNewMsgUI.a parama, g.b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88602);
    if (!TextUtils.isEmpty(this.kna.kdF))
    {
      b.a(this.kmZ.kmV, this.kna.kdF, 2);
      AppMethodBeat.o(88602);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.CardNewMsgUI", "card msg button url is empty");
      AppMethodBeat.o(88602);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardNewMsgUI.a.2
 * JD-Core Version:    0.6.2
 */