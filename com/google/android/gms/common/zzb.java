package com.google.android.gms.common;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

final class zzb extends GoogleCertificates.CertData
{
  private final byte[] zzbd;

  zzb(byte[] paramArrayOfByte)
  {
    super(Arrays.copyOfRange(paramArrayOfByte, 0, 25));
    AppMethodBeat.i(90331);
    this.zzbd = paramArrayOfByte;
    AppMethodBeat.o(90331);
  }

  final byte[] getBytes()
  {
    return this.zzbd;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.zzb
 * JD-Core Version:    0.6.2
 */