package android.support.customtabs;

import android.os.IBinder;

public final class c
{
  private final d kI;
  private final a kJ;

  c(d paramd)
  {
    this.kI = paramd;
    this.kJ = new c.1(this);
  }

  final IBinder bq()
  {
    return this.kI.asBinder();
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof c));
    for (boolean bool = false; ; bool = ((c)paramObject).bq().equals(this.kI.asBinder()))
      return bool;
  }

  public final int hashCode()
  {
    return bq().hashCode();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.customtabs.c
 * JD-Core Version:    0.6.2
 */