package com.tencent.tinker.lib.util;

import android.content.Intent;

final class TinkerJobIntentService$d
  implements TinkerJobIntentService.e
{
  final int bWH;
  final Intent mIntent;

  TinkerJobIntentService$d(TinkerJobIntentService paramTinkerJobIntentService, Intent paramIntent, int paramInt)
  {
    this.mIntent = paramIntent;
    this.bWH = paramInt;
  }

  public final void complete()
  {
    this.ACg.stopSelf(this.bWH);
  }

  public final Intent getIntent()
  {
    return this.mIntent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.util.TinkerJobIntentService.d
 * JD-Core Version:    0.6.2
 */