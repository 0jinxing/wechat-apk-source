package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CreateAvatarUI$9
  implements View.OnClickListener
{
  CreateAvatarUI$9(CreateAvatarUI paramCreateAvatarUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7361);
    CreateAvatarUI.afs(CreateAvatarUI.c(this.urn));
    AppMethodBeat.o(7361);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI.9
 * JD-Core Version:    0.6.2
 */