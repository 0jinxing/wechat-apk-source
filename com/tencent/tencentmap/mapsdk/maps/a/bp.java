package com.tencent.tencentmap.mapsdk.maps.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class bp
  implements bl
{
  public String a;
  public byte[] b;
  public Map<String, String> c;
  public boolean d;
  public boolean e;
  public int f;
  public String g;
  public bj h;
  public ci i;
  public volatile boolean j;
  public int k;
  public boolean l;
  public volatile boolean m;
  public long n;
  public String o;
  private Object p;
  private int q;
  private cv r;
  private CountDownLatch s;

  public bp(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98572);
    this.d = false;
    this.e = true;
    this.f = -1;
    this.g = "";
    this.j = false;
    this.q = 0;
    this.k = 0;
    this.l = true;
    this.s = new CountDownLatch(1);
    this.m = false;
    this.a = paramString;
    this.b = paramArrayOfByte;
    this.g = eu.d();
    AppMethodBeat.o(98572);
  }

  public final void a(int paramInt)
  {
    this.f = paramInt;
  }

  public final void a(cv paramcv)
  {
    try
    {
      this.r = paramcv;
      return;
    }
    finally
    {
      paramcv = finally;
    }
    throw paramcv;
  }

  public final void a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(98573);
    if (this.c == null)
      this.c = new HashMap();
    if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2)))
      this.c.put(paramString1, paramString2);
    AppMethodBeat.o(98573);
  }

  public final void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public final boolean a()
  {
    AppMethodBeat.i(98570);
    try
    {
      bool = this.s.await(this.k, TimeUnit.MILLISECONDS);
      AppMethodBeat.o(98570);
      return bool;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        boolean bool = true;
        AppMethodBeat.o(98570);
      }
    }
  }

  public final void b()
  {
    AppMethodBeat.i(98571);
    this.s.countDown();
    AppMethodBeat.o(98571);
  }

  public final void b(int paramInt)
  {
    if (paramInt < 0);
    while (true)
    {
      return;
      this.k = paramInt;
    }
  }

  public final void b(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }

  public final cv c()
  {
    try
    {
      cv localcv = this.r;
      return localcv;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(98574);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("url:" + this.a);
    ((StringBuilder)localObject).append(",body:" + eu.b(this.b));
    ((StringBuilder)localObject).append(",isGet:" + this.d);
    ((StringBuilder)localObject).append(",timeout:" + this.f);
    ((StringBuilder)localObject).append(",tag:" + this.p);
    ((StringBuilder)localObject).append(",httpCallback:" + this.h);
    ((StringBuilder)localObject).append(",testMode:" + this.q);
    ((StringBuilder)localObject).append(",httpCallback:" + this.h);
    ((StringBuilder)localObject).append(",testMode:" + this.q);
    ((StringBuilder)localObject).append(",followRedirects:" + this.e);
    ((StringBuilder)localObject).append(",isAbort:" + this.j);
    ((StringBuilder)localObject).append(",headers:" + this.c);
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(98574);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.bp
 * JD-Core Version:    0.6.2
 */