package com.tencent.mm.plugin.appbrand.debugger;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class DebuggerShell extends BroadcastReceiver
  implements com.tencent.mm.kernel.c.a, b
{
  private static boolean hjd;
  private final Map<String, DebuggerShell.a> hjc;

  static
  {
    AppMethodBeat.i(129939);
    hjd = false;
    ab.d("MicroMsg.DebuggerShell", "<clinit> BuildConfig.ENABLE_APPBRAND_MONKEY_TEST=%b", new Object[] { Boolean.valueOf(hjd) });
    if ((!hjd) && ((f.IS_FLAVOR_RED) || (bp.dpL())))
    {
      hjd = as.amF("ENABLE_APPBRAND_DEBUGGER").getBoolean("ENABLE_APPBRAND_DEBUGGER", false);
      ab.d("MicroMsg.DebuggerShell", "<clinit> ENABLE_MONKEY from mmkv = %b", new Object[] { Boolean.valueOf(hjd) });
    }
    AppMethodBeat.o(129939);
  }

  public DebuggerShell()
  {
    AppMethodBeat.i(129932);
    this.hjc = new HashMap();
    AppMethodBeat.o(129932);
  }

  public static boolean ayT()
  {
    return hjd;
  }

  public static boolean ayU()
  {
    AppMethodBeat.i(129936);
    boolean bool;
    if ((hjd) || (bp.dpL()))
    {
      bool = true;
      AppMethodBeat.o(129936);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(129936);
    }
  }

  @SuppressLint({"ApplySharedPref"})
  public static void ayV()
  {
    AppMethodBeat.i(129937);
    as.amF("ENABLE_APPBRAND_DEBUGGER").edit().putBoolean("ENABLE_APPBRAND_DEBUGGER", true).commit();
    hjd = true;
    AppMethodBeat.o(129937);
  }

  @SuppressLint({"ApplySharedPref"})
  public static void ayW()
  {
    AppMethodBeat.i(129938);
    as.amF("ENABLE_APPBRAND_DEBUGGER").edit().putBoolean("ENABLE_APPBRAND_DEBUGGER", false).commit();
    hjd = false;
    AppMethodBeat.o(129938);
  }

  public final void SH()
  {
    AppMethodBeat.i(129934);
    Object localObject = new IntentFilter();
    ((IntentFilter)localObject).addAction("com.tencent.mm.appbrand.debugger");
    ah.getContext().registerReceiver(this, (IntentFilter)localObject);
    Iterator localIterator = a.hjb.iterator();
    while (localIterator.hasNext())
    {
      localObject = (DebuggerShell.a)localIterator.next();
      if ((localObject != null) && (!bo.isNullOrNil(((DebuggerShell.a)localObject).name())))
        this.hjc.put(((DebuggerShell.a)localObject).name(), localObject);
    }
    AppMethodBeat.o(129934);
  }

  public final void SI()
  {
    AppMethodBeat.i(129935);
    ah.getContext().unregisterReceiver(this);
    this.hjc.clear();
    AppMethodBeat.o(129935);
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(129933);
    paramContext = paramIntent.getStringExtra("action");
    if ((!bo.isNullOrNil(paramContext)) && (this.hjc.containsKey(paramContext)))
      ((DebuggerShell.a)this.hjc.get(paramContext)).A(paramIntent);
    AppMethodBeat.o(129933);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.DebuggerShell
 * JD-Core Version:    0.6.2
 */