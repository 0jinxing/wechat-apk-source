package com.tencent.mm.plugin.sns.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class v
{
  public static boolean WT(String paramString)
  {
    AppMethodBeat.i(38020);
    boolean bool;
    if ((paramString != null) && (paramString.startsWith("sns_table_")))
    {
      bool = true;
      AppMethodBeat.o(38020);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(38020);
    }
  }

  public static boolean Zl(String paramString)
  {
    AppMethodBeat.i(38019);
    boolean bool;
    if ((paramString != null) && (paramString.startsWith("ad_table_")))
    {
      bool = true;
      AppMethodBeat.o(38019);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(38019);
    }
  }

  public static long Zm(String paramString)
  {
    AppMethodBeat.i(38021);
    long l;
    if (bo.isNullOrNil(paramString))
    {
      l = 0L;
      AppMethodBeat.o(38021);
    }
    while (true)
    {
      return l;
      if (paramString.startsWith("ad_table_"))
      {
        l = bo.anl(paramString.substring(9));
        AppMethodBeat.o(38021);
      }
      else if (paramString.startsWith("sns_table_"))
      {
        l = bo.anl(paramString.substring(10));
        AppMethodBeat.o(38021);
      }
      else
      {
        l = bo.anl(paramString);
        AppMethodBeat.o(38021);
      }
    }
  }

  public static int Zn(String paramString)
  {
    AppMethodBeat.i(38022);
    int i;
    if (bo.isNullOrNil(paramString))
    {
      i = 0;
      AppMethodBeat.o(38022);
    }
    while (true)
    {
      return i;
      if (paramString.startsWith("ad_table_"))
      {
        i = bo.ank(paramString.substring(9));
        AppMethodBeat.o(38022);
      }
      else
      {
        i = bo.ank(paramString.substring(10));
        AppMethodBeat.o(38022);
      }
    }
  }

  public static boolean Zo(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(38023);
    if (paramString.startsWith("ad_table_"))
      if (bo.anl(paramString.substring(9)) != 0L)
        AppMethodBeat.o(38023);
    while (true)
    {
      return bool;
      AppMethodBeat.o(38023);
      bool = false;
      continue;
      if (bo.anl(paramString.substring(10)) != 0L)
      {
        AppMethodBeat.o(38023);
      }
      else
      {
        AppMethodBeat.o(38023);
        bool = false;
      }
    }
  }

  public static boolean Zp(String paramString)
  {
    AppMethodBeat.i(38024);
    boolean bool;
    if (!Zo(paramString))
    {
      bool = true;
      AppMethodBeat.o(38024);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(38024);
    }
  }

  public static int ak(String paramString1, String paramString2, String paramString3)
  {
    int i = 0;
    AppMethodBeat.i(38026);
    paramString1 = al(paramString1, paramString2, paramString3);
    int j = i;
    if (!bo.isNullOrNil(paramString1))
      paramString1 = paramString1.split("&");
    for (int k = 0; ; k++)
    {
      j = i;
      if (k < paramString1.length)
      {
        if ((paramString1[k] != null) && (paramString1[k].contains("voteResultIndex=")))
          j = Integer.valueOf(paramString1[k].substring(16)).intValue();
      }
      else
      {
        AppMethodBeat.o(38026);
        return j;
      }
    }
  }

  public static String al(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(38027);
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramString1 != null)
    {
      localStringBuilder.append(paramString1);
      if (paramString2 == null)
        break label84;
      label27: localStringBuilder.append(paramString2);
      if (paramString3 == null)
        break label90;
      label37: localStringBuilder.append(paramString3);
      if (localStringBuilder.length() <= 0)
        break label96;
      paramString1 = ah.getContext().getSharedPreferences("SnsAdVote", 0).getString(localStringBuilder.toString(), "");
      AppMethodBeat.o(38027);
    }
    while (true)
    {
      return paramString1;
      paramString1 = "";
      break;
      label84: paramString2 = "";
      break label27;
      label90: paramString3 = "";
      break label37;
      label96: paramString1 = "";
      AppMethodBeat.o(38027);
    }
  }

  public static String ao(String paramString, long paramLong)
  {
    AppMethodBeat.i(38017);
    paramString = paramString + paramLong;
    AppMethodBeat.o(38017);
    return paramString;
  }

  public static String ap(String paramString, long paramLong)
  {
    AppMethodBeat.i(38018);
    paramString = paramString + paramLong;
    AppMethodBeat.o(38018);
    return paramString;
  }

  public static int gr(String paramString1, String paramString2)
  {
    AppMethodBeat.i(38025);
    g.RN();
    int i = ak(paramString1, paramString2, a.QG());
    AppMethodBeat.o(38025);
    return i;
  }

  public static void h(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38028);
    if (TextUtils.isEmpty(paramString1))
      AppMethodBeat.o(38028);
    while (true)
    {
      return;
      StringBuilder localStringBuilder = new StringBuilder();
      if (paramString1 != null)
      {
        label31: localStringBuilder.append(paramString1);
        if (paramString2 == null)
          break label82;
        label42: localStringBuilder.append(paramString2);
        if (paramString3 == null)
          break label88;
      }
      while (true)
      {
        localStringBuilder.append(paramString3);
        if (localStringBuilder.length() > 0)
          break label94;
        AppMethodBeat.o(38028);
        break;
        paramString1 = "";
        break label31;
        label82: paramString2 = "";
        break label42;
        label88: paramString3 = "";
      }
      label94: paramString1 = ah.getContext().getSharedPreferences("SnsAdVote", 0).edit();
      paramString1.putString(localStringBuilder.toString(), "voteResultIndex=" + paramInt1 + "&isUpdate=" + paramInt2);
      paramString1.commit();
      AppMethodBeat.o(38028);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.v
 * JD-Core Version:    0.6.2
 */