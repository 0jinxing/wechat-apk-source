package com.tencent.mm.loader.a;

import a.f.b.j;
import a.l;
import com.tencent.mm.loader.f.f;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/builder/RequestBuilder;", "T", "R", "Lcom/tencent/mm/loader/IRequestBuilder;", "reqValue", "Lcom/tencent/mm/loader/model/data/DataItem;", "mImageLoaderConfiguration", "Lcom/tencent/mm/loader/cfg/ILoaderConfiguration;", "(Lcom/tencent/mm/loader/model/data/DataItem;Lcom/tencent/mm/loader/cfg/ILoaderConfiguration;)V", "defaultBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "getDefaultBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "setDefaultBackgroundDrawable", "(Landroid/graphics/drawable/Drawable;)V", "defaultBackgroundResId", "", "getDefaultBackgroundResId", "()I", "setDefaultBackgroundResId", "(I)V", "defaultDrawable", "getDefaultDrawable", "setDefaultDrawable", "defaultResId", "getDefaultResId", "setDefaultResId", "filenameCreator", "Lcom/tencent/mm/loader/listener/ILoadFileNameCreator;", "getFilenameCreator", "()Lcom/tencent/mm/loader/listener/ILoadFileNameCreator;", "setFilenameCreator", "(Lcom/tencent/mm/loader/listener/ILoadFileNameCreator;)V", "holder", "Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;", "", "getHolder", "()Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;", "setHolder", "(Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;)V", "imageDownloadListener", "Lcom/tencent/mm/loader/listener/IImageDownloadListener;", "getImageDownloadListener", "()Lcom/tencent/mm/loader/listener/IImageDownloadListener;", "setImageDownloadListener", "(Lcom/tencent/mm/loader/listener/IImageDownloadListener;)V", "imageWorkTask", "Lcom/tencent/mm/loader/loader/LoaderCore;", "Lcom/tencent/mm/loader/loader/IWorkTask;", "getImageWorkTask$libimageloader_release", "()Lcom/tencent/mm/loader/loader/LoaderCore;", "setImageWorkTask$libimageloader_release", "(Lcom/tencent/mm/loader/loader/LoaderCore;)V", "<set-?>", "Lcom/tencent/mm/loader/impr/transcoder/HeadResourceTranscoder;", "mDynamicTranscoder", "getMDynamicTranscoder", "()Lcom/tencent/mm/loader/impr/transcoder/HeadResourceTranscoder;", "setMDynamicTranscoder", "(Lcom/tencent/mm/loader/impr/transcoder/HeadResourceTranscoder;)V", "mHeadTranscoder", "getMHeadTranscoder", "setMHeadTranscoder", "mImageDiskCache", "Lcom/tencent/mm/loader/cache/disk/IDiskCache;", "getMImageDiskCache", "()Lcom/tencent/mm/loader/cache/disk/IDiskCache;", "setMImageDiskCache", "(Lcom/tencent/mm/loader/cache/disk/IDiskCache;)V", "mImageDownloader", "Lcom/tencent/mm/loader/common/IDataFetcher;", "getMImageDownloader", "()Lcom/tencent/mm/loader/common/IDataFetcher;", "setMImageDownloader", "(Lcom/tencent/mm/loader/common/IDataFetcher;)V", "mImageFileBrokenCallback", "Lcom/tencent/mm/loader/listener/IImageFileBrokenCallback;", "getMImageFileBrokenCallback", "()Lcom/tencent/mm/loader/listener/IImageFileBrokenCallback;", "setMImageFileBrokenCallback", "(Lcom/tencent/mm/loader/listener/IImageFileBrokenCallback;)V", "mImageLoadListener", "Lcom/tencent/mm/loader/listener/IImageLoadListener;", "getMImageLoadListener", "()Lcom/tencent/mm/loader/listener/IImageLoadListener;", "setMImageLoadListener", "(Lcom/tencent/mm/loader/listener/IImageLoadListener;)V", "mImageLoadReportCallback", "Lcom/tencent/mm/loader/listener/IImageLoaderReportListener;", "getMImageLoadReportCallback", "()Lcom/tencent/mm/loader/listener/IImageLoaderReportListener;", "setMImageLoadReportCallback", "(Lcom/tencent/mm/loader/listener/IImageLoaderReportListener;)V", "mImageLoaderListener", "Lcom/tencent/mm/loader/listener/IImageLoaderListener;", "getMImageLoaderListener", "()Lcom/tencent/mm/loader/listener/IImageLoaderListener;", "setMImageLoaderListener", "(Lcom/tencent/mm/loader/listener/IImageLoaderListener;)V", "mImageLoaderOptions", "Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;", "getMImageLoaderOptions", "()Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;", "setMImageLoaderOptions", "(Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;)V", "mImageMD5Checker", "Lcom/tencent/mm/loader/common/IImageMD5Check;", "getMImageMD5Checker", "()Lcom/tencent/mm/loader/common/IImageMD5Check;", "setMImageMD5Checker", "(Lcom/tencent/mm/loader/common/IImageMD5Check;)V", "mImageMemoryCache", "Lcom/tencent/mm/loader/cache/memory/IMemoryCache;", "getMImageMemoryCache", "()Lcom/tencent/mm/loader/cache/memory/IMemoryCache;", "setMImageMemoryCache", "(Lcom/tencent/mm/loader/cache/memory/IMemoryCache;)V", "mImageProducer", "Lcom/tencent/mm/loader/common/IImageResourceProducer;", "getMImageProducer", "()Lcom/tencent/mm/loader/common/IImageResourceProducer;", "setMImageProducer", "(Lcom/tencent/mm/loader/common/IImageResourceProducer;)V", "mImageRetryListener", "Lcom/tencent/mm/loader/common/IImageRetryDownload;", "getMImageRetryListener", "()Lcom/tencent/mm/loader/common/IImageRetryDownload;", "setMImageRetryListener", "(Lcom/tencent/mm/loader/common/IImageRetryDownload;)V", "getReqValue", "()Lcom/tencent/mm/loader/model/data/DataItem;", "setReqValue", "(Lcom/tencent/mm/loader/model/data/DataItem;)V", "target", "Lcom/tencent/mm/loader/impr/target/ResourceShowTarget;", "getTarget", "()Lcom/tencent/mm/loader/impr/target/ResourceShowTarget;", "setTarget", "(Lcom/tencent/mm/loader/impr/target/ResourceShowTarget;)V", "download", "", "fromCache", "()Ljava/lang/Object;", "into", "load", "_drawable", "_resId", "setFileNameCreator", "setImageFileBrokenCallback", "imageFileBrokenCallback", "setImageLoadListener", "imageLoadListener", "setImageLoaderListener", "imageLoaderListener", "setImageLoaderReportListener", "imageloaderReportListener", "setOptions", "options", "setResourceTranscoder", "_transcoder", "Lcom/tencent/mm/loader/impr/transcoder/ResourceTranscoder;", "setShowTarget", "Companion", "libimageloader_release"})
public abstract class b<T, R>
  implements com.tencent.mm.loader.b<T, R>
{
  public static final b.a ePh = new b.a((byte)0);
  public com.tencent.mm.loader.c.e eOF;
  public com.tencent.mm.loader.f.d<T, R> eOG;
  public com.tencent.mm.loader.f.e eOH;
  public com.tencent.mm.loader.f.c<T> eOI;
  public com.tencent.mm.loader.d.b<T> eOJ;
  public com.tencent.mm.loader.b.b.c<T, R> eOK;
  public com.tencent.mm.loader.b.a.d<T, R> eOL;
  public com.tencent.mm.loader.d.c eOM;
  public com.tencent.mm.loader.f.b eON;
  public com.tencent.mm.loader.d.e eOO;
  public com.tencent.mm.loader.d.d<R> eOP;
  public com.tencent.mm.loader.e.c.a<R> eOQ;
  public com.tencent.mm.loader.e.c.a<R> eOR;
  public com.tencent.mm.loader.f.a eOS;
  public com.tencent.mm.loader.g.d<com.tencent.mm.loader.g.c> eOT;
  public f eOV;
  public com.tencent.mm.loader.e.b.c<R> eOZ;
  public com.tencent.mm.loader.h.a.a<T> ePf;
  com.tencent.mm.loader.c.d<T, R> ePg;

  public b(com.tencent.mm.loader.h.a.a<T> parama, com.tencent.mm.loader.c.d<T, R> paramd)
  {
    this.ePf = parama;
    this.ePg = paramd;
  }

  public final com.tencent.mm.loader.b<T, R> a(com.tencent.mm.loader.c.e parame)
  {
    j.p(parame, "options");
    this.eOF = parame;
    return (com.tencent.mm.loader.b)this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.a.b
 * JD-Core Version:    0.6.2
 */