package com.tencent.mm.plugin.exdevice.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.exdevice.model.ac.a;

final class ExdeviceRankInfoUI$11
  implements ac.a
{
  ExdeviceRankInfoUI$11(ExdeviceRankInfoUI paramExdeviceRankInfoUI)
  {
  }

  public final void Kj(String paramString)
  {
    AppMethodBeat.i(20145);
    Intent localIntent = new Intent();
    localIntent.putExtra("Ksnsupload_appid", "wx7fa037cc7dfabad5");
    localIntent.putExtra("Ksnsupload_appname", this.lDC.getString(2131299400));
    localIntent.putExtra("Ksnsupload_source", 1);
    localIntent.putExtra("need_result", true);
    String str = v.nW("wx_sport");
    v.Zp().y(str, true).j("prePublishId", "wx_sport");
    localIntent.putExtra("reportSessionId", str);
    localIntent.putExtra("Ksnsupload_type", 0);
    localIntent.putExtra("sns_kemdia_path", paramString);
    d.b(this.lDC, "sns", ".ui.SnsUploadUI", localIntent, 2);
    AppMethodBeat.o(20145);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.11
 * JD-Core Version:    0.6.2
 */