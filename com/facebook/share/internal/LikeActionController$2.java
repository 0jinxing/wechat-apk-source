package com.facebook.share.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class LikeActionController$2
  implements Runnable
{
  LikeActionController$2(LikeActionController paramLikeActionController)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(96984);
    LikeActionController.access$200(this.val$controllerToRefresh);
    AppMethodBeat.o(96984);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeActionController.2
 * JD-Core Version:    0.6.2
 */