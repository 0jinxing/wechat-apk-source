package com.google.android.exoplayer2.source.b.a;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.h.s;
import com.google.android.exoplayer2.h.s.a;
import com.google.android.exoplayer2.h.t;
import com.google.android.exoplayer2.i.u;
import com.google.android.exoplayer2.source.b.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.util.List;

public final class e$a
  implements s.a<t<c>>, Runnable
{
  private final a.a bkK;
  public final s bkL;
  private final t<c> bkM;
  public b bkN;
  public long bkO;
  private long bkP;
  private long bkQ;
  private long bkR;
  private boolean bkS;
  private IOException bkT;

  public e$a(e parame, a.a parama)
  {
    AppMethodBeat.i(125980);
    this.bkK = parama;
    this.bkL = new s("HlsPlaylistTracker:MediaPlaylist");
    this.bkM = new t(parame.bjb.st(), u.m(parame.biH.bjZ, parama.url), parame.bjk);
    AppMethodBeat.o(125980);
  }

  private void b(b paramb)
  {
    AppMethodBeat.i(125984);
    b localb = this.bkN;
    long l1 = SystemClock.elapsedRealtime();
    this.bkO = l1;
    Object localObject1 = this.bkU;
    int i;
    Object localObject2;
    if ((localb == null) || (paramb.bjM > localb.bjM))
    {
      i = 1;
      if (i != 0)
        break label356;
      if (!paramb.bjP)
        break label350;
      if (!localb.bjP)
        break label281;
      localObject2 = localb;
      label65: this.bkN = ((b)localObject2);
      if (this.bkN == localb)
        break label630;
      this.bkT = null;
      this.bkP = l1;
      localObject2 = this.bkU;
      paramb = this.bkK;
      localObject1 = this.bkN;
      if (paramb == ((e)localObject2).bkH)
        if (((e)localObject2).bkI == null)
          if (((b)localObject1).bjP)
            break label624;
    }
    label281: label350: label356: label624: for (boolean bool = true; ; bool = false)
    {
      ((e)localObject2).bkJ = bool;
      ((e)localObject2).bkI = ((b)localObject1);
      ((e)localObject2).bkE.a((b)localObject1);
      int j = ((e)localObject2).bkF.size();
      for (i = 0; i < j; i++)
        ((e.b)((e)localObject2).bkF.get(i)).sx();
      if (paramb.bjM >= localb.bjM)
      {
        i = paramb.bjS.size();
        j = localb.bjS.size();
        if ((i > j) || ((i == j) && (paramb.bjP) && (!localb.bjP)))
        {
          i = 1;
          break;
        }
      }
      i = 0;
      break;
      localObject2 = new b(localb.bjI, localb.bjZ, localb.bka, localb.bjJ, localb.bif, localb.bjK, localb.bjL, localb.bjM, localb.version, localb.bjN, localb.bjO, true, localb.bjQ, localb.bjR, localb.bjS);
      break label65;
      localObject2 = localb;
      break label65;
      if (paramb.bjQ)
        l2 = paramb.bif;
      while (true)
      {
        if (!paramb.bjK)
          break label544;
        i = paramb.bjL;
        localObject2 = new b(paramb.bjI, paramb.bjZ, paramb.bka, paramb.bjJ, l2, true, i, paramb.bjM, paramb.version, paramb.bjN, paramb.bjO, paramb.bjP, paramb.bjQ, paramb.bjR, paramb.bjS);
        break;
        if (((e)localObject1).bkI != null);
        for (long l3 = ((e)localObject1).bkI.bif; ; l3 = 0L)
        {
          l2 = l3;
          if (localb == null)
            break;
          i = localb.bjS.size();
          localObject2 = e.a(localb, paramb);
          if (localObject2 == null)
            break label517;
          l2 = localb.bif + ((b.a)localObject2).bjU;
          break;
        }
        l2 = l3;
        if (i == paramb.bjM - localb.bjM)
          l2 = localb.sC();
      }
      if (((e)localObject1).bkI != null);
      for (j = ((e)localObject1).bkI.bjL; ; j = 0)
      {
        i = j;
        if (localb == null)
          break;
        localObject2 = e.a(localb, paramb);
        i = j;
        if (localObject2 == null)
          break;
        i = localb.bjL + ((b.a)localObject2).bjT - ((b.a)paramb.bjS.get(0)).bjT;
        break;
      }
    }
    label517: label544: label630: if (!this.bkN.bjP)
    {
      if (paramb.bjM + paramb.bjS.size() < this.bkN.bjM)
        this.bkT = new e.c(this.bkK.url, (byte)0);
    }
    else
      if (this.bkN == localb)
        break label798;
    label798: for (long l2 = this.bkN.bjN; ; l2 = this.bkN.bjN / 2L)
    {
      this.bkQ = (com.google.android.exoplayer2.b.w(l2) + l1);
      if ((this.bkK == this.bkU.bkH) && (!this.bkN.bjP))
        sD();
      AppMethodBeat.o(125984);
      return;
      if (l1 - this.bkP <= com.google.android.exoplayer2.b.w(this.bkN.bjN) * 3.5D)
        break;
      this.bkT = new e.d(this.bkK.url, (byte)0);
      sF();
      break;
    }
  }

  private void sE()
  {
    AppMethodBeat.i(125983);
    this.bkL.a(this.bkM, this, this.bkU.bkB);
    AppMethodBeat.o(125983);
  }

  private boolean sF()
  {
    AppMethodBeat.i(125985);
    this.bkR = (SystemClock.elapsedRealtime() + 60000L);
    e.a(this.bkU, this.bkK);
    boolean bool;
    if ((this.bkU.bkH == this.bkK) && (!e.a(this.bkU)))
    {
      bool = true;
      AppMethodBeat.o(125985);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125985);
    }
  }

  public final void run()
  {
    AppMethodBeat.i(125982);
    this.bkS = false;
    sE();
    AppMethodBeat.o(125982);
  }

  public final void sD()
  {
    AppMethodBeat.i(125981);
    this.bkR = 0L;
    if ((this.bkS) || (this.bkL.isLoading()))
      AppMethodBeat.o(125981);
    while (true)
    {
      return;
      long l = SystemClock.elapsedRealtime();
      if (l < this.bkQ)
      {
        this.bkS = true;
        this.bkU.bkD.postDelayed(this, this.bkQ - l);
        AppMethodBeat.o(125981);
      }
      else
      {
        sE();
        AppMethodBeat.o(125981);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.a.e.a
 * JD-Core Version:    0.6.2
 */