package com.tencent.liteav.network;

import android.content.Context;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRExtInfo;
import com.tencent.liteav.basic.datareport.a;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class j
{
  private Context a;
  private String b;
  private String c;
  private String d;
  private String e;
  private long f;
  private long g;
  private String h;
  private long i;
  private long j;
  private long k;
  private long l;
  private long m;
  private long n;
  private long o;
  private long p;
  private long q;
  private long r;
  private long s;
  private long t;
  private long u;
  private long v;
  private boolean w;

  public j(Context paramContext)
  {
    AppMethodBeat.i(67573);
    this.w = true;
    this.a = paramContext.getApplicationContext();
    this.b = b.a(this.a);
    this.d = "Android";
    i.a().a(this.a);
    a();
    AppMethodBeat.o(67573);
  }

  private boolean b(String paramString)
  {
    AppMethodBeat.i(67579);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      bool = true;
      AppMethodBeat.o(67579);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(67579);
    }
  }

  private boolean c(String paramString)
  {
    AppMethodBeat.i(67580);
    boolean bool = Pattern.compile("[0-9]*").matcher(paramString).matches();
    AppMethodBeat.o(67580);
    return bool;
  }

  private void e()
  {
    AppMethodBeat.i(67574);
    long l1 = this.p;
    long l2 = this.q;
    a();
    this.n = l1;
    this.o = l2;
    AppMethodBeat.o(67574);
  }

  private void f()
  {
    AppMethodBeat.i(67578);
    if ((this.f == 0L) || (b(this.b)) || (b(this.e)))
    {
      AppMethodBeat.o(67578);
      return;
    }
    String str1 = TXCCommonUtil.getStreamIDByStreamUrl(this.e);
    long l1 = System.currentTimeMillis() - this.f;
    long l2 = 0L;
    long l3 = 0L;
    if (this.p > this.n)
      l2 = this.p - this.n;
    if (this.q > this.o)
      l3 = this.q - this.o;
    long l4 = 0L;
    long l5 = 0L;
    if (this.v > 0L)
    {
      l4 = this.r / this.v;
      l5 = this.s / this.v;
    }
    String str2 = TXCDRApi.txCreateToken();
    TXCDRExtInfo localTXCDRExtInfo = new TXCDRExtInfo();
    localTXCDRExtInfo.report_common = false;
    localTXCDRExtInfo.report_status = false;
    localTXCDRExtInfo.url = this.e;
    TXCDRApi.InitEvent(this.a, str2, a.Y, a.aq, localTXCDRExtInfo);
    TXCDRApi.txSetEventValue(str2, a.Y, "str_user_id", this.b);
    TXCDRApi.txSetEventValue(str2, a.Y, "str_stream_id", str1);
    TXCDRApi.txSetEventValue(str2, a.Y, "str_access_id", this.c);
    TXCDRApi.txSetEventValue(str2, a.Y, "str_platform", this.d);
    TXCDRApi.txSetEventIntValue(str2, a.Y, "u32_server_type", this.g);
    TXCDRApi.txSetEventValue(str2, a.Y, "str_server_addr", this.h);
    TXCDRApi.txSetEventIntValue(str2, a.Y, "u32_dns_timecost", this.i);
    TXCDRApi.txSetEventIntValue(str2, a.Y, "u32_connect_timecost", this.j);
    TXCDRApi.txSetEventIntValue(str2, a.Y, "u32_handshake_timecost", this.k);
    TXCDRApi.txSetEventIntValue(str2, a.Y, "u32_push_type", this.l);
    TXCDRApi.txSetEventIntValue(str2, a.Y, "u32_totaltime", l1);
    TXCDRApi.txSetEventIntValue(str2, a.Y, "u32_block_count", this.m);
    TXCDRApi.txSetEventIntValue(str2, a.Y, "u32_video_drop", l2);
    TXCDRApi.txSetEventIntValue(str2, a.Y, "u32_audio_drop", l3);
    TXCDRApi.txSetEventIntValue(str2, a.Y, "u32_video_que_avg", l4);
    TXCDRApi.txSetEventIntValue(str2, a.Y, "u32_audio_que_avg", l5);
    TXCDRApi.txSetEventIntValue(str2, a.Y, "u32_video_que_max", this.t);
    TXCDRApi.txSetEventIntValue(str2, a.Y, "u32_audio_que_max", this.u);
    TXCDRApi.nativeReportEvent(str2, a.Y);
    float f1 = 0.0F;
    float f2 = 0.0F;
    label470: float f3;
    if (l1 > 0L)
    {
      if (this.m == 0L)
        f1 = 0.0F;
    }
    else
    {
      if (this.v <= 0L)
        break label613;
      if (this.r != 0L)
        break label581;
      f3 = 0.0F;
      label491: if (this.s != 0L)
        break label597;
      f2 = 0.0F;
    }
    while (true)
    {
      if ((this.w) && (!b(this.c)) && (this.k != -1L))
        i.a().a(this.c, this.g, l1, this.k, f1, f3, f2);
      AppMethodBeat.o(67578);
      break;
      f1 = (float)this.m * 60000.0F / (float)l1;
      break label470;
      label581: f3 = (float)this.r / (float)this.v;
      break label491;
      label597: f2 = (float)this.s / (float)this.v;
      continue;
      label613: f3 = 0.0F;
    }
  }

  public void a()
  {
    this.c = "";
    this.f = 0L;
    this.g = -1L;
    this.h = "";
    this.i = -1L;
    this.j = -1L;
    this.k = -1L;
    this.l = -1L;
    this.e = "";
    this.m = 0L;
    this.n = 0L;
    this.o = 0L;
    this.p = 0L;
    this.q = 0L;
    this.r = 0L;
    this.s = 0L;
    this.t = 0L;
    this.u = 0L;
    this.v = 0L;
    this.w = true;
  }

  public void a(long paramLong1, long paramLong2)
  {
    this.p = paramLong1;
    this.q = paramLong2;
  }

  public void a(long paramLong1, long paramLong2, long paramLong3)
  {
    this.i = paramLong1;
    this.j = paramLong2;
    this.k = paramLong3;
  }

  public void a(String paramString)
  {
    this.e = paramString;
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean);
    for (long l1 = 2L; ; l1 = 1L)
    {
      this.l = l1;
      if (paramBoolean)
        this.w = false;
      return;
    }
  }

  public void a(boolean paramBoolean, String paramString)
  {
    int i1 = 0;
    AppMethodBeat.i(67577);
    this.h = paramString;
    if (paramBoolean)
    {
      this.g = 1L;
      AppMethodBeat.o(67577);
    }
    while (true)
    {
      return;
      if (paramString != null)
      {
        int i2 = paramString.indexOf(":");
        String str = paramString;
        if (i2 != -1)
          str = paramString.substring(0, i2);
        if (str != null)
        {
          paramString = str.split("[.]");
          i2 = paramString.length;
          while (true)
          {
            if (i1 >= i2)
              break label112;
            if (!c(paramString[i1]))
            {
              this.g = 3L;
              AppMethodBeat.o(67577);
              break;
            }
            i1++;
          }
          label112: this.g = 2L;
        }
      }
      AppMethodBeat.o(67577);
    }
  }

  public void b()
  {
    AppMethodBeat.i(67575);
    this.f = System.currentTimeMillis();
    this.c = i.a().b();
    AppMethodBeat.o(67575);
  }

  public void b(long paramLong1, long paramLong2)
  {
    this.v += 1L;
    this.r += paramLong1;
    this.s += paramLong2;
    if (paramLong1 > this.t)
      this.t = paramLong1;
    if (paramLong2 > this.u)
      this.u = paramLong2;
  }

  public void c()
  {
    AppMethodBeat.i(67576);
    f();
    e();
    AppMethodBeat.o(67576);
  }

  public void d()
  {
    this.m += 1L;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.j
 * JD-Core Version:    0.6.2
 */