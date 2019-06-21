package android.support.v4.e;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

public final class d
{
  private static final Locale ROOT = new Locale("", "");

  public static int getLayoutDirectionFromLocale(Locale paramLocale)
  {
    int i = 1;
    int j;
    if (Build.VERSION.SDK_INT >= 17)
      j = TextUtils.getLayoutDirectionFromLocale(paramLocale);
    while (true)
    {
      return j;
      if ((paramLocale != null) && (!paramLocale.equals(ROOT)))
      {
        String str = a.a(paramLocale);
        if (str == null)
        {
          j = i;
          switch (Character.getDirectionality(paramLocale.getDisplayName(paramLocale).charAt(0)))
          {
          case 1:
          case 2:
          }
          j = 0;
        }
        else
        {
          j = i;
          if (!str.equalsIgnoreCase("Arab"))
          {
            j = i;
            if (str.equalsIgnoreCase("Hebr"));
          }
        }
      }
      else
      {
        j = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.e.d
 * JD-Core Version:    0.6.2
 */