package org.xwalk.core;

import android.app.Application;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

public class XWalkApplication extends Application
{
  private static final String TAG = "XWalkLib";
  private static XWalkApplication gApp = null;
  private Resources mRes = null;

  static XWalkApplication getApplication()
  {
    return gApp;
  }

  void addResource(Resources paramResources)
  {
    AppMethodBeat.i(85537);
    if (this.mRes != null)
      AppMethodBeat.o(85537);
    while (true)
    {
      return;
      this.mRes = new XWalkMixedResources(super.getResources(), paramResources);
      AppMethodBeat.o(85537);
    }
  }

  void addResource(String paramString)
  {
    AppMethodBeat.i(85538);
    if (this.mRes != null)
      AppMethodBeat.o(85538);
    while (true)
    {
      return;
      try
      {
        Object localObject = (AssetManager)AssetManager.class.newInstance();
        localObject.getClass().getMethod("addAssetPath", new Class[] { String.class }).invoke(localObject, new Object[] { paramString });
        Resources localResources = super.getResources();
        paramString = new android/content/res/Resources;
        paramString.<init>((AssetManager)localObject, localResources.getDisplayMetrics(), localResources.getConfiguration());
        localObject = new org/xwalk/core/XWalkMixedResources;
        ((XWalkMixedResources)localObject).<init>(super.getResources(), paramString);
        this.mRes = ((Resources)localObject);
        AppMethodBeat.o(85538);
      }
      catch (Exception paramString)
      {
        Log.e("XWalkLib", paramString.getMessage());
        AppMethodBeat.o(85538);
      }
    }
  }

  public Resources getResources()
  {
    AppMethodBeat.i(85536);
    Resources localResources;
    if (this.mRes == null)
    {
      localResources = super.getResources();
      AppMethodBeat.o(85536);
    }
    while (true)
    {
      return localResources;
      localResources = this.mRes;
      AppMethodBeat.o(85536);
    }
  }

  public void onCreate()
  {
    AppMethodBeat.i(85535);
    super.onCreate();
    gApp = this;
    AppMethodBeat.o(85535);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkApplication
 * JD-Core Version:    0.6.2
 */