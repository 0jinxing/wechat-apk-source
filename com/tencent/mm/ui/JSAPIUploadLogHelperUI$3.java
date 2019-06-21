package com.tencent.mm.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.al;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.c;

final class JSAPIUploadLogHelperUI$3
  implements al
{
  JSAPIUploadLogHelperUI$3(JSAPIUploadLogHelperUI paramJSAPIUploadLogHelperUI, ProgressDialog paramProgressDialog, DialogInterface.OnDismissListener paramOnDismissListener)
  {
  }

  public final void kx(int paramInt)
  {
    AppMethodBeat.i(29440);
    if (paramInt < 0)
    {
      ab.e("MicroMsg.JSAPIUploadLogHelperUI", "uploadLog call by jsapi, error happened, percent:%d", new Object[] { Integer.valueOf(paramInt) });
      aw.a(null);
      if (this.pET != null)
        this.pET.dismiss();
      ??? = com.tencent.mm.ui.base.h.g(this.yjA, 2131304178, 2131297061);
      if (??? != null)
        ((c)???).setOnDismissListener(this.yjB);
    }
    while (true)
    {
      synchronized (JSAPIUploadLogHelperUI.Qk())
      {
        JSAPIUploadLogHelperUI.pL(false);
        AppMethodBeat.o(29440);
        return;
      }
      if (paramInt >= 100)
      {
        ab.i("MicroMsg.JSAPIUploadLogHelperUI", "uploadLog call by jsapi done.");
        aw.a(null);
        if (this.pET != null)
          this.pET.dismiss();
        ??? = com.tencent.mm.ui.base.h.g(this.yjA, 2131304182, 2131297061);
        if (??? != null)
          ((c)???).setOnDismissListener(this.yjB);
        long l = System.currentTimeMillis() / 1000L;
        com.tencent.mm.plugin.report.service.h.pYm.e(12975, new Object[] { Long.valueOf(l) });
        synchronized (JSAPIUploadLogHelperUI.Qk())
        {
          JSAPIUploadLogHelperUI.pL(false);
          AppMethodBeat.o(29440);
        }
      }
      ab.i("MicroMsg.JSAPIUploadLogHelperUI", "uploadLog call by jsapi, ipxx progress:%d", new Object[] { Integer.valueOf(paramInt) });
      if (this.pET != null)
        this.pET.setMessage(this.yjA.getString(2131304179) + paramInt + "%");
      AppMethodBeat.o(29440);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.JSAPIUploadLogHelperUI.3
 * JD-Core Version:    0.6.2
 */