package org.xwalk.core.resource;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public class XWalkResource extends Resources
{
  private WeakReference<Context> mWeChatContext;

  public XWalkResource(Resources paramResources, Context paramContext)
  {
    super(paramResources.getAssets(), paramContext.getResources().getDisplayMetrics(), paramResources.getConfiguration());
    AppMethodBeat.i(86229);
    this.mWeChatContext = new WeakReference(paramContext);
    AppMethodBeat.o(86229);
  }

  public DisplayMetrics getDisplayMetrics()
  {
    AppMethodBeat.i(86231);
    Object localObject = (Context)this.mWeChatContext.get();
    if (localObject != null)
    {
      localObject = ((Context)localObject).getResources().getDisplayMetrics();
      AppMethodBeat.o(86231);
    }
    while (true)
    {
      return localObject;
      localObject = super.getDisplayMetrics();
      AppMethodBeat.o(86231);
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(86230);
    super.updateConfiguration(paramConfiguration, getDisplayMetrics());
    AppMethodBeat.o(86230);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     org.xwalk.core.resource.XWalkResource
 * JD-Core Version:    0.6.2
 */