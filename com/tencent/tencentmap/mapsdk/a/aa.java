package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class aa
{
  private static volatile aa a;
  private SharedPreferences b;

  private aa(Context paramContext)
  {
    AppMethodBeat.i(101245);
    this.b = paramContext.getSharedPreferences("com.tencent.tencentmap.vector.dynamic", 0);
    AppMethodBeat.o(101245);
  }

  public static aa a(Context paramContext)
  {
    AppMethodBeat.i(101246);
    if (a == null);
    try
    {
      if (a == null)
      {
        aa localaa = new com/tencent/tencentmap/mapsdk/a/aa;
        localaa.<init>(paramContext);
        a = localaa;
      }
      paramContext = a;
      AppMethodBeat.o(101246);
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(101246);
    }
    throw paramContext;
  }

  public boolean a(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(101249);
    if (paramString == null)
      AppMethodBeat.o(101249);
    while (true)
    {
      return bool;
      if (this.b.getString("supportVectorOtaVersions", null) == null)
      {
        bool = this.b.edit().putString("supportVectorOtaVersions", paramString).commit();
        AppMethodBeat.o(101249);
      }
      else
      {
        Object localObject = a();
        if (localObject == null)
        {
          AppMethodBeat.o(101249);
        }
        else
        {
          localObject = new LinkedHashSet(Arrays.asList((Object[])localObject));
          ((Set)localObject).add(paramString);
          bool = a((String[])((Set)localObject).toArray(new String[((Set)localObject).size()]));
          AppMethodBeat.o(101249);
        }
      }
    }
  }

  public boolean a(String[] paramArrayOfString)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(101247);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      AppMethodBeat.o(101247);
    while (true)
    {
      return bool;
      StringBuffer localStringBuffer = new StringBuffer();
      while (i < paramArrayOfString.length - 1)
      {
        localStringBuffer.append(paramArrayOfString[i] + ";");
        i++;
      }
      localStringBuffer.append(paramArrayOfString[(paramArrayOfString.length - 1)]);
      bool = this.b.edit().putString("supportVectorOtaVersions", localStringBuffer.toString()).commit();
      AppMethodBeat.o(101247);
    }
  }

  public String[] a()
  {
    String[] arrayOfString = null;
    AppMethodBeat.i(101248);
    String str = this.b.getString("supportVectorOtaVersions", null);
    if (str == null)
      AppMethodBeat.o(101248);
    while (true)
    {
      return arrayOfString;
      arrayOfString = str.split(";");
      AppMethodBeat.o(101248);
    }
  }

  public String b()
  {
    AppMethodBeat.i(101251);
    String str = this.b.getString("vectorMapConfigMd5", null);
    AppMethodBeat.o(101251);
    return str;
  }

  public boolean b(String paramString)
  {
    AppMethodBeat.i(101250);
    boolean bool = this.b.edit().putString("vectorMapConfigMd5", paramString).commit();
    AppMethodBeat.o(101250);
    return bool;
  }

  public String c()
  {
    AppMethodBeat.i(101253);
    String str = this.b.getString("vectorMapPoiIconMd5", null);
    AppMethodBeat.o(101253);
    return str;
  }

  public boolean c(String paramString)
  {
    AppMethodBeat.i(101252);
    boolean bool = this.b.edit().putString("vectorMapPoiIconMd5", paramString).commit();
    AppMethodBeat.o(101252);
    return bool;
  }

  public String d()
  {
    AppMethodBeat.i(101254);
    String str = this.b.getString("dynamicMapSdkVectorVersion", "");
    AppMethodBeat.o(101254);
    return str;
  }

  public boolean d(String paramString)
  {
    AppMethodBeat.i(101255);
    boolean bool = this.b.edit().putString("dynamicMapSdkVectorVersion", paramString).commit();
    AppMethodBeat.o(101255);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.aa
 * JD-Core Version:    0.6.2
 */