package android.support.v4.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;

public final class e
{
  public static void a(Bundle paramBundle, String paramString, IBinder paramIBinder)
  {
    if (Build.VERSION.SDK_INT >= 18)
      paramBundle.putBinder(paramString, paramIBinder);
    while (true)
    {
      return;
      e.a.a(paramBundle, paramString, paramIBinder);
    }
  }

  public static IBinder c(Bundle paramBundle, String paramString)
  {
    if (Build.VERSION.SDK_INT >= 18);
    for (paramBundle = paramBundle.getBinder(paramString); ; paramBundle = e.a.c(paramBundle, paramString))
      return paramBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.e
 * JD-Core Version:    0.6.2
 */