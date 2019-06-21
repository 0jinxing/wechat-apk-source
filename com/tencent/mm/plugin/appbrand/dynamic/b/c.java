package com.tencent.mm.plugin.appbrand.dynamic.b;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.canvas.d;
import com.tencent.mm.plugin.appbrand.canvas.e;
import com.tencent.mm.plugin.appbrand.canvas.e.a;
import com.tencent.mm.plugin.appbrand.dynamic.f.a;
import com.tencent.mm.plugin.appbrand.dynamic.i;

final class c
  implements e
{
  public final Bitmap a(d paramd, String paramString)
  {
    AppMethodBeat.i(10772);
    paramd = a(paramd, paramString, null);
    AppMethodBeat.o(10772);
    return paramd;
  }

  public final Bitmap a(final d paramd, final String paramString, Rect paramRect, final e.a parama)
  {
    AppMethodBeat.i(10774);
    final String str = paramd.eIo.getString("id", "");
    if (paramString.startsWith("wxfile://"))
    {
      paramd = AppBrandLocalMediaObjectManager.bt(str, paramString);
      if ((paramd == null) || (TextUtils.isEmpty(paramd.fnQ)))
      {
        AppMethodBeat.o(10774);
        paramd = null;
        return paramd;
      }
      paramString = paramd.fnQ;
      paramd = paramString;
      if (!paramString.startsWith("file://"))
        paramd = "file://".concat(String.valueOf(paramString));
      paramd = b.abR().a(paramd, null);
    }
    while (true)
    {
      AppMethodBeat.o(10774);
      break;
      if ((paramString.startsWith("https://")) || (paramString.startsWith("http://")))
      {
        paramRect = b.abR().a(paramString, null);
        if (paramRect == null)
        {
          b.abR().a(new b.i()
          {
            public final void abU()
            {
            }

            public final void mr()
            {
              AppMethodBeat.i(10771);
              Bundle localBundle = new Bundle();
              localBundle.putString("id", str);
              localBundle.putInt("widgetState", 2103);
              f.a(i.azC().zV(str), localBundle, f.a.class, null);
              AppMethodBeat.o(10771);
            }

            public final String wP()
            {
              return "WxaWidgetIcon";
            }

            public final void x(Bitmap paramAnonymousBitmap)
            {
              AppMethodBeat.i(10770);
              if ((parama == null) || (paramAnonymousBitmap == null) || (paramAnonymousBitmap.isRecycled()))
                AppMethodBeat.o(10770);
              while (true)
              {
                return;
                parama.a(paramd);
                AppMethodBeat.o(10770);
              }
            }
          }
          , paramString, null, null);
          paramd = paramRect;
        }
      }
      else
      {
        paramd = a.bM(str, paramString);
        continue;
        paramd = paramRect;
      }
    }
  }

  public final Bitmap a(d paramd, String paramString, e.a parama)
  {
    AppMethodBeat.i(10773);
    paramd = a(paramd, paramString, null, parama);
    AppMethodBeat.o(10773);
    return paramd;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.b.c
 * JD-Core Version:    0.6.2
 */