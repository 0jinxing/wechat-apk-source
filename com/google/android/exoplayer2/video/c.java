package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.i.i;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.util.List;

@TargetApi(16)
public final class c extends com.google.android.exoplayer2.e.b
{
  private static final int[] bsf = { 1920, 1600, 1440, 1280, 960, 854, 640, 540, 480 };
  private int aOF;
  private Surface aOO;
  private boolean aQR;
  private int bsA;
  private float bsB;
  private int bsC;
  private int bsD;
  private int bsE;
  private float bsF;
  c.b bsG;
  private long bsH;
  private int bsI;
  private final d bsg;
  private final e.a bsh;
  private final long bsi;
  private final int bsj;
  private final boolean bsk;
  private final long[] bsl;
  private Format[] bsm;
  private c.a bsn;
  private boolean bso;
  private Surface bsp;
  private int bsq;
  private boolean bsr;
  private long bss;
  private long bst;
  private int bsu;
  private int bsv;
  private int bsw;
  private float bsx;
  private int bsy;
  private int bsz;
  private final Context context;

  public c(Context paramContext, com.google.android.exoplayer2.e.c paramc, long paramLong, com.google.android.exoplayer2.drm.b<com.google.android.exoplayer2.drm.d> paramb, Handler paramHandler, e parame)
  {
    super(2, paramc, paramb, false);
    AppMethodBeat.i(95998);
    this.bsi = paramLong;
    this.bsj = 50;
    this.context = paramContext.getApplicationContext();
    this.bsg = new d(paramContext);
    this.bsh = new e.a(paramHandler, parame);
    boolean bool2 = bool1;
    if (v.SDK_INT <= 22)
    {
      bool2 = bool1;
      if ("foster".equals(v.DEVICE))
      {
        bool2 = bool1;
        if ("NVIDIA".equals(v.MANUFACTURER))
          bool2 = true;
      }
    }
    this.bsk = bool2;
    this.bsl = new long[10];
    this.bsH = -9223372036854775807L;
    this.bss = -9223372036854775807L;
    this.bsy = -1;
    this.bsz = -1;
    this.bsB = -1.0F;
    this.bsx = -1.0F;
    this.bsq = 1;
    tV();
    AppMethodBeat.o(95998);
  }

  private static Point a(com.google.android.exoplayer2.e.a parama, Format paramFormat)
  {
    AppMethodBeat.i(96027);
    int i;
    int j;
    label27: int k;
    label37: int n;
    label58: int i1;
    int i2;
    Object localObject;
    if (paramFormat.height > paramFormat.width)
    {
      i = 1;
      if (i == 0)
        break label110;
      j = paramFormat.height;
      if (i == 0)
        break label118;
      k = paramFormat.width;
      float f1 = k / j;
      int[] arrayOfInt = bsf;
      int m = arrayOfInt.length;
      n = 0;
      if (n >= m)
        break label368;
      i1 = arrayOfInt[n];
      i2 = (int)(i1 * f1);
      if ((i1 > j) && (i2 > k))
        break label127;
      localObject = null;
      AppMethodBeat.o(96027);
    }
    while (true)
    {
      return localObject;
      i = 0;
      break;
      label110: j = paramFormat.width;
      break label27;
      label118: k = paramFormat.height;
      break label37;
      label127: if (v.SDK_INT >= 21)
      {
        if (i != 0)
        {
          i3 = i2;
          if (i == 0)
            break label204;
          if (parama.bdZ != null)
            break label211;
          parama.ax("align.caps");
          localObject = null;
        }
        while (true)
        {
          float f2 = paramFormat.aOh;
          if (!parama.a(((Point)localObject).x, ((Point)localObject).y, f2))
            break label362;
          AppMethodBeat.o(96027);
          break;
          i3 = i1;
          break label143;
          i1 = i2;
          break label147;
          localObject = parama.bdZ.getVideoCapabilities();
          if (localObject == null)
          {
            parama.ax("align.vCaps");
            localObject = null;
          }
          else
          {
            i2 = ((MediaCodecInfo.VideoCapabilities)localObject).getWidthAlignment();
            int i4 = ((MediaCodecInfo.VideoCapabilities)localObject).getHeightAlignment();
            localObject = new Point(v.bi(i3, i2) * i2, v.bi(i1, i4) * i4);
          }
        }
      }
      label143: label147: label204: label211: int i3 = v.bi(i1, 16) * 16;
      i2 = v.bi(i2, 16) * 16;
      if (i3 * i2 <= com.google.android.exoplayer2.e.d.rK())
      {
        if (i != 0)
        {
          j = i2;
          label325: if (i == 0)
            break label355;
        }
        while (true)
        {
          localObject = new Point(j, i3);
          AppMethodBeat.o(96027);
          break;
          j = i3;
          break label325;
          label355: i3 = i2;
        }
      }
      label362: n++;
      break label58;
      label368: localObject = null;
      AppMethodBeat.o(96027);
    }
  }

  private void a(MediaCodec paramMediaCodec, int paramInt)
  {
    AppMethodBeat.i(96017);
    com.google.android.exoplayer2.i.t.beginSection("skipVideoBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, false);
    com.google.android.exoplayer2.i.t.endSection();
    paramMediaCodec = this.beI;
    paramMediaCodec.aSg += 1;
    AppMethodBeat.o(96017);
  }

  @TargetApi(21)
  private void a(MediaCodec paramMediaCodec, int paramInt, long paramLong)
  {
    AppMethodBeat.i(96019);
    tW();
    com.google.android.exoplayer2.i.t.beginSection("releaseOutputBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, paramLong);
    com.google.android.exoplayer2.i.t.endSection();
    paramMediaCodec = this.beI;
    paramMediaCodec.aSf += 1;
    this.bsv = 0;
    tU();
    AppMethodBeat.o(96019);
  }

  private boolean aN(boolean paramBoolean)
  {
    AppMethodBeat.i(96020);
    if ((v.SDK_INT >= 23) && (!this.aQR) && ((!paramBoolean) || (DummySurface.aj(this.context))))
    {
      paramBoolean = true;
      AppMethodBeat.o(96020);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(96020);
    }
  }

  private static boolean as(long paramLong)
  {
    if (paramLong < -30000L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static int b(String paramString, int paramInt1, int paramInt2)
  {
    int i = 2;
    AppMethodBeat.i(96029);
    if ((paramInt1 == -1) || (paramInt2 == -1))
    {
      AppMethodBeat.o(96029);
      paramInt1 = -1;
      label26: return paramInt1;
    }
    label92: int j;
    switch (paramString.hashCode())
    {
    default:
      j = -1;
    case -1664118616:
    case 1187890754:
    case 1331836730:
    case 1599127256:
    case -1662541442:
    case 1599127257:
    }
    while (true)
      switch (j)
      {
      default:
        AppMethodBeat.o(96029);
        paramInt1 = -1;
        break label26;
        if (!paramString.equals("video/3gpp"))
          break label92;
        j = 0;
        continue;
        if (!paramString.equals("video/mp4v-es"))
          break label92;
        j = 1;
        continue;
        if (!paramString.equals("video/avc"))
          break label92;
        j = 2;
        continue;
        if (!paramString.equals("video/x-vnd.on2.vp8"))
          break label92;
        j = 3;
        continue;
        if (!paramString.equals("video/hevc"))
          break label92;
        j = 4;
        continue;
        if (!paramString.equals("video/x-vnd.on2.vp9"))
          break label92;
        j = 5;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
    paramInt1 *= paramInt2;
    paramInt2 = i;
    while (true)
    {
      paramInt1 = paramInt1 * 3 / (paramInt2 * 2);
      AppMethodBeat.o(96029);
      break;
      if ("BRAVIA 4K 2015".equals(v.MODEL))
      {
        AppMethodBeat.o(96029);
        paramInt1 = -1;
        break;
      }
      paramInt1 = v.bi(paramInt1, 16) * v.bi(paramInt2, 16) * 16 * 16;
      paramInt2 = i;
      continue;
      paramInt1 *= paramInt2;
      paramInt2 = i;
      continue;
      paramInt1 *= paramInt2;
      paramInt2 = 4;
    }
  }

  private void b(MediaCodec paramMediaCodec, int paramInt)
  {
    AppMethodBeat.i(96018);
    tW();
    com.google.android.exoplayer2.i.t.beginSection("releaseOutputBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, true);
    com.google.android.exoplayer2.i.t.endSection();
    paramMediaCodec = this.beI;
    paramMediaCodec.aSf += 1;
    this.bsv = 0;
    tU();
    AppMethodBeat.o(96018);
  }

  private static boolean b(boolean paramBoolean, Format paramFormat1, Format paramFormat2)
  {
    AppMethodBeat.i(96030);
    if ((paramFormat1.aOd.equals(paramFormat2.aOd)) && (m(paramFormat1) == m(paramFormat2)) && ((paramBoolean) || ((paramFormat1.width == paramFormat2.width) && (paramFormat1.height == paramFormat2.height))))
    {
      paramBoolean = true;
      AppMethodBeat.o(96030);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(96030);
    }
  }

  private static int l(Format paramFormat)
  {
    AppMethodBeat.i(96028);
    int k;
    if (paramFormat.aOe != -1)
    {
      int i = paramFormat.aOf.size();
      int j = 0;
      k = 0;
      while (j < i)
      {
        k += ((byte[])paramFormat.aOf.get(j)).length;
        j++;
      }
      k = paramFormat.aOe + k;
      AppMethodBeat.o(96028);
    }
    while (true)
    {
      return k;
      k = b(paramFormat.aOd, paramFormat.width, paramFormat.height);
      AppMethodBeat.o(96028);
    }
  }

  private static int m(Format paramFormat)
  {
    if (paramFormat.aOi == -1);
    for (int i = 0; ; i = paramFormat.aOi)
      return i;
  }

  private void tS()
  {
    AppMethodBeat.i(96021);
    if (this.bsi > 0L);
    for (long l = SystemClock.elapsedRealtime() + this.bsi; ; l = -9223372036854775807L)
    {
      this.bss = l;
      AppMethodBeat.o(96021);
      return;
    }
  }

  private void tT()
  {
    AppMethodBeat.i(96022);
    this.bsr = false;
    if ((v.SDK_INT >= 23) && (this.aQR))
    {
      MediaCodec localMediaCodec = this.bek;
      if (localMediaCodec != null)
        this.bsG = new c.b(this, localMediaCodec, (byte)0);
    }
    AppMethodBeat.o(96022);
  }

  private void tV()
  {
    this.bsC = -1;
    this.bsD = -1;
    this.bsF = -1.0F;
    this.bsE = -1;
  }

  private void tW()
  {
    AppMethodBeat.i(96024);
    if (((this.bsy != -1) || (this.bsz != -1)) && ((this.bsC != this.bsy) || (this.bsD != this.bsz) || (this.bsE != this.bsA) || (this.bsF != this.bsB)))
    {
      this.bsh.c(this.bsy, this.bsz, this.bsA, this.bsB);
      this.bsC = this.bsy;
      this.bsD = this.bsz;
      this.bsE = this.bsA;
      this.bsF = this.bsB;
    }
    AppMethodBeat.o(96024);
  }

  private void tX()
  {
    AppMethodBeat.i(96025);
    if ((this.bsC != -1) || (this.bsD != -1))
      this.bsh.c(this.bsC, this.bsD, this.bsE, this.bsF);
    AppMethodBeat.o(96025);
  }

  private void tY()
  {
    AppMethodBeat.i(96026);
    if (this.bsu > 0)
    {
      long l1 = SystemClock.elapsedRealtime();
      long l2 = this.bst;
      this.bsh.k(this.bsu, l1 - l2);
      this.bsu = 0;
      this.bst = l1;
    }
    AppMethodBeat.o(96026);
  }

  public final int a(com.google.android.exoplayer2.e.c paramc, Format paramFormat)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(95999);
    Object localObject1 = paramFormat.aOd;
    if (!i.aI((String)localObject1))
      AppMethodBeat.o(95999);
    Object localObject2;
    boolean bool1;
    boolean bool2;
    while (true)
    {
      return j;
      localObject2 = paramFormat.aOg;
      if (localObject2 != null)
      {
        j = 0;
        bool1 = false;
        while (true)
        {
          bool2 = bool1;
          if (j >= ((DrmInitData)localObject2).aSx)
            break;
          bool1 |= localObject2.aSw[j].aSy;
          j++;
        }
      }
      bool2 = false;
      paramc = paramc.e((String)localObject1, bool2);
      if (paramc != null)
        break;
      AppMethodBeat.o(95999);
      j = 1;
    }
    String str = paramFormat.aOa;
    if ((str == null) || (paramc.mimeType == null))
    {
      bool1 = true;
      label138: bool2 = bool1;
      if (bool1)
      {
        bool2 = bool1;
        if (paramFormat.width > 0)
        {
          bool2 = bool1;
          if (paramFormat.height > 0)
          {
            if (v.SDK_INT < 21)
              break label447;
            bool2 = paramc.a(paramFormat.width, paramFormat.height, paramFormat.aOh);
          }
        }
      }
      if (!paramc.bdX)
        break label536;
      j = 16;
      label207: if (paramc.aQR)
        i = 32;
      if (!bool2)
        break label543;
    }
    label408: label543: for (int k = 4; ; k = 3)
    {
      j = i | j | k;
      AppMethodBeat.o(95999);
      break;
      localObject2 = i.aK(str);
      if (localObject2 == null)
      {
        bool1 = true;
        break label138;
      }
      if (!paramc.mimeType.equals(localObject2))
      {
        paramc.ax("codec.mime " + str + ", " + (String)localObject2);
        bool1 = false;
        break label138;
      }
      localObject1 = com.google.android.exoplayer2.e.d.ay(str);
      if (localObject1 == null)
      {
        bool1 = true;
        break label138;
      }
      MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = paramc.rD();
      k = arrayOfCodecProfileLevel.length;
      for (j = 0; ; j++)
      {
        if (j >= k)
          break label408;
        MediaCodecInfo.CodecProfileLevel localCodecProfileLevel = arrayOfCodecProfileLevel[j];
        if ((localCodecProfileLevel.profile == ((Integer)((Pair)localObject1).first).intValue()) && (localCodecProfileLevel.level >= ((Integer)((Pair)localObject1).second).intValue()))
        {
          bool1 = true;
          break;
        }
      }
      paramc.ax("codec.profileLevel, " + str + ", " + (String)localObject2);
      bool1 = false;
      break label138;
      label447: if (paramFormat.width * paramFormat.height <= com.google.android.exoplayer2.e.d.rK());
      for (bool1 = true; ; bool1 = false)
      {
        bool2 = bool1;
        if (bool1)
          break;
        new StringBuilder("FalseCheck [legacyFrameSize, ").append(paramFormat.width).append("x").append(paramFormat.height).append("] [").append(v.brM).append("]");
        bool2 = bool1;
        break;
      }
      j = 8;
      break label207;
    }
  }

  public final void a(com.google.android.exoplayer2.e.a parama, MediaCodec paramMediaCodec, Format paramFormat, MediaCrypto paramMediaCrypto)
  {
    AppMethodBeat.i(96009);
    Object localObject = this.bsm;
    int i = paramFormat.width;
    int j = paramFormat.height;
    int k = l(paramFormat);
    if (localObject.length == 1)
    {
      localObject = new c.a(i, j, k);
      this.bsn = ((c.a)localObject);
      localObject = this.bsn;
      boolean bool = this.bsk;
      k = this.aOF;
      paramFormat = paramFormat.qc();
      paramFormat.setInteger("max-width", ((c.a)localObject).width);
      paramFormat.setInteger("max-height", ((c.a)localObject).height);
      if (((c.a)localObject).bsJ != -1)
        paramFormat.setInteger("max-input-size", ((c.a)localObject).bsJ);
      if (bool)
        paramFormat.setInteger("auto-frc", 0);
      if (k != 0)
      {
        paramFormat.setFeatureEnabled("tunneled-playback", true);
        paramFormat.setInteger("audio-session-id", k);
      }
      if (this.aOO == null)
      {
        com.google.android.exoplayer2.i.a.checkState(aN(parama.bdY));
        if (this.bsp == null)
          this.bsp = DummySurface.h(this.context, parama.bdY);
        this.aOO = this.bsp;
      }
      paramMediaCodec.configure(paramFormat, this.aOO, paramMediaCrypto, 0);
      if ((v.SDK_INT >= 23) && (this.aQR))
        this.bsG = new c.b(this, paramMediaCodec, (byte)0);
      AppMethodBeat.o(96009);
      return;
    }
    int m = 0;
    int n = localObject.length;
    int i1 = 0;
    label268: int i2;
    if (i1 < n)
    {
      Format localFormat = localObject[i1];
      if (!b(parama.bdX, paramFormat, localFormat))
        break label526;
      if ((localFormat.width == -1) || (localFormat.height == -1))
      {
        i2 = 1;
        label316: m = i2 | m;
        i = Math.max(i, localFormat.width);
        j = Math.max(j, localFormat.height);
        k = Math.max(k, l(localFormat));
      }
    }
    label526: 
    while (true)
    {
      i1++;
      break label268;
      i2 = 0;
      break label316;
      n = k;
      i2 = j;
      i1 = i;
      if (m != 0)
      {
        new StringBuilder("Resolutions unknown. Codec max resolution: ").append(i).append("x").append(j);
        localObject = a(parama, paramFormat);
        n = k;
        i2 = j;
        i1 = i;
        if (localObject != null)
        {
          i1 = Math.max(i, ((Point)localObject).x);
          i2 = Math.max(j, ((Point)localObject).y);
          n = Math.max(k, b(paramFormat.aOd, i1, i2));
          new StringBuilder("Codec max resolution adjusted to: ").append(i1).append("x").append(i2);
        }
      }
      localObject = new c.a(i1, i2, n);
      break;
    }
  }

  public final void a(Format[] paramArrayOfFormat, long paramLong)
  {
    AppMethodBeat.i(96001);
    this.bsm = paramArrayOfFormat;
    if (this.bsH == -9223372036854775807L)
    {
      this.bsH = paramLong;
      super.a(paramArrayOfFormat, paramLong);
      AppMethodBeat.o(96001);
      return;
    }
    if (this.bsI == this.bsl.length)
      new StringBuilder("Too many stream changes, so dropping offset: ").append(this.bsl[(this.bsI - 1)]);
    while (true)
    {
      this.bsl[(this.bsI - 1)] = paramLong;
      break;
      this.bsI += 1;
    }
  }

  public final boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong3, boolean paramBoolean)
  {
    AppMethodBeat.i(96016);
    while ((this.bsI != 0) && (paramLong3 >= this.bsl[0]))
    {
      this.bsH = this.bsl[0];
      this.bsI -= 1;
      System.arraycopy(this.bsl, 1, this.bsl, 0, this.bsI);
    }
    if (paramBoolean)
    {
      a(paramMediaCodec, paramInt1);
      paramBoolean = true;
      AppMethodBeat.o(96016);
    }
    while (true)
    {
      return paramBoolean;
      paramLong1 = paramLong3 - paramLong1;
      if (this.aOO == this.bsp)
      {
        if (as(paramLong1))
        {
          a(paramMediaCodec, paramInt1);
          paramBoolean = true;
          AppMethodBeat.o(96016);
        }
        else
        {
          paramBoolean = false;
          AppMethodBeat.o(96016);
        }
      }
      else
      {
        if (!this.bsr)
        {
          if (v.SDK_INT >= 21)
            a(paramMediaCodec, paramInt1, System.nanoTime());
          while (true)
          {
            paramBoolean = true;
            AppMethodBeat.o(96016);
            break;
            b(paramMediaCodec, paramInt1);
          }
        }
        if (this.state != 2)
        {
          paramBoolean = false;
          AppMethodBeat.o(96016);
        }
        else
        {
          long l1 = SystemClock.elapsedRealtime();
          long l2 = System.nanoTime();
          l1 = l2 + (paramLong1 - (l1 * 1000L - paramLong2)) * 1000L;
          paramByteBuffer = this.bsg;
          long l3 = paramLong3 * 1000L;
          if (paramByteBuffer.bsS)
          {
            if (paramLong3 != paramByteBuffer.bsP)
            {
              paramByteBuffer.bsV += 1L;
              paramByteBuffer.bsQ = paramByteBuffer.bsR;
            }
            if (paramByteBuffer.bsV >= 6L)
            {
              paramLong1 = (l3 - paramByteBuffer.bsU) / paramByteBuffer.bsV;
              paramLong2 = paramByteBuffer.bsQ + paramLong1;
              if (paramByteBuffer.m(paramLong2, l1))
              {
                paramByteBuffer.bsS = false;
                paramLong1 = l1;
                paramLong2 = l3;
              }
            }
          }
          while (true)
          {
            if (!paramByteBuffer.bsS)
            {
              paramByteBuffer.bsU = l3;
              paramByteBuffer.bsT = l1;
              paramByteBuffer.bsV = 0L;
              paramByteBuffer.bsS = true;
            }
            paramByteBuffer.bsP = paramLong3;
            paramByteBuffer.bsR = paramLong2;
            paramLong2 = paramLong1;
            if (paramByteBuffer.bsL != null)
            {
              if (paramByteBuffer.bsL.bsW != 0L)
                break label591;
              paramLong2 = paramLong1;
            }
            paramLong1 = (paramLong2 - l2) / 1000L;
            if (!as(paramLong1))
              break label675;
            com.google.android.exoplayer2.i.t.beginSection("dropVideoBuffer");
            paramMediaCodec.releaseOutputBuffer(paramInt1, false);
            com.google.android.exoplayer2.i.t.endSection();
            paramMediaCodec = this.beI;
            paramMediaCodec.aSh += 1;
            this.bsu += 1;
            this.bsv += 1;
            this.beI.aSi = Math.max(this.bsv, this.beI.aSi);
            if (this.bsu == this.bsj)
              tY();
            paramBoolean = true;
            AppMethodBeat.o(96016);
            break;
            paramLong1 = paramByteBuffer.bsT + paramLong2 - paramByteBuffer.bsU;
            continue;
            if (paramByteBuffer.m(l3, l1))
              paramByteBuffer.bsS = false;
            paramLong1 = l1;
            paramLong2 = l3;
          }
          label591: paramLong2 = paramByteBuffer.bsL.bsW;
          paramLong3 = paramByteBuffer.bsN;
          paramLong2 = (paramLong1 - paramLong2) / paramLong3 * paramLong3 + paramLong2;
          if (paramLong1 <= paramLong2)
          {
            paramLong3 = paramLong2 - paramLong3;
            label631: if (paramLong2 - paramLong1 >= paramLong1 - paramLong3)
              break label672;
            paramLong3 = paramLong2;
          }
          label672: 
          while (true)
          {
            paramLong2 = paramLong3 - paramByteBuffer.bsO;
            break;
            l1 = paramLong2 + paramLong3;
            paramLong3 = paramLong2;
            paramLong2 = l1;
            break label631;
          }
          label675: if (v.SDK_INT >= 21)
          {
            if (paramLong1 < 50000L)
            {
              a(paramMediaCodec, paramInt1, paramLong2);
              paramBoolean = true;
              AppMethodBeat.o(96016);
            }
          }
          else if (paramLong1 < 30000L)
          {
            if (paramLong1 > 11000L);
            try
            {
              Thread.sleep((paramLong1 - 10000L) / 1000L);
              b(paramMediaCodec, paramInt1);
              paramBoolean = true;
              AppMethodBeat.o(96016);
            }
            catch (InterruptedException paramByteBuffer)
            {
              while (true)
                Thread.currentThread().interrupt();
            }
          }
          else
          {
            paramBoolean = false;
            AppMethodBeat.o(96016);
          }
        }
      }
    }
  }

  public final boolean a(com.google.android.exoplayer2.e.a parama)
  {
    AppMethodBeat.i(96008);
    boolean bool;
    if ((this.aOO != null) || (aN(parama.bdY)))
    {
      bool = true;
      AppMethodBeat.o(96008);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(96008);
    }
  }

  public final boolean a(boolean paramBoolean, Format paramFormat1, Format paramFormat2)
  {
    AppMethodBeat.i(96015);
    if ((b(paramBoolean, paramFormat1, paramFormat2)) && (paramFormat2.width <= this.bsn.width) && (paramFormat2.height <= this.bsn.height) && (l(paramFormat2) <= this.bsn.bsJ))
    {
      paramBoolean = true;
      AppMethodBeat.o(96015);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(96015);
    }
  }

  public final void aD(boolean paramBoolean)
  {
    AppMethodBeat.i(96000);
    super.aD(paramBoolean);
    this.aOF = this.aMs.aOF;
    if (this.aOF != 0);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.aQR = paramBoolean;
      e.a locala = this.bsh;
      Object localObject = this.beI;
      if (locala.btb != null)
        locala.handler.post(new e.a.1(locala, (com.google.android.exoplayer2.b.d)localObject));
      localObject = this.bsg;
      ((d)localObject).bsS = false;
      if (((d)localObject).bsM)
        ((d)localObject).bsL.handler.sendEmptyMessage(1);
      AppMethodBeat.o(96000);
      return;
    }
  }

  public final void b(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(96002);
    super.b(paramLong, paramBoolean);
    tT();
    this.bsv = 0;
    if (this.bsI != 0)
    {
      this.bsH = this.bsl[(this.bsI - 1)];
      this.bsI = 0;
    }
    if (paramBoolean)
    {
      tS();
      AppMethodBeat.o(96002);
    }
    while (true)
    {
      return;
      this.bss = -9223372036854775807L;
      AppMethodBeat.o(96002);
    }
  }

  public final void c(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(96007);
    Object localObject;
    if (paramInt == 1)
    {
      localObject = (Surface)paramObject;
      paramObject = localObject;
      if (localObject == null)
      {
        if (this.bsp != null)
          paramObject = this.bsp;
      }
      else
      {
        if (this.aOO == paramObject)
          break label210;
        this.aOO = paramObject;
        paramInt = this.state;
        if ((paramInt == 1) || (paramInt == 2))
        {
          localObject = this.bek;
          if ((v.SDK_INT < 23) || (localObject == null) || (paramObject == null) || (this.bso))
            break label182;
          ((MediaCodec)localObject).setOutputSurface(paramObject);
        }
        label95: if ((paramObject == null) || (paramObject == this.bsp))
          break label193;
        tX();
        tT();
        if (paramInt != 2)
          break label201;
        tS();
        AppMethodBeat.o(96007);
      }
    }
    while (true)
    {
      return;
      com.google.android.exoplayer2.e.a locala = this.bel;
      paramObject = localObject;
      if (locala == null)
        break;
      paramObject = localObject;
      if (!aN(locala.bdY))
        break;
      this.bsp = DummySurface.h(this.context, locala.bdY);
      paramObject = this.bsp;
      break;
      label182: rF();
      rE();
      break label95;
      label193: tV();
      tT();
      label201: AppMethodBeat.o(96007);
      continue;
      label210: if ((paramObject != null) && (paramObject != this.bsp))
      {
        tX();
        if (this.bsr)
          this.bsh.d(this.aOO);
      }
      AppMethodBeat.o(96007);
      continue;
      if (paramInt == 4)
      {
        this.bsq = ((Integer)paramObject).intValue();
        paramObject = this.bek;
        if (paramObject != null)
          paramObject.setVideoScalingMode(this.bsq);
        AppMethodBeat.o(96007);
      }
      else
      {
        super.c(paramInt, paramObject);
        AppMethodBeat.o(96007);
      }
    }
  }

  public final void c(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(96011);
    e.a locala = this.bsh;
    if (locala.btb != null)
      locala.handler.post(new e.a.2(locala, paramString, paramLong1, paramLong2));
    if (((!"deb".equals(v.DEVICE)) && (!"flo".equals(v.DEVICE))) || (("OMX.qcom.video.decoder.avc".equals(paramString)) || (("tcl_eu".equals(v.DEVICE)) && ("OMX.MTK.VIDEO.DECODER.AVC".equals(paramString)))));
    for (boolean bool = true; ; bool = false)
    {
      this.bso = bool;
      AppMethodBeat.o(96011);
      return;
    }
  }

  public final void e(Format paramFormat)
  {
    AppMethodBeat.i(96012);
    super.e(paramFormat);
    e.a locala = this.bsh;
    if (locala.btb != null)
      locala.handler.post(new e.a.3(locala, paramFormat));
    if (paramFormat.aOj == -1.0F);
    for (float f = 1.0F; ; f = paramFormat.aOj)
    {
      this.bsx = f;
      this.bsw = m(paramFormat);
      AppMethodBeat.o(96012);
      return;
    }
  }

  public final boolean isReady()
  {
    boolean bool = true;
    AppMethodBeat.i(96003);
    if ((super.isReady()) && ((this.bsr) || ((this.bsp != null) && (this.aOO == this.bsp)) || (this.bek == null) || (this.aQR)))
    {
      this.bss = -9223372036854775807L;
      AppMethodBeat.o(96003);
    }
    while (true)
    {
      return bool;
      if (this.bss == -9223372036854775807L)
      {
        AppMethodBeat.o(96003);
        bool = false;
      }
      else if (SystemClock.elapsedRealtime() < this.bss)
      {
        AppMethodBeat.o(96003);
      }
      else
      {
        this.bss = -9223372036854775807L;
        AppMethodBeat.o(96003);
        bool = false;
      }
    }
  }

  public final void onOutputFormatChanged(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
  {
    AppMethodBeat.i(96014);
    int i;
    int j;
    if ((paramMediaFormat.containsKey("crop-right")) && (paramMediaFormat.containsKey("crop-left")) && (paramMediaFormat.containsKey("crop-bottom")) && (paramMediaFormat.containsKey("crop-top")))
    {
      i = 1;
      if (i == 0)
        break label187;
      j = paramMediaFormat.getInteger("crop-right") - paramMediaFormat.getInteger("crop-left") + 1;
      label71: this.bsy = j;
      if (i == 0)
        break label199;
      i = paramMediaFormat.getInteger("crop-bottom") - paramMediaFormat.getInteger("crop-top") + 1;
      label99: this.bsz = i;
      this.bsB = this.bsx;
      if (v.SDK_INT < 21)
        break label210;
      if ((this.bsw == 90) || (this.bsw == 270))
      {
        i = this.bsy;
        this.bsy = this.bsz;
        this.bsz = i;
        this.bsB = (1.0F / this.bsB);
      }
    }
    while (true)
    {
      paramMediaCodec.setVideoScalingMode(this.bsq);
      AppMethodBeat.o(96014);
      return;
      i = 0;
      break;
      label187: j = paramMediaFormat.getInteger("width");
      break label71;
      label199: i = paramMediaFormat.getInteger("height");
      break label99;
      label210: this.bsA = this.bsw;
    }
  }

  public final void onStarted()
  {
    AppMethodBeat.i(96004);
    super.onStarted();
    this.bsu = 0;
    this.bst = SystemClock.elapsedRealtime();
    AppMethodBeat.o(96004);
  }

  public final void onStopped()
  {
    AppMethodBeat.i(96005);
    this.bss = -9223372036854775807L;
    tY();
    super.onStopped();
    AppMethodBeat.o(96005);
  }

  public final void pK()
  {
    AppMethodBeat.i(96006);
    this.bsy = -1;
    this.bsz = -1;
    this.bsB = -1.0F;
    this.bsx = -1.0F;
    this.bsH = -9223372036854775807L;
    this.bsI = 0;
    tV();
    tT();
    d locald = this.bsg;
    if (locald.bsM)
      locald.bsL.handler.sendEmptyMessage(2);
    this.bsG = null;
    this.aQR = false;
    try
    {
      super.pK();
      return;
    }
    finally
    {
      this.bsh.e(this.beI);
      AppMethodBeat.o(96006);
    }
  }

  public final void rF()
  {
    AppMethodBeat.i(96010);
    while (true)
    {
      try
      {
        super.rF();
        return;
      }
      finally
      {
        if (this.bsp != null)
        {
          if (this.aOO == this.bsp)
            this.aOO = null;
          this.bsp.release();
          this.bsp = null;
        }
        AppMethodBeat.o(96010);
      }
      AppMethodBeat.o(96010);
    }
  }

  public final void rH()
  {
    AppMethodBeat.i(96013);
    if ((v.SDK_INT < 23) && (this.aQR))
      tU();
    AppMethodBeat.o(96013);
  }

  final void tU()
  {
    AppMethodBeat.i(96023);
    if (!this.bsr)
    {
      this.bsr = true;
      this.bsh.d(this.aOO);
    }
    AppMethodBeat.o(96023);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.video.c
 * JD-Core Version:    0.6.2
 */