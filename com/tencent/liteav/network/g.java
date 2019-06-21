package com.tencent.liteav.network;

import android.content.Context;
import android.os.Handler;
import com.tencent.liteav.basic.f.b;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class g
{
  private String a;
  private String b;
  private int c;
  private String d;
  private Handler e;

  public g(Context paramContext)
  {
    AppMethodBeat.i(67535);
    this.a = "";
    this.b = "";
    this.c = 0;
    this.d = "";
    if (paramContext != null)
      this.e = new Handler(paramContext.getMainLooper());
    AppMethodBeat.o(67535);
  }

  private String a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(67540);
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0))
    {
      paramString1 = null;
      AppMethodBeat.o(67540);
    }
    while (true)
    {
      return paramString1;
      String str = paramString1.toLowerCase();
      paramString2 = paramString2.split("[?&]");
      int i = paramString2.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label130;
        paramString1 = paramString2[j];
        if (paramString1.indexOf("=") != -1)
        {
          paramString1 = paramString1.split("[=]");
          if (paramString1.length == 2)
          {
            Object localObject = paramString1[0];
            paramString1 = paramString1[1];
            if ((localObject != null) && (localObject.toLowerCase().equalsIgnoreCase(str)))
            {
              AppMethodBeat.o(67540);
              break;
            }
          }
        }
      }
      label130: paramString1 = "";
      AppMethodBeat.o(67540);
    }
  }

  private void a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, g.a parama)
  {
    AppMethodBeat.i(67539);
    new g.2(this, "getRTMPAccUrl", paramString2, paramString4, paramString3, paramString1, paramInt, parama).start();
    AppMethodBeat.o(67539);
  }

  private boolean a(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    boolean bool = true;
    AppMethodBeat.i(67537);
    if (paramBoolean)
      if ((paramString1 != null) && (!paramString1.isEmpty()) && (paramString2 != null) && (!paramString2.isEmpty()) && (paramString3 != null) && (!paramString3.isEmpty()))
      {
        AppMethodBeat.o(67537);
        paramBoolean = bool;
      }
    while (true)
    {
      return paramBoolean;
      AppMethodBeat.o(67537);
      paramBoolean = false;
      continue;
      if ((paramString1 != null) && (paramString2 != null) && (paramString3 != null))
      {
        AppMethodBeat.o(67537);
        paramBoolean = bool;
      }
      else
      {
        AppMethodBeat.o(67537);
        paramBoolean = false;
      }
    }
  }

  private long e()
  {
    AppMethodBeat.i(67538);
    long l = b.a().a("Network", "AccRetryCountWithoutSecret");
    AppMethodBeat.o(67538);
    return l;
  }

  public int a(String paramString, int paramInt, g.a parama)
  {
    int i = 0;
    AppMethodBeat.i(67536);
    this.a = "";
    this.b = "";
    this.c = 0;
    this.d = "";
    if ((paramString == null) || (paramString.isEmpty()))
    {
      paramInt = -1;
      AppMethodBeat.o(67536);
    }
    String str1;
    while (true)
    {
      return paramInt;
      str1 = TXCCommonUtil.getStreamIDByStreamUrl(paramString);
      if ((str1 != null) && (!str1.isEmpty()))
        break;
      paramInt = -2;
      AppMethodBeat.o(67536);
    }
    String str2 = a("bizid", paramString);
    String str3 = a("txSecret", paramString);
    paramString = a("txTime", paramString);
    if (e() <= 0L);
    for (boolean bool = true; ; bool = false)
    {
      if (!a(bool, str2, paramString, str3))
      {
        paramInt = -3;
        AppMethodBeat.o(67536);
        break;
      }
      a(str1, str2, str3, paramString, paramInt, new g.1(this, str1, str2, str3, paramString, parama));
      AppMethodBeat.o(67536);
      paramInt = i;
      break;
    }
  }

  public String a()
  {
    return this.a;
  }

  public String b()
  {
    return this.b;
  }

  public int c()
  {
    return this.c;
  }

  public String d()
  {
    return this.d;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.g
 * JD-Core Version:    0.6.2
 */