package com.tencent.tencentmap.mapsdk.maps.a;

import java.util.Map;
import java.util.Set;

public final class v$a
{
  private final int a;
  private boolean b = false;
  private String c = "http://oth.eve.mdt.qq.com:8080/analytics/upload";
  private String d = "http://jrlt.beacon.qq.com/analytics/upload";
  private Map<String, String> e = null;
  private Set<String> f = null;
  private Set<String> g = null;

  public v$a(int paramInt)
  {
    this.a = paramInt;
  }

  public final void a(String paramString)
  {
    this.c = paramString;
  }

  public final void a(Map<String, String> paramMap)
  {
    this.e = paramMap;
  }

  public final void a(Set<String> paramSet)
  {
    this.f = paramSet;
  }

  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public final boolean a()
  {
    return this.b;
  }

  public final String b()
  {
    if (ag.b);
    for (String str = this.d; ; str = this.c)
      return str;
  }

  public final void b(Set<String> paramSet)
  {
    this.g = paramSet;
  }

  public final Map<String, String> c()
  {
    return this.e;
  }

  public final Set<String> d()
  {
    return this.f;
  }

  public final int e()
  {
    return this.a;
  }

  public final Set<String> f()
  {
    return this.g;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.v.a
 * JD-Core Version:    0.6.2
 */