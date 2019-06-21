package com.tencent.mm.media.g;

import a.f.a.m;
import a.f.b.j;
import a.f.b.k;
import a.l;
import a.y;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/remuxer/MediaCodecRemuxer;", "Lcom/tencent/mm/media/remuxer/IMediaCodecVideoRemuxer;", "musicPath", "", "filePath", "mixType", "", "outputFilePath", "outputWidth", "outputHeight", "outputBitrate", "outputAudioBitrate", "outputAudioSampleRate", "outputFps", "startTimeMs", "", "endTimeMs", "finishCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "path", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIIIIIJJLkotlin/jvm/functions/Function1;)V", "TAG", "audioCodec", "Lcom/tencent/mm/media/codec/MediaCodecAACCodec;", "audioMixHandlerThread", "Lcom/tencent/mm/sdk/platformtools/MMHandlerThread;", "backgroundExtractorWrapper", "Lcom/tencent/mm/media/extractor/MediaExtractorWrapper;", "blendBitmap", "Landroid/graphics/Bitmap;", "blendBitmapProvider", "codecSurface", "Lcom/tencent/mm/media/remuxer/CodecInputSurface;", "decodeFrameCount", "decoder", "Lcom/tencent/mm/media/decoder/IMediaCodecTransDecoder;", "drawFrameCount", "encodeFrameCount", "encoder", "Lcom/tencent/mm/media/encoder/IMediaCodecTransEncoder;", "firstFrameDraw", "", "initFinish", "inputHeight", "inputWidth", "isAudioRemuxFinish", "isInvokeEndCallback", "isVideoRemuxFinish", "mediaExtractorWrapper", "mixMuxerController", "Lcom/tencent/mm/media/remuxer/MixMuxerController;", "getMixType", "()I", "setMixType", "(I)V", "musicExtractorWrapper", "remuxCost", "Lcom/tencent/mm/media/util/CodeMan;", "remuxEndTime", "remuxStartTick", "remuxStartTime", "remuxerCallback", "Lcom/tencent/mm/media/remuxer/MediaCodecRemuxerCallback;", "startOnInitFinish", "useRequestDraw", "videoDuration", "videoFps", "videoMixHandlerThread", "videoRotate", "checkFrameDrawTimeout", "copyVideoFile", "source", "finishEncode", "finishRemux", "isVideo", "generateEncodeConfig", "Lcom/tencent/mm/media/config/VideoCodecConfig;", "onDecoderEncoderFailed", "isDecoder", "remux", "remuxImpl", "renderer", "Lcom/tencent/mm/media/render/MixRenderer;", "runAudioMix", "setVideoBlendBitmap", "bitmap", "setVideoBlendBitmapProvider", "Companion", "plugin-mediaeditor_release"})
public final class e extends c
{
  private static final long eYr = 1000L;
  public static final e.a eYs;
  private final String TAG;
  private int eST;
  private int eTb;
  private com.tencent.mm.media.e.a eTz;
  private int eWK;
  private com.tencent.mm.media.c.b eXA;
  private int eXJ;
  private int eXK;
  private int eXL;
  private long eXM;
  private long eXN;
  private com.tencent.mm.media.d.b eXO;
  private com.tencent.mm.media.a.a eXP;
  public a eXQ;
  private h eXR;
  private com.tencent.mm.media.e.a eXS;
  private com.tencent.mm.media.e.a eXT;
  private al eXU;
  private al eXV;
  private boolean eXW;
  private boolean eXX;
  private f eXY;
  private long eXZ;
  public a.f.a.b<? super Long, Bitmap> eXh;
  private Bitmap eXi;
  private final com.tencent.mm.media.i.a eYa;
  private boolean eYb;
  private boolean eYc;
  private boolean eYd;
  private int eYe;
  private int eYf;
  private volatile boolean eYg;
  private volatile boolean eYh;
  private final String eYi;
  private final String eYj;
  private int eYk;
  private int eYl;
  private int eYm;
  private int eYn;
  private int eYo;
  private int eYp;
  private a.f.a.b<? super String, y> eYq;
  private String filePath;
  private int videoFps;

  static
  {
    AppMethodBeat.i(13063);
    eYs = new e.a((byte)0);
    eYr = 1000L;
    AppMethodBeat.o(13063);
  }

  public e(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong1, long paramLong2, a.f.a.b<? super String, y> paramb)
  {
    AppMethodBeat.i(13062);
    this.eYi = paramString1;
    this.filePath = paramString2;
    this.eTb = paramInt1;
    this.eYj = paramString3;
    this.eYk = paramInt2;
    this.eYl = paramInt3;
    this.eYm = paramInt4;
    this.eYn = paramInt5;
    this.eYo = paramInt6;
    this.eYp = paramInt7;
    this.eYq = paramb;
    this.TAG = "MicroMsg.MediaCodecRemuxer";
    this.eWK = -1;
    this.eXM = paramLong1;
    this.eXN = -1L;
    this.eYa = new com.tencent.mm.media.i.a("remuxCost");
    if ((bo.isNullOrNil(this.filePath)) || (!com.tencent.mm.vfs.e.ct(this.filePath)) || (bo.isNullOrNil(this.eYj)) || (this.eYk <= 0) || (this.eYl <= 0))
    {
      ab.e(this.TAG, "create MediaCodecRemuxer error, filePath:" + this.filePath + ", outputFilePath:" + this.eYj + ", outputWidth:" + this.eYk + ", outputHeight:" + this.eYl + ", videoFps:" + this.videoFps + ", outputFps:" + this.eYp);
      paramString1 = com.tencent.mm.media.i.c.faj;
      com.tencent.mm.media.i.c.VE();
      paramString1 = (Throwable)new IllegalArgumentException("create MediaCodecRemuxer error");
      AppMethodBeat.o(13062);
      throw paramString1;
    }
    paramString1 = com.tencent.mm.media.i.c.faj;
    com.tencent.mm.media.i.c.kc(this.eTb);
    if (com.tencent.mm.bj.e.uD(this.filePath))
    {
      ab.i(this.TAG, "remux h265 format");
      paramString1 = com.tencent.mm.media.i.c.faj;
      com.tencent.mm.media.i.c.VD();
    }
    com.tencent.mm.vfs.e.tf(com.tencent.mm.vfs.e.atb(this.eYj));
    this.eXL = SightVideoJNI.getMp4Rotate(this.filePath);
    paramString1 = com.tencent.mm.plugin.sight.base.d.WR(this.filePath);
    if (paramString1 != null)
    {
      this.eXJ = paramString1.width;
      this.eXK = paramString1.height;
      this.videoFps = paramString1.eTk;
      this.eWK = paramString1.eWK;
    }
    if ((this.eXJ <= 0) || (this.eXK <= 0));
    try
    {
      paramString2 = new android/media/MediaMetadataRetriever;
      paramString2.<init>();
      paramString2.setDataSource(this.filePath);
      this.eXJ = bo.getInt(paramString2.extractMetadata(18), 0);
      this.eXK = bo.getInt(paramString2.extractMetadata(19), 0);
      paramString2.release();
      label453: if (this.videoFps <= 0)
      {
        ab.e(this.TAG, "create MediaCodecRemuxer error, filePath:" + this.filePath + ", get video fps error");
        paramString1 = com.tencent.mm.media.i.c.faj;
        com.tencent.mm.media.i.c.VE();
        paramString1 = (Throwable)new IllegalArgumentException("create MediaCodecRemuxer error");
        AppMethodBeat.o(13062);
        throw paramString1;
      }
      label868: boolean bool;
      if (paramLong2 == 0L)
      {
        this.eXN = this.eWK;
        this.eXR = new h(this.eXM, this.eXN, this.eYm);
        ab.c(this.TAG, "create MediaCodecRemuxer, filePath: " + this.filePath + ", outputFilePath: " + this.eYj + ", inputWidth: " + this.eXJ + ", inputHeight: " + this.eXK + ", videoRotate: " + this.eXL + " videoFps: " + this.videoFps + " ,outputBitrate :" + this.eYm + ", outputAudioBitrate:" + this.eYn + " , outputWidth: " + this.eYk + ", outputHeight: " + this.eYl + ',' + " startTimeMs: " + paramLong1 + ", endTimeMs: " + paramLong2 + " , outputFps: " + this.eYp + " , videoDuration: " + this.eWK + " , remuxStartTime: " + this.eXM + " ,remuxEndTime: " + this.eXN + " , input bitrate:" + paramString1.videoBitrate, new Object[0]);
        this.eTz = new com.tencent.mm.media.e.a(this.filePath);
        if (this.eTz.eWh)
        {
          paramString1 = com.tencent.mm.media.i.c.faj;
          com.tencent.mm.media.i.c.VF();
        }
        paramInt1 = this.eYk - this.eXJ;
        if ((1 <= paramInt1) && (16 > paramInt1))
          break label1040;
        paramInt1 = this.eYl - this.eXK;
        if (1 <= paramInt1)
          break label1034;
        bool = false;
        label871: ab.i(this.TAG, "needCheckCropRect:".concat(String.valueOf(bool)));
        if (!bool)
          break label1143;
        paramString1 = com.tencent.mm.media.i.c.faj;
        com.tencent.mm.media.i.c.VG();
        paramString2 = new d(this.eTz);
        paramString3 = (m)new e.1(this);
        paramString2.exT = paramString3;
      }
      while (true)
      {
        try
        {
          if (com.tencent.mm.compatible.util.d.iW(23))
          {
            paramString1 = new com/tencent/mm/media/c/f;
            paramLong1 = paramString2.eXD.getDuration() / 1000;
            localObject = paramString2.eXD;
            paramb = new com/tencent/mm/media/g/d$c;
            paramb.<init>(paramString2);
            paramString1.<init>(0L, paramLong1, (com.tencent.mm.media.e.a)localObject, null, (a.f.a.b)paramb);
            paramString1 = (com.tencent.mm.media.c.b)paramString1;
            paramString2.eXA = paramString1;
            com.tencent.mm.ab.b.b((a.f.a.a)new d.e(paramString2), "MediaCodecCheckVideoCropRect_decode");
            AppMethodBeat.o(13062);
            return;
            this.eXN = paramLong2;
            break;
            label1034: if (16 <= paramInt1)
              break label868;
            label1040: bool = true;
            break label871;
          }
          Object localObject = new com/tencent/mm/media/c/e;
          paramLong1 = paramString2.eXD.getDuration() / 1000;
          paramb = paramString2.eXD;
          paramString1 = new com/tencent/mm/media/g/d$d;
          paramString1.<init>(paramString2);
          ((com.tencent.mm.media.c.e)localObject).<init>(0L, paramLong1, paramb, null, (a.f.a.b)paramString1);
          paramString1 = (com.tencent.mm.media.c.b)localObject;
          continue;
        }
        catch (Exception paramString1)
        {
          ab.printErrStackTrace(paramString2.TAG, (Throwable)paramString1, "start check init decoder error", new Object[0]);
          paramString1 = com.tencent.mm.media.i.c.faj;
          com.tencent.mm.media.i.c.VZ();
          paramString3.m(null, paramString2);
          continue;
        }
        label1143: a(new com.tencent.mm.media.h.c(this.eXJ, this.eXK, this.eYk, this.eYl, 0, 0, 48));
        AppMethodBeat.o(13062);
      }
    }
    catch (Exception paramString2)
    {
      break label453;
    }
  }

  private final void a(com.tencent.mm.media.h.c paramc)
  {
    AppMethodBeat.i(13057);
    Object localObject1 = this.filePath;
    Object localObject2 = i.eYK;
    localObject2 = i.a.lY((String)localObject1);
    if (localObject1 == null)
      ab.e(this.TAG, "copyVideoFile invalid parameters, can not be null");
    while (true)
    {
      localObject1 = i.eYK;
      this.eXT = new com.tencent.mm.media.e.a(i.a.lY(this.filePath));
      localObject1 = this.TAG;
      localObject2 = new StringBuilder("useAudioRecord:false, cpVideoFile:");
      Object localObject3 = i.eYK;
      localObject2 = ((StringBuilder)localObject2).append(i.a.lY(this.filePath)).append(", audioCpFile:");
      localObject3 = i.eYK;
      ab.i((String)localObject1, i.a.lX(this.filePath));
      localObject1 = this.eXT;
      if (localObject1 != null)
      {
        this.eXY = new f(this.eXR, (com.tencent.mm.media.e.a)localObject1, this.eYj, this.eTb, this.eYo);
        if (com.tencent.mm.vfs.e.ct(this.eYi))
        {
          localObject1 = this.eYi;
          if (localObject1 == null)
            j.dWJ();
          localObject1 = new com.tencent.mm.media.e.a((String)localObject1);
          if (((com.tencent.mm.media.e.a)localObject1).eWh)
          {
            localObject2 = com.tencent.mm.media.i.c.faj;
            com.tencent.mm.media.i.c.VJ();
          }
          this.eXS = ((com.tencent.mm.media.e.a)localObject1);
        }
      }
      localObject1 = this.eXY;
      if (localObject1 != null)
        ((f)localObject1).eXL = this.eXL;
      try
      {
        int i;
        if (this.eYp > 0)
        {
          i = Math.min(this.eYp, this.videoFps);
          label242: localObject1 = new com/tencent/mm/media/b/c;
          ((com.tencent.mm.media.b.c)localObject1).<init>();
          ((com.tencent.mm.media.b.c)localObject1).bitrate = this.eYm;
          ((com.tencent.mm.media.b.c)localObject1).eTk = i;
          ((com.tencent.mm.media.b.c)localObject1).eTj = this.eYl;
          ((com.tencent.mm.media.b.c)localObject1).eTi = this.eYk;
          localObject2 = new com/tencent/mm/media/g/e$i;
          ((e.i)localObject2).<init>(this);
          localObject2 = (m)localObject2;
          localObject3 = new com/tencent/mm/media/g/e$j;
          ((e.j)localObject3).<init>(this);
          localObject3 = (a.f.a.a)localObject3;
        }
        try
        {
          Object localObject4;
          Object localObject5;
          if (com.tencent.mm.compatible.util.d.iW(23))
          {
            localObject4 = new com/tencent/mm/media/d/f;
            localObject5 = new com/tencent/mm/media/g/e$f;
            ((e.f)localObject5).<init>((m)localObject2, (a.f.a.a)localObject3);
            ((com.tencent.mm.media.d.f)localObject4).<init>((com.tencent.mm.media.b.c)localObject1, (a.f.a.b)localObject5);
          }
          for (localObject1 = (com.tencent.mm.media.d.b)localObject4; ; localObject1 = (com.tencent.mm.media.d.b)localObject4)
          {
            this.eXO = ((com.tencent.mm.media.d.b)localObject1);
            localObject1 = new com/tencent/mm/media/g/a;
            ((a)localObject1).<init>((com.tencent.mm.media.h.a)paramc);
            this.eXQ = ((a)localObject1);
            paramc = this.eXQ;
            if (paramc != null)
            {
              localObject1 = new com/tencent/mm/media/g/e$h;
              ((e.h)localObject1).<init>(this);
              paramc.eXd = ((a.f.a.b)localObject1);
            }
            if (((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lJg, 0) != 0)
              break label871;
            bool = true;
            this.eYh = bool;
            paramc = this.TAG;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("remuxImpl, use useRequestDraw:");
            ab.i(paramc, this.eYh);
            if (bp.dpL())
            {
              ab.i(this.TAG, "in debug environment, set useRequestDraw to false");
              this.eYh = false;
            }
            localObject1 = this.eXO;
            if (localObject1 == null)
              break label892;
            paramc = this.eXQ;
            if (paramc == null)
              break label883;
            localObject1 = ((com.tencent.mm.media.d.b)localObject1).getInputSurface();
            localObject2 = new com/tencent/mm/media/g/e$e;
            ((e)localObject2).<init>(this);
            localObject2 = (a.f.a.b)localObject2;
            j.p(localObject1, "surface");
            paramc.aOO = ((Surface)localObject1);
            if (((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lJg, 0) != 1)
              break label877;
            bool = true;
            paramc.eXj = bool;
            localObject3 = paramc.TAG;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ab.i((String)localObject3, paramc.hashCode() + " initForRemuxer, surface:" + localObject1 + ", callback:false, drawInOnFrameAvailable:" + paramc.eXj);
            if (bp.dpL())
            {
              ab.i(paramc.TAG, "in debug environment, set drawInOnFrameAvailable to true");
              paramc.eXj = true;
            }
            localObject3 = new com/tencent/mm/media/g/a$b;
            ((a.b)localObject3).<init>(paramc, (Surface)localObject1, (a.f.a.b)localObject2);
            paramc.b((a.f.a.a)localObject3);
            AppMethodBeat.o(13057);
            return;
            if (com.tencent.mm.vfs.e.ct((String)localObject2))
              com.tencent.mm.vfs.e.deleteFile((String)localObject2);
            ab.i(this.TAG, "copyVideoFile from %s, to %s", new Object[] { localObject1, localObject2 });
            long l1 = bo.yz();
            long l2 = com.tencent.mm.vfs.e.y((String)localObject1, (String)localObject2);
            ab.i(this.TAG, "copy video file cost " + bo.az(l1));
            if (l2 > 0L)
              break;
            localObject1 = com.tencent.mm.media.i.c.faj;
            com.tencent.mm.media.i.c.VI();
            break;
            i = this.videoFps;
            break label242;
            localObject4 = new com/tencent/mm/media/d/e;
            localObject5 = new com/tencent/mm/media/g/e$g;
            ((e.g)localObject5).<init>((m)localObject2, (a.f.a.a)localObject3);
            ((com.tencent.mm.media.d.e)localObject4).<init>((com.tencent.mm.media.b.c)localObject1, (a.f.a.b)localObject5);
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.printErrStackTrace(this.TAG, (Throwable)localException, "create encoder error", new Object[0]);
            com.tencent.mm.media.i.c localc = com.tencent.mm.media.i.c.faj;
            com.tencent.mm.media.i.c.VK();
            cr(false);
          }
        }
      }
      catch (Exception paramc)
      {
        while (true)
        {
          ab.printErrStackTrace(this.TAG, (Throwable)paramc, "remux impl error", new Object[0]);
          AppMethodBeat.o(13057);
          continue;
          label871: boolean bool = false;
          continue;
          label877: bool = false;
          continue;
          label883: AppMethodBeat.o(13057);
          continue;
          label892: AppMethodBeat.o(13057);
        }
      }
    }
  }

  // ERROR //
  private final void cq(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: sipush 13060
    //   5: invokestatic 172	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 223	com/tencent/mm/media/g/e:TAG	Ljava/lang/String;
    //   12: astore_2
    //   13: new 252	java/lang/StringBuilder
    //   16: astore_3
    //   17: aload_3
    //   18: ldc_w 777
    //   21: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   24: aload_2
    //   25: aload_3
    //   26: iload_1
    //   27: invokevirtual 687	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   30: ldc_w 779
    //   33: invokevirtual 259	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: aload_0
    //   37: getfield 781	com/tencent/mm/media/g/e:eYd	Z
    //   40: invokevirtual 687	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   43: ldc_w 783
    //   46: invokevirtual 259	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: aload_0
    //   50: getfield 785	com/tencent/mm/media/g/e:eYc	Z
    //   53: invokevirtual 687	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   56: ldc_w 787
    //   59: invokevirtual 259	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: aload_0
    //   63: getfield 789	com/tencent/mm/media/g/e:eYb	Z
    //   66: invokevirtual 687	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   69: invokevirtual 278	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   72: invokestatic 312	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   75: iload_1
    //   76: ifeq +320 -> 396
    //   79: aload_0
    //   80: iconst_1
    //   81: putfield 785	com/tencent/mm/media/g/e:eYc	Z
    //   84: aload_0
    //   85: getfield 781	com/tencent/mm/media/g/e:eYd	Z
    //   88: ifeq +322 -> 410
    //   91: aload_0
    //   92: getfield 785	com/tencent/mm/media/g/e:eYc	Z
    //   95: ifeq +315 -> 410
    //   98: aload_0
    //   99: getfield 789	com/tencent/mm/media/g/e:eYb	Z
    //   102: ifne +308 -> 410
    //   105: aload_0
    //   106: getfield 657	com/tencent/mm/media/g/e:eXQ	Lcom/tencent/mm/media/g/a;
    //   109: astore_3
    //   110: aload_3
    //   111: ifnull +7 -> 118
    //   114: aload_3
    //   115: invokevirtual 790	com/tencent/mm/media/g/a:release	()V
    //   118: aload_0
    //   119: getfield 239	com/tencent/mm/media/g/e:eYa	Lcom/tencent/mm/media/i/a;
    //   122: invokevirtual 793	com/tencent/mm/media/i/a:SW	()V
    //   125: aload_0
    //   126: iconst_1
    //   127: putfield 789	com/tencent/mm/media/g/e:eYb	Z
    //   130: getstatic 577	com/tencent/mm/media/g/i:eYK	Lcom/tencent/mm/media/g/i$a;
    //   133: astore_3
    //   134: aload_0
    //   135: getfield 201	com/tencent/mm/media/g/e:filePath	Ljava/lang/String;
    //   138: invokestatic 593	com/tencent/mm/media/g/i$a:lX	(Ljava/lang/String;)Ljava/lang/String;
    //   141: invokestatic 734	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   144: pop
    //   145: getstatic 577	com/tencent/mm/media/g/i:eYK	Lcom/tencent/mm/media/g/i$a;
    //   148: astore_3
    //   149: aload_0
    //   150: getfield 201	com/tencent/mm/media/g/e:filePath	Ljava/lang/String;
    //   153: invokestatic 582	com/tencent/mm/media/g/i$a:lY	(Ljava/lang/String;)Ljava/lang/String;
    //   156: invokestatic 734	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   159: pop
    //   160: aload_0
    //   161: getfield 432	com/tencent/mm/media/g/e:eTz	Lcom/tencent/mm/media/e/a;
    //   164: invokevirtual 794	com/tencent/mm/media/e/a:release	()V
    //   167: aload_0
    //   168: getfield 586	com/tencent/mm/media/g/e:eXT	Lcom/tencent/mm/media/e/a;
    //   171: astore_3
    //   172: aload_3
    //   173: ifnull +7 -> 180
    //   176: aload_3
    //   177: invokevirtual 794	com/tencent/mm/media/e/a:release	()V
    //   180: aload_0
    //   181: getfield 600	com/tencent/mm/media/g/e:eXY	Lcom/tencent/mm/media/g/f;
    //   184: astore_3
    //   185: aload_3
    //   186: ifnull +23 -> 209
    //   189: aload_3
    //   190: getfield 797	com/tencent/mm/media/g/f:eYG	La/f/a/b;
    //   193: astore_3
    //   194: aload_3
    //   195: ifnull +14 -> 209
    //   198: aload_3
    //   199: aload_0
    //   200: getfield 219	com/tencent/mm/media/g/e:eYq	La/f/a/b;
    //   203: invokeinterface 801 2 0
    //   208: pop
    //   209: aload_0
    //   210: getfield 803	com/tencent/mm/media/g/e:eXU	Lcom/tencent/mm/sdk/platformtools/al;
    //   213: astore_3
    //   214: aload_3
    //   215: ifnull +8 -> 223
    //   218: aload_3
    //   219: invokevirtual 806	com/tencent/mm/sdk/platformtools/al:quit	()Z
    //   222: pop
    //   223: aload_0
    //   224: getfield 808	com/tencent/mm/media/g/e:eXV	Lcom/tencent/mm/sdk/platformtools/al;
    //   227: astore_3
    //   228: aload_3
    //   229: ifnull +8 -> 237
    //   232: aload_3
    //   233: invokevirtual 806	com/tencent/mm/sdk/platformtools/al:quit	()Z
    //   236: pop
    //   237: aload_0
    //   238: getfield 810	com/tencent/mm/media/g/e:eXZ	J
    //   241: invokestatic 751	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   244: lstore 4
    //   246: aload_0
    //   247: getfield 223	com/tencent/mm/media/g/e:TAG	Ljava/lang/String;
    //   250: astore_3
    //   251: new 252	java/lang/StringBuilder
    //   254: astore_2
    //   255: aload_2
    //   256: ldc_w 812
    //   259: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   262: aload_3
    //   263: aload_2
    //   264: lload 4
    //   266: invokevirtual 406	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   269: ldc_w 814
    //   272: invokevirtual 259	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: aload_0
    //   276: getfield 775	com/tencent/mm/media/g/e:eYe	I
    //   279: invokevirtual 266	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   282: ldc_w 816
    //   285: invokevirtual 259	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: aload_0
    //   289: getfield 563	com/tencent/mm/media/g/e:eST	I
    //   292: invokevirtual 266	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   295: ldc_w 818
    //   298: invokevirtual 259	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   301: aload_0
    //   302: getfield 772	com/tencent/mm/media/g/e:eYf	I
    //   305: invokevirtual 266	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   308: invokevirtual 278	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   311: invokestatic 312	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   314: aload_0
    //   315: getfield 205	com/tencent/mm/media/g/e:eYj	Ljava/lang/String;
    //   318: invokestatic 336	com/tencent/mm/plugin/sight/base/d:WR	(Ljava/lang/String;)Lcom/tencent/mm/plugin/sight/base/a;
    //   321: astore_3
    //   322: aload_3
    //   323: ifnull +87 -> 410
    //   326: getstatic 290	com/tencent/mm/media/i/c:faj	Lcom/tencent/mm/media/i/c;
    //   329: astore_2
    //   330: aload_0
    //   331: getfield 203	com/tencent/mm/media/g/e:eTb	I
    //   334: lload 4
    //   336: invokestatic 822	com/tencent/mm/media/i/c:t	(IJ)V
    //   339: getstatic 290	com/tencent/mm/media/i/c:faj	Lcom/tencent/mm/media/i/c;
    //   342: astore_2
    //   343: aload_3
    //   344: getfield 421	com/tencent/mm/plugin/sight/base/a:videoBitrate	I
    //   347: i2l
    //   348: aload_3
    //   349: getfield 351	com/tencent/mm/plugin/sight/base/a:eTk	I
    //   352: i2l
    //   353: aload_0
    //   354: getfield 272	com/tencent/mm/media/g/e:videoFps	I
    //   357: i2l
    //   358: invokestatic 826	com/tencent/mm/media/i/c:d	(JJJ)V
    //   361: aload_0
    //   362: getfield 775	com/tencent/mm/media/g/e:eYe	I
    //   365: i2f
    //   366: aload_0
    //   367: getfield 563	com/tencent/mm/media/g/e:eST	I
    //   370: i2f
    //   371: fdiv
    //   372: f2d
    //   373: ldc2_w 827
    //   376: dcmpl
    //   377: iflt +33 -> 410
    //   380: getstatic 290	com/tencent/mm/media/i/c:faj	Lcom/tencent/mm/media/i/c;
    //   383: astore_3
    //   384: invokestatic 831	com/tencent/mm/media/i/c:VT	()V
    //   387: sipush 13060
    //   390: invokestatic 183	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   393: aload_0
    //   394: monitorexit
    //   395: return
    //   396: aload_0
    //   397: iconst_1
    //   398: putfield 781	com/tencent/mm/media/g/e:eYd	Z
    //   401: goto -317 -> 84
    //   404: astore_3
    //   405: aload_0
    //   406: monitorexit
    //   407: aload_3
    //   408: athrow
    //   409: astore_3
    //   410: sipush 13060
    //   413: invokestatic 183	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   416: goto -23 -> 393
    //   419: astore_3
    //   420: goto -260 -> 160
    //
    // Exception table:
    //   from	to	target	type
    //   2	75	404	finally
    //   79	84	404	finally
    //   84	110	404	finally
    //   114	118	404	finally
    //   118	130	404	finally
    //   130	160	404	finally
    //   160	172	404	finally
    //   176	180	404	finally
    //   180	185	404	finally
    //   189	194	404	finally
    //   198	209	404	finally
    //   209	214	404	finally
    //   218	223	404	finally
    //   223	228	404	finally
    //   232	237	404	finally
    //   237	314	404	finally
    //   314	322	404	finally
    //   326	387	404	finally
    //   387	393	404	finally
    //   396	401	404	finally
    //   410	416	404	finally
    //   314	322	409	java/lang/Exception
    //   326	387	409	java/lang/Exception
    //   130	160	419	java/lang/Exception
  }

  private final void cr(boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(13061);
        ab.i(this.TAG, "onDecoderEncoderFailed, isDecoder:".concat(String.valueOf(paramBoolean)));
        if (!this.eYb)
        {
          Object localObject1 = this.eXQ;
          if (localObject1 != null)
            ((a)localObject1).release();
          this.eYa.SW();
          this.eYb = true;
          try
          {
            localObject1 = i.eYK;
            com.tencent.mm.vfs.e.deleteFile(i.a.lX(this.filePath));
            localObject1 = i.eYK;
            com.tencent.mm.vfs.e.deleteFile(i.a.lY(this.filePath));
            this.eTz.release();
            localObject1 = this.eXT;
            if (localObject1 != null)
              ((com.tencent.mm.media.e.a)localObject1).release();
            localObject1 = this.eXU;
            if (localObject1 != null)
              ((al)localObject1).quit();
            localObject1 = this.eXV;
            if (localObject1 != null)
              ((al)localObject1).quit();
            com.tencent.mm.vfs.e.deleteFile(this.eYj);
            long l = bo.az(this.eXZ);
            ab.i(this.TAG, "onDecoderEncoderFailed, finish, costTime:".concat(String.valueOf(l)));
            localObject1 = this.eYq;
            if (localObject1 != null)
            {
              ((a.f.a.b)localObject1).am(null);
              AppMethodBeat.o(13061);
              return;
            }
          }
          catch (Exception localException)
          {
            String str = this.TAG;
            Throwable localThrowable = (Throwable)localException;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("onDecoderEncoderFailed error:");
            ab.printErrStackTrace(str, localThrowable, localException.getMessage(), new Object[0]);
            continue;
          }
        }
      }
      finally
      {
      }
      AppMethodBeat.o(13061);
    }
  }

  public final int Va()
  {
    AppMethodBeat.i(13059);
    ab.i(this.TAG, "start remux, initFinish:" + this.eXW);
    this.eXZ = bo.yz();
    if ((this.eXi != null) && (this.eXL > 0))
      this.eXi = com.tencent.mm.sdk.platformtools.d.b(this.eXi, -this.eXL);
    this.eYa.eOm.reset();
    if (this.eXW)
    {
      al localal = this.eXU;
      if (localal != null)
        localal.quit();
      this.eXU = com.tencent.mm.ab.b.b((a.f.a.a)new e.c(this), "MediaCodecRemux_audioMix");
      localal = this.eXV;
      if (localal != null)
        localal.quit();
      if (this.eXA != null)
        this.eXV = com.tencent.mm.ab.b.b((a.f.a.a)new e.d(this), "MediaCodecRemux_videoMix");
    }
    while (true)
    {
      AppMethodBeat.o(13059);
      return 0;
      this.eXX = true;
    }
  }

  public final void r(Bitmap paramBitmap)
  {
    AppMethodBeat.i(13058);
    j.p(paramBitmap, "bitmap");
    this.eXi = paramBitmap;
    a locala = this.eXQ;
    int i;
    if (locala != null)
    {
      String str = locala.TAG;
      StringBuilder localStringBuilder = new StringBuilder("setDrawBlendBitmap:");
      if (paramBitmap != null)
      {
        i = paramBitmap.hashCode();
        ab.i(str, i);
        locala.eXi = paramBitmap;
        AppMethodBeat.o(13058);
      }
    }
    while (true)
    {
      return;
      i = 0;
      break;
      AppMethodBeat.o(13058);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "success", "", "invoke", "com/tencent/mm/media/remuxer/MediaCodecRemuxer$remuxImpl$5$1"})
  static final class e extends k
    implements a.f.a.b<Boolean, y>
  {
    e(e parame)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.g.e
 * JD-Core Version:    0.6.2
 */