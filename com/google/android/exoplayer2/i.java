package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.i.q;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

final class i
  implements Handler.Callback, com.google.android.exoplayer2.g.h.a, com.google.android.exoplayer2.source.h.a, com.google.android.exoplayer2.source.i.a
{
  private final r[] aMQ;
  private final com.google.android.exoplayer2.g.h aMR;
  private final w.b aMV;
  private final w.a aMW;
  private boolean aMY;
  private int aNA;
  private i.c aNB;
  private long aNC;
  private i.a aND;
  private i.a aNE;
  private i.a aNF;
  private w aNc;
  private p aNg;
  private i.b aNh;
  private final s[] aNm;
  private final m aNn;
  private final q aNo;
  private final HandlerThread aNp;
  private final f aNq;
  private final n aNr;
  private r aNs;
  private com.google.android.exoplayer2.i.h aNt;
  private com.google.android.exoplayer2.source.i aNu;
  private r[] aNv;
  private boolean aNw;
  int aNx;
  private int aNy;
  private long aNz;
  private final Handler eventHandler;
  final Handler handler;
  private boolean isLoading;
  boolean released;
  private int repeatMode;
  private int state;

  public i(r[] paramArrayOfr, com.google.android.exoplayer2.g.h paramh, m paramm, boolean paramBoolean, int paramInt, Handler paramHandler, i.b paramb, f paramf)
  {
    AppMethodBeat.i(94804);
    this.aMQ = paramArrayOfr;
    this.aMR = paramh;
    this.aNn = paramm;
    this.aMY = paramBoolean;
    this.repeatMode = paramInt;
    this.eventHandler = paramHandler;
    this.state = 1;
    this.aNh = paramb;
    this.aNq = paramf;
    this.aNm = new s[paramArrayOfr.length];
    for (paramInt = 0; paramInt < paramArrayOfr.length; paramInt++)
    {
      paramArrayOfr[paramInt].setIndex(paramInt);
      this.aNm[paramInt] = paramArrayOfr[paramInt].pC();
    }
    this.aNo = new q();
    this.aNv = new r[0];
    this.aMV = new w.b();
    this.aMW = new w.a();
    this.aNr = new n();
    paramh.bpF = this;
    this.aNg = p.aOC;
    this.aNp = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
    this.aNp.start();
    this.handler = new Handler(this.aNp.getLooper(), this);
    AppMethodBeat.o(94804);
  }

  private void A(long paramLong)
  {
    AppMethodBeat.i(94819);
    if (this.aNF == null);
    for (paramLong = 60000000L + paramLong; ; paramLong = this.aNF.pX() + paramLong)
    {
      this.aNC = paramLong;
      this.aNo.ai(this.aNC);
      r[] arrayOfr = this.aNv;
      int i = arrayOfr.length;
      for (int j = 0; j < i; j++)
        arrayOfr[j].v(this.aNC);
    }
    AppMethodBeat.o(94819);
  }

  private boolean B(long paramLong)
  {
    AppMethodBeat.i(94825);
    boolean bool;
    if ((paramLong == -9223372036854775807L) || (this.aNh.aNT < paramLong) || ((this.aNF.aNN != null) && ((this.aNF.aNN.prepared) || (this.aNF.aNN.aNL.aOx.sh()))))
    {
      bool = true;
      AppMethodBeat.o(94825);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(94825);
    }
  }

  private int a(int paramInt, w paramw1, w paramw2)
  {
    AppMethodBeat.i(94830);
    int i = paramw1.qh();
    int j = 0;
    int k = -1;
    int m = paramInt;
    for (paramInt = j; (paramInt < i) && (k == -1); paramInt++)
    {
      m = paramw1.a(m, this.aMW, this.aMV, this.repeatMode);
      if (m == -1)
        break;
      k = paramw2.ac(paramw1.a(m, this.aMW, true).aNH);
    }
    AppMethodBeat.o(94830);
    return k;
  }

  private long a(com.google.android.exoplayer2.source.i.b paramb, long paramLong)
  {
    AppMethodBeat.i(94817);
    pS();
    this.aNw = false;
    setState(2);
    Object localObject;
    if (this.aNF == null)
    {
      if (this.aND == null)
        break label285;
      this.aND.release();
      localObject = null;
    }
    while (true)
    {
      if ((this.aNF != localObject) || (this.aNF != this.aNE))
      {
        paramb = this.aNv;
        int i = paramb.length;
        int j = 0;
        while (true)
          if (j < i)
          {
            paramb[j].disable();
            j++;
            continue;
            i.a locala1 = this.aNF;
            i.a locala2 = null;
            localObject = locala2;
            if (locala1 == null)
              break;
            if ((locala2 == null) && (a(paramb, paramLong, locala1)))
              locala2 = locala1;
            while (true)
            {
              locala1 = locala1.aNN;
              break;
              locala1.release();
            }
          }
        this.aNv = new r[0];
        this.aNt = null;
        this.aNs = null;
        this.aNF = null;
      }
      if (localObject != null)
      {
        localObject.aNN = null;
        this.aND = localObject;
        this.aNE = localObject;
        b(localObject);
        long l = paramLong;
        if (this.aNF.aNM)
          l = this.aNF.aNG.X(paramLong);
        A(l);
        pW();
        paramLong = l;
      }
      while (true)
      {
        this.handler.sendEmptyMessage(2);
        AppMethodBeat.o(94817);
        return paramLong;
        this.aND = null;
        this.aNE = null;
        this.aNF = null;
        A(paramLong);
      }
      label285: localObject = null;
    }
  }

  private Pair<Integer, Long> a(i.c paramc)
  {
    AppMethodBeat.i(94831);
    Object localObject1 = paramc.aNc;
    Object localObject2 = localObject1;
    if (((w)localObject1).isEmpty())
      localObject2 = this.aNc;
    while (true)
    {
      try
      {
        localObject1 = ((w)localObject2).a(this.aMV, this.aMW, paramc.aNV, paramc.aNW);
        if (this.aNc == localObject2)
        {
          AppMethodBeat.o(94831);
          paramc = (i.c)localObject1;
          return paramc;
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        paramc = new l(this.aNc, paramc.aNV, paramc.aNW);
        AppMethodBeat.o(94831);
        throw paramc;
      }
      int i = this.aNc.ac(localIndexOutOfBoundsException.a(((Integer)((Pair)localObject1).first).intValue(), this.aMW, true).aNH);
      if (i != -1)
      {
        paramc = Pair.create(Integer.valueOf(i), ((Pair)localObject1).second);
        AppMethodBeat.o(94831);
      }
      else
      {
        i = a(((Integer)((Pair)localObject1).first).intValue(), localIndexOutOfBoundsException, this.aNc);
        if (i != -1)
        {
          paramc = dv(this.aNc.a(i, this.aMW, false).aNV);
          AppMethodBeat.o(94831);
        }
        else
        {
          paramc = null;
          AppMethodBeat.o(94831);
        }
      }
    }
  }

  private i.a a(i.a parama, int paramInt)
  {
    AppMethodBeat.i(94827);
    while (true)
    {
      parama.aNL = this.aNr.a(parama.aNL, paramInt);
      if ((parama.aNL.aOA) || (parama.aNN == null))
      {
        AppMethodBeat.o(94827);
        return parama;
      }
      parama = parama.aNN;
    }
  }

  private static void a(i.a parama)
  {
    AppMethodBeat.i(94834);
    while (parama != null)
    {
      parama.release();
      parama = parama.aNN;
    }
    AppMethodBeat.o(94834);
  }

  private static void a(r paramr)
  {
    AppMethodBeat.i(94824);
    if (paramr.getState() == 2)
      paramr.stop();
    AppMethodBeat.o(94824);
  }

  private boolean a(com.google.android.exoplayer2.source.i.b paramb, long paramLong, i.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(94818);
    if ((paramb.equals(parama.aNL.aOx)) && (parama.prepared))
    {
      this.aNc.a(parama.aNL.aOx.bhq, this.aMW, false);
      int i = this.aMW.G(paramLong);
      if ((i == -1) || (this.aMW.aPe[i] == parama.aNL.aOy))
      {
        bool = true;
        AppMethodBeat.o(94818);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(94818);
    }
  }

  private void aF(boolean paramBoolean)
  {
    AppMethodBeat.i(94812);
    Handler localHandler;
    if (this.isLoading != paramBoolean)
    {
      this.isLoading = paramBoolean;
      localHandler = this.eventHandler;
      if (!paramBoolean)
        break label47;
    }
    label47: for (int i = 1; ; i = 0)
    {
      localHandler.obtainMessage(2, i, 0).sendToTarget();
      AppMethodBeat.o(94812);
      return;
    }
  }

  private void aG(boolean paramBoolean)
  {
    AppMethodBeat.i(94822);
    this.handler.removeMessages(2);
    this.aNw = false;
    this.aNo.stop();
    this.aNt = null;
    this.aNs = null;
    this.aNC = 60000000L;
    Object localObject = this.aNv;
    int i = localObject.length;
    int j = 0;
    while (true)
    {
      r localr;
      if (j < i)
        localr = localObject[j];
      try
      {
        a(localr);
        localr.disable();
        label78: j++;
        continue;
        this.aNv = new r[0];
        if (this.aNF != null);
        for (localObject = this.aNF; ; localObject = this.aND)
        {
          a((i.a)localObject);
          this.aND = null;
          this.aNE = null;
          this.aNF = null;
          aF(false);
          if (paramBoolean)
          {
            if (this.aNu != null)
            {
              this.aNu.rY();
              this.aNu = null;
            }
            this.aNr.aNc = null;
            this.aNc = null;
          }
          AppMethodBeat.o(94822);
          return;
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        break label78;
      }
      catch (e locale)
      {
        break label78;
      }
    }
  }

  private void b(i.a parama)
  {
    AppMethodBeat.i(94835);
    if (this.aNF == parama)
      AppMethodBeat.o(94835);
    while (true)
    {
      return;
      boolean[] arrayOfBoolean = new boolean[this.aMQ.length];
      int i = 0;
      int j = 0;
      if (i < this.aMQ.length)
      {
        r localr = this.aMQ[i];
        if (localr.getState() != 0);
        for (int k = 1; ; k = 0)
        {
          arrayOfBoolean[i] = k;
          com.google.android.exoplayer2.g.f localf = parama.aNO.bpH.bpE[i];
          int m = j;
          if (localf != null)
            m = j + 1;
          if ((arrayOfBoolean[i] != 0) && ((localf == null) || ((localr.pH()) && (localr.pE() == this.aNF.aNI[i]))))
          {
            if (localr == this.aNs)
            {
              this.aNo.a(this.aNt);
              this.aNt = null;
              this.aNs = null;
            }
            a(localr);
            localr.disable();
          }
          i++;
          j = m;
          break;
        }
      }
      this.aNF = parama;
      this.eventHandler.obtainMessage(3, parama.aNO).sendToTarget();
      b(arrayOfBoolean, j);
      AppMethodBeat.o(94835);
    }
  }

  private void b(boolean[] paramArrayOfBoolean, int paramInt)
  {
    AppMethodBeat.i(94836);
    this.aNv = new r[paramInt];
    int i = 0;
    paramInt = 0;
    while (paramInt < this.aMQ.length)
    {
      r localr = this.aMQ[paramInt];
      Object localObject = this.aNF.aNO.bpH.bpE[paramInt];
      int j = i;
      if (localObject != null)
      {
        this.aNv[i] = localr;
        if (localr.getState() == 0)
        {
          t localt = this.aNF.aNO.bpI[paramInt];
          if ((this.aMY) && (this.state == 3))
          {
            j = 1;
            if ((paramArrayOfBoolean[paramInt] != 0) || (j == 0))
              break label173;
          }
          Format[] arrayOfFormat;
          label173: for (boolean bool = true; ; bool = false)
          {
            arrayOfFormat = new Format[((com.google.android.exoplayer2.g.f)localObject).length()];
            for (int k = 0; k < arrayOfFormat.length; k++)
              arrayOfFormat[k] = ((com.google.android.exoplayer2.g.f)localObject).eG(k);
            j = 0;
            break;
          }
          localr.a(localt, arrayOfFormat, this.aNF.aNI[paramInt], this.aNC, bool, this.aNF.pX());
          localObject = localr.pD();
          if (localObject != null)
          {
            if (this.aNt != null)
            {
              paramArrayOfBoolean = e.a(new IllegalStateException("Multiple renderer media clocks enabled."));
              AppMethodBeat.o(94836);
              throw paramArrayOfBoolean;
            }
            this.aNt = ((com.google.android.exoplayer2.i.h)localObject);
            this.aNs = localr;
            this.aNt.b(this.aNg);
          }
          if (j != 0)
            localr.start();
        }
        j = i + 1;
      }
      paramInt++;
      i = j;
    }
    AppMethodBeat.o(94836);
  }

  private void c(Object paramObject, int paramInt)
  {
    AppMethodBeat.i(94828);
    this.aNh = new i.b(0L);
    d(paramObject, paramInt);
    this.aNh = new i.b(-9223372036854775807L);
    setState(4);
    aG(false);
    AppMethodBeat.o(94828);
  }

  private void c(f.c[] paramArrayOfc)
  {
    AppMethodBeat.i(94823);
    try
    {
      int i = paramArrayOfc.length;
      for (int j = 0; j < i; j++)
      {
        f.c localc = paramArrayOfc[j];
        localc.aMN.c(localc.aMO, localc.aMP);
      }
      if ((this.state == 3) || (this.state == 2))
        this.handler.sendEmptyMessage(2);
      try
      {
        this.aNy += 1;
        notifyAll();
        return;
      }
      finally
      {
        AppMethodBeat.o(94823);
      }
    }
    finally
    {
      try
      {
        this.aNy += 1;
        notifyAll();
        throw paramArrayOfc;
      }
      finally
      {
        AppMethodBeat.o(94823);
      }
    }
    throw paramArrayOfc;
  }

  private void d(Object paramObject, int paramInt)
  {
    AppMethodBeat.i(94829);
    this.eventHandler.obtainMessage(6, new i.d(this.aNc, paramObject, this.aNh, paramInt)).sendToTarget();
    AppMethodBeat.o(94829);
  }

  private Pair<Integer, Long> dv(int paramInt)
  {
    AppMethodBeat.i(94832);
    Pair localPair = this.aNc.a(this.aMV, this.aMW, paramInt, -9223372036854775807L);
    AppMethodBeat.o(94832);
    return localPair;
  }

  private void e(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(94816);
    this.handler.removeMessages(2);
    paramLong1 = paramLong1 + paramLong2 - SystemClock.elapsedRealtime();
    if (paramLong1 <= 0L)
    {
      this.handler.sendEmptyMessage(2);
      AppMethodBeat.o(94816);
    }
    while (true)
    {
      return;
      this.handler.sendEmptyMessageDelayed(2, paramLong1);
      AppMethodBeat.o(94816);
    }
  }

  private void ms()
  {
    AppMethodBeat.i(94821);
    aG(true);
    this.aNn.pM();
    setState(1);
    try
    {
      this.released = true;
      notifyAll();
      return;
    }
    finally
    {
      AppMethodBeat.o(94821);
    }
  }

  private void pR()
  {
    int i = 0;
    AppMethodBeat.i(94813);
    this.aNw = false;
    this.aNo.start();
    r[] arrayOfr = this.aNv;
    int j = arrayOfr.length;
    while (i < j)
    {
      arrayOfr[i].start();
      i++;
    }
    AppMethodBeat.o(94813);
  }

  private void pS()
  {
    AppMethodBeat.i(94814);
    this.aNo.stop();
    r[] arrayOfr = this.aNv;
    int i = arrayOfr.length;
    for (int j = 0; j < i; j++)
      a(arrayOfr[j]);
    AppMethodBeat.o(94814);
  }

  private void pT()
  {
    AppMethodBeat.i(94815);
    if (this.aNF == null)
    {
      AppMethodBeat.o(94815);
      return;
    }
    long l1 = this.aNF.aNG.rT();
    if (l1 != -9223372036854775807L)
    {
      A(l1);
      this.aNh.aNT = l1;
      this.aNz = (SystemClock.elapsedRealtime() * 1000L);
      if (this.aNv.length != 0)
        break label195;
    }
    label195: for (l1 = -9223372036854775808L; ; l1 = this.aNF.aNG.rU())
    {
      Object localObject = this.aNh;
      long l2 = l1;
      if (l1 == -9223372036854775808L)
        l2 = this.aNF.aNL.aOz;
      ((i.b)localObject).aNU = l2;
      AppMethodBeat.o(94815);
      break;
      if ((this.aNs != null) && (!this.aNs.qf()))
      {
        this.aNC = this.aNt.qy();
        this.aNo.ai(this.aNC);
      }
      while (true)
      {
        localObject = this.aNF;
        l1 = this.aNC - ((i.a)localObject).pX();
        break;
        this.aNC = this.aNo.qy();
      }
    }
  }

  private void pU()
  {
    AppMethodBeat.i(94820);
    aG(true);
    this.aNn.onStopped();
    setState(1);
    AppMethodBeat.o(94820);
  }

  private void pV()
  {
    AppMethodBeat.i(94826);
    int j;
    if ((this.aND != null) && (!this.aND.prepared) && ((this.aNE == null) || (this.aNE.aNN == this.aND)))
    {
      r[] arrayOfr = this.aNv;
      int i = arrayOfr.length;
      j = 0;
      if (j < i)
        if (!arrayOfr[j].pF())
          AppMethodBeat.o(94826);
    }
    while (true)
    {
      return;
      j++;
      break;
      this.aND.aNG.rR();
      AppMethodBeat.o(94826);
    }
  }

  private void pW()
  {
    AppMethodBeat.i(94833);
    boolean bool = this.aND.y(this.aNC);
    aF(bool);
    if (bool)
      this.aND.C(this.aNC);
    AppMethodBeat.o(94833);
  }

  private void setState(int paramInt)
  {
    AppMethodBeat.i(94811);
    if (this.state != paramInt)
    {
      this.state = paramInt;
      this.eventHandler.obtainMessage(1, paramInt, 0).sendToTarget();
    }
    AppMethodBeat.o(94811);
  }

  public final void a(com.google.android.exoplayer2.source.h paramh)
  {
    AppMethodBeat.i(94809);
    this.handler.obtainMessage(8, paramh).sendToTarget();
    AppMethodBeat.o(94809);
  }

  public final void a(w paramw, int paramInt, long paramLong)
  {
    AppMethodBeat.i(94805);
    this.handler.obtainMessage(3, new i.c(paramw, paramInt, paramLong)).sendToTarget();
    AppMethodBeat.o(94805);
  }

  public final void a(w paramw, Object paramObject)
  {
    AppMethodBeat.i(94808);
    this.handler.obtainMessage(7, Pair.create(paramw, paramObject)).sendToTarget();
    AppMethodBeat.o(94808);
  }

  public final void b(f.c[] paramArrayOfc)
  {
    try
    {
      AppMethodBeat.i(94806);
      if (this.released)
        AppMethodBeat.o(94806);
      while (true)
      {
        return;
        int i = this.aNx;
        this.aNx = (i + 1);
        this.handler.obtainMessage(11, paramArrayOfc).sendToTarget();
        int j = 0;
        while (true)
        {
          int k = this.aNy;
          if (k > i)
            break;
          try
          {
            wait();
          }
          catch (InterruptedException paramArrayOfc)
          {
            j = 1;
          }
        }
        if (j != 0)
          Thread.currentThread().interrupt();
        AppMethodBeat.o(94806);
      }
    }
    finally
    {
    }
    throw paramArrayOfc;
  }

  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(94810);
    int i;
    boolean bool;
    Object localObject1;
    label108: label373: int j;
    label204: Object localObject4;
    label279: label317: label584: long l1;
    label560: label741: label746: label752: long l2;
    label643: label865: long l3;
    long l4;
    int k;
    label1612: label1624: label1763: label1776: Object localObject5;
    label1795: label1936: label2011: Object localObject6;
    try
    {
      i = paramMessage.what;
      switch (i)
      {
      default:
        bool = false;
        AppMethodBeat.o(94810);
        return bool;
      case 0:
        localObject1 = (com.google.android.exoplayer2.source.i)paramMessage.obj;
        if (paramMessage.arg1 != 0)
        {
          i = 1;
          this.eventHandler.sendEmptyMessage(0);
          aG(true);
          this.aNn.pL();
          if (i == 0)
            break label204;
          paramMessage = new com/google/android/exoplayer2/i$b;
          paramMessage.<init>(-9223372036854775807L);
        }
        for (this.aNh = paramMessage; ; this.aNh = paramMessage)
        {
          this.aNu = ((com.google.android.exoplayer2.source.i)localObject1);
          if (localObject1 != null)
            ((com.google.android.exoplayer2.source.i)localObject1).a(this.aNq, this);
          setState(2);
          this.handler.sendEmptyMessage(2);
          bool = true;
          AppMethodBeat.o(94810);
          break;
          i = 0;
          break label108;
          paramMessage = new com/google/android/exoplayer2/i$b;
          paramMessage.<init>(this.aNh.aNQ, this.aNh.aNT, this.aNh.aNS);
        }
      case 1:
      case 12:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 8:
      case 7:
      case 9:
      case 10:
      case 11:
      }
    }
    catch (e paramMessage)
    {
      while (true)
      {
        this.eventHandler.obtainMessage(8, paramMessage).sendToTarget();
        pU();
        bool = true;
        AppMethodBeat.o(94810);
      }
      if (paramMessage.arg1 != 0)
      {
        bool = true;
        this.aNw = false;
        this.aMY = bool;
        if (bool)
          break label317;
        pS();
        pT();
      }
      while (true)
      {
        bool = true;
        AppMethodBeat.o(94810);
        break;
        bool = false;
        break label279;
        if (this.state != 3)
          break label373;
        pR();
        this.handler.sendEmptyMessage(2);
      }
    }
    catch (IOException paramMessage)
    {
      while (true)
      {
        this.eventHandler.obtainMessage(8, e.a(paramMessage)).sendToTarget();
        pU();
        bool = true;
        AppMethodBeat.o(94810);
        continue;
        if (this.state == 2)
          this.handler.sendEmptyMessage(2);
      }
    }
    catch (RuntimeException paramMessage)
    {
      while (true)
      {
        this.eventHandler.obtainMessage(8, e.a(paramMessage)).sendToTarget();
        pU();
        bool = true;
        AppMethodBeat.o(94810);
      }
      j = paramMessage.arg1;
      this.repeatMode = j;
      this.aNr.repeatMode = j;
      if (this.aNF != null)
      {
        paramMessage = this.aNF;
        if (paramMessage == null);
      }
      else
      {
        while (true)
        {
          i = this.aNc.a(paramMessage.aNL.aOx.bhq, this.aMW, this.aMV, j);
          while (true)
            if ((paramMessage.aNN != null) && (!paramMessage.aNL.aOA))
            {
              paramMessage = paramMessage.aNN;
              continue;
              paramMessage = this.aND;
              break;
            }
          if ((i == -1) || (paramMessage.aNN == null) || (paramMessage.aNN.aNL.aOx.bhq != i))
            break label560;
          paramMessage = paramMessage.aNN;
        }
        j = this.aND.index;
        if (this.aNE == null)
          break label741;
        i = this.aNE.index;
        if (paramMessage.aNN != null)
        {
          a(paramMessage.aNN);
          paramMessage.aNN = null;
        }
        localObject4 = this.aNr;
        localObject1 = paramMessage.aNL;
        paramMessage.aNL = ((n)localObject4).a((n.a)localObject1, ((n.a)localObject1).aOx);
        if (j > paramMessage.index)
          break label746;
        j = 1;
        if (j == 0)
          this.aND = paramMessage;
        if ((i == -1) || (i > paramMessage.index))
          break label752;
      }
      for (i = 1; ; i = 0)
      {
        if ((i == 0) && (this.aNF != null))
        {
          localObject1 = this.aNF.aNL.aOx;
          l1 = a((com.google.android.exoplayer2.source.i.b)localObject1, this.aNh.aNT);
          paramMessage = new com/google/android/exoplayer2/i$b;
          paramMessage.<init>((com.google.android.exoplayer2.source.i.b)localObject1, l1, this.aNh.aNS);
          this.aNh = paramMessage;
        }
        bool = true;
        AppMethodBeat.o(94810);
        break;
        i = -1;
        break label584;
        j = 0;
        break label643;
      }
      l2 = SystemClock.elapsedRealtime();
      if ((this.aNc == null) && (this.aNu != null))
        this.aNu.rX();
      while (true)
        if (this.aNF == null)
        {
          pV();
          e(l2, 10L);
          bool = true;
          AppMethodBeat.o(94810);
          break;
          if (this.aND == null)
          {
            localObject1 = this.aNr;
            paramMessage = this.aNh;
            paramMessage = ((n)localObject1).a(paramMessage.aNQ, paramMessage.aNS, paramMessage.aNR);
            if (paramMessage != null)
              break label1612;
            this.aNu.rX();
            if ((this.aND != null) && (!this.aND.pY()))
              break label1776;
            aF(false);
          }
          while (true)
          {
            if (this.aNF == null)
              break label1795;
            while ((this.aNF != this.aNE) && (this.aNC >= this.aNF.aNN.aNK))
            {
              this.aNF.release();
              b(this.aNF.aNN);
              paramMessage = new com/google/android/exoplayer2/i$b;
              paramMessage.<init>(this.aNF.aNL.aOx, this.aNF.aNL.aNR, this.aNF.aNL.aNS);
              this.aNh = paramMessage;
              pT();
              this.eventHandler.obtainMessage(5, this.aNh).sendToTarget();
            }
            if ((this.aND.aNL.aOB) || (!this.aND.pY()) || (this.aND.aNL.aOz == -9223372036854775807L) || ((this.aNF != null) && (this.aND.index - this.aNF.index == 100)))
              break label865;
            paramMessage = this.aNr;
            localObject1 = this.aND.aNL;
            l3 = this.aND.pX();
            l4 = this.aNC;
            if (((n.a)localObject1).aOA)
            {
              i = paramMessage.aNc.a(((n.a)localObject1).aOx.bhq, paramMessage.aMW, paramMessage.aMV, paramMessage.repeatMode);
              if (i == -1)
              {
                paramMessage = null;
                break;
              }
              j = paramMessage.aNc.a(i, paramMessage.aMW, false).aNV;
              if (paramMessage.aNc.a(j, paramMessage.aMV).aPo == i)
              {
                l1 = ((n.a)localObject1).aOz;
                localObject1 = paramMessage.aNc.a(paramMessage.aMV, paramMessage.aMW, j, -9223372036854775807L, Math.max(0L, l1 + l3 - l4));
                if (localObject1 == null)
                {
                  paramMessage = null;
                  break;
                }
                i = ((Integer)((Pair)localObject1).first).intValue();
              }
              for (l1 = ((Long)((Pair)localObject1).second).longValue(); ; l1 = 0L)
              {
                paramMessage = paramMessage.a(paramMessage.g(i, l1), l1, l1);
                break;
              }
            }
            localObject4 = ((n.a)localObject1).aOx;
            if (((com.google.android.exoplayer2.source.i.b)localObject4).sh())
            {
              j = ((com.google.android.exoplayer2.source.i.b)localObject4).bhr;
              paramMessage.aNc.a(((com.google.android.exoplayer2.source.i.b)localObject4).bhq, paramMessage.aMW, false);
              k = paramMessage.aMW.aPf[j];
              if (k == -1)
              {
                paramMessage = null;
                break;
              }
              i = ((com.google.android.exoplayer2.source.i.b)localObject4).bhs + 1;
              if (i < k)
              {
                if (!paramMessage.aMW.ba(j, i))
                {
                  paramMessage = null;
                  break;
                }
                paramMessage = paramMessage.b(((com.google.android.exoplayer2.source.i.b)localObject4).bhq, j, i, ((n.a)localObject1).aNS);
                break;
              }
              i = paramMessage.aMW.G(((n.a)localObject1).aNS);
              if (i == -1);
              for (l1 = -9223372036854775808L; ; l1 = paramMessage.aMW.aPe[i])
              {
                paramMessage = paramMessage.c(((com.google.android.exoplayer2.source.i.b)localObject4).bhq, ((n.a)localObject1).aNS, l1);
                break;
              }
            }
            if (((n.a)localObject1).aOy != -9223372036854775808L)
            {
              i = paramMessage.aMW.F(((n.a)localObject1).aOy);
              if (!paramMessage.aMW.ba(i, 0))
              {
                paramMessage = null;
                break;
              }
              paramMessage = paramMessage.b(((com.google.android.exoplayer2.source.i.b)localObject4).bhq, i, 0, ((n.a)localObject1).aOy);
              break;
            }
            i = paramMessage.aMW.qi();
            if ((i == 0) || (paramMessage.aMW.aPe[(i - 1)] != -9223372036854775808L) || (paramMessage.aMW.dy(i - 1)) || (!paramMessage.aMW.ba(i - 1, 0)))
            {
              paramMessage = null;
              break;
            }
            l1 = paramMessage.aMW.aOz;
            paramMessage = paramMessage.b(((com.google.android.exoplayer2.source.i.b)localObject4).bhq, i - 1, 0, l1);
            break;
            if (this.aND == null)
            {
              l1 = 60000000L;
              if (this.aND != null)
                break label1763;
            }
            for (i = 0; ; i = this.aND.index + 1)
            {
              localObject4 = this.aNc.a(paramMessage.aOx.bhq, this.aMW, true).aNH;
              localObject1 = new com/google/android/exoplayer2/i$a;
              ((i.a)localObject1).<init>(this.aMQ, this.aNm, l1, this.aMR, this.aNn, this.aNu, localObject4, i, paramMessage);
              if (this.aND != null)
                this.aND.aNN = ((i.a)localObject1);
              this.aND = ((i.a)localObject1);
              this.aND.aNG.a(this, paramMessage.aNR);
              aF(true);
              break;
              l1 = this.aND.pX() + this.aND.aNL.aOz;
              break label1624;
            }
            if ((this.aND != null) && (!this.isLoading))
              pW();
          }
          continue;
          if (this.aNE.aNL.aOB)
          {
            for (i = 0; i < this.aMQ.length; i++)
            {
              paramMessage = this.aMQ[i];
              localObject1 = this.aNE.aNI[i];
              if ((localObject1 != null) && (paramMessage.pE() == localObject1) && (paramMessage.pF()))
                paramMessage.pG();
            }
          }
          else
          {
            for (i = 0; ; i++)
            {
              if (i >= this.aMQ.length)
                break label1936;
              localObject1 = this.aMQ[i];
              paramMessage = this.aNE.aNI[i];
              if ((((r)localObject1).pE() != paramMessage) || ((paramMessage != null) && (!((r)localObject1).pF())))
                break;
            }
            if ((this.aNE.aNN != null) && (this.aNE.aNN.prepared))
            {
              localObject5 = this.aNE.aNO;
              this.aNE = this.aNE.aNN;
              paramMessage = this.aNE.aNO;
              if (this.aNE.aNG.rT() != -9223372036854775807L);
              for (i = 1; ; i = 0)
              {
                j = 0;
                if (j >= this.aMQ.length)
                  break label2182;
                localObject1 = this.aMQ[j];
                if (localObject5.bpH.bpE[j] == null)
                  break label2178;
                if (i != 0)
                  break label2184;
                if (((r)localObject1).pH())
                  break label2178;
                localObject4 = paramMessage.bpH.bpE[j];
                t localt = localObject5.bpI[j];
                localObject6 = paramMessage.bpI[j];
                if ((localObject4 == null) || (!((t)localObject6).equals(localt)))
                  break label2184;
                localObject6 = new Format[((com.google.android.exoplayer2.g.f)localObject4).length()];
                for (k = 0; k < localObject6.length; k++)
                  localObject6[k] = ((com.google.android.exoplayer2.g.f)localObject4).eG(k);
              }
              ((r)localObject1).a((Format[])localObject6, this.aNE.aNI[j], this.aNE.pX());
              while (true)
              {
                label2178: j++;
                break label2011;
                label2182: break;
                label2184: ((r)localObject1).pG();
              }
            }
          }
        }
      com.google.android.exoplayer2.i.t.beginSection("doSomeWork");
      pT();
      this.aNF.aNG.W(this.aNh.aNT);
      i = 1;
      bool = true;
      localObject1 = this.aNv;
      int m = localObject1.length;
      j = 0;
      if (j < m)
      {
        paramMessage = localObject1[j];
        paramMessage.f(this.aNC, this.aNz);
        if ((i != 0) && (paramMessage.qf()))
        {
          i = 1;
          label2283: if ((!paramMessage.isReady()) && (!paramMessage.qf()))
            break label2337;
          k = 1;
          label2304: if (k == 0)
            paramMessage.pI();
          if ((!bool) || (k == 0))
            break label2343;
        }
        label2337: label2343: for (bool = true; ; bool = false)
        {
          j++;
          break;
          i = 0;
          break label2283;
          k = 0;
          break label2304;
        }
      }
      if (!bool)
        pV();
      if (this.aNt != null)
      {
        paramMessage = this.aNt.qC();
        if (!paramMessage.equals(this.aNg))
        {
          this.aNg = paramMessage;
          this.aNo.a(this.aNt);
          this.eventHandler.obtainMessage(7, paramMessage).sendToTarget();
        }
      }
      l1 = this.aNF.aNL.aOz;
      if ((i != 0) && ((l1 == -9223372036854775807L) || (l1 <= this.aNh.aNT)) && (this.aNF.aNL.aOB))
      {
        setState(4);
        pS();
      }
      label2564: label2589: label2728: 
      while (this.state == 2)
      {
        paramMessage = this.aNv;
        j = paramMessage.length;
        for (i = 0; i < j; i++)
          paramMessage[i].pI();
        if (this.state == 2)
        {
          if (this.aNv.length > 0)
            if (bool)
            {
              paramMessage = this.aND;
              bool = this.aNw;
              l4 = this.aNC;
              if (!paramMessage.prepared)
              {
                l1 = paramMessage.aNL.aNR;
                l3 = l1;
                if (l1 != -9223372036854775808L)
                  break label2641;
                if (!paramMessage.aNL.aOB)
                  break label2632;
                bool = true;
                if (!bool)
                  break label2665;
                bool = true;
              }
            }
          while (true)
          {
            if (!bool)
              break label2678;
            setState(3);
            if (!this.aMY)
              break;
            pR();
            break;
            l1 = paramMessage.aNG.rU();
            break label2564;
            label2632: l3 = paramMessage.aNL.aOz;
            label2641: bool = paramMessage.aNn.c(l3 - (l4 - paramMessage.pX()), bool);
            break label2589;
            label2665: bool = false;
            continue;
            bool = B(l1);
          }
        }
        else
        {
          label2678: if (this.state == 3)
          {
            if (this.aNv.length > 0);
            while (true)
            {
              if (bool)
                break label2728;
              this.aNw = this.aMY;
              setState(2);
              pS();
              break;
              bool = B(l1);
            }
          }
        }
      }
      if (((this.aMY) && (this.state == 3)) || (this.state == 2))
        e(l2, 10L);
      while (true)
      {
        com.google.android.exoplayer2.i.t.endSection();
        break;
        if ((this.aNv.length != 0) && (this.state != 4))
          e(l2, 1000L);
        else
          this.handler.removeMessages(2);
      }
      localObject1 = (i.c)paramMessage.obj;
      if (this.aNc != null)
        break label2850;
    }
    this.aNA += 1;
    this.aNB = ((i.c)localObject1);
    while (true)
    {
      label2839: bool = true;
      AppMethodBeat.o(94810);
      break;
      label2850: paramMessage = a((i.c)localObject1);
      if (paramMessage != null)
        break label2921;
      paramMessage = new com/google/android/exoplayer2/i$b;
      paramMessage.<init>(0L);
      this.aNh = paramMessage;
      this.eventHandler.obtainMessage(4, 1, 0, this.aNh).sendToTarget();
      paramMessage = new com/google/android/exoplayer2/i$b;
      paramMessage.<init>(-9223372036854775807L);
      this.aNh = paramMessage;
      setState(4);
      aG(false);
    }
    label2921: if (((i.c)localObject1).aNW == -9223372036854775807L)
    {
      i = 1;
      label2935: j = ((Integer)paramMessage.first).intValue();
      l3 = ((Long)paramMessage.second).longValue();
      paramMessage = this.aNr.g(j, l3);
      bool = paramMessage.sh();
      if (!bool)
        break label5058;
      l1 = 0L;
      i = 1;
    }
    while (true)
    {
      try
      {
        if (paramMessage.equals(this.aNh.aNQ))
        {
          l2 = l1 / 1000L;
          l4 = this.aNh.aNT / 1000L;
          if (l2 == l4)
          {
            localObject1 = new com/google/android/exoplayer2/i$b;
            ((i.b)localObject1).<init>(paramMessage, l1, l3);
            this.aNh = ((i.b)localObject1);
            paramMessage = this.eventHandler;
            if (i != 0)
            {
              i = 1;
              paramMessage.obtainMessage(4, i, 0, this.aNh).sendToTarget();
              break label2839;
              i = 0;
              break label2935;
            }
            i = 0;
            continue;
          }
        }
        l2 = a(paramMessage, l1);
        if (l1 != l2)
        {
          j = 1;
          localObject1 = new com/google/android/exoplayer2/i$b;
          ((i.b)localObject1).<init>(paramMessage, l2, l3);
          this.aNh = ((i.b)localObject1);
          paramMessage = this.eventHandler;
          if ((i | j) == 0)
            continue;
          i = 1;
          paramMessage.obtainMessage(4, i, 0, this.aNh).sendToTarget();
          break label2839;
        }
        j = 0;
        continue;
        i = 0;
        continue;
      }
      finally
      {
        localObject4 = new com/google/android/exoplayer2/i$b;
        ((i.b)localObject4).<init>(paramMessage, l1, l3);
        this.aNh = ((i.b)localObject4);
        paramMessage = this.eventHandler;
        if (i != 0)
        {
          i = 1;
          paramMessage.obtainMessage(4, i, 0, this.aNh).sendToTarget();
          AppMethodBeat.o(94810);
          throw localObject2;
        }
        i = 0;
        continue;
      }
      paramMessage = (p)paramMessage.obj;
      if (this.aNt != null);
      for (paramMessage = this.aNt.b(paramMessage); ; paramMessage = this.aNo.b(paramMessage))
      {
        this.aNg = paramMessage;
        this.eventHandler.obtainMessage(7, paramMessage).sendToTarget();
        bool = true;
        AppMethodBeat.o(94810);
        break;
      }
      pU();
      bool = true;
      AppMethodBeat.o(94810);
      break;
      ms();
      bool = true;
      AppMethodBeat.o(94810);
      break;
      paramMessage = (com.google.android.exoplayer2.source.h)paramMessage.obj;
      if (this.aND != null)
      {
        localObject3 = this.aND.aNG;
        if (localObject3 == paramMessage)
          break label3370;
      }
      while (true)
      {
        bool = true;
        AppMethodBeat.o(94810);
        break;
        label3370: localObject4 = this.aND;
        ((i.a)localObject4).prepared = true;
        ((i.a)localObject4).pZ();
        l1 = ((i.a)localObject4).D(((i.a)localObject4).aNL.aNR);
        localObject3 = ((i.a)localObject4).aNL;
        paramMessage = new com/google/android/exoplayer2/n$a;
        paramMessage.<init>(((n.a)localObject3).aOx, l1, ((n.a)localObject3).aOy, ((n.a)localObject3).aNS, ((n.a)localObject3).aOz, ((n.a)localObject3).aOA, ((n.a)localObject3).aOB);
        ((i.a)localObject4).aNL = paramMessage;
        if (this.aNF == null)
        {
          this.aNE = this.aND;
          A(this.aNE.aNL.aNR);
          b(this.aNE);
        }
        pW();
      }
      paramMessage = (Pair)paramMessage.obj;
      localObject5 = this.aNc;
      this.aNc = ((w)paramMessage.first);
      this.aNr.aNc = this.aNc;
      localObject4 = paramMessage.second;
      if (localObject5 == null)
      {
        if (this.aNA > 0)
        {
          paramMessage = a(this.aNB);
          j = this.aNA;
          this.aNA = 0;
          this.aNB = null;
          if (paramMessage == null)
            c(localObject4, j);
        }
        while (true)
        {
          bool = true;
          AppMethodBeat.o(94810);
          break;
          i = ((Integer)paramMessage.first).intValue();
          l3 = ((Long)paramMessage.second).longValue();
          paramMessage = this.aNr.g(i, l3);
          localObject3 = new com/google/android/exoplayer2/i$b;
          if (paramMessage.sh());
          for (l1 = 0L; ; l1 = l3)
          {
            ((i.b)localObject3).<init>(paramMessage, l1, l3);
            this.aNh = ((i.b)localObject3);
            d(localObject4, j);
            break;
          }
          if (this.aNh.aNR != -9223372036854775807L)
            break label3790;
          if (!this.aNc.isEmpty())
            break label3719;
          c(localObject4, 0);
        }
        label3719: paramMessage = dv(0);
        i = ((Integer)paramMessage.first).intValue();
        l3 = ((Long)paramMessage.second).longValue();
        localObject3 = this.aNr.g(i, l3);
        paramMessage = new com/google/android/exoplayer2/i$b;
        if (((com.google.android.exoplayer2.source.i.b)localObject3).sh());
        for (l1 = 0L; ; l1 = l3)
        {
          paramMessage.<init>((com.google.android.exoplayer2.source.i.b)localObject3, l1, l3);
          this.aNh = paramMessage;
          label3790: d(localObject4, 0);
          break;
        }
      }
      j = this.aNh.aNQ.bhq;
      if (this.aNF != null)
      {
        paramMessage = this.aNF;
        label3831: if ((paramMessage == null) && (j >= ((w)localObject5).qh()))
          break label4106;
        if (paramMessage != null)
          break label3917;
      }
      label3917: for (Object localObject3 = ((w)localObject5).a(j, this.aMW, true).aNH; ; localObject3 = paramMessage.aNH)
      {
        i = this.aNc.ac(localObject3);
        if (i != -1)
          break label4116;
        i = a(j, (w)localObject5, this.aNc);
        if (i != -1)
          break label3926;
        c(localObject4, 0);
        break;
        paramMessage = this.aND;
        break label3831;
      }
      label3926: localObject3 = dv(this.aNc.a(i, this.aMW, false).aNV);
      i = ((Integer)((Pair)localObject3).first).intValue();
      l1 = ((Long)((Pair)localObject3).second).longValue();
      this.aNc.a(i, this.aMW, true);
      if (paramMessage != null)
      {
        localObject3 = this.aMW.aNH;
        paramMessage.aNL = paramMessage.aNL.qd();
        while (paramMessage.aNN != null)
        {
          paramMessage = paramMessage.aNN;
          if (paramMessage.aNH.equals(localObject3))
            paramMessage.aNL = this.aNr.a(paramMessage.aNL, i);
          else
            paramMessage.aNL = paramMessage.aNL.qd();
        }
      }
      localObject3 = new com/google/android/exoplayer2/source/i$b;
      ((com.google.android.exoplayer2.source.i.b)localObject3).<init>(i);
      l1 = a((com.google.android.exoplayer2.source.i.b)localObject3, l1);
      paramMessage = new com/google/android/exoplayer2/i$b;
      paramMessage.<init>((com.google.android.exoplayer2.source.i.b)localObject3, l1);
      this.aNh = paramMessage;
      while (true)
      {
        label4106: d(localObject4, 0);
        break;
        label4116: if (i != j)
        {
          localObject5 = this.aNh;
          localObject3 = new com/google/android/exoplayer2/i$b;
          ((i.b)localObject3).<init>(((i.b)localObject5).aNQ.em(i), ((i.b)localObject5).aNR, ((i.b)localObject5).aNS);
          ((i.b)localObject3).aNT = ((i.b)localObject5).aNT;
          ((i.b)localObject3).aNU = ((i.b)localObject5).aNU;
          this.aNh = ((i.b)localObject3);
        }
        if (this.aNh.aNQ.sh())
        {
          localObject3 = this.aNr.g(i, this.aNh.aNS);
          if ((!((com.google.android.exoplayer2.source.i.b)localObject3).sh()) || (((com.google.android.exoplayer2.source.i.b)localObject3).bhs != this.aNh.aNQ.bhs))
          {
            l3 = a((com.google.android.exoplayer2.source.i.b)localObject3, this.aNh.aNS);
            if (((com.google.android.exoplayer2.source.i.b)localObject3).sh());
            for (l1 = this.aNh.aNS; ; l1 = -9223372036854775807L)
            {
              paramMessage = new com/google/android/exoplayer2/i$b;
              paramMessage.<init>((com.google.android.exoplayer2.source.i.b)localObject3, l3, l1);
              this.aNh = paramMessage;
              break;
            }
          }
        }
        if (paramMessage != null)
        {
          for (paramMessage = a(paramMessage, i); paramMessage.aNN != null; paramMessage = a((i.a)localObject3, i))
          {
            localObject3 = paramMessage.aNN;
            i = this.aNc.a(i, this.aMW, this.aMV, this.repeatMode);
            if ((i == -1) || (!((i.a)localObject3).aNH.equals(this.aNc.a(i, this.aMW, true).aNH)))
              break label4389;
          }
          continue;
          label4389: if ((this.aNE != null) && (this.aNE.index < ((i.a)localObject3).index));
          for (i = 1; ; i = 0)
          {
            if (i != 0)
              break label4480;
            l1 = a(this.aNF.aNL.aOx, this.aNh.aNT);
            paramMessage = new com/google/android/exoplayer2/i$b;
            paramMessage.<init>(this.aNF.aNL.aOx, l1, this.aNh.aNS);
            this.aNh = paramMessage;
            break;
          }
          label4480: this.aND = paramMessage;
          this.aND.aNN = null;
          a((i.a)localObject3);
        }
      }
      paramMessage = (com.google.android.exoplayer2.source.h)paramMessage.obj;
      if (this.aND != null)
      {
        localObject3 = this.aND.aNG;
        if (localObject3 == paramMessage)
          break label4542;
      }
      while (true)
      {
        bool = true;
        AppMethodBeat.o(94810);
        break;
        label4542: pW();
      }
      if (this.aNF != null)
      {
        paramMessage = this.aNF;
        i = 1;
      }
      while (true)
      {
        if (paramMessage != null)
        {
          bool = paramMessage.prepared;
          if (bool);
        }
        else
        {
          bool = true;
          AppMethodBeat.o(94810);
          break;
        }
        if (paramMessage.pZ())
          break label4612;
        if (paramMessage == this.aNE)
          i = 0;
        paramMessage = paramMessage.aNN;
      }
      label4612: if (i != 0)
      {
        if (this.aNE != this.aNF)
        {
          bool = true;
          a(this.aNF.aNN);
          this.aNF.aNN = null;
          this.aND = this.aNF;
          this.aNE = this.aNF;
          localObject4 = new boolean[this.aMQ.length];
          l1 = this.aNF.a(this.aNh.aNT, bool, (boolean[])localObject4);
          if (l1 != this.aNh.aNT)
          {
            this.aNh.aNT = l1;
            A(l1);
          }
          k = 0;
          localObject6 = new boolean[this.aMQ.length];
          i = 0;
          label4733: if (i >= this.aMQ.length)
            break label4900;
          localObject3 = this.aMQ[i];
          if (((r)localObject3).getState() == 0)
            break label4874;
          bool = true;
          label4762: localObject6[i] = bool;
          localObject5 = this.aNF.aNI[i];
          j = k;
          if (localObject5 != null)
            j = k + 1;
          if (localObject6[i] != 0)
          {
            if (localObject5 == ((r)localObject3).pE())
              break label4879;
            if (localObject3 == this.aNs)
            {
              if (localObject5 == null)
                this.aNo.a(this.aNt);
              this.aNt = null;
              this.aNs = null;
            }
            a((r)localObject3);
            ((r)localObject3).disable();
          }
        }
        while (true)
        {
          i++;
          k = j;
          break label4733;
          bool = false;
          break;
          label4874: bool = false;
          break label4762;
          label4879: if (localObject4[i] != 0)
            ((r)localObject3).v(this.aNC);
        }
        label4900: this.eventHandler.obtainMessage(3, paramMessage.aNO).sendToTarget();
        b((boolean[])localObject6, k);
      }
      while (true)
      {
        pW();
        pT();
        this.handler.sendEmptyMessage(2);
        break;
        this.aND = paramMessage;
        for (paramMessage = this.aND.aNN; paramMessage != null; paramMessage = paramMessage.aNN)
          paramMessage.release();
        this.aND.aNN = null;
        if (this.aND.prepared)
        {
          l1 = this.aND.aNL.aNR;
          paramMessage = this.aND;
          l1 = Math.max(l1, this.aNC - paramMessage.pX());
          this.aND.D(l1);
        }
      }
      c((f.c[])paramMessage.obj);
      bool = true;
      AppMethodBeat.o(94810);
      break;
      label5058: l1 = l3;
    }
  }

  public final void release()
  {
    try
    {
      AppMethodBeat.i(94807);
      if (this.released)
        AppMethodBeat.o(94807);
      while (true)
      {
        return;
        this.handler.sendEmptyMessage(6);
        int i = 0;
        while (true)
        {
          boolean bool = this.released;
          if (bool)
            break;
          try
          {
            wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            i = 1;
          }
        }
        if (i != 0)
          Thread.currentThread().interrupt();
        this.aNp.quit();
        AppMethodBeat.o(94807);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i
 * JD-Core Version:    0.6.2
 */