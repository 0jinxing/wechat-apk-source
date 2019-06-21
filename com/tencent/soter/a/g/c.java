package com.tencent.soter.a.g;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.soter.a.c.a;

abstract class c extends d
{
  protected static void eQ(String paramString, int paramInt)
  {
    com.tencent.soter.core.c.d.d("Soter.BaseSoterPrepareKeyTask", "soter: marking preference. key: %s, status: %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    try
    {
      if (a.dRe().dRh() != null)
        a.dRe().dRh().edit().putInt(paramString, paramInt).apply();
      return;
    }
    finally
    {
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.c
 * JD-Core Version:    0.6.2
 */