package com.google.android.gms.wearable;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public abstract interface DataEvent extends Freezable<DataEvent>
{
  public static final int TYPE_CHANGED = 1;
  public static final int TYPE_DELETED = 2;

  public abstract DataItem getDataItem();

  public abstract int getType();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.DataEvent
 * JD-Core Version:    0.6.2
 */