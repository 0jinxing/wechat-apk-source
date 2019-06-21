package android.support.customtabs;

import android.app.Service;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.support.v4.f.a;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class CustomTabsService extends Service
{
  private final Map<IBinder, IBinder.DeathRecipient> kD = new a();
  private e.a kE = new CustomTabsService.1(this);

  protected final boolean a(c paramc)
  {
    try
    {
      synchronized (this.kD)
      {
        paramc = paramc.bq();
        paramc.unlinkToDeath((IBinder.DeathRecipient)this.kD.get(paramc), 0);
        this.kD.remove(paramc);
        bool = true;
        return bool;
      }
    }
    catch (NoSuchElementException paramc)
    {
      while (true)
        boolean bool = false;
    }
  }

  protected abstract boolean bi();

  protected abstract boolean bj();

  protected abstract boolean bk();

  protected abstract Bundle bl();

  protected abstract boolean bm();

  protected abstract boolean bn();

  protected abstract int bo();

  protected abstract boolean bp();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.customtabs.CustomTabsService
 * JD-Core Version:    0.6.2
 */