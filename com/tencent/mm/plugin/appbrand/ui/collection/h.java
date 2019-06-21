package com.tencent.mm.plugin.appbrand.ui.collection;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public final class h
{
  public static boolean a(boolean paramBoolean, Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(133322);
    if (paramBoolean);
    try
    {
      Object localObject;
      if (((af)g.K(af.class)).aD(paramString, paramInt))
      {
        localObject = new com/tencent/mm/plugin/appbrand/widget/f/c;
        ((com.tencent.mm.plugin.appbrand.widget.f.c)localObject).<init>(paramContext);
        ((com.tencent.mm.plugin.appbrand.widget.f.c)localObject).F(paramContext.getResources().getString(2131296853)).show();
        AppMethodBeat.o(133322);
        paramBoolean = true;
        return paramBoolean;
      }
      r(paramContext, paramBoolean);
      while (true)
      {
        AppMethodBeat.o(133322);
        paramBoolean = false;
        break;
        i = ((af)g.K(af.class)).aC(paramString, paramInt);
        if (i == 0)
        {
          localObject = new com/tencent/mm/plugin/appbrand/widget/f/c;
          ((com.tencent.mm.plugin.appbrand.widget.f.c)localObject).<init>(paramContext);
          ((com.tencent.mm.plugin.appbrand.widget.f.c)localObject).F(paramContext.getResources().getString(2131296852)).show();
          AppMethodBeat.o(133322);
          paramBoolean = true;
          break;
        }
        if (i != -2)
          break label264;
        i = ((af)g.K(af.class)).awY();
        localObject = com.tencent.mm.ui.base.h.a(paramContext, paramContext.getResources().getString(2131296596, new Object[] { Integer.valueOf(i) }), "", paramContext.getResources().getString(2131296994), null);
        if (localObject != null)
        {
          ((com.tencent.mm.ui.widget.a.c)localObject).setCanceledOnTouchOutside(false);
          ((com.tencent.mm.ui.widget.a.c)localObject).qZ(true);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i;
        ab.e("MicroMsg.CollectionModifyInteractLogic", "performClick, (%s %d) added = %b, modify e = %s", new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean), localException });
        r(paramContext, paramBoolean);
        continue;
        label264: if (i == -3)
        {
          com.tencent.mm.ui.widget.a.c localc = com.tencent.mm.ui.base.h.a(paramContext, paramContext.getResources().getString(2131296547), "", paramContext.getResources().getString(2131296994), null);
          if (localc != null)
          {
            localc.setCanceledOnTouchOutside(false);
            localc.qZ(true);
          }
        }
        else
        {
          r(paramContext, paramBoolean);
        }
      }
    }
  }

  private static void r(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(133323);
    al.d(new h.1(paramContext, paramBoolean));
    AppMethodBeat.o(133323);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.h
 * JD-Core Version:    0.6.2
 */