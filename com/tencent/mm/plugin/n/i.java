package com.tencent.mm.plugin.n;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ak.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class i
{
  Looper orS;
  ak orT;
  HandlerThread orU;
  HandlerThread orV;
  HandlerThread orW;
  public j orX;
  public c orY;
  private ak.a orZ;

  public i(Looper paramLooper)
  {
    this(paramLooper, (byte)0);
  }

  private i(Looper paramLooper, byte paramByte)
  {
    AppMethodBeat.i(117876);
    this.orZ = new ak.a()
    {
      public final boolean handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(117875);
        int i = paramAnonymousMessage.what;
        switch (i)
        {
        default:
          ab.w("MicroMsg.VideoPlayer", "%s it has no idea for msg %d ", new Object[] { i.this.aZm(), Integer.valueOf(i) });
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        }
        while (true)
        {
          AppMethodBeat.o(117875);
          return false;
          ab.i("MicroMsg.VideoPlayer", "%s call prepared ", new Object[] { i.this.aZm() });
          if (i.this.orY != null)
          {
            i.this.orY.pL();
            continue;
            ab.i("MicroMsg.VideoPlayer", "%s call completion ", new Object[] { i.this.aZm() });
            if (i.this.orY != null)
            {
              i.this.orY.EA();
              continue;
              ab.i("MicroMsg.VideoPlayer", "%s call seek completion ", new Object[] { i.this.aZm() });
              if (i.this.orY != null)
              {
                i.this.orY.bnT();
                continue;
                ab.i("MicroMsg.VideoPlayer", "%s call video size changed size [%d, %d] degrees[%d]", new Object[] { i.this.aZm(), Integer.valueOf(paramAnonymousMessage.arg1), Integer.valueOf(paramAnonymousMessage.arg2), Integer.valueOf(((Integer)paramAnonymousMessage.obj).intValue()) });
                if (i.this.orY != null)
                {
                  i.this.orY.S(paramAnonymousMessage.arg1, paramAnonymousMessage.arg2, ((Integer)paramAnonymousMessage.obj).intValue());
                  continue;
                  ab.e("MicroMsg.VideoPlayer", "%s call play error [%d, %d]", new Object[] { i.this.aZm(), Integer.valueOf(paramAnonymousMessage.arg1), Integer.valueOf(paramAnonymousMessage.arg2) });
                  if (i.this.orY != null)
                  {
                    i.this.orY.onError(paramAnonymousMessage.arg1, paramAnonymousMessage.arg2);
                    continue;
                    try
                    {
                      paramAnonymousMessage = i.this;
                      ab.i("MicroMsg.VideoPlayer", "%s clear now.", new Object[] { paramAnonymousMessage.aZm() });
                      paramAnonymousMessage.orU.quit();
                      paramAnonymousMessage.orV.quit();
                      if (paramAnonymousMessage.orW != null)
                        paramAnonymousMessage.orW.quit();
                      paramAnonymousMessage.orT.removeMessages(1);
                      paramAnonymousMessage.orT.removeMessages(2);
                      paramAnonymousMessage.orT.removeMessages(3);
                      paramAnonymousMessage.orT.removeMessages(4);
                      paramAnonymousMessage.orT.removeMessages(5);
                      paramAnonymousMessage.orU = null;
                      paramAnonymousMessage.orV = null;
                      paramAnonymousMessage.orT = null;
                      paramAnonymousMessage.orS = null;
                      paramAnonymousMessage.orY = null;
                      paramAnonymousMessage.orX = null;
                    }
                    catch (Exception paramAnonymousMessage)
                    {
                    }
                  }
                }
              }
            }
          }
        }
      }
    };
    this.orU = com.tencent.mm.sdk.g.d.ek("VideoPlayer:inner", -16);
    this.orU.start();
    this.orV = com.tencent.mm.sdk.g.d.ek("VideoPlayer:video", -16);
    this.orV.start();
    this.orW = com.tencent.mm.sdk.g.d.ek("VideoPlayer:audio", -16);
    this.orW.start();
    this.orS = paramLooper;
    this.orT = new ak(this.orS, this.orZ);
    ak localak = this.orT;
    Looper localLooper1 = this.orU.getLooper();
    Looper localLooper2 = this.orV.getLooper();
    if (this.orW != null);
    for (paramLooper = this.orW.getLooper(); ; paramLooper = null)
    {
      this.orX = new j(localak, localLooper1, localLooper2, paramLooper);
      AppMethodBeat.o(117876);
      return;
    }
  }

  public final void a(c paramc)
  {
    this.orY = paramc;
  }

  public final String aZm()
  {
    AppMethodBeat.i(117891);
    String str;
    if (this.orX != null)
    {
      str = this.orX.orH.aZm();
      AppMethodBeat.o(117891);
    }
    while (true)
    {
      return str;
      str = "has no player!";
      AppMethodBeat.o(117891);
    }
  }

  public final long bPa()
  {
    return this.orX.bfi;
  }

  public final int bPb()
  {
    AppMethodBeat.i(117889);
    j localj = this.orX;
    int i;
    int j;
    if (localj.orH != null)
    {
      i = (int)(localj.orH.orz / 1000L);
      j = (int)localj.orH.ory;
      if (j == -1)
      {
        j = i;
        if (i < localj.orH.orA / 1000L)
          j = (int)(localj.orH.orA / 1000L);
        ab.d("MicroMsg.VideoPlayerImpl", "%s get curr play ms %d time[%d %d]", new Object[] { localj.orH.aZm(), Integer.valueOf(j), Long.valueOf(localj.orH.orz), Long.valueOf(localj.orH.orA) });
      }
    }
    while (true)
    {
      AppMethodBeat.o(117889);
      return j;
      i = j;
      break;
      j = 0;
    }
  }

  public final void f(Surface paramSurface)
  {
    AppMethodBeat.i(117881);
    Object localObject;
    if (paramSurface != null)
    {
      localObject = this.orX;
      ab.i("MicroMsg.VideoPlayerImpl", "%s change surface[%d] ", new Object[] { ((j)localObject).orH.aZm(), Integer.valueOf(paramSurface.hashCode()) });
      localObject = ((j)localObject).osg;
      ab.i("MicroMsg.VideoTrackDataSource", "%s set out put surface", new Object[] { ((k)localObject).aZm() });
      ((k)localObject).aOO = paramSurface;
      if (com.tencent.mm.compatible.util.d.iW(23))
      {
        ((k)localObject).bPe();
        AppMethodBeat.o(117881);
      }
    }
    while (true)
    {
      return;
      ((k)localObject).bPf();
      AppMethodBeat.o(117881);
    }
  }

  public final float getPlayRate()
  {
    float f1 = 1.0F;
    float f2 = f1;
    if (this.orX != null)
    {
      j localj = this.orX;
      f2 = f1;
      if (localj.osg != null)
        f2 = localj.osg.iac;
    }
    return f2;
  }

  public final void iU(boolean paramBoolean)
  {
    this.orX.osg.osp = paramBoolean;
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(117890);
    boolean bool = d.yB(this.orX.state);
    AppMethodBeat.o(117890);
    return bool;
  }

  public final void pause()
  {
    AppMethodBeat.i(117884);
    ab.d("MicroMsg.VideoPlayer", "%s pause state[%d] stack %s", new Object[] { aZm(), Integer.valueOf(this.orX.state), bo.dpG() });
    if ((d.yE(this.orX.state)) || (d.yC(this.orX.state)))
    {
      ab.w("MicroMsg.VideoPlayer", "%s it seek now, do not response pause event.", new Object[] { aZm() });
      AppMethodBeat.o(117884);
    }
    while (true)
    {
      return;
      this.orX.pause();
      AppMethodBeat.o(117884);
    }
  }

  public final boolean prepare()
  {
    AppMethodBeat.i(117882);
    j localj = this.orX;
    ab.i("MicroMsg.VideoPlayerImpl", "%s player start to prepare ", new Object[] { localj.orH.aZm() });
    localj.osb.obtainMessage(1).sendToTarget();
    if (localj.osi != null)
      localj.osc.obtainMessage(1).sendToTarget();
    AppMethodBeat.o(117882);
    return true;
  }

  public final void release()
  {
    AppMethodBeat.i(117888);
    try
    {
      this.orX.release();
      AppMethodBeat.o(117888);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(117888);
    }
  }

  public final void setIOnlineCache(b paramb)
  {
    if ((paramb != null) && (this.orX != null))
      this.orX.osg.orK = paramb;
  }

  public final void setIsOnlineVideoType(boolean paramBoolean)
  {
    AppMethodBeat.i(117879);
    if (this.orX != null)
    {
      j localj = this.orX;
      if (localj.orH != null)
      {
        ab.i("MicroMsg.VideoPlayerImpl", "%s set is online video type [%b]", new Object[] { localj.orH.aZm(), Boolean.valueOf(paramBoolean) });
        localj.orH.llJ = paramBoolean;
      }
    }
    AppMethodBeat.o(117879);
  }

  public final void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(117886);
    try
    {
      if (this.orX != null)
      {
        j localj = this.orX;
        if (localj.osi != null)
        {
          ab.i("MicroMsg.VideoPlayerImpl", "%s play set mute[%b]", new Object[] { localj.orH.aZm(), Boolean.valueOf(paramBoolean) });
          localj.osi.setMute(paramBoolean);
        }
      }
      AppMethodBeat.o(117886);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(117886);
    }
  }

  public final void setNeedResetExtractor(boolean paramBoolean)
  {
    AppMethodBeat.i(117878);
    if (this.orX != null)
    {
      j localj = this.orX;
      ab.i("MicroMsg.VideoPlayerImpl", "%s setNeedResetExtractor [%b]", new Object[] { localj.orH.aZm(), Boolean.valueOf(paramBoolean) });
      if (localj.orH != null)
        localj.orH.llI = paramBoolean;
    }
    AppMethodBeat.o(117878);
  }

  public final void setPath(String paramString)
  {
    AppMethodBeat.i(117877);
    ab.i("MicroMsg.VideoPlayer", "%s video player set path %s", new Object[] { aZm(), paramString });
    j localj = this.orX;
    ab.i("MicroMsg.VideoPlayerImpl", "%s set path %s", new Object[] { localj.orH.aZm(), paramString });
    localj.osg.setPath(paramString);
    if (localj.osi != null)
      localj.osi.setPath(paramString);
    AppMethodBeat.o(117877);
  }

  public final void setPlayRate(float paramFloat)
  {
    if (this.orX != null)
    {
      Object localObject = this.orX;
      if (((j)localObject).osg != null)
      {
        localObject = ((j)localObject).osg;
        if (paramFloat > 0.0F)
          ((k)localObject).iac = paramFloat;
      }
    }
  }

  public final void setSurface(Surface paramSurface)
  {
    AppMethodBeat.i(117880);
    if (paramSurface != null)
    {
      j localj = this.orX;
      ab.i("MicroMsg.VideoPlayerImpl", "%s set surface[%d] ", new Object[] { localj.orH.aZm(), Integer.valueOf(paramSurface.hashCode()) });
      localj.osg.aOO = paramSurface;
    }
    AppMethodBeat.o(117880);
  }

  public final void start()
  {
    AppMethodBeat.i(117883);
    ab.d("MicroMsg.VideoPlayer", "%s start state[%d] stack %s", new Object[] { aZm(), Integer.valueOf(this.orX.state), bo.dpG() });
    if ((d.yE(this.orX.state)) || (d.yC(this.orX.state)))
    {
      ab.w("MicroMsg.VideoPlayer", "%s it seek now, do not response start event.", new Object[] { aZm() });
      AppMethodBeat.o(117883);
    }
    while (true)
    {
      return;
      this.orX.start();
      AppMethodBeat.o(117883);
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(117887);
    this.orX.stop();
    AppMethodBeat.o(117887);
  }

  public final void yI(int paramInt)
  {
    AppMethodBeat.i(117885);
    this.orX.yI(paramInt);
    AppMethodBeat.o(117885);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.n.i
 * JD-Core Version:    0.6.2
 */