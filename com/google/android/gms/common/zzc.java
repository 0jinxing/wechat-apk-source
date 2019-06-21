package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class zzc extends GoogleCertificates.CertData
{
  private static final WeakReference<byte[]> zzbf = new WeakReference(null);
  private WeakReference<byte[]> zzbe = zzbf;

  zzc(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
  }

  final byte[] getBytes()
  {
    try
    {
      Object localObject1 = (byte[])this.zzbe.get();
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = zzf();
        localObject1 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject1).<init>(localObject2);
        this.zzbe = ((WeakReference)localObject1);
      }
      return localObject2;
    }
    finally
    {
    }
  }

  protected abstract byte[] zzf();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.zzc
 * JD-Core Version:    0.6.2
 */