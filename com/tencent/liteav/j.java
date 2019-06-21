package com.tencent.liteav;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class j
{
  private String a = "";
  private String b = "";
  private String c = "";
  private String d = "";
  private long e = 0L;
  private long f = 0L;
  private long g = 0L;

  public j(Context paramContext)
  {
  }

  private String a(String paramString)
  {
    AppMethodBeat.i(67093);
    if (paramString.contains("#EXT-TX-TS-START-TIME"))
    {
      int i = paramString.indexOf("#EXT-TX-TS-START-TIME:") + 22;
      if (i > 0)
      {
        paramString = paramString.substring(i);
        i = paramString.indexOf("#");
        if (i > 0)
        {
          paramString = paramString.substring(0, i).replaceAll("\r\n", "");
          AppMethodBeat.o(67093);
        }
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(67093);
    }
  }

  public int a(String paramString1, String paramString2, int paramInt, j.a parama)
  {
    AppMethodBeat.i(67092);
    if ((paramString1 == null) || (paramString1.isEmpty()))
    {
      paramInt = -1;
      AppMethodBeat.o(67092);
    }
    while (true)
    {
      return paramInt;
      this.d = TXCCommonUtil.getAppID();
      if (TextUtils.isEmpty(this.d))
      {
        paramInt = -2;
        AppMethodBeat.o(67092);
      }
      else
      {
        AsyncTask.execute(new j.1(this, paramInt, paramString2, paramString1, parama));
        paramInt = 0;
        AppMethodBeat.o(67092);
      }
    }
  }

  public long a()
  {
    AppMethodBeat.i(67090);
    this.g = (System.currentTimeMillis() - this.e);
    long l = this.g;
    AppMethodBeat.o(67090);
    return l;
  }

  public String a(long paramLong)
  {
    AppMethodBeat.i(67091);
    String str = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(this.e + 1000L * paramLong));
    str = String.format("http://%s/%s/%s/timeshift.m3u8?starttime=%s&appid=%s&txKbps=0", new Object[] { this.a, this.c, this.b, str, this.d });
    AppMethodBeat.o(67091);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.j
 * JD-Core Version:    0.6.2
 */