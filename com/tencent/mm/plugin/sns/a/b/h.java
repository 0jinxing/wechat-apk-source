package com.tencent.mm.plugin.sns.a.b;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.a.b.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class h
{
  public String TAG;
  public long fQd;
  public long fQe;
  public int qEk;
  public int qEl;
  public long qEm;
  public int qEn;
  public int qEo;
  public int qEp;
  public int qEq;
  public boolean qEr;
  public a qEs;
  public LinkedList<a> qEt;
  public long qEu;

  public h()
  {
    AppMethodBeat.i(35744);
    this.TAG = "MicroMsg.SnsAdVideoStatistic";
    this.qEk = 0;
    this.qEl = 0;
    this.qEm = 0L;
    this.qEn = 0;
    this.fQe = 0L;
    this.qEo = 0;
    this.qEp = 0;
    this.qEq = 0;
    this.qEr = false;
    this.qEs = new a();
    this.qEt = new LinkedList();
    this.qEu = 0L;
    this.fQd = 0L;
    AppMethodBeat.o(35744);
  }

  public h(String paramString)
  {
    AppMethodBeat.i(35745);
    this.TAG = "MicroMsg.SnsAdVideoStatistic";
    this.qEk = 0;
    this.qEl = 0;
    this.qEm = 0L;
    this.qEn = 0;
    this.fQe = 0L;
    this.qEo = 0;
    this.qEp = 0;
    this.qEq = 0;
    this.qEr = false;
    this.qEs = new a();
    this.qEt = new LinkedList();
    this.qEu = 0L;
    this.fQd = 0L;
    this.TAG = "MicroMsg.SnsAdVideoStatistic:".concat(String.valueOf(paramString));
    AppMethodBeat.o(35745);
  }

  public final void CI(int paramInt)
  {
    AppMethodBeat.i(35746);
    a locala;
    if (this.qEs.qFq <= 0)
    {
      locala = this.qEs;
      if (this.qEs.qFu != 0L)
        break label130;
    }
    label130: for (int i = 0; ; i = (int)bo.az(this.qEs.qFu))
    {
      locala.qFq = i;
      if (paramInt != 0)
      {
        this.qEs.qFr = paramInt;
        this.qEu = paramInt;
      }
      ab.i(this.TAG, "pushplayitem duration " + this.qEs.qFq + " " + this.qEs.qFt);
      this.qEt.add(this.qEs);
      this.qEs = new a();
      AppMethodBeat.o(35746);
      return;
    }
  }

  public final String cmf()
  {
    AppMethodBeat.i(35747);
    if (this.qEm == 0L);
    StringBuffer localStringBuffer;
    a locala;
    for (int i = 0; ; i = (int)bo.az(this.qEm))
    {
      this.qEl = i;
      ab.d(this.TAG, "__staytotaltime " + this.qEm + " " + this.qEl + " clock: " + SystemClock.elapsedRealtime());
      localStringBuffer = new StringBuffer();
      localStringBuffer.append("<viewinfo>");
      localStringBuffer.append("<downloadstatus>");
      localStringBuffer.append(this.qEk);
      localStringBuffer.append("</downloadstatus>");
      localStringBuffer.append("<staytotaltime>");
      localStringBuffer.append(this.qEl);
      localStringBuffer.append("</staytotaltime>");
      if (this.qEn > 0)
      {
        localStringBuffer.append("<masktotaltime>");
        localStringBuffer.append(this.qEn);
        localStringBuffer.append("</masktotaltime>");
      }
      localObject = this.qEt;
      if ((!this.qEr) || (this.qEt.size() <= 1))
        break label551;
      locala = new a();
      for (i = 0; i < this.qEt.size(); i++)
      {
        localObject = (a)this.qEt.get(i);
        if (i == 0)
        {
          locala.qFr = ((a)localObject).qFr;
          locala.qFs = ((a)localObject).qFs;
          locala.qFt = ((a)localObject).qFt;
        }
        locala.qFp += ((a)localObject).qFp;
        int j = locala.qFq;
        locala.qFq = (((a)localObject).qFq + j);
      }
    }
    Object localObject = new LinkedList();
    ((LinkedList)localObject).add(locala);
    label551: 
    while (true)
    {
      localStringBuffer.append(String.format("<playitemlist count=\"%d\">", new Object[] { Integer.valueOf(((LinkedList)localObject).size()) }));
      for (i = 0; i < ((LinkedList)localObject).size(); i++)
      {
        locala = (a)((LinkedList)localObject).get(i);
        localStringBuffer.append("<playitem>");
        localStringBuffer.append(String.format("<playcount>%d</playcount>", new Object[] { Integer.valueOf(locala.qFp) }));
        localStringBuffer.append(String.format("<playtotaltime>%d</playtotaltime>", new Object[] { Integer.valueOf(locala.qFq) }));
        localStringBuffer.append(String.format("<videototaltime>%d</videototaltime>", new Object[] { Integer.valueOf(locala.qFr * 1000) }));
        localStringBuffer.append(String.format("<playmode>%d</playmode>", new Object[] { Integer.valueOf(locala.qFs) }));
        localStringBuffer.append(String.format("<playorientation>%d</playorientation>", new Object[] { Integer.valueOf(locala.qFt) }));
        localStringBuffer.append("</playitem>");
      }
      localStringBuffer.append("</playitemlist>");
      localStringBuffer.append("</viewinfo>");
      localObject = localStringBuffer.toString();
      ab.i(this.TAG, "xml ".concat(String.valueOf(localObject)));
      AppMethodBeat.o(35747);
      return localObject;
    }
  }

  public final void cmg()
  {
    AppMethodBeat.i(35748);
    this.qEo = 0;
    this.qEp = 0;
    this.qEq = 0;
    Iterator localIterator = this.qEt.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      this.qEo += locala.qFo;
      this.qEp += locala.qFp;
      int i = this.qEq;
      this.qEq = (locala.qFq + i);
    }
    if ((this.qEs != null) && (!this.qEt.contains(this.qEs)))
    {
      this.qEo += this.qEs.qFo;
      this.qEp += this.qEs.qFp;
      this.qEq += this.qEs.qFq;
    }
    AppMethodBeat.o(35748);
  }

  public final void onResume()
  {
    AppMethodBeat.i(35749);
    if (this.fQd == 0L)
      AppMethodBeat.o(35749);
    while (true)
    {
      return;
      long l = bo.az(this.fQd);
      this.fQe += l;
      this.fQd = 0L;
      if (this.qEs != null)
      {
        a locala = this.qEs;
        locala.qFv = (l + locala.qFv);
      }
      AppMethodBeat.o(35749);
    }
  }

  public final void setDuration(int paramInt)
  {
    this.qEu = paramInt;
    this.qEs.qFr = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.h
 * JD-Core Version:    0.6.2
 */