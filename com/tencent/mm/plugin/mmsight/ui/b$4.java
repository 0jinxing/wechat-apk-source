package com.tencent.mm.plugin.mmsight.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.c.g;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.media.g.c;
import com.tencent.mm.media.g.c.a;
import com.tencent.mm.media.g.c.b;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.segment.m;
import com.tencent.mm.plugin.sight.base.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.p;

final class b$4
  implements Runnable
{
  b$4(b paramb, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55145);
    int i;
    int j;
    if (com.tencent.mm.bj.e.uD(b.g(this.oBV)))
    {
      ??? = null;
      if (??? == null)
        break label106;
      i = ((com.tencent.mm.plugin.sight.base.a)???).width;
      j = ((com.tencent.mm.plugin.sight.base.a)???).height;
      k = ((com.tencent.mm.plugin.sight.base.a)???).videoBitrate;
    }
    label106: Object localObject2;
    while (true)
    {
      if ((i > 0) && (j > 0) && (k > 0))
        break label172;
      ab.e("MicroMsg.MMSightVideoEditor", "doRemuxVideo, retrieve video metadata error, width: %s, height: %s, bitrate: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      AppMethodBeat.o(55145);
      return;
      ??? = d.WR(b.g(this.oBV));
      break;
      localObject2 = new MediaMetadataRetriever();
      ((MediaMetadataRetriever)localObject2).setDataSource(b.g(this.oBV));
      i = bo.getInt(((MediaMetadataRetriever)localObject2).extractMetadata(18), -1);
      j = bo.getInt(((MediaMetadataRetriever)localObject2).extractMetadata(19), -1);
      k = bo.getInt(((MediaMetadataRetriever)localObject2).extractMetadata(20), -1);
      ((MediaMetadataRetriever)localObject2).release();
    }
    label172: if ((j >= 2000) || (i >= 2000))
    {
      b.y(this.oBV);
      ab.i("MicroMsg.MMSightVideoEditor", "video size too large, change to mediacodec remuxer");
    }
    int m = k;
    int n;
    if (b.b(this.oBV))
    {
      m = k;
      if (b.l(this.oBV) != null)
      {
        n = k;
        if (k > b.l(this.oBV).videoBitrate)
          n = b.l(this.oBV).videoBitrate;
        localObject2 = b.C(i, j, b.l(this.oBV).width, b.l(this.oBV).height);
        m = n;
        if (localObject2 != null)
        {
          i = ((Point)localObject2).x;
          j = ((Point)localObject2).y;
        }
      }
    }
    for (int k = n; ; k = m)
    {
      while (true)
      {
        localObject2 = b.g(this.oBV) + "remuxOutput.mp4";
        if (!bo.isNullOrNil(b.z(this.oBV)))
          localObject2 = b.z(this.oBV);
        if ((com.tencent.mm.bj.e.uD(b.g(this.oBV))) || (b.A(this.oBV) == 1))
        {
          ab.i("MicroMsg.MMSightVideoEditor", "h265 format, try mediaCodec remuxer or is suggestRemuxerType is mediacodec");
          ??? = new c.b()
          {
            public final void lW(String paramAnonymousString)
            {
              AppMethodBeat.i(55140);
              ab.i("MicroMsg.MMSightVideoEditor", "mediaCodecRemuxer remux onFinish");
              synchronized (b.bQy())
              {
                try
                {
                  b.bQy().notifyAll();
                  if (bo.isNullOrNil(paramAnonymousString))
                  {
                    paramAnonymousString = new com/tencent/mm/plugin/mmsight/ui/b$4$1$1;
                    paramAnonymousString.<init>(this);
                    al.d(paramAnonymousString);
                    m.yW(b.B(b.4.this.oBV).getType());
                    AppMethodBeat.o(55140);
                    return;
                  }
                }
                catch (Exception localException)
                {
                  while (true)
                    ab.printErrStackTrace("MicroMsg.MMSightVideoEditor", localException, "wait mediaCodecRemuxer error", new Object[0]);
                }
              }
              if (bo.isNullOrNil(b.z(b.4.this.oBV)))
                com.tencent.mm.vfs.e.aQ(this.oBY, paramAnonymousString);
              long l = bo.az(this.mRw);
              ab.i("MicroMsg.MMSightVideoEditor", "doRemuxVideo used %sms", new Object[] { Long.valueOf(l) });
              m.S(1, l);
              b.a(b.4.this.oBV, g.cz(paramAnonymousString));
              paramAnonymousString = b.C(b.4.this.oBV);
              boolean bool;
              if ((b.s(b.4.this.oBV) >= 0) && (b.c(b.4.this.oBV) > 0))
              {
                bool = true;
                label208: paramAnonymousString.oxB = bool;
                b.C(b.4.this.oBV).oxy = (b.c(b.4.this.oBV) - b.s(b.4.this.oBV));
                paramAnonymousString = b.C(b.4.this.oBV);
                if (this.oBZ != null)
                  break label304;
              }
              label304: for (int i = 0; ; i = this.oBZ.eWK)
              {
                paramAnonymousString.oxx = i;
                paramAnonymousString = new com/tencent/mm/plugin/mmsight/ui/b$4$1$2;
                paramAnonymousString.<init>(this);
                al.d(paramAnonymousString);
                AppMethodBeat.o(55140);
                break;
                bool = false;
                break label208;
              }
            }
          };
          if ((b.s(this.oBV) >= 0) && (b.c(this.oBV) > 0))
            b.a(this.oBV, c.eXz.a(b.g(this.oBV), (String)localObject2, i, j, k, b.l(this.oBV).fps, b.s(this.oBV), b.c(this.oBV), (c.b)???));
          while (true)
          {
            ab.i("MicroMsg.MMSightVideoEditor", "create mediaCodecVideoRemuxer: %s", new Object[] { b.D(this.oBV) });
            if (b.D(this.oBV) != null)
              break label576;
            al.d(new Runnable()
            {
              public final void run()
              {
                AppMethodBeat.i(55141);
                if (b.v(b.4.this.oBV) != null)
                  b.v(b.4.this.oBV).dismiss();
                if (b.a(b.4.this.oBV) != null)
                  b.a(b.4.this.oBV).onError();
                AppMethodBeat.o(55141);
              }
            });
            AppMethodBeat.o(55145);
            break;
            b.a(this.oBV, c.eXz.a(b.g(this.oBV), (String)localObject2, i, j, k, b.l(this.oBV).fps, (c.b)???));
          }
          label576: if (this.val$bitmap != null)
            b.D(this.oBV).r(this.val$bitmap);
          b.D(this.oBV).Va();
          synchronized (b.bQy())
          {
            try
            {
              b.bQy().wait();
              AppMethodBeat.o(55145);
            }
            catch (Exception localException)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.MMSightVideoEditor", localException, "wait mediaCodecRemux error", new Object[0]);
            }
          }
        }
      }
      if ((b.s(this.oBV) >= 0) && (b.c(this.oBV) > 0))
        if ((b.A(this.oBV) != -1) && ((b.A(this.oBV) == 1) || (b.A(this.oBV) == 2)))
          b.a(this.oBV, com.tencent.mm.plugin.mmsight.api.a.osX.a(b.A(this.oBV), b.g(this.oBV), str, i, j, k, b.l(this.oBV).fps, b.s(this.oBV), b.c(this.oBV)));
      while (true)
      {
        ab.i("MicroMsg.MMSightVideoEditor", "created remuxer, type: %s, remuxer: %s", new Object[] { Integer.valueOf(b.A(this.oBV)), b.B(this.oBV) });
        if (b.B(this.oBV) != null)
          break label1021;
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(55142);
            if (b.v(b.4.this.oBV) != null)
              b.v(b.4.this.oBV).dismiss();
            if (b.a(b.4.this.oBV) != null)
              b.a(b.4.this.oBV).onError();
            AppMethodBeat.o(55142);
          }
        });
        AppMethodBeat.o(55145);
        break;
        b.a(this.oBV, com.tencent.mm.plugin.mmsight.api.a.osX.a(b.g(this.oBV), str, i, j, k, b.l(this.oBV).fps, b.s(this.oBV), b.c(this.oBV)));
        continue;
        if ((b.A(this.oBV) != -1) && ((b.A(this.oBV) == 1) || (b.A(this.oBV) == 2)))
          b.a(this.oBV, com.tencent.mm.plugin.mmsight.api.a.osX.a(b.A(this.oBV), b.g(this.oBV), str, i, j, k, b.l(this.oBV).fps));
        else
          b.a(this.oBV, com.tencent.mm.plugin.mmsight.api.a.osX.b(b.g(this.oBV), str, i, j, k, b.l(this.oBV).fps));
      }
      label1021: m.yV(b.B(this.oBV).getType());
      long l = bo.yz();
      boolean bool = WXHardCoderJNI.hcEncodeVideoEnable;
      j = WXHardCoderJNI.hcEncodeVideoDelay;
      i = WXHardCoderJNI.hcEncodeVideoCPU;
      n = WXHardCoderJNI.hcEncodeVideoIO;
      if (WXHardCoderJNI.hcEncodeVideoThr);
      for (k = Process.myTid(); ; k = 0)
      {
        b.yZ(WXHardCoderJNI.startPerformance(bool, j, i, n, k, 30000, 603, WXHardCoderJNI.hcEncodeVideoAction, "MicroMsg.MMSightVideoEditor"));
        ab.i("MicroMsg.MMSightVideoEditor", "hardcoder summerPerformance startPerformance: %s", new Object[] { Integer.valueOf(b.bQz()) });
        if (this.val$bitmap != null)
          b.B(this.oBV).r(this.val$bitmap);
        k = b.B(this.oBV).Va();
        if (k >= 0)
          break label1211;
        ab.e("MicroMsg.MMSightVideoEditor", "remux failed, ret: %s", new Object[] { Integer.valueOf(k) });
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(55143);
            if (b.v(b.4.this.oBV) != null)
              b.v(b.4.this.oBV).dismiss();
            if (b.a(b.4.this.oBV) != null)
              b.a(b.4.this.oBV).onError();
            AppMethodBeat.o(55143);
          }
        });
        m.yW(b.B(this.oBV).getType());
        AppMethodBeat.o(55145);
        break;
      }
      label1211: if (bo.isNullOrNil(b.z(this.oBV)))
        com.tencent.mm.vfs.e.aQ(str, b.g(this.oBV));
      if (b.bQz() != 0)
      {
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcEncodeVideoEnable, b.bQz());
        ab.i("MicroMsg.MMSightVideoEditor", "hardcoder summerPerformance stopPerformace %s", new Object[] { Integer.valueOf(b.bQz()) });
        b.yZ(0);
      }
      l = bo.az(l);
      ab.i("MicroMsg.MMSightVideoEditor", "doRemuxVideo used %sms", new Object[] { Long.valueOf(l) });
      m.S(b.B(this.oBV).getType(), l);
      b.a(this.oBV, g.cz(b.g(this.oBV)));
      com.tencent.mm.plugin.mmsight.a.a.b localb = b.C(this.oBV);
      if ((b.s(this.oBV) >= 0) && (b.c(this.oBV) > 0))
      {
        bool = true;
        label1371: localb.oxB = bool;
        b.C(this.oBV).oxy = (b.c(this.oBV) - b.s(this.oBV));
        localb = b.C(this.oBV);
        if (??? != null)
          break label1451;
      }
      label1451: for (k = 0; ; k = ((com.tencent.mm.plugin.sight.base.a)???).eWK)
      {
        localb.oxx = k;
        al.d(new b.4.5(this));
        AppMethodBeat.o(55145);
        break;
        bool = false;
        break label1371;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.b.4
 * JD-Core Version:    0.6.2
 */