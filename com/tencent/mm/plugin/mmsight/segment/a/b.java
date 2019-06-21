package com.tencent.mm.plugin.mmsight.segment.a;

import android.os.Looper;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.n.i;
import com.tencent.mm.plugin.n.j;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
  implements a
{
  boolean VN;
  boolean cFy;
  boolean fqL;
  i oAb;
  int oAc;
  int oAd;
  private int oAe;
  a.a oAf;
  a.d oAg;
  a.b oAh;
  a.c oAi;

  public b()
  {
    AppMethodBeat.i(3713);
    this.fqL = false;
    this.cFy = false;
    this.VN = false;
    this.oAd = 0;
    this.oAe = 0;
    this.oAb = new i(Looper.getMainLooper());
    Object localObject = this.oAb;
    if (((i)localObject).orX != null)
    {
      localObject = ((i)localObject).orX;
      if (((j)localObject).orH != null)
        ((j)localObject).orH.orD = false;
    }
    this.oAb.setNeedResetExtractor(false);
    this.oAb.orY = new b.1(this);
    AppMethodBeat.o(3713);
  }

  public final void a(a.a parama)
  {
    this.oAf = parama;
  }

  public final void a(a.b paramb)
  {
    this.oAh = paramb;
  }

  public final void a(a.c paramc)
  {
    this.oAi = paramc;
  }

  public final void a(a.d paramd)
  {
    this.oAg = paramd;
  }

  public final int getCurrentPosition()
  {
    AppMethodBeat.i(3722);
    int i = this.oAb.bPb();
    AppMethodBeat.o(3722);
    return i;
  }

  public final int getDuration()
  {
    return (int)this.oAb.orX.bfi;
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(3720);
    boolean bool = this.oAb.isPlaying();
    AppMethodBeat.o(3720);
    return bool;
  }

  public final void pause()
  {
    AppMethodBeat.i(3719);
    this.oAb.pause();
    AppMethodBeat.o(3719);
  }

  public final void prepareAsync()
  {
    AppMethodBeat.i(3716);
    this.oAb.prepare();
    AppMethodBeat.o(3716);
  }

  public final void release()
  {
    AppMethodBeat.i(3723);
    this.oAb.release();
    AppMethodBeat.o(3723);
  }

  public final void seekTo(int paramInt)
  {
    AppMethodBeat.i(3721);
    if (this.oAb != null)
    {
      ab.i("MicroMsg.MMSegmentVideoPlayer", "seekTo: %s", new Object[] { Integer.valueOf(paramInt) });
      this.oAb.yI(paramInt);
    }
    AppMethodBeat.o(3721);
  }

  public final void setAudioStreamType(int paramInt)
  {
  }

  public final void setDataSource(String paramString)
  {
    AppMethodBeat.i(3715);
    this.oAb.setPath(paramString);
    AppMethodBeat.o(3715);
  }

  public final void setLoop(int paramInt1, int paramInt2)
  {
    this.oAd = paramInt1;
    this.oAe = paramInt2;
  }

  public final void setLooping(boolean paramBoolean)
  {
    this.fqL = paramBoolean;
  }

  public final void setSurface(Surface paramSurface)
  {
    AppMethodBeat.i(3714);
    this.oAb.setSurface(paramSurface);
    AppMethodBeat.o(3714);
  }

  public final void start()
  {
    AppMethodBeat.i(3717);
    if (this.VN)
      this.oAb.start();
    this.cFy = true;
    AppMethodBeat.o(3717);
  }

  public final void stop()
  {
    AppMethodBeat.i(3718);
    this.oAb.orX.stop();
    this.cFy = false;
    AppMethodBeat.o(3718);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.a.b
 * JD-Core Version:    0.6.2
 */