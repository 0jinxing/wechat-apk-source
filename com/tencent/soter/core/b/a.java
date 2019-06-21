package com.tencent.soter.core.b;

import android.os.Build.VERSION;
import com.tencent.soter.core.c.d;
import java.security.spec.AlgorithmParameterSpec;

public abstract class a
{
  public static String[] Y(String[] paramArrayOfString)
  {
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
      paramArrayOfString = (String[])paramArrayOfString.clone();
    while (true)
      return paramArrayOfString;
  }

  public static a eP(String paramString, int paramInt)
  {
    if (com.tencent.soter.core.a.dQN())
      if (Build.VERSION.SDK_INT >= 23)
        paramString = new a.b(paramString, paramInt);
    while (true)
    {
      return paramString;
      paramString = new a.c(paramString, paramInt);
      continue;
      d.e("Soter.KeyGenParameterSpecCompatBuilder", "soter: not support soter. return dummy", new Object[0]);
      paramString = new a.a();
    }
  }

  public abstract a W(String[] paramArrayOfString);

  public abstract a X(String[] paramArrayOfString);

  public abstract AlgorithmParameterSpec dQU();

  public abstract a dQV();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.b.a
 * JD-Core Version:    0.6.2
 */