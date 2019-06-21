package com.google.android.gms.wearable;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Releasable;
import java.io.InputStream;

public abstract class DataClient$GetFdForAssetResponse
  implements Releasable
{
  public abstract ParcelFileDescriptor getFdForAsset();

  public abstract InputStream getInputStream();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.DataClient.GetFdForAssetResponse
 * JD-Core Version:    0.6.2
 */