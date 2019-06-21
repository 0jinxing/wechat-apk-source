package com.tencent.matrix.a.a;

import com.tencent.mrs.b.a.a;

public final class a
{
  public final com.tencent.mrs.b.a bUG;

  public final String toString()
  {
    return String.format("[BatteryCanary.BatteryConfig], isDetectWakeLock:%b, isDetectAlarm:%b, isRecordWakeLock:%b, isRecordAlarm:%b", new Object[] { Boolean.valueOf(yL()), Boolean.valueOf(yL()), Boolean.valueOf(yN()), Boolean.valueOf(yO()) });
  }

  public final boolean yL()
  {
    return this.bUG.get(a.a.Ajw.name(), true);
  }

  public final boolean yM()
  {
    return this.bUG.get(a.a.AjB.name(), true);
  }

  public final boolean yN()
  {
    return this.bUG.get(a.a.Ajx.name(), false);
  }

  public final boolean yO()
  {
    return this.bUG.get(a.a.AjC.name(), false);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.a.a.a
 * JD-Core Version:    0.6.2
 */