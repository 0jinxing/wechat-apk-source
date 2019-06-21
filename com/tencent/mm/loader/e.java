package com.tencent.mm.loader;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/LoaderFactory;", "", "()V", "instance", "Lcom/tencent/mm/loader/DefaultImageLoader;", "Lcom/tencent/mm/loader/Loader;", "T", "Lcom/tencent/mm/loader/model/data/ILoaderData;", "configuration", "Lcom/tencent/mm/loader/cfg/ILoaderConfiguration;", "Landroid/graphics/Bitmap;", "libimageloader_release"})
public final class e
{
  public static final e eOD = new e();

  public static a Tb()
  {
    return new a((com.tencent.mm.loader.c.d)new com.tencent.mm.loader.c.c());
  }

  public static <T extends com.tencent.mm.loader.h.a.c> d<T> a(com.tencent.mm.loader.c.d<T, Bitmap> paramd)
  {
    j.p(paramd, "configuration");
    return (d)new c(paramd);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.e
 * JD-Core Version:    0.6.2
 */