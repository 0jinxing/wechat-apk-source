package com.tencent.mm.plugin.clean.ui.newui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.URL;
import org.json.JSONObject;

final class CleanNewUI$4$1
  implements DialogInterface.OnClickListener
{
  CleanNewUI$4$1(CleanNewUI.4 param4)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(18914);
    try
    {
      URL localURL = new java/net/URL;
      localURL.<init>(CleanNewUI.d(this.kyX.kyW).getString("url"));
      paramDialogInterface = CleanNewUI.d(this.kyX.kyW).getString("md5");
      ab.i("MicroMsg.CleanNewUI", "download url:%s, md5:%s", new Object[] { localURL, paramDialogInterface });
      e.a locala = new com/tencent/mm/plugin/downloader/model/e$a;
      locala.<init>();
      locala.Iv("wesecure.apk");
      locala.It(localURL.toString());
      locala.ga(true);
      locala.Iw(paramDialogInterface);
      locala.tN(1);
      d.bij().a(locala.kNl);
      h.pYm.a(282L, 7L, 1L, false);
      AppMethodBeat.o(18914);
      return;
    }
    catch (Exception paramDialogInterface)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.CleanNewUI", paramDialogInterface, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.CleanNewUI.4.1
 * JD-Core Version:    0.6.2
 */