package com.tencent.mm.plugin.appbrand.dynamic;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class e
{
  private static volatile e hly;
  public Map<String, WeakReference<View>> hlz;

  private e()
  {
    AppMethodBeat.i(10678);
    this.hlz = new ConcurrentHashMap();
    AppMethodBeat.o(10678);
  }

  public static e azz()
  {
    AppMethodBeat.i(10679);
    if (hly == null);
    try
    {
      if (hly == null)
      {
        locale = new com/tencent/mm/plugin/appbrand/dynamic/e;
        locale.<init>();
        hly = locale;
      }
      e locale = hly;
      AppMethodBeat.o(10679);
      return locale;
    }
    finally
    {
      AppMethodBeat.o(10679);
    }
  }

  public final boolean b(String paramString, View paramView)
  {
    AppMethodBeat.i(10680);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.DynamicPageViewMgr", "add view into manager failed, key is null or nil.");
      AppMethodBeat.o(10680);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramView == null)
      {
        ab.w("MicroMsg.DynamicPageViewMgr", "add view into manager failed, view is null.");
        AppMethodBeat.o(10680);
        bool = false;
      }
      else
      {
        paramView = (WeakReference)this.hlz.put(paramString, new WeakReference(paramView));
        if ((paramView != null) && (paramView.get() != null))
          ab.i("MicroMsg.DynamicPageViewMgr", "add a new view and remove old one with key : %s.", new Object[] { paramString });
        AppMethodBeat.o(10680);
        bool = true;
      }
    }
  }

  public final View zS(String paramString)
  {
    AppMethodBeat.i(10681);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.DynamicPageViewMgr", "get view from manager failed, key is null or nil.");
      AppMethodBeat.o(10681);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = (WeakReference)this.hlz.get(paramString);
      if (paramString != null)
      {
        paramString = (View)paramString.get();
        AppMethodBeat.o(10681);
      }
      else
      {
        AppMethodBeat.o(10681);
        paramString = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.e
 * JD-Core Version:    0.6.2
 */