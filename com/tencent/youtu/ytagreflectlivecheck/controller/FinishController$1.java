package com.tencent.youtu.ytagreflectlivecheck.controller;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult;
import com.tencent.youtu.ytagreflectlivecheck.requester.LightDiffResponse;
import com.tencent.youtu.ytagreflectlivecheck.requester.UploadVideoRequester.UploadVideoResponse;
import com.tencent.youtu.ytcommon.tools.YTException;
import com.tencent.youtu.ytcommon.tools.wejson.WeJson;

class FinishController$1
  implements UploadVideoRequester.UploadVideoResponse
{
  FinishController$1(FinishController paramFinishController, YTAGReflectLiveCheckInterface.LightLiveCheckResult paramLightLiveCheckResult)
  {
  }

  public void onFailed(int paramInt, String paramString)
  {
    AppMethodBeat.i(123145);
    this.val$checkResult.onFailed(FinishController.access$200(), "Upload video failed.[" + paramInt + "]", "Maybe net error? return code: " + paramInt + " message: " + paramString);
    AppMethodBeat.o(123145);
  }

  public void onSuccess(String paramString)
  {
    AppMethodBeat.i(123144);
    try
    {
      Object localObject = new com/tencent/youtu/ytcommon/tools/wejson/WeJson;
      ((WeJson)localObject).<init>();
      localObject = (LightDiffResponse)((WeJson)localObject).fromJson(paramString, LightDiffResponse.class);
      if (localObject != null)
      {
        if (((LightDiffResponse)localObject).getError_code() == 0)
        {
          this.val$checkResult.onSuccess(true, (LightDiffResponse)localObject);
          AppMethodBeat.o(123144);
        }
        while (true)
        {
          return;
          this.val$checkResult.onSuccess(false, (LightDiffResponse)localObject);
          AppMethodBeat.o(123144);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        YTException.report(localException);
        this.val$checkResult.onFailed(FinishController.access$100(), "Upload video response json decode failed.", "received response: ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(123144);
        continue;
        this.val$checkResult.onFailed(FinishController.access$000(), "Upload video call back decode return nil.", "received response: ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(123144);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytagreflectlivecheck.controller.FinishController.1
 * JD-Core Version:    0.6.2
 */