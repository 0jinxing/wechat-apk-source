package com.tencent.mm.booter.notification.a;

import android.content.Context;
import android.media.AudioManager;
import android.text.format.Time;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.a.ui.b;
import com.tencent.mm.m.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.storage.bi;
import java.util.HashSet;
import java.util.Set;

public final class e
{
  private static final Set<String> een;
  static final Time eep;
  public boolean eeo;

  static
  {
    AppMethodBeat.i(16023);
    HashSet localHashSet = new HashSet();
    een = localHashSet;
    localHashSet.add("readerapp");
    een.add("blogapp");
    een.add("newsapp");
    eep = new Time();
    AppMethodBeat.o(16023);
  }

  public static boolean IU()
  {
    AppMethodBeat.i(16014);
    eep.setToNow();
    int i = eep.hour;
    int j = eep.minute;
    ah.getContext();
    boolean bool;
    if (!com.tencent.mm.m.a.bS(i, j))
    {
      ab.w("MicroMsg.Notification.Silent.Handle", "no shake & sound notification during background deactive time");
      bool = true;
      AppMethodBeat.o(16014);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(16014);
    }
  }

  public static boolean IV()
  {
    AppMethodBeat.i(16015);
    boolean bool = f.MG();
    ab.i("MicroMsg.Notification.Silent.Handle", "check is Sound Mode: %B", new Object[] { Boolean.valueOf(bool) });
    AppMethodBeat.o(16015);
    return bool;
  }

  public static boolean IW()
  {
    boolean bool1 = true;
    AppMethodBeat.i(16018);
    try
    {
      ui localui = new com/tencent/mm/g/a/ui;
      localui.<init>();
      localui.cQx.cAd = 2;
      com.tencent.mm.sdk.b.a.xxA.m(localui);
      bool2 = localui.cQy.cQz;
      if (!bool2)
      {
        ab.d("MicroMsg.Notification.Silent.Handle", "check is Voip NOT Calling: %B", new Object[] { Boolean.valueOf(bool1) });
        AppMethodBeat.o(16018);
        return bool2;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Notification.Silent.Handle", localException, "", new Object[0]);
        boolean bool2 = false;
        continue;
        bool1 = false;
      }
    }
  }

  public static boolean IX()
  {
    AppMethodBeat.i(16020);
    boolean bool = f.MI();
    int i = IY();
    if (i == 0)
      bool = false;
    ab.i("MicroMsg.Notification.Silent.Handle", "check is Shake Mode: %B, System AudioManager Mode: %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i) });
    AppMethodBeat.o(16020);
    return bool;
  }

  public static int IY()
  {
    AppMethodBeat.i(16021);
    int i = ((AudioManager)ah.getContext().getSystemService("audio")).getRingerMode();
    AppMethodBeat.o(16021);
    return i;
  }

  public static boolean a(String paramString, bi parambi)
  {
    boolean bool1 = true;
    AppMethodBeat.i(16017);
    boolean bool2;
    if ((f.kI(paramString)) && (!f.i(parambi)))
    {
      bool2 = true;
      if (bool2)
        break label59;
    }
    while (true)
    {
      ab.i("MicroMsg.Notification.Silent.Handle", "check is NOT Must Mute: %B", new Object[] { Boolean.valueOf(bool1) });
      AppMethodBeat.o(16017);
      return bool2;
      bool2 = false;
      break;
      label59: bool1 = false;
    }
  }

  public static boolean a(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      paramArrayOfBoolean[0] &= paramBoolean;
      paramArrayOfBoolean[1] &= paramBoolean;
      return bool;
    }
  }

  public static boolean a(boolean[] paramArrayOfBoolean, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean1) && (!paramBoolean2));
    for (boolean bool = true; ; bool = false)
    {
      paramArrayOfBoolean[0] &= paramBoolean1;
      paramArrayOfBoolean[1] &= paramBoolean2;
      return bool;
    }
  }

  public static boolean it(int paramInt)
  {
    AppMethodBeat.i(16016);
    if ((paramInt & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.Notification.Silent.Handle", "check is Service Request Sound: %B", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(16016);
      return bool;
    }
  }

  public static boolean iu(int paramInt)
  {
    AppMethodBeat.i(16022);
    if ((paramInt & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.Notification.Silent.Handle", "check is Service Request Shake: %B", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(16022);
      return bool;
    }
  }

  public static boolean jR(String paramString)
  {
    AppMethodBeat.i(16012);
    boolean bool;
    if (aj.amC("keep_chatting_silent".concat(String.valueOf(paramString))))
    {
      ab.i("MicroMsg.Notification.Silent.Handle", "check is Sound NOT Lock: FALSE");
      bool = true;
      AppMethodBeat.o(16012);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.Notification.Silent.Handle", "check is Sound NOT Lock: TRUE");
      bool = false;
      AppMethodBeat.o(16012);
    }
  }

  public static boolean jS(String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(16013);
    boolean bool2 = een.contains(paramString);
    if (!bool2);
    while (true)
    {
      ab.i("MicroMsg.Notification.Silent.Handle", "check is NOT Siler User: %B", new Object[] { Boolean.valueOf(bool1) });
      AppMethodBeat.o(16013);
      return bool2;
      bool1 = false;
    }
  }

  public static boolean l(int paramInt, String paramString)
  {
    AppMethodBeat.i(16019);
    boolean bool;
    if (f.ja(paramInt))
      if (f.kD(paramString))
        bool = f.Ns();
    while (true)
    {
      ab.i("MicroMsg.Notification.Silent.Handle", "check is Voip Need Sound: %B", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(16019);
      return bool;
      if (f.kE(paramString))
        bool = f.Nt();
      else
        bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.e
 * JD-Core Version:    0.6.2
 */