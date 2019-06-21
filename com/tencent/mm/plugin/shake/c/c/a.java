package com.tencent.mm.plugin.shake.c.c;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public final class a
{
  private static SimpleDateFormat krM = null;

  public static boolean Cw(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 5));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static int Cx(int paramInt)
  {
    int i = 0;
    int j = i;
    switch (paramInt)
    {
    default:
      j = i;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return j;
      j = 10;
      continue;
      j = 30;
      continue;
      j = 60;
      continue;
      j = 120;
      continue;
      j = 240;
    }
  }

  public static int Cy(int paramInt)
  {
    int i = 10;
    int j = i;
    switch (paramInt)
    {
    default:
      j = i;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (true)
    {
      return j;
      j = 20;
      continue;
      j = 30;
      continue;
      j = 60;
      continue;
      j = 90;
      continue;
      j = 120;
      continue;
      j = 150;
      continue;
      j = 180;
      continue;
      j = 240;
      continue;
      j = 300;
    }
  }

  public static int Hn(String paramString)
  {
    AppMethodBeat.i(24583);
    int i = Color.rgb(66, 66, 66);
    if ((paramString == null) || (paramString.length() < 7) || (!paramString.startsWith("#")))
    {
      ab.e("MicroMsg.ShakeCardUtil", "string format error");
      AppMethodBeat.o(24583);
    }
    while (true)
    {
      return i;
      try
      {
        paramString = paramString.substring(1).toUpperCase();
        int j = Color.argb(255, Integer.parseInt(paramString.substring(0, 2), 16), Integer.parseInt(paramString.substring(2, 4), 16), Integer.parseInt(paramString.substring(4, 6), 16));
        i = j;
        AppMethodBeat.o(24583);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.ShakeCardUtil", paramString.toString());
        AppMethodBeat.o(24583);
      }
    }
  }

  public static void cjM()
  {
    AppMethodBeat.i(24570);
    ab.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance()");
    if (!cjN())
    {
      ab.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() entrance is not open");
      if (ckh())
      {
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xIM, Boolean.TRUE);
        ab.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() open shake card entrance");
        AppMethodBeat.o(24570);
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() card entrance is not in open time");
      AppMethodBeat.o(24570);
      continue;
      ab.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() entrance is open");
      if (!ckh())
      {
        ab.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() card entrance is not in open time, close card entrance");
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xIM, Boolean.FALSE);
      }
      AppMethodBeat.o(24570);
    }
  }

  public static boolean cjN()
  {
    boolean bool = false;
    AppMethodBeat.i(24571);
    if (!aw.RK())
    {
      ab.e("MicroMsg.ShakeCardUtil", "acc is not ready");
      AppMethodBeat.o(24571);
      return bool;
    }
    aw.ZK();
    Object localObject = com.tencent.mm.model.c.Ry().get(ac.a.xIM, Boolean.FALSE);
    if (localObject != null);
    for (bool = ((Boolean)localObject).booleanValue(); ; bool = false)
    {
      AppMethodBeat.o(24571);
      break;
    }
  }

  public static void cjO()
  {
    AppMethodBeat.i(24587);
    ab.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil setShakeCardEntranceData()");
    int i = (int)(System.currentTimeMillis() / 1000L);
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIN, Integer.valueOf(i));
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIO, Integer.valueOf(86400 + i));
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIP, "");
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIT, Integer.valueOf(0));
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIQ, Integer.valueOf(1));
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIR, Integer.valueOf(6));
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIS, "");
    com.tencent.mm.x.c.PK().y(262154, true);
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIU, String.valueOf(i));
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIV, "hello");
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIW, "shake card");
    AppMethodBeat.o(24587);
  }

  public static void cjP()
  {
    AppMethodBeat.i(24588);
    ab.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil clearShakeCardEntranceData()");
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIN, Integer.valueOf(0));
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIO, Integer.valueOf(0));
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIP, "");
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIT, Integer.valueOf(0));
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIQ, Integer.valueOf(0));
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIR, Integer.valueOf(0));
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIS, "");
    com.tencent.mm.x.c.PK().y(262154, false);
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIU, "");
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIV, "");
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(ac.a.xIW, "");
    AppMethodBeat.o(24588);
  }

  private static boolean ckh()
  {
    boolean bool = false;
    AppMethodBeat.i(24572);
    int i = cki();
    int j = ckj();
    ab.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time : " + i + " end time : " + j);
    if (i <= 0)
    {
      ab.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time is " + i + " , invalid");
      AppMethodBeat.o(24572);
    }
    while (true)
    {
      return bool;
      if (j <= 0)
      {
        ab.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil end time  is " + j + " , invalid");
        AppMethodBeat.o(24572);
      }
      else if (i >= j)
      {
        ab.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time is >= end time, invalid time");
        AppMethodBeat.o(24572);
      }
      else
      {
        int k = (int)(System.currentTimeMillis() / 1000L);
        ab.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time : ".concat(String.valueOf(k)));
        if ((k >= i) && (k <= j))
        {
          ab.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time is incled in [btime, etime]");
          bool = true;
          AppMethodBeat.o(24572);
        }
        else
        {
          ab.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time is not incled in [btime, etime]");
          AppMethodBeat.o(24572);
        }
      }
    }
  }

  private static int cki()
  {
    AppMethodBeat.i(24573);
    aw.ZK();
    int i = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xIN, Integer.valueOf(0))).intValue();
    AppMethodBeat.o(24573);
    return i;
  }

  private static int ckj()
  {
    AppMethodBeat.i(24574);
    aw.ZK();
    int i = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xIO, Integer.valueOf(0))).intValue();
    AppMethodBeat.o(24574);
    return i;
  }

  public static int ckk()
  {
    AppMethodBeat.i(24575);
    aw.ZK();
    int i = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xIT, Integer.valueOf(0))).intValue();
    AppMethodBeat.o(24575);
    return i;
  }

  public static String ckl()
  {
    AppMethodBeat.i(24576);
    aw.ZK();
    String str = (String)com.tencent.mm.model.c.Ry().get(ac.a.xIS, "");
    AppMethodBeat.o(24576);
    return str;
  }

  public static String ckm()
  {
    AppMethodBeat.i(24577);
    aw.ZK();
    String str = (String)com.tencent.mm.model.c.Ry().get(ac.a.xIP, "");
    AppMethodBeat.o(24577);
    return str;
  }

  public static String ckn()
  {
    AppMethodBeat.i(24578);
    aw.ZK();
    String str = (String)com.tencent.mm.model.c.Ry().get(ac.a.xIV, "");
    AppMethodBeat.o(24578);
    return str;
  }

  public static String cko()
  {
    AppMethodBeat.i(24579);
    aw.ZK();
    String str = (String)com.tencent.mm.model.c.Ry().get(ac.a.xIU, "");
    AppMethodBeat.o(24579);
    return str;
  }

  public static String ckp()
  {
    AppMethodBeat.i(24580);
    aw.ZK();
    String str = (String)com.tencent.mm.model.c.Ry().get(ac.a.xIY, "");
    AppMethodBeat.o(24580);
    return str;
  }

  public static String ckq()
  {
    AppMethodBeat.i(24581);
    aw.ZK();
    String str = (String)com.tencent.mm.model.c.Ry().get(ac.a.xIX, "");
    AppMethodBeat.o(24581);
    return str;
  }

  public static int ckr()
  {
    AppMethodBeat.i(24582);
    aw.ZK();
    int i = com.tencent.mm.model.c.QF();
    int j = (int)(System.currentTimeMillis() % 10L);
    i = (new Random(i).nextInt(10) + j) % 10;
    ab.i("MicroMsg.ShakeCardUtil", "genShakeCardFrequencyLevel retRand:".concat(String.valueOf(i)));
    AppMethodBeat.o(24582);
    return i;
  }

  public static boolean cks()
  {
    AppMethodBeat.i(24586);
    boolean bool;
    if ((cjN()) && (aa.don()))
    {
      bool = true;
      AppMethodBeat.o(24586);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(24586);
    }
  }

  public static String fQ(long paramLong)
  {
    AppMethodBeat.i(24584);
    paramLong = 1000L * paramLong;
    new GregorianCalendar().setTimeInMillis(paramLong);
    if (krM == null)
      krM = new SimpleDateFormat("yyyy.MM.dd");
    String str = krM.format(new Date(paramLong));
    AppMethodBeat.o(24584);
    return str;
  }

  public static void u(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(24585);
    ab.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil doCardDetailUI()");
    Intent localIntent = new Intent();
    localIntent.putExtra("key_card_id", paramString1);
    localIntent.putExtra("key_card_ext", paramString2);
    localIntent.putExtra("key_from_scene", 15);
    d.b(paramContext, "card", ".ui.CardDetailUI", localIntent);
    AppMethodBeat.o(24585);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.c.c.a
 * JD-Core Version:    0.6.2
 */