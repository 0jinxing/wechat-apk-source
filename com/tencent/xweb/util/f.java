package com.tencent.xweb.util;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.i;
import com.tencent.xweb.i.a;
import com.tencent.xweb.u;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import org.xwalk.core.XWalkEnvironment;

public final class f
{
  public static String AMN = "";
  private static boolean AQh = false;
  static WebView.d AQi = WebView.d.ANa;
  static u AQj = null;
  static boolean AQk = false;
  public static String cvF = "";

  public static boolean Sw(int paramInt)
  {
    if ((paramInt == 15625) || (paramInt == 15626));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void Sx(int paramInt)
  {
    AppMethodBeat.i(4087);
    if (!"toolsmp".equals(AMN))
    {
      AppMethodBeat.o(4087);
      return;
    }
    int i;
    label37: int j;
    if (WebView.getCurWebType() == WebView.d.ANb)
    {
      i = 200;
      if (paramInt >= 0)
        break label88;
      j = 3;
    }
    while (true)
    {
      n(903L, i + j, 1L);
      AppMethodBeat.o(4087);
      break;
      if (WebView.getCurWebType() == WebView.d.ANc)
      {
        i = 220;
        break label37;
      }
      AppMethodBeat.o(4087);
      break;
      label88: j = paramInt;
      if (paramInt > 9)
        j = 4;
    }
  }

  public static void a(u paramu)
  {
    AQj = paramu;
  }

  public static void aHn()
  {
    AppMethodBeat.i(4065);
    if (AQj != null)
      AQj.k(577L, 25L, 1L);
    AppMethodBeat.o(4065);
  }

  public static void aK(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(4054);
    if (AQj != null)
    {
      int i = 0;
      switch (paramInt)
      {
      default:
        paramInt = i;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      if (paramInt > 0)
        AQj.k(577L, paramInt, 1L);
      AppMethodBeat.o(4054);
      return;
      if (paramBoolean)
      {
        paramInt = 163;
      }
      else
      {
        paramInt = 159;
        continue;
        if (paramBoolean)
        {
          paramInt = 164;
        }
        else
        {
          paramInt = 160;
          continue;
          if (paramBoolean)
          {
            paramInt = 165;
          }
          else
          {
            paramInt = 161;
            continue;
            if (paramBoolean)
              paramInt = 166;
            else
              paramInt = 162;
          }
        }
      }
    }
  }

  public static void aL(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(4055);
    if (AQj != null)
    {
      int i = 0;
      switch (paramInt)
      {
      default:
        paramInt = i;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      if (paramInt > 0)
        AQj.k(577L, paramInt, 1L);
      AppMethodBeat.o(4055);
      return;
      if (paramBoolean)
      {
        paramInt = 155;
      }
      else
      {
        paramInt = 151;
        continue;
        if (paramBoolean)
        {
          paramInt = 156;
        }
        else
        {
          paramInt = 152;
          continue;
          if (paramBoolean)
          {
            paramInt = 157;
          }
          else
          {
            paramInt = 153;
            continue;
            if (paramBoolean)
              paramInt = 158;
            else
              paramInt = 154;
          }
        }
      }
    }
  }

  public static void avn(String paramString)
  {
    if (paramString != null)
      AMN = paramString;
  }

  public static void avo(String paramString)
  {
    int i = 73;
    AppMethodBeat.i(4031);
    int j;
    if (AQj != null)
    {
      AQj.k(577L, 0L, 1L);
      if ((AMN.equals("toolsmp")) && (paramString != null) && (avq(paramString) == 2))
        AQj.k(903L, 101L, 1L);
      if (!AMN.equals("toolsmp"))
        break label179;
      if (WebView.getCurWebType() != WebView.d.ANb)
        break label154;
      AQj.k(903L, 105L, 1L);
      if (!AQh)
      {
        if (!AMN.equals("tools"))
          break label218;
        j = 70;
      }
    }
    while (true)
    {
      i = WebView.getCurWebType().ordinal() - 1;
      if ((j >= 70) && (i >= 0))
      {
        AQh = true;
        ij(577, j + i);
      }
      AppMethodBeat.o(4031);
      return;
      label154: if (WebView.getCurWebType() != WebView.d.ANc)
        break;
      AQj.k(903L, 104L, 1L);
      break;
      label179: if ((!AMN.equals("tools")) || (paramString == null) || (avq(paramString) != 1))
        break;
      AQj.k(903L, 103L, 1L);
      break;
      label218: j = i;
      if (!AMN.equals("appbrand"))
      {
        j = i;
        if (!AMN.equals("support"))
          j = -1;
      }
    }
  }

  public static void avp(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(4033);
        if (AQj == null)
        {
          AppMethodBeat.o(4033);
          return;
        }
        if (!AQk)
        {
          if ("toolsmp".equals(AMN))
          {
            if (!dUK())
              break label207;
            ij(903, 106);
          }
          i = dUM();
          j = WebView.getCurWebType().ordinal() - 1;
          if ((i >= 30) && (j >= 0))
          {
            AQk = true;
            ij(903, i + 3 + j);
          }
        }
        if ((paramString != null) && ("https://servicewechat.com/preload/page-frame.html".equalsIgnoreCase(paramString.trim())))
          AQj.k(903L, 102L, 1L);
        int j = dUM();
        int i = WebView.getCurWebType().ordinal() - 1;
        if ((j >= 30) && (i >= 0))
          AQj.k(903L, j + 0 + i, 1L);
        if (!"toolsmp".equals(AMN))
          break label243;
        if (!dUK())
          break label224;
        AQj.k(903L, 107L, 1L);
        AppMethodBeat.o(4033);
        continue;
      }
      finally
      {
      }
      label207: if (dUL())
      {
        ij(903, 108);
        continue;
        label224: if (dUL())
          AQj.k(903L, 109L, 1L);
        label243: AppMethodBeat.o(4033);
      }
    }
  }

  public static int avq(String paramString)
  {
    AppMethodBeat.i(4045);
    int i;
    if (paramString.startsWith("https://servicewechat.com/"))
    {
      i = 0;
      AppMethodBeat.o(4045);
    }
    while (true)
    {
      return i;
      if ((paramString.startsWith("http://mp.weixin.qq.com/")) || (paramString.startsWith("https://mp.weixin.qq.com/")) || (paramString.startsWith("https://servicewechat.com/preload/")) || (paramString.startsWith("http://mp.weixinbridge.com/")))
      {
        i = 1;
        AppMethodBeat.o(4045);
      }
      else
      {
        i = 2;
        AppMethodBeat.o(4045);
      }
    }
  }

  public static void b(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(4043);
    u localu;
    int i;
    int j;
    if (AQj != null)
    {
      dUN();
      AQj.k(577L, 5L, 1L);
      AQj.X(15003, "");
      localu = AQj;
      i = XWalkEnvironment.getAvailableVersion();
      j = avq(paramString);
      paramString = cvF;
      if (i.dTU() != null)
        break label94;
    }
    label94: for (int k = 100; ; k = i.dTU().ordinal())
    {
      localu.a(i, j, paramString, k, 1, paramInt1, (int)paramLong, paramInt2);
      AppMethodBeat.o(4043);
      return;
    }
  }

  public static void bX(int paramInt, String paramString)
  {
    AppMethodBeat.i(4028);
    if (AQj != null)
      AQj.X(paramInt, paramString);
    AppMethodBeat.o(4028);
  }

  private static boolean dUK()
  {
    AppMethodBeat.i(4024);
    boolean bool;
    if ((AQi == WebView.d.ANb) && (WebView.getCurWebType() != AQi))
    {
      bool = true;
      AppMethodBeat.o(4024);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4024);
    }
  }

  private static boolean dUL()
  {
    AppMethodBeat.i(4025);
    boolean bool;
    if ((WebView.getCurWebType() == WebView.d.ANb) && (WebView.getCurWebType() != AQi))
    {
      bool = true;
      AppMethodBeat.o(4025);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4025);
    }
  }

  private static int dUM()
  {
    AppMethodBeat.i(4032);
    int i = -1;
    if (AMN.equals("mm"))
      i = 30;
    while (true)
    {
      AppMethodBeat.o(4032);
      return i;
      if (AMN.equals("tools"))
        i = 36;
      else if (AMN.equals("toolsmp"))
        i = 42;
      else if (AMN.equals("appbrand"))
        i = 48;
      else if (AMN.equals("support"))
        i = 54;
    }
  }

  public static void dUN()
  {
    AppMethodBeat.i(4034);
    if (AQj != null)
      AQj.k(577L, 1L, 1L);
    AppMethodBeat.o(4034);
  }

  public static void dUO()
  {
    AppMethodBeat.i(4036);
    if (AQj != null)
      AQj.k(577L, 46L, 1L);
    AppMethodBeat.o(4036);
  }

  public static void dUP()
  {
    AppMethodBeat.i(4037);
    if (AQj != null)
      AQj.k(577L, 47L, 1L);
    AppMethodBeat.o(4037);
  }

  public static void dUQ()
  {
    AppMethodBeat.i(4039);
    if (AQj != null)
      AQj.k(577L, 42L, 1L);
    AppMethodBeat.o(4039);
  }

  public static void dUR()
  {
    AppMethodBeat.i(4040);
    if (AQj != null)
      AQj.k(577L, 43L, 1L);
    AppMethodBeat.o(4040);
  }

  public static void dUS()
  {
    AppMethodBeat.i(4046);
    if (AQj != null)
      AQj.k(577L, 52L, 1L);
    AppMethodBeat.o(4046);
  }

  public static void dUT()
  {
    AppMethodBeat.i(4047);
    if (AQj != null)
      AQj.k(577L, 53L, 1L);
    AppMethodBeat.o(4047);
  }

  public static void dUU()
  {
    AppMethodBeat.i(4048);
    if (AQj != null)
      AQj.k(577L, 54L, 1L);
    AppMethodBeat.o(4048);
  }

  public static void dUV()
  {
    AppMethodBeat.i(4049);
    if (AQj != null)
      AQj.k(577L, 55L, 1L);
    AppMethodBeat.o(4049);
  }

  public static void dUW()
  {
    AppMethodBeat.i(4050);
    if (AQj != null)
      AQj.k(577L, 56L, 1L);
    AppMethodBeat.o(4050);
  }

  public static void dUX()
  {
    AppMethodBeat.i(4051);
    if (AQj != null)
      AQj.k(577L, 57L, 1L);
    AppMethodBeat.o(4051);
  }

  public static void dUY()
  {
    AppMethodBeat.i(4052);
    if (AQj != null)
      AQj.k(577L, 58L, 1L);
    AppMethodBeat.o(4052);
  }

  public static void dUZ()
  {
    AppMethodBeat.i(4053);
    if (AQj != null)
      AQj.k(577L, 59L, 1L);
    AppMethodBeat.o(4053);
  }

  public static void dVa()
  {
    AppMethodBeat.i(4056);
    if (AQj != null)
      AQj.k(577L, 167L, 1L);
    AppMethodBeat.o(4056);
  }

  public static void dVb()
  {
    AppMethodBeat.i(4057);
    if (AQj != null)
      AQj.k(577L, 9L, 1L);
    AppMethodBeat.o(4057);
  }

  public static void dVc()
  {
    AppMethodBeat.i(4059);
    if (AQj != null)
      AQj.k(577L, 10L, 1L);
    AppMethodBeat.o(4059);
  }

  public static void dVd()
  {
    AppMethodBeat.i(4060);
    if (AQj != null)
      AQj.k(577L, 60L, 1L);
    AppMethodBeat.o(4060);
  }

  public static void dVe()
  {
    AppMethodBeat.i(4062);
    if (AQj != null)
      AQj.k(577L, 20L, 1L);
    AppMethodBeat.o(4062);
  }

  public static void dVf()
  {
    AppMethodBeat.i(4064);
    if (AQj != null)
      AQj.k(577L, 21L, 1L);
    AppMethodBeat.o(4064);
  }

  public static void dVg()
  {
    AppMethodBeat.i(4067);
    if (AQj != null)
      AQj.k(577L, 26L, 1L);
    AppMethodBeat.o(4067);
  }

  public static void dVh()
  {
    AppMethodBeat.i(4068);
    if (AQj != null)
      AQj.k(577L, 14L, 1L);
    AppMethodBeat.o(4068);
  }

  public static void dVi()
  {
    AppMethodBeat.i(4069);
    if (AQj != null)
      AQj.k(577L, 15L, 1L);
    AppMethodBeat.o(4069);
  }

  public static void dVj()
  {
    AppMethodBeat.i(4071);
    if (AQj == null)
      AppMethodBeat.o(4071);
    while (true)
    {
      return;
      AQj.k(577L, 83L, 1L);
      AppMethodBeat.o(4071);
    }
  }

  public static void dVk()
  {
    AppMethodBeat.i(4073);
    if (AQj == null)
      AppMethodBeat.o(4073);
    while (true)
    {
      return;
      AQj.k(577L, 87L, 1L);
      AppMethodBeat.o(4073);
    }
  }

  public static void dVl()
  {
    AppMethodBeat.i(4075);
    if (AQj != null)
      AQj.k(577L, 180L, 1L);
    AppMethodBeat.o(4075);
  }

  public static void dVm()
  {
    AppMethodBeat.i(4076);
    if (AQj != null)
      AQj.k(577L, 181L, 1L);
    AppMethodBeat.o(4076);
  }

  public static void dVn()
  {
    AppMethodBeat.i(4077);
    if (AQj != null)
      AQj.k(577L, 182L, 1L);
    AppMethodBeat.o(4077);
  }

  public static void dVo()
  {
    AppMethodBeat.i(4078);
    if (AQj != null)
      AQj.k(577L, 183L, 1L);
    AppMethodBeat.o(4078);
  }

  public static void dVp()
  {
    AppMethodBeat.i(4079);
    if (AQj != null)
      AQj.k(577L, 184L, 1L);
    AppMethodBeat.o(4079);
  }

  public static void dVq()
  {
    AppMethodBeat.i(4080);
    if (AQj != null)
      AQj.k(577L, 185L, 1L);
    AppMethodBeat.o(4080);
  }

  public static void dVr()
  {
    AppMethodBeat.i(4081);
    if (AQj != null)
      AQj.k(577L, 186L, 1L);
    AppMethodBeat.o(4081);
  }

  public static void dVs()
  {
    AppMethodBeat.i(4082);
    if (AQj != null)
      AQj.k(577L, 187L, 1L);
    AppMethodBeat.o(4082);
  }

  public static void dVt()
  {
    AppMethodBeat.i(4083);
    if (AQj != null)
      AQj.k(577L, 188L, 1L);
    AppMethodBeat.o(4083);
  }

  public static void dVu()
  {
    AppMethodBeat.i(4084);
    if (AQj != null)
      AQj.k(577L, 189L, 1L);
    AppMethodBeat.o(4084);
  }

  public static void dVv()
  {
    AppMethodBeat.i(4085);
    if (AQj != null)
      AQj.k(577L, 190L, 1L);
    AppMethodBeat.o(4085);
  }

  public static void dVw()
  {
    AppMethodBeat.i(4086);
    if (AQj == null)
      AppMethodBeat.o(4086);
    while (true)
    {
      return;
      AQj.k(577L, 88L, 1L);
      AppMethodBeat.o(4086);
    }
  }

  public static void dVx()
  {
    AppMethodBeat.i(138352);
    n(938L, 89L, 1L);
    AppMethodBeat.o(138352);
  }

  public static void dVy()
  {
    AppMethodBeat.i(138353);
    n(938L, 90L, 1L);
    AppMethodBeat.o(138353);
  }

  public static void dVz()
  {
    AppMethodBeat.i(138354);
    n(938L, 91L, 1L);
    AppMethodBeat.o(138354);
  }

  public static void eV(String paramString, int paramInt)
  {
    AppMethodBeat.i(4042);
    u localu;
    int i;
    int j;
    if (AQj != null)
    {
      avo(paramString);
      cvF = UUID.randomUUID().toString().replace("-", "");
      AQj.k(577L, 4L, 1L);
      localu = AQj;
      i = XWalkEnvironment.getAvailableVersion();
      j = avq(paramString);
      paramString = cvF;
      if (i.dTU() != null)
        break label95;
    }
    label95: for (int k = 100; ; k = i.dTU().ordinal())
    {
      localu.a(i, j, paramString, k, 0, 0, 0, paramInt);
      AppMethodBeat.o(4042);
      return;
    }
  }

  public static void g(WebView.d paramd)
  {
    AQi = paramd;
  }

  public static void h(WebView.d paramd)
  {
    AppMethodBeat.i(4027);
    if (AQj == null)
    {
      AppMethodBeat.o(4027);
      return;
    }
    int i;
    label28: String str1;
    label36: String str2;
    String str3;
    if (paramd == WebView.d.ANb)
    {
      i = 1;
      if (i == 0)
        break label123;
      str1 = "REPORT_APK_VER_TIME";
      str2 = new SimpleDateFormat("yyyyMMdd").format(new Date());
      str3 = XWalkEnvironment.getSharedPreferences().getString(str1, "");
      if (str3 != null)
        break label315;
      str3 = "";
    }
    label306: label315: 
    while (true)
    {
      if (paramd == WebView.d.ANb)
      {
        i = XWalkEnvironment.getSharedPreferences().getInt("REPORT_XWEB_APK_VER", 0);
        int j = XWalkEnvironment.getAvailableVersion();
        if (j <= 0)
        {
          AppMethodBeat.o(4027);
          break;
          i = 0;
          break label28;
          label123: str1 = "REPORT_APK_VER_TIME_".concat(String.valueOf(paramd));
          break label36;
        }
        if ((j != i) || (!str2.equals(str3)))
        {
          AQj.k(577L, j % 50 + 100, 1L);
          XWalkEnvironment.getSharedPreferences().edit().putInt("REPORT_XWEB_APK_VER", j).commit();
        }
      }
      if (str2.equals(str3))
      {
        AppMethodBeat.o(4027);
        break;
      }
      if (paramd == WebView.d.ANb)
      {
        if (XWalkEnvironment.getAvailableVersion() <= 0)
        {
          AppMethodBeat.o(4027);
          break;
        }
        i = 99;
      }
      while (true)
      {
        AQj.k(577L, i, 1L);
        XWalkEnvironment.getSharedPreferences().edit().putString(str1, str2).commit();
        AppMethodBeat.o(4027);
        break;
        if (paramd == WebView.d.ANd)
        {
          i = 97;
        }
        else
        {
          if (paramd != WebView.d.ANc)
            break label306;
          i = 98;
        }
      }
      AppMethodBeat.o(4027);
      break;
    }
  }

  public static boolean hasInit()
  {
    if (AQj != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void i(WebView.d paramd)
  {
    AppMethodBeat.i(4061);
    if (AQj == null)
      AppMethodBeat.o(4061);
    while (true)
    {
      return;
      if (paramd == WebView.d.ANb)
      {
        AQj.k(577L, 61L, 1L);
        ij(577, 62);
      }
      AppMethodBeat.o(4061);
    }
  }

  private static void ij(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(4026);
    if (AQj == null)
      AppMethodBeat.o(4026);
    while (true)
    {
      return;
      SharedPreferences localSharedPreferences = XWalkEnvironment.getMMKVSharedTransportOld("REPORT_DAILY");
      String str1 = "id_" + paramInt1 + "_key_" + paramInt2;
      String str2 = new SimpleDateFormat("yyyyMMdd").format(new Date());
      if (str2.equals(localSharedPreferences.getString(str1, "")))
      {
        AppMethodBeat.o(4026);
      }
      else
      {
        AQj.k(paramInt1, paramInt2, 1L);
        localSharedPreferences.edit().putString(str1, str2).commit();
        AppMethodBeat.o(4026);
      }
    }
  }

  public static void j(WebView.d paramd)
  {
    AppMethodBeat.i(4072);
    if (AQj == null)
      AppMethodBeat.o(4072);
    while (true)
    {
      return;
      switch (f.1.iJa[paramd.ordinal()])
      {
      default:
        AppMethodBeat.o(4072);
      case 1:
      case 2:
      case 3:
      }
    }
    int i = 82;
    while (true)
    {
      AQj.k(577L, i, 1L);
      AppMethodBeat.o(4072);
      break;
      i = 81;
      continue;
      i = 80;
    }
  }

  public static void k(WebView.d paramd)
  {
    AppMethodBeat.i(4074);
    if (AQj == null)
      AppMethodBeat.o(4074);
    while (true)
    {
      return;
      switch (f.1.iJa[paramd.ordinal()])
      {
      default:
        AppMethodBeat.o(4074);
      case 1:
      case 2:
      case 3:
      }
    }
    int i = 86;
    while (true)
    {
      AQj.k(577L, i, 1L);
      AppMethodBeat.o(4074);
      break;
      i = 85;
      continue;
      i = 84;
    }
  }

  public static void n(long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(4030);
    if (AQj != null)
      AQj.k(paramLong1, paramLong2, paramLong3);
    AppMethodBeat.o(4030);
  }

  public static void nI(long paramLong)
  {
    AppMethodBeat.i(4029);
    if (AQj != null)
      AQj.k(577L, paramLong, 1L);
    AppMethodBeat.o(4029);
  }

  public static void nJ(long paramLong)
  {
    AppMethodBeat.i(4035);
    if ((AQj != null) && (paramLong > 0L) && (paramLong < 300000L))
      AQj.aG(2, 3, (int)paramLong);
    AppMethodBeat.o(4035);
  }

  public static void nK(long paramLong)
  {
    AppMethodBeat.i(4038);
    if ((AQj != null) && (paramLong > 0L) && (paramLong < 300000L))
      AQj.aG(48, 49, (int)paramLong);
    AppMethodBeat.o(4038);
  }

  public static void nL(long paramLong)
  {
    AppMethodBeat.i(4041);
    if ((AQj != null) && (paramLong > 0L) && (paramLong < 300000L))
      AQj.aG(44, 45, (int)paramLong);
    AppMethodBeat.o(4041);
  }

  public static void nM(long paramLong)
  {
    AppMethodBeat.i(4058);
    if ((AQj != null) && (AQj != null) && (paramLong > 0L) && (paramLong < 600000L))
      AQj.aG(11, 12, (int)paramLong);
    AppMethodBeat.o(4058);
  }

  public static void nN(long paramLong)
  {
    AppMethodBeat.i(4063);
    if ((AQj != null) && (AQj != null) && (paramLong > 0L) && (paramLong < 600000L))
      AQj.aG(22, 23, (int)paramLong);
    AppMethodBeat.o(4063);
  }

  public static void nO(long paramLong)
  {
    AppMethodBeat.i(4066);
    if ((AQj != null) && (AQj != null) && (paramLong > 0L) && (paramLong < 600000L))
      AQj.aG(27, 28, (int)paramLong);
    AppMethodBeat.o(4066);
  }

  public static void nP(long paramLong)
  {
    AppMethodBeat.i(4070);
    if ((AQj != null) && (AQj != null) && (paramLong > 0L) && (paramLong < 120000L))
      AQj.aG(16, 17, (int)paramLong);
    AppMethodBeat.o(4070);
  }

  public static void q(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(4044);
    nJ(paramLong);
    u localu;
    int i;
    int j;
    if ((AQj != null) && (paramLong > 0L) && (paramLong < 300000L))
    {
      AQj.aG(6, 7, (int)paramLong);
      localu = AQj;
      i = XWalkEnvironment.getAvailableVersion();
      j = avq(paramString);
      paramString = cvF;
      if (i.dTU() != null)
        break label96;
    }
    label96: for (int k = 100; ; k = i.dTU().ordinal())
    {
      localu.a(i, j, paramString, k, 1, 0, (int)paramLong, paramInt);
      AppMethodBeat.o(4044);
      return;
    }
  }

  public static void rB(boolean paramBoolean)
  {
    AppMethodBeat.i(4088);
    if (!"toolsmp".equals(AMN))
      AppMethodBeat.o(4088);
    while (true)
    {
      return;
      int i;
      if (paramBoolean)
      {
        i = 0;
        label30: if (WebView.getCurWebType() != WebView.d.ANb)
          break label68;
      }
      for (int j = 180; ; j = 190)
      {
        n(903L, i + j, 1L);
        AppMethodBeat.o(4088);
        break;
        i = 1;
        break label30;
        label68: if (WebView.getCurWebType() != WebView.d.ANc)
          break label84;
      }
      label84: AppMethodBeat.o(4088);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.util.f
 * JD-Core Version:    0.6.2
 */