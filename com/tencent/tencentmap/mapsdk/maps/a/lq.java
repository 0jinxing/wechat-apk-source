package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.w;
import org.json.JSONArray;

public class lq
{
  private static int a = lr.a;
  private static int b = 1000;
  private static int c = lr.b;
  private static int d = 0;
  private static volatile boolean e = false;
  private static int f = 0;
  private static String g = null;
  private static String h = null;
  private static int[] i = new int[0];
  private static byte[] j = new byte[0];

  public static int a()
  {
    synchronized (j)
    {
      int k = b;
      return k;
    }
  }

  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, int[] paramArrayOfInt, String paramString2)
  {
    synchronized (j)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
      d = paramInt4;
      g = paramString1;
      i = paramArrayOfInt;
      h = paramString2;
      return;
    }
  }

  public static void a(Context arg0)
  {
    int k = 0;
    AppMethodBeat.i(100467);
    if (??? == null)
    {
      AppMethodBeat.o(100467);
      return;
    }
    w localw = w.a(???);
    int m = localw.b("worldMapFrontierVersion");
    int n = localw.b("worldMapStyle");
    int i1 = localw.b("worldMapScene");
    int i2 = localw.b("worldMapVersion");
    int i3 = localw.b("worldMapProtocolVersion");
    boolean bool = localw.c("worldMapEnabled");
    String str = localw.a("worldMapTileUrlRegex");
    Object localObject1 = new int[0];
    ??? = (Context)localObject1;
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      ??? = (Context)localObject1;
      localJSONArray.<init>(localw.a("worldMapTileUrlRangeJson"));
      ??? = (Context)localObject1;
      localObject3 = new int[localJSONArray.length()];
      while (true)
      {
        ??? = (Context)localObject3;
        localObject1 = localObject3;
        if (k >= localObject3.length)
          break;
        ??? = (Context)localObject3;
        localObject3[k] = localJSONArray.getInt(k);
        k++;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Context localContext = ???;
        Object localObject3 = localw.a("worldMapLogoChangeRuleJson");
        synchronized (j)
        {
          b = n;
          a = i1;
          c = i2;
          d = i3;
          e = bool;
          g = str;
          i = localContext;
          h = (String)localObject3;
          f = m;
          AppMethodBeat.o(100467);
        }
      }
    }
  }

  public static void a(boolean paramBoolean)
  {
    synchronized (j)
    {
      e = paramBoolean;
      return;
    }
  }

  public static int b()
  {
    synchronized (j)
    {
      int k = a;
      return k;
    }
  }

  public static int c()
  {
    synchronized (j)
    {
      int k = c;
      return k;
    }
  }

  public static boolean d()
  {
    synchronized (j)
    {
      boolean bool = e;
      return bool;
    }
  }

  public static String e()
  {
    synchronized (j)
    {
      String str = g;
      return str;
    }
  }

  public static int f()
  {
    synchronized (j)
    {
      int k = d;
      return k;
    }
  }

  public static String g()
  {
    synchronized (j)
    {
      String str = h;
      return str;
    }
  }

  public static int[] h()
  {
    synchronized (j)
    {
      int[] arrayOfInt = i;
      return arrayOfInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lq
 * JD-Core Version:    0.6.2
 */