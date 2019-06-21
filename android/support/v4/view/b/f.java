package android.support.v4.view.b;

import android.graphics.Path;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public final class f
{
  public static Interpolator c(Path paramPath)
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (paramPath = new PathInterpolator(paramPath); ; paramPath = new e(paramPath))
      return paramPath;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v4.view.b.f
 * JD-Core Version:    0.6.2
 */