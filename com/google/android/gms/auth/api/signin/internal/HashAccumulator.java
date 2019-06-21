package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class HashAccumulator
{

  @VisibleForTesting
  private static int zzad = 31;
  private int zzae = 1;

  public HashAccumulator addBoolean(boolean paramBoolean)
  {
    int i = zzad;
    int j = this.zzae;
    if (paramBoolean);
    for (int k = 1; ; k = 0)
    {
      this.zzae = (k + j * i);
      return this;
    }
  }

  public HashAccumulator addObject(Object paramObject)
  {
    AppMethodBeat.i(60389);
    int i = zzad;
    int j = this.zzae;
    if (paramObject == null);
    for (int k = 0; ; k = paramObject.hashCode())
    {
      this.zzae = (k + j * i);
      AppMethodBeat.o(60389);
      return this;
    }
  }

  public int hash()
  {
    return this.zzae;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.HashAccumulator
 * JD-Core Version:    0.6.2
 */