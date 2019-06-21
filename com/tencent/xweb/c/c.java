package com.tencent.xweb.c;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.m;
import java.util.Date;
import java.util.HashMap;
import org.xwalk.core.XWalkEnvironment;

public final class c
{
  public static HashMap<String, c> APq;
  static String APr;
  SharedPreferences APh;
  private String APi;
  private String APj;
  private String APk;
  private long APl;
  private long APm;
  public long APn;
  private String APo;
  boolean APp;

  static
  {
    AppMethodBeat.i(3980);
    APq = new HashMap();
    APr = "";
    AppMethodBeat.o(3980);
  }

  private c(String paramString, WebView.d paramd)
  {
    AppMethodBeat.i(3971);
    this.APp = false;
    this.APh = d(paramString, paramd);
    this.APi = "INIT_START_TIME".concat(String.valueOf(paramString));
    this.APj = "INIT_END_TIME".concat(String.valueOf(paramString));
    this.APk = "INIT_TRY_COUNT".concat(String.valueOf(paramString));
    this.APo = paramString;
    if (this.APh == null)
      AppMethodBeat.o(3971);
    while (true)
    {
      return;
      this.APl = this.APh.getLong(this.APi, 0L);
      this.APm = this.APh.getLong(this.APj, 0L);
      this.APn = this.APh.getLong(this.APk, 0L);
      AppMethodBeat.o(3971);
    }
  }

  public static c b(String paramString, WebView.d paramd)
  {
    try
    {
      AppMethodBeat.i(3972);
      String str = c(paramString, paramd);
      c localc1 = (c)APq.get(str);
      c localc2 = localc1;
      if (localc1 == null)
      {
        localc2 = new com/tencent/xweb/c/c;
        localc2.<init>(paramString, paramd);
        APq.put(str, localc2);
      }
      AppMethodBeat.o(3972);
      return localc2;
    }
    finally
    {
    }
    throw paramString;
  }

  private static String c(String paramString, WebView.d paramd)
  {
    AppMethodBeat.i(3978);
    paramString = "INIT_SP_TAG_" + paramd.toString() + paramString;
    AppMethodBeat.o(3978);
    return paramString;
  }

  public static boolean c(WebView.d paramd)
  {
    boolean bool = false;
    try
    {
      AppMethodBeat.i(3975);
      if (m.dTZ().AMz)
        AppMethodBeat.o(3975);
      while (true)
      {
        return bool;
        if (b("LOAD_CORE", paramd).dUz())
        {
          AppMethodBeat.o(3975);
          bool = true;
        }
        else
        {
          c localc = new com/tencent/xweb/c/c;
          localc.<init>("CREATE_WEBVIEW", paramd);
          if (localc.dUz())
          {
            AppMethodBeat.o(3975);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(3975);
          }
        }
      }
    }
    finally
    {
    }
    throw paramd;
  }

  private static SharedPreferences d(String paramString, WebView.d paramd)
  {
    try
    {
      AppMethodBeat.i(3979);
      if ((paramd != WebView.d.ANb) && (paramd != WebView.d.ANd))
      {
        paramString = null;
        AppMethodBeat.o(3979);
      }
      while (true)
      {
        return paramString;
        paramString = c(paramString, paramd);
        APr = paramString;
        paramString = XWalkEnvironment.getMMKVSharedTransportOld(paramString);
        AppMethodBeat.o(3979);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  private boolean dUz()
  {
    boolean bool = false;
    while (true)
    {
      long l;
      try
      {
        AppMethodBeat.i(3977);
        if (this.APh == null)
        {
          AppMethodBeat.o(3977);
          return bool;
        }
        Date localDate = new java/util/Date;
        localDate.<init>();
        l = localDate.getTime();
        if (!nH(l))
        {
          AppMethodBeat.o(3977);
          continue;
        }
      }
      finally
      {
      }
      if (this.APn > 4L)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Scene ");
        XWalkEnvironment.addXWalkInitializeLog(this.APo + " crashed " + (l - this.APl) / 60000L + " minutes ago, try count = " + this.APn);
        bool = true;
        AppMethodBeat.o(3977);
      }
      else
      {
        AppMethodBeat.o(3977);
      }
    }
  }

  private boolean nH(long paramLong)
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(3976);
        if (0L == this.APl)
        {
          AppMethodBeat.o(3976);
          return bool;
        }
        if ((this.APm - this.APl >= 0L) || (Math.abs(paramLong - this.APl) > 10800000L))
        {
          AppMethodBeat.o(3976);
          continue;
        }
      }
      finally
      {
      }
      if (this.APm < this.APl)
      {
        bool = true;
        AppMethodBeat.o(3976);
      }
      else
      {
        AppMethodBeat.o(3976);
      }
    }
  }

  public final void dUx()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(3973);
        if (this.APp)
        {
          AppMethodBeat.o(3973);
          return;
        }
        this.APp = true;
        if (this.APh == null)
        {
          AppMethodBeat.o(3973);
          continue;
        }
      }
      finally
      {
      }
      SharedPreferences.Editor localEditor = this.APh.edit();
      localEditor.putLong(this.APk, this.APn + 1L);
      Date localDate = new java/util/Date;
      localDate.<init>();
      long l = localDate.getTime();
      if (nH(l))
      {
        localEditor.commit();
        AppMethodBeat.o(3973);
      }
      else
      {
        localEditor.putLong(this.APi, l);
        localEditor.commit();
        AppMethodBeat.o(3973);
      }
    }
  }

  public final void dUy()
  {
    try
    {
      AppMethodBeat.i(3974);
      if (this.APh == null)
        AppMethodBeat.o(3974);
      while (true)
      {
        return;
        SharedPreferences.Editor localEditor = this.APh.edit();
        String str = this.APj;
        Date localDate = new java/util/Date;
        localDate.<init>();
        localEditor.putLong(str, localDate.getTime());
        localEditor.putLong(this.APk, 0L);
        localEditor.commit();
        this.APh = null;
        AppMethodBeat.o(3974);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.c.c
 * JD-Core Version:    0.6.2
 */