package com.tencent.mm.plugin.facedetect.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceDetectConfirmUI$4
  implements View.OnClickListener
{
  FaceDetectConfirmUI$4(FaceDetectConfirmUI paramFaceDetectConfirmUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(366);
    ab.d("MicroMsg.FaceDetectConfirmUI", "check_alive_type is %s", new Object[] { Integer.valueOf(FaceDetectConfirmUI.d(this.lWx)) });
    paramView = new Intent(this.lWx, FaceDetectPrepareUI.class);
    Bundle localBundle = this.lWx.getIntent().getExtras();
    if (localBundle != null)
    {
      localBundle.putInt("check_alive_type_response", FaceDetectConfirmUI.d(this.lWx));
      localBundle.putString("key_feedback_url", FaceDetectConfirmUI.e(this.lWx));
      localBundle.putString("business_tips", FaceDetectConfirmUI.f(this.lWx));
      localBundle.putFloat("mLight_threshold", FaceDetectConfirmUI.g(this.lWx));
      ab.i("MicroMsg.FaceDetectConfirmUI", "carson check_alive_type_response is " + FaceDetectConfirmUI.d(this.lWx));
      paramView.putExtras(localBundle);
      this.lWx.startActivityForResult(paramView, 1);
      AppMethodBeat.o(366);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.FaceDetectConfirmUI", "alvinluo extras is null when start FaceDetectPrepareUI");
      AppMethodBeat.o(366);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI.4
 * JD-Core Version:    0.6.2
 */