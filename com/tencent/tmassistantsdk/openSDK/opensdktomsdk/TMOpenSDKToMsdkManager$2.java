package com.tencent.tmassistantsdk.openSDK.opensdktomsdk;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.tmassistantsdk.network.IGetAuthorizedHttpRequestListenner;
import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.AuthorizedResult;

class TMOpenSDKToMsdkManager$2
  implements IGetAuthorizedHttpRequestListenner
{
  TMOpenSDKToMsdkManager$2(TMOpenSDKToMsdkManager paramTMOpenSDKToMsdkManager)
  {
  }

  public void onGetAuthorizedRequestFinished(AuthorizedResult paramAuthorizedResult, int paramInt)
  {
    AppMethodBeat.i(75921);
    Message localMessage = new Message();
    if (paramInt == 0)
    {
      if (paramAuthorizedResult == null)
      {
        AppMethodBeat.o(75921);
        return;
      }
      localMessage.what = 4;
    }
    for (localMessage.obj = paramAuthorizedResult; ; localMessage.obj = Integer.valueOf(paramInt))
    {
      this.this$0.mMainMessageHandler.sendMessage(localMessage);
      AppMethodBeat.o(75921);
      break;
      localMessage.what = 5;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.2
 * JD-Core Version:    0.6.2
 */