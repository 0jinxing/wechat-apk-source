package android.support.v7.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class a
{
  public Context mContext;

  private a(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public static a X(Context paramContext)
  {
    return new a(paramContext);
  }

  public final int fY()
  {
    Configuration localConfiguration = this.mContext.getResources().getConfiguration();
    int i = localConfiguration.screenWidthDp;
    int j = localConfiguration.screenHeightDp;
    if ((localConfiguration.smallestScreenWidthDp > 600) || (i > 600) || ((i > 960) && (j > 720)) || ((i > 720) && (j > 960)))
      i = 5;
    while (true)
    {
      return i;
      if ((i >= 500) || ((i > 640) && (j > 480)) || ((i > 480) && (j > 640)))
        i = 4;
      else if (i >= 360)
        i = 3;
      else
        i = 2;
    }
  }

  public final boolean fZ()
  {
    return this.mContext.getResources().getBoolean(2131558400);
  }

  public final boolean ga()
  {
    if (this.mContext.getApplicationInfo().targetSdkVersion < 14);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.a
 * JD-Core Version:    0.6.2
 */