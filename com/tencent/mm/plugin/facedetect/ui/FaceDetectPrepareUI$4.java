package com.tencent.mm.plugin.facedetect.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class FaceDetectPrepareUI$4
  implements View.OnClickListener
{
  FaceDetectPrepareUI$4(FaceDetectPrepareUI paramFaceDetectPrepareUI, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(403);
    if (bo.isNullOrNil(FaceDetectPrepareUI.e(this.lXp)))
    {
      ab.e("MicroMsg.FaceDetectPrepareUI", "alvinluo feedback url is null");
      AppMethodBeat.o(403);
    }
    while (true)
    {
      return;
      FaceDetectPrepareUI.f(this.lXp);
      try
      {
        if (FaceDetectPrepareUI.g(this.lXp) != null);
        for (paramView = FaceDetectPrepareUI.g(this.lXp); ; paramView = "")
        {
          String str = q.encode(String.format("appid=%s;errcode=%d;identifyid=%s", new Object[] { paramView, Integer.valueOf(this.crd), "" }), "UTF-8");
          paramView = new java/lang/StringBuilder;
          paramView.<init>();
          str = FaceDetectPrepareUI.e(this.lXp) + "?customInfo=" + str;
          ab.i("MicroMsg.FaceDetectPrepareUI", "alvinluo feedback url: %s", new Object[] { str });
          paramView = new android/content/Intent;
          paramView.<init>();
          paramView.putExtra("rawUrl", str);
          d.b(this.lXp, "webview", ".ui.tools.WebViewUI", paramView);
          AppMethodBeat.o(403);
          break;
        }
      }
      catch (Exception paramView)
      {
        ab.printErrStackTrace("MicroMsg.FaceDetectPrepareUI", paramView, "alvinluo start feedback webview exception", new Object[0]);
        AppMethodBeat.o(403);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectPrepareUI.4
 * JD-Core Version:    0.6.2
 */