package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.google.android.gms.wearable.DataClient.GetFdForAssetResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

final class zzcu extends DataClient.GetFdForAssetResponse
  implements Releasable
{
  private final DataApi.GetFdForAssetResult zzdj;

  zzcu(DataApi.GetFdForAssetResult paramGetFdForAssetResult)
  {
    this.zzdj = paramGetFdForAssetResult;
  }

  public final ParcelFileDescriptor getFdForAsset()
  {
    AppMethodBeat.i(71170);
    ParcelFileDescriptor localParcelFileDescriptor = this.zzdj.getFd();
    AppMethodBeat.o(71170);
    return localParcelFileDescriptor;
  }

  public final InputStream getInputStream()
  {
    AppMethodBeat.i(71171);
    InputStream localInputStream = this.zzdj.getInputStream();
    AppMethodBeat.o(71171);
    return localInputStream;
  }

  public final void release()
  {
    AppMethodBeat.i(71172);
    this.zzdj.release();
    AppMethodBeat.o(71172);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzcu
 * JD-Core Version:    0.6.2
 */