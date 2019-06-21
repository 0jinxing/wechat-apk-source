package com.tencent.soter.a.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.f.c;
import com.tencent.soter.a.f.c.a;
import com.tencent.soter.a.f.c.b;
import com.tencent.soter.a.f.f;
import com.tencent.soter.a.f.f.a;
import com.tencent.soter.core.biometric.BiometricManagerCompat;
import com.tencent.soter.core.biometric.BiometricManagerCompat.CryptoObject;
import com.tencent.soter.core.c.j;
import com.tencent.soter.soterserver.SoterSessionResult;
import java.lang.ref.WeakReference;
import java.security.Signature;
import junit.framework.Assert;

public final class i extends d
  implements a
{
  String AvS;
  private c AwB;
  f AwC;
  private WeakReference<Context> AwD;
  j AwG;
  boolean AwI;
  boolean AwJ;
  boolean AwK;
  com.tencent.soter.a.a.a AwS;
  com.tencent.soter.a.a.b AwT;
  private i.a AwU;
  int Awh;
  private int gOW;
  String tWZ;

  public i(b paramb)
  {
    AppMethodBeat.i(10541);
    this.gOW = -1;
    this.AvS = null;
    this.tWZ = null;
    this.AwB = null;
    this.AwC = null;
    this.AwD = null;
    this.AwS = null;
    this.AwT = null;
    this.AwG = null;
    this.AwU = null;
    if ((Build.VERSION.SDK_INT < 23) && (Build.MANUFACTURER.equalsIgnoreCase("vivo")))
    {
      bool2 = true;
      this.AwI = bool2;
      if (Build.VERSION.SDK_INT >= 23)
        break label135;
    }
    label135: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.AwJ = bool2;
      this.AwK = false;
      if (paramb != null)
        break label140;
      paramb = new IllegalArgumentException("param is null!");
      AppMethodBeat.o(10541);
      throw paramb;
      bool2 = false;
      break;
    }
    label140: this.gOW = paramb.gOW;
    this.AwB = paramb.Awf;
    this.AwC = paramb.Awg;
    this.AwD = new WeakReference(paramb.mContext);
    this.AwT = paramb.Awj;
    this.AwS = paramb.mrW;
    this.Awh = paramb.Awh;
    this.tWZ = paramb.tWZ;
    AppMethodBeat.o(10541);
  }

  @SuppressLint({"NewApi"})
  final void b(Signature paramSignature)
  {
    String str = null;
    AppMethodBeat.i(10546);
    if (this.AvW)
    {
      com.tencent.soter.core.c.d.w("Soter.TaskBiometricAuthentication", "soter: already finished. can not authenticate", new Object[0]);
      AppMethodBeat.o(10546);
    }
    while (true)
    {
      return;
      Object localObject = (Context)this.AwD.get();
      if (localObject == null)
      {
        com.tencent.soter.core.c.d.w("Soter.TaskBiometricAuthentication", "soter: context instance released in startAuthenticate", new Object[0]);
        b(new com.tencent.soter.a.b.a(17));
        AppMethodBeat.o(10546);
      }
      else
      {
        try
        {
          com.tencent.soter.core.c.d.v("Soter.TaskBiometricAuthentication", "soter: performing start", new Object[0]);
          BiometricManagerCompat localBiometricManagerCompat = BiometricManagerCompat.from((Context)localObject, Integer.valueOf(this.Awh));
          localObject = new com/tencent/soter/core/biometric/BiometricManagerCompat$CryptoObject;
          ((BiometricManagerCompat.CryptoObject)localObject).<init>(paramSignature);
          paramSignature = str;
          if (this.AwS != null)
            paramSignature = this.AwS.zZp;
          localBiometricManagerCompat.authenticate((BiometricManagerCompat.CryptoObject)localObject, 0, paramSignature, this.AwU, null);
          AppMethodBeat.o(10546);
        }
        catch (Exception paramSignature)
        {
          str = paramSignature.getMessage();
          com.tencent.soter.core.c.d.e("Soter.TaskBiometricAuthentication", "soter: caused exception when authenticating: %s", new Object[] { str });
          com.tencent.soter.core.c.d.a("Soter.TaskBiometricAuthentication", paramSignature, "soter: caused exception when authenticating");
          b(new com.tencent.soter.a.b.a(20, String.format("start authentication failed due to %s", new Object[] { str })));
          AppMethodBeat.o(10546);
        }
      }
    }
  }

  public final void dRk()
  {
    AppMethodBeat.i(10548);
    com.tencent.soter.core.c.d.i("Soter.TaskBiometricAuthentication", "soter: called from cancellation signal", new Object[0]);
    if (this.AwU != null)
      this.AwU.onAuthenticationCancelled();
    AppMethodBeat.o(10548);
  }

  @SuppressLint({"DefaultLocale", "NewApi"})
  final boolean dRl()
  {
    boolean bool1 = true;
    AppMethodBeat.i(10542);
    boolean bool2;
    if (!com.tencent.soter.a.c.a.dRe().isInit())
    {
      com.tencent.soter.core.c.d.w("Soter.TaskBiometricAuthentication", "soter: not initialized yet", new Object[0]);
      b(new com.tencent.soter.a.b.a(14));
      AppMethodBeat.o(10542);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      if (!com.tencent.soter.a.c.a.dRe().dRc())
      {
        com.tencent.soter.core.c.d.w("Soter.TaskBiometricAuthentication", "soter: not support soter", new Object[0]);
        b(new com.tencent.soter.a.b.a(2));
        AppMethodBeat.o(10542);
        bool2 = bool1;
      }
      else
      {
        if (Build.VERSION.SDK_INT >= 16);
        for (bool2 = true; ; bool2 = false)
        {
          Assert.assertTrue(bool2);
          this.AvS = ((String)com.tencent.soter.a.c.a.dRe().dRg().get(this.gOW, ""));
          if (!com.tencent.soter.core.c.g.isNullOrNil(this.AvS))
            break label202;
          com.tencent.soter.core.c.d.w("Soter.TaskBiometricAuthentication", "soter: request prepare auth key scene: %d, but key name is not registered. Please make sure you register the scene in init", new Object[0]);
          b(new com.tencent.soter.a.b.a(15, String.format("auth scene %d not initialized in map", new Object[] { Integer.valueOf(this.gOW) })));
          AppMethodBeat.o(10542);
          bool2 = bool1;
          break;
        }
        label202: if (!com.tencent.soter.core.a.aua(this.AvS))
        {
          com.tencent.soter.core.c.d.w("Soter.TaskBiometricAuthentication", "soter: auth key %s not exists. need re-generate", new Object[] { this.AvS });
          b(new com.tencent.soter.a.b.a(12, String.format("the auth key to scene %d not exists. it may because you haven't prepare it, or user removed them already in system settings. please prepare the key again", new Object[] { Integer.valueOf(this.gOW) })));
          AppMethodBeat.o(10542);
          bool2 = bool1;
        }
        else if ((this.AwB == null) && (com.tencent.soter.core.c.g.isNullOrNil(this.tWZ)))
        {
          com.tencent.soter.core.c.d.w("Soter.TaskBiometricAuthentication", "soter: challenge wrapper is null!", new Object[0]);
          b(new com.tencent.soter.a.b.a(16, "neither get challenge wrapper nor challenge str is found in request parameter"));
          AppMethodBeat.o(10542);
          bool2 = bool1;
        }
        else
        {
          Context localContext = (Context)this.AwD.get();
          if (localContext == null)
          {
            com.tencent.soter.core.c.d.w("Soter.TaskBiometricAuthentication", "soter: context instance released in preExecute", new Object[0]);
            b(new com.tencent.soter.a.b.a(17));
            AppMethodBeat.o(10542);
            bool2 = bool1;
          }
          else if (!BiometricManagerCompat.from(localContext, Integer.valueOf(this.Awh)).hasEnrolledBiometric())
          {
            com.tencent.soter.core.c.d.w("Soter.TaskBiometricAuthentication", "soter: user has not enrolled any biometric in system.", new Object[0]);
            b(new com.tencent.soter.a.b.a(18));
            AppMethodBeat.o(10542);
            bool2 = bool1;
          }
          else if (com.tencent.soter.core.a.aC(localContext, this.Awh))
          {
            com.tencent.soter.core.c.d.w("Soter.TaskBiometricAuthentication", "soter: biometric sensor frozen", new Object[0]);
            b(new com.tencent.soter.a.b.a(25, "Too many failed times"));
            AppMethodBeat.o(10542);
            bool2 = bool1;
          }
          else if (this.AwS == null)
          {
            com.tencent.soter.core.c.d.w("Soter.TaskBiometricAuthentication", "soter: did not pass cancellation obj. We suggest you pass one", new Object[0]);
            this.AwS = new com.tencent.soter.a.a.a();
            AppMethodBeat.o(10542);
            bool2 = false;
          }
          else
          {
            if (this.AwC == null)
              com.tencent.soter.core.c.d.w("Soter.TaskBiometricAuthentication", "hy: we strongly recommend you to check the final authentication data in server! Please make sure you upload and check later", new Object[0]);
            AppMethodBeat.o(10542);
            bool2 = false;
          }
        }
      }
    }
  }

  final void dRm()
  {
    AppMethodBeat.i(10543);
    if (this.AwS != null)
      this.AwS.rp(true);
    AppMethodBeat.o(10543);
  }

  final void dRr()
  {
    AppMethodBeat.i(10545);
    Object localObject;
    if (com.tencent.soter.core.a.dQL() == 1)
    {
      localObject = com.tencent.soter.core.a.iC(this.AvS, this.tWZ);
      if (localObject == null)
      {
        com.tencent.soter.core.c.d.w("Soter.TaskBiometricAuthentication", "soter: error occurred when init sign soterSessionResult is null", new Object[0]);
        b(new com.tencent.soter.a.b.a(13));
        AppMethodBeat.o(10545);
      }
    }
    while (true)
    {
      return;
      if (((SoterSessionResult)localObject).bFZ != 0)
      {
        com.tencent.soter.core.c.d.w("Soter.TaskBiometricAuthentication", "soter: error occurred when init sign resultCode error", new Object[0]);
        b(new com.tencent.soter.a.b.a(13));
        AppMethodBeat.o(10545);
      }
      else
      {
        com.tencent.soter.core.c.d.d("Soter.TaskBiometricAuthentication", "soter: session is %d", new Object[] { Long.valueOf(((SoterSessionResult)localObject).AvH) });
        this.AwU = new i.a(this, null, (byte)0);
        i.a.a(this.AwU, ((SoterSessionResult)localObject).AvH);
        b(null);
        g.dRq().d(new i.2(this));
        AppMethodBeat.o(10545);
        continue;
        localObject = com.tencent.soter.core.a.aud(this.AvS);
        if (localObject == null)
        {
          com.tencent.soter.core.c.d.w("Soter.TaskBiometricAuthentication", "soter: error occurred when init sign", new Object[0]);
          b(new com.tencent.soter.a.b.a(13));
          AppMethodBeat.o(10545);
        }
        else
        {
          this.AwU = new i.a(this, (Signature)localObject, (byte)0);
          b((Signature)localObject);
          g.dRq().d(new i.3(this));
          AppMethodBeat.o(10545);
        }
      }
    }
  }

  final void dRs()
  {
    AppMethodBeat.i(10547);
    if (this.AwG == null)
    {
      b(new com.tencent.soter.a.b.a(22, "sign failed even after user authenticated the key."));
      AppMethodBeat.o(10547);
    }
    while (true)
    {
      return;
      this.AwC.bR(new f.a(this.AwG.signature, this.AwG.Avx, this.AwG.Avw));
      this.AwC.a(new i.4(this));
      this.AwC.execute();
      AppMethodBeat.o(10547);
    }
  }

  final void execute()
  {
    AppMethodBeat.i(10544);
    if (com.tencent.soter.core.c.g.isNullOrNil(this.tWZ))
    {
      com.tencent.soter.core.c.d.i("Soter.TaskBiometricAuthentication", "soter: not provide the challenge. we will do the job", new Object[0]);
      this.AwB.bR(new c.a());
      this.AwB.a(new com.tencent.soter.a.f.b()
      {
      });
      this.AwB.execute();
      AppMethodBeat.o(10544);
    }
    while (true)
    {
      return;
      com.tencent.soter.core.c.d.i("Soter.TaskBiometricAuthentication", "soter: already provided the challenge. directly authenticate", new Object[0]);
      dRr();
      AppMethodBeat.o(10544);
    }
  }

  public final boolean isCancelled()
  {
    return this.AwK;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.i
 * JD-Core Version:    0.6.2
 */