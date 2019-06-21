package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;

class zzjp extends zzhg
  implements zzec
{
  protected final zzjr zzajp;

  zzjp(zzjr paramzzjr)
  {
    super(paramzzjr.zzla());
    AppMethodBeat.i(69428);
    Preconditions.checkNotNull(paramzzjr);
    this.zzajp = paramzzjr;
    AppMethodBeat.o(69428);
  }

  public zzeb zziw()
  {
    AppMethodBeat.i(69430);
    zzeb localzzeb = this.zzajp.zziw();
    AppMethodBeat.o(69430);
    return localzzeb;
  }

  public zzei zzix()
  {
    AppMethodBeat.i(69429);
    zzei localzzei = this.zzajp.zzix();
    AppMethodBeat.o(69429);
    return localzzei;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjp
 * JD-Core Version:    0.6.2
 */