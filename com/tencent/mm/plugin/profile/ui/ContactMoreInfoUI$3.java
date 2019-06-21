package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.bo;

final class ContactMoreInfoUI$3
  implements View.OnClickListener
{
  ContactMoreInfoUI$3(ContactMoreInfoUI paramContactMoreInfoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23408);
    if (bo.isNullOrNil(ContactMoreInfoUI.a(this.pmf)))
      ContactMoreInfoUI.a(this.pmf, ContactMoreInfoUI.b(this.pmf).dup);
    if (!bo.isNullOrNil(ContactMoreInfoUI.a(this.pmf)))
    {
      paramView = new Intent();
      paramView.putExtra("rawUrl", ContactMoreInfoUI.a(this.pmf));
      paramView.putExtra("geta8key_username", r.Yz());
      d.b(this.pmf, "webview", ".ui.tools.WebViewUI", paramView);
    }
    AppMethodBeat.o(23408);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.3
 * JD-Core Version:    0.6.2
 */