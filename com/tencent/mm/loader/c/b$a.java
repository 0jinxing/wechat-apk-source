package com.tencent.mm.loader.c;

import a.f.b.j;
import a.l;
import com.tencent.mm.loader.f.f;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/loader/cfg/Builder$build$1", "Lcom/tencent/mm/loader/cfg/ILoaderConfiguration;", "headResourceTranscoder", "Lcom/tencent/mm/loader/impr/transcoder/HeadResourceTranscoder;", "imageBatchGet", "Lcom/tencent/mm/loader/common/IDataBatchFetcher;", "imageDiskCache", "Lcom/tencent/mm/loader/cache/disk/IDiskCache;", "imageDownloadTaskExecutor", "Lcom/tencent/mm/loader/common/IImageLoaderExecutor;", "imageDownloader", "Lcom/tencent/mm/loader/common/IDataFetcher;", "imageFileBrokenCallback", "Lcom/tencent/mm/loader/listener/IImageFileBrokenCallback;", "imageFileNameCreator", "Lcom/tencent/mm/loader/listener/ILoadFileNameCreator;", "imageLoadReportCallback", "Lcom/tencent/mm/loader/listener/IImageLoaderReportListener;", "imageLoaderOptions", "Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;", "imageMd5CheckListener", "Lcom/tencent/mm/loader/common/IImageMD5Check;", "imageProducer", "Lcom/tencent/mm/loader/common/IImageResourceProducer;", "imageRetryListener", "Lcom/tencent/mm/loader/common/IImageRetryDownload;", "imageTempFileCleanExecutor", "Ljava/util/concurrent/Executor;", "memoryCache", "Lcom/tencent/mm/loader/cache/memory/IMemoryCache;", "libimageloader_release"})
public final class b$a
  implements d<T, R>
{
  public final com.tencent.mm.loader.b.b.c<T, R> Tf()
  {
    return this.ePD.ePs;
  }

  public final com.tencent.mm.loader.b.a.d<T, R> Tg()
  {
    com.tencent.mm.loader.b.a.d locald = this.ePD.ePt;
    if (locald == null)
      j.avw("diskCache");
    return locald;
  }

  public final com.tencent.mm.loader.d.b<T> Th()
  {
    com.tencent.mm.loader.d.b localb = this.ePD.ePu;
    if (localb == null)
      j.avw("dataFetcher");
    return localb;
  }

  public final com.tencent.mm.loader.d.d<R> Ti()
  {
    return this.ePD.Te();
  }

  public final f Tj()
  {
    return this.ePD.ePv;
  }

  public final com.tencent.mm.loader.e.c.a<R> Tk()
  {
    return this.ePD.ePx;
  }

  public final e Tl()
  {
    return this.ePD.ePr;
  }

  public final com.tencent.mm.loader.f.e Tm()
  {
    return this.ePD.ePB;
  }

  public final com.tencent.mm.loader.d.c Tn()
  {
    return this.ePD.ePz;
  }

  public final com.tencent.mm.loader.f.b To()
  {
    return this.ePD.ePA;
  }

  public final com.tencent.mm.loader.d.e Tp()
  {
    return this.ePD.ePy;
  }

  public final com.tencent.mm.loader.d.a<T> Tq()
  {
    return this.ePD.ePC;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.c.b.a
 * JD-Core Version:    0.6.2
 */