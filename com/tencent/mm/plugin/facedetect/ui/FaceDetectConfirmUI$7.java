package com.tencent.mm.plugin.facedetect.ui;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.blr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class FaceDetectConfirmUI$7 extends ClickableSpan
{
  FaceDetectConfirmUI$7(FaceDetectConfirmUI paramFaceDetectConfirmUI, blr paramblr)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(368);
    if (!bo.isNullOrNil(this.lWy.url))
    {
      FaceDetectConfirmUI.a(this.lWx, this.lWy.url);
      AppMethodBeat.o(368);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.FaceDetectConfirmUI", "alvinluo promptInfo url is null");
      AppMethodBeat.o(368);
    }
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(369);
    paramTextPaint.setColor(this.lWx.getResources().getColor(2131690208));
    AppMethodBeat.o(369);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI.7
 * JD-Core Version:    0.6.2
 */