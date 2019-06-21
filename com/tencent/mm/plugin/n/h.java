package com.tencent.mm.plugin.n;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Message;
import android.util.Pair;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.List;

public abstract class h
{
  private static long orR = 0L;
  private ByteBuffer[] aQJ;
  private MediaCodec.BufferInfo beh = new MediaCodec.BufferInfo();
  private int bew;
  private int bex;
  long bfi;
  protected long bfp;
  protected long bgY;
  MediaExtractor clX;
  private String clY;
  protected MediaCodec eTq;
  protected FileDescriptor fd;
  private ByteBuffer[] inputBuffers;
  private volatile Object lock = new Object();
  protected g orH;
  protected ak orI;
  private boolean orJ = false;
  b orK = null;
  protected long orL = 0L;
  MediaFormat orM;
  int orN;
  private f orO;
  private boolean orP = false;
  private boolean orQ = false;
  protected String path;
  protected int state;

  public h(g paramg, ak paramak)
  {
    this.orH = paramg;
    this.orI = paramak;
    this.state = 0;
    this.bew = -1;
    this.bex = -1;
  }

  private void bOX()
  {
    if (this.orK != null)
      this.orL = (this.orK.bOR() * 1000L);
  }

  private boolean h(long paramLong1, long paramLong2)
  {
    ab.d("MicroMsg.TrackDataSource", "%s drain output buffer time[%d %d] index %d", new Object[] { aZm(), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(this.bex) });
    if (this.bex < 0);
    while (true)
    {
      synchronized (this.lock)
      {
        this.bex = this.eTq.dequeueOutputBuffer(this.beh, orR);
        if (this.bex < 0)
          break label301;
        if ((this.beh.flags & 0x4) != 0)
        {
          ab.i("MicroMsg.TrackDataSource", "%s process end of stream", new Object[] { aZm() });
          setState(9);
          this.bex = -1;
          bool = false;
          return bool;
        }
      }
      ??? = this.aQJ[this.bex];
      if (??? != null)
      {
        ((ByteBuffer)???).position(this.beh.offset);
        ((ByteBuffer)???).limit(this.beh.offset + this.beh.size);
      }
      if (this.state == 1);
      for (int i = 1; ; i = 0)
      {
        while (true)
        {
          if (i != 0)
            setState(2);
          ab.d("MicroMsg.TrackDataSource", "%s process output buffer index %d ", new Object[] { aZm(), Integer.valueOf(this.bex) });
          synchronized (this.lock)
          {
            if (!a(paramLong1, paramLong2, this.eTq, this.aQJ[this.bex], this.bex, this.beh))
              break;
            this.bex = -1;
            bool = true;
          }
        }
        label301: if (this.bex == -2)
        {
          this.orM = this.eTq.getOutputFormat();
          c(this.eTq);
          bool = true;
          break;
        }
        if (this.bex == -3)
        {
          this.aQJ = this.eTq.getOutputBuffers();
          bool = true;
          break;
        }
        ab.d("MicroMsg.TrackDataSource", "%s drain output buffer error outputIndex[%d]", new Object[] { aZm(), Integer.valueOf(this.bex) });
        bool = false;
        break;
      }
      boolean bool = false;
    }
  }

  private boolean rG()
  {
    ab.d("MicroMsg.TrackDataSource", "%s start to feed input buffer index %d [%d, %b]", new Object[] { aZm(), Integer.valueOf(this.bew), Integer.valueOf(this.state), Boolean.valueOf(this.orJ) });
    if ((d.yD(this.state)) || (this.orJ))
      ab.i("MicroMsg.TrackDataSource", "%s feed input buffer is end.", new Object[] { aZm() });
    long l1;
    long l2;
    while (true)
    {
      return false;
      if (this.bew < 0)
      {
        this.bew = this.eTq.dequeueInputBuffer(0L);
        if (this.bew < 0)
          ab.d("MicroMsg.TrackDataSource", "%s can not dequeue effect input buffer", new Object[] { aZm() });
      }
      else
      {
        Object localObject = this.inputBuffers[this.bew];
        int i;
        int j;
        if (this.orO != null)
        {
          i = this.orO.J((ByteBuffer)localObject);
          l1 = this.orO.oru.gkq;
          j = this.orO.oru.gkr;
          ab.d("MicroMsg.TrackDataSource", "%s read data index[%d, %d] sample info[%d, %d]", new Object[] { aZm(), Integer.valueOf(this.bew), Integer.valueOf(i), Long.valueOf(l1), Integer.valueOf(j) });
          if (i <= 0)
          {
            this.eTq.queueInputBuffer(this.bew, 0, 0, 0L, 4);
            this.orJ = true;
          }
          else
          {
            this.eTq.queueInputBuffer(this.bew, 0, i, l1, 0);
            this.bew = -1;
            localObject = this.orO;
            ((f)localObject).orv += 1;
            if (((f)localObject).orv < ((f)localObject).orw)
            {
              ((f)localObject).oru = ((com.tencent.mm.plugin.a.g)((f)localObject).gkn.get(((f)localObject).orv));
              ab.d("MicroMsg.Mp4Extractor", "curr sample [%s]", new Object[] { ((f)localObject).oru });
            }
          }
        }
        else if (this.orH.orE)
        {
          this.eTq.queueInputBuffer(this.bew, 0, 0, this.bfi * 1000L, 4);
          this.orJ = true;
          this.orH.orE = false;
        }
        else
        {
          j = 0;
          l2 = 0L;
          int k = 0;
          l1 = l2;
          try
          {
            i = this.clX.readSampleData((ByteBuffer)localObject, 0);
            j = i;
            l1 = l2;
            l2 = this.clX.getSampleTime();
            j = i;
            l1 = l2;
            int m = this.clX.getSampleFlags();
            j = m;
            l1 = l2;
            k = i;
            i = j;
            ab.d("MicroMsg.TrackDataSource", "%s read data index[%d, %d] sample info[%d, %d]", new Object[] { aZm(), Integer.valueOf(this.bew), Integer.valueOf(k), Long.valueOf(l1), Integer.valueOf(i) });
            R(i, l1);
            if (k <= 0)
            {
              this.eTq.queueInputBuffer(this.bew, 0, 0, this.bfi * 1000L, 4);
              this.orJ = true;
            }
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.TrackDataSource", localException, "MediaExtractor get sample data error: %s", new Object[] { localException.getMessage() });
              i = k;
              k = j;
            }
            this.eTq.queueInputBuffer(this.bew, 0, k, l1, 0);
            this.bew = -1;
            this.clX.advance();
            l2 = this.clX.getSampleTime();
            if (this.orH.llJ)
              break label791;
          }
        }
      }
    }
    long l3;
    if (N(l1, l2))
    {
      ab.w("MicroMsg.TrackDataSource", "%s feed input buffer isOnlineVideo[%b] next[%d] onlineCacheMs[%d]", new Object[] { aZm(), Boolean.valueOf(this.orH.llJ), Long.valueOf(l2), Long.valueOf(this.orL) });
      l3 = this.clX.getSampleTime();
      if (Math.abs(l3 - l1) >= 1000000L)
      {
        ab.w("MicroMsg.TrackDataSource", "%s reset extractor finish but seek time is not right[%d, %d]", new Object[] { aZm(), Long.valueOf(l3), Long.valueOf(l1) });
        this.orH.orE = true;
      }
    }
    while (true)
    {
      ab.d("MicroMsg.TrackDataSource", "%s finish to feed input buffer [%d, %d]", new Object[] { aZm(), Long.valueOf(l1), Long.valueOf(l2) });
      break;
      label791: if (this.orL == 0L)
      {
        if (N(l1, l2))
        {
          ab.w("MicroMsg.TrackDataSource", "%s feed input buffer next[%d] onlineCacheMs[%d]", new Object[] { aZm(), Long.valueOf(l2), Long.valueOf(this.orL) });
          l3 = this.clX.getSampleTime();
          if (Math.abs(l3 - l1) >= 3000000L)
          {
            ab.w("MicroMsg.TrackDataSource", "%s reset extractor finish but seek time is not right[%d, %d]", new Object[] { aZm(), Long.valueOf(l3), Long.valueOf(l1) });
            this.orI.obtainMessage(5, -2, -2).sendToTarget();
          }
          bOX();
        }
      }
      else if ((l2 < 0L) || (l2 / 1000L + 1200L > this.orL))
      {
        ab.w("MicroMsg.TrackDataSource", "%s feed input buffer next[%d] onlineCacheMs[%d]", new Object[] { aZm(), Long.valueOf(l2), Long.valueOf(this.orL) });
        if (N(l1, -1L))
          this.orI.obtainMessage(5, -3, -3).sendToTarget();
        bOX();
      }
    }
  }

  protected final int M(long paramLong1, long paramLong2)
  {
    ab.d("MicroMsg.TrackDataSource", "%s start to do some work time[%d %d] state %d", new Object[] { aZm(), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(this.state) });
    if (this.eTq != null);
    Object localObject;
    try
    {
      boolean bool;
      do
      {
        if (!h(paramLong1, paramLong2))
          break;
        bool = d.yD(this.state);
      }
      while (!bool);
    }
    catch (Exception localException1)
    {
      try
      {
        rG();
        ab.d("MicroMsg.TrackDataSource", "%s finish to do some work. state %d", new Object[] { aZm(), Integer.valueOf(this.state) });
        return this.state;
        localException1 = localException1;
        if (this.orP)
          ab.e("MicroMsg.TrackDataSource", "%s do some work drain output buffer error %s", new Object[] { aZm(), localException1.toString() });
        while (true)
        {
          if (!d.yD(this.state))
            bOY();
          g localg = this.orH;
          localObject = type();
          if ((localg.orG) || (!localg.orD))
            break;
          com.tencent.mm.plugin.report.service.h.pYm.a(354L, 158L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.e(13836, new Object[] { Integer.valueOf(506), Long.valueOf(bo.anT()), localObject });
          localg.orG = true;
          break;
          this.orP = true;
          ab.printErrStackTrace("MicroMsg.TrackDataSource", localg, "%s do some work drain output buffer error", new Object[] { aZm() });
        }
      }
      catch (Exception localException2)
      {
        if (!this.orQ)
          break label415;
      }
    }
    ab.e("MicroMsg.TrackDataSource", "%s do some work feed input buffer error %s", new Object[] { aZm(), localException2.toString() });
    while (true)
    {
      if (!d.yD(this.state))
        bOY();
      localObject = this.orH;
      String str = type();
      if ((((g)localObject).orF) || (!((g)localObject).orD))
        break;
      com.tencent.mm.plugin.report.service.h.pYm.a(354L, 157L, 1L, false);
      com.tencent.mm.plugin.report.service.h.pYm.e(13836, new Object[] { Integer.valueOf(505), Long.valueOf(bo.anT()), str });
      ((g)localObject).orF = true;
      break;
      label415: this.orQ = true;
      ab.printErrStackTrace("MicroMsg.TrackDataSource", str, "%s do some work feed input buffer error", new Object[] { aZm() });
    }
  }

  protected final boolean N(long paramLong1, long paramLong2)
  {
    long l1 = bo.yz();
    try
    {
      if ((paramLong1 / 1000L + 1000L < this.bfi) && (paramLong2 == -1L))
      {
        this.orH.llI = true;
        this.orJ = false;
        this.clX.release();
        Object localObject = new android/media/MediaExtractor;
        ((MediaExtractor)localObject).<init>();
        this.clX = ((MediaExtractor)localObject);
        if (bo.isNullOrNil(this.path))
          break label270;
        localObject = e.ck(this.path, false);
        FileDescriptor localFileDescriptor = ((RandomAccessFile)localObject).getFD();
        if (q.ete.euc == 1)
          this.clX.setDataSource(localFileDescriptor, 0L, e.asZ(this.path));
        while (true)
        {
          ((RandomAccessFile)localObject).close();
          this.clX.selectTrack(this.orN);
          this.clX.seekTo(paramLong1, 2);
          long l2 = this.clX.getSampleTime();
          ab.w("MicroMsg.TrackDataSource", "%s it don't play end. currTime[%d] afterSeek[%d] nextSampleTime[%d] onlineCacheMs[%d] cost[%d]", new Object[] { aZm(), Long.valueOf(paramLong1), Long.valueOf(l2), Long.valueOf(paramLong2), Long.valueOf(this.orL), Long.valueOf(bo.az(l1)) });
          bool = true;
          return bool;
          this.clX.setDataSource(localFileDescriptor);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.TrackDataSource", "%s reset extractor error %s", new Object[] { aZm(), localException.toString() });
        boolean bool = false;
        continue;
        label270: if ((this.fd != null) && (this.fd.valid()))
          this.clX.setDataSource(this.fd, this.bfp, this.bgY);
      }
    }
  }

  protected boolean R(int paramInt, long paramLong)
  {
    return false;
  }

  public final void a(FileDescriptor paramFileDescriptor, long paramLong1, long paramLong2)
  {
    this.fd = paramFileDescriptor;
    this.bfp = paramLong1;
    this.bgY = paramLong2;
  }

  abstract boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt, MediaCodec.BufferInfo paramBufferInfo);

  public final String aZm()
  {
    return type() + "_" + this.orH.aZm();
  }

  protected void b(MediaFormat paramMediaFormat, String paramString, int paramInt)
  {
    ab.i("MicroMsg.TrackDataSource", "%s found media format mime[%s] track[%d]", new Object[] { aZm(), paramString, Integer.valueOf(paramInt) });
    this.orN = paramInt;
    this.clY = paramString;
    this.bfi = (paramMediaFormat.getLong("durationUs") / 1000L);
    this.orM = paramMediaFormat;
  }

  abstract boolean b(MediaCodec paramMediaCodec);

  public final void bOY()
  {
    ab.i("MicroMsg.TrackDataSource", "%s flush codec", new Object[] { aZm() });
    this.bex = -1;
    this.bew = -1;
    try
    {
      if (this.eTq != null)
        this.eTq.flush();
      label43: return;
    }
    catch (Exception localException)
    {
      break label43;
    }
  }

  protected final boolean bOZ()
  {
    boolean bool = true;
    try
    {
      ab.i("MicroMsg.TrackDataSource", "%s start to prepare decoder mime[%s]", new Object[] { aZm(), this.clY });
      this.eTq = MediaCodec.createDecoderByType(this.clY);
      b(this.eTq);
      this.eTq.start();
      this.inputBuffers = this.eTq.getInputBuffers();
      this.aQJ = this.eTq.getOutputBuffers();
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TrackDataSource", localException, "%s prepare decoder init decoder error ", new Object[] { aZm() });
        this.orH.RI(type());
        bool = false;
      }
    }
  }

  protected void c(MediaCodec paramMediaCodec)
  {
  }

  protected void onPause()
  {
  }

  protected void onStart()
  {
  }

  public final void pause()
  {
    ab.i("MicroMsg.TrackDataSource", "%s start to pause", new Object[] { aZm() });
    setState(4);
    onPause();
  }

  public final boolean prepare()
  {
    ab.i("MicroMsg.TrackDataSource", "%s start to prepare path %s", new Object[] { aZm(), this.path });
    long l1 = bo.yz();
    boolean bool;
    label391: long l2;
    try
    {
      ab.i("MicroMsg.TrackDataSource", "%s start to init extractor", new Object[] { aZm() });
      Object localObject1 = new android/media/MediaExtractor;
      ((MediaExtractor)localObject1).<init>();
      this.clX = ((MediaExtractor)localObject1);
      if (!bo.isNullOrNil(this.path))
      {
        localObject1 = e.ck(this.path, false);
        this.fd = ((RandomAccessFile)localObject1).getFD();
        if (q.ete.euc == 1)
          this.clX.setDataSource(this.fd, 0L, e.asZ(this.path));
        while (true)
        {
          ((RandomAccessFile)localObject1).close();
          int i = this.clX.getTrackCount();
          this.orN = -1;
          j = 0;
          if (j < i)
          {
            ??? = this.clX.getTrackFormat(j);
            localObject1 = ((MediaFormat)???).getString("mime");
            if ((localObject1 == null) || (!((String)localObject1).contains(type())))
              break;
            b((MediaFormat)???, (String)localObject1, j);
          }
          if (this.orN >= 0)
            break label391;
          ab.w("MicroMsg.TrackDataSource", "%s prepare track but can not find track index.[%d, %d]", new Object[] { aZm(), Integer.valueOf(i), Integer.valueOf(this.orN) });
          this.orH.RH("can not find ");
          bool = false;
          return bool;
          this.clX.setDataSource(this.fd);
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TrackDataSource", localException1, "%s prepare init extractor error", new Object[] { aZm() });
        this.orH.RH(localException1.toString());
        bool = false;
        continue;
        if ((this.fd != null) && (this.fd.valid()))
          this.clX.setDataSource(this.fd, this.bfp, this.bgY);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        int j;
        ab.e("MicroMsg.TrackDataSource", "%s prepare init extractor error %s", new Object[] { aZm(), localThrowable.toString() });
        this.orH.RH(localThrowable.toString());
        bool = false;
        continue;
        j++;
      }
      this.clX.selectTrack(this.orN);
      if (!bo.isNullOrNil(this.path))
        this.orO = null;
      l2 = bo.yz();
    }
    while (true)
    {
      try
      {
        while (true)
        {
          ab.i("MicroMsg.TrackDataSource", "%s start to init decoder mime[%s] state[%d]", new Object[] { aZm(), this.clY, Integer.valueOf(this.state) });
          if (d.yD(this.state))
            break;
          synchronized (this.lock)
          {
            this.eTq = MediaCodec.createDecoderByType(this.clY);
            b(this.eTq);
            this.eTq.start();
            this.inputBuffers = this.eTq.getInputBuffers();
            this.aQJ = this.eTq.getOutputBuffers();
            l3 = bo.yz();
            setState(1);
            ab.i("MicroMsg.TrackDataSource", "%s finish to prepare cost[%d %d %d]", new Object[] { aZm(), Long.valueOf(bo.az(l1)), Long.valueOf(l2 - l1), Long.valueOf(l3 - l1) });
            bool = true;
          }
        }
      }
      catch (Exception localException2)
      {
        ab.e("MicroMsg.TrackDataSource", "%s prepare init decoder error %s", new Object[] { aZm(), localException2.toString() });
        this.orH.RI(type());
        bool = false;
      }
      break;
      long l3 = 0L;
    }
  }

  public void release()
  {
    ab.i("MicroMsg.TrackDataSource", "%s release", new Object[] { aZm() });
    if (this.clX != null)
    {
      this.clX.release();
      this.clX = null;
    }
    if (this.eTq != null)
    {
      this.eTq.release();
      this.eTq = null;
    }
    f localf;
    if (this.orO != null)
    {
      localf = this.orO;
      if (localf.ort == null);
    }
    try
    {
      localf.ort.close();
      label83: localf.gkn.clear();
      localf.gkn = null;
      localf.gko.clear();
      localf.gko = null;
      localf.oru = null;
      ab.i("MicroMsg.TrackDataSource", "%s finish release", new Object[] { aZm() });
      return;
    }
    catch (IOException localIOException)
    {
      break label83;
    }
  }

  // ERROR //
  protected final void sI()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 119	com/tencent/mm/plugin/n/h:eTq	Landroid/media/MediaCodec;
    //   4: ifnull +126 -> 130
    //   7: ldc 94
    //   9: ldc_w 596
    //   12: iconst_1
    //   13: anewarray 4	java/lang/Object
    //   16: dup
    //   17: iconst_0
    //   18: aload_0
    //   19: invokevirtual 100	com/tencent/mm/plugin/n/h:aZm	()Ljava/lang/String;
    //   22: aastore
    //   23: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   26: aload_0
    //   27: invokevirtual 351	com/tencent/mm/plugin/n/h:bOY	()V
    //   30: aload_0
    //   31: aconst_null
    //   32: putfield 139	com/tencent/mm/plugin/n/h:aQJ	[Ljava/nio/ByteBuffer;
    //   35: aload_0
    //   36: aconst_null
    //   37: putfield 203	com/tencent/mm/plugin/n/h:inputBuffers	[Ljava/nio/ByteBuffer;
    //   40: invokestatic 395	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   43: lstore_1
    //   44: aload_0
    //   45: getfield 67	com/tencent/mm/plugin/n/h:lock	Ljava/lang/Object;
    //   48: astore_3
    //   49: aload_3
    //   50: monitorenter
    //   51: ldc 94
    //   53: ldc_w 598
    //   56: iconst_2
    //   57: anewarray 4	java/lang/Object
    //   60: dup
    //   61: iconst_0
    //   62: aload_0
    //   63: invokevirtual 100	com/tencent/mm/plugin/n/h:aZm	()Ljava/lang/String;
    //   66: aastore
    //   67: dup
    //   68: iconst_1
    //   69: lload_1
    //   70: invokestatic 456	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   73: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   76: aastore
    //   77: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   80: aload_0
    //   81: getfield 119	com/tencent/mm/plugin/n/h:eTq	Landroid/media/MediaCodec;
    //   84: invokevirtual 601	android/media/MediaCodec:stop	()V
    //   87: aload_0
    //   88: getfield 119	com/tencent/mm/plugin/n/h:eTq	Landroid/media/MediaCodec;
    //   91: invokevirtual 581	android/media/MediaCodec:release	()V
    //   94: aload_0
    //   95: aconst_null
    //   96: putfield 119	com/tencent/mm/plugin/n/h:eTq	Landroid/media/MediaCodec;
    //   99: aload_3
    //   100: monitorexit
    //   101: ldc 94
    //   103: ldc_w 603
    //   106: iconst_2
    //   107: anewarray 4	java/lang/Object
    //   110: dup
    //   111: iconst_0
    //   112: aload_0
    //   113: invokevirtual 100	com/tencent/mm/plugin/n/h:aZm	()Ljava/lang/String;
    //   116: aastore
    //   117: dup
    //   118: iconst_1
    //   119: lload_1
    //   120: invokestatic 456	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   123: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   126: aastore
    //   127: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: return
    //   131: astore 4
    //   133: aload_0
    //   134: aconst_null
    //   135: putfield 119	com/tencent/mm/plugin/n/h:eTq	Landroid/media/MediaCodec;
    //   138: aload 4
    //   140: athrow
    //   141: astore 4
    //   143: aload_3
    //   144: monitorexit
    //   145: aload 4
    //   147: athrow
    //   148: astore 4
    //   150: aload_0
    //   151: getfield 119	com/tencent/mm/plugin/n/h:eTq	Landroid/media/MediaCodec;
    //   154: invokevirtual 581	android/media/MediaCodec:release	()V
    //   157: aload_0
    //   158: aconst_null
    //   159: putfield 119	com/tencent/mm/plugin/n/h:eTq	Landroid/media/MediaCodec;
    //   162: goto -63 -> 99
    //   165: astore 4
    //   167: aload_0
    //   168: aconst_null
    //   169: putfield 119	com/tencent/mm/plugin/n/h:eTq	Landroid/media/MediaCodec;
    //   172: aload 4
    //   174: athrow
    //   175: astore 4
    //   177: aload_0
    //   178: getfield 119	com/tencent/mm/plugin/n/h:eTq	Landroid/media/MediaCodec;
    //   181: invokevirtual 581	android/media/MediaCodec:release	()V
    //   184: aload_0
    //   185: aconst_null
    //   186: putfield 119	com/tencent/mm/plugin/n/h:eTq	Landroid/media/MediaCodec;
    //   189: aload 4
    //   191: athrow
    //   192: astore 4
    //   194: aload_0
    //   195: aconst_null
    //   196: putfield 119	com/tencent/mm/plugin/n/h:eTq	Landroid/media/MediaCodec;
    //   199: aload 4
    //   201: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   87	94	131	finally
    //   51	80	141	finally
    //   94	99	141	finally
    //   99	101	141	finally
    //   133	141	141	finally
    //   143	145	141	finally
    //   157	162	141	finally
    //   167	175	141	finally
    //   184	192	141	finally
    //   194	202	141	finally
    //   80	87	148	java/lang/Exception
    //   150	157	165	finally
    //   80	87	175	finally
    //   177	184	192	finally
  }

  public final void setPath(String paramString)
  {
    this.path = paramString;
  }

  protected final void setState(int paramInt)
  {
    ab.i("MicroMsg.TrackDataSource", "%s set state old %d new %d", new Object[] { aZm(), Integer.valueOf(this.state), Integer.valueOf(paramInt) });
    this.state = paramInt;
  }

  public final void start()
  {
    ab.i("MicroMsg.TrackDataSource", "%s start to play", new Object[] { aZm() });
    setState(3);
    onStart();
  }

  abstract String type();

  public final long yH(int paramInt)
  {
    ab.i("MicroMsg.TrackDataSource", "%s start to seek to ms[%d] isFeedEnd[%b]", new Object[] { aZm(), Integer.valueOf(paramInt), Boolean.valueOf(this.orJ) });
    bOY();
    this.orJ = false;
    if (this.orO != null);
    while (true)
    {
      long l;
      try
      {
        f localf = this.orO;
        l = paramInt * 1000;
        i = 0;
        if (i < localf.gko.size())
        {
          Pair localPair = (Pair)localf.gko.get(i);
          if (l >= ((Long)localPair.second).longValue())
          {
            if (l == ((Long)localPair.second).longValue())
            {
              localf.orv = ((Integer)localPair.first).intValue();
              localf.oru = ((com.tencent.mm.plugin.a.g)localf.gkn.get(localf.orv));
              if (this.orO.oru.gkq < 0L)
                N(paramInt * 1000L, -1L);
              if (this.orO.oru.gkq < 0L)
              {
                N(0L, -1L);
                this.orH.bOW();
              }
              l = this.orO.oru.gkq;
              ab.i("MicroMsg.TrackDataSource", "%s finish to seek extractor [%d]", new Object[] { aZm(), Long.valueOf(l) });
              l /= 1000L;
              return l;
            }
            i++;
            continue;
          }
        }
        if ((i == 0) || (i == localf.gko.size() - 1))
        {
          localf.orv = ((Integer)((Pair)localf.gko.get(i)).first).intValue();
          localf.oru = ((com.tencent.mm.plugin.a.g)localf.gkn.get(localf.orv));
          continue;
        }
      }
      catch (Exception localException1)
      {
        int i;
        ab.printErrStackTrace("MicroMsg.TrackDataSource", localException1, "%s extractor seek exception %s", new Object[] { aZm(), localException1.toString() });
        l = 0L;
        continue;
        localException1.orv = ((Integer)((Pair)localException1.gko.get(i - 1)).first).intValue();
        localException1.oru = ((com.tencent.mm.plugin.a.g)localException1.gkn.get(localException1.orv));
        continue;
      }
      try
      {
        this.clX.seekTo(paramInt * 1000, 0);
        if (this.clX.getSampleTime() < 0L)
          N(paramInt * 1000L, -1L);
        if (this.clX.getSampleTime() < 0L)
        {
          N(0L, -1L);
          this.orH.bOW();
        }
        l = this.clX.getSampleTime();
        ab.i("MicroMsg.TrackDataSource", "%s finish to seek extractor [%d, %d]", new Object[] { aZm(), Long.valueOf(l), Long.valueOf(this.clX.getCachedDuration()) });
        l /= 1000L;
      }
      catch (Exception localException2)
      {
        ab.printErrStackTrace("MicroMsg.TrackDataSource", localException2, "%s extractor seek exception %s", new Object[] { aZm(), localException2.toString() });
        l = 0L;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.n.h
 * JD-Core Version:    0.6.2
 */