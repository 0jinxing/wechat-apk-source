package android.support.v4.f;

import android.os.Build.VERSION;
import java.util.Objects;

public final class i
{
  public static boolean equals(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 19)
      bool = Objects.equals(paramObject1, paramObject2);
    while (true)
    {
      return bool;
      if ((paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2))))
        bool = true;
      else
        bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.f.i
 * JD-Core Version:    0.6.2
 */