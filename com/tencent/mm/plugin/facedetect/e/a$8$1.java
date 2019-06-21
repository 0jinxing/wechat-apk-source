package com.tencent.mm.plugin.facedetect.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;

final class a$8$1
  implements Runnable
{
  a$8$1(a.8 param8)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(552);
    synchronized (a.a(this.lZG.lZv))
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("carson: begin to stop");
      ab.i("MicroMsg.FaceVideoRecorder", a.g(this.lZG.lZv).getFilePath());
      a.a(this.lZG.lZv, a.a.lZL);
      e.deleteFile(a.h(this.lZG.lZv));
      if (a.r(this.lZG.lZv) != null)
        a.r(this.lZG.lZv).Lu(a.g(this.lZG.lZv).getFilePath());
      AppMethodBeat.o(552);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.e.a.8.1
 * JD-Core Version:    0.6.2
 */