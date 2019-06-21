package com.tencent.mm.al;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

public final class c
{
  public static int fyW = 1;
  public static int fyX = 2;
  public static int fyY = 3;
  public static int fyZ = -1;
  public static int fza = 3;
  public static int fzb = 4;
  public static int fzc = 5;
  public static int fzd = 1;
  public static int fze = 2;
  public static int fzf = -10001;
  public static int fzg = -10002;
  public static int fzh = -10003;
  public static int fzi = -10004;

  public static String a(String paramString1, long paramLong, String paramString2, String paramString3)
  {
    Object localObject = null;
    AppMethodBeat.i(78061);
    ab.d("MicroMsg.CdnUtil", "cdntra genClientId prefix[%s] createtime:%d talker[%s] suffix:[%s] stack[%s]", new Object[] { paramString1, Long.valueOf(paramLong), paramString2, paramString3, bo.dpG() });
    if (bo.isNullOrNil(rP(paramString1)))
    {
      AppMethodBeat.o(78061);
      paramString1 = localObject;
    }
    while (true)
    {
      return paramString1;
      if (bo.isNullOrNil(paramString2))
      {
        AppMethodBeat.o(78061);
        paramString1 = localObject;
      }
      else if (paramLong <= 0L)
      {
        AppMethodBeat.o(78061);
        paramString1 = localObject;
      }
      else
      {
        paramString3 = bo.nullAsNil(rP(paramString3));
        paramString2 = g.x((r.Yz() + "-" + paramString2).getBytes());
        paramString2 = "a" + paramString1 + "_" + paramString2.substring(0, 16) + "_" + paramLong;
        paramString1 = paramString2;
        if (!bo.isNullOrNil(paramString3))
          paramString1 = paramString2 + "_" + paramString3;
        AppMethodBeat.o(78061);
      }
    }
  }

  public static int b(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(78064);
    try
    {
      paramHttpURLConnection = (List)paramHttpURLConnection.getHeaderFields().get("cache-control");
      if (paramHttpURLConnection != null)
      {
        i = paramHttpURLConnection.size();
        if (i != 0);
      }
      else
      {
        AppMethodBeat.o(78064);
        i = 0;
      }
      while (true)
      {
        return i;
        if (!bo.isNullOrNil(paramHttpURLConnection.toString()))
        {
          boolean bool = paramHttpURLConnection.toString().contains("no-cache");
          if (bool);
        }
        else
        {
          AppMethodBeat.o(78064);
          i = 0;
          continue;
        }
        i = -1;
        AppMethodBeat.o(78064);
      }
    }
    catch (Exception paramHttpURLConnection)
    {
      while (true)
      {
        ab.e("MicroMsg.CdnUtil", "exception:%s", new Object[] { bo.l(paramHttpURLConnection) });
        int i = -2;
        AppMethodBeat.o(78064);
      }
    }
  }

  public static int bV(Context paramContext)
  {
    AppMethodBeat.i(78062);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        i = fyW;
        AppMethodBeat.o(78062);
      }
      while (true)
      {
        return i;
        if (paramContext.getType() == 1)
        {
          i = fyY;
          AppMethodBeat.o(78062);
        }
        else if (paramContext.getSubtype() == 1)
        {
          i = fyW;
          AppMethodBeat.o(78062);
        }
        else if (paramContext.getSubtype() == 2)
        {
          i = fyW;
          AppMethodBeat.o(78062);
        }
        else if (paramContext.getSubtype() >= 3)
        {
          i = fyX;
          AppMethodBeat.o(78062);
        }
        else
        {
          i = fyW;
          AppMethodBeat.o(78062);
        }
      }
    }
    catch (NullPointerException paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.CdnUtil", "exception:%s", new Object[] { bo.l(paramContext) });
        int i = fyW;
        AppMethodBeat.o(78062);
      }
    }
  }

  public static int bW(Context paramContext)
  {
    AppMethodBeat.i(78063);
    int i = at.getNetType(paramContext);
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if (paramContext == null)
    {
      i = fyZ;
      AppMethodBeat.o(78063);
    }
    while (true)
    {
      return i;
      if (paramContext.getType() == 1)
      {
        i = fzd;
        AppMethodBeat.o(78063);
      }
      else if ((paramContext.getSubtype() == 1) || (paramContext.getSubtype() == 2))
      {
        i = fza;
        AppMethodBeat.o(78063);
      }
      else if (paramContext.getSubtype() >= 13)
      {
        i = fzc;
        AppMethodBeat.o(78063);
      }
      else if (paramContext.getSubtype() >= 3)
      {
        i = fzb;
        AppMethodBeat.o(78063);
      }
      else if (at.isWap(i))
      {
        i = fze;
        AppMethodBeat.o(78063);
      }
      else
      {
        i = fza;
        AppMethodBeat.o(78063);
      }
    }
  }

  public static void outputJniLog(byte[] paramArrayOfByte, String paramString, int paramInt)
  {
    AppMethodBeat.i(78059);
    byte[] arrayOfByte = paramArrayOfByte;
    if (bo.cb(paramArrayOfByte))
      arrayOfByte = new byte[0];
    paramArrayOfByte = new String(arrayOfByte);
    if (paramInt == 4)
    {
      ab.e(paramString, paramArrayOfByte);
      AppMethodBeat.o(78059);
    }
    while (true)
    {
      return;
      if (paramInt == 3)
      {
        ab.w(paramString, paramArrayOfByte);
        AppMethodBeat.o(78059);
      }
      else if (paramInt == 2)
      {
        ab.i(paramString, paramArrayOfByte);
        AppMethodBeat.o(78059);
      }
      else if (paramInt == 1)
      {
        ab.d(paramString, paramArrayOfByte);
        AppMethodBeat.o(78059);
      }
      else
      {
        if (paramInt == 0)
          ab.v(paramString, paramArrayOfByte);
        AppMethodBeat.o(78059);
      }
    }
  }

  private static String rP(String paramString)
  {
    AppMethodBeat.i(78060);
    int i;
    if (!bo.isNullOrNil(paramString))
    {
      i = 0;
      if (i < paramString.length())
      {
        char c = paramString.charAt(i);
        if ((!bo.z(c)) && (!bo.A(c)))
        {
          paramString = null;
          AppMethodBeat.o(78060);
        }
      }
    }
    while (true)
    {
      return paramString;
      i++;
      break;
      AppMethodBeat.o(78060);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.c
 * JD-Core Version:    0.6.2
 */