package com.google.android.exoplayer2.source.b;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.l;
import com.google.android.exoplayer2.h.b;
import com.google.android.exoplayer2.h.s;
import com.google.android.exoplayer2.h.s.a;
import com.google.android.exoplayer2.h.s.c;
import com.google.android.exoplayer2.h.s.d;
import com.google.android.exoplayer2.i.i;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.k.b;
import com.google.android.exoplayer2.source.m;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.p;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.LinkedList;

final class j
  implements g, s.a<com.google.android.exoplayer2.source.a.a>, s.d, k.b, m
{
  final int aMr;
  p aNe;
  private final int bgC;
  private final b bgF;
  final s bgI;
  private final Runnable bgL;
  k[] bgO;
  private int[] bgP;
  boolean bgQ;
  boolean bgR;
  int bgT;
  long bgZ;
  private long bha;
  boolean bhc;
  final com.google.android.exoplayer2.source.a.a bjc;
  private final j.a bjn;
  final c bjo;
  private final Format bjp;
  private final c.b bjq;
  final LinkedList<f> bjr;
  Format bjs;
  int bjt;
  int bju;
  private boolean bjv;
  boolean[] bjw;
  private boolean[] bjx;
  boolean bjy;
  final Handler handler;
  boolean prepared;
  boolean released;

  public j(int paramInt1, j.a parama, c paramc, b paramb, long paramLong, Format paramFormat, int paramInt2, com.google.android.exoplayer2.source.a.a parama1)
  {
    AppMethodBeat.i(125942);
    this.aMr = paramInt1;
    this.bjn = parama;
    this.bjo = paramc;
    this.bgF = paramb;
    this.bjp = paramFormat;
    this.bgC = paramInt2;
    this.bjc = parama1;
    this.bgI = new s("Loader:HlsSampleStreamWrapper");
    this.bjq = new c.b();
    this.bgP = new int[0];
    this.bgO = new k[0];
    this.bjr = new LinkedList();
    this.bgL = new j.1(this);
    this.handler = new Handler();
    this.bgZ = paramLong;
    this.bha = paramLong;
    AppMethodBeat.o(125942);
  }

  private static Format a(Format paramFormat1, Format paramFormat2)
  {
    AppMethodBeat.i(125955);
    if (paramFormat1 == null)
    {
      AppMethodBeat.o(125955);
      return paramFormat2;
    }
    String str = null;
    int i = i.aL(paramFormat2.aOd);
    if (i == 1)
      str = j(paramFormat1.aOa, 1);
    while (true)
    {
      paramFormat2 = paramFormat2.a(paramFormat1.id, str, paramFormat1.bitrate, paramFormat1.width, paramFormat1.height, paramFormat1.aOs, paramFormat1.aOt);
      AppMethodBeat.o(125955);
      break;
      if (i == 2)
        str = j(paramFormat1.aOa, 2);
    }
  }

  private boolean aa(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(125956);
    int i = this.bgO.length;
    int j = 0;
    k localk;
    if (j < i)
    {
      localk = this.bgO[j];
      localk.rewind();
      if ((!localk.g(paramLong, false)) && ((this.bjx[j] != 0) || (!this.bjv)))
        AppMethodBeat.o(125956);
    }
    while (true)
    {
      return bool;
      localk.sp();
      j++;
      break;
      bool = true;
      AppMethodBeat.o(125956);
    }
  }

  private static String j(String paramString, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(125957);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(125957);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      String[] arrayOfString = paramString.split("(\\s*,\\s*)|(\\s*$)");
      paramString = new StringBuilder();
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        String str = arrayOfString[j];
        if (paramInt == i.aL(i.aK(str)))
        {
          if (paramString.length() > 0)
            paramString.append(",");
          paramString.append(str);
        }
      }
      if (paramString.length() > 0)
      {
        paramString = paramString.toString();
        AppMethodBeat.o(125957);
      }
      else
      {
        AppMethodBeat.o(125957);
        paramString = localObject;
      }
    }
  }

  public final boolean Y(long paramLong)
  {
    AppMethodBeat.i(125948);
    boolean bool;
    if ((this.bhc) || (this.bgI.isLoading()))
    {
      bool = false;
      AppMethodBeat.o(125948);
    }
    while (true)
    {
      return bool;
      Object localObject1 = this.bjo;
      if (this.bjr.isEmpty());
      for (Object localObject2 = null; ; localObject2 = (f)this.bjr.getLast())
      {
        if (this.bha != -9223372036854775807L)
          paramLong = this.bha;
        ((c)localObject1).a((f)localObject2, paramLong, this.bjq);
        bool = this.bjq.biE;
        localObject2 = this.bjq.biD;
        localObject1 = this.bjq.biF;
        this.bjq.clear();
        if (!bool)
          break label152;
        this.bha = -9223372036854775807L;
        this.bhc = true;
        bool = true;
        AppMethodBeat.o(125948);
        break;
      }
      label152: if (localObject2 == null)
      {
        if (localObject1 != null)
          this.bjn.a((com.google.android.exoplayer2.source.b.a.a.a)localObject1);
        bool = false;
        AppMethodBeat.o(125948);
      }
      else
      {
        if ((localObject2 instanceof f))
        {
          this.bha = -9223372036854775807L;
          localObject1 = (f)localObject2;
          ((f)localObject1).a(this);
          this.bjr.add(localObject1);
        }
        paramLong = this.bgI.a((s.c)localObject2, this, this.bgC);
        this.bjc.a(((com.google.android.exoplayer2.source.a.a)localObject2).bib, ((com.google.android.exoplayer2.source.a.a)localObject2).type, this.aMr, ((com.google.android.exoplayer2.source.a.a)localObject2).bic, ((com.google.android.exoplayer2.source.a.a)localObject2).bid, ((com.google.android.exoplayer2.source.a.a)localObject2).bie, ((com.google.android.exoplayer2.source.a.a)localObject2).bif, ((com.google.android.exoplayer2.source.a.a)localObject2).big, paramLong);
        bool = true;
        AppMethodBeat.o(125948);
      }
    }
  }

  public final void a(l paraml)
  {
  }

  public final void aJ(boolean paramBoolean)
  {
    this.bjo.biu = paramBoolean;
  }

  public final k es(int paramInt)
  {
    AppMethodBeat.i(125950);
    int i = this.bgO.length;
    int j = 0;
    k localk;
    if (j < i)
      if (this.bgP[j] == paramInt)
      {
        localk = this.bgO[j];
        AppMethodBeat.o(125950);
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
      AppMethodBeat.o(125950);
    }
  }

  public final boolean j(long paramLong, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(125944);
    this.bgZ = paramLong;
    if ((!paramBoolean) && (!sd()) && (aa(paramLong)))
    {
      AppMethodBeat.o(125944);
      paramBoolean = bool;
      return paramBoolean;
    }
    this.bha = paramLong;
    this.bhc = false;
    this.bjr.clear();
    if (this.bgI.isLoading())
      this.bgI.cancelLoading();
    while (true)
    {
      paramBoolean = true;
      AppMethodBeat.o(125944);
      break;
      sA();
    }
  }

  final void r(int paramInt, boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(125954);
    boolean bool;
    int j;
    if (this.bjw[paramInt] != paramBoolean)
    {
      bool = true;
      com.google.android.exoplayer2.i.a.checkState(bool);
      this.bjw[paramInt] = paramBoolean;
      j = this.bgT;
      if (!paramBoolean)
        break label66;
    }
    label66: for (paramInt = i; ; paramInt = -1)
    {
      this.bgT = (j + paramInt);
      AppMethodBeat.o(125954);
      return;
      bool = false;
      break;
    }
  }

  public final long rU()
  {
    AppMethodBeat.i(125945);
    if (this.bhc)
    {
      l = -9223372036854775808L;
      AppMethodBeat.o(125945);
    }
    while (true)
    {
      return l;
      if (!sd())
        break;
      l = this.bha;
      AppMethodBeat.o(125945);
    }
    long l = this.bgZ;
    Object localObject = (f)this.bjr.getLast();
    if (((f)localObject).bja)
    {
      if (localObject == null)
        break label170;
      l = Math.max(l, ((f)localObject).big);
    }
    label170: 
    while (true)
    {
      localObject = this.bgO;
      int i = localObject.length;
      int j = 0;
      while (true)
        if (j < i)
        {
          l = Math.max(l, localObject[j].bhG.sc());
          j++;
          continue;
          if (this.bjr.size() > 1)
          {
            localObject = (f)this.bjr.get(this.bjr.size() - 2);
            break;
          }
          localObject = null;
          break;
        }
      AppMethodBeat.o(125945);
      break;
    }
  }

  public final long rV()
  {
    AppMethodBeat.i(125949);
    long l;
    if (sd())
    {
      l = this.bha;
      AppMethodBeat.o(125949);
    }
    while (true)
    {
      return l;
      if (this.bhc)
      {
        l = -9223372036854775808L;
        AppMethodBeat.o(125949);
      }
      else
      {
        l = ((f)this.bjr.getLast()).big;
        AppMethodBeat.o(125949);
      }
    }
  }

  public final void rZ()
  {
    AppMethodBeat.i(125946);
    sA();
    AppMethodBeat.o(125946);
  }

  public final void rb()
  {
    AppMethodBeat.i(125951);
    this.bgQ = true;
    this.handler.post(this.bgL);
    AppMethodBeat.o(125951);
  }

  final void sA()
  {
    AppMethodBeat.i(125947);
    k[] arrayOfk = this.bgO;
    int i = arrayOfk.length;
    for (int j = 0; j < i; j++)
      arrayOfk[j].reset(this.bjy);
    this.bjy = false;
    AppMethodBeat.o(125947);
  }

  final void sB()
  {
    AppMethodBeat.i(125953);
    if ((this.released) || (this.prepared) || (!this.bgQ))
    {
      AppMethodBeat.o(125953);
      return;
    }
    Object localObject = this.bgO;
    int i = localObject.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        break label76;
      if (localObject[j].bhG.sl() == null)
      {
        AppMethodBeat.o(125953);
        break;
      }
    }
    label76: int k = this.bgO.length;
    int m = 0;
    int n = -1;
    i = 0;
    label91: if (m < k)
    {
      localObject = this.bgO[m].bhG.sl().aOd;
      if (i.aI((String)localObject))
      {
        j = 3;
        label124: if (j <= i)
          break label172;
        i = m;
      }
    }
    while (true)
    {
      m++;
      n = i;
      i = j;
      break label91;
      if (i.aH((String)localObject))
      {
        j = 2;
        break label124;
      }
      if (i.aJ((String)localObject))
      {
        j = 1;
        break label124;
      }
      j = 0;
      break label124;
      label172: if ((j == i) && (n != -1))
      {
        n = -1;
        j = i;
        i = n;
        continue;
        o localo = this.bjo.bis;
        int i1 = localo.length;
        this.bju = -1;
        this.bjw = new boolean[k];
        this.bjx = new boolean[k];
        o[] arrayOfo = new o[k];
        j = 0;
        while (j < k)
        {
          Format localFormat = this.bgO[j].bhG.sl();
          localObject = localFormat.aOd;
          if ((i.aI((String)localObject)) || (i.aH((String)localObject)));
          for (int i2 = 1; ; i2 = 0)
          {
            this.bjx[j] = i2;
            this.bjv = (i2 | this.bjv);
            if (j != n)
              break label376;
            localObject = new Format[i1];
            for (m = 0; m < i1; m++)
              localObject[m] = a(localo.bhv[m], localFormat);
          }
          arrayOfo[j] = new o((Format[])localObject);
          this.bju = j;
          j++;
          continue;
          label376: if ((i == 3) && (i.aH(localFormat.aOd)));
          for (localObject = this.bjp; ; localObject = null)
          {
            arrayOfo[j] = new o(new Format[] { a((Format)localObject, localFormat) });
            break;
          }
        }
        this.aNe = new p(arrayOfo);
        this.prepared = true;
        this.bjn.pL();
        AppMethodBeat.o(125953);
        break;
      }
      j = i;
      i = n;
    }
  }

  public final void sa()
  {
    AppMethodBeat.i(125952);
    this.handler.post(this.bgL);
    AppMethodBeat.o(125952);
  }

  final boolean sd()
  {
    if (this.bha != -9223372036854775807L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void sz()
  {
    AppMethodBeat.i(125943);
    if (!this.prepared)
      Y(this.bgZ);
    AppMethodBeat.o(125943);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.j
 * JD-Core Version:    0.6.2
 */