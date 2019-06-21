package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.a;
import com.google.firebase.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

public final class f
{
  private final Context bvF;

  @GuardedBy("this")
  private int bvG;

  @GuardedBy("this")
  private int bvH = 0;

  @GuardedBy("this")
  private String zzbu;

  @GuardedBy("this")
  private String zzbv;

  public f(Context paramContext)
  {
    this.bvF = paramContext;
  }

  public static String a(KeyPair paramKeyPair)
  {
    AppMethodBeat.i(108718);
    paramKeyPair = paramKeyPair.getPublic().getEncoded();
    try
    {
      paramKeyPair = MessageDigest.getInstance("SHA1").digest(paramKeyPair);
      paramKeyPair[0] = ((byte)(byte)((paramKeyPair[0] & 0xF) + 112));
      paramKeyPair = Base64.encodeToString(paramKeyPair, 0, 8, 11);
      AppMethodBeat.o(108718);
      return paramKeyPair;
    }
    catch (NoSuchAlgorithmException paramKeyPair)
    {
      while (true)
      {
        paramKeyPair = null;
        AppMethodBeat.o(108718);
      }
    }
  }

  private final PackageInfo aX(String paramString)
  {
    AppMethodBeat.i(108723);
    try
    {
      paramString = this.bvF.getPackageManager().getPackageInfo(paramString, 0);
      AppMethodBeat.o(108723);
      return paramString;
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      while (true)
      {
        paramString = String.valueOf(paramString);
        new StringBuilder(String.valueOf(paramString).length() + 23).append("Failed to find package ").append(paramString);
        paramString = null;
        AppMethodBeat.o(108723);
      }
    }
  }

  public static String b(a parama)
  {
    AppMethodBeat.i(108717);
    String str = parama.us().buJ;
    if (str != null)
    {
      AppMethodBeat.o(108717);
      parama = str;
    }
    while (true)
    {
      return parama;
      parama = parama.us().zzs;
      if (!parama.startsWith("1:"))
      {
        AppMethodBeat.o(108717);
      }
      else
      {
        parama = parama.split(":");
        if (parama.length < 2)
        {
          AppMethodBeat.o(108717);
          parama = null;
        }
        else
        {
          parama = parama[1];
          if (parama.isEmpty())
          {
            AppMethodBeat.o(108717);
            parama = null;
          }
          else
          {
            AppMethodBeat.o(108717);
          }
        }
      }
    }
  }

  private final void zzab()
  {
    try
    {
      AppMethodBeat.i(108722);
      PackageInfo localPackageInfo = aX(this.bvF.getPackageName());
      if (localPackageInfo != null)
      {
        this.zzbu = Integer.toString(localPackageInfo.versionCode);
        this.zzbv = localPackageInfo.versionName;
      }
      AppMethodBeat.o(108722);
      return;
    }
    finally
    {
    }
  }

  public final String uO()
  {
    try
    {
      AppMethodBeat.i(108719);
      if (this.zzbu == null)
        zzab();
      String str = this.zzbu;
      AppMethodBeat.o(108719);
      return str;
    }
    finally
    {
    }
  }

  public final String uP()
  {
    try
    {
      AppMethodBeat.i(108720);
      if (this.zzbv == null)
        zzab();
      String str = this.zzbv;
      AppMethodBeat.o(108720);
      return str;
    }
    finally
    {
    }
  }

  public final int uQ()
  {
    try
    {
      AppMethodBeat.i(108721);
      if (this.bvG == 0)
      {
        PackageInfo localPackageInfo = aX("com.google.android.gms");
        if (localPackageInfo != null)
          this.bvG = localPackageInfo.versionCode;
      }
      int i = this.bvG;
      AppMethodBeat.o(108721);
      return i;
    }
    finally
    {
    }
  }

  public final int zzx()
  {
    int i = 0;
    while (true)
    {
      try
      {
        AppMethodBeat.i(108716);
        if (this.bvH != 0)
        {
          i = this.bvH;
          AppMethodBeat.o(108716);
          return i;
        }
        PackageManager localPackageManager = this.bvF.getPackageManager();
        if (localPackageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1)
        {
          AppMethodBeat.o(108716);
          continue;
        }
      }
      finally
      {
      }
      Object localObject2;
      if (!PlatformVersion.isAtLeastO())
      {
        localObject2 = new android/content/Intent;
        ((Intent)localObject2).<init>("com.google.android.c2dm.intent.REGISTER");
        ((Intent)localObject2).setPackage("com.google.android.gms");
        localObject2 = localObject1.queryIntentServices((Intent)localObject2, 0);
        if ((localObject2 != null) && (((List)localObject2).size() > 0))
        {
          this.bvH = 1;
          i = this.bvH;
          AppMethodBeat.o(108716);
        }
      }
      else
      {
        localObject2 = new android/content/Intent;
        ((Intent)localObject2).<init>("com.google.iid.TOKEN_REQUEST");
        ((Intent)localObject2).setPackage("com.google.android.gms");
        List localList = localObject1.queryBroadcastReceivers((Intent)localObject2, 0);
        if ((localList == null) || (localList.size() <= 0))
          break;
        this.bvH = 2;
        i = this.bvH;
        AppMethodBeat.o(108716);
      }
    }
    if (PlatformVersion.isAtLeastO());
    for (this.bvH = 2; ; this.bvH = 1)
    {
      i = this.bvH;
      AppMethodBeat.o(108716);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.f
 * JD-Core Version:    0.6.2
 */