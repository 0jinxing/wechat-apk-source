package com.tencent.mm.ui.transmit;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class SelectConversationUI$12
  implements View.OnClickListener
{
  SelectConversationUI$12(SelectConversationUI paramSelectConversationUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(35136);
    if (SelectConversationUI.a(this.zKj))
    {
      SelectConversationUI.b(this.zKj);
      AppMethodBeat.o(35136);
    }
    while (true)
    {
      return;
      paramView = this.zKj.getIntent().getStringExtra("Select_App_Id");
      if ((SelectConversationUI.c(this.zKj)) && (bo.isNullOrNil(paramView)))
      {
        SelectConversationUI.d(this.zKj);
        AppMethodBeat.o(35136);
      }
      else
      {
        SelectConversationUI.e(this.zKj);
        AppMethodBeat.o(35136);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.12
 * JD-Core Version:    0.6.2
 */