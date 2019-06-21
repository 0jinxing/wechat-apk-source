package com.tencent.mm.audio.b;

import android.media.AudioRecord;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.b;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class e extends f
{
  AudioRecord cpL;
  int cpX;
  boolean cpx;
  private int cqa;
  b cqb;
  b cqc;
  c.a cqd;
  final Object cqe;
  final byte[] cqf;
  final Object cqg;
  Timer cqh;
  boolean cqi;
  private boolean cqj;
  boolean mIsMute;
  int mStatus;

  public e(AudioRecord paramAudioRecord, boolean paramBoolean1, int paramInt, c.a parama, boolean paramBoolean2)
  {
    AppMethodBeat.i(55753);
    this.mStatus = 0;
    this.cqa = 12800;
    this.mIsMute = false;
    this.cqb = new b();
    this.cqc = null;
    this.cqe = new Object();
    this.cqf = new byte[0];
    this.cqg = new Object();
    this.cqh = null;
    this.cqi = false;
    this.cqj = false;
    this.cpL = paramAudioRecord;
    this.cpx = paramBoolean1;
    this.cpX = paramInt;
    this.cqd = parama;
    this.cqj = paramBoolean2;
    AppMethodBeat.o(55753);
  }

  public final boolean EL()
  {
    int i = -1;
    boolean bool = false;
    AppMethodBeat.i(55754);
    ab.i("MicroMsg.RecordModeAsyncRead", "startRecord");
    while (true)
    {
      synchronized (this.cqg)
      {
        this.mStatus = 1;
        ab.i("MicroMsg.RecordModeAsyncRead", "[startRecord] dumpRunningTask:%s", new Object[] { d.xDG.dqb() });
        d.f(this.cqb, "RecordModeAsyncRead_record");
        if (true != this.cqj)
          break label371;
        this.cqc = new b();
        if (this.cqc == null)
        {
          ab.e("MicroMsg.RecordModeAsyncRead", "new m_audioBuffer error ");
          j = 0;
          if (j != 0)
            break label257;
          ab.e("MicroMsg.RecordModeAsyncRead", "initAudioBuffer failed");
          AppMethodBeat.o(55754);
          return bool;
        }
      }
      this.cqa = (this.cpX * 20);
      ab.i("MicroMsg.RecordModeAsyncRead", "audioBuffer init mAudioBufferSize: " + this.cqa);
      ??? = this.cqc;
      int j = this.cqa;
      if (j <= 0)
        j = -1;
      while (true)
      {
        if (j == 0)
          break label251;
        ab.e("MicroMsg.RecordModeAsyncRead", "audioBuffer init failed, error code = -1");
        j = 0;
        break;
        ((b)???).eoL = new byte[j];
        if (((b)???).eoL == null)
        {
          j = -1;
        }
        else
        {
          ((b)???).eoJ = j;
          if (((b)???).eoO)
            ((b)???).eoP = new ReentrantLock();
          j = 0;
        }
      }
      label251: j = 1;
      continue;
      label257: if ((this.cqi) || (this.cqh != null))
      {
        ab.w("MicroMsg.RecordModeAsyncRead", "Timer has been created or, timer has been started, " + this.cqi);
        j = i;
      }
      while (true)
      {
        if (j == 0)
          break label345;
        ab.e("MicroMsg.RecordModeAsyncRead", "InitAudioRecTimer failed, error code = -1");
        AppMethodBeat.o(55754);
        break;
        this.cqh = new Timer();
        j = i;
        if (this.cqh != null)
          j = 0;
      }
      label345: this.cqh.scheduleAtFixedRate(new a(), 60L, 20L);
      this.cqi = true;
      label371: AppMethodBeat.o(55754);
      bool = true;
    }
  }

  public final int EP()
  {
    synchronized (this.cqe)
    {
      if (this.cqc != null)
      {
        i = this.cqc.eoJ;
        return i;
      }
      int i = -1;
    }
  }

  public final int EQ()
  {
    AppMethodBeat.i(55756);
    synchronized (this.cqe)
    {
      if (this.cqc != null)
      {
        i = this.cqc.KH();
        AppMethodBeat.o(55756);
        return i;
      }
      int i = -1;
      AppMethodBeat.o(55756);
    }
  }

  public final void bs(boolean paramBoolean)
  {
    this.mIsMute = paramBoolean;
  }

  public final void stopRecord()
  {
    AppMethodBeat.i(55755);
    ab.i("MicroMsg.RecordModeAsyncRead", "stopRecord");
    synchronized (this.cqg)
    {
      this.mStatus = 3;
      b localb = this.cqb;
      ??? = new com/tencent/mm/audio/b/e$1;
      ((e.1)???).<init>(this);
      localb.cqo = ((e.c)???);
    }
    synchronized (this.cqf)
    {
      this.cqf.notify();
      AppMethodBeat.o(55755);
      return;
      localObject4 = finally;
      AppMethodBeat.o(55755);
      throw localObject4;
    }
  }

  public final int x(byte[] paramArrayOfByte, int paramInt)
  {
    int i = -1;
    AppMethodBeat.i(55757);
    while (true)
    {
      b localb;
      synchronized (this.cqe)
      {
        if (this.cqc == null)
          break label303;
        localb = this.cqc;
        j = i;
        if (paramInt > 0)
        {
          j = i;
          if (paramInt <= localb.KH())
          {
            if (paramArrayOfByte != null)
              continue;
            j = i;
          }
        }
        AppMethodBeat.o(55757);
        return j;
        j = i;
        if (localb.eoM == localb.eoN)
          continue;
        if (localb.eoO)
          localb.eoP.lock();
        if (localb.eoM < localb.eoN)
        {
          System.arraycopy(localb.eoL, localb.eoM, paramArrayOfByte, 0, paramInt);
          localb.eoM += paramInt;
          if (localb.eoO)
            localb.eoP.unlock();
          j = 0;
          continue;
        }
        if (paramInt <= localb.eoJ - localb.eoM)
        {
          System.arraycopy(localb.eoL, localb.eoM, paramArrayOfByte, 0, paramInt);
          localb.eoM += paramInt;
        }
      }
      System.arraycopy(localb.eoL, localb.eoM, paramArrayOfByte, 0, localb.eoJ - localb.eoM);
      System.arraycopy(localb.eoL, 0, paramArrayOfByte, localb.eoJ - localb.eoM, paramInt - (localb.eoJ - localb.eoM));
      localb.eoM = (paramInt - (localb.eoJ - localb.eoM));
      continue;
      label303: AppMethodBeat.o(55757);
      int j = i;
    }
  }

  final class a extends TimerTask
  {
    private int cql;
    private int cqm;
    byte[] cqn;

    a()
    {
      AppMethodBeat.i(55750);
      this.cql = (e.this.cpX * 2);
      this.cqm = e.this.cpX;
      this.cqn = new byte[this.cql];
      AppMethodBeat.o(55750);
    }

    public final void run()
    {
      AppMethodBeat.i(55751);
      int i;
      if (!e.this.mIsPause)
      {
        i = (int)(0.8D * e.this.EP());
        j = i;
        if (i < e.this.cpX * 8)
          j = e.this.cpX * 8;
        if (e.this.EQ() <= j)
          break label139;
      }
      label139: for (int j = 8; ; j = 1)
      {
        for (i = 0; i < j; i++)
        {
          int k = e.this.x(this.cqn, this.cqm);
          if ((e.this.cqd != null) && (k == 0))
            e.this.cqd.u(this.cqn, this.cqm);
        }
        AppMethodBeat.o(55751);
        return;
      }
    }
  }

  final class b
    implements Runnable
  {
    volatile e.c cqo;

    b()
    {
    }

    public final void run()
    {
      AppMethodBeat.i(55752);
      ab.i("MicroMsg.RecordModeAsyncRead", "RecordThread started. frameSize:%d", new Object[] { Integer.valueOf(e.this.cpX) });
      if (-123456789 != e.this.cpB)
      {
        ab.i("MicroMsg.RecordModeAsyncRead", "set priority to " + e.this.cpB);
        Process.setThreadPriority(e.this.cpB);
      }
      while (true)
      {
        synchronized (e.this.cqg)
        {
          ab.i("MicroMsg.RecordModeAsyncRead", "RecordRunnable#run lock[%s] mStatusLock[%s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), e.this.cqg });
          if (1 != e.this.mStatus)
          {
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>("status is not inited, now status: ");
            ab.e("MicroMsg.RecordModeAsyncRead", e.this.mStatus);
            AppMethodBeat.o(55752);
            return;
          }
          e.this.mStatus = 2;
          Object localObject4 = new byte[e.this.cpX];
          if (2 == e.this.mStatus)
            synchronized (e.this.cqf)
            {
              boolean bool = e.this.mIsPause;
              if (!bool);
            }
        }
        try
        {
          e.this.cqf.wait();
          label232: if (2 != e.this.mStatus);
          label348: Object localObject3;
          int i;
          do
          {
            while (true)
            {
              if (this.cqo != null)
                this.cqo.finish();
              ab.i("MicroMsg.RecordModeAsyncRead", "RecordThread exited.");
              AppMethodBeat.o(55752);
              break;
              localObject5 = finally;
              AppMethodBeat.o(55752);
              throw localObject5;
              if (e.this.cpL != null)
                break label348;
              ab.i("MicroMsg.RecordModeAsyncRead", "mAudioRecord is null, so stop record.");
              synchronized (e.this.cqg)
              {
                e.this.mStatus = 3;
              }
            }
            localObject7 = finally;
            AppMethodBeat.o(55752);
            throw localObject7;
            localObject3 = localObject7;
            if (e.this.cpx)
              localObject3 = new byte[e.this.cpX];
            e.this.cqp += 1;
            new g.a();
            i = e.this.cpL.read((byte[])localObject3, 0, e.this.cpX);
          }
          while (2 != e.this.mStatus);
          if (e.this.cpT != null)
            e.this.cpT.d(i, (byte[])localObject3);
          if (e.this.cpX != i)
            ab.i("MicroMsg.RecordModeAsyncRead", "read len ".concat(String.valueOf(i)));
          if (i < e.this.cpX)
            ab.i("MicroMsg.RecordModeAsyncRead", "read too fast? sleep 10 ms");
          try
          {
            Thread.sleep(10L);
            label503: Object localObject8 = localObject3;
            if (e.this.cqd == null)
              continue;
            localObject8 = localObject3;
            if (i <= 0)
              continue;
            int j = i;
            if (i > localObject3.length)
              j = localObject3.length;
            if (e.this.cqc != null)
            {
              if (e.this.mIsMute)
                Arrays.fill((byte[])localObject3, 0, j, (byte)0);
              localObject8 = e.this.cqc;
              if (j > 0)
              {
                if (((b)localObject8).eoO)
                  ((b)localObject8).eoP.lock();
                if (((b)localObject8).eoM != ((b)localObject8).eoN)
                  break label668;
                i = ((b)localObject8).eoJ;
                label611: if (j <= i)
                  break label778;
              }
              for (i = -1; ; i = -1)
              {
                localObject8 = localObject3;
                if (i == 0)
                  break;
                ab.e("MicroMsg.RecordModeAsyncRead", "WriteToBuffer Failed, ret:%d AudioBuffer length: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(e.this.cqc.KH()) });
                localObject8 = localObject3;
                break;
                label668: if ((((b)localObject8).eoN + 1) % ((b)localObject8).eoJ == ((b)localObject8).eoM)
                {
                  i = 0;
                  break label611;
                }
                if (((b)localObject8).eoM < ((b)localObject8).eoN)
                  ((b)localObject8).eoK = (((b)localObject8).eoN - ((b)localObject8).eoM);
                while (true)
                {
                  if (((b)localObject8).eoO)
                    ((b)localObject8).eoP.unlock();
                  i = ((b)localObject8).eoJ - ((b)localObject8).eoK;
                  break;
                  if (((b)localObject8).eoM > ((b)localObject8).eoN)
                    ((b)localObject8).eoK = (((b)localObject8).eoN + ((b)localObject8).eoJ - ((b)localObject8).eoM);
                }
                label778: if ((((b)localObject8).eoN + j) % ((b)localObject8).eoJ != ((b)localObject8).eoM)
                  break label803;
              }
              label803: if (((b)localObject8).eoO)
                ((b)localObject8).eoP.lock();
              if ((((b)localObject8).eoM < ((b)localObject8).eoN) && (j > ((b)localObject8).eoJ - ((b)localObject8).eoN))
              {
                System.arraycopy(localObject3, 0, ((b)localObject8).eoL, ((b)localObject8).eoN, ((b)localObject8).eoJ - ((b)localObject8).eoN);
                System.arraycopy(localObject3, ((b)localObject8).eoJ - ((b)localObject8).eoN, ((b)localObject8).eoL, 0, j - (((b)localObject8).eoJ - ((b)localObject8).eoN));
                ((b)localObject8).eoN = (j - (((b)localObject8).eoJ - ((b)localObject8).eoN));
              }
              for (((b)localObject8).eoN %= ((b)localObject8).eoJ; ; ((b)localObject8).eoN = ((j + ((b)localObject8).eoN) % ((b)localObject8).eoJ))
              {
                if (((b)localObject8).eoO)
                  ((b)localObject8).eoP.unlock();
                i = 0;
                break;
                System.arraycopy(localObject3, 0, ((b)localObject8).eoL, ((b)localObject8).eoN, j);
              }
            }
            localObject8 = localObject3;
            if (e.this.cqd == null)
              continue;
            if (e.this.mIsMute)
              Arrays.fill((byte[])localObject3, 0, j, (byte)0);
            e.this.cqd.u((byte[])localObject3, j);
            localObject8 = localObject3;
          }
          catch (InterruptedException localInterruptedException1)
          {
            break label503;
          }
        }
        catch (InterruptedException localInterruptedException2)
        {
          break label232;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.e
 * JD-Core Version:    0.6.2
 */