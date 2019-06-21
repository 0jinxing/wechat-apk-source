package com.tencent.mm.plugin.fts.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.sdk.platformtools.bo;

final class FTSAddFriendUI$4
  implements View.OnClickListener
{
  FTSAddFriendUI$4(FTSAddFriendUI paramFTSAddFriendUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(61728);
    if (!bo.isNullOrNil(this.mIb.query))
    {
      this.mIb.mHT = true;
      an.l(this.mIb.query, FTSAddFriendUI.b(this.mIb), 1, 16);
    }
    FTSAddFriendUI.c(this.mIb);
    AppMethodBeat.o(61728);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSAddFriendUI.4
 * JD-Core Version:    0.6.2
 */