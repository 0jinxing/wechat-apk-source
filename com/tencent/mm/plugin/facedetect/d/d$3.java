package com.tencent.mm.plugin.facedetect.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.model.f;
import com.tencent.mm.plugin.facedetect.model.g;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;

final class d$3
  implements Runnable
{
  d$3(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(312);
    while (true)
    {
      synchronized (this.lVO.lVI)
      {
        if (this.lVO.lVv >= this.lVO.lVu.length - 1)
        {
          ab.i("MicroMsg.NumberFaceMotion", "hy: already last. handle upper judge.");
          this.lVO.lVd = true;
          Object localObject2 = f.lTL;
          byte[] arrayOfByte = e.e(this.lVO.lVt.lUU, -1, -1);
          localObject2 = ((f)localObject2).lTM.lVR;
          if (((g)localObject2).lTP == null)
          {
            ab.e("MicroMsg.FaceDetectNativeManager", "hy: set face data instance null!");
            AppMethodBeat.o(312);
            return;
          }
          ((g)localObject2).lTP.engineSetVoiceData(arrayOfByte);
        }
      }
      ab.i("MicroMsg.NumberFaceMotion", "hy: startShowNext");
      d locald = this.lVO;
      locald.lVv += 1;
      this.lVO.lVw = -1;
      this.lVO.hb(true);
      this.lVO.btd();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.d.d.3
 * JD-Core Version:    0.6.2
 */