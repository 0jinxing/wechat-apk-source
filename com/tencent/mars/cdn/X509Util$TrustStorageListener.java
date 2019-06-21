package com.tencent.mars.cdn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.mm.sdk.platformtools.ab;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

final class X509Util$TrustStorageListener extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 26)
      if (("android.security.action.KEYCHAIN_CHANGED".equals(paramIntent.getAction())) || ("android.security.action.TRUST_STORE_CHANGED".equals(paramIntent.getAction())))
        bool = true;
    while (true)
    {
      if (bool);
      try
      {
        X509Util.access$000();
        return;
        if (("android.security.action.KEY_ACCESS_CHANGED".equals(paramIntent.getAction())) && (!paramIntent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false)))
        {
          bool = true;
          continue;
          bool = "android.security.STORAGE_CHANGED".equals(paramIntent.getAction());
        }
      }
      catch (CertificateException paramContext)
      {
        while (true)
          ab.e("X509Util", "Unable to reload the default TrustManager", new Object[] { paramContext });
      }
      catch (KeyStoreException paramContext)
      {
        while (true)
          ab.e("X509Util", "Unable to reload the default TrustManager", new Object[] { paramContext });
      }
      catch (NoSuchAlgorithmException paramContext)
      {
        while (true)
          ab.e("X509Util", "Unable to reload the default TrustManager", new Object[] { paramContext });
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mars.cdn.X509Util.TrustStorageListener
 * JD-Core Version:    0.6.2
 */