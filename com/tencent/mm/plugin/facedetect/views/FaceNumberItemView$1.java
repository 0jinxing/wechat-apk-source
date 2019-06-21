package com.tencent.mm.plugin.facedetect.views;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class FaceNumberItemView$1
  implements Runnable
{
  FaceNumberItemView$1(FaceNumberItemView paramFaceNumberItemView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(642);
    if (FaceNumberItemView.a(this.mbf) <= 30)
    {
      FaceNumberItemView.b(this.mbf);
      this.mbf.invalidate();
      AppMethodBeat.o(642);
    }
    while (true)
    {
      return;
      this.mbf.btK();
      AppMethodBeat.o(642);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceNumberItemView.1
 * JD-Core Version:    0.6.2
 */