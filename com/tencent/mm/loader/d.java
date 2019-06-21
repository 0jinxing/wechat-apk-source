package com.tencent.mm.loader;

import a.l;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.mm.loader.a.b;
import com.tencent.mm.loader.c.e;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/Loader;", "T", "", "configuration", "Lcom/tencent/mm/loader/cfg/ILoaderConfiguration;", "Landroid/graphics/Bitmap;", "(Lcom/tencent/mm/loader/cfg/ILoaderConfiguration;)V", "getConfiguration", "()Lcom/tencent/mm/loader/cfg/ILoaderConfiguration;", "load", "Lcom/tencent/mm/loader/builder/RequestBuilder;", "url", "(Ljava/lang/Object;)Lcom/tencent/mm/loader/builder/RequestBuilder;", "", "view", "Landroid/widget/ImageView;", "options", "Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;", "(Ljava/lang/Object;Landroid/widget/ImageView;Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;)V", "loadLocal", "libimageloader_release"})
public abstract class d<T>
{
  final com.tencent.mm.loader.c.d<T, Bitmap> eOC;

  public d(com.tencent.mm.loader.c.d<T, Bitmap> paramd)
  {
    this.eOC = paramd;
  }

  public abstract void a(T paramT, ImageView paramImageView, e parame);

  public abstract b<T, Bitmap> aO(T paramT);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.d
 * JD-Core Version:    0.6.2
 */