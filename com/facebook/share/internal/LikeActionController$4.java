package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LikeActionController$4
  implements Runnable
{
  LikeActionController$4(LikeActionController.CreationCallback paramCreationCallback, LikeActionController paramLikeActionController, FacebookException paramFacebookException)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(96986);
    this.val$callback.onComplete(this.val$controller, this.val$error);
    AppMethodBeat.o(96986);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeActionController.4
 * JD-Core Version:    0.6.2
 */