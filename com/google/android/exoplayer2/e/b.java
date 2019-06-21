package com.google.android.exoplayer2.e;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.t;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.k;
import com.google.android.exoplayer2.source.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
public abstract class b extends com.google.android.exoplayer2.a
{
  private static final byte[] bea = v.aU("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
  private final com.google.android.exoplayer2.drm.b<com.google.android.exoplayer2.drm.d> aMJ;
  private Format aOv;
  private ByteBuffer[] aQJ;
  private int beA;
  private int beB;
  private boolean beC;
  private boolean beD;
  private boolean beE;
  private boolean beF;
  private boolean beG;
  private boolean beH;
  protected com.google.android.exoplayer2.b.d beI;
  private final c beb;
  private final boolean bec;
  private final com.google.android.exoplayer2.b.e bed;
  private final com.google.android.exoplayer2.b.e bee;
  private final k bef;
  private final List<Long> beg;
  private final MediaCodec.BufferInfo beh;
  private com.google.android.exoplayer2.drm.a<com.google.android.exoplayer2.drm.d> bei;
  private com.google.android.exoplayer2.drm.a<com.google.android.exoplayer2.drm.d> bej;
  protected MediaCodec bek;
  protected a bel;
  private int bem;
  private boolean ben;
  private boolean beo;
  private boolean bep;
  private boolean beq;
  private boolean ber;
  private boolean bes;
  private boolean bet;
  private boolean beu;
  private long bev;
  private int bew;
  private int bex;
  private boolean bey;
  private boolean bez;
  private ByteBuffer[] inputBuffers;

  public b(int paramInt, c paramc, com.google.android.exoplayer2.drm.b<com.google.android.exoplayer2.drm.d> paramb, boolean paramBoolean)
  {
    super(paramInt);
    if (v.SDK_INT >= 16);
    for (boolean bool = true; ; bool = false)
    {
      com.google.android.exoplayer2.i.a.checkState(bool);
      this.beb = ((c)com.google.android.exoplayer2.i.a.checkNotNull(paramc));
      this.aMJ = paramb;
      this.bec = paramBoolean;
      this.bed = new com.google.android.exoplayer2.b.e(0);
      this.bee = new com.google.android.exoplayer2.b.e(0);
      this.bef = new k();
      this.beg = new ArrayList();
      this.beh = new MediaCodec.BufferInfo();
      this.beA = 0;
      this.beB = 0;
      return;
    }
  }

  private void a(b.a parama)
  {
    throw com.google.android.exoplayer2.e.b(parama, this.index);
  }

  private boolean h(long paramLong1, long paramLong2)
  {
    if (this.bex < 0)
      if ((!this.ber) || (!this.beD));
    label221: label365: 
    while (true)
    {
      boolean bool;
      try
      {
        this.bex = this.bek.dequeueOutputBuffer(this.beh, 0L);
        if (this.bex < 0)
          break label365;
        if (!this.beu)
          break label121;
        this.beu = false;
        this.bek.releaseOutputBuffer(this.bex, false);
        this.bex = -1;
        bool = true;
        return bool;
      }
      catch (IllegalStateException localIllegalStateException1)
      {
        rI();
        if (this.beF)
          rF();
        bool = false;
        continue;
      }
      this.bex = this.bek.dequeueOutputBuffer(this.beh, 0L);
      continue;
      label121: if ((this.beh.flags & 0x4) != 0)
      {
        rI();
        this.bex = -1;
        bool = false;
      }
      else
      {
        Object localObject = this.aQJ[this.bex];
        if (localObject != null)
        {
          ((ByteBuffer)localObject).position(this.beh.offset);
          ((ByteBuffer)localObject).limit(this.beh.offset + this.beh.size);
        }
        long l = this.beh.presentationTimeUs;
        int i = this.beg.size();
        int j = 0;
        if (j < i)
          if (((Long)this.beg.get(j)).longValue() == l)
          {
            this.beg.remove(j);
            bool = true;
            this.bey = bool;
            if ((!this.ber) || (!this.beD))
              break label534;
          }
        while (true)
        {
          try
          {
            bool = a(paramLong1, paramLong2, this.bek, this.aQJ[this.bex], this.bex, this.beh.flags, this.beh.presentationTimeUs, this.bey);
            if (!bool)
              break label580;
            paramLong1 = this.beh.presentationTimeUs;
            this.bex = -1;
            bool = true;
            break;
            j++;
            break label221;
            bool = false;
            break label266;
            if (this.bex == -2)
            {
              localObject = this.bek.getOutputFormat();
              if ((this.bem != 0) && (((MediaFormat)localObject).getInteger("width") == 32) && (((MediaFormat)localObject).getInteger("height") == 32))
              {
                this.beu = true;
                bool = true;
                break;
              }
              if (this.bes)
                ((MediaFormat)localObject).setInteger("channel-count", 1);
              onOutputFormatChanged(this.bek, (MediaFormat)localObject);
              continue;
            }
            if (this.bex == -3)
            {
              this.aQJ = this.bek.getOutputBuffers();
              bool = true;
              break;
            }
            if ((this.bep) && ((this.beE) || (this.beB == 2)))
              rI();
            bool = false;
          }
          catch (IllegalStateException localIllegalStateException2)
          {
            rI();
            if (this.beF)
              rF();
            bool = false;
          }
          break;
          bool = a(paramLong1, paramLong2, this.bek, this.aQJ[this.bex], this.bex, this.beh.flags, this.beh.presentationTimeUs, this.bey);
        }
        bool = false;
      }
    }
  }

  private boolean rG()
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (this.bek != null)
    {
      bool2 = bool1;
      if (this.beB != 2)
      {
        if (!this.beE)
          break label32;
        bool2 = bool1;
      }
    }
    label32: int i;
    int j;
    while (true)
    {
      return bool2;
      if (this.bew < 0)
      {
        this.bew = this.bek.dequeueInputBuffer(0L);
        bool2 = bool1;
        if (this.bew >= 0)
        {
          this.bed.aEY = this.inputBuffers[this.bew];
          this.bed.clear();
        }
      }
      else if (this.beB == 1)
      {
        if (!this.bep)
        {
          this.beD = true;
          this.bek.queueInputBuffer(this.bew, 0, 0, 0L, 4);
          this.bew = -1;
        }
        this.beB = 2;
        bool2 = bool1;
      }
      else if (this.bet)
      {
        this.bet = false;
        this.bed.aEY.put(bea);
        this.bek.queueInputBuffer(this.bew, 0, bea.length, 0L, 0);
        this.bew = -1;
        this.beC = true;
        bool2 = true;
      }
      else
      {
        if (this.beG)
          i = 0;
        for (j = -4; ; j = a(this.bef, this.bed, false))
        {
          bool2 = bool1;
          if (j == -3)
            break;
          if (j != -5)
            break label354;
          if (this.beA == 2)
          {
            this.bed.clear();
            this.beA = 1;
          }
          e(this.bef.aOv);
          bool2 = true;
          break;
          if (this.beA == 1)
          {
            for (i = 0; i < this.aOv.aOf.size(); i++)
            {
              byte[] arrayOfByte = (byte[])this.aOv.aOf.get(i);
              this.bed.aEY.put(arrayOfByte);
            }
            this.beA = 2;
          }
          i = this.bed.aEY.position();
        }
        label354: if (this.bed.qG())
        {
          if (this.beA == 2)
          {
            this.bed.clear();
            this.beA = 1;
          }
          this.beE = true;
          if (!this.beC)
          {
            rI();
            bool2 = bool1;
          }
          else
          {
            bool2 = bool1;
            try
            {
              if (this.bep)
                continue;
              this.beD = true;
              this.bek.queueInputBuffer(this.bew, 0, 0, 0L, 4);
              this.bew = -1;
              bool2 = bool1;
            }
            catch (MediaCodec.CryptoException localCryptoException1)
            {
              throw com.google.android.exoplayer2.e.b(localCryptoException1, this.index);
            }
          }
        }
        else
        {
          if ((!this.beH) || (this.bed.qH()))
            break;
          this.bed.clear();
          if (this.beA == 2)
            this.beA = 1;
          bool2 = true;
        }
      }
    }
    this.beH = false;
    boolean bool3 = this.bed.qK();
    if ((this.bei == null) || ((!bool3) && (this.bec)))
      bool2 = false;
    while (true)
    {
      this.beG = bool2;
      bool2 = bool1;
      if (this.beG)
        break;
      if ((!this.ben) || (bool3))
        break label642;
      j.i(this.bed.aEY);
      if (this.bed.aEY.position() != 0)
        break label637;
      bool2 = true;
      break;
      j = this.bei.getState();
      if (j == 1)
        throw com.google.android.exoplayer2.e.b(this.bei.qT(), this.index);
      if (j != 4)
        bool2 = true;
      else
        bool2 = false;
    }
    label637: this.ben = false;
    while (true)
    {
      label642: long l;
      try
      {
        l = this.bed.aSk;
        if (this.bed.qF())
          this.beg.add(Long.valueOf(l));
        this.bed.qL();
        rH();
        if (bool3)
        {
          Object localObject = this.bed.aSj.aRZ;
          if (i == 0)
          {
            this.bek.queueSecureInputBuffer(this.bew, 0, (MediaCodec.CryptoInfo)localObject, l, 0);
            this.bew = -1;
            this.beC = true;
            this.beA = 0;
            localObject = this.beI;
            ((com.google.android.exoplayer2.b.d)localObject).aSe += 1;
            bool2 = true;
            break;
          }
          if (((MediaCodec.CryptoInfo)localObject).numBytesOfClearData == null)
            ((MediaCodec.CryptoInfo)localObject).numBytesOfClearData = new int[1];
          int[] arrayOfInt = ((MediaCodec.CryptoInfo)localObject).numBytesOfClearData;
          arrayOfInt[0] = (i + arrayOfInt[0]);
          continue;
        }
      }
      catch (MediaCodec.CryptoException localCryptoException2)
      {
        throw com.google.android.exoplayer2.e.b(localCryptoException2, this.index);
      }
      this.bek.queueInputBuffer(this.bew, 0, this.bed.aEY.limit(), l, 0);
    }
  }

  private void rI()
  {
    if (this.beB == 2)
    {
      rF();
      rE();
    }
    while (true)
    {
      return;
      this.beF = true;
      qD();
    }
  }

  protected abstract int a(c paramc, Format paramFormat);

  protected a a(c paramc, Format paramFormat, boolean paramBoolean)
  {
    return paramc.e(paramFormat.aOd, paramBoolean);
  }

  protected abstract void a(a parama, MediaCodec paramMediaCodec, Format paramFormat, MediaCrypto paramMediaCrypto);

  protected abstract boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong3, boolean paramBoolean);

  protected boolean a(a parama)
  {
    return true;
  }

  protected boolean a(boolean paramBoolean, Format paramFormat1, Format paramFormat2)
  {
    return false;
  }

  public void aD(boolean paramBoolean)
  {
    this.beI = new com.google.android.exoplayer2.b.d();
  }

  public final int b(Format paramFormat)
  {
    try
    {
      int i = a(this.beb, paramFormat);
      int j = i;
      com.google.android.exoplayer2.drm.b localb;
      boolean bool;
      if ((i & 0x7) > 2)
      {
        localb = this.aMJ;
        if (paramFormat.aOg != null)
          break label52;
        bool = true;
      }
      while (true)
      {
        j = i;
        if (!bool)
          j = i & 0xFFFFFFF8 | 0x2;
        return j;
        label52: if (localb == null)
          bool = false;
        else
          bool = localb.qV();
      }
    }
    catch (d.b paramFormat)
    {
    }
    throw com.google.android.exoplayer2.e.b(paramFormat, this.index);
  }

  public void b(long paramLong, boolean paramBoolean)
  {
    this.beE = false;
    this.beF = false;
    if (this.bek != null)
    {
      this.bev = -9223372036854775807L;
      this.bew = -1;
      this.bex = -1;
      this.beH = true;
      this.beG = false;
      this.bey = false;
      this.beg.clear();
      this.bet = false;
      this.beu = false;
      if ((!this.beo) && ((!this.beq) || (!this.beD)))
        break label117;
      rF();
      rE();
    }
    while (true)
    {
      if ((this.bez) && (this.aOv != null))
        this.beA = 1;
      return;
      label117: if (this.beB != 0)
      {
        rF();
        rE();
      }
      else
      {
        this.bek.flush();
        this.beC = false;
      }
    }
  }

  protected void c(String paramString, long paramLong1, long paramLong2)
  {
  }

  protected void e(Format paramFormat)
  {
    Format localFormat = this.aOv;
    this.aOv = paramFormat;
    DrmInitData localDrmInitData = this.aOv.aOg;
    int i;
    if (localFormat == null)
    {
      paramFormat = null;
      if (v.j(localDrmInitData, paramFormat))
        break label83;
      i = 1;
    }
    while (true)
      if (i != 0)
      {
        if (this.aOv.aOg == null)
          break label220;
        if (this.aMJ == null)
        {
          throw com.google.android.exoplayer2.e.b(new IllegalStateException("Media requires a DrmSessionManager"), this.index);
          paramFormat = localFormat.aOg;
          break;
          label83: i = 0;
          continue;
        }
        paramFormat = this.aMJ;
        Looper.myLooper();
        this.bej = paramFormat.qW();
        if (this.bej != this.bei);
      }
    boolean bool;
    if ((this.bej == this.bei) && (this.bek != null) && (a(this.bel.bdX, localFormat, this.aOv)))
    {
      this.bez = true;
      this.beA = 1;
      if ((this.bem == 2) || ((this.bem == 1) && (this.aOv.width == localFormat.width) && (this.aOv.height == localFormat.height)))
      {
        bool = true;
        label213: this.bet = bool;
      }
    }
    while (true)
    {
      return;
      label220: this.bej = null;
      break;
      bool = false;
      break label213;
      if (this.beC)
      {
        this.beB = 1;
      }
      else
      {
        rF();
        rE();
      }
    }
  }

  public final void f(long paramLong1, long paramLong2)
  {
    if (this.beF)
      qD();
    while (true)
    {
      return;
      int i;
      if (this.aOv == null)
      {
        this.bee.clear();
        i = a(this.bef, this.bee, true);
        if (i == -5)
          e(this.bef.aOv);
      }
      else
      {
        rE();
        if (this.bek == null)
          break label127;
        t.beginSection("drainAndFeed");
        while (h(paramLong1, paramLong2));
        while (rG());
        t.endSection();
        continue;
      }
      if (i == -4)
      {
        com.google.android.exoplayer2.i.a.checkState(this.bee.qG());
        this.beE = true;
        rI();
        continue;
        label127: this.aMt.Z(paramLong1 - this.aMu);
        this.bee.clear();
        i = a(this.bef, this.bee, false);
        if (i == -5)
        {
          e(this.bef.aOv);
        }
        else if (i == -4)
        {
          com.google.android.exoplayer2.i.a.checkState(this.bee.qG());
          this.beE = true;
          rI();
        }
      }
    }
  }

  public boolean isReady()
  {
    if ((this.aOv != null) && (!this.beG))
      if (this.aMv)
      {
        bool = this.aMw;
        if ((!bool) && (this.bex < 0) && ((this.bev == -9223372036854775807L) || (SystemClock.elapsedRealtime() >= this.bev)))
          break label76;
      }
    label76: for (boolean bool = true; ; bool = false)
    {
      return bool;
      bool = this.aMt.isReady();
      break;
    }
  }

  protected void onOutputFormatChanged(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
  {
  }

  public void onStarted()
  {
  }

  public void onStopped()
  {
  }

  public final int pJ()
  {
    return 8;
  }

  public void pK()
  {
    this.aOv = null;
    try
    {
      rF();
      return;
    }
    finally
    {
      this.bei = null;
      this.bej = null;
    }
  }

  protected void qD()
  {
  }

  public boolean qf()
  {
    return this.beF;
  }

  protected final void rE()
  {
    boolean bool1 = false;
    if ((this.bek != null) || (this.aOv == null));
    String str;
    Object localObject1;
    do
    {
      return;
      this.bei = this.bej;
      str = this.aOv.aOd;
      if (this.bei == null)
        break label969;
      localObject1 = (com.google.android.exoplayer2.drm.d)this.bei.qU();
      if (localObject1 != null)
        break;
      localObject2 = this.bei.qT();
    }
    while (localObject2 == null);
    throw com.google.android.exoplayer2.e.b((Exception)localObject2, this.index);
    Object localObject2 = ((com.google.android.exoplayer2.drm.d)localObject1).aSz;
    boolean bool2;
    if ((!((com.google.android.exoplayer2.drm.d)localObject1).aSA) && (((com.google.android.exoplayer2.drm.d)localObject1).aSz.requiresSecureDecoderComponent(str)))
      bool2 = true;
    while (true)
    {
      while (true)
      {
        label110: if (this.bel == null);
        try
        {
          this.bel = a(this.beb, this.aOv, bool2);
          if ((this.bel == null) && (bool2))
          {
            this.bel = a(this.beb, this.aOv, false);
            if (this.bel != null)
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>("Drm session requires secure decoder for ");
              ((StringBuilder)localObject1).append(str).append(", but no secure decoder available. Trying to proceed with ").append(this.bel.name).append(".");
            }
          }
          if (this.bel == null)
            a(new b.a(this.aOv, null, bool2, -49999));
          if (!a(this.bel))
            break;
          str = this.bel.name;
          if ((v.SDK_INT <= 24) && ("OMX.Exynos.avc.dec.secure".equals(str)) && ((v.MODEL.startsWith("SM-T585")) || (v.MODEL.startsWith("SM-A520"))))
          {
            i = 2;
            this.bem = i;
            localObject1 = this.aOv;
            if ((v.SDK_INT >= 21) || (!((Format)localObject1).aOf.isEmpty()) || (!"OMX.MTK.VIDEO.DECODER.AVC".equals(str)))
              break label906;
            bool3 = true;
            this.ben = bool3;
            if ((v.SDK_INT >= 18) && ((v.SDK_INT != 18) || ((!"OMX.SEC.avc.dec".equals(str)) && (!"OMX.SEC.avc.dec.secure".equals(str)))) && ((v.SDK_INT != 19) || (!v.MODEL.startsWith("SM-G800")) || ((!"OMX.Exynos.avc.dec".equals(str)) && (!"OMX.Exynos.avc.dec.secure".equals(str)))))
              break label912;
            bool3 = true;
            this.beo = bool3;
            if ((v.SDK_INT > 17) || ((!"OMX.rk.video_decoder.avc".equals(str)) && (!"OMX.allwinner.video.decoder.avc".equals(str))))
              break label918;
            bool3 = true;
            this.bep = bool3;
            if (((v.SDK_INT > 23) || (!"OMX.google.vorbis.decoder".equals(str))) && ((v.SDK_INT > 19) || (!"hb2000".equals(v.DEVICE)) || ((!"OMX.amlogic.avc.decoder.awesome".equals(str)) && (!"OMX.amlogic.avc.decoder.awesome.secure".equals(str)))))
              break label924;
            bool3 = true;
            this.beq = bool3;
            if ((v.SDK_INT != 21) || (!"OMX.google.aac.decoder".equals(str)))
              break label930;
            bool3 = true;
            this.ber = bool3;
            localObject1 = this.aOv;
            bool3 = bool1;
            if (v.SDK_INT <= 18)
            {
              bool3 = bool1;
              if (((Format)localObject1).aOn == 1)
              {
                bool3 = bool1;
                if ("OMX.MTK.AUDIO.DECODER.MP3".equals(str))
                  bool3 = true;
              }
            }
            this.bes = bool3;
          }
        }
        catch (d.b localb)
        {
          try
          {
            while (true)
            {
              int i;
              long l1 = SystemClock.elapsedRealtime();
              t.beginSection("createCodec:".concat(String.valueOf(str)));
              this.bek = MediaCodec.createByCodecName(str);
              t.endSection();
              t.beginSection("configureCodec");
              a(this.bel, this.bek, this.aOv, (MediaCrypto)localObject2);
              t.endSection();
              t.beginSection("startCodec");
              this.bek.start();
              t.endSection();
              l2 = SystemClock.elapsedRealtime();
              c(str, l2, l2 - l1);
              this.inputBuffers = this.bek.getInputBuffers();
              this.aQJ = this.bek.getOutputBuffers();
              if (this.state != 2)
                break label961;
              l2 = SystemClock.elapsedRealtime() + 1000L;
              this.bev = l2;
              this.bew = -1;
              this.bex = -1;
              this.beH = true;
              localObject2 = this.beI;
              ((com.google.android.exoplayer2.b.d)localObject2).aSc += 1;
              break;
              bool2 = false;
              break label110;
              localb = localb;
              a(new b.a(this.aOv, localb, bool2, -49998));
              continue;
              if ((v.SDK_INT < 24) && (("OMX.Nvidia.h264.decode".equals(localb)) || ("OMX.Nvidia.h264.decode.secure".equals(localb))) && (("flounder".equals(v.DEVICE)) || ("flounder_lte".equals(v.DEVICE)) || ("grouper".equals(v.DEVICE)) || ("tilapia".equals(v.DEVICE))))
              {
                i = 1;
              }
              else
              {
                i = 0;
                continue;
                label906: bool3 = false;
                continue;
                label912: bool3 = false;
                continue;
                label918: bool3 = false;
                continue;
                label924: bool3 = false;
              }
            }
            label930: boolean bool3 = false;
          }
          catch (Exception localException)
          {
            while (true)
            {
              a(new b.a(this.aOv, localException, bool2, localb));
              continue;
              label961: long l2 = -9223372036854775807L;
            }
          }
        }
      }
      label969: bool2 = false;
      Object localObject3 = null;
    }
  }

  protected void rF()
  {
    this.bev = -9223372036854775807L;
    this.bew = -1;
    this.bex = -1;
    this.beG = false;
    this.bey = false;
    this.beg.clear();
    this.inputBuffers = null;
    this.aQJ = null;
    this.bel = null;
    this.bez = false;
    this.beC = false;
    this.ben = false;
    this.beo = false;
    this.bem = 0;
    this.bep = false;
    this.beq = false;
    this.bes = false;
    this.bet = false;
    this.beu = false;
    this.beD = false;
    this.beA = 0;
    this.beB = 0;
    this.bed.aEY = null;
    if (this.bek != null)
    {
      com.google.android.exoplayer2.b.d locald = this.beI;
      locald.aSd += 1;
    }
    try
    {
      this.bek.stop();
      try
      {
        this.bek.release();
        return;
      }
      finally
      {
        this.bek = null;
        if ((this.bei != null) && (this.bej != this.bei))
          this.bei = null;
      }
    }
    finally
    {
    }
  }

  protected void rH()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.e.b
 * JD-Core Version:    0.6.2
 */