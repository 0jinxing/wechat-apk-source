package com.google.android.search.verification.client;

import android.app.IntentService;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.search.verification.a.a;
import java.util.Iterator;
import java.util.Set;

public abstract class SearchActionVerificationClientService extends IntentService
{
  private final boolean bun = uq();
  private final long buo = 1000L;
  private final Intent bup = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
  private SearchActionVerificationClientService.a buq;
  private a bur = null;

  public SearchActionVerificationClientService()
  {
    super("SearchActionVerificationClientService");
  }

  private static void e(Intent paramIntent)
  {
    String str = String.valueOf(paramIntent);
    new StringBuilder(String.valueOf(str).length() + 1).append("\t").append(str);
    Bundle localBundle = paramIntent.getExtras();
    if (localBundle != null)
    {
      paramIntent = localBundle.keySet().iterator();
      while (paramIntent.hasNext())
      {
        str = (String)paramIntent.next();
        String.format("\t%s: %s", new Object[] { str, localBundle.get(str) });
      }
    }
  }

  private boolean isConnected()
  {
    if (this.bur != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean uq()
  {
    if (!"user".equals(Build.TYPE));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean ur()
  {
    boolean bool1 = false;
    try
    {
      PackageInfo localPackageInfo = getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 64);
      bool2 = bool1;
      if (localPackageInfo.signatures != null)
        if (localPackageInfo.signatures.length == 1)
          break label36;
      label36: for (bool2 = bool1; ; bool2 = Base64.encodeToString(localPackageInfo.signatures[0].toByteArray(), 2).equals("MIIEQzCCAyugAwIBAgIJAMLgh0ZkSjCNMA0GCSqGSIb3DQEBBAUAMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDAeFw0wODA4MjEyMzEzMzRaFw0zNjAxMDcyMzEzMzRaMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBAKtWLgDYO6IIrgqWbxJOKdoR8qtW0I9Y4sypEwPpt1TTcvZApxsdyxMJZ2JORland2qSGT2y5b+3JKkedxiLDmpHpDsz2WCbdxgxRczfey5YZnTJ4VZbH0xqWVW/8lGmPav5xVwnIiJS6HXk+BVKZF+JcWjAsb/GEuq/eFdpuzSqeYTcfi6idkyugwfYwXFU1+5fZKUaRKYCwkkFQVfcAs1fXA5V+++FGfvjJ/CxURaSxaBvGdGDhfXE28LWuT9ozCl5xw4Yq5OGazvV24mZVSoOO0yZ31j7kYvtwYK6NeADwbSxDdJEqO4k//0zOHKrUiGYXtqw/A0LFFtqoZKFjnkCAQOjgdkwgdYwHQYDVR0OBBYEFMd9jMIhF1Ylmn/Tgt9r45jk14alMIGmBgNVHSMEgZ4wgZuAFMd9jMIhF1Ylmn/Tgt9r45jk14aloXikdjB0MQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEUMBIGA1UEChMLR29vZ2xlIEluYy4xEDAOBgNVBAsTB0FuZHJvaWQxEDAOBgNVBAMTB0FuZHJvaWSCCQDC4IdGZEowjTAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBBAUAA4IBAQBt0lLO74UwLDYKqs6Tm8/yzKkEu116FmH4rkaymUIE0P9KaMftGlMexFlaYjzmB2OxZyl6euNXEsQH8gjwyxCUKRJNexBiGcCEyj6z+a1fuHHvkiaai+KL8W1EyNmgjmyy8AW7P+LLlkR+ho5zEHatRbM/YAnqGcFh5iZBqpknHf1SKMXFh4dd239FJ1jWYfbMDMy3NS5CTMQ2XFI1MvcyUTdZPErjQfTbQe3aDQsQcafEQPD+nqActifKZ0Np0IS9L9kR/wbNvyz6ENwPiTrjV2KRkEjH78ZMcUQXg0L3BYHJ3lc69Vs5Ddf9uUGGMYldX3WfMBEmh/9iFBDAaTCK"))
        return bool2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
      {
        boolean bool2 = bool1;
        if (this.bun)
        {
          String str = String.valueOf(localNameNotFoundException);
          new StringBuilder(String.valueOf(str).length() + 34).append("Unexpected NameNotFoundException: ").append(str);
          bool2 = bool1;
        }
      }
    }
  }

  public abstract boolean a(Intent paramIntent, boolean paramBoolean);

  public final void onCreate()
  {
    super.onCreate();
    this.buq = new SearchActionVerificationClientService.a(this);
    bindService(this.bup, this.buq, 1);
  }

  public final void onDestroy()
  {
    super.onDestroy();
    unbindService(this.buq);
  }

  protected final void onHandleIntent(Intent paramIntent)
  {
    boolean bool = true;
    if (paramIntent == null);
    while (true)
    {
      return;
      if ((uq()) || (ur()));
      Object localObject;
      for (int i = 1; ; i = 0)
      {
        long l = System.nanoTime();
        while ((!isConnected()) && (System.nanoTime() - l < this.buo * 1000000L))
        {
          try
          {
            Thread.sleep(50L);
          }
          catch (InterruptedException localInterruptedException)
          {
          }
          if (this.bun)
          {
            localObject = String.valueOf(localInterruptedException);
            new StringBuilder(String.valueOf(localObject).length() + 33).append("Unexpected InterruptedException: ").append((String)localObject);
          }
        }
      }
      if (isConnected())
      {
        if (paramIntent.hasExtra("SearchActionVerificationClientExtraIntent"))
        {
          paramIntent = (Intent)paramIntent.getParcelableExtra("SearchActionVerificationClientExtraIntent");
          if (this.bun)
            e(paramIntent);
          try
          {
            int j = this.bur.getVersion();
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>(24);
            ((StringBuilder)localObject).append("API version: ").append(j);
            localObject = new android/os/Bundle;
            ((Bundle)localObject).<init>();
            if ((i != 0) && (this.bur.a(paramIntent, (Bundle)localObject)))
              a(paramIntent, bool);
          }
          catch (RemoteException paramIntent)
          {
            while (true)
            {
              paramIntent = String.valueOf(paramIntent.getMessage());
              if (paramIntent.length() == 0)
                break label257;
              "Remote exception: ".concat(paramIntent);
              break;
              bool = false;
            }
            label257: new String("Remote exception: ");
          }
        }
        else if (this.bun)
        {
          paramIntent = String.valueOf(paramIntent);
          new StringBuilder(String.valueOf(paramIntent).length() + 28).append("No extra, nothing to check: ").append(paramIntent);
        }
      }
      else
      {
        paramIntent = String.valueOf(paramIntent);
        new StringBuilder(String.valueOf(paramIntent).length() + 62).append("VerificationService is not connected, unable to check intent: ").append(paramIntent);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.search.verification.client.SearchActionVerificationClientService
 * JD-Core Version:    0.6.2
 */