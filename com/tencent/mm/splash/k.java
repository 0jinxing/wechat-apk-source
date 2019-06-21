package com.tencent.mm.splash;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.util.ArrayList;

final class k extends Instrumentation
{
  public Instrumentation xHs;

  public k(Instrumentation paramInstrumentation)
  {
    AppMethodBeat.i(114885);
    this.xHs = paramInstrumentation;
    drp();
    AppMethodBeat.o(114885);
  }

  private void drp()
  {
    AppMethodBeat.i(114887);
    Field[] arrayOfField = Instrumentation.class.getDeclaredFields();
    for (int i = 0; i < arrayOfField.length; i++)
    {
      arrayOfField[i].setAccessible(true);
      Object localObject = arrayOfField[i].get(this.xHs);
      arrayOfField[i].set(this, localObject);
    }
    AppMethodBeat.o(114887);
  }

  public final Activity newActivity(ClassLoader paramClassLoader, String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(114886);
    if (h.xGI != null)
      h.xGI.cZ(paramString);
    if ((h.dra()) && (!h.drg().getCanonicalName().equals(paramString)))
    {
      paramClassLoader = new i();
      paramClassLoader.xHe = paramString;
      h.g("WxSplash.SplashHackInstrumentation", "new splash hack activity. replace activity %s", new Object[] { paramString });
      h.xGC.add(paramClassLoader);
      AppMethodBeat.o(114886);
      return paramClassLoader;
    }
    paramClassLoader = super.newActivity(paramClassLoader, paramString, paramIntent);
    Object localObject = h.ceX;
    if (localObject != null)
    {
      localObject = ((d)localObject).m(paramClassLoader);
      if (localObject != paramClassLoader)
      {
        h.g("WxSplash.SplashHackInstrumentation", "Activity %s is intercepted by %s.", new Object[] { paramString, localObject });
        paramClassLoader = (ClassLoader)localObject;
      }
    }
    while (true)
    {
      if (j.dro())
      {
        h.g("WxSplash.SplashHackInstrumentation", "processing relaunch activity.", new Object[0]);
        paramIntent.putExtra("splash-hack-activity-recreate", true);
      }
      AppMethodBeat.o(114886);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.splash.k
 * JD-Core Version:    0.6.2
 */