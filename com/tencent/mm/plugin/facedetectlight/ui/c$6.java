package com.tencent.mm.plugin.facedetectlight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.e.a;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.facedetectlight.Utils.YTAGFaceReflectForWXJNIInterface;
import com.tencent.mm.plugin.facedetectlight.Utils.YTAGFaceReflectResult;
import com.tencent.mm.plugin.facedetectlight.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.youtu.ytagreflectlivecheck.requester.UploadVideoRequester;
import com.tencent.youtu.ytagreflectlivecheck.requester.UploadVideoRequester.UploadVideoResponse;

final class c$6
  implements UploadVideoRequester
{
  c$6(c paramc)
  {
  }

  public final void request(String paramString, UploadVideoRequester.UploadVideoResponse paramUploadVideoResponse)
  {
    AppMethodBeat.i(797);
    ab.i("MicroMsg.FaceReflectLogic", "start uplaod data ：%s", new Object[] { paramString });
    FaceDetectReporter.bsJ().I(6, System.currentTimeMillis());
    al.d(new c.6.1(this));
    if (bo.isNullOrNil(paramString))
    {
      paramUploadVideoResponse.onFailed(-1, "uploadString is empty");
      AppMethodBeat.o(797);
    }
    while (true)
    {
      return;
      Object localObject = this.mdV;
      ab.i("MicroMsg.FaceReflectLogic", "stopVideoRecordIfNeed, isNeedVideo: %s", new Object[] { Boolean.valueOf(a.btw().lZc) });
      if (a.btw().lZc)
        a.btw().a(new c.7((c)localObject));
      this.mdV.mdU = paramUploadVideoResponse;
      paramUploadVideoResponse = this.mdV;
      ab.i("MicroMsg.FaceReflectLogic", "saveAndUploadReflectResult");
      long l = bo.yz();
      localObject = YTAGFaceReflectForWXJNIInterface.getEncodeString(paramUploadVideoResponse.mdC);
      ab.i("MicroMsg.FaceReflectLogic", " mResult is ".concat(String.valueOf(localObject)));
      l = bo.az(l);
      if (localObject != null)
        FaceDetectReporter.bsJ().G(((YTAGFaceReflectResult)localObject).result, l);
      localObject = c.a((YTAGFaceReflectResult)localObject);
      ab.i("MicroMsg.FaceReflectLogic", "save face result file path: %s", new Object[] { localObject });
      if (!bo.isNullOrNil((String)localObject))
      {
        paramUploadVideoResponse.mdU.onSuccess(paramString);
        paramUploadVideoResponse.mdI.Ly((String)localObject);
        AppMethodBeat.o(797);
      }
      else
      {
        paramUploadVideoResponse.mdI.u(90018, "system error", "");
        AppMethodBeat.o(797);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.c.6
 * JD-Core Version:    0.6.2
 */