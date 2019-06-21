package com.tencent.mm.audio.mix.d;

import android.text.TextUtils;
import com.tencent.mm.audio.mix.f.f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c
  implements k, f
{
  protected int channels = 0;
  protected String ckD;
  protected com.tencent.mm.audio.mix.f.d clB;
  protected com.tencent.mm.audio.mix.g.b clK;
  protected com.tencent.mm.ag.b clL;
  protected com.tencent.mm.audio.mix.c.g clM;
  protected int clN = 0;
  protected String clO;
  public String clP;
  protected AtomicBoolean clQ = new AtomicBoolean(false);
  protected AtomicInteger clR = new AtomicInteger(0);
  protected AtomicBoolean clS = new AtomicBoolean(false);
  protected AtomicBoolean clT = new AtomicBoolean(false);
  protected AtomicBoolean clU = new AtomicBoolean(false);
  protected AtomicBoolean clV = new AtomicBoolean(false);
  protected AtomicBoolean clW = new AtomicBoolean(false);
  protected Object lock = new Object();
  protected int sampleRate = 0;
  protected int startTime;

  protected c(com.tencent.mm.audio.mix.f.d paramd, com.tencent.mm.audio.mix.g.b paramb)
  {
    this.clB = paramd;
    this.clK = paramb;
    this.clL = this.clK.Ev();
    this.ckD = this.clL.ckD;
    this.clO = this.clL.filePath;
    this.startTime = this.clL.startTime;
    this.clP = this.clL.clP;
  }

  private String DN()
  {
    Object localObject = DM();
    if (localObject == null)
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecoderBase", "param is null");
    for (localObject = this.ckD; ; localObject = ((com.tencent.mm.ag.b)localObject).ckD)
      return localObject;
  }

  private void c(int paramInt1, int paramInt2, String paramString)
  {
    int i = 2;
    if (this.clB == null)
      return;
    this.clR.set(paramInt1);
    if ((paramInt1 != 0) && (paramInt1 != 1))
      if (paramInt1 == 3)
        i = 9;
    while (true)
    {
      String str = DN();
      if ((TextUtils.isEmpty(str)) || (i == -1))
        break;
      if ((this.clB != null) && (i == 4))
      {
        this.clB.a(i, str, paramInt2, paramString);
        break;
        if (paramInt1 == 2)
        {
          i = 7;
          continue;
        }
        if (paramInt1 == 4)
        {
          i = 0;
          continue;
        }
        if (paramInt1 == 5)
          continue;
        if (paramInt1 == 6)
        {
          i = 3;
          continue;
        }
        if (paramInt1 == 7)
        {
          i = 5;
          continue;
        }
        if (paramInt1 == 9)
        {
          i = 4;
          continue;
        }
        if (paramInt1 == 11)
        {
          i = 6;
          continue;
        }
        if (paramInt1 == 12)
        {
          i = 10;
          continue;
        }
        if (paramInt1 == 13)
        {
          i = 11;
          continue;
        }
        if (paramInt1 != 14)
          break label227;
        i = 12;
        continue;
      }
      if (this.clB == null)
        break;
      this.clB.e(i, str, this.clP);
      break;
      label227: i = -1;
    }
  }

  private boolean isError()
  {
    if (this.clR.get() == 9);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean isPlaying()
  {
    if (this.clR.get() == 4);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean DA()
  {
    return this.clS.get();
  }

  public final boolean DB()
  {
    return this.clT.get();
  }

  public final com.tencent.mm.audio.mix.a.c DC()
  {
    return com.tencent.mm.audio.mix.b.d.Dm().dv(this.clO);
  }

  protected final void DD()
  {
    synchronized (this.lock)
    {
      while (true)
        if (!this.clT.get())
        {
          boolean bool = this.clS.get();
          if (bool)
            try
            {
              com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "waitDecode");
              this.lock.wait();
            }
            catch (Exception localException)
            {
              com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioDecoderBase", localException, "waitDecode", new Object[0]);
            }
        }
    }
  }

  protected final void DE()
  {
    synchronized (this.lock)
    {
      try
      {
        this.lock.notify();
        return;
      }
      catch (Exception localException)
      {
        while (true)
          com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioDecoderBase", localException, "notifyDecode", new Object[0]);
      }
    }
  }

  public final void DF()
  {
    if (this.clB.cnE != null)
      this.clB.cnE.gD(DM().fromScene);
    this.clO = DM().filePath;
    if (TextUtils.isEmpty(this.clO))
    {
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecoderBase", "source path is null");
      this.clN = 712;
      onError(this.clN);
    }
    while (true)
    {
      return;
      Object localObject = DM();
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "decode sourcePath :%s, loop:%b", new Object[] { this.clO, Boolean.valueOf(((com.tencent.mm.ag.b)localObject).fqL) });
      if (this.clQ.get())
      {
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "do preload audio");
        if (((com.tencent.mm.ag.b)localObject).fqX)
        {
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "preload begin");
          if (!com.tencent.mm.audio.mix.b.d.Dm().dx(this.clO))
            DG();
          while (true)
          {
            com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "preload end");
            break;
            com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "audio is loaded complete!");
          }
        }
        if (!isPlaying())
          gy(3);
        if (!com.tencent.mm.audio.mix.b.d.Dm().dx(this.clO))
          DG();
        while (true)
        {
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "preload audio end");
          this.clQ.set(false);
          com.tencent.mm.audio.mix.a.c localc = DC();
          if (!this.clT.get())
            break label265;
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "stopped, not to play");
          if (!localc.cky)
            break;
          gy(2);
          break;
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "audio is loaded complete!");
        }
        label265: if (isError())
        {
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "occurs error, not to play");
          continue;
        }
        if ((!isPlaying()) && (!((com.tencent.mm.ag.b)localObject).fqK))
          break label466;
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "to play");
        gy(2);
      }
      gy(4);
      label315: label332: int i;
      if (!com.tencent.mm.audio.mix.b.d.Dm().dx(this.clO))
      {
        DG();
        if ((!((com.tencent.mm.ag.b)localObject).fqL) || (this.clT.get()))
          break label489;
        i = 1;
        if (i != 0)
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "loop again for audioId:%s", new Object[] { DN() });
      }
      try
      {
        Thread.sleep(20L);
        this.startTime = 0;
        if (i != 0)
          break label315;
        if ((this.clT.get()) || (isError()))
        {
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "is stop or error, not set to play complete!");
          localObject = DM().filePath;
          if (this.clK.equals(localObject))
          {
            this.clB.cnB.dK(DN());
            com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "removeAudio");
            com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "task end");
            continue;
            label466: com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "not to play");
            gy(2);
            continue;
            DH();
            break label332;
            label489: i = 0;
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecoderBase", "sleep exception");
          continue;
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "change src only, don't removeAudio");
          continue;
          if (!this.clB.cnB.dM(DN()))
          {
            com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "not mix end, not set to play complete!");
            this.clB.cnB.l(DN(), true);
          }
          else
          {
            gy(7);
            this.clB.cnB.dK(DN());
          }
        }
      }
    }
  }

  protected abstract void DG();

  protected final void DH()
  {
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "readCacheAndPlay");
    com.tencent.mm.audio.mix.a.c localc = DC();
    if (localc == null);
    while (true)
    {
      return;
      DJ();
      int i = localc.size();
      for (int j = 0; (j < i) && (!this.clT.get()); j++)
      {
        DD();
        com.tencent.mm.audio.mix.a.d locald = localc.gv(j);
        if (locald != null)
          a(locald);
      }
      DK();
    }
  }

  public final void DI()
  {
    if ((!this.clV.get()) && (!this.clT.get()))
    {
      this.clV.set(true);
      gy(13);
    }
  }

  protected void DJ()
  {
  }

  protected void DK()
  {
  }

  public void DL()
  {
  }

  public final com.tencent.mm.ag.b DM()
  {
    if (this.clK != null);
    for (com.tencent.mm.ag.b localb = this.clK.Ev(); ; localb = this.clL)
      return localb;
  }

  public final void Dw()
  {
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "preload");
    this.clQ.set(true);
    gy(10);
  }

  public void Dx()
  {
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "pauseOnBackground");
    pause();
  }

  public void Dy()
  {
    com.tencent.mm.audio.mix.e.c localc = this.clB.cnB;
    Object localObject = DN();
    if (localc.cmz.containsKey(localObject))
    {
      localObject = (WeakReference)localc.cmz.remove(localObject);
      if ((localObject != null) && (((WeakReference)localObject).get() != null))
        ((WeakReference)localObject).clear();
    }
  }

  public final void Dz()
  {
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "onError needTry:%b", new Object[] { Boolean.TRUE });
    this.clT.set(true);
    gy(9);
    com.tencent.mm.audio.mix.a.c localc = DC();
    if ((localc != null) && (!localc.cky))
      localc.reset();
  }

  protected final void a(com.tencent.mm.audio.mix.a.c paramc)
  {
    if (this.clM == null)
    {
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecoderBase", "process is null");
      return;
    }
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "writeCacheAndPlay");
    DJ();
    label28: com.tencent.mm.audio.mix.a.d locald;
    if (!this.clT.get())
    {
      DD();
      locald = this.clM.Dt();
      if ((paramc.size() <= 0) || (locald != null))
        break label74;
      paramc.complete();
    }
    while (true)
    {
      DK();
      break;
      label74: if ((paramc.size() == 0) && (locald == null))
      {
        paramc.reset();
      }
      else if (locald != null)
      {
        if (!paramc.cky)
          paramc.a(locald);
        a(locald);
        if (locald != null)
          break label28;
      }
    }
  }

  protected final void a(com.tencent.mm.audio.mix.a.d paramd)
  {
    if (this.clQ.get());
    while (true)
    {
      return;
      if ((paramd != null) && ((paramd.ckG <= 0L) || (this.startTime <= 0) || (paramd.ckG >= this.startTime)) && (this.clB != null) && (this.clB.cnB != null) && (paramd != null))
      {
        paramd.ckD = DN();
        c(paramd);
      }
    }
  }

  protected void c(com.tencent.mm.audio.mix.a.d arg1)
  {
    int i;
    if (this.clK.Ev().ckA)
    {
      if (!this.clW.get())
      {
        this.clW.set(true);
        gy(14);
      }
      i = this.clB.cnB.a(DN(), ???, this);
      if (i >= 50)
        break label71;
      this.clU.set(false);
    }
    while (true)
    {
      return;
      label71: ??? = DC();
      if ((??? != null) && (???.cky))
      {
        this.clU.set(true);
        try
        {
          synchronized (this.lock)
          {
            com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "lockWriteBuffer, writeSize:%d", new Object[] { Integer.valueOf(i) });
            this.lock.wait();
          }
        }
        catch (Exception localException)
        {
          while (true)
            com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioDecoderBase", localException, "lockWriteBuffer", new Object[0]);
        }
      }
      this.clU.set(false);
    }
  }

  public final void gx(int paramInt)
  {
    if (paramInt >= 20);
    while (true)
    {
      return;
      if ((this.clU.get()) && (!this.clS.get()) && (!this.clT.get()))
      {
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "unLockWrite, queueSize:%d", new Object[] { Integer.valueOf(paramInt) });
        DE();
      }
    }
  }

  protected final void gy(int paramInt)
  {
    c(paramInt, 0, "");
  }

  public final void init()
  {
    this.startTime = this.clK.Ev().fqJ;
    this.clS.set(false);
    this.clT.set(false);
    gy(1);
  }

  public final void onError(int paramInt)
  {
    com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecoderBase", "onError, errType:%d", new Object[] { Integer.valueOf(paramInt) });
    this.clN = paramInt;
    this.clT.set(true);
    c(9, paramInt, "");
  }

  public void pause()
  {
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "pause");
    gy(5);
    this.clS.set(true);
    this.clV.set(false);
  }

  public final void release()
  {
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "release");
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "duration:%d", new Object[] { Long.valueOf(DC().duration) });
    Dy();
    onRelease();
    if (this.clK != null)
      this.clK.Ev().startTime = 0;
    this.clQ.set(false);
    this.clT.set(true);
    this.clS.set(false);
    this.clU.set(false);
    this.clB = null;
  }

  public final void resume()
  {
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "resume");
    gy(4);
    synchronized (this.lock)
    {
      if (this.clS.get())
        this.clS.set(false);
      try
      {
        this.lock.notify();
        return;
      }
      catch (Exception localException)
      {
        while (true)
          com.tencent.mm.audio.mix.h.b.printErrStackTrace("MicroMsg.Mix.AudioDecoderBase", localException, "resume", new Object[0]);
      }
    }
  }

  public void seek(int paramInt)
  {
    int i = this.startTime;
    this.startTime = paramInt;
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "seek preStartTime:%d, seek position:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
  }

  public final void stop()
  {
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecoderBase", "stop");
    DL();
    gy(6);
    this.clT.set(true);
    this.clS.set(false);
    DE();
    this.clV.set(false);
    this.clW.set(false);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.d.c
 * JD-Core Version:    0.6.2
 */