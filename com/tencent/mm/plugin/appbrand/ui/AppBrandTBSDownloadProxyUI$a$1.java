package com.tencent.mm.plugin.appbrand.ui;

import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;

final class AppBrandTBSDownloadProxyUI$a$1
  implements Runnable
{
  AppBrandTBSDownloadProxyUI$a$1(AppBrandTBSDownloadProxyUI.a parama, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133106);
    this.iIM.iIJ.tipDialog.setMessage(this.iIM.iIJ.mController.ylL.getString(2131296867, new Object[] { String.valueOf(this.eMC) }));
    AppMethodBeat.o(133106);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandTBSDownloadProxyUI.a.1
 * JD-Core Version:    0.6.2
 */