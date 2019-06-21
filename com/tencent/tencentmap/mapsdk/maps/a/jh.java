package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.tencent.map.lib.b;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.map.lib.util.SystemUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.aq;
import com.tencent.tencentmap.mapsdk.a.r;
import com.tencent.tencentmap.mapsdk.a.t;
import com.tencent.tencentmap.mapsdk.a.v;
import java.io.Closeable;
import java.io.InputStream;

public class jh
  implements b
{
  private Context a;
  private final float b;
  private String c;

  public jh(Context paramContext, String paramString)
  {
    AppMethodBeat.i(100033);
    this.a = paramContext.getApplicationContext();
    this.b = (SystemUtil.getDensity(this.a) / 2.0F);
    this.c = paramString;
    AppMethodBeat.o(100033);
  }

  private Bitmap b(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(100035);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(100035);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      Object localObject2 = v.b(r.a(this.a).b(this.c) + paramString);
      Object localObject3 = localObject2;
      if (localObject2 == null)
        localObject3 = v.b(r.a(this.a).c(this.c) + paramString);
      localObject2 = localObject3;
      if (localObject3 == null)
        localObject2 = v.b(r.a(this.a).e() + paramString);
      localObject3 = localObject2;
      if (localObject2 == null)
      {
        if (t.a() == null)
          break label231;
        localObject3 = t.b(this.a, t.a() + paramString);
      }
      while (true)
      {
        localObject2 = localObject3;
        if (localObject3 == null)
          localObject2 = t.a(this.a, paramString);
        localObject3 = localObject2;
        if (localObject2 == null)
          localObject3 = t.b(this.a, paramString);
        if (localObject3 != null)
          break label268;
        AppMethodBeat.o(100035);
        paramString = localObject1;
        break;
        label231: localObject3 = localObject2;
        if (t.b() != null)
          localObject3 = v.b(t.b() + paramString);
      }
      label268: paramString = BitmapFactory.decodeStream((InputStream)localObject3);
      v.a((Closeable)localObject3);
      AppMethodBeat.o(100035);
    }
  }

  public Bitmap a(String paramString)
  {
    AppMethodBeat.i(100034);
    Object localObject1 = gj.a(paramString);
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = ic.t.a(paramString);
    if (this.a == null)
      AppMethodBeat.o(100034);
    while (true)
    {
      return localObject2;
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = localObject2;
      try
      {
        Object localObject3;
        if (!paramString.startsWith("poi_icon"))
        {
          localObject3 = localObject2;
          localObject1 = localObject2;
          if (!paramString.startsWith("mapcfg_"));
        }
        else
        {
          localObject1 = localObject2;
          localObject3 = new java/lang/StringBuilder;
          localObject1 = localObject2;
          ((StringBuilder)localObject3).<init>();
          localObject1 = localObject2;
          localObject3 = b(StringUtil.removeSuffix(paramString) + "@2x.png");
        }
        if (localObject3 != null)
        {
          localObject1 = localObject3;
          if (!paramString.contains("poi_icon_indoor"))
          {
            localObject1 = localObject3;
            paramString = ht.a((Bitmap)localObject3, this.b);
            localObject1 = paramString;
          }
        }
        while (true)
        {
          label140: AppMethodBeat.o(100034);
          localObject2 = localObject1;
          break;
          localObject1 = localObject3;
          paramString = ht.a((Bitmap)localObject3, (int)(this.b * ((Bitmap)localObject3).getHeight()) / ((Bitmap)localObject3).getHeight());
          localObject1 = paramString;
          continue;
          localObject1 = localObject3;
          paramString = b(paramString);
          localObject1 = paramString;
        }
      }
      catch (OutOfMemoryError paramString)
      {
        break label140;
      }
    }
  }

  public String a(GeoPoint paramGeoPoint)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jh
 * JD-Core Version:    0.6.2
 */