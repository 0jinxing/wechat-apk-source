package com.google.android.gms.internal.measurement;

abstract class zzjq extends zzjp
{
  private boolean zzvo;

  zzjq(zzjr paramzzjr)
  {
    super(paramzzjr);
    this.zzajp.zzb(this);
  }

  final boolean isInitialized()
  {
    if (this.zzvo);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected final void zzch()
  {
    if (!isInitialized())
      throw new IllegalStateException("Not initialized");
  }

  protected abstract boolean zzhf();

  public final void zzm()
  {
    if (this.zzvo)
      throw new IllegalStateException("Can't initialize twice");
    zzhf();
    this.zzajp.zzkz();
    this.zzvo = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjq
 * JD-Core Version:    0.6.2
 */