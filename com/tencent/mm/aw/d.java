package com.tencent.mm.aw;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.TimeZone;

public final class d
{
  public static boolean aim()
  {
    AppMethodBeat.i(108007);
    boolean bool;
    if ((aio()) || (ain()))
    {
      bool = true;
      AppMethodBeat.o(108007);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(108007);
    }
  }

  public static boolean ain()
  {
    boolean bool = false;
    AppMethodBeat.i(108008);
    int i = g.Nu().getInt("ShakeMusicGlobalSwitch", 0);
    ab.i("MicroMsg.Music.MusicHelperUtils", "isShakeMusicGlobalUser: %d", new Object[] { Integer.valueOf(i) });
    if (i == 0)
      AppMethodBeat.o(108008);
    while (true)
    {
      return bool;
      AppMethodBeat.o(108008);
      bool = true;
    }
  }

  public static boolean aio()
  {
    AppMethodBeat.i(108009);
    TimeZone localTimeZone = TimeZone.getDefault();
    Object localObject = TimeZone.getTimeZone("GMT+08:00");
    boolean bool;
    if (localTimeZone.getRawOffset() != ((TimeZone)localObject).getRawOffset())
    {
      AppMethodBeat.o(108009);
      bool = false;
    }
    while (true)
    {
      return bool;
      localObject = (TelephonyManager)ah.getContext().getSystemService("phone");
      if (localObject != null)
      {
        localObject = ((TelephonyManager)localObject).getNetworkCountryIso();
        if ((!bo.isNullOrNil((String)localObject)) && (!((String)localObject).equalsIgnoreCase("cn")))
        {
          AppMethodBeat.o(108009);
          bool = false;
        }
      }
      else
      {
        bool = true;
        AppMethodBeat.o(108009);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aw.d
 * JD-Core Version:    0.6.2
 */