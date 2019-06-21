package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.b.a;

final class AppAttachDownloadUI$12
  implements View.OnLongClickListener
{
  AppAttachDownloadUI$12(AppAttachDownloadUI paramAppAttachDownloadUI)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(30275);
    ab.d("MicroMsg.AppAttachDownloadUI", "onLongClick");
    if (AppAttachDownloadUI.t(this.yGh) == null)
      AppAttachDownloadUI.a(this.yGh, new a(this.yGh.mController.ylL));
    AppAttachDownloadUI.t(this.yGh).a(paramView, this.yGh, AppAttachDownloadUI.u(this.yGh), AppAttachDownloadUI.v(this.yGh), AppAttachDownloadUI.w(this.yGh));
    AppMethodBeat.o(30275);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppAttachDownloadUI.12
 * JD-Core Version:    0.6.2
 */