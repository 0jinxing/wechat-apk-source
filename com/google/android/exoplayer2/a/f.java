package com.google.android.exoplayer2.a;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioFormat.Builder;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.p;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public final class f
{
  public static boolean aPT = false;
  public static boolean aPU = false;
  p aNg;
  int aOX;
  b aOY;
  private final c aPV;
  final g aPW;
  private final l aPX;
  final d[] aPY;
  final f.f aPZ;
  private long aQA;
  private long aQB;
  int aQC;
  int aQD;
  long aQE;
  private long aQF;
  private long aQG;
  float aQH;
  private d[] aQI;
  private ByteBuffer[] aQJ;
  ByteBuffer aQK;
  private ByteBuffer aQL;
  private byte[] aQM;
  private int aQN;
  private int aQO;
  boolean aQP;
  boolean aQQ;
  boolean aQR;
  boolean aQS;
  long aQT;
  final ConditionVariable aQa;
  private final long[] aQb;
  final f.a aQc;
  final LinkedList<f.g> aQd;
  AudioTrack aQe;
  AudioTrack aQf;
  int aQg;
  int aQh;
  boolean aQi;
  long aQj;
  p aQk;
  private long aQl;
  private long aQm;
  private ByteBuffer aQn;
  int aQo;
  private int aQp;
  private int aQq;
  private long aQr;
  private long aQs;
  private boolean aQt;
  private long aQu;
  private Method aQv;
  int aQw;
  long aQx;
  long aQy;
  int aQz;
  int bufferSize;
  int encoding;
  int sampleRate;

  public f(c paramc, d[] paramArrayOfd, f.f paramf)
  {
    AppMethodBeat.i(94674);
    this.aPV = paramc;
    this.aPZ = paramf;
    this.aQa = new ConditionVariable(true);
    if (v.SDK_INT >= 18);
    try
    {
      this.aQv = AudioTrack.class.getMethod("getLatency", null);
      label51: if (v.SDK_INT >= 19);
      for (this.aQc = new f.b(); ; this.aQc = new f.a((byte)0))
      {
        this.aPW = new g();
        this.aPX = new l();
        this.aPY = new d[paramArrayOfd.length + 3];
        this.aPY[0] = new j();
        this.aPY[1] = this.aPW;
        System.arraycopy(paramArrayOfd, 0, this.aPY, 2, paramArrayOfd.length);
        this.aPY[(paramArrayOfd.length + 2)] = this.aPX;
        this.aQb = new long[10];
        this.aQH = 1.0F;
        this.aQD = 0;
        this.aOY = b.aPz;
        this.aOX = 0;
        this.aNg = p.aOC;
        this.aQO = -1;
        this.aQI = new d[0];
        this.aQJ = new ByteBuffer[0];
        this.aQd = new LinkedList();
        AppMethodBeat.o(94674);
        return;
      }
    }
    catch (NoSuchMethodException paramc)
    {
      break label51;
    }
  }

  private long I(long paramLong)
  {
    AppMethodBeat.i(94687);
    while ((!this.aQd.isEmpty()) && (paramLong >= ((f.g)this.aQd.getFirst()).aNT))
    {
      f.g localg = (f.g)this.aQd.remove();
      this.aNg = localg.aNg;
      this.aQm = localg.aNT;
      this.aQl = (localg.aRi - this.aQE);
    }
    if (this.aNg.speed == 1.0F)
    {
      paramLong = this.aQl + paramLong - this.aQm;
      AppMethodBeat.o(94687);
    }
    while (true)
    {
      return paramLong;
      if ((this.aQd.isEmpty()) && (this.aPX.aRW >= 1024L))
      {
        long l = this.aQl;
        paramLong = v.b(paramLong - this.aQm, this.aPX.aRV, this.aPX.aRW) + l;
        AppMethodBeat.o(94687);
      }
      else
      {
        paramLong = this.aQl + ()(this.aNg.speed * (paramLong - this.aQm));
        AppMethodBeat.o(94687);
      }
    }
  }

  @TargetApi(21)
  private int a(AudioTrack paramAudioTrack, ByteBuffer paramByteBuffer, int paramInt, long paramLong)
  {
    AppMethodBeat.i(94690);
    if (this.aQn == null)
    {
      this.aQn = ByteBuffer.allocate(16);
      this.aQn.order(ByteOrder.BIG_ENDIAN);
      this.aQn.putInt(1431633921);
    }
    if (this.aQo == 0)
    {
      this.aQn.putInt(4, paramInt);
      this.aQn.putLong(8, 1000L * paramLong);
      this.aQn.position(0);
      this.aQo = paramInt;
    }
    int i = this.aQn.remaining();
    int j;
    if (i > 0)
    {
      j = paramAudioTrack.write(this.aQn, i, 1);
      if (j < 0)
      {
        this.aQo = 0;
        AppMethodBeat.o(94690);
        paramInt = j;
      }
    }
    while (true)
    {
      return paramInt;
      if (j < i)
      {
        AppMethodBeat.o(94690);
        paramInt = 0;
      }
      else
      {
        paramInt = paramAudioTrack.write(paramByteBuffer, paramInt, 1);
        if (paramInt < 0)
        {
          this.aQo = 0;
          AppMethodBeat.o(94690);
        }
        else
        {
          this.aQo -= paramInt;
          AppMethodBeat.o(94690);
        }
      }
    }
  }

  static int au(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(94689);
    int j = -1;
    switch (paramString.hashCode())
    {
    default:
      switch (j)
      {
      default:
        AppMethodBeat.o(94689);
        j = i;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      break;
    case 187078296:
    case 1504578661:
    case -1095064472:
    case 1505942594:
    }
    while (true)
    {
      return j;
      if (!paramString.equals("audio/ac3"))
        break;
      j = 0;
      break;
      if (!paramString.equals("audio/eac3"))
        break;
      j = 1;
      break;
      if (!paramString.equals("audio/vnd.dts"))
        break;
      j = 2;
      break;
      if (!paramString.equals("audio/vnd.dts.hd"))
        break;
      j = 3;
      break;
      j = 5;
      AppMethodBeat.o(94689);
      continue;
      j = 6;
      AppMethodBeat.o(94689);
      continue;
      j = 7;
      AppMethodBeat.o(94689);
      continue;
      j = 8;
      AppMethodBeat.o(94689);
    }
  }

  final void H(long paramLong)
  {
    AppMethodBeat.i(94679);
    int i = this.aQI.length;
    int j = i;
    ByteBuffer localByteBuffer;
    if (j >= 0)
      if (j > 0)
      {
        localByteBuffer = this.aQJ[(j - 1)];
        label36: if (j != i)
          break label89;
        a(localByteBuffer, paramLong);
        label50: if (!localByteBuffer.hasRemaining())
          break label139;
        AppMethodBeat.o(94679);
      }
    while (true)
    {
      return;
      if (this.aQK != null)
      {
        localByteBuffer = this.aQK;
        break label36;
      }
      localByteBuffer = d.aPG;
      break label36;
      label89: Object localObject = this.aQI[j];
      ((d)localObject).g(localByteBuffer);
      localObject = ((d)localObject).qm();
      this.aQJ[j] = localObject;
      if (!((ByteBuffer)localObject).hasRemaining())
        break label50;
      j++;
      break;
      label139: j--;
      break;
      AppMethodBeat.o(94679);
    }
  }

  final long J(long paramLong)
  {
    return 1000000L * paramLong / this.sampleRate;
  }

  final long K(long paramLong)
  {
    return this.sampleRate * paramLong / 1000000L;
  }

  final boolean a(ByteBuffer paramByteBuffer, long paramLong)
  {
    boolean bool1 = true;
    AppMethodBeat.i(94680);
    boolean bool2;
    if (!paramByteBuffer.hasRemaining())
    {
      AppMethodBeat.o(94680);
      bool2 = bool1;
      return bool2;
    }
    label47: label52: int i;
    int j;
    int k;
    if (this.aQL != null)
      if (this.aQL == paramByteBuffer)
      {
        bool2 = true;
        a.checkArgument(bool2);
        i = paramByteBuffer.remaining();
        if (v.SDK_INT >= 21)
          break label278;
        j = (int)(this.aQA - this.aQc.qx() * this.aQz);
        j = this.bufferSize - j;
        if (j <= 0)
          break label417;
        j = Math.min(i, j);
        k = this.aQf.write(this.aQM, this.aQN, j);
        j = k;
        if (k > 0)
        {
          this.aQN += k;
          paramByteBuffer.position(paramByteBuffer.position() + k);
          j = k;
        }
      }
    while (true)
    {
      this.aQT = SystemClock.elapsedRealtime();
      if (j < 0)
      {
        paramByteBuffer = new f.h(j);
        AppMethodBeat.o(94680);
        throw paramByteBuffer;
        bool2 = false;
        break label47;
        this.aQL = paramByteBuffer;
        if (v.SDK_INT >= 21)
          break label52;
        j = paramByteBuffer.remaining();
        if ((this.aQM == null) || (this.aQM.length < j))
          this.aQM = new byte[j];
        k = paramByteBuffer.position();
        paramByteBuffer.get(this.aQM, 0, j);
        paramByteBuffer.position(k);
        this.aQN = 0;
        break label52;
        label278: if (this.aQR)
        {
          if (paramLong != -9223372036854775807L);
          for (bool2 = true; ; bool2 = false)
          {
            a.checkState(bool2);
            j = a(this.aQf, paramByteBuffer, i, paramLong);
            break;
          }
        }
        j = this.aQf.write(paramByteBuffer, i, 1);
        continue;
      }
      if (!this.aQi)
        this.aQA += j;
      if (j == i)
      {
        if (this.aQi)
          this.aQB += this.aQC;
        this.aQL = null;
        AppMethodBeat.o(94680);
        bool2 = bool1;
        break;
      }
      AppMethodBeat.o(94680);
      bool2 = false;
      break;
      label417: j = 0;
    }
  }

  public final long aI(boolean paramBoolean)
  {
    AppMethodBeat.i(94676);
    int i;
    long l1;
    if ((isInitialized()) && (this.aQD != 0))
    {
      i = 1;
      if (i != 0)
        break label43;
      l1 = -9223372036854775808L;
      AppMethodBeat.o(94676);
    }
    while (true)
    {
      return l1;
      i = 0;
      break;
      label43: long l3;
      long l4;
      Object localObject;
      if (this.aQf.getPlayState() == 3)
      {
        l2 = this.aQc.qy();
        if (l2 != 0L)
        {
          l3 = System.nanoTime() / 1000L;
          if (l3 - this.aQs >= 30000L)
          {
            this.aQb[this.aQp] = (l2 - l3);
            this.aQp = ((this.aQp + 1) % 10);
            if (this.aQq < 10)
              this.aQq += 1;
            this.aQs = l3;
            this.aQr = 0L;
            for (i = 0; i < this.aQq; i++)
              this.aQr += this.aQb[i] / this.aQq;
          }
          if ((!qv()) && (l3 - this.aQu >= 500000L))
          {
            this.aQt = this.aQc.qz();
            if (this.aQt)
            {
              l1 = this.aQc.qA() / 1000L;
              l4 = this.aQc.qB();
              if (l1 < this.aQF)
                break label674;
              if (Math.abs(l1 - l3) <= 5000000L)
                break label551;
              localObject = "Spurious audio timestamp (system clock mismatch): " + l4 + ", " + l1 + ", " + l3 + ", " + l2 + ", " + qs() + ", " + qt();
              if (aPU)
              {
                localObject = new f.e((String)localObject);
                AppMethodBeat.o(94676);
                throw ((Throwable)localObject);
              }
              this.aQt = false;
            }
            label379: if ((this.aQv == null) || (this.aQi));
          }
        }
      }
      try
      {
        this.aQG = (((Integer)this.aQv.invoke(this.aQf, null)).intValue() * 1000L - this.aQj);
        this.aQG = Math.max(this.aQG, 0L);
        if (this.aQG > 5000000L)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("Ignoring impossibly large audio latency: ");
          ((StringBuilder)localObject).append(this.aQG);
          this.aQG = 0L;
        }
        this.aQu = l3;
        l1 = System.nanoTime() / 1000L;
        if (this.aQt)
        {
          l1 = J(K(l1 - this.aQc.qA() / 1000L) + this.aQc.qB());
          l2 = this.aQE;
          l1 = I(l1) + l2;
          AppMethodBeat.o(94676);
          continue;
          label551: if (Math.abs(J(l4) - l2) <= 5000000L)
            break label379;
          localObject = "Spurious audio timestamp (frame position mismatch): " + l4 + ", " + l1 + ", " + l3 + ", " + l2 + ", " + qs() + ", " + qt();
          if (aPU)
          {
            localObject = new f.e((String)localObject);
            AppMethodBeat.o(94676);
            throw ((Throwable)localObject);
          }
          label674: this.aQt = false;
        }
      }
      catch (Exception localException)
      {
        while (true)
          this.aQv = null;
      }
    }
    if (this.aQq == 0);
    for (long l2 = this.aQc.qy(); ; l2 = l1 + this.aQr)
    {
      l1 = l2;
      if (paramBoolean)
        break;
      l1 = l2 - this.aQG;
      break;
    }
  }

  public final boolean at(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(94675);
    int i;
    if (this.aPV != null)
    {
      c localc = this.aPV;
      i = au(paramString);
      if (Arrays.binarySearch(localc.aPE, i) >= 0)
      {
        i = 1;
        if (i == 0)
          break label60;
        AppMethodBeat.o(94675);
      }
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label60: AppMethodBeat.o(94675);
      bool = false;
    }
  }

  public final p b(p paramp)
  {
    AppMethodBeat.i(94683);
    if (this.aQi)
    {
      this.aNg = p.aOC;
      paramp = this.aNg;
      AppMethodBeat.o(94683);
      return paramp;
    }
    Object localObject = this.aPX;
    ((l)localObject).speed = v.h(paramp.speed, 0.1F, 8.0F);
    float f1 = ((l)localObject).speed;
    localObject = this.aPX;
    float f2 = paramp.pitch;
    ((l)localObject).pitch = v.h(f2, 0.1F, 8.0F);
    localObject = new p(f1, f2);
    if (this.aQk != null)
    {
      paramp = this.aQk;
      label109: if (!((p)localObject).equals(paramp))
      {
        if (!isInitialized())
          break label178;
        this.aQk = ((p)localObject);
      }
    }
    while (true)
    {
      paramp = this.aNg;
      AppMethodBeat.o(94683);
      break;
      if (!this.aQd.isEmpty())
      {
        paramp = ((f.g)this.aQd.getLast()).aNg;
        break label109;
      }
      paramp = this.aNg;
      break label109;
      label178: this.aNg = ((p)localObject);
    }
  }

  final boolean isInitialized()
  {
    if (this.aQf != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void play()
  {
    AppMethodBeat.i(94678);
    this.aQQ = true;
    if (isInitialized())
    {
      this.aQF = (System.nanoTime() / 1000L);
      this.aQf.play();
    }
    AppMethodBeat.o(94678);
  }

  final void qn()
  {
    AppMethodBeat.i(94677);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = this.aPY;
    int i = localObject1.length;
    int j = 0;
    if (j < i)
    {
      Object localObject2 = localObject1[j];
      if (localObject2.isActive())
        localArrayList.add(localObject2);
      while (true)
      {
        j++;
        break;
        localObject2.flush();
      }
    }
    i = localArrayList.size();
    this.aQI = ((d[])localArrayList.toArray(new d[i]));
    this.aQJ = new ByteBuffer[i];
    for (j = 0; j < i; j++)
    {
      localObject1 = this.aQI[j];
      ((d)localObject1).flush();
      this.aQJ[j] = ((d)localObject1).qm();
    }
    AppMethodBeat.o(94677);
  }

  final boolean qo()
  {
    boolean bool = false;
    AppMethodBeat.i(94681);
    int i;
    if (this.aQO == -1)
      if (this.aQi)
      {
        i = this.aQI.length;
        this.aQO = i;
        i = 1;
      }
    while (true)
    {
      label36: if (this.aQO < this.aQI.length)
      {
        d locald = this.aQI[this.aQO];
        if (i != 0)
          locald.ql();
        H(-9223372036854775807L);
        if (!locald.qf())
          AppMethodBeat.o(94681);
      }
      while (true)
      {
        return bool;
        i = 0;
        break;
        this.aQO += 1;
        i = 1;
        break label36;
        if (this.aQL != null)
        {
          a(this.aQL, -9223372036854775807L);
          if (this.aQL != null)
            AppMethodBeat.o(94681);
        }
        else
        {
          this.aQO = -1;
          AppMethodBeat.o(94681);
          bool = true;
        }
      }
      i = 0;
    }
  }

  public final boolean qp()
  {
    boolean bool = true;
    AppMethodBeat.i(94682);
    int i;
    if (isInitialized())
      if (qt() <= this.aQc.qx())
      {
        if ((qv()) && (this.aQf.getPlayState() == 2) && (this.aQf.getPlaybackHeadPosition() == 0))
        {
          i = 1;
          if (i == 0)
            break label77;
        }
      }
      else
        AppMethodBeat.o(94682);
    while (true)
    {
      return bool;
      i = 0;
      break;
      label77: AppMethodBeat.o(94682);
      bool = false;
    }
  }

  final void qq()
  {
    AppMethodBeat.i(94684);
    if (isInitialized())
      if (v.SDK_INT >= 21)
      {
        this.aQf.setVolume(this.aQH);
        AppMethodBeat.o(94684);
      }
    while (true)
    {
      return;
      AudioTrack localAudioTrack = this.aQf;
      float f = this.aQH;
      localAudioTrack.setStereoVolume(f, f);
      AppMethodBeat.o(94684);
    }
  }

  final void qr()
  {
    AppMethodBeat.i(94686);
    if (this.aQe == null)
      AppMethodBeat.o(94686);
    while (true)
    {
      return;
      final AudioTrack localAudioTrack = this.aQe;
      this.aQe = null;
      new Thread()
      {
        public final void run()
        {
          AppMethodBeat.i(94661);
          localAudioTrack.release();
          AppMethodBeat.o(94661);
        }
      }
      .start();
      AppMethodBeat.o(94686);
    }
  }

  final long qs()
  {
    if (this.aQi);
    for (long l = this.aQy; ; l = this.aQx / this.aQw)
      return l;
  }

  final long qt()
  {
    if (this.aQi);
    for (long l = this.aQB; ; l = this.aQA / this.aQz)
      return l;
  }

  final void qu()
  {
    this.aQr = 0L;
    this.aQq = 0;
    this.aQp = 0;
    this.aQs = 0L;
    this.aQt = false;
    this.aQu = 0L;
  }

  final boolean qv()
  {
    if ((v.SDK_INT < 23) && ((this.aQh == 5) || (this.aQh == 6)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final AudioTrack qw()
  {
    AppMethodBeat.i(94688);
    Object localObject;
    if (v.SDK_INT >= 21)
      if (this.aQR)
        localObject = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    while (true)
    {
      AudioFormat localAudioFormat = new AudioFormat.Builder().setChannelMask(this.aQg).setEncoding(this.aQh).setSampleRate(this.sampleRate).build();
      int i;
      if (this.aOX != 0)
      {
        i = this.aOX;
        label89: localObject = new AudioTrack((AudioAttributes)localObject, localAudioFormat, this.bufferSize, 1, i);
        label105: i = ((AudioTrack)localObject).getState();
        if (i == 1)
          break label288;
      }
      try
      {
        ((AudioTrack)localObject).release();
        label119: localObject = new d(i, this.sampleRate, this.aQg, this.bufferSize);
        AppMethodBeat.o(94688);
        throw ((Throwable)localObject);
        localObject = this.aOY;
        if (((b)localObject).aPC == null)
          ((b)localObject).aPC = new AudioAttributes.Builder().setContentType(((b)localObject).aPA).setFlags(((b)localObject).flags).setUsage(((b)localObject).aPB).build();
        localObject = ((b)localObject).aPC;
        continue;
        i = 0;
        break label89;
        i = v.eS(this.aOY.aPB);
        if (this.aOX == 0)
        {
          localObject = new AudioTrack(i, this.sampleRate, this.aQg, this.aQh, this.bufferSize, 1);
          break label105;
        }
        localObject = new AudioTrack(i, this.sampleRate, this.aQg, this.aQh, this.bufferSize, 1, this.aOX);
        break label105;
        label288: AppMethodBeat.o(94688);
        return localObject;
      }
      catch (Exception localException)
      {
        break label119;
      }
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(94685);
    if (isInitialized())
    {
      this.aQx = 0L;
      this.aQy = 0L;
      this.aQA = 0L;
      this.aQB = 0L;
      this.aQC = 0;
      if (this.aQk != null)
      {
        this.aNg = this.aQk;
        this.aQk = null;
      }
      while (true)
      {
        this.aQd.clear();
        this.aQl = 0L;
        this.aQm = 0L;
        this.aQK = null;
        this.aQL = null;
        for (int i = 0; i < this.aQI.length; i++)
        {
          localObject = this.aQI[i];
          ((d)localObject).flush();
          this.aQJ[i] = ((d)localObject).qm();
        }
        if (!this.aQd.isEmpty())
          this.aNg = ((f.g)this.aQd.getLast()).aNg;
      }
      this.aQP = false;
      this.aQO = -1;
      this.aQn = null;
      this.aQo = 0;
      this.aQD = 0;
      this.aQG = 0L;
      qu();
      if (this.aQf.getPlayState() == 3)
        this.aQf.pause();
      Object localObject = this.aQf;
      this.aQf = null;
      this.aQc.a(null, false);
      this.aQa.close();
      new f.1(this, (AudioTrack)localObject).start();
    }
    AppMethodBeat.o(94685);
  }

  public static final class d extends Exception
  {
    public final int aRh;

    public d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super();
      AppMethodBeat.i(94672);
      this.aRh = paramInt1;
      AppMethodBeat.o(94672);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.f
 * JD-Core Version:    0.6.2
 */