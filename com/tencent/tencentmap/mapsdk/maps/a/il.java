package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.ds;
import com.tencent.tencentmap.mapsdk.a.dt;
import navsns.RttResponse;

public class il extends hf
{
  private static il a;

  public static il a()
  {
    try
    {
      AppMethodBeat.i(99849);
      if (a == null)
      {
        localil = new com/tencent/tencentmap/mapsdk/maps/a/il;
        localil.<init>();
        a = localil;
      }
      il localil = a;
      AppMethodBeat.o(99849);
      return localil;
    }
    finally
    {
    }
  }

  private RttResponse a(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(99851);
    int i = 0;
    while (true)
    {
      if (i < 3);
      try
      {
        dt localdt = ds.a().a(paramString, "sosomap navsns", paramArrayOfByte);
        if ((localdt == null) || (localdt.a == null))
        {
          label37: i++;
          continue;
        }
        Object localObject = new com/tencent/tencentmap/mapsdk/maps/a/e;
        ((e)localObject).<init>();
        ((e)localObject).a("UTF-8");
        ((e)localObject).a(localdt.a);
        localObject = (RttResponse)((e)localObject).b("res");
        AppMethodBeat.o(99851);
        paramString = (String)localObject;
        while (true)
        {
          return paramString;
          paramString = null;
          AppMethodBeat.o(99851);
        }
      }
      catch (Exception localException)
      {
        break label37;
      }
    }
  }

  private byte[] a(RttResponse paramRttResponse)
  {
    if (paramRttResponse == null);
    for (paramRttResponse = null; ; paramRttResponse = paramRttResponse.result)
      return paramRttResponse;
  }

  public byte[] a(byte[] paramArrayOfByte)
  {
    Object localObject = null;
    AppMethodBeat.i(99850);
    if (paramArrayOfByte != null);
    try
    {
      int i = paramArrayOfByte.length;
      if (i == 0)
      {
        AppMethodBeat.o(99850);
        paramArrayOfByte = localObject;
      }
      while (true)
      {
        return paramArrayOfByte;
        paramArrayOfByte = a(a(b(), paramArrayOfByte));
        AppMethodBeat.o(99850);
      }
    }
    catch (Throwable paramArrayOfByte)
    {
      while (true)
      {
        AppMethodBeat.o(99850);
        paramArrayOfByte = localObject;
      }
    }
  }

  public String b()
  {
    return "https://tafrtt.map.qq.com/rttserverex/";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.il
 * JD-Core Version:    0.6.2
 */