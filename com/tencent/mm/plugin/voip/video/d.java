package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.media.ToneGenerator;
import android.provider.Settings.System;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class d
{
  public static Context mContext;
  private static final HashMap<String, Integer> sZR;
  public Object sZS;
  public ToneGenerator sZT;
  private final int sZU;

  static
  {
    AppMethodBeat.i(5056);
    HashMap localHashMap = new HashMap();
    sZR = localHashMap;
    localHashMap.put("1", Integer.valueOf(1));
    sZR.put("2", Integer.valueOf(2));
    sZR.put("3", Integer.valueOf(3));
    sZR.put("4", Integer.valueOf(4));
    sZR.put("5", Integer.valueOf(5));
    sZR.put("6", Integer.valueOf(6));
    sZR.put("7", Integer.valueOf(7));
    sZR.put("8", Integer.valueOf(8));
    sZR.put("9", Integer.valueOf(9));
    sZR.put("0", Integer.valueOf(0));
    sZR.put("#", Integer.valueOf(11));
    sZR.put("*", Integer.valueOf(10));
    AppMethodBeat.o(5056);
  }

  private d()
  {
    AppMethodBeat.i(5053);
    this.sZS = new Object();
    this.sZU = 250;
    AppMethodBeat.o(5053);
  }

  public d(Context arg1)
  {
    AppMethodBeat.i(5052);
    this.sZS = new Object();
    this.sZU = 250;
    mContext = ???;
    if (??? != null);
    while (true)
    {
      try
      {
        synchronized (this.sZS)
        {
          if ((cLH()) && (this.sZT == null))
          {
            ToneGenerator localToneGenerator = new android/media/ToneGenerator;
            localToneGenerator.<init>(3, 66);
            this.sZT = localToneGenerator;
          }
          AppMethodBeat.o(5052);
          return;
        }
      }
      catch (Exception )
      {
        ab.d("MicroMsg.DTMFToneGenerator", "获取音频发生器单例失败！！！");
        ab.d("MicroMsg.DTMFToneGenerator", ???.getMessage());
        this.sZT = null;
      }
      AppMethodBeat.o(5052);
    }
  }

  public static int acb(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(5055);
    if ((paramString == null) || (paramString.equals("")))
      AppMethodBeat.o(5055);
    while (true)
    {
      return i;
      if (sZR.containsKey(paramString))
      {
        i = ((Integer)sZR.get(paramString)).intValue();
        AppMethodBeat.o(5055);
      }
      else
      {
        AppMethodBeat.o(5055);
      }
    }
  }

  public static boolean cLH()
  {
    boolean bool = true;
    AppMethodBeat.i(5054);
    if (Settings.System.getInt(mContext.getContentResolver(), "dtmf_tone", 1) == 1)
      AppMethodBeat.o(5054);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(5054);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.d
 * JD-Core Version:    0.6.2
 */