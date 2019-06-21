package android.support.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.Map;

final class CustomTabsService$1 extends e.a
{
  CustomTabsService$1(CustomTabsService paramCustomTabsService)
  {
  }

  public final boolean a(d paramd)
  {
    boolean bool1 = false;
    ??? = new c(paramd);
    try
    {
      CustomTabsService.1.1 local1 = new android/support/customtabs/CustomTabsService$1$1;
      local1.<init>(this, (c)???);
      synchronized (CustomTabsService.a(this.kF))
      {
        paramd.asBinder().linkToDeath(local1, 0);
        CustomTabsService.a(this.kF).put(paramd.asBinder(), local1);
        boolean bool2 = this.kF.bj();
        bool1 = bool2;
        label82: return bool1;
      }
    }
    catch (RemoteException paramd)
    {
      break label82;
    }
  }

  public final boolean b(d paramd)
  {
    CustomTabsService localCustomTabsService = this.kF;
    new c(paramd);
    return localCustomTabsService.bk();
  }

  public final boolean bi()
  {
    return this.kF.bi();
  }

  public final Bundle bl()
  {
    return this.kF.bl();
  }

  public final boolean c(d paramd)
  {
    CustomTabsService localCustomTabsService = this.kF;
    new c(paramd);
    return localCustomTabsService.bm();
  }

  public final boolean d(d paramd)
  {
    CustomTabsService localCustomTabsService = this.kF;
    new c(paramd);
    return localCustomTabsService.bn();
  }

  public final int e(d paramd)
  {
    CustomTabsService localCustomTabsService = this.kF;
    new c(paramd);
    return localCustomTabsService.bo();
  }

  public final boolean f(d paramd)
  {
    CustomTabsService localCustomTabsService = this.kF;
    new c(paramd);
    return localCustomTabsService.bp();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.customtabs.CustomTabsService.1
 * JD-Core Version:    0.6.2
 */