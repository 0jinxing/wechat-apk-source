package com.tencent.mm.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.model.av;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

public final class aa
{
  private static aa gdW;
  private static boolean gef = false;
  private static boolean hasInit = false;
  private t ebz;
  private ab gdX;
  private ac gdY;
  private Context gdZ;
  private aa.a gea;
  private z geb;
  private y gec;
  private Looper ged;
  private w gee;
  private ak handler;

  public static void a(aa.a parama)
  {
    AppMethodBeat.i(58671);
    anf().gea = parama;
    AppMethodBeat.o(58671);
  }

  public static void a(ab paramab)
  {
    AppMethodBeat.i(58663);
    anf().gdX = paramab;
    AppMethodBeat.o(58663);
  }

  public static void a(ac paramac)
  {
    AppMethodBeat.i(58665);
    anf().gdY = paramac;
    AppMethodBeat.o(58665);
  }

  public static void a(w paramw)
  {
    AppMethodBeat.i(58680);
    anf().gee = paramw;
    AppMethodBeat.o(58680);
  }

  public static void a(y paramy)
  {
    AppMethodBeat.i(58677);
    anf().gec = paramy;
    AppMethodBeat.o(58677);
  }

  public static void a(z paramz)
  {
    AppMethodBeat.i(58675);
    anf().geb = paramz;
    AppMethodBeat.o(58675);
  }

  public static void a(ak paramak)
  {
    AppMethodBeat.i(58669);
    anf().handler = paramak;
    AppMethodBeat.o(58669);
  }

  private static aa anf()
  {
    AppMethodBeat.i(58657);
    if (gdW == null)
      gdW = new aa();
    aa localaa = gdW;
    AppMethodBeat.o(58657);
    return localaa;
  }

  private static SharedPreferences ang()
  {
    AppMethodBeat.i(58658);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("notify_key_pref_no_account", h.Mu());
    AppMethodBeat.o(58658);
    return localSharedPreferences;
  }

  public static SharedPreferences anh()
  {
    AppMethodBeat.i(58659);
    Object localObject1 = ang().getString("login_weixin_username", "");
    Object localObject2 = localObject1;
    if (bo.isNullOrNil((String)localObject1))
    {
      localObject1 = av.fly.T("login_weixin_username", "");
      localObject2 = localObject1;
      if (!bo.isNullOrNil((String)localObject1))
      {
        ang().edit().putString("login_weixin_username", (String)localObject1).commit();
        localObject2 = localObject1;
      }
    }
    localObject1 = localObject2;
    if (localObject2 != null)
      localObject1 = ((String)localObject2).replace("[\\/\\\\]", "#").trim();
    localObject2 = "notify_key_pref".concat(String.valueOf(localObject1));
    localObject2 = ah.getContext().getSharedPreferences((String)localObject2, h.Mu());
    AppMethodBeat.o(58659);
    return localObject2;
  }

  public static void ani()
  {
    AppMethodBeat.i(58660);
    SharedPreferences localSharedPreferences;
    int i;
    if (!hasInit)
    {
      localSharedPreferences = anh();
      long l = localSharedPreferences.getLong("wakeup_alarm_last_tick", 0L);
      i = localSharedPreferences.getInt("wakeup_alarm_last_cnt", 0);
      if ((l == 0L) || (l > bo.anU()))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMPushCore", "dealWithOnCreate, invalid time, thisCnt:%d", new Object[] { Integer.valueOf(i) });
        localSharedPreferences.edit().putLong("wakeup_alarm_last_tick", bo.anU()).commit();
        localSharedPreferences.edit().putInt("wakeup_alarm_last_cnt", 1).commit();
        AppMethodBeat.o(58660);
        return;
      }
      if (bo.gb(l) <= 86400000L)
        break label218;
      localSharedPreferences.edit().putInt("wakeup_alarm_launch_cnt", i).commit();
      localSharedPreferences.edit().putLong("wakeup_alarm_last_tick", bo.anU()).commit();
      localSharedPreferences.edit().putInt("wakeup_alarm_last_cnt", 1).commit();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMPushCore", "dealWithOnCreate, statistics cycle expire, thisCnt:%d", new Object[] { Integer.valueOf(i) });
    }
    while (true)
    {
      hasInit = true;
      AppMethodBeat.o(58660);
      break;
      label218: localSharedPreferences.edit().putInt("wakeup_alarm_last_cnt", i + 1).commit();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMPushCore", "dealWithOnCreate, add up launch count to:%d", new Object[] { Integer.valueOf(i + 1) });
    }
  }

  public static boolean anj()
  {
    AppMethodBeat.i(58661);
    String str = av.fly.T("login_user_name", "");
    Object localObject = str;
    if (str != null)
      localObject = str.replaceAll("[/\\\\]", "#").trim();
    localObject = ah.getContext().getSharedPreferences("notify_key_pref".concat(String.valueOf(localObject)), h.Mu());
    int i = ((SharedPreferences)localObject).getInt("wakeup_alarm_launch_cnt", 0);
    int j = ((SharedPreferences)localObject).getInt("wakeup_alarm_last_cnt", 0);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMPushCore", "isFrequentlyLaunch cnt:%d, thisCnt:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
    if (i > 10)
    {
      i = 1;
      if (j <= 10)
        break label128;
    }
    label128: for (j = 1; ; j = 0)
    {
      AppMethodBeat.o(58661);
      return j | i;
      i = 0;
      break;
    }
  }

  public static ab ank()
  {
    AppMethodBeat.i(58662);
    ab localab = anf().gdX;
    AppMethodBeat.o(58662);
    return localab;
  }

  public static ac anl()
  {
    AppMethodBeat.i(58664);
    ac localac = anf().gdY;
    AppMethodBeat.o(58664);
    return localac;
  }

  public static ak anm()
  {
    AppMethodBeat.i(58668);
    ak localak = anf().handler;
    AppMethodBeat.o(58668);
    return localak;
  }

  public static aa.a ann()
  {
    AppMethodBeat.i(58670);
    aa.a locala = anf().gea;
    AppMethodBeat.o(58670);
    return locala;
  }

  public static t ano()
  {
    AppMethodBeat.i(58672);
    t localt = anf().ebz;
    AppMethodBeat.o(58672);
    return localt;
  }

  public static z anp()
  {
    AppMethodBeat.i(58674);
    z localz = anf().geb;
    AppMethodBeat.o(58674);
    return localz;
  }

  public static y anq()
  {
    AppMethodBeat.i(58676);
    y localy = anf().gec;
    AppMethodBeat.o(58676);
    return localy;
  }

  public static Looper anr()
  {
    AppMethodBeat.i(58678);
    if (anf().ged == null)
    {
      localObject = d.anM("MMPushCore_handlerThread");
      ((HandlerThread)localObject).start();
      anf().ged = ((HandlerThread)localObject).getLooper();
    }
    Object localObject = anf().ged;
    AppMethodBeat.o(58678);
    return localObject;
  }

  public static w ans()
  {
    AppMethodBeat.i(58679);
    w localw = anf().gee;
    AppMethodBeat.o(58679);
    return localw;
  }

  public static void b(t paramt)
  {
    AppMethodBeat.i(58673);
    anf().ebz = paramt;
    AppMethodBeat.o(58673);
  }

  public static Context getContext()
  {
    AppMethodBeat.i(58666);
    Context localContext = anf().gdZ;
    AppMethodBeat.o(58666);
    return localContext;
  }

  public static void setContext(Context paramContext)
  {
    AppMethodBeat.i(58667);
    anf().gdZ = paramContext;
    AppMethodBeat.o(58667);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.aa
 * JD-Core Version:    0.6.2
 */