package com.tencent.mm.plugin.fcm;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.firebase.iid.FirebaseInstanceId;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public class a
  implements f
{
  private static a mqA;
  final Context context;
  private int mqB;

  private a(Context paramContext)
  {
    this.context = paramContext;
  }

  public static a bwG()
  {
    AppMethodBeat.i(56427);
    Object localObject;
    if (mqA != null)
    {
      localObject = mqA;
      AppMethodBeat.o(56427);
    }
    while (true)
    {
      return localObject;
      localObject = ah.getContext();
      if (localObject == null)
      {
        ab.e("MicroMsg.FCM.FcmRegister", "FCM appcontext null");
        localObject = null;
        AppMethodBeat.o(56427);
      }
      else
      {
        localObject = new a((Context)localObject);
        mqA = (a)localObject;
        AppMethodBeat.o(56427);
      }
    }
  }

  private SharedPreferences bwK()
  {
    AppMethodBeat.i(56433);
    SharedPreferences localSharedPreferences = this.context.getSharedPreferences(a.class.getSimpleName(), 0);
    AppMethodBeat.o(56433);
    return localSharedPreferences;
  }

  private void hp(boolean paramBoolean)
  {
    AppMethodBeat.i(56432);
    Object localObject = bwK();
    ab.i("MicroMsg.FCM.FcmRegister", "Saving regSvrResult: ".concat(String.valueOf(paramBoolean)));
    localObject = ((SharedPreferences)localObject).edit();
    ((SharedPreferences.Editor)localObject).putBoolean("isRegToSvr", paramBoolean);
    ((SharedPreferences.Editor)localObject).commit();
    if (paramBoolean)
    {
      this.mqB = com.tencent.mm.kernel.a.Ra();
      AppMethodBeat.o(56432);
    }
    while (true)
    {
      return;
      this.mqB = 0;
      AppMethodBeat.o(56432);
    }
  }

  public final void Mk(String paramString)
  {
    AppMethodBeat.i(56430);
    ab.i("MicroMsg.FCM.FcmRegister", "register token to svr: %s", new Object[] { paramString });
    e.pXa.a(901L, 11L, 1L, false);
    if (bo.isNullOrNil(paramString))
    {
      e.pXa.a(901L, 13L, 1L, false);
      ab.e("MicroMsg.FCM.FcmRegister", "token is null, fail reg");
      AppMethodBeat.o(56430);
    }
    while (true)
    {
      return;
      if (this.mqB == com.tencent.mm.kernel.a.Ra())
      {
        e.pXa.a(901L, 12L, 1L, false);
        ab.w("MicroMsg.FCM.FcmRegister", "have registered yet.");
        AppMethodBeat.o(56430);
      }
      else
      {
        paramString = new b(paramString);
        g.RQ();
        g.RO().eJo.a(paramString.getType(), this);
        g.RQ();
        g.RO().eJo.a(paramString, 0);
        e.pXa.a(901L, 14L, 1L, false);
        AppMethodBeat.o(56430);
      }
    }
  }

  final boolean bwH()
  {
    boolean bool = false;
    AppMethodBeat.i(56428);
    try
    {
      if (Build.VERSION.SDK_INT < 14)
      {
        ab.w("MicroMsg.FCM.FcmRegister", "device not support FCM reason = version < 14");
        AppMethodBeat.o(56428);
      }
      while (true)
      {
        return bool;
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.context);
        if (i == 0)
          break;
        ab.w("MicroMsg.FCM.FcmRegister", "device not support FCM reason = ".concat(String.valueOf(i)));
        AppMethodBeat.o(56428);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.e("MicroMsg.FCM.FcmRegister", localThrowable.toString());
        AppMethodBeat.o(56428);
        continue;
        bool = true;
        AppMethodBeat.o(56428);
      }
    }
  }

  final void bwI()
  {
    AppMethodBeat.i(56429);
    e.pXa.a(901L, 18L, 1L, false);
    Object localObject = FirebaseInstanceId.uD().getToken();
    if (bo.isNullOrNil((String)localObject))
    {
      e.pXa.a(901L, 19L, 1L, false);
      ab.w("MicroMsg.FCM.FcmRegister", "unreg fail, token is null");
      AppMethodBeat.o(56429);
    }
    while (true)
    {
      return;
      hp(false);
      localObject = new c((String)localObject);
      g.RQ();
      g.RO().eJo.a(((c)localObject).getType(), this);
      g.RQ();
      g.RO().eJo.a((m)localObject, 0);
      e.pXa.a(901L, 21L, 1L, false);
      AppMethodBeat.o(56429);
    }
  }

  public final boolean bwJ()
  {
    AppMethodBeat.i(56431);
    boolean bool = bwK().getBoolean("isRegToSvr", false);
    AppMethodBeat.o(56431);
    return bool;
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(56434);
    if (paramm == null)
    {
      AppMethodBeat.o(56434);
      return;
    }
    if ((paramm instanceof b))
    {
      g.RQ();
      g.RO().eJo.a(((b)paramm).getType(), this);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        ab.i("MicroMsg.FCM.FcmRegister", "NetSceneFcmReg success.");
        e.pXa.a(901L, 16L, 1L, false);
        bool = true;
      }
      while (true)
      {
        hp(bool);
        AppMethodBeat.o(56434);
        break;
        ab.i("MicroMsg.FCM.FcmRegister", "NetSceneFcmReg faild.");
        e.pXa.a(901L, 17L, 1L, false);
      }
    }
    if ((paramm instanceof c))
    {
      g.RQ();
      g.RO().eJo.a(((c)paramm).getType(), this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label191;
      ab.i("MicroMsg.FCM.FcmRegister", "NetSceneFcmUnreg success.");
      e.pXa.a(901L, 23L, 1L, false);
    }
    while (true)
    {
      hp(false);
      AppMethodBeat.o(56434);
      break;
      label191: ab.e("MicroMsg.FCM.FcmRegister", "NetSceneFcmUnreg faild.");
      e.pXa.a(901L, 24L, 1L, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fcm.a
 * JD-Core Version:    0.6.2
 */