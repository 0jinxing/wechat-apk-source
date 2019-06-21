package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.tencent.matrix.trace.core.AppMethodBeat;

class LikeDialog$1 extends ResultProcessor
{
  LikeDialog$1(LikeDialog paramLikeDialog, FacebookCallback paramFacebookCallback1, FacebookCallback paramFacebookCallback2)
  {
    super(paramFacebookCallback1);
  }

  public void onSuccess(AppCall paramAppCall, Bundle paramBundle)
  {
    AppMethodBeat.i(97099);
    this.val$callback.onSuccess(new LikeDialog.Result(paramBundle));
    AppMethodBeat.o(97099);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeDialog.1
 * JD-Core Version:    0.6.2
 */