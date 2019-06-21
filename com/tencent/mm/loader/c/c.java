package com.tencent.mm.loader.c;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import com.tencent.mm.loader.e.g;
import com.tencent.mm.loader.f.f;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/cfg/DefaultImageLoaderConfiguration;", "Lcom/tencent/mm/loader/cfg/ILoaderConfiguration;", "", "Landroid/graphics/Bitmap;", "()V", "headResourceTranscoder", "Lcom/tencent/mm/loader/impr/transcoder/HeadResourceTranscoder;", "imageBatchGet", "Lcom/tencent/mm/loader/common/IDataBatchFetcher;", "imageDiskCache", "Lcom/tencent/mm/loader/cache/disk/IDiskCache;", "imageDownloadTaskExecutor", "Lcom/tencent/mm/loader/common/IImageLoaderExecutor;", "imageDownloader", "Lcom/tencent/mm/loader/common/IDataFetcher;", "imageFileBrokenCallback", "Lcom/tencent/mm/loader/listener/IImageFileBrokenCallback;", "imageFileNameCreator", "Lcom/tencent/mm/loader/listener/ILoadFileNameCreator;", "imageLoadReportCallback", "Lcom/tencent/mm/loader/listener/IImageLoaderReportListener;", "imageLoaderOptions", "Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;", "imageMd5CheckListener", "Lcom/tencent/mm/loader/common/IImageMD5Check;", "imageProducer", "Lcom/tencent/mm/loader/common/IImageResourceProducer;", "imageRetryListener", "Lcom/tencent/mm/loader/common/IImageRetryDownload;", "imageTempFileCleanExecutor", "Ljava/util/concurrent/Executor;", "memoryCache", "Lcom/tencent/mm/loader/cache/memory/IMemoryCache;", "libimageloader_release"})
public final class c
  implements d<String, Bitmap>
{
  public final com.tencent.mm.loader.b.b.c<String, Bitmap> Tf()
  {
    return (com.tencent.mm.loader.b.b.c)new com.tencent.mm.loader.b.b.a();
  }

  public final com.tencent.mm.loader.b.a.d<String, Bitmap> Tg()
  {
    return (com.tencent.mm.loader.b.a.d)new com.tencent.mm.loader.b.a.b();
  }

  public final com.tencent.mm.loader.d.b<String> Th()
  {
    return (com.tencent.mm.loader.d.b)new com.tencent.mm.loader.e.b();
  }

  public final com.tencent.mm.loader.d.d<Bitmap> Ti()
  {
    return (com.tencent.mm.loader.d.d)new com.tencent.mm.loader.e.a.a();
  }

  public final f Tj()
  {
    return (f)new com.tencent.mm.loader.e.a();
  }

  public final com.tencent.mm.loader.e.c.a<Bitmap> Tk()
  {
    return null;
  }

  public final e Tl()
  {
    e locale = e.Tr();
    j.o(locale, "ImageLoaderOptions.createSimpleOption()");
    return locale;
  }

  public final com.tencent.mm.loader.f.e Tm()
  {
    return (com.tencent.mm.loader.f.e)new g();
  }

  public final com.tencent.mm.loader.d.c Tn()
  {
    return null;
  }

  public final com.tencent.mm.loader.f.b To()
  {
    return (com.tencent.mm.loader.f.b)new com.tencent.mm.loader.e.c();
  }

  public final com.tencent.mm.loader.d.e Tp()
  {
    return (com.tencent.mm.loader.d.e)new com.tencent.mm.loader.e.e();
  }

  public final com.tencent.mm.loader.d.a<String> Tq()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.c.c
 * JD-Core Version:    0.6.2
 */