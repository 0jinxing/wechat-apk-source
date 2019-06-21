package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CreateAvatarUI$10
  implements View.OnClickListener
{
  CreateAvatarUI$10(CreateAvatarUI paramCreateAvatarUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7362);
    CreateAvatarUI.afs(CreateAvatarUI.c(this.urn));
    AppMethodBeat.o(7362);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI.10
 * JD-Core Version:    0.6.2
 */