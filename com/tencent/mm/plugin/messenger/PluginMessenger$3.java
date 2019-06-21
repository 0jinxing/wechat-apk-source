package com.tencent.mm.plugin.messenger;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.e.b;

final class PluginMessenger$3
  implements View.OnClickListener
{
  PluginMessenger$3(PluginMessenger paramPluginMessenger, String paramString1, String paramString2, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(136877);
    paramView = new Intent();
    paramView.putExtra("Contact_User", this.fwC);
    paramView.putExtra(e.b.yfT, this.opH);
    d.b(this.val$context, "profile", ".ui.ContactInfoUI", paramView, 0);
    AppMethodBeat.o(136877);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.PluginMessenger.3
 * JD-Core Version:    0.6.2
 */