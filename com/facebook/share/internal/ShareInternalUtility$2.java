package com.facebook.share.internal;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShareInternalUtility$2
  implements CallbackManagerImpl.Callback
{
  ShareInternalUtility$2(int paramInt)
  {
  }

  public final boolean onActivityResult(int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(97262);
    boolean bool = ShareInternalUtility.handleActivityResult(this.val$requestCode, paramInt, paramIntent, ShareInternalUtility.getShareResultProcessor(null));
    AppMethodBeat.o(97262);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.ShareInternalUtility.2
 * JD-Core Version:    0.6.2
 */