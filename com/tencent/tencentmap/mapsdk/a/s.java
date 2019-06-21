package com.tencent.tencentmap.mapsdk.a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.map.lib.util.StringUtil;

public abstract class s
{
  protected SharedPreferences a = null;

  public String a(String paramString)
  {
    Object localObject = null;
    if (this.a == null);
    for (paramString = localObject; ; paramString = this.a.getString(paramString, null))
      return paramString;
  }

  public boolean a()
  {
    return a(new String[] { "mapConfigVersion", "poiIconVersion", "mapIconVersion", "rttConfigVersion", "mapConfigIndoorVersion", "mapPoiIconIndoorVersion", "closeRoadSytleNomalModeVersion", "closeRoadStyleTrafficModeVersion", "offlineCityListVersion", "mapConfigZipMd5", "mapPoiIconZipMd5", "mapIconZipMd5", "rttConfigMd5", "mapConfigIndoorMd5", "poiIconIndoorMd5", "closeRoadSytleNomalModeMd5", "closeRoadStyleTrafficModeMd5", "offlineCityListMd5" });
  }

  public boolean a(String paramString, int paramInt)
  {
    if (this.a == null);
    for (boolean bool = false; ; bool = this.a.edit().putInt(paramString, paramInt).commit())
      return bool;
  }

  public boolean a(String paramString, long paramLong)
  {
    if (this.a == null);
    for (boolean bool = false; ; bool = this.a.edit().putLong(paramString, paramLong).commit())
      return bool;
  }

  public boolean a(String paramString1, String paramString2)
  {
    if (this.a == null);
    for (boolean bool = false; ; bool = this.a.edit().putString(paramString1, paramString2).commit())
      return bool;
  }

  public boolean a(String paramString, boolean paramBoolean)
  {
    if (this.a == null);
    for (paramBoolean = false; ; paramBoolean = this.a.edit().putBoolean(paramString, paramBoolean).commit())
      return paramBoolean;
  }

  public boolean a(String[] paramArrayOfString)
  {
    int i = 0;
    boolean bool = false;
    if (this.a == null);
    while (true)
    {
      return bool;
      SharedPreferences.Editor localEditor = this.a.edit();
      int j = paramArrayOfString.length;
      while (i < j)
      {
        localEditor.remove(paramArrayOfString[i]);
        i++;
      }
      bool = localEditor.commit();
    }
  }

  public int b(String paramString)
  {
    int i = -1;
    if (this.a == null);
    while (true)
    {
      return i;
      i = this.a.getInt(paramString, -1);
    }
  }

  public String b()
  {
    int i = b("mapConfigVersion");
    String str1 = a("mapConfigZipMd5");
    String str2 = String.valueOf(b("mapConfigIndoorPremiumVersion"));
    Object localObject = a("mapConfigIndoorPremiumMd5");
    int j = b("mapConfigIndoorVersion");
    String str3 = a("mapConfigIndoorMd5");
    String str4;
    if (!StringUtil.isEmpty((String)localObject))
      str4 = "indoormap_config_premium";
    for (str3 = str2; ; str3 = String.valueOf(j))
    {
      return String.format("mapconfig-%s-%s,%s-%s-%s", new Object[] { String.valueOf(i), str1, str4, str3, localObject });
      str4 = "indoormap_config";
      localObject = str3;
    }
  }

  public boolean c(String paramString)
  {
    boolean bool = false;
    if (this.a == null);
    while (true)
    {
      return bool;
      bool = this.a.getBoolean(paramString, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.s
 * JD-Core Version:    0.6.2
 */