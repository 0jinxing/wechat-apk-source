package com.tencent.mm.plugin.appbrand.s;

import a.f.b.j;
import a.l;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import java.lang.Class<+Landroid.app.Activity;>;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/utils/AndroidComponentUtil;", "", "()V", "isActivityHasSpecificTaskAffinity", "", "clazz", "Ljava/lang/Class;", "Landroid/app/Activity;", "plugin-appbrand-integration_release"})
public final class a
{
  public static final a iRb;

  static
  {
    AppMethodBeat.i(135218);
    iRb = new a();
    AppMethodBeat.o(135218);
  }

  public static final boolean al(Class<? extends Activity> paramClass)
  {
    AppMethodBeat.i(135217);
    j.p(paramClass, "clazz");
    Context localContext = ah.getContext();
    if (localContext != null)
    {
      Object localObject = localContext.getPackageManager();
      if (localObject != null)
      {
        paramClass = ((PackageManager)localObject).getActivityInfo(new ComponentName(localContext, paramClass), 128);
        if (paramClass != null)
        {
          localObject = paramClass.taskAffinity;
          paramClass = (Class<? extends Activity>)localObject;
          if (localObject != null)
            break label71;
        }
      }
    }
    j.o(localContext, "appContext");
    paramClass = localContext.getPackageName();
    label71: boolean bool = j.j(paramClass, localContext.getPackageName());
    AppMethodBeat.o(135217);
    return bool ^ true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.a
 * JD-Core Version:    0.6.2
 */