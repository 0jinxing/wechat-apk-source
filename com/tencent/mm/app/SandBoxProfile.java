package com.tencent.mm.app;

import android.content.res.Configuration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.s;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.sandbox.updater.k.a;
import com.tencent.mm.sdk.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class SandBoxProfile extends e
{
  public static final String ceo;

  static
  {
    AppMethodBeat.i(15399);
    ceo = ah.getPackageName() + ":sandbox";
    AppMethodBeat.o(15399);
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
  }

  public final void onCreate()
  {
    AppMethodBeat.i(15398);
    Object localObject = com.tencent.mm.booter.d.bo(ah.getContext());
    k.a("MMProtocalJni", SandBoxProfile.class.getClassLoader());
    k.a(a.xxo, SandBoxProfile.class.getClassLoader());
    MMProtocalJni.setClientPackVersion(com.tencent.mm.protocal.d.vxo);
    localObject = new s((com.tencent.mm.booter.d)localObject);
    try
    {
      ((s)localObject).jE("SANDBOX");
      ae.gio = bo.a(((s)localObject).jF(".com.tencent.mm.debug.test.network.simulate_down_fault"), false);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("Test.simulateDownFault = ");
      ab.i("MicroMsg.SandboxDebugger", ae.gio);
      label94: localObject = k.a.xxn;
      q.Bz();
      AppMethodBeat.o(15398);
      return;
    }
    catch (Error localError)
    {
      break label94;
    }
  }

  public final String toString()
  {
    return ceo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.SandBoxProfile
 * JD-Core Version:    0.6.2
 */