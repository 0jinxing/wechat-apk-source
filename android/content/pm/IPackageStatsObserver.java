package android.content.pm;

import android.os.IInterface;

public abstract interface IPackageStatsObserver extends IInterface
{
  public abstract void onGetStatsCompleted(PackageStats paramPackageStats, boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.content.pm.IPackageStatsObserver
 * JD-Core Version:    0.6.2
 */