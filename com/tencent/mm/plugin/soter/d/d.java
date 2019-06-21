package com.tencent.mm.plugin.soter.d;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.soter.core.a;
import com.tencent.soter.core.c.i;

public final class d
{
  public static e cvQ()
  {
    AppMethodBeat.i(59333);
    Object localObject1 = ah.doB();
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = new e();
      AppMethodBeat.o(59333);
    }
    while (true)
    {
      return localObject2;
      localObject2 = ((SharedPreferences)localObject1).getString("cpu_id", "");
      localObject1 = ((SharedPreferences)localObject1).getString("uid", "");
      if ((!bo.isNullOrNil((String)localObject2)) && (!bo.isNullOrNil((String)localObject1)))
      {
        ab.i("MicroMsg.SoterDeviceInfoManager", "hy:device info exists in preference. directly return");
        localObject2 = new e((String)localObject2, (String)localObject1);
        AppMethodBeat.o(59333);
      }
      else
      {
        ab.w("MicroMsg.SoterDeviceInfoManager", "hy: no cpu id and uid retrieved. load again");
        localObject1 = a.dQS();
        if (localObject1 != null)
        {
          localObject2 = ((i)localObject1).rOh;
          localObject1 = String.valueOf(((i)localObject1).uid);
          if ((!bo.isNullOrNil((String)localObject2)) && (!bo.isNullOrNil((String)localObject1)))
          {
            gu((String)localObject2, (String)localObject1);
            localObject2 = new e((String)localObject2, (String)localObject1);
            AppMethodBeat.o(59333);
          }
        }
        else
        {
          localObject2 = new e();
          AppMethodBeat.o(59333);
        }
      }
    }
  }

  public static void gu(String paramString1, String paramString2)
  {
    AppMethodBeat.i(59334);
    Object localObject = ah.doB();
    if (localObject == null)
      AppMethodBeat.o(59334);
    while (true)
    {
      return;
      ab.i("MicroMsg.SoterDeviceInfoManager", "hy: save device info");
      localObject = ((SharedPreferences)localObject).edit();
      ((SharedPreferences.Editor)localObject).putString("cpu_id", paramString1);
      ((SharedPreferences.Editor)localObject).putString("uid", paramString2);
      ((SharedPreferences.Editor)localObject).apply();
      AppMethodBeat.o(59334);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.d.d
 * JD-Core Version:    0.6.2
 */