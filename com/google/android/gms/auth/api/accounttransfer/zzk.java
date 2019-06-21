package com.google.android.gms.auth.api.accounttransfer;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzk extends AccountTransferClient.zzd<DeviceMetaData>
{
  zzk(zzj paramzzj, AccountTransferClient.zze paramzze)
  {
    super(paramzze);
  }

  public final void zzd(DeviceMetaData paramDeviceMetaData)
  {
    AppMethodBeat.i(76998);
    this.zzbd.setResult(paramDeviceMetaData);
    AppMethodBeat.o(76998);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.accounttransfer.zzk
 * JD-Core Version:    0.6.2
 */