package com.tencent.mm.loader.j;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.sdk.platformtools.ah;

public class c
{
  public static c eSp = new c(null);
  protected final SharedPreferences ehZ;

  protected c(SharedPreferences paramSharedPreferences)
  {
    if (paramSharedPreferences == null);
    for (this.ehZ = ah.getContext().getSharedPreferences(ah.doA(), 0); ; this.ehZ = paramSharedPreferences)
      return;
  }

  public final String T(String paramString1, String paramString2)
  {
    return this.ehZ.getString(paramString1, paramString2);
  }

  public final SharedPreferences Un()
  {
    return this.ehZ;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.j.c
 * JD-Core Version:    0.6.2
 */