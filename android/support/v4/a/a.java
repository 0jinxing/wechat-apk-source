package android.support.v4.a;

import android.graphics.Bitmap;
import android.os.Build.VERSION;

public final class a
{
  static final a.c GY;

  static
  {
    if (Build.VERSION.SDK_INT >= 19)
      GY = new a.b();
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 18)
        GY = new a.a();
      else
        GY = new a.c();
    }
  }

  public static int c(Bitmap paramBitmap)
  {
    return GY.c(paramBitmap);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.a.a
 * JD-Core Version:    0.6.2
 */