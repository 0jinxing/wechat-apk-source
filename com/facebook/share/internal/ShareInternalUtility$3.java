package com.facebook.share.internal;

import android.content.Intent;
import com.facebook.FacebookCallback;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareInternalUtility$3
  implements CallbackManagerImpl.Callback
{
  ShareInternalUtility$3(int paramInt, FacebookCallback paramFacebookCallback)
  {
  }

  public final boolean onActivityResult(int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(97263);
    boolean bool = ShareInternalUtility.handleActivityResult(this.val$requestCode, paramInt, paramIntent, ShareInternalUtility.getShareResultProcessor(this.val$callback));
    AppMethodBeat.o(97263);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.ShareInternalUtility.3
 * JD-Core Version:    0.6.2
 */