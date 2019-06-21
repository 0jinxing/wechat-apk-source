package com.tencent.mm.plugin.collect.model;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.bx;
import com.tencent.mm.g.b.a.bf;
import com.tencent.mm.plugin.collect.model.voice.a.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.pa;
import com.tencent.mm.protocal.protobuf.pj;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class g extends c<bx>
  implements f, a.c
{
  private static final String kBK;
  private static final com.tencent.mm.bt.b kBL;
  private boolean isPlaying;
  private MediaPlayer kBM;
  private MediaPlayer kBN;
  public ConcurrentLinkedQueue<b> kBO;
  private int kBP;
  private int kBQ;
  private long kBR;
  private WeakReference<ArrayList<String>> kBS;
  private bf kBT;

  static
  {
    AppMethodBeat.i(40966);
    kBK = com.tencent.mm.compatible.util.e.eSn + "wallet/voice/";
    kBL = com.tencent.mm.bt.b.akB("元");
    AppMethodBeat.o(40966);
  }

  public g()
  {
    AppMethodBeat.i(40947);
    this.isPlaying = false;
    this.xxI = bx.class.getName().hashCode();
    AppMethodBeat.o(40947);
  }

  private boolean Ia(String paramString)
  {
    while (true)
    {
      List localList;
      try
      {
        AppMethodBeat.i(40949);
        boolean bool;
        if (bo.isNullOrNil(paramString))
        {
          ab.w("MicroMsg.F2fRcvVoiceListener", "illegal no: %s, not do play", new Object[] { paramString });
          AppMethodBeat.o(40949);
          bool = true;
          return bool;
        }
        localList = bgA();
        Iterator localIterator = bgA().iterator();
        if (localIterator.hasNext())
        {
          if (!((String)localIterator.next()).equals(paramString))
            continue;
          ab.i("MicroMsg.F2fRcvVoiceListener", "has played tradeno: %s", new Object[] { paramString });
          AppMethodBeat.o(40949);
          bool = true;
          continue;
        }
        localList.add(paramString);
        if (localList.size() > 10)
        {
          ab.i("MicroMsg.F2fRcvVoiceListener", "over max size, do remove");
          int i = localList.size();
          paramString = localList.subList(i - 10, i);
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUT, bo.c(paramString, ","));
          AppMethodBeat.o(40949);
          bool = false;
          continue;
        }
      }
      finally
      {
      }
      paramString = localList;
    }
  }

  private static int Ib(String paramString)
  {
    AppMethodBeat.i(40958);
    int i = 0;
    if (paramString.equals("wx_f2f"))
      i = 1;
    while (true)
    {
      AppMethodBeat.o(40958);
      return i;
      if (paramString.equals("wx_md"))
        i = 2;
    }
  }

  private void a(int paramInt1, String paramString1, int paramInt2, String paramString2, int paramInt3, String paramString3, int paramInt4)
  {
    AppMethodBeat.i(40959);
    this.kBT = new bf();
    this.kBT.cVR = paramInt1;
    this.kBT.fV(paramString1);
    if (!bo.gW(paramInt4, 0))
      this.kBT.dbV = paramInt4;
    this.kBT.dbX = paramInt2;
    this.kBT.fW(paramString2);
    this.kBT.dca = paramInt3;
    if (bo.gW(paramInt1, 6))
      this.kBT.fX(paramString3);
    this.kBT.ajK();
    AppMethodBeat.o(40959);
  }

  private void a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, String paramString, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(40956);
    Object localObject = new com.tencent.mm.vfs.b(kBK);
    if ((!((com.tencent.mm.vfs.b)localObject).exists()) && (!((com.tencent.mm.vfs.b)localObject).mkdirs()))
    {
      ab.i("MicroMsg.F2fRcvVoiceListener", "mk dir fail");
      AppMethodBeat.o(40956);
    }
    while (true)
    {
      return;
      localObject = kBK + UUID.randomUUID().toString() + ".tmp";
      ab.i("MicroMsg.F2fRcvVoiceListener", "fileName: %s", new Object[] { localObject });
      if (t((String)localObject, paramArrayOfByte))
      {
        paramArrayOfByte = new b((byte)0);
        paramArrayOfByte.fileName = ((String)localObject);
        paramArrayOfByte.cAO = paramInt2;
        paramArrayOfByte.kBZ = paramInt1;
        paramArrayOfByte.cva = paramString;
        paramArrayOfByte.kCa = paramInt3;
        paramArrayOfByte.kCb = paramBoolean;
        this.kBO.add(paramArrayOfByte);
        bgC();
        AppMethodBeat.o(40956);
      }
      else
      {
        ab.i("MicroMsg.F2fRcvVoiceListener", "save file fail");
        AppMethodBeat.o(40956);
      }
    }
  }

  private void a(final b paramb)
  {
    AppMethodBeat.i(40953);
    this.kBN = g.a.a(paramb.fileName, new g.6(this, paramb), new MediaPlayer.OnErrorListener()
    {
      public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(40940);
        ab.e("MicroMsg.F2fRcvVoiceListener", "play money error: %s, %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        g.e(g.this);
        g.i(g.this);
        h.pYm.e(14404, new Object[] { Integer.valueOf(3), paramb.cva, Integer.valueOf(7), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramb.kBZ) });
        g.f(g.this);
        if (!g.g(g.this).isEmpty())
          g.h(g.this);
        while (true)
        {
          AppMethodBeat.o(40940);
          return false;
          g.bgE();
        }
      }
    });
    AppMethodBeat.o(40953);
  }

  private void ar(int paramInt, String paramString)
  {
    AppMethodBeat.i(40957);
    ab.i("MicroMsg.F2fRcvVoiceListener", "play default sound only");
    b localb = new b((byte)0);
    localb.kBZ = paramInt;
    localb.cva = paramString;
    this.kBO.add(localb);
    bgC();
    AppMethodBeat.o(40957);
  }

  private List<String> bgA()
  {
    AppMethodBeat.i(40948);
    if ((this.kBS == null) || (this.kBS.get() == null))
    {
      ab.i("MicroMsg.F2fRcvVoiceListener", "refer is null");
      this.kBS = new WeakReference(new ArrayList(bo.hT((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUT, ""), ",")));
    }
    List localList = (List)this.kBS.get();
    AppMethodBeat.o(40948);
    return localList;
  }

  public static boolean bgB()
  {
    AppMethodBeat.i(40951);
    ab.i("MicroMsg.F2fRcvVoiceListener", "delete files");
    boolean bool = com.tencent.mm.vfs.e.N(kBK, true);
    AppMethodBeat.o(40951);
    return bool;
  }

  private void bgC()
  {
    while (true)
    {
      b localb;
      Object localObject1;
      boolean bool;
      Object localObject2;
      try
      {
        AppMethodBeat.i(40952);
        if (System.currentTimeMillis() - this.kBR > 10000L)
        {
          ab.i("MicroMsg.F2fRcvVoiceListener", "last has outdate: %s", new Object[] { Long.valueOf(this.kBR) });
          this.isPlaying = false;
        }
        if (this.isPlaying)
        {
          ab.i("MicroMsg.F2fRcvVoiceListener", "is playing, return");
          AppMethodBeat.o(40952);
          return;
        }
        this.isPlaying = true;
        this.kBR = System.currentTimeMillis();
        localb = (b)this.kBO.poll();
        localObject1 = com.tencent.mm.compatible.b.g.KK();
        i = ((com.tencent.mm.compatible.b.g)localObject1).getStreamMaxVolume(3);
        this.kBP = ((com.tencent.mm.compatible.b.g)localObject1).getStreamVolume(3);
        this.kBQ = Math.round(i * 0.5F);
        ab.i("MicroMsg.F2fRcvVoiceListener", "curVol: %s, maxVol: %s, minVol: %s", new Object[] { Integer.valueOf(this.kBP), Integer.valueOf(i), Integer.valueOf(this.kBQ) });
        if (Build.VERSION.SDK_INT < 23)
          break label638;
        bool = ((com.tencent.mm.compatible.b.g)localObject1).eoY.isStreamMute(3);
        ab.i("MicroMsg.F2fRcvVoiceListener", "isMute: %s", new Object[] { Boolean.valueOf(bool) });
        if ((this.kBP == 0) || (bool))
        {
          ab.i("MicroMsg.F2fRcvVoiceListener", "music channel is mute");
          if (localb != null)
          {
            i = localb.kBZ;
            localObject2 = h.pYm;
            if (localb == null)
              break label399;
            String str = localb.cva;
            ((h)localObject2).e(14404, new Object[] { Integer.valueOf(3), str, Integer.valueOf(5), "", Integer.valueOf(i) });
          }
        }
        else
        {
          if ((this.kBP > 0) && (this.kBP < this.kBQ) && (!bool))
            ((com.tencent.mm.compatible.b.g)localObject1).bR(3, this.kBQ);
          if (localb == null)
            break label624;
          ab.i("MicroMsg.F2fRcvVoiceListener", "holder.offLine = %s", new Object[] { Boolean.valueOf(localb.kCb) });
          if (!localb.kCb)
            break label424;
          if ((!this.isPlaying) || (this.kBN != null))
            break label407;
          a(localb);
          AppMethodBeat.o(40952);
          continue;
        }
      }
      finally
      {
      }
      int i = 1;
      continue;
      label399: Object localObject4 = "";
      continue;
      label407: ab.i("MicroMsg.F2fRcvVoiceListener", "has played");
      AppMethodBeat.o(40952);
      continue;
      label424: i = localb.kBZ;
      if (!bo.isNullOrNil(localb.fileName))
      {
        ab.i("MicroMsg.F2fRcvVoiceListener", "play prefix voice: %d", new Object[] { Integer.valueOf(i) });
        localObject4 = ah.getContext();
        localObject1 = new com/tencent/mm/plugin/collect/model/g$1;
        ((1)localObject1).<init>(this, localb);
        localObject2 = new com/tencent/mm/plugin/collect/model/g$2;
        ((g.2)localObject2).<init>(this, localb);
        this.kBM = g.a.a((Context)localObject4, (MediaPlayer.OnCompletionListener)localObject1, (MediaPlayer.OnErrorListener)localObject2);
        if (this.kBM != null)
        {
          i = this.kBM.getDuration();
          ab.i("MicroMsg.F2fRcvVoiceListener", "prefix duration: %s", new Object[] { Integer.valueOf(i) });
          localObject4 = new com/tencent/mm/plugin/collect/model/g$3;
          ((g.3)localObject4).<init>(this);
          al.n((Runnable)localObject4, i + 1000);
          AppMethodBeat.o(40952);
        }
      }
      else
      {
        localObject4 = ah.getContext();
        localObject1 = new com/tencent/mm/plugin/collect/model/g$4;
        ((g.4)localObject1).<init>(this, localb);
        localObject2 = new com/tencent/mm/plugin/collect/model/g$5;
        ((g.5)localObject2).<init>(this, localb);
        this.kBM = g.a.a((Context)localObject4, (MediaPlayer.OnCompletionListener)localObject1, (MediaPlayer.OnErrorListener)localObject2);
        h.pYm.a(699L, 2L, 1L, false);
        AppMethodBeat.o(40952);
        continue;
        label624: this.isPlaying = false;
        AppMethodBeat.o(40952);
        continue;
        label638: bool = false;
      }
    }
  }

  private static int bgD()
  {
    AppMethodBeat.i(40960);
    int i;
    if (com.tencent.mm.compatible.b.g.KK().KP())
    {
      i = 1;
      AppMethodBeat.o(40960);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(40960);
    }
  }

  private static boolean t(String paramString, byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(40950);
    com.tencent.mm.kernel.g.RQ();
    if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
    {
      ab.i("MicroMsg.F2fRcvVoiceListener", "sd card not available");
      AppMethodBeat.o(40950);
    }
    while (true)
    {
      return bool;
      if (com.tencent.mm.vfs.e.b(paramString, paramArrayOfByte, paramArrayOfByte.length) == 0)
      {
        bool = true;
        AppMethodBeat.o(40950);
      }
      else
      {
        AppMethodBeat.o(40950);
      }
    }
  }

  private static int tH(int paramInt)
  {
    int i = 2;
    if (paramInt == 1)
      i = 3;
    return i;
  }

  public final void a(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, String paramString4, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(40955);
    ab.i("MicroMsg.F2fRcvVoiceListener", "errorCode:%s outTradeNo:%s type:%s content:%s packId:%s overtimeFlag:%s", new Object[] { Integer.valueOf(paramInt1), paramString1, paramString2, paramString3, paramString4, Integer.valueOf(0) });
    int i = Ib(paramString2);
    if (paramInt1 < 0)
    {
      ar(i, paramString1);
      a(6, paramString1, i, paramString3, paramInt2, paramString4, 9);
      AppMethodBeat.o(40955);
    }
    while (true)
    {
      return;
      a(i, paramArrayOfByte, 1, paramString1, 0, true);
      a(5, paramString1, i, paramString3, paramInt2, paramString4, 0);
      AppMethodBeat.o(40955);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(40954);
    ab.i("MicroMsg.F2fRcvVoiceListener", "errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString + " scenetype:" + paramm.getType());
    if ((paramm instanceof i))
    {
      paramString = (i)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        ab.i("MicroMsg.F2fRcvVoiceListener", "overtime: %s retcode: %s", new Object[] { Integer.valueOf(paramString.kCf.vWk), Integer.valueOf(paramString.kCf.kCl) });
        if (paramString.kCf.vWk == 1)
        {
          ab.w("MicroMsg.F2fRcvVoiceListener", "skip over 10min: %s", new Object[] { Long.valueOf(paramString.cvc) });
          h.pYm.e(14404, new Object[] { Integer.valueOf(3), paramString.cva, Integer.valueOf(1), "", Integer.valueOf(1) });
          AppMethodBeat.o(40954);
        }
      }
    }
    while (true)
    {
      return;
      if (paramString.kCf.kCl == 0)
      {
        a(1, paramString.kCf.vWj.wR, paramString.kCf.vWi, paramString.cva, paramString.kCf.vWk, false);
        h.pYm.e(15763, new Object[] { paramString.cva, Integer.valueOf(1), Integer.valueOf(tH(paramString.cvd)), Long.valueOf(paramString.kCg), Integer.valueOf(bgD()) });
        AppMethodBeat.o(40954);
      }
      else if (paramString.kCf.kCl <= 100)
      {
        ab.i("MicroMsg.F2fRcvVoiceListener", "play default sound only");
        ar(1, paramString.cva);
        h.pYm.e(15763, new Object[] { paramString.cva, Integer.valueOf(2), Integer.valueOf(tH(paramString.cvd)), Long.valueOf(paramString.kCg), Integer.valueOf(bgD()) });
        AppMethodBeat.o(40954);
      }
      else
      {
        ab.w("MicroMsg.F2fRcvVoiceListener", "retcode > 100, don't play");
        h.pYm.e(14404, new Object[] { Integer.valueOf(3), paramString.cva, Integer.valueOf(2), "", Integer.valueOf(1) });
        h.pYm.e(15763, new Object[] { paramString.cva, Integer.valueOf(2), Integer.valueOf(tH(paramString.cvd)), Long.valueOf(paramString.kCg), Integer.valueOf(bgD()) });
        AppMethodBeat.o(40954);
        continue;
        ab.e("MicroMsg.F2fRcvVoiceListener", "net error: %s", new Object[] { paramString });
        ar(1, paramString.cva);
        h.pYm.e(15763, new Object[] { paramString.cva, Integer.valueOf(2), Integer.valueOf(tH(paramString.cvd)), Long.valueOf(paramString.kCg), Integer.valueOf(bgD()) });
        h.pYm.e(14404, new Object[] { Integer.valueOf(3), paramString.cva, Integer.valueOf(3), "", Integer.valueOf(1) });
        AppMethodBeat.o(40954);
        continue;
        if ((paramm instanceof n))
        {
          paramString = (n)paramm;
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            if (paramString.kCB.kCl == 0)
            {
              paramm = new com.tencent.mm.vfs.b(kBK);
              if ((!paramm.exists()) && (!paramm.mkdirs()))
              {
                ab.i("MicroMsg.F2fRcvVoiceListener", "mk dir fail");
                AppMethodBeat.o(40954);
              }
              else
              {
                String str = kBK + UUID.randomUUID().toString() + ".tmp";
                ab.i("MicroMsg.F2fRcvVoiceListener", "fileName: %s", new Object[] { str });
                if (t(str, paramString.kCB.vWj.wR))
                {
                  paramm = new b((byte)0);
                  paramm.fileName = str;
                  paramm.cAO = paramString.kCB.vWi;
                  paramm.kBZ = 2;
                  this.kBO.add(paramm);
                  bgC();
                  AppMethodBeat.o(40954);
                }
                else
                {
                  ab.i("MicroMsg.F2fRcvVoiceListener", "save file fail");
                  AppMethodBeat.o(40954);
                }
              }
            }
            else
            {
              h.pYm.e(14404, new Object[] { Integer.valueOf(3), paramString.cva, Integer.valueOf(2), "", Integer.valueOf(2) });
              AppMethodBeat.o(40954);
            }
          }
          else
          {
            ab.e("MicroMsg.F2fRcvVoiceListener", "net error: %s", new Object[] { paramString });
            h.pYm.e(14404, new Object[] { Integer.valueOf(3), paramString.cva, Integer.valueOf(3), "", Integer.valueOf(2) });
          }
        }
        else
        {
          AppMethodBeat.o(40954);
        }
      }
    }
  }

  final class b
  {
    int cAO;
    String cva;
    String fileName;
    int kBZ;
    int kCa = 0;
    boolean kCb = false;

    private b()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.g
 * JD-Core Version:    0.6.2
 */