package com.tencent.mm.loader.c;

import a.f.b.j;
import a.l;
import com.tencent.mm.loader.e.g;
import com.tencent.mm.loader.f.f;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/cfg/Builder;", "T", "R", "", "()V", "dataFetcher", "Lcom/tencent/mm/loader/common/IDataFetcher;", "diskCache", "Lcom/tencent/mm/loader/cache/disk/IDiskCache;", "fileNameCreator", "Lcom/tencent/mm/loader/listener/ILoadFileNameCreator;", "headHeadResourceTranscoder", "Lcom/tencent/mm/loader/impr/transcoder/HeadResourceTranscoder;", "imageBatchGet", "Lcom/tencent/mm/loader/common/IDataBatchFetcher;", "imageFileBrokenCallback", "Lcom/tencent/mm/loader/listener/IImageFileBrokenCallback;", "imageLoadReportCallback", "Lcom/tencent/mm/loader/listener/IImageLoaderReportListener;", "imageLoaderOptions", "Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;", "imageMd5CheckListener", "Lcom/tencent/mm/loader/common/IImageMD5Check;", "imageProducer", "Lcom/tencent/mm/loader/common/IImageResourceProducer;", "getImageProducer", "()Lcom/tencent/mm/loader/common/IImageResourceProducer;", "setImageProducer", "(Lcom/tencent/mm/loader/common/IImageResourceProducer;)V", "imageRetryListener", "Lcom/tencent/mm/loader/common/IImageRetryDownload;", "memoryCache", "Lcom/tencent/mm/loader/cache/memory/IMemoryCache;", "appendResourceTranscoder", "transcoder", "Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder;", "Landroid/graphics/Bitmap;", "build", "Lcom/tencent/mm/loader/cfg/ILoaderConfiguration;", "setImageBatchGet", "batchFetcher", "setImageDiskCache", "cache", "setImageDownloader", "downloader", "setImageFileBrokenCallback", "fileBrokenCallback", "setImageFileNameCreator", "creater", "setImageLoaderOptions", "options", "setImageMd5Checker", "md5checker", "setImageMemoryCache", "setImageReport", "report", "setImageRetryListener", "listener", "libimageloader_release"})
public class b<T, R>
{
  com.tencent.mm.loader.f.b ePA;
  com.tencent.mm.loader.f.e ePB;
  com.tencent.mm.loader.d.a<T> ePC;
  public e ePr;
  com.tencent.mm.loader.b.b.c<T, R> ePs;
  public com.tencent.mm.loader.b.a.d<T, R> ePt;
  public com.tencent.mm.loader.d.b<T> ePu;
  public f ePv;
  protected com.tencent.mm.loader.d.d<R> ePw;
  com.tencent.mm.loader.e.c.a<R> ePx;
  com.tencent.mm.loader.d.e ePy;
  com.tencent.mm.loader.d.c ePz;

  public b()
  {
    e locale = e.Tr();
    j.o(locale, "ImageLoaderOptions.createSimpleOption()");
    this.ePr = locale;
    this.ePs = ((com.tencent.mm.loader.b.b.c)new com.tencent.mm.loader.b.b.b());
    this.ePv = ((f)new com.tencent.mm.loader.e.a());
    this.ePy = ((com.tencent.mm.loader.d.e)new com.tencent.mm.loader.e.e());
    this.ePA = ((com.tencent.mm.loader.f.b)new com.tencent.mm.loader.e.c());
    this.ePB = ((com.tencent.mm.loader.f.e)new g());
  }

  protected final com.tencent.mm.loader.d.d<R> Te()
  {
    com.tencent.mm.loader.d.d locald = this.ePw;
    if (locald == null)
      j.avw("imageProducer");
    return locald;
  }

  protected final void a(com.tencent.mm.loader.d.d<R> paramd)
  {
    j.p(paramd, "<set-?>");
    this.ePw = paramd;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.c.b
 * JD-Core Version:    0.6.2
 */