package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.TimeZone;

public final class bq
{
  public static boolean dpN()
  {
    AppMethodBeat.i(115249);
    Object localObject1 = ah.getContext().getSharedPreferences(ah.doA(), 0);
    ah.getContext();
    Object localObject2 = aa.h((SharedPreferences)localObject1);
    localObject1 = aa.dor();
    if (((String)localObject2).equals("language_default"));
    while (true)
    {
      boolean bool;
      if (!((String)localObject1).equals("zh_CN"))
      {
        AppMethodBeat.o(115249);
        bool = true;
      }
      while (true)
      {
        return bool;
        localObject1 = TimeZone.getDefault();
        localObject2 = TimeZone.getTimeZone("GMT+08:00");
        if (((TimeZone)localObject1).getRawOffset() != ((TimeZone)localObject2).getRawOffset())
        {
          AppMethodBeat.o(115249);
          bool = true;
        }
        else
        {
          localObject1 = (TelephonyManager)ah.getContext().getSystemService("phone");
          if (localObject1 != null)
          {
            localObject1 = ((TelephonyManager)localObject1).getNetworkCountryIso();
            if ((!bo.isNullOrNil((String)localObject1)) && (!((String)localObject1).contains("cn")) && (!((String)localObject1).contains("CN")))
            {
              AppMethodBeat.o(115249);
              bool = true;
            }
          }
          else
          {
            AppMethodBeat.o(115249);
            bool = false;
          }
        }
      }
      localObject1 = localObject2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bq
 * JD-Core Version:    0.6.2
 */