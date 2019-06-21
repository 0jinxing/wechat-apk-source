package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.Trace;

public final class f
{
  public static void beginSection(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 18)
      Trace.beginSection(paramString);
  }

  public static void endSection()
  {
    if (Build.VERSION.SDK_INT >= 18)
      Trace.endSection();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.os.f
 * JD-Core Version:    0.6.2
 */