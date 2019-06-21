package com.facebook.share.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LikeView$LikeControllerBroadcastReceiver extends BroadcastReceiver
{
  private LikeView$LikeControllerBroadcastReceiver(LikeView paramLikeView)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = 1;
    AppMethodBeat.i(97637);
    paramContext = paramIntent.getAction();
    paramIntent = paramIntent.getExtras();
    int j = i;
    if (paramIntent != null)
    {
      String str = paramIntent.getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
      j = i;
      if (!Utility.isNullOrEmpty(str))
      {
        if (!Utility.areObjectsEqual(LikeView.access$600(this.this$0), str))
          break label72;
        j = i;
      }
    }
    if (j == 0)
      AppMethodBeat.o(97637);
    while (true)
    {
      return;
      label72: j = 0;
      break;
      if ("com.facebook.sdk.LikeActionController.UPDATED".equals(paramContext))
      {
        LikeView.access$700(this.this$0);
        AppMethodBeat.o(97637);
      }
      else if ("com.facebook.sdk.LikeActionController.DID_ERROR".equals(paramContext))
      {
        if (LikeView.access$800(this.this$0) != null)
        {
          LikeView.access$800(this.this$0).onError(NativeProtocol.getExceptionFromErrorData(paramIntent));
          AppMethodBeat.o(97637);
        }
      }
      else
      {
        if ("com.facebook.sdk.LikeActionController.DID_RESET".equals(paramContext))
        {
          LikeView.access$1000(this.this$0, LikeView.access$600(this.this$0), LikeView.access$900(this.this$0));
          LikeView.access$700(this.this$0);
        }
        AppMethodBeat.o(97637);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.facebook.share.widget.LikeView.LikeControllerBroadcastReceiver
 * JD-Core Version:    0.6.2
 */