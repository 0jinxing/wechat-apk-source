package com.google.android.exoplayer2;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.exoplayer2.a.b;
import com.google.android.exoplayer2.b.d;
import com.google.android.exoplayer2.f.j.a;
import com.google.android.exoplayer2.metadata.e.a;
import com.google.android.exoplayer2.source.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CopyOnWriteArraySet;

@TargetApi(16)
public final class v
  implements f
{
  protected final r[] aMQ;
  private final f aNq;
  private final v.a aOG;
  final CopyOnWriteArraySet<Object> aOH;
  final CopyOnWriteArraySet<j.a> aOI;
  public final CopyOnWriteArraySet<e.a> aOJ;
  private final int aOK;
  private final int aOL;
  Format aOM;
  Format aON;
  Surface aOO;
  private boolean aOP;
  private int aOQ;
  private SurfaceHolder aOR;
  private TextureView aOS;
  public com.google.android.exoplayer2.a.e aOT;
  com.google.android.exoplayer2.video.e aOU;
  d aOV;
  d aOW;
  int aOX;
  private b aOY;
  private float aOZ;

  protected v(u paramu, com.google.android.exoplayer2.g.h paramh, m paramm)
  {
    AppMethodBeat.i(95410);
    this.aOG = new v.a(this, (byte)0);
    this.aOH = new CopyOnWriteArraySet();
    this.aOI = new CopyOnWriteArraySet();
    this.aOJ = new CopyOnWriteArraySet();
    Looper localLooper;
    int j;
    int k;
    int m;
    if (Looper.myLooper() != null)
    {
      localLooper = Looper.myLooper();
      this.aMQ = paramu.a(new Handler(localLooper), this.aOG, this.aOG, this.aOG, this.aOG);
      paramu = this.aMQ;
      int i = paramu.length;
      j = 0;
      k = 0;
      m = 0;
      label119: if (j >= i)
        break label182;
      switch (paramu[j].getTrackType())
      {
      default:
      case 2:
      case 1:
      }
    }
    while (true)
    {
      j++;
      break label119;
      localLooper = Looper.getMainLooper();
      break;
      m++;
      continue;
      k++;
    }
    label182: this.aOK = m;
    this.aOL = k;
    this.aOZ = 1.0F;
    this.aOX = 0;
    this.aOY = b.aPz;
    this.aOQ = 1;
    this.aNq = new h(this.aMQ, paramh, paramm);
    AppMethodBeat.o(95410);
  }

  public final void a(q.a parama)
  {
    AppMethodBeat.i(95411);
    this.aNq.a(parama);
    AppMethodBeat.o(95411);
  }

  public final void a(i parami)
  {
    AppMethodBeat.i(95414);
    this.aNq.a(parami);
    AppMethodBeat.o(95414);
  }

  public final void a(f.c[] paramArrayOfc)
  {
    AppMethodBeat.i(95422);
    this.aNq.a(paramArrayOfc);
    AppMethodBeat.o(95422);
  }

  public final void aE(boolean paramBoolean)
  {
    AppMethodBeat.i(95415);
    this.aNq.aE(paramBoolean);
    AppMethodBeat.o(95415);
  }

  public final void b(q.a parama)
  {
    AppMethodBeat.i(95412);
    this.aNq.b(parama);
    AppMethodBeat.o(95412);
  }

  public final void b(f.c[] paramArrayOfc)
  {
    AppMethodBeat.i(95423);
    this.aNq.b(paramArrayOfc);
    AppMethodBeat.o(95423);
  }

  public final int getBufferedPercentage()
  {
    AppMethodBeat.i(95427);
    int i = this.aNq.getBufferedPercentage();
    AppMethodBeat.o(95427);
    return i;
  }

  public final long getBufferedPosition()
  {
    AppMethodBeat.i(95426);
    long l = this.aNq.getBufferedPosition();
    AppMethodBeat.o(95426);
    return l;
  }

  public final long getCurrentPosition()
  {
    AppMethodBeat.i(95425);
    long l = this.aNq.getCurrentPosition();
    AppMethodBeat.o(95425);
    return l;
  }

  public final long getDuration()
  {
    AppMethodBeat.i(95424);
    long l = this.aNq.getDuration();
    AppMethodBeat.o(95424);
    return l;
  }

  public final boolean isLoading()
  {
    AppMethodBeat.i(95418);
    boolean bool = this.aNq.isLoading();
    AppMethodBeat.o(95418);
    return bool;
  }

  public final int pO()
  {
    AppMethodBeat.i(95413);
    int i = this.aNq.pO();
    AppMethodBeat.o(95413);
    return i;
  }

  public final boolean pP()
  {
    AppMethodBeat.i(95416);
    boolean bool = this.aNq.pP();
    AppMethodBeat.o(95416);
    return bool;
  }

  public final void release()
  {
    AppMethodBeat.i(95421);
    this.aNq.release();
    if (this.aOS != null)
    {
      if (this.aOS.getSurfaceTextureListener() == this.aOG)
        this.aOS.setSurfaceTextureListener(null);
      this.aOS = null;
    }
    if (this.aOR != null)
    {
      this.aOR.removeCallback(this.aOG);
      this.aOR = null;
    }
    if (this.aOO != null)
    {
      if (this.aOP)
        this.aOO.release();
      this.aOO = null;
    }
    AppMethodBeat.o(95421);
  }

  public final void seekTo(long paramLong)
  {
    AppMethodBeat.i(95419);
    this.aNq.seekTo(paramLong);
    AppMethodBeat.o(95419);
  }

  public final void setRepeatMode(int paramInt)
  {
    AppMethodBeat.i(95417);
    this.aNq.setRepeatMode(paramInt);
    AppMethodBeat.o(95417);
  }

  public final void stop()
  {
    AppMethodBeat.i(95420);
    this.aNq.stop();
    AppMethodBeat.o(95420);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.v
 * JD-Core Version:    0.6.2
 */