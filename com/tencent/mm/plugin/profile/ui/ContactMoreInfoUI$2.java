package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;

final class ContactMoreInfoUI$2
  implements View.OnClickListener
{
  ContactMoreInfoUI$2(ContactMoreInfoUI paramContactMoreInfoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23407);
    paramView = new Intent();
    paramView.putExtra("rawUrl", this.pmf.pme);
    paramView.putExtra("geta8key_username", r.Yz());
    d.b(this.pmf, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(23407);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.2
 * JD-Core Version:    0.6.2
 */