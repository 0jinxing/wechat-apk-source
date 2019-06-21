package com.tencent.mm.plugin.appbrand.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.weishi.b;
import com.tencent.mm.sdk.platformtools.ah;

public final class e
{
  private static final a<com.tencent.mm.plugin.appbrand.i, Bitmap> iGV;

  static
  {
    AppMethodBeat.i(132991);
    iGV = new a();
    AppMethodBeat.o(132991);
  }

  public static q a(Context paramContext, o paramo)
  {
    AppMethodBeat.i(132989);
    Object localObject = paramContext;
    if (paramContext == null)
      localObject = ah.getContext();
    localObject = new l((Context)localObject);
    paramContext = (Bitmap)iGV.remove(paramo);
    if ((paramContext != null) && (!paramContext.isRecycled()))
    {
      paramContext = new g((Context)localObject, paramo, paramContext);
      AppMethodBeat.o(132989);
    }
    while (true)
    {
      return paramContext;
      if (com.tencent.mm.plugin.appbrand.weishi.e.E(paramo))
      {
        paramContext = new b((Context)localObject, paramo);
        AppMethodBeat.o(132989);
      }
      else if (i.D(paramo))
      {
        paramContext = new f((Context)localObject, paramo);
        AppMethodBeat.o(132989);
      }
      else if (paramo.xy())
      {
        paramContext = new c((Context)localObject, paramo);
        AppMethodBeat.o(132989);
      }
      else
      {
        paramContext = new j((Context)localObject, paramo);
        AppMethodBeat.o(132989);
      }
    }
  }

  public static void a(com.tencent.mm.plugin.appbrand.i parami, Bitmap paramBitmap)
  {
    AppMethodBeat.i(132990);
    if ((parami == null) || (paramBitmap == null) || (paramBitmap.isRecycled()))
      AppMethodBeat.o(132990);
    while (true)
    {
      return;
      iGV.put(parami, paramBitmap);
      AppMethodBeat.o(132990);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.e
 * JD-Core Version:    0.6.2
 */