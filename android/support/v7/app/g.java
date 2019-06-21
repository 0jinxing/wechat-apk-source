package android.support.v7.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.view.f.a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;

class g extends AppCompatDelegateImplV9
{
  private int UT = -100;
  private boolean UU;
  boolean UV = true;
  private b UW;

  g(Context paramContext, Window paramWindow, c paramc)
  {
    super(paramContext, paramWindow, paramc);
  }

  private void fp()
  {
    if (this.UW == null)
      this.UW = new b(n.W(this.mContext));
  }

  private boolean fq()
  {
    boolean bool = true;
    PackageManager localPackageManager;
    if ((this.UU) && ((this.mContext instanceof Activity)))
      localPackageManager = this.mContext.getPackageManager();
    try
    {
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>(this.mContext, this.mContext.getClass());
      int i = localPackageManager.getActivityInfo(localComponentName, 0).configChanges;
      if ((i & 0x200) == 0);
      while (true)
      {
        label66: return bool;
        bool = false;
        continue;
        bool = false;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      break label66;
    }
  }

  final View a(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return null;
  }

  Window.Callback a(Window.Callback paramCallback)
  {
    return new a(paramCallback);
  }

  int bg(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 0:
    case -100:
    }
    while (true)
    {
      return paramInt;
      fp();
      b localb = this.UW;
      localb.UZ = localb.UY.fC();
      if (localb.UZ)
      {
        paramInt = 2;
      }
      else
      {
        paramInt = 1;
        continue;
        paramInt = -1;
      }
    }
  }

  public final boolean fl()
  {
    int i;
    int j;
    Object localObject;
    Configuration localConfiguration;
    label54: label80: boolean bool;
    if (this.UT != -100)
    {
      i = this.UT;
      j = bg(i);
      if (j == -1)
        break label306;
      localObject = this.mContext.getResources();
      localConfiguration = ((Resources)localObject).getConfiguration();
      int k = localConfiguration.uiMode;
      if (j != 2)
        break label198;
      j = 32;
      if ((k & 0x30) == j)
        break label300;
      if (!fq())
        break label204;
      ((Activity)this.mContext).recreate();
      bool = true;
    }
    while (true)
    {
      if (i == 0)
      {
        fp();
        localObject = this.UW;
        ((b)localObject).cleanup();
        if (((b)localObject).Va == null)
          ((b)localObject).Va = new g.b.1((b)localObject);
        if (((b)localObject).Vb == null)
        {
          ((b)localObject).Vb = new IntentFilter();
          ((b)localObject).Vb.addAction("android.intent.action.TIME_SET");
          ((b)localObject).Vb.addAction("android.intent.action.TIMEZONE_CHANGED");
          ((b)localObject).Vb.addAction("android.intent.action.TIME_TICK");
        }
        ((b)localObject).UX.mContext.registerReceiver(((b)localObject).Va, ((b)localObject).Vb);
      }
      this.UU = true;
      return bool;
      i = d.UB;
      break;
      label198: j = 16;
      break label54;
      label204: localConfiguration = new Configuration(localConfiguration);
      DisplayMetrics localDisplayMetrics = ((Resources)localObject).getDisplayMetrics();
      localConfiguration.uiMode = (j | localConfiguration.uiMode & 0xFFFFFFCF);
      ((Resources)localObject).updateConfiguration(localConfiguration, localDisplayMetrics);
      if (Build.VERSION.SDK_INT >= 26)
        break label80;
      if (Build.VERSION.SDK_INT >= 24)
      {
        k.c((Resources)localObject);
        break label80;
      }
      if (Build.VERSION.SDK_INT >= 23)
      {
        k.b((Resources)localObject);
        break label80;
      }
      if (Build.VERSION.SDK_INT < 21)
        break label80;
      k.a((Resources)localObject);
      break label80;
      label300: bool = false;
      continue;
      label306: bool = false;
    }
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if ((paramBundle != null) && (this.UT == -100))
      this.UT = paramBundle.getInt("appcompat:local_night_mode", -100);
  }

  public final void onDestroy()
  {
    super.onDestroy();
    if (this.UW != null)
      this.UW.cleanup();
  }

  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.UT != -100)
      paramBundle.putInt("appcompat:local_night_mode", this.UT);
  }

  public final void onStart()
  {
    super.onStart();
    fl();
  }

  public final void onStop()
  {
    super.onStop();
    if (this.UW != null)
      this.UW.cleanup();
  }

  class a extends e.b
  {
    a(Window.Callback arg2)
    {
      super(localCallback);
    }

    final ActionMode a(ActionMode.Callback paramCallback)
    {
      f.a locala = new f.a(g.this.mContext, paramCallback);
      paramCallback = g.this.startSupportActionMode(locala);
      if (paramCallback != null);
      for (paramCallback = locala.b(paramCallback); ; paramCallback = null)
        return paramCallback;
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
    {
      if (g.this.UV);
      for (paramCallback = a(paramCallback); ; paramCallback = super.onWindowStartingActionMode(paramCallback))
        return paramCallback;
    }
  }

  final class b
  {
    n UY;
    boolean UZ;
    BroadcastReceiver Va;
    IntentFilter Vb;

    b(n arg2)
    {
      Object localObject;
      this.UY = localObject;
      this.UZ = localObject.fC();
    }

    final void cleanup()
    {
      if (this.Va != null)
      {
        g.this.mContext.unregisterReceiver(this.Va);
        this.Va = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.g
 * JD-Core Version:    0.6.2
 */