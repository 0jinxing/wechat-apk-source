package com.tencent.mm.plugin.facedetectlight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.facedetectlight.Utils.YTAGFaceReflectForWXJNIInterface;
import com.tencent.mm.plugin.facedetectlight.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import java.util.Arrays;

final class c$2
  implements Runnable
{
  c$2(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(789);
    c localc = this.mdV;
    ab.i("MicroMsg.FaceReflectLogic", " beginFaceReflectiton()");
    localc.mdI.bub();
    ab.i("MicroMsg.FaceReflectLogic", " mBioID is " + localc.mdC);
    ab.i("MicroMsg.FaceReflectLogic", " mConfig is " + Arrays.toString(localc.lWX));
    ab.i("MicroMsg.FaceReflectLogic", "mConfig.length is " + localc.lWX.length);
    String str = YTAGFaceReflectForWXJNIInterface.decrypt(localc.mdC, localc.lWX, localc.lWX.length);
    ab.i("MicroMsg.FaceReflectLogic", " real Config is ".concat(String.valueOf(str)));
    YTAGReflectLiveCheckInterface.setRGBConfigRequest(new c.4(localc, str));
    localc.mState = 1;
    FaceDetectReporter.bsJ().I(0, System.currentTimeMillis());
    FaceDetectReporter.bsJ().H(6, System.currentTimeMillis());
    YTAGReflectLiveCheckInterface.start(localc.mContext, localc.mdw.etv, localc.hGq, localc.mdz, new c.5(localc));
    localc = this.mdV;
    ab.i("MicroMsg.FaceReflectLogic", " setUploadDataCallback()");
    YTAGReflectLiveCheckInterface.setUploadVideoRequester(new c.6(localc));
    AppMethodBeat.o(789);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.c.2
 * JD-Core Version:    0.6.2
 */