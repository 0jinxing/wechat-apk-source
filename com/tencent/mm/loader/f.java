package com.tencent.mm.loader;

import a.f.b.j;
import a.f.b.k;
import a.f.b.u.c;
import a.l;
import android.graphics.drawable.Drawable;
import com.tencent.mm.loader.a.b<TT;TR;>;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/Reaper;", "T", "R", "", "builder", "Lcom/tencent/mm/loader/builder/RequestBuilder;", "mImageLoaderConfiguration", "Lcom/tencent/mm/loader/cfg/ILoaderConfiguration;", "(Lcom/tencent/mm/loader/builder/RequestBuilder;Lcom/tencent/mm/loader/cfg/ILoaderConfiguration;)V", "batchFetcher", "Lcom/tencent/mm/loader/common/IDataBatchFetcher;", "getBatchFetcher", "()Lcom/tencent/mm/loader/common/IDataBatchFetcher;", "setBatchFetcher", "(Lcom/tencent/mm/loader/common/IDataBatchFetcher;)V", "getBuilder", "()Lcom/tencent/mm/loader/builder/RequestBuilder;", "debugInfo", "", "getDebugInfo", "()Ljava/lang/String;", "setDebugInfo", "(Ljava/lang/String;)V", "defaultBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "getDefaultBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "setDefaultBackgroundDrawable", "(Landroid/graphics/drawable/Drawable;)V", "defaultBackgroundResId", "", "getDefaultBackgroundResId", "()I", "setDefaultBackgroundResId", "(I)V", "defaultDrawable", "getDefaultDrawable", "setDefaultDrawable", "defaultResId", "getDefaultResId", "setDefaultResId", "filenameCreator", "Lcom/tencent/mm/loader/listener/ILoadFileNameCreator;", "getFilenameCreator", "()Lcom/tencent/mm/loader/listener/ILoadFileNameCreator;", "setFilenameCreator", "(Lcom/tencent/mm/loader/listener/ILoadFileNameCreator;)V", "holder", "Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;", "getHolder", "()Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;", "setHolder", "(Lcom/tencent/mm/loader/impr/target/ViewWeakHolder;)V", "imageDownloadListener", "Lcom/tencent/mm/loader/listener/IImageDownloadListener;", "getImageDownloadListener", "()Lcom/tencent/mm/loader/listener/IImageDownloadListener;", "setImageDownloadListener", "(Lcom/tencent/mm/loader/listener/IImageDownloadListener;)V", "imageWorkTask", "Lcom/tencent/mm/loader/loader/LoaderCore;", "Lcom/tencent/mm/loader/loader/IWorkTask;", "getImageWorkTask", "()Lcom/tencent/mm/loader/loader/LoaderCore;", "setImageWorkTask", "(Lcom/tencent/mm/loader/loader/LoaderCore;)V", "isShowDefaultBackground", "", "()Z", "isShowDefaultImage", "mDynamicTranscoder", "Lcom/tencent/mm/loader/impr/transcoder/HeadResourceTranscoder;", "getMDynamicTranscoder", "()Lcom/tencent/mm/loader/impr/transcoder/HeadResourceTranscoder;", "setMDynamicTranscoder", "(Lcom/tencent/mm/loader/impr/transcoder/HeadResourceTranscoder;)V", "mEmptyImageLoaderListener", "Lcom/tencent/mm/loader/impr/IDefaultImageLoaderListener;", "mHeadTranscoder", "getMHeadTranscoder", "setMHeadTranscoder", "mImageDiskCache", "Lcom/tencent/mm/loader/cache/disk/IDiskCache;", "getMImageDiskCache", "()Lcom/tencent/mm/loader/cache/disk/IDiskCache;", "setMImageDiskCache", "(Lcom/tencent/mm/loader/cache/disk/IDiskCache;)V", "mImageDownloader", "Lcom/tencent/mm/loader/common/IDataFetcher;", "getMImageDownloader", "()Lcom/tencent/mm/loader/common/IDataFetcher;", "setMImageDownloader", "(Lcom/tencent/mm/loader/common/IDataFetcher;)V", "mImageFileBrokenCallback", "Lcom/tencent/mm/loader/listener/IImageFileBrokenCallback;", "getMImageFileBrokenCallback", "()Lcom/tencent/mm/loader/listener/IImageFileBrokenCallback;", "setMImageFileBrokenCallback", "(Lcom/tencent/mm/loader/listener/IImageFileBrokenCallback;)V", "mImageLoadListener", "Lcom/tencent/mm/loader/listener/IImageLoadListener;", "getMImageLoadListener", "()Lcom/tencent/mm/loader/listener/IImageLoadListener;", "setMImageLoadListener", "(Lcom/tencent/mm/loader/listener/IImageLoadListener;)V", "mImageLoadReportCallback", "Lcom/tencent/mm/loader/listener/IImageLoaderReportListener;", "getMImageLoadReportCallback", "()Lcom/tencent/mm/loader/listener/IImageLoaderReportListener;", "setMImageLoadReportCallback", "(Lcom/tencent/mm/loader/listener/IImageLoaderReportListener;)V", "mImageLoaderListener", "Lcom/tencent/mm/loader/listener/IImageLoaderListener;", "getMImageLoaderListener", "()Lcom/tencent/mm/loader/listener/IImageLoaderListener;", "mImageLoaderOptions", "Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;", "getMImageLoaderOptions", "()Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;", "mImageMD5Checker", "Lcom/tencent/mm/loader/common/IImageMD5Check;", "getMImageMD5Checker", "()Lcom/tencent/mm/loader/common/IImageMD5Check;", "setMImageMD5Checker", "(Lcom/tencent/mm/loader/common/IImageMD5Check;)V", "mImageMemoryCache", "Lcom/tencent/mm/loader/cache/memory/IMemoryCache;", "getMImageMemoryCache", "()Lcom/tencent/mm/loader/cache/memory/IMemoryCache;", "setMImageMemoryCache", "(Lcom/tencent/mm/loader/cache/memory/IMemoryCache;)V", "mImageProducer", "Lcom/tencent/mm/loader/common/IImageResourceProducer;", "getMImageProducer", "()Lcom/tencent/mm/loader/common/IImageResourceProducer;", "setMImageProducer", "(Lcom/tencent/mm/loader/common/IImageResourceProducer;)V", "mImageRetryListener", "Lcom/tencent/mm/loader/common/IImageRetryDownload;", "getMImageRetryListener", "()Lcom/tencent/mm/loader/common/IImageRetryDownload;", "setMImageRetryListener", "(Lcom/tencent/mm/loader/common/IImageRetryDownload;)V", "onlyDownload", "getOnlyDownload", "setOnlyDownload", "(Z)V", "target", "Lcom/tencent/mm/loader/impr/target/ResourceShowTarget;", "getTarget", "()Lcom/tencent/mm/loader/impr/target/ResourceShowTarget;", "setTarget", "(Lcom/tencent/mm/loader/impr/target/ResourceShowTarget;)V", "uriValue", "Lcom/tencent/mm/loader/model/data/DataItem;", "getUriValue", "()Lcom/tencent/mm/loader/model/data/DataItem;", "setUriValue", "(Lcom/tencent/mm/loader/model/data/DataItem;)V", "checkIfNeedInitExecutor", "", "doLoadImage", "task", "Lcom/tencent/mm/loader/task/LoadTask;", "checkCleanTmpFile", "download", "load", "request", "Companion", "libimageloader_release"})
public final class f<T, R>
{
  public static final String TAG = "MicroMsg.Loader.Reaper";
  public static final f.a ePc = new f.a((byte)0);
  private final com.tencent.mm.loader.e.f<T, R> eOE;
  public final com.tencent.mm.loader.c.e eOF;
  private final com.tencent.mm.loader.f.d<T, R> eOG;
  private com.tencent.mm.loader.f.e eOH;
  public com.tencent.mm.loader.f.c<T> eOI;
  public com.tencent.mm.loader.d.b<T> eOJ;
  public com.tencent.mm.loader.b.b.c<T, R> eOK;
  public com.tencent.mm.loader.b.a.d<T, R> eOL;
  public com.tencent.mm.loader.d.c eOM;
  private com.tencent.mm.loader.f.b eON;
  public com.tencent.mm.loader.d.e eOO;
  public com.tencent.mm.loader.d.d<R> eOP;
  public com.tencent.mm.loader.e.c.a<R> eOQ;
  public com.tencent.mm.loader.e.c.a<R> eOR;
  public com.tencent.mm.loader.f.a eOS;
  public com.tencent.mm.loader.g.d<com.tencent.mm.loader.g.c> eOT;
  private com.tencent.mm.loader.d.a<T> eOU;
  public com.tencent.mm.loader.f.f eOV;
  public int eOW;
  public Drawable eOX;
  public com.tencent.mm.loader.h.a.a<T> eOY;
  public com.tencent.mm.loader.e.b.c<R> eOZ;
  public String ePa;
  public final com.tencent.mm.loader.a.b<T, R> ePb;

  public f(com.tencent.mm.loader.a.b<T, R> paramb, com.tencent.mm.loader.c.d<T, R> paramd)
  {
    this.ePb = paramb;
    this.eOE = new com.tencent.mm.loader.e.f();
    Object localObject = this.ePb.eOF;
    paramb = (com.tencent.mm.loader.a.b<T, R>)localObject;
    if (localObject == null)
      paramb = paramd.Tl();
    this.eOF = paramb;
    localObject = this.ePb.eOG;
    paramb = (com.tencent.mm.loader.a.b<T, R>)localObject;
    if (localObject == null)
      paramb = (com.tencent.mm.loader.f.d)this.eOE;
    this.eOG = paramb;
    localObject = this.ePb.eOH;
    paramb = (com.tencent.mm.loader.a.b<T, R>)localObject;
    if (localObject == null)
      paramb = paramd.Tm();
    this.eOH = paramb;
    this.eOI = this.ePb.eOI;
    localObject = this.ePb.eOJ;
    paramb = (com.tencent.mm.loader.a.b<T, R>)localObject;
    if (localObject == null)
      paramb = paramd.Th();
    this.eOJ = paramb;
    localObject = this.ePb.eOK;
    paramb = (com.tencent.mm.loader.a.b<T, R>)localObject;
    if (localObject == null)
      paramb = paramd.Tf();
    this.eOK = paramb;
    localObject = this.ePb.eOL;
    paramb = (com.tencent.mm.loader.a.b<T, R>)localObject;
    if (localObject == null)
      paramb = paramd.Tg();
    this.eOL = paramb;
    localObject = this.ePb.eOM;
    paramb = (com.tencent.mm.loader.a.b<T, R>)localObject;
    if (localObject == null)
      paramb = paramd.Tn();
    this.eOM = paramb;
    localObject = this.ePb.eON;
    paramb = (com.tencent.mm.loader.a.b<T, R>)localObject;
    if (localObject == null)
      paramb = paramd.To();
    this.eON = paramb;
    localObject = this.ePb.eOO;
    paramb = (com.tencent.mm.loader.a.b<T, R>)localObject;
    if (localObject == null)
      paramb = paramd.Tp();
    this.eOO = paramb;
    localObject = this.ePb.eOP;
    paramb = (com.tencent.mm.loader.a.b<T, R>)localObject;
    if (localObject == null)
      paramb = paramd.Ti();
    this.eOP = paramb;
    localObject = this.ePb.eOQ;
    paramb = (com.tencent.mm.loader.a.b<T, R>)localObject;
    if (localObject == null)
      paramb = paramd.Tk();
    this.eOQ = paramb;
    this.eOR = this.ePb.eOR;
    this.eOS = this.ePb.eOS;
    this.eOT = this.ePb.eOT;
    this.eOU = paramd.Tq();
    localObject = this.ePb.eOV;
    paramb = (com.tencent.mm.loader.a.b<T, R>)localObject;
    if (localObject == null)
      paramb = paramd.Tj();
    this.eOV = paramb;
    this.eOW = this.eOF.TC();
    this.eOY = this.ePb.ePf;
    this.ePa = "";
  }

  public final com.tencent.mm.loader.e.b.c<R> Tc()
  {
    com.tencent.mm.loader.e.b.c localc = this.eOZ;
    if (localc == null)
      j.avw("target");
    return localc;
  }

  public final void Td()
  {
    try
    {
      if (this.eOT == null)
      {
        com.tencent.mm.loader.g.a.e locale = com.tencent.mm.loader.g.a.e.eRA;
        this.eOT = com.tencent.mm.loader.g.a.e.TV();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "T", "R", "invoke"})
  public static final class b extends k
    implements a.f.a.a<Boolean>
  {
    public b(f paramf, u.c paramc)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.f
 * JD-Core Version:    0.6.2
 */