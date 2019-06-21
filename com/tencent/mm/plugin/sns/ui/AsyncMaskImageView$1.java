package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AsyncMaskImageView$1
  implements Runnable
{
  AsyncMaskImageView$1(AsyncMaskImageView paramAsyncMaskImageView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38129);
    this.rgV.setPressed(false);
    this.rgV.invalidate();
    AppMethodBeat.o(38129);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.AsyncMaskImageView.1
 * JD-Core Version:    0.6.2
 */