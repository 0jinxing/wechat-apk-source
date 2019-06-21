package com.tencent.mm.ui.bizchat;

import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.s;
import com.tencent.mm.ui.p.a;

final class BizChatFavUI$9
  implements p.a
{
  BizChatFavUI$9(BizChatFavUI paramBizChatFavUI)
  {
  }

  public final void apt()
  {
    AppMethodBeat.i(30115);
    this.yEt.setMMTitle(s.mJ(BizChatFavUI.a(this.yEt)));
    if (BizChatFavUI.c(this.yEt).getCount() <= 0)
    {
      BizChatFavUI.d(this.yEt).setVisibility(0);
      BizChatFavUI.e(this.yEt).setVisibility(8);
      AppMethodBeat.o(30115);
    }
    while (true)
    {
      return;
      BizChatFavUI.d(this.yEt).setVisibility(8);
      BizChatFavUI.e(this.yEt).setVisibility(0);
      AppMethodBeat.o(30115);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatFavUI.9
 * JD-Core Version:    0.6.2
 */