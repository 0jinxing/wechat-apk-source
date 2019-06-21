package com.google.android.gms.wearable;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public abstract interface DataItemAsset extends Freezable<DataItemAsset>
{
  public abstract String getDataItemKey();

  public abstract String getId();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.DataItemAsset
 * JD-Core Version:    0.6.2
 */