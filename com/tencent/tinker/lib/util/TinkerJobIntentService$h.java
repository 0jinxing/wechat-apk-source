package com.tencent.tinker.lib.util;

import android.content.ComponentName;
import android.content.Intent;

abstract class TinkerJobIntentService$h
{
  boolean bWO;
  int bWP;
  final ComponentName mComponentName;

  TinkerJobIntentService$h(ComponentName paramComponentName)
  {
    this.mComponentName = paramComponentName;
  }

  final void fV(int paramInt)
  {
    if (!this.bWO)
    {
      this.bWO = true;
      this.bWP = paramInt;
    }
    while (this.bWP == paramInt)
      return;
    throw new IllegalArgumentException("Given job ID " + paramInt + " is different than previous " + this.bWP);
  }

  abstract void m(Intent paramIntent);

  public void zk()
  {
  }

  public void zl()
  {
  }

  public void zm()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.util.TinkerJobIntentService.h
 * JD-Core Version:    0.6.2
 */