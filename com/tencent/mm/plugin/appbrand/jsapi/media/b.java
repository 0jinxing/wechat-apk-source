package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import java.io.InputStream;

public abstract interface b extends com.tencent.luggage.a.b
{
  public static final b hOQ = new b.1();

  public abstract Bitmap b(InputStream paramInputStream, BitmapFactory.Options paramOptions);

  public abstract Bitmap decodeFile(String paramString, BitmapFactory.Options paramOptions);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.b
 * JD-Core Version:    0.6.2
 */