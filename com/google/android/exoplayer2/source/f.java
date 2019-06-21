package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.h.b;
import com.google.android.exoplayer2.h.s;
import com.google.android.exoplayer2.h.s.a;
import com.google.android.exoplayer2.h.s.d;
import com.google.android.exoplayer2.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

final class f
  implements g, s.a<f.a>, s.d, h, k.b
{
  long aOz;
  private final com.google.android.exoplayer2.h.f aSF;
  private final int bgC;
  final g.a bgD;
  final f.c bgE;
  private final b bgF;
  final String bgG;
  final long bgH;
  final s bgI;
  private final f.b bgJ;
  final com.google.android.exoplayer2.i.e bgK;
  private final Runnable bgL;
  final Runnable bgM;
  com.google.android.exoplayer2.c.l bgN;
  k[] bgO;
  private int[] bgP;
  boolean bgQ;
  private boolean bgR;
  boolean bgS;
  private int bgT;
  p bgU;
  boolean[] bgV;
  boolean[] bgW;
  boolean bgX;
  private long bgY;
  long bgZ;
  h.a bgq;
  private long bha;
  private int bhb;
  boolean bhc;
  private final Handler eventHandler;
  final Handler handler;
  boolean prepared;
  boolean released;
  private final Uri uri;

  public f(Uri paramUri, com.google.android.exoplayer2.h.f paramf, com.google.android.exoplayer2.c.e[] paramArrayOfe, int paramInt1, Handler paramHandler, g.a parama, f.c paramc, b paramb, String paramString, int paramInt2)
  {
    AppMethodBeat.i(95486);
    this.uri = paramUri;
    this.aSF = paramf;
    this.bgC = paramInt1;
    this.eventHandler = paramHandler;
    this.bgD = parama;
    this.bgE = paramc;
    this.bgF = paramb;
    this.bgG = paramString;
    this.bgH = paramInt2;
    this.bgI = new s("Loader:ExtractorMediaPeriod");
    this.bgJ = new f.b(paramArrayOfe, this);
    this.bgK = new com.google.android.exoplayer2.i.e();
    this.bgL = new f.1(this);
    this.bgM = new f.2(this);
    this.handler = new Handler();
    this.bgP = new int[0];
    this.bgO = new k[0];
    this.bha = -9223372036854775807L;
    this.bgY = -1L;
    AppMethodBeat.o(95486);
  }

  private void a(f.a parama)
  {
    if (this.bgY == -1L)
      this.bgY = parama.bgY;
  }

  private boolean aa(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(95500);
    int i = this.bgO.length;
    int j = 0;
    k localk;
    if (j < i)
    {
      localk = this.bgO[j];
      localk.rewind();
      if ((!localk.g(paramLong, false)) && ((this.bgW[j] != 0) || (!this.bgX)))
        AppMethodBeat.o(95500);
    }
    while (true)
    {
      return bool;
      localk.sp();
      j++;
      break;
      bool = true;
      AppMethodBeat.o(95500);
    }
  }

  private int sb()
  {
    AppMethodBeat.i(95501);
    k[] arrayOfk = this.bgO;
    int i = arrayOfk.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m + k)
    {
      m = arrayOfk[j].bhG.si();
      j++;
    }
    AppMethodBeat.o(95501);
    return k;
  }

  private long sc()
  {
    AppMethodBeat.i(95502);
    long l = -9223372036854775808L;
    k[] arrayOfk = this.bgO;
    int i = arrayOfk.length;
    for (int j = 0; j < i; j++)
      l = Math.max(l, arrayOfk[j].bhG.sc());
    AppMethodBeat.o(95502);
    return l;
  }

  private void startLoading()
  {
    AppMethodBeat.i(95499);
    f.a locala = new f.a(this, this.uri, this.aSF, this.bgJ, this.bgK);
    if (this.prepared)
    {
      a.checkState(sd());
      if ((this.aOz != -9223372036854775807L) && (this.bha >= this.aOz))
      {
        this.bhc = true;
        this.bha = -9223372036854775807L;
        AppMethodBeat.o(95499);
        return;
      }
      locala.j(this.bgN.M(this.bha), this.bha);
      this.bha = -9223372036854775807L;
    }
    this.bhb = sb();
    int i = this.bgC;
    int j = i;
    if (i == -1)
      if ((this.prepared) && (this.bgY == -1L) && ((this.bgN == null) || (this.bgN.getDurationUs() == -9223372036854775807L)))
        break label195;
    label195: for (j = 3; ; j = 6)
    {
      this.bgI.a(locala, this, j);
      AppMethodBeat.o(95499);
      break;
    }
  }

  public final void W(long paramLong)
  {
    AppMethodBeat.i(95490);
    int i = this.bgO.length;
    for (int j = 0; j < i; j++)
      this.bgO[j].i(paramLong, this.bgV[j]);
    AppMethodBeat.o(95490);
  }

  public final long X(long paramLong)
  {
    AppMethodBeat.i(95494);
    if (this.bgN.qX());
    while (true)
    {
      this.bgZ = paramLong;
      this.bgS = false;
      if ((sd()) || (!aa(paramLong)))
        break;
      AppMethodBeat.o(95494);
      return paramLong;
      paramLong = 0L;
    }
    this.bha = paramLong;
    this.bhc = false;
    if (this.bgI.isLoading())
      this.bgI.cancelLoading();
    while (true)
    {
      AppMethodBeat.o(95494);
      break;
      k[] arrayOfk = this.bgO;
      int i = arrayOfk.length;
      for (int j = 0; j < i; j++)
        arrayOfk[j].reset(false);
    }
  }

  public final boolean Y(long paramLong)
  {
    AppMethodBeat.i(95491);
    boolean bool;
    if ((this.bhc) || ((this.prepared) && (this.bgT == 0)))
    {
      bool = false;
      AppMethodBeat.o(95491);
    }
    while (true)
    {
      return bool;
      bool = this.bgK.open();
      if (!this.bgI.isLoading())
      {
        startLoading();
        bool = true;
      }
      AppMethodBeat.o(95491);
    }
  }

  public final long a(com.google.android.exoplayer2.g.f[] paramArrayOff, boolean[] paramArrayOfBoolean1, l[] paramArrayOfl, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(95489);
    a.checkState(this.prepared);
    int k = this.bgT;
    int n;
    for (int m = 0; m < paramArrayOff.length; m++)
      if ((paramArrayOfl[m] != null) && ((paramArrayOff[m] == null) || (paramArrayOfBoolean1[m] == 0)))
      {
        n = ((f.d)paramArrayOfl[m]).track;
        a.checkState(this.bgV[n]);
        this.bgT -= 1;
        this.bgV[n] = false;
        paramArrayOfl[m] = null;
      }
    label125: boolean bool;
    if (this.bgR)
      if (k == 0)
      {
        m = 1;
        k = 0;
        if (k >= paramArrayOff.length)
          break label353;
        if ((paramArrayOfl[k] != null) || (paramArrayOff[k] == null))
          break label521;
        paramArrayOfBoolean1 = paramArrayOff[k];
        if (paramArrayOfBoolean1.length() != 1)
          break label329;
        bool = true;
        label164: a.checkState(bool);
        if (paramArrayOfBoolean1.eH(0) != 0)
          break label335;
        bool = true;
        label182: a.checkState(bool);
        n = this.bgU.a(paramArrayOfBoolean1.tf());
        if (this.bgV[n] != 0)
          break label341;
        bool = true;
        label215: a.checkState(bool);
        this.bgT += 1;
        this.bgV[n] = true;
        paramArrayOfl[k] = new f.d(this, n);
        paramArrayOfBoolean2[k] = true;
        if (m != 0)
          break label521;
        paramArrayOfBoolean1 = this.bgO[n];
        paramArrayOfBoolean1.rewind();
        if ((paramArrayOfBoolean1.g(paramLong, true)) || (paramArrayOfBoolean1.bhG.sj() == 0))
          break label347;
        m = 1;
      }
    label521: 
    while (true)
    {
      k++;
      break label125;
      m = 0;
      break;
      if (paramLong != 0L)
      {
        m = 1;
        break;
      }
      m = 0;
      break;
      label329: bool = false;
      break label164;
      label335: bool = false;
      break label182;
      label341: bool = false;
      break label215;
      label347: m = 0;
      continue;
      label353: long l;
      if (this.bgT == 0)
      {
        this.bgS = false;
        if (this.bgI.isLoading())
        {
          paramArrayOff = this.bgO;
          k = paramArrayOff.length;
          for (m = j; m < k; m++)
            paramArrayOff[m].sq();
          this.bgI.cancelLoading();
          l = paramLong;
        }
      }
      do
      {
        this.bgR = true;
        AppMethodBeat.o(95489);
        return l;
        paramArrayOff = this.bgO;
        k = paramArrayOff.length;
        for (m = 0; ; m++)
        {
          l = paramLong;
          if (m >= k)
            break;
          paramArrayOff[m].reset(false);
        }
        l = paramLong;
      }
      while (m == 0);
      paramLong = X(paramLong);
      for (m = i; ; m++)
      {
        l = paramLong;
        if (m >= paramArrayOfl.length)
          break;
        if (paramArrayOfl[m] != null)
          paramArrayOfBoolean2[m] = true;
      }
    }
  }

  public final void a(com.google.android.exoplayer2.c.l paraml)
  {
    AppMethodBeat.i(95497);
    this.bgN = paraml;
    this.handler.post(this.bgL);
    AppMethodBeat.o(95497);
  }

  public final void a(h.a parama, long paramLong)
  {
    AppMethodBeat.i(95488);
    this.bgq = parama;
    this.bgK.open();
    startLoading();
    AppMethodBeat.o(95488);
  }

  public final m dM(int paramInt)
  {
    AppMethodBeat.i(95495);
    int i = this.bgO.length;
    int j = 0;
    k localk;
    if (j < i)
      if (this.bgP[j] == paramInt)
      {
        localk = this.bgO[j];
        AppMethodBeat.o(95495);
      }
    while (true)
    {
      return localk;
      j++;
      break;
      localk = new k(this.bgF);
      localk.bhQ = this;
      this.bgP = Arrays.copyOf(this.bgP, i + 1);
      this.bgP[i] = paramInt;
      this.bgO = ((k[])Arrays.copyOf(this.bgO, i + 1));
      this.bgO[i] = localk;
      AppMethodBeat.o(95495);
    }
  }

  public final void rR()
  {
  }

  public final p rS()
  {
    return this.bgU;
  }

  public final long rT()
  {
    if (this.bgS)
      this.bgS = false;
    for (long l = this.bgZ; ; l = -9223372036854775807L)
      return l;
  }

  public final long rU()
  {
    AppMethodBeat.i(95493);
    long l1;
    if (this.bhc)
    {
      AppMethodBeat.o(95493);
      l1 = -9223372036854775808L;
    }
    while (true)
    {
      return l1;
      if (sd())
      {
        l1 = this.bha;
        AppMethodBeat.o(95493);
      }
      else
      {
        if (this.bgX)
        {
          l1 = 9223372036854775807L;
          int i = this.bgO.length;
          int j = 0;
          while (true)
          {
            l2 = l1;
            if (j >= i)
              break;
            l2 = l1;
            if (this.bgW[j] != 0)
              l2 = Math.min(l1, this.bgO[j].bhG.sc());
            j++;
            l1 = l2;
          }
        }
        long l2 = sc();
        if (l2 == -9223372036854775808L)
        {
          l1 = this.bgZ;
          AppMethodBeat.o(95493);
        }
        else
        {
          AppMethodBeat.o(95493);
          l1 = l2;
        }
      }
    }
  }

  public final long rV()
  {
    AppMethodBeat.i(95492);
    long l;
    if (this.bgT == 0)
    {
      l = -9223372036854775808L;
      AppMethodBeat.o(95492);
    }
    while (true)
    {
      return l;
      l = rU();
      AppMethodBeat.o(95492);
    }
  }

  public final void rZ()
  {
    AppMethodBeat.i(95487);
    Object localObject = this.bgJ;
    if (((f.b)localObject).bhj != null)
      ((f.b)localObject).bhj = null;
    localObject = this.bgO;
    int i = localObject.length;
    for (int j = 0; j < i; j++)
      localObject[j].reset(false);
    AppMethodBeat.o(95487);
  }

  public final void rb()
  {
    AppMethodBeat.i(95496);
    this.bgQ = true;
    this.handler.post(this.bgL);
    AppMethodBeat.o(95496);
  }

  public final void sa()
  {
    AppMethodBeat.i(95498);
    this.handler.post(this.bgL);
    AppMethodBeat.o(95498);
  }

  final boolean sd()
  {
    if (this.bha != -9223372036854775807L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.f
 * JD-Core Version:    0.6.2
 */