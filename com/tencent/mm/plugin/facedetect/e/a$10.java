package com.tencent.mm.plugin.facedetect.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.a.d;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;

final class a$10
  implements Runnable
{
  a$10(a parama, byte[] paramArrayOfByte)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(555);
    SightVideoJNI.mirrorCameraData(this.val$data, a.i(this.lZv), a.j(this.lZv), false);
    if (a.g(this.lZv).getFrameDataCallback() != null)
      a.g(this.lZv).getFrameDataCallback().O(this.val$data);
    AppMethodBeat.o(555);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.e.a.10
 * JD-Core Version:    0.6.2
 */