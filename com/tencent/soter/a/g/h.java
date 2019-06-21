package com.tencent.soter.a.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.f.c;
import com.tencent.soter.a.f.c.a;
import com.tencent.soter.a.f.f;
import com.tencent.soter.a.f.f.a;
import com.tencent.soter.core.a.a.d;
import com.tencent.soter.core.c.j;
import com.tencent.soter.soterserver.SoterSessionResult;
import java.lang.ref.WeakReference;
import java.security.Signature;
import junit.framework.Assert;

public final class h extends d
  implements a
{
  String AvS;
  private c AwB;
  f AwC;
  private WeakReference<Context> AwD;
  com.tencent.soter.a.d.a AwE;
  com.tencent.soter.a.d.b AwF;
  j AwG;
  private h.a AwH;
  boolean AwI;
  boolean AwJ;
  boolean AwK;
  private int gOW;
  String tWZ;

  public h(b paramb)
  {
    AppMethodBeat.i(10513);
    this.gOW = -1;
    this.AvS = null;
    this.tWZ = null;
    this.AwB = null;
    this.AwC = null;
    this.AwD = null;
    this.AwE = null;
    this.AwF = null;
    this.AwG = null;
    this.AwH = null;
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
      AppMethodBeat.o(10513);
      throw paramb;
      bool2 = false;
      break;
    }
    label140: this.gOW = paramb.gOW;
    this.AwB = paramb.Awf;
    this.AwC = paramb.Awg;
    this.AwD = new WeakReference(paramb.mContext);
    this.AwF = paramb.Awi;
    this.AwE = paramb.mrV;
    this.tWZ = paramb.tWZ;
    AppMethodBeat.o(10513);
  }

  @SuppressLint({"NewApi"})
  final void a(Signature paramSignature)
  {
    AppMethodBeat.i(10518);
    if (this.AvW)
    {
      com.tencent.soter.core.c.d.w("Soter.TaskAuthentication", "soter: already finished. can not authenticate", new Object[0]);
      AppMethodBeat.o(10518);
    }
    while (true)
    {
      return;
      Object localObject = (Context)this.AwD.get();
      if (localObject == null)
      {
        com.tencent.soter.core.c.d.w("Soter.TaskAuthentication", "soter: context instance released in startAuthenticate", new Object[0]);
        b(new com.tencent.soter.a.b.a(17));
        AppMethodBeat.o(10518);
      }
      else
      {
        try
        {
          com.tencent.soter.core.c.d.v("Soter.TaskAuthentication", "soter: performing start", new Object[0]);
          localObject = com.tencent.soter.core.a.a.iU((Context)localObject);
          a.d locald = new com/tencent/soter/core/a/a$d;
          locald.<init>(paramSignature);
          if (this.AwE != null);
          for (paramSignature = this.AwE.zZp; ; paramSignature = null)
          {
            ((com.tencent.soter.core.a.a)localObject).a(locald, paramSignature, this.AwH);
            AppMethodBeat.o(10518);
            break;
          }
        }
        catch (Exception paramSignature)
        {
          localObject = paramSignature.getMessage();
          com.tencent.soter.core.c.d.e("Soter.TaskAuthentication", "soter: caused exception when authenticating: %s", new Object[] { localObject });
          com.tencent.soter.core.c.d.a("Soter.TaskAuthentication", paramSignature, "soter: caused exception when authenticating");
          b(new com.tencent.soter.a.b.a(20, String.format("start authentication failed due to %s", new Object[] { localObject })));
          AppMethodBeat.o(10518);
        }
      }
    }
  }

  public final void dRk()
  {
    AppMethodBeat.i(10520);
    com.tencent.soter.core.c.d.i("Soter.TaskAuthentication", "soter: called from cancellation signal", new Object[0]);
    if (this.AwH != null)
      this.AwH.onAuthenticationCancelled();
    AppMethodBeat.o(10520);
  }

  @SuppressLint({"DefaultLocale", "NewApi"})
  final boolean dRl()
  {
    boolean bool1 = true;
    AppMethodBeat.i(10514);
    boolean bool2;
    if (!com.tencent.soter.a.c.a.dRe().isInit())
    {
      com.tencent.soter.core.c.d.w("Soter.TaskAuthentication", "soter: not initialized yet", new Object[0]);
      b(new com.tencent.soter.a.b.a(14));
      AppMethodBeat.o(10514);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      if (!com.tencent.soter.a.c.a.dRe().dRc())
      {
        com.tencent.soter.core.c.d.w("Soter.TaskAuthentication", "soter: not support soter", new Object[0]);
        b(new com.tencent.soter.a.b.a(2));
        AppMethodBeat.o(10514);
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
            break label201;
          com.tencent.soter.core.c.d.w("Soter.TaskAuthentication", "soter: request prepare auth key scene: %d, but key name is not registered. Please make sure you register the scene in init", new Object[0]);
          b(new com.tencent.soter.a.b.a(15, String.format("auth scene %d not initialized in map", new Object[] { Integer.valueOf(this.gOW) })));
          AppMethodBeat.o(10514);
          bool2 = bool1;
          break;
        }
        label201: if (!com.tencent.soter.core.a.aua(this.AvS))
        {
          com.tencent.soter.core.c.d.w("Soter.TaskAuthentication", "soter: auth key %s not exists. need re-generate", new Object[] { this.AvS });
          b(new com.tencent.soter.a.b.a(12, String.format("the auth key to scene %d not exists. it may because you haven't prepare it, or user removed them already in system settings. please prepare the key again", new Object[] { Integer.valueOf(this.gOW) })));
          AppMethodBeat.o(10514);
          bool2 = bool1;
        }
        else if ((this.AwB == null) && (com.tencent.soter.core.c.g.isNullOrNil(this.tWZ)))
        {
          com.tencent.soter.core.c.d.w("Soter.TaskAuthentication", "soter: challenge wrapper is null!", new Object[0]);
          b(new com.tencent.soter.a.b.a(16, "neither get challenge wrapper nor challenge str is found in request parameter"));
          AppMethodBeat.o(10514);
          bool2 = bool1;
        }
        else
        {
          Context localContext = (Context)this.AwD.get();
          if (localContext == null)
          {
            com.tencent.soter.core.c.d.w("Soter.TaskAuthentication", "soter: context instance released in preExecute", new Object[0]);
            b(new com.tencent.soter.a.b.a(17));
            AppMethodBeat.o(10514);
            bool2 = bool1;
          }
          else if (!com.tencent.soter.core.a.a.iU(localContext).hasEnrolledFingerprints())
          {
            com.tencent.soter.core.c.d.w("Soter.TaskAuthentication", "soter: user has not enrolled any fingerprint in system.", new Object[0]);
            b(new com.tencent.soter.a.b.a(18));
            AppMethodBeat.o(10514);
            bool2 = bool1;
          }
          else if (com.tencent.soter.core.a.iT(localContext))
          {
            com.tencent.soter.core.c.d.w("Soter.TaskAuthentication", "soter: fingerprint sensor frozen", new Object[0]);
            b(new com.tencent.soter.a.b.a(25, "Too many failed times"));
            AppMethodBeat.o(10514);
            bool2 = bool1;
          }
          else if (this.AwE == null)
          {
            com.tencent.soter.core.c.d.w("Soter.TaskAuthentication", "soter: did not pass cancellation obj. We suggest you pass one", new Object[0]);
            this.AwE = new com.tencent.soter.a.d.a();
            AppMethodBeat.o(10514);
            bool2 = false;
          }
          else
          {
            if (this.AwC == null)
              com.tencent.soter.core.c.d.w("Soter.TaskAuthentication", "hy: we strongly recommend you to check the final authentication data in server! Please make sure you upload and check later", new Object[0]);
            AppMethodBeat.o(10514);
            bool2 = false;
          }
        }
      }
    }
  }

  final void dRm()
  {
    AppMethodBeat.i(10515);
    if (this.AwE != null)
      this.AwE.rr(true);
    AppMethodBeat.o(10515);
  }

  final void dRr()
  {
    AppMethodBeat.i(10517);
    Object localObject;
    if (com.tencent.soter.core.a.dQL() == 1)
    {
      localObject = com.tencent.soter.core.a.iC(this.AvS, this.tWZ);
      if (localObject == null)
      {
        com.tencent.soter.core.c.d.w("Soter.TaskAuthentication", "soter: error occurred when init sign soterSessionResult is null", new Object[0]);
        b(new com.tencent.soter.a.b.a(13));
        AppMethodBeat.o(10517);
      }
    }
    while (true)
    {
      return;
      if (((SoterSessionResult)localObject).bFZ != 0)
      {
        com.tencent.soter.core.c.d.w("Soter.TaskAuthentication", "soter: error occurred when init sign resultCode error", new Object[0]);
        b(new com.tencent.soter.a.b.a(13));
        AppMethodBeat.o(10517);
      }
      else
      {
        com.tencent.soter.core.c.d.d("Soter.TaskAuthentication", "soter: session is %d", new Object[] { Long.valueOf(((SoterSessionResult)localObject).AvH) });
        this.AwH = new h.a(this, null, (byte)0);
        this.AwH.AvH = ((SoterSessionResult)localObject).AvH;
        a(null);
        g.dRq().d(new h.2(this));
        AppMethodBeat.o(10517);
        continue;
        localObject = com.tencent.soter.core.a.aud(this.AvS);
        if (localObject == null)
        {
          com.tencent.soter.core.c.d.w("Soter.TaskAuthentication", "soter: error occurred when init sign", new Object[0]);
          b(new com.tencent.soter.a.b.a(13));
          AppMethodBeat.o(10517);
        }
        else
        {
          this.AwH = new h.a(this, (Signature)localObject, (byte)0);
          a((Signature)localObject);
          g.dRq().d(new h.3(this));
          AppMethodBeat.o(10517);
        }
      }
    }
  }

  final void dRs()
  {
    AppMethodBeat.i(10519);
    if (this.AwG == null)
    {
      b(new com.tencent.soter.a.b.a(22, "sign failed even after user authenticated the key."));
      AppMethodBeat.o(10519);
    }
    while (true)
    {
      return;
      this.AwC.bR(new f.a(this.AwG.signature, this.AwG.Avx, this.AwG.Avw));
      this.AwC.a(new h.4(this));
      this.AwC.execute();
      AppMethodBeat.o(10519);
    }
  }

  final void execute()
  {
    AppMethodBeat.i(10516);
    if (com.tencent.soter.core.c.g.isNullOrNil(this.tWZ))
    {
      com.tencent.soter.core.c.d.i("Soter.TaskAuthentication", "soter: not provide the challenge. we will do the job", new Object[0]);
      this.AwB.bR(new c.a());
      this.AwB.a(new h.1(this));
      this.AwB.execute();
      AppMethodBeat.o(10516);
    }
    while (true)
    {
      return;
      com.tencent.soter.core.c.d.i("Soter.TaskAuthentication", "soter: already provided the challenge. directly authenticate", new Object[0]);
      dRr();
      AppMethodBeat.o(10516);
    }
  }

  public final boolean isCancelled()
  {
    return this.AwK;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.h
 * JD-Core Version:    0.6.2
 */