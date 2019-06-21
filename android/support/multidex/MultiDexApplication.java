package android.support.multidex;

import android.app.Application;
import android.content.Context;

public class MultiDexApplication extends Application
{
  protected void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
    a.H(this);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.multidex.MultiDexApplication
 * JD-Core Version:    0.6.2
 */