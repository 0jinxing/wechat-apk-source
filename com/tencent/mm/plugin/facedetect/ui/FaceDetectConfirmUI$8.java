package com.tencent.mm.plugin.facedetect.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceDetectConfirmUI$8
  implements View.OnClickListener
{
  FaceDetectConfirmUI$8(FaceDetectConfirmUI paramFaceDetectConfirmUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(370);
    try
    {
      if (FaceDetectConfirmUI.j(this.lWx) != null);
      for (paramView = FaceDetectConfirmUI.j(this.lWx); ; paramView = "")
      {
        String str = q.encode(String.format("appid=%s", new Object[] { paramView }), "UTF-8");
        paramView = new java/lang/StringBuilder;
        paramView.<init>();
        paramView = FaceDetectConfirmUI.k(this.lWx) + "?customInfo=" + str;
        ab.i("MicroMsg.FaceDetectConfirmUI", "alvinluo jump realUrl: %s", new Object[] { paramView });
        FaceDetectConfirmUI.a(this.lWx, paramView);
        AppMethodBeat.o(370);
        return;
      }
    }
    catch (Exception paramView)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FaceDetectConfirmUI", paramView, "alvinluo jumpToWebView exception", new Object[0]);
        AppMethodBeat.o(370);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI.8
 * JD-Core Version:    0.6.2
 */