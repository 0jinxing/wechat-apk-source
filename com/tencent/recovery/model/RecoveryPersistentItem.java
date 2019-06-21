package com.tencent.recovery.model;

import android.os.Parcelable;

public abstract class RecoveryPersistentItem
  implements Parcelable
{
  public abstract boolean atL(String paramString);

  public abstract String dQf();

  public String toString()
  {
    return dQf();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.model.RecoveryPersistentItem
 * JD-Core Version:    0.6.2
 */