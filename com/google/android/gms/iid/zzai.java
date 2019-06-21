package com.google.android.gms.iid;

import javax.annotation.concurrent.GuardedBy;

abstract class zzai
{

  @GuardedBy("SdkFlagFactory.class")
  private static zzai zzcy;

  static zzai zzw()
  {
    try
    {
      if (zzcy == null)
      {
        localObject1 = new com/google/android/gms/iid/zzac;
        ((zzac)localObject1).<init>();
        zzcy = (zzai)localObject1;
      }
      Object localObject1 = zzcy;
      return localObject1;
    }
    finally
    {
    }
  }

  abstract zzaj<Boolean> zzd(String paramString, boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zzai
 * JD-Core Version:    0.6.2
 */