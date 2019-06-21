package com.tencent.soter.core.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Process;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.core.c.f;
import com.tencent.soter.core.c.h;
import com.tencent.soter.core.c.i;
import com.tencent.soter.soterserver.SoterExportResult;
import com.tencent.soter.soterserver.SoterSessionResult;
import com.tencent.soter.soterserver.SoterSignResult;
import com.tencent.soter.soterserver.a;
import com.tencent.soter.soterserver.a.a;
import java.security.Signature;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class d extends b
  implements com.tencent.soter.core.c.b
{
  private e AvA;
  private IBinder.DeathRecipient AvB;
  private ServiceConnection AvC;
  protected a Avz;
  private boolean connected;
  private final Object lock;
  private Context mContext;

  public d()
  {
    AppMethodBeat.i(73072);
    this.connected = false;
    this.lock = new Object();
    this.AvA = new e();
    this.AvB = new d.1(this);
    this.AvC = new ServiceConnection()
    {
      public final void onServiceConnected(ComponentName arg1, IBinder paramAnonymousIBinder)
      {
        AppMethodBeat.i(73069);
        com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: onServiceConnected", new Object[0]);
        synchronized (d.a(d.this))
        {
          d.a(d.this, true);
          d.a(d.this).notifyAll();
        }
        try
        {
          paramAnonymousIBinder.linkToDeath(d.b(d.this), 0);
          d.this.Avz = a.a.O(paramAnonymousIBinder);
          com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: Binding is done - Service connected", new Object[0]);
          d.c(d.this).countDown();
          AppMethodBeat.o(73069);
          return;
          paramAnonymousIBinder = finally;
          AppMethodBeat.o(73069);
          throw paramAnonymousIBinder;
        }
        catch (RemoteException )
        {
          while (true)
            com.tencent.soter.core.c.d.e("Soter.SoterCoreTreble", "soter: Binding deathRecipient is error - RemoteException" + ???.toString(), new Object[0]);
        }
      }

      public final void onServiceDisconnected(ComponentName arg1)
      {
        AppMethodBeat.i(73070);
        synchronized (d.a(d.this))
        {
          d.a(d.this, false);
          d.a(d.this).notifyAll();
          d.this.Avz = null;
          com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: unBinding is done - Service disconnected", new Object[0]);
          d.c(d.this).countDown();
          d.this.beW();
          AppMethodBeat.o(73070);
          return;
        }
      }
    };
    AppMethodBeat.o(73072);
  }

  public final f atZ(String paramString)
  {
    AppMethodBeat.i(73082);
    com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: generateAuthKey in", new Object[0]);
    if (!dQN())
    {
      paramString = new f(5);
      AppMethodBeat.o(73082);
    }
    while (true)
    {
      return paramString;
      if (this.mContext == null)
      {
        com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
        paramString = new f(5);
        AppMethodBeat.o(73082);
      }
      else
      {
        dRa();
        if (this.Avz == null)
        {
          com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
          paramString = new f(5);
          AppMethodBeat.o(73082);
        }
        else
        {
          int i = Process.myUid();
          try
          {
            if (this.Avz.bS(i, paramString) == 0)
            {
              paramString = new com/tencent/soter/core/c/f;
              paramString.<init>(0);
              AppMethodBeat.o(73082);
            }
          }
          catch (RemoteException paramString)
          {
            paramString = new f(5);
            AppMethodBeat.o(73082);
          }
        }
      }
    }
  }

  public final boolean aua(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(73086);
    com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: hasAuthKey in", new Object[0]);
    int i = Process.myUid();
    boolean bool2;
    if (!dQN())
    {
      AppMethodBeat.o(73086);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      if (this.mContext == null)
      {
        com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
        AppMethodBeat.o(73086);
        bool2 = bool1;
      }
      else
      {
        dRa();
        if (this.Avz == null)
        {
          com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
          AppMethodBeat.o(73086);
          bool2 = bool1;
        }
        else
        {
          try
          {
            bool2 = this.Avz.bV(i, paramString);
            AppMethodBeat.o(73086);
          }
          catch (RemoteException paramString)
          {
            AppMethodBeat.o(73086);
            bool2 = bool1;
          }
        }
      }
    }
  }

  public final boolean aub(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(73084);
    com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: isAuthKeyValid in", new Object[0]);
    if ((aua(paramString)) && (auc(paramString) != null))
    {
      bool = true;
      AppMethodBeat.o(73084);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(73084);
    }
  }

  public final i auc(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(73085);
    com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: getAuthKeyModel in", new Object[0]);
    if (!dQN())
    {
      AppMethodBeat.o(73085);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (this.mContext == null)
      {
        com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
        AppMethodBeat.o(73085);
        paramString = localObject;
      }
      else
      {
        dRa();
        if (this.Avz == null)
        {
          com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
          AppMethodBeat.o(73085);
          paramString = localObject;
        }
        else
        {
          int i = Process.myUid();
          try
          {
            paramString = this.Avz.bU(i, paramString).AvF;
            if ((paramString != null) && (paramString.length > 0))
            {
              paramString = cp(paramString);
              AppMethodBeat.o(73085);
            }
            else
            {
              com.tencent.soter.core.c.d.e("Soter.SoterCoreTreble", "soter: key can not be retrieved", new Object[0]);
              AppMethodBeat.o(73085);
              paramString = localObject;
            }
          }
          catch (RemoteException paramString)
          {
            AppMethodBeat.o(73085);
            paramString = localObject;
          }
        }
      }
    }
  }

  public final Signature aud(String paramString)
  {
    return null;
  }

  public final void beW()
  {
    AppMethodBeat.i(73075);
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.soter.soterserver.ISoterService");
    localIntent.setPackage("com.tencent.soter.soterserver");
    if (this.mContext == null)
    {
      com.tencent.soter.core.c.d.e("Soter.SoterCoreTreble", "soter: bindService context is null ", new Object[0]);
      AppMethodBeat.o(73075);
    }
    while (true)
    {
      return;
      this.mContext.bindService(localIntent, this.AvC, 1);
      com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: bindService binding is start ", new Object[0]);
      AppMethodBeat.o(73075);
    }
  }

  public final f cn(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(73083);
    com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: removeAuthKey in", new Object[0]);
    if (!dQN())
    {
      paramString = new f(6);
      AppMethodBeat.o(73083);
    }
    while (true)
    {
      return paramString;
      if (this.mContext == null)
      {
        com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
        paramString = new f(6);
        AppMethodBeat.o(73083);
      }
      else
      {
        dRa();
        if (this.Avz == null)
        {
          com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
          paramString = new f(6);
          AppMethodBeat.o(73083);
        }
        else
        {
          int i = Process.myUid();
          try
          {
            if (this.Avz.bT(i, paramString) == 0)
            {
              if (paramBoolean)
              {
                if (this.Avz.Rh(i) == 0)
                {
                  paramString = new com/tencent/soter/core/c/f;
                  paramString.<init>(0);
                  AppMethodBeat.o(73083);
                  continue;
                }
                paramString = new f(5);
                AppMethodBeat.o(73083);
                continue;
              }
              paramString = new f(0);
              AppMethodBeat.o(73083);
            }
          }
          catch (RemoteException paramString)
          {
            paramString = new f(6);
            AppMethodBeat.o(73083);
          }
        }
      }
    }
  }

  public final boolean dQN()
  {
    boolean bool = false;
    AppMethodBeat.i(73076);
    if (h.dQY())
    {
      com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: the device has already triggered OOM. mark as not support", new Object[0]);
      AppMethodBeat.o(73076);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(73076);
    }
  }

  public final f dQO()
  {
    AppMethodBeat.i(73077);
    com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: generateAppSecureKey in", new Object[0]);
    f localf1;
    if (!dQN())
    {
      localf1 = new f(4);
      AppMethodBeat.o(73077);
    }
    while (true)
    {
      return localf1;
      if (this.mContext == null)
      {
        com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
        localf1 = new f(4);
        AppMethodBeat.o(73077);
      }
      else
      {
        dRa();
        if (this.Avz == null)
        {
          com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
          localf1 = new f(4);
          AppMethodBeat.o(73077);
        }
        else
        {
          int i = Process.myUid();
          try
          {
            if (this.Avz.Re(i) == 0)
            {
              localf1 = new com/tencent/soter/core/c/f;
              localf1.<init>(0);
              AppMethodBeat.o(73077);
            }
          }
          catch (RemoteException localRemoteException)
          {
            f localf2 = new f(4);
            AppMethodBeat.o(73077);
          }
        }
      }
    }
  }

  public final f dQP()
  {
    AppMethodBeat.i(73078);
    com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: removeAppGlobalSecureKey in", new Object[0]);
    f localf1;
    if (!dQN())
    {
      localf1 = new f(5);
      AppMethodBeat.o(73078);
    }
    while (true)
    {
      return localf1;
      if (this.mContext == null)
      {
        com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
        localf1 = new f(5);
        AppMethodBeat.o(73078);
      }
      else
      {
        dRa();
        if (this.Avz == null)
        {
          com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
          localf1 = new f(5);
          AppMethodBeat.o(73078);
        }
        else
        {
          int i = Process.myUid();
          try
          {
            if (this.Avz.Rh(i) == 0)
            {
              localf1 = new com/tencent/soter/core/c/f;
              localf1.<init>(0);
              AppMethodBeat.o(73078);
            }
          }
          catch (RemoteException localRemoteException)
          {
            f localf2 = new f(5);
            AppMethodBeat.o(73078);
          }
        }
      }
    }
  }

  public final boolean dQQ()
  {
    boolean bool1 = false;
    AppMethodBeat.i(73079);
    com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: hasAppGlobalSecureKey in", new Object[0]);
    boolean bool2;
    if (!dQN())
    {
      AppMethodBeat.o(73079);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      if (this.mContext == null)
      {
        com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
        AppMethodBeat.o(73079);
        bool2 = bool1;
      }
      else
      {
        dRa();
        if (this.Avz == null)
        {
          com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
          AppMethodBeat.o(73079);
          bool2 = bool1;
        }
        else
        {
          int i = Process.myUid();
          try
          {
            bool2 = this.Avz.Rg(i);
            AppMethodBeat.o(73079);
          }
          catch (RemoteException localRemoteException)
          {
            AppMethodBeat.o(73079);
            bool2 = bool1;
          }
        }
      }
    }
  }

  public final boolean dQR()
  {
    boolean bool = false;
    AppMethodBeat.i(73080);
    com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: isAppGlobalSecureKeyValid in", new Object[0]);
    if ((dQQ()) && (dQS() != null))
    {
      bool = true;
      AppMethodBeat.o(73080);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(73080);
    }
  }

  public final i dQS()
  {
    Object localObject1 = null;
    AppMethodBeat.i(73081);
    com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: getAppGlobalSecureKeyModel in", new Object[0]);
    if (!dQN())
      AppMethodBeat.o(73081);
    while (true)
    {
      return localObject1;
      if (this.mContext == null)
      {
        com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
        AppMethodBeat.o(73081);
      }
      else
      {
        dRa();
        if (this.Avz == null)
        {
          com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
          AppMethodBeat.o(73081);
        }
        else
        {
          int i = Process.myUid();
          try
          {
            Object localObject2 = this.Avz.Rf(i).AvF;
            if ((localObject2 != null) && (localObject2.length > 0))
            {
              localObject2 = cp((byte[])localObject2);
              localObject1 = localObject2;
              AppMethodBeat.o(73081);
            }
            else
            {
              com.tencent.soter.core.c.d.e("Soter.SoterCoreTreble", "soter: soter: key can not be retrieved", new Object[0]);
              AppMethodBeat.o(73081);
            }
          }
          catch (RemoteException localRemoteException)
          {
            AppMethodBeat.o(73081);
          }
        }
      }
    }
  }

  public final void dRa()
  {
    AppMethodBeat.i(73074);
    if (!this.connected)
    {
      com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: bindServiceIfNeeded try to bind", new Object[0]);
      beW();
    }
    AppMethodBeat.o(73074);
  }

  public final SoterSessionResult iC(String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(73087);
    com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: initSigh in", new Object[0]);
    if (!dQN())
    {
      AppMethodBeat.o(73087);
      paramString1 = localObject;
    }
    while (true)
    {
      return paramString1;
      if (this.mContext == null)
      {
        com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
        AppMethodBeat.o(73087);
        paramString1 = localObject;
      }
      else
      {
        dRa();
        if (this.Avz == null)
        {
          com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
          AppMethodBeat.o(73087);
          paramString1 = localObject;
        }
        else
        {
          int i = Process.myUid();
          try
          {
            paramString1 = this.Avz.O(i, paramString1, paramString2);
            AppMethodBeat.o(73087);
          }
          catch (RemoteException paramString1)
          {
            AppMethodBeat.o(73087);
            paramString1 = localObject;
          }
        }
      }
    }
  }

  public final boolean iV(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(73073);
    this.mContext = paramContext;
    com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: initSoter in", new Object[0]);
    paramContext = this.AvA;
    d.3 local3 = new d.3(this);
    if (paramContext.vaN == null)
      paramContext.vaN = new CountDownLatch(1);
    e.d(local3);
    if (paramContext.vaN != null);
    try
    {
      paramContext.vaN.await(3000L, TimeUnit.MILLISECONDS);
      if (this.connected)
      {
        com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: initSoter finish", new Object[0]);
        AppMethodBeat.o(73073);
        return bool;
      }
    }
    catch (InterruptedException paramContext)
    {
      while (true)
      {
        paramContext.getMessage();
        continue;
        com.tencent.soter.core.c.d.e("Soter.SoterCoreTreble", "soter: initSoter error", new Object[0]);
        AppMethodBeat.o(73073);
        bool = false;
      }
    }
  }

  public final byte[] nB(long paramLong)
  {
    Object localObject1 = null;
    AppMethodBeat.i(73088);
    com.tencent.soter.core.c.d.i("Soter.SoterCoreTreble", "soter: finishSign in", new Object[0]);
    if (!dQN())
      AppMethodBeat.o(73088);
    while (true)
    {
      return localObject1;
      if (this.mContext == null)
      {
        com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: context is null", new Object[0]);
        AppMethodBeat.o(73088);
      }
      else
      {
        dRa();
        if (this.Avz == null)
        {
          com.tencent.soter.core.c.d.w("Soter.SoterCoreTreble", "soter: soter service not found", new Object[0]);
          AppMethodBeat.o(73088);
        }
        else
        {
          localObject1 = new byte[0];
          Object localObject3 = localObject1;
          try
          {
            SoterSignResult localSoterSignResult = this.Avz.nD(paramLong);
            localObject3 = localObject1;
            byte[] arrayOfByte = localSoterSignResult.AvF;
            localObject3 = arrayOfByte;
            localObject1 = arrayOfByte;
            if (localSoterSignResult.bFZ != 0)
            {
              localObject3 = arrayOfByte;
              localObject1 = new java/lang/Exception;
              localObject3 = arrayOfByte;
              ((Exception)localObject1).<init>("finishSign error");
              localObject3 = arrayOfByte;
              AppMethodBeat.o(73088);
              localObject3 = arrayOfByte;
              throw ((Throwable)localObject1);
            }
          }
          catch (RemoteException localRemoteException)
          {
            Object localObject2 = localObject3;
            AppMethodBeat.o(73088);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.d.d
 * JD-Core Version:    0.6.2
 */