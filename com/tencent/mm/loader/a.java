package com.tencent.mm.loader;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/DefaultImageLoader;", "Lcom/tencent/mm/loader/Loader;", "", "configuration", "Lcom/tencent/mm/loader/cfg/ILoaderConfiguration;", "Landroid/graphics/Bitmap;", "(Lcom/tencent/mm/loader/cfg/ILoaderConfiguration;)V", "load", "Lcom/tencent/mm/loader/builder/RequestBuilder;", "url", "", "view", "Landroid/widget/ImageView;", "options", "Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;", "loadAssert", "assertPath", "loadDrawable", "Lcom/tencent/mm/loader/builder/BitmapRequestBuilder;", "context", "Landroid/content/Context;", "drawable", "resId", "", "loadLocal", "loadLocalFile", "filePath", "libimageloader_release"})
public final class a extends d<String>
{
  public a(com.tencent.mm.loader.c.d<String, Bitmap> paramd)
  {
    super(paramd);
  }

  public final com.tencent.mm.loader.a.b<String, Bitmap> lR(String paramString)
  {
    j.p(paramString, "filePath");
    paramString = com.tencent.mm.loader.h.a.a.a(paramString, com.tencent.mm.loader.h.a.b.eRY);
    j.o(paramString, "DataItem.create(filePath, DataType.LOCAL_PATH)");
    return (com.tencent.mm.loader.a.b)new com.tencent.mm.loader.a.a(paramString, this.eOC);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.a
 * JD-Core Version:    0.6.2
 */