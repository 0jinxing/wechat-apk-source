package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.fts.a.e;

final class ContactMoreInfoUI$5
  implements View.OnClickListener
{
  ContactMoreInfoUI$5(ContactMoreInfoUI paramContactMoreInfoUI, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23409);
    e.vW(this.ewG);
    if (this.ewG > 0)
    {
      paramView = new Intent(this.pmf, CommonChatroomInfoUI.class);
      paramView.putExtra("Select_Talker_Name", ContactMoreInfoUI.b(this.pmf).field_username);
      this.pmf.startActivity(paramView);
    }
    AppMethodBeat.o(23409);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.5
 * JD-Core Version:    0.6.2
 */