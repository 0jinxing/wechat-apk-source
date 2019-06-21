package com.tencent.mm.plugin.facedetect.views;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import java.lang.ref.WeakReference;
import java.util.TimerTask;

final class FaceNumberItemView$a extends TimerTask
{
  private WeakReference<Runnable> mbg;

  private FaceNumberItemView$a(FaceNumberItemView paramFaceNumberItemView, Runnable paramRunnable)
  {
    AppMethodBeat.i(643);
    this.mbg = null;
    this.mbg = new WeakReference(paramRunnable);
    AppMethodBeat.o(643);
  }

  public final void run()
  {
    AppMethodBeat.i(644);
    if ((this.mbg != null) && (this.mbg.get() != null))
    {
      al.d((Runnable)this.mbg.get());
      AppMethodBeat.o(644);
    }
    while (true)
    {
      return;
      cancel();
      AppMethodBeat.o(644);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceNumberItemView.a
 * JD-Core Version:    0.6.2
 */