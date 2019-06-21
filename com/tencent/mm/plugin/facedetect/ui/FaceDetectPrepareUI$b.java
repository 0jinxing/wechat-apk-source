package com.tencent.mm.plugin.facedetect.ui;

import android.os.Bundle;

final class FaceDetectPrepareUI$b
{
  String aIm;
  int errCode;
  int errType;
  Bundle extras;

  private FaceDetectPrepareUI$b(FaceDetectPrepareUI paramFaceDetectPrepareUI)
  {
  }

  final void e(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    this.errType = paramInt1;
    this.errCode = paramInt2;
    this.aIm = paramString;
    this.extras = paramBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectPrepareUI.b
 * JD-Core Version:    0.6.2
 */