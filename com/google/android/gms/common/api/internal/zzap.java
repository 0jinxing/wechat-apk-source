package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.Client;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class zzap extends zzat
{
  private final ArrayList<Api.Client> zzib;

  public zzap(ArrayList<Api.Client> paramArrayList)
  {
    super(paramArrayList, null);
    Object localObject;
    this.zzib = localObject;
  }

  public final void zzaq()
  {
    AppMethodBeat.i(60755);
    zzaj.zzd(this.zzhv).zzfq.zzim = zzaj.zzg(this.zzhv);
    ArrayList localArrayList = (ArrayList)this.zzib;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      Object localObject = localArrayList.get(j);
      j++;
      ((Api.Client)localObject).getRemoteService(zzaj.zzh(this.zzhv), zzaj.zzd(this.zzhv).zzfq.zzim);
    }
    AppMethodBeat.o(60755);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzap
 * JD-Core Version:    0.6.2
 */