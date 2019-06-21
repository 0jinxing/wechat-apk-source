package com.tencent.mm.plugin.mmsight.segment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bj.e;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.h;

@TargetApi(16)
public class VideoCompressUI extends MMBaseActivity
{
  private static int ehv;
  private d ext;
  private VideoTransPara fYK;
  private ProgressDialog ozv;
  private VideoCompressUI.a ozw;
  private boolean ozx;
  private Runnable ozy;
  private String thumbPath;
  private String videoPath;

  public VideoCompressUI()
  {
    AppMethodBeat.i(3699);
    this.ext = new d(this);
    this.ozw = new VideoCompressUI.a(this, (byte)0);
    this.ozy = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(3697);
        label712: 
        while (true)
          try
          {
            VideoCompressUI.a(VideoCompressUI.this, VideoCompressUI.c(VideoCompressUI.this));
            localIntent = new android/content/Intent;
            localIntent.<init>();
            Point localPoint = VideoCompressUI.B(VideoCompressUI.d(VideoCompressUI.this).videoWidth, VideoCompressUI.d(VideoCompressUI.this).videoHeight, VideoCompressUI.a(VideoCompressUI.this).width, VideoCompressUI.a(VideoCompressUI.this).height);
            if ((VideoCompressUI.b(VideoCompressUI.this, VideoCompressUI.a(VideoCompressUI.this))) || (localPoint != null))
            {
              if (localPoint != null)
                break label712;
              localPoint = new android/graphics/Point;
              localPoint.<init>(VideoCompressUI.d(VideoCompressUI.this).videoWidth, VideoCompressUI.d(VideoCompressUI.this).videoHeight);
              VideoCompressUI.c(VideoCompressUI.this);
              String str = VideoCompressUI.bQo();
              boolean bool1;
              if ((VideoCompressUI.d(VideoCompressUI.this).videoWidth >= 2000) || (VideoCompressUI.d(VideoCompressUI.this).videoHeight >= 2000))
              {
                bool1 = true;
                ab.i("MicroMsg.VideoCompressUI", "need remux, inputVideoSize: [%s %s], out: %s, videoPath: %s, tmpPath: %s, ish265: %s, videoSizeTooLarge:%s", new Object[] { Integer.valueOf(VideoCompressUI.d(VideoCompressUI.this).videoWidth), Integer.valueOf(VideoCompressUI.d(VideoCompressUI.this).videoHeight), localPoint, VideoCompressUI.c(VideoCompressUI.this), str, Boolean.valueOf(VideoCompressUI.e(VideoCompressUI.this)), Boolean.valueOf(bool1) });
                boolean bool2 = WXHardCoderJNI.hcEncodeVideoEnable;
                int i = WXHardCoderJNI.hcEncodeVideoDelay;
                int j = WXHardCoderJNI.hcEncodeVideoCPU;
                int k = WXHardCoderJNI.hcEncodeVideoIO;
                if (WXHardCoderJNI.hcEncodeVideoThr)
                {
                  m = Process.myTid();
                  VideoCompressUI.yX(WXHardCoderJNI.startPerformance(bool2, i, j, k, m, 30000, 603, WXHardCoderJNI.hcEncodeVideoAction, "MicroMsg.VideoCompressUI"));
                  ab.i("MicroMsg.VideoCompressUI", "hardcoder summerPerformance startPerformance: %s", new Object[] { Integer.valueOf(VideoCompressUI.bQp()) });
                  if ((VideoCompressUI.e(VideoCompressUI.this)) || (bool1))
                    continue;
                  SightVideoJNI.remuxing(VideoCompressUI.c(VideoCompressUI.this), str, localPoint.x, localPoint.y, VideoCompressUI.a(VideoCompressUI.this).videoBitrate, VideoCompressUI.a(VideoCompressUI.this).fzV, 8, VideoCompressUI.a(VideoCompressUI.this).fzU, 25.0F, VideoCompressUI.a(VideoCompressUI.this).fps, null, 0, false);
                  if (VideoCompressUI.bQp() != 0)
                  {
                    WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcEncodeVideoEnable, VideoCompressUI.bQp());
                    ab.i("MicroMsg.VideoCompressUI", "hardcoder summerPerformance stopPerformace %s", new Object[] { Integer.valueOf(VideoCompressUI.bQp()) });
                    VideoCompressUI.yX(0);
                  }
                  localIntent.putExtra("K_SEGMENTVIDEOPATH", str);
                  localIntent.putExtra("KSEGMENTVIDEOTHUMBPATH", VideoCompressUI.a(VideoCompressUI.this, str, null));
                  VideoCompressUI.this.setResult(-1, localIntent);
                }
              }
              else
              {
                bool1 = false;
                continue;
              }
              int m = 0;
              continue;
              ab.i("MicroMsg.VideoCompressUI", "ish265, transfer to h264");
              VideoCompressUI.a(VideoCompressUI.this).width = localPoint.x;
              VideoCompressUI.a(VideoCompressUI.this).height = localPoint.y;
              e.a(VideoCompressUI.c(VideoCompressUI.this), str, VideoCompressUI.a(VideoCompressUI.this));
              continue;
            }
          }
          catch (Exception localException)
          {
            Intent localIntent;
            ab.printErrStackTrace("MicroMsg.VideoCompressUI", localException, "video compress failed e [%s]", new Object[] { localException.getMessage() });
            VideoCompressUI.this.finish();
            al.d(new VideoCompressUI.2.1(this));
            AppMethodBeat.o(3697);
            continue;
            ab.i("MicroMsg.VideoCompressUI", "no need remux, directly set result");
            localIntent.putExtra("K_SEGMENTVIDEOPATH", VideoCompressUI.c(VideoCompressUI.this));
            localIntent.putExtra("KSEGMENTVIDEOTHUMBPATH", VideoCompressUI.a(VideoCompressUI.this, VideoCompressUI.c(VideoCompressUI.this), VideoCompressUI.f(VideoCompressUI.this)));
          }
          finally
          {
            VideoCompressUI.this.finish();
            al.d(new VideoCompressUI.2.1(this));
            AppMethodBeat.o(3697);
          }
      }
    };
    AppMethodBeat.o(3699);
  }

  // ERROR //
  private String fe(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: sipush 3701
    //   3: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_2
    //   7: invokestatic 228	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   10: ifne +13 -> 23
    //   13: sipush 3701
    //   16: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: aload_2
    //   20: astore_1
    //   21: aload_1
    //   22: areturn
    //   23: new 347	android/content/Intent
    //   26: astore_3
    //   27: aload_3
    //   28: invokespecial 348	android/content/Intent:<init>	()V
    //   31: aload_3
    //   32: ldc_w 350
    //   35: aload_1
    //   36: invokestatic 353	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   39: invokevirtual 356	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   42: invokestatic 362	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   45: invokevirtual 366	android/content/Intent:setData	(Landroid/net/Uri;)Landroid/content/Intent;
    //   48: pop
    //   49: aload_0
    //   50: aload_3
    //   51: invokestatic 372	com/tencent/mm/compatible/j/a:j	(Landroid/content/Context;Landroid/content/Intent;)Lcom/tencent/mm/compatible/j/a$a;
    //   54: astore_3
    //   55: aload_2
    //   56: astore_1
    //   57: aload_3
    //   58: ifnull +128 -> 186
    //   61: aload_2
    //   62: astore_1
    //   63: aload_3
    //   64: getfield 378	com/tencent/mm/compatible/j/a$a:bitmap	Landroid/graphics/Bitmap;
    //   67: ifnull +119 -> 186
    //   70: new 74	java/lang/StringBuilder
    //   73: astore_1
    //   74: aload_1
    //   75: invokespecial 294	java/lang/StringBuilder:<init>	()V
    //   78: aload_1
    //   79: invokestatic 300	com/tencent/mm/plugin/mmsight/model/CaptureMMProxy:getInstance	()Lcom/tencent/mm/plugin/mmsight/model/CaptureMMProxy;
    //   82: invokevirtual 303	com/tencent/mm/plugin/mmsight/model/CaptureMMProxy:getAccVideoPath	()Ljava/lang/String;
    //   85: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: ldc_w 380
    //   91: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: astore 4
    //   99: aload 4
    //   101: invokestatic 310	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   104: ifeq +10 -> 114
    //   107: aload 4
    //   109: iconst_1
    //   110: invokestatic 314	com/tencent/mm/vfs/e:N	(Ljava/lang/String;Z)Z
    //   113: pop
    //   114: aload 4
    //   116: invokestatic 317	com/tencent/mm/vfs/e:tf	(Ljava/lang/String;)Z
    //   119: pop
    //   120: new 74	java/lang/StringBuilder
    //   123: astore_1
    //   124: aload_1
    //   125: invokespecial 294	java/lang/StringBuilder:<init>	()V
    //   128: aload_1
    //   129: aload 4
    //   131: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: ldc_w 382
    //   137: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: invokestatic 325	java/lang/System:currentTimeMillis	()J
    //   143: invokevirtual 328	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   146: ldc_w 384
    //   149: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   155: astore_1
    //   156: ldc 72
    //   158: ldc_w 386
    //   161: iconst_1
    //   162: anewarray 123	java/lang/Object
    //   165: dup
    //   166: iconst_0
    //   167: aload_1
    //   168: aastore
    //   169: invokestatic 132	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: aload_3
    //   173: getfield 378	com/tencent/mm/compatible/j/a$a:bitmap	Landroid/graphics/Bitmap;
    //   176: bipush 80
    //   178: getstatic 392	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   181: aload_1
    //   182: iconst_1
    //   183: invokestatic 397	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   186: sipush 3701
    //   189: invokestatic 58	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   192: goto -171 -> 21
    //   195: astore_3
    //   196: aload_2
    //   197: astore_1
    //   198: aload_3
    //   199: astore_2
    //   200: ldc 72
    //   202: aload_2
    //   203: ldc_w 399
    //   206: iconst_1
    //   207: anewarray 123	java/lang/Object
    //   210: dup
    //   211: iconst_0
    //   212: aload_2
    //   213: invokevirtual 279	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   216: aastore
    //   217: invokestatic 403	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   220: goto -34 -> 186
    //   223: astore_2
    //   224: goto -24 -> 200
    //
    // Exception table:
    //   from	to	target	type
    //   23	55	195	java/lang/Exception
    //   63	114	195	java/lang/Exception
    //   114	172	195	java/lang/Exception
    //   172	186	223	java/lang/Exception
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(3700);
    super.onCreate(paramBundle);
    setContentView(2130968794);
    paramBundle = getIntent();
    if ((paramBundle == null) || (bo.isNullOrNil(paramBundle.getStringExtra("K_SEGMENTVIDEOPATH"))))
    {
      setResult(0);
      finish();
      AppMethodBeat.o(3700);
    }
    while (true)
    {
      return;
      this.ozv = h.b(this, getString(2131297086), false, null);
      this.videoPath = paramBundle.getStringExtra("K_SEGMENTVIDEOPATH");
      this.thumbPath = paramBundle.getStringExtra("KSEGMENTVIDEOTHUMBPATH");
      CaptureMMProxy.createProxy(new CaptureMMProxy(this.ext));
      this.ext.connect(new VideoCompressUI.1(this));
      AppMethodBeat.o(3700);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(3702);
    super.onDestroy();
    if (this.ext != null)
      this.ext.release();
    AppMethodBeat.o(3702);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoCompressUI
 * JD-Core Version:    0.6.2
 */