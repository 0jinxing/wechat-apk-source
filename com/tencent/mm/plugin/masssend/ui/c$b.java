package com.tencent.mm.plugin.masssend.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.masssend.a.a;
import com.tencent.mm.plugin.masssend.a.b;
import com.tencent.mm.plugin.masssend.a.h;
import com.tencent.mm.ui.MMActivity;

final class c$b
  implements View.OnClickListener
{
  private String id;

  public c$b(c paramc, String paramString)
  {
    this.id = paramString;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22784);
    paramView = h.bNE().Qs(this.id);
    Intent localIntent = new Intent(c.a(this.ooJ), MassSendMsgUI.class);
    localIntent.putExtra("mass_send_contact_list", paramView.bNy());
    localIntent.putExtra("mass_send_again", true);
    c.a(this.ooJ).startActivity(localIntent);
    AppMethodBeat.o(22784);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.c.b
 * JD-Core Version:    0.6.2
 */