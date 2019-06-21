package com.google.android.gms.internal.measurement;

abstract class zzhh extends zzhg
{
  private boolean zzvo;

  zzhh(zzgl paramzzgl)
  {
    super(paramzzgl);
    this.zzacw.zzb(this);
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

  protected void zzih()
  {
  }

  public final void zzjw()
  {
    if (this.zzvo)
      throw new IllegalStateException("Can't initialize twice");
    zzih();
    this.zzacw.zzju();
    this.zzvo = true;
  }

  public final void zzm()
  {
    if (this.zzvo)
      throw new IllegalStateException("Can't initialize twice");
    if (!zzhf())
    {
      this.zzacw.zzju();
      this.zzvo = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzhh
 * JD-Core Version:    0.6.2
 */