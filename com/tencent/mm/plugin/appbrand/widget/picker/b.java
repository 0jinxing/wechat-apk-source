package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.view.View;
import com.tencent.mm.plugin.appbrand.widget.input.n;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Constructor;

public abstract class b
{
  public a jks;

  protected abstract View aEK();

  public final <T extends com.tencent.mm.plugin.appbrand.jsapi.m.b> T an(Class<T> paramClass)
  {
    a locala = ff(true);
    this.jks = locala;
    if (locala == null)
      paramClass = null;
    while (true)
    {
      return paramClass;
      try
      {
        locala.setPickerImpl((com.tencent.mm.plugin.appbrand.jsapi.m.b)paramClass.getDeclaredConstructor(new Class[] { Context.class }).newInstance(new Object[] { locala.getContext() }));
        paramClass = locala.getPicker();
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.AppBrandBottomPickerInvokeHandler", "newInstance class[%s], exp[%s]", new Object[] { paramClass.getSimpleName(), localException });
        paramClass = null;
      }
    }
  }

  public final a ff(boolean paramBoolean)
  {
    a locala1 = null;
    a locala2;
    if (this.jks != null)
      locala2 = this.jks;
    while (true)
    {
      return locala2;
      locala2 = locala1;
      if (aEK() != null)
      {
        n localn = n.cG(aEK());
        locala2 = locala1;
        if (localn != null)
        {
          locala1 = a.cV(localn);
          locala2 = locala1;
          if (locala1 == null)
          {
            locala2 = locala1;
            if (paramBoolean)
            {
              locala2 = new a(aEK().getContext());
              localn.n(locala2, true);
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.b
 * JD-Core Version:    0.6.2
 */