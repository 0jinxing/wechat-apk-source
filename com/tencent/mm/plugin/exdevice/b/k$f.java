package com.tencent.mm.plugin.exdevice.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class k$f
{
  private static f lqS = null;
  private long lqR;

  public k$f()
  {
    AppMethodBeat.i(19061);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localSharedPreferences != null)
    {
      l = localSharedPreferences.getLong("local_message_seq", 0L);
      ab.i("MicroMsg.exdevice.Util", "lasted seq id is %d", new Object[] { Long.valueOf(l) });
    }
    this.lqR = l;
    AppMethodBeat.o(19061);
  }

  public static long boz()
  {
    AppMethodBeat.i(19062);
    if (lqS == null)
      lqS = new f();
    Object localObject = lqS;
    if (9223372036854775807L == ((f)localObject).lqR)
    {
      ab.w("MicroMsg.MMSendDataToManufacturerLogic", "Sequence Data-overrun!!!");
      ((f)localObject).lqR = 0L;
    }
    long l = ((f)localObject).lqR + 1L;
    ((f)localObject).lqR = l;
    localObject = ah.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localObject != null)
    {
      ab.i("MicroMsg.exdevice.Util", "save locall seq id : %d", new Object[] { Long.valueOf(l) });
      ((SharedPreferences)localObject).edit().putLong("local_message_seq", l).commit();
    }
    AppMethodBeat.o(19062);
    return l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.k.f
 * JD-Core Version:    0.6.2
 */