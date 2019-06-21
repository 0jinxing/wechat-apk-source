package com.tencent.mm.model.b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;

public abstract class a
  implements e
{
  protected e.a fod;
  protected String foe = aaM();
  protected String[] fof = aaL();

  public final void a(e.a parama)
  {
    this.fod = parama;
  }

  public final void a(String paramString, boolean paramBoolean, String[] paramArrayOfString)
  {
    aw.ZK();
    SharedPreferences localSharedPreferences = c.lK("banner");
    if (localSharedPreferences == null);
    while (true)
    {
      return;
      localSharedPreferences.edit().putBoolean(this.foe + paramString, paramBoolean).commit();
      if ((this.fof != null) && (paramArrayOfString != null) && (this.fof.length == paramArrayOfString.length))
      {
        String[] arrayOfString = this.fof;
        int i = arrayOfString.length;
        int j = 0;
        int k = 0;
        if (j < i)
        {
          String str1 = arrayOfString[j];
          if (str1 != null)
            if (paramArrayOfString[k] == null)
              break label182;
          label182: for (String str2 = paramArrayOfString[k]; ; str2 = "")
          {
            localSharedPreferences.edit().putString(this.foe + str1 + paramString, str2).commit();
            k++;
            j++;
            break;
          }
        }
      }
      if (this.fod != null)
        this.fod.aaX();
    }
  }

  protected String[] aaL()
  {
    return null;
  }

  public abstract String aaM();

  public final String ao(String paramString1, String paramString2)
  {
    Object localObject = null;
    aw.ZK();
    SharedPreferences localSharedPreferences = c.lK("banner");
    if (localSharedPreferences == null);
    for (paramString1 = localObject; ; paramString1 = localSharedPreferences.getString(this.foe + paramString2 + paramString1, null))
      return paramString1;
  }

  public final boolean oV(String paramString)
  {
    boolean bool1 = false;
    aw.ZK();
    SharedPreferences localSharedPreferences = c.lK("banner");
    boolean bool2 = bool1;
    if (localSharedPreferences != null)
    {
      bool2 = bool1;
      if (localSharedPreferences.getBoolean(this.foe + paramString, false))
        bool2 = true;
    }
    return bool2;
  }

  public final void oW(String paramString)
  {
    aw.ZK();
    SharedPreferences localSharedPreferences = c.lK("banner");
    if (localSharedPreferences == null);
    while (true)
    {
      return;
      localSharedPreferences.edit().remove(this.foe + paramString).commit();
      if (this.fof != null)
        for (String str : this.fof)
          if (str != null)
            localSharedPreferences.edit().remove(this.foe + str + paramString).commit();
      if (this.fod != null)
        this.fod.aaY();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.b.a
 * JD-Core Version:    0.6.2
 */