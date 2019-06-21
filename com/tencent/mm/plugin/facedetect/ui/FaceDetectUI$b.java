package com.tencent.mm.plugin.facedetect.ui;

import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceDetectUI$b
{
  private boolean lXU = true;
  boolean lXV = false;
  private boolean lXW = true;
  private final boolean lXX = true;

  private FaceDetectUI$b(FaceDetectUI paramFaceDetectUI)
  {
  }

  public final void btu()
  {
    try
    {
      this.lXV = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final void btv()
  {
    try
    {
      AppMethodBeat.i(471);
      ab.i("MicroMsg.FaceDetectUI", "toString: %s", new Object[] { toString() });
      if ((this.lXU) && (this.lXV) && (this.lXW))
        FaceDetectUI.m(this.lXO).setVisibility(0);
      AppMethodBeat.o(471);
      return;
    }
    finally
    {
    }
  }

  final void reset()
  {
    try
    {
      this.lXV = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(472);
    String str = "InitHandler{isCgiInitDone=" + this.lXU + ", isCameraInitDone=" + this.lXV + ", isLightInitDone=true, isLibraryInitDone=" + this.lXW + '}';
    AppMethodBeat.o(472);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.b
 * JD-Core Version:    0.6.2
 */