package com.tencent.youtu.ytagreflectlivecheck.controller;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorSeqRes;
import com.tencent.youtu.ytagreflectlivecheck.manager.ProcessManager;
import com.tencent.youtu.ytagreflectlivecheck.manager.ProcessManager.ProcessResult;
import com.tencent.youtu.ytagreflectlivecheck.requester.RGBConfigRequester.RGBConfigRequestCallBack;
import com.tencent.youtu.ytcommon.YTCommonExInterface;
import com.tencent.youtu.ytcommon.tools.wejson.WeJson;
import com.tencent.youtu.ytcommon.tools.wejson.WeJsonException;

class InitController$1
  implements RGBConfigRequester.RGBConfigRequestCallBack
{
  InitController$1(InitController paramInitController, ProcessManager.ProcessResult paramProcessResult)
  {
  }

  public void onFailed(int paramInt)
  {
    AppMethodBeat.i(123148);
    this.val$checkResult.onFailed(InitController.access$200(), "get rgbconfig failed.", "Check \"LightLiveCheck.setRGBConfigRequest()\" params. Or maybe net error?");
    AppMethodBeat.o(123148);
  }

  public void onSuccess(String paramString)
  {
    AppMethodBeat.i(123147);
    if (paramString != null)
      if (paramString == null);
    while (true)
    {
      try
      {
        if (paramString.equals(""))
        {
          this.val$checkResult.onFailed(InitController.access$000(), "get rgbconfig return string is null.", "Check \"RGBConfigRequester.RGBConfigRequestCallBack()\" return value. Is it null?");
          AppMethodBeat.o(123147);
          return;
        }
        if (YTCommonExInterface.getBusinessCode() == 1)
        {
          ProcessManager.dataWorker().mRgbConfigCode = paramString;
          this.val$checkResult.onSuccess();
          AppMethodBeat.o(123147);
          continue;
        }
      }
      catch (WeJsonException paramString)
      {
        this.val$checkResult.onFailed(InitController.access$200(), "get rgbconfig failed.", "Check \"LightLiveCheck.setRGBConfigRequest()\" params. Or maybe net error?");
        AppMethodBeat.o(123147);
        continue;
        Object localObject = new com/tencent/youtu/ytcommon/tools/wejson/WeJson;
        ((WeJson)localObject).<init>();
        localObject = (ColorSeqRes)((WeJson)localObject).fromJson(paramString, ColorSeqRes.class);
        if (((ColorSeqRes)localObject).error_code == 0)
        {
          ProcessManager.dataWorker().mRgbConfigCode = ((ColorSeqRes)localObject).color_data;
          this.val$checkResult.onSuccess();
          AppMethodBeat.o(123147);
          continue;
        }
        paramString = this.val$checkResult;
        int i = InitController.access$100();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("get rgbconfig youtu server return code not 0, current is: ");
        paramString.onFailed(i, ((ColorSeqRes)localObject).error_code, "Request rgbConfig youtu server return value not currect. Check request and response log for more details.");
        AppMethodBeat.o(123147);
        continue;
      }
      this.val$checkResult.onFailed(InitController.access$300(), "get rgbconfig return null.", "Server return value not currect.");
      AppMethodBeat.o(123147);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytagreflectlivecheck.controller.InitController.1
 * JD-Core Version:    0.6.2
 */