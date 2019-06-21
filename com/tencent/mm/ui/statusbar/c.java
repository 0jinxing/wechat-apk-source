package com.tencent.mm.ui.statusbar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

public class c
{
  public static final boolean zzP;

  @SuppressLint({"StaticFieldLeak"})
  private static final c zzT;
  private static final WeakHashMap<Activity, c> zzU;
  private final WeakReference<Activity> mActivityRef;
  private final Set<WeakReference<a>> zzQ;
  private boolean zzR;
  int zzS;

  static
  {
    AppMethodBeat.i(67849);
    if ((Build.VERSION.SDK_INT >= 21) && (!com.tencent.mm.sdk.h.c.dqy()));
    for (boolean bool = true; ; bool = false)
    {
      zzP = bool;
      zzT = new c()
      {
        public final void a(c.a paramAnonymousa)
        {
        }
      };
      zzU = new WeakHashMap();
      AppMethodBeat.o(67849);
      return;
    }
  }

  private c(Activity paramActivity)
  {
    AppMethodBeat.i(67845);
    this.zzQ = new HashSet();
    this.zzR = false;
    this.zzS = 0;
    this.mActivityRef = new WeakReference(paramActivity);
    AppMethodBeat.o(67845);
  }

  public static c az(Activity paramActivity)
  {
    AppMethodBeat.i(67847);
    Object localObject;
    if ((!zzP) || (paramActivity == null))
    {
      localObject = zzT;
      AppMethodBeat.o(67847);
    }
    while (true)
    {
      return localObject;
      c localc = (c)zzU.get(paramActivity);
      localObject = localc;
      if (localc == null)
      {
        localObject = new c(paramActivity);
        zzU.put(paramActivity, localObject);
      }
      AppMethodBeat.o(67847);
    }
  }

  public void a(a parama)
  {
    AppMethodBeat.i(67846);
    Object localObject1;
    if (!this.zzR)
    {
      this.zzR = true;
      localObject1 = (Activity)this.mActivityRef.get();
      if ((localObject1 != null) && (((Activity)localObject1).getWindow() != null))
        break label80;
    }
    while (true)
    {
      this.zzQ.add(new WeakReference(parama));
      if (this.zzS > 0)
        parama.pO(this.zzS);
      AppMethodBeat.o(67846);
      return;
      try
      {
        label80: Object localObject2 = (ViewGroup)((Activity)localObject1).getWindow().getDecorView();
        localObject1 = localObject2;
        if (((ViewGroup)localObject2).getChildCount() == 1)
          localObject1 = ((ViewGroup)localObject2).getChildAt(0);
        localObject2 = new com/tencent/mm/ui/statusbar/c$1;
        ((1)localObject2).<init>(this);
        ((View)localObject1).setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)localObject2);
        ((View)localObject1).requestApplyInsets();
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.StatusBarHeightWatcher", "setOnApplyWindowInsetsListener e=%s", new Object[] { localException });
      }
    }
  }

  public static abstract interface a
  {
    public abstract void pO(int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.statusbar.c
 * JD-Core Version:    0.6.2
 */