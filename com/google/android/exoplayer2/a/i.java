package com.google.android.exoplayer2.a;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.p;
import com.google.android.exoplayer2.t;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.util.LinkedList;

@TargetApi(16)
public final class i extends com.google.android.exoplayer2.e.b
  implements com.google.android.exoplayer2.i.h
{
  private int aOn;
  private int aOo;
  private final e.a aRq;
  private final f aRr;
  private boolean aRs;
  private boolean aRt;
  private MediaFormat aRu;
  private long aRv;
  private boolean aRw;

  public i(com.google.android.exoplayer2.e.c paramc, com.google.android.exoplayer2.drm.b<com.google.android.exoplayer2.drm.d> paramb, Handler paramHandler, e parame, c paramc1, d[] paramArrayOfd)
  {
    super(1, paramc, paramb, true);
    AppMethodBeat.i(94699);
    this.aRr = new f(paramc1, paramArrayOfd, new i.a(this, (byte)0));
    this.aRq = new e.a(paramHandler, parame);
    AppMethodBeat.o(94699);
  }

  private boolean av(String paramString)
  {
    AppMethodBeat.i(94702);
    boolean bool = this.aRr.at(paramString);
    AppMethodBeat.o(94702);
    return bool;
  }

  public final int a(com.google.android.exoplayer2.e.c paramc, Format paramFormat)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(94700);
    Object localObject = paramFormat.aOd;
    if (!com.google.android.exoplayer2.i.i.aH((String)localObject))
      AppMethodBeat.o(94700);
    int k;
    while (true)
    {
      return j;
      if (v.SDK_INT >= 21);
      for (k = 32; ; k = 0)
      {
        if ((!av((String)localObject)) || (paramc.rJ() == null))
          break label85;
        j = k | 0x8 | 0x4;
        AppMethodBeat.o(94700);
        break;
      }
      label85: paramc = paramc.e((String)localObject, false);
      if (paramc != null)
        break;
      AppMethodBeat.o(94700);
      j = 1;
    }
    label148: int n;
    if (v.SDK_INT >= 21)
    {
      if (paramFormat.sampleRate != -1)
      {
        j = paramFormat.sampleRate;
        if (paramc.bdZ != null)
          break label223;
        paramc.ax("sampleRate.caps");
        j = 0;
        m = i;
        if (j == 0)
          break label197;
      }
      if (paramFormat.aOn != -1)
      {
        n = paramFormat.aOn;
        if (paramc.bdZ != null)
          break label285;
        paramc.ax("channelCount.caps");
        j = 0;
        label186: m = i;
        if (j == 0)
          break label197;
      }
    }
    int m = 1;
    label197: if (m != 0);
    for (j = 4; ; j = 3)
    {
      j |= k | 0x8;
      AppMethodBeat.o(94700);
      break;
      label223: localObject = paramc.bdZ.getAudioCapabilities();
      if (localObject == null)
      {
        paramc.ax("sampleRate.aCaps");
        j = 0;
        break label148;
      }
      if (!((MediaCodecInfo.AudioCapabilities)localObject).isSampleRateSupported(j))
      {
        paramc.ax("sampleRate.support, ".concat(String.valueOf(j)));
        j = 0;
        break label148;
      }
      j = 1;
      break label148;
      label285: paramFormat = paramc.bdZ.getAudioCapabilities();
      if (paramFormat == null)
      {
        paramc.ax("channelCount.aCaps");
        j = 0;
        break label186;
      }
      localObject = paramc.name;
      String str = paramc.mimeType;
      m = paramFormat.getMaxInputChannelCount();
      if ((m > 1) || ((v.SDK_INT >= 26) && (m > 0)))
        j = m;
      while (true)
        if (j < n)
        {
          paramc.ax("channelCount.support, ".concat(String.valueOf(n)));
          j = 0;
          break;
          if (("audio/mpeg".equals(str)) || ("audio/3gpp".equals(str)) || ("audio/amr-wb".equals(str)) || ("audio/mp4a-latm".equals(str)) || ("audio/vorbis".equals(str)) || ("audio/opus".equals(str)) || ("audio/raw".equals(str)) || ("audio/flac".equals(str)) || ("audio/g711-alaw".equals(str)) || ("audio/g711-mlaw".equals(str)) || ("audio/gsm".equals(str)))
          {
            j = m;
          }
          else
          {
            if ("audio/ac3".equals(str))
              j = 6;
            while (true)
            {
              new StringBuilder("AssumedMaxChannelAdjustment: ").append((String)localObject).append(", [").append(m).append(" to ").append(j).append("]");
              break;
              if ("audio/eac3".equals(str))
                j = 16;
              else
                j = 30;
            }
          }
        }
      j = 1;
      break label186;
    }
  }

  public final com.google.android.exoplayer2.e.a a(com.google.android.exoplayer2.e.c paramc, Format paramFormat, boolean paramBoolean)
  {
    AppMethodBeat.i(94701);
    if (av(paramFormat.aOd))
    {
      com.google.android.exoplayer2.e.a locala = paramc.rJ();
      if (locala != null)
      {
        this.aRs = true;
        AppMethodBeat.o(94701);
        paramc = locala;
      }
    }
    while (true)
    {
      return paramc;
      this.aRs = false;
      paramc = super.a(paramc, paramFormat, paramBoolean);
      AppMethodBeat.o(94701);
    }
  }

  public final void a(com.google.android.exoplayer2.e.a parama, MediaCodec paramMediaCodec, Format paramFormat, MediaCrypto paramMediaCrypto)
  {
    AppMethodBeat.i(94703);
    parama = parama.name;
    boolean bool;
    if ((v.SDK_INT < 24) && ("OMX.SEC.aac.dec".equals(parama)) && ("samsung".equals(v.MANUFACTURER)) && ((v.DEVICE.startsWith("zeroflte")) || (v.DEVICE.startsWith("herolte")) || (v.DEVICE.startsWith("heroqlte"))))
    {
      bool = true;
      this.aRt = bool;
      if (!this.aRs)
        break label143;
      this.aRu = paramFormat.qc();
      this.aRu.setString("mime", "audio/raw");
      paramMediaCodec.configure(this.aRu, null, paramMediaCrypto, 0);
      this.aRu.setString("mime", paramFormat.aOd);
      AppMethodBeat.o(94703);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label143: paramMediaCodec.configure(paramFormat.qc(), null, paramMediaCrypto, 0);
      this.aRu = null;
      AppMethodBeat.o(94703);
    }
  }

  public final boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong3, boolean paramBoolean)
  {
    AppMethodBeat.i(94716);
    if ((this.aRs) && ((paramInt2 & 0x2) != 0))
    {
      paramMediaCodec.releaseOutputBuffer(paramInt1, false);
      paramBoolean = true;
      AppMethodBeat.o(94716);
    }
    while (true)
    {
      return paramBoolean;
      if (paramBoolean)
      {
        paramMediaCodec.releaseOutputBuffer(paramInt1, false);
        paramMediaCodec = this.beI;
        paramMediaCodec.aSg += 1;
        paramMediaCodec = this.aRr;
        if (paramMediaCodec.aQD == 1)
          paramMediaCodec.aQD = 2;
        paramBoolean = true;
        AppMethodBeat.o(94716);
      }
      else
      {
        try
        {
          localf = this.aRr;
          if ((localf.aQK == null) || (paramByteBuffer == localf.aQK))
          {
            paramBoolean = true;
            label131: com.google.android.exoplayer2.i.a.checkArgument(paramBoolean);
            if (!localf.isInitialized())
            {
              localf.aQa.block();
              localf.aQf = localf.qw();
              paramInt2 = localf.aQf.getAudioSessionId();
              if ((f.aPT) && (v.SDK_INT < 21))
              {
                if ((localf.aQe != null) && (paramInt2 != localf.aQe.getAudioSessionId()))
                  localf.qr();
                if (localf.aQe == null)
                {
                  localObject = new android/media/AudioTrack;
                  ((AudioTrack)localObject).<init>(3, 4000, 4, 2, 2, 0, paramInt2);
                  localf.aQe = ((AudioTrack)localObject);
                }
              }
              if (localf.aOX != paramInt2)
              {
                localf.aOX = paramInt2;
                localf.aPZ.dx(paramInt2);
              }
              localf.aQc.a(localf.aQf, localf.qv());
              localf.qq();
              localf.aQS = false;
              if (localf.aQQ)
                localf.play();
            }
            if (!localf.qv())
              break label421;
            if (localf.aQf.getPlayState() != 2)
              break label396;
            localf.aQS = false;
            label344: paramInt2 = 0;
          }
          label396: label421: 
          while (true)
            label347: if (paramInt2 != 0)
            {
              paramMediaCodec.releaseOutputBuffer(paramInt1, false);
              paramMediaCodec = this.beI;
              paramMediaCodec.aSf += 1;
              paramBoolean = true;
              AppMethodBeat.o(94716);
              break;
              paramBoolean = false;
              break label131;
              if ((localf.aQf.getPlayState() == 1) && (localf.aQc.qx() != 0L))
                break label344;
              paramBoolean = localf.aQS;
              localf.aQS = localf.qp();
              if ((paramBoolean) && (!localf.aQS) && (localf.aQf.getPlayState() != 1))
              {
                paramLong1 = SystemClock.elapsedRealtime();
                paramLong2 = localf.aQT;
                localf.aPZ.e(localf.bufferSize, com.google.android.exoplayer2.b.w(localf.aQj), paramLong1 - paramLong2);
              }
              if (localf.aQK == null)
              {
                if (!paramByteBuffer.hasRemaining())
                {
                  paramInt2 = 1;
                }
                else if ((localf.aQi) && (localf.aQC == 0))
                {
                  paramInt2 = localf.aQh;
                  if ((paramInt2 != 7) && (paramInt2 != 8))
                    break label747;
                  paramInt2 = h.h(paramByteBuffer);
                }
              }
              else
              {
                while (true)
                {
                  localf.aQC = paramInt2;
                  if (localf.aQk != null)
                  {
                    if (!localf.qo())
                      break;
                    localObject = localf.aQd;
                    f.g localg = new com/google/android/exoplayer2/a/f$g;
                    localg.<init>(localf.aQk, Math.max(0L, paramLong3), localf.J(localf.qt()), (byte)0);
                    ((LinkedList)localObject).add(localg);
                    localf.aQk = null;
                    localf.qn();
                  }
                  if (localf.aQD != 0)
                    break label830;
                  localf.aQE = Math.max(0L, paramLong3);
                  localf.aQD = 1;
                  if (!localf.aQi)
                    break label960;
                  localf.aQy += localf.aQC;
                  localf.aQK = paramByteBuffer;
                  if (!localf.aQi)
                    break label980;
                  localf.a(localf.aQK, paramLong3);
                  if (localf.aQK.hasRemaining())
                    break;
                  localf.aQK = null;
                  paramInt2 = 1;
                  break label347;
                  label747: if (paramInt2 == 5)
                  {
                    paramInt2 = a.qj();
                  }
                  else
                  {
                    if (paramInt2 != 6)
                      break label778;
                    paramInt2 = a.f(paramByteBuffer);
                  }
                }
                paramMediaCodec = new java/lang/IllegalStateException;
                paramMediaCodec.<init>("Unexpected audio encoding: ".concat(String.valueOf(paramInt2)));
                AppMethodBeat.o(94716);
                throw paramMediaCodec;
              }
            }
        }
        catch (f.d paramMediaCodec)
        {
          while (true)
          {
            Object localObject;
            paramMediaCodec = com.google.android.exoplayer2.e.b(paramMediaCodec, this.index);
            AppMethodBeat.o(94716);
            throw paramMediaCodec;
            paramLong1 = localf.aQE + localf.J(localf.qs());
            if ((localf.aQD == 1) && (Math.abs(paramLong1 - paramLong3) > 200000L))
            {
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>("Discontinuity detected [expected ");
              ((StringBuilder)localObject).append(paramLong1).append(", got ").append(paramLong3).append("]");
              localf.aQD = 2;
            }
            if (localf.aQD == 2)
            {
              localf.aQE = (paramLong3 - paramLong1 + localf.aQE);
              localf.aQD = 1;
              localf.aPZ.qe();
            }
          }
        }
        catch (f.h paramMediaCodec)
        {
          while (true)
          {
            f localf;
            label778: label830: continue;
            label960: localf.aQx += paramByteBuffer.remaining();
            continue;
            label980: localf.H(paramLong3);
          }
          paramBoolean = false;
          AppMethodBeat.o(94716);
        }
      }
    }
  }

  public final void aD(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(94707);
    super.aD(paramBoolean);
    Object localObject = this.aRq;
    com.google.android.exoplayer2.b.d locald = this.beI;
    if (((e.a)localObject).aPH != null)
      ((e.a)localObject).handler.post(new e.a.1((e.a)localObject, locald));
    int i = this.aMs.aOF;
    if (i != 0)
    {
      localObject = this.aRr;
      paramBoolean = bool;
      if (v.SDK_INT >= 21)
        paramBoolean = true;
      com.google.android.exoplayer2.i.a.checkState(paramBoolean);
      if ((!((f)localObject).aQR) || (((f)localObject).aOX != i))
      {
        ((f)localObject).aQR = true;
        ((f)localObject).aOX = i;
        ((f)localObject).reset();
      }
      AppMethodBeat.o(94707);
    }
    while (true)
    {
      return;
      localObject = this.aRr;
      if (((f)localObject).aQR)
      {
        ((f)localObject).aQR = false;
        ((f)localObject).aOX = 0;
        ((f)localObject).reset();
      }
      AppMethodBeat.o(94707);
    }
  }

  public final p b(p paramp)
  {
    AppMethodBeat.i(94715);
    paramp = this.aRr.b(paramp);
    AppMethodBeat.o(94715);
    return paramp;
  }

  public final void b(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(94708);
    super.b(paramLong, paramBoolean);
    this.aRr.reset();
    this.aRv = paramLong;
    this.aRw = true;
    AppMethodBeat.o(94708);
  }

  public final void c(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(94718);
    switch (paramInt)
    {
    default:
      super.c(paramInt, paramObject);
      AppMethodBeat.o(94718);
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      Object localObject = this.aRr;
      float f = ((Float)paramObject).floatValue();
      if (((f)localObject).aQH != f)
      {
        ((f)localObject).aQH = f;
        ((f)localObject).qq();
      }
      AppMethodBeat.o(94718);
      continue;
      localObject = (b)paramObject;
      paramObject = this.aRr;
      if (!paramObject.aOY.equals(localObject))
      {
        paramObject.aOY = ((b)localObject);
        if (!paramObject.aQR)
        {
          paramObject.reset();
          paramObject.aOX = 0;
        }
      }
      AppMethodBeat.o(94718);
    }
  }

  public final void c(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(94704);
    e.a locala = this.aRq;
    if (locala.aPH != null)
      locala.handler.post(new e.a.2(locala, paramString, paramLong1, paramLong2));
    AppMethodBeat.o(94704);
  }

  public final void e(Format paramFormat)
  {
    AppMethodBeat.i(94705);
    super.e(paramFormat);
    e.a locala = this.aRq;
    if (locala.aPH != null)
      locala.handler.post(new e.a.3(locala, paramFormat));
    if ("audio/raw".equals(paramFormat.aOd));
    for (int i = paramFormat.aOo; ; i = 2)
    {
      this.aOo = i;
      this.aOn = paramFormat.aOn;
      AppMethodBeat.o(94705);
      return;
    }
  }

  public final boolean isReady()
  {
    AppMethodBeat.i(94713);
    boolean bool;
    if ((this.aRr.qp()) || (super.isReady()))
    {
      bool = true;
      AppMethodBeat.o(94713);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(94713);
    }
  }

  public final void onOutputFormatChanged(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
  {
    AppMethodBeat.i(94706);
    int i;
    if (this.aRu != null)
    {
      i = 1;
      if (i == 0)
        break label111;
    }
    int k;
    label111: for (paramMediaCodec = this.aRu.getString("mime"); ; paramMediaCodec = "audio/raw")
    {
      if (i != 0)
        paramMediaFormat = this.aRu;
      j = paramMediaFormat.getInteger("channel-count");
      k = paramMediaFormat.getInteger("sample-rate");
      if ((!this.aRt) || (j != 6) || (this.aOn >= 6))
        break label258;
      paramMediaFormat = new int[this.aOn];
      for (i = 0; i < this.aOn; i++)
        paramMediaFormat[i] = i;
      i = 0;
      break;
    }
    f localf;
    int m;
    boolean bool1;
    try
    {
      while (true)
      {
        localf = this.aRr;
        m = this.aOo;
        if (!"audio/raw".equals(paramMediaCodec))
        {
          bool1 = true;
          label141: if (!bool1)
            break label269;
          i = f.au(paramMediaCodec);
          n = 0;
          if (bool1)
            break label907;
          localf.aQw = v.bj(m, j);
          localf.aPW.aRk = paramMediaFormat;
          paramMediaCodec = localf.aPY;
          int i1 = paramMediaCodec.length;
          i2 = 0;
          m = j;
          j = i2;
          label201: if (j >= i1)
            break label311;
          paramMediaFormat = paramMediaCodec[j];
        }
        try
        {
          int i3 = paramMediaFormat.r(k, m, i);
          n |= i3;
          if (paramMediaFormat.isActive())
          {
            m = paramMediaFormat.qk();
            i = 2;
          }
          j++;
          break label201;
          label258: paramMediaFormat = null;
          continue;
          bool1 = false;
          break label141;
          label269: i = m;
        }
        catch (d.a paramMediaFormat)
        {
          paramMediaCodec = new com/google/android/exoplayer2/a/f$c;
          paramMediaCodec.<init>(paramMediaFormat);
          AppMethodBeat.o(94706);
          throw paramMediaCodec;
        }
      }
    }
    catch (f.c paramMediaCodec)
    {
      paramMediaCodec = com.google.android.exoplayer2.e.b(paramMediaCodec, this.index);
      AppMethodBeat.o(94706);
      throw paramMediaCodec;
    }
    label311: if (n != 0)
      localf.qn();
    int j = m;
    int i2 = n;
    for (int n = i; ; n = i)
    {
      switch (j)
      {
      default:
        paramMediaCodec = new com/google/android/exoplayer2/a/f$c;
        paramMediaCodec.<init>("Unsupported channel count: ".concat(String.valueOf(j)));
        AppMethodBeat.o(94706);
        throw paramMediaCodec;
      case 1:
        i = 4;
        m = i;
        if (v.SDK_INT <= 23)
        {
          m = i;
          if ("foster".equals(v.DEVICE))
          {
            m = i;
            if ("NVIDIA".equals(v.MANUFACTURER))
              m = i;
          }
        }
        switch (j)
        {
        default:
          m = i;
        case 4:
        case 6:
          label491: if ((v.SDK_INT > 25) || (!"fugu".equals(v.DEVICE)) || (!bool1) || (j != 1));
          break;
        case 7:
        case 3:
        case 5:
        }
        break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      }
      for (i = 12; ; i = m)
      {
        if ((i2 != 0) || (!localf.isInitialized()) || (localf.encoding != n) || (localf.sampleRate != k) || (localf.aQg != i))
        {
          localf.reset();
          localf.encoding = n;
          localf.aQi = bool1;
          localf.sampleRate = k;
          localf.aQg = i;
          if (!bool1)
            break label758;
          m = n;
          label608: localf.aQh = m;
          localf.aQz = v.bj(2, j);
          if (!bool1)
            break label771;
          if ((localf.aQh != 5) && (localf.aQh != 6))
            break label764;
          i = 20480;
          label654: localf.bufferSize = i;
          if (!bool1)
            break label879;
        }
        label771: label860: label879: for (long l = -9223372036854775807L; ; l = localf.J(localf.bufferSize / localf.aQz))
        {
          localf.aQj = l;
          localf.b(localf.aNg);
          AppMethodBeat.o(94706);
          return;
          i = 12;
          break;
          i = 28;
          break;
          i = 204;
          break;
          i = 220;
          break;
          i = 252;
          break;
          i = 1276;
          break;
          i = com.google.android.exoplayer2.b.CHANNEL_OUT_7POINT1_SURROUND;
          break;
          m = com.google.android.exoplayer2.b.CHANNEL_OUT_7POINT1_SURROUND;
          break label491;
          m = 252;
          break label491;
          label758: m = 2;
          break label608;
          label764: i = 49152;
          break label654;
          n = AudioTrack.getMinBufferSize(k, i, localf.aQh);
          if (n != -2);
          for (boolean bool2 = true; ; bool2 = false)
          {
            com.google.android.exoplayer2.i.a.checkState(bool2);
            m = n * 4;
            i = (int)localf.K(250000L) * localf.aQz;
            n = (int)Math.max(n, localf.K(750000L) * localf.aQz);
            if (m >= i)
              break label860;
            break;
          }
          if (m > n)
          {
            i = n;
            break label654;
          }
          i = m;
          break label654;
        }
      }
      label907: i2 = 0;
    }
  }

  public final void onStarted()
  {
    AppMethodBeat.i(94709);
    super.onStarted();
    this.aRr.play();
    AppMethodBeat.o(94709);
  }

  public final void onStopped()
  {
    AppMethodBeat.i(94710);
    f localf = this.aRr;
    localf.aQQ = false;
    if (localf.isInitialized())
    {
      localf.qu();
      localf.aQc.pause();
    }
    super.onStopped();
    AppMethodBeat.o(94710);
  }

  public final com.google.android.exoplayer2.i.h pD()
  {
    return this;
  }

  public final void pK()
  {
    int i = 0;
    AppMethodBeat.i(94711);
    try
    {
      f localf = this.aRr;
      localf.reset();
      localf.qr();
      d[] arrayOfd = localf.aPY;
      int j = arrayOfd.length;
      while (i < j)
      {
        arrayOfd[i].reset();
        i++;
      }
      localf.aOX = 0;
      localf.aQQ = false;
      try
      {
        super.pK();
        return;
      }
      finally
      {
        this.aRq.e(this.beI);
        AppMethodBeat.o(94711);
      }
    }
    finally
    {
      try
      {
        super.pK();
        this.aRq.e(this.beI);
        AppMethodBeat.o(94711);
        throw localObject2;
      }
      finally
      {
        this.aRq.e(this.beI);
        AppMethodBeat.o(94711);
      }
    }
  }

  public final p qC()
  {
    return this.aRr.aNg;
  }

  public final void qD()
  {
    AppMethodBeat.i(94717);
    try
    {
      f localf = this.aRr;
      if ((localf.aQP) || (!localf.isInitialized()))
        AppMethodBeat.o(94717);
      while (true)
      {
        return;
        if (localf.qo())
        {
          localf.aQc.L(localf.qt());
          localf.aQo = 0;
          localf.aQP = true;
        }
        AppMethodBeat.o(94717);
      }
    }
    catch (f.h localh)
    {
      com.google.android.exoplayer2.e locale = com.google.android.exoplayer2.e.b(localh, this.index);
      AppMethodBeat.o(94717);
      throw locale;
    }
  }

  public final boolean qf()
  {
    boolean bool = true;
    AppMethodBeat.i(94712);
    int i;
    if (super.qf())
    {
      f localf = this.aRr;
      if ((!localf.isInitialized()) || ((localf.aQP) && (!localf.qp())))
      {
        i = 1;
        if (i == 0)
          break label60;
        AppMethodBeat.o(94712);
      }
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label60: AppMethodBeat.o(94712);
      bool = false;
    }
  }

  public final long qy()
  {
    AppMethodBeat.i(94714);
    long l = this.aRr.aI(qf());
    if (l != -9223372036854775808L)
      if (!this.aRw)
        break label56;
    while (true)
    {
      this.aRv = l;
      this.aRw = false;
      l = this.aRv;
      AppMethodBeat.o(94714);
      return l;
      label56: l = Math.max(this.aRv, l);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.i
 * JD-Core Version:    0.6.2
 */