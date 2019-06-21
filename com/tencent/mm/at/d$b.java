package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

final class d$b
{
  private int aBR = 0;
  public long eln;
  public long fDs;
  public int fDt;
  public int fDu;
  public List<d.c> fDv;

  public d$b(long paramLong1, long paramLong2, int paramInt)
  {
    this.fDs = paramLong1;
    this.eln = paramLong2;
    this.fDt = paramInt;
    this.fDu = 0;
  }

  public final boolean a(d.a parama, Object paramObject)
  {
    AppMethodBeat.i(78173);
    if (this.fDv == null)
      this.fDv = Collections.synchronizedList(new LinkedList());
    parama = new d.c(parama, paramObject);
    boolean bool;
    if (this.fDv.contains(parama))
    {
      ab.d("ModelImage.DownloadImgService.Task", "task item already exists");
      bool = false;
      AppMethodBeat.o(78173);
    }
    while (true)
    {
      return bool;
      this.fDv.add(parama);
      bool = true;
      AppMethodBeat.o(78173);
    }
  }

  public final int agO()
  {
    AppMethodBeat.i(78175);
    int i = this.fDv.size();
    AppMethodBeat.o(78175);
    return i;
  }

  public final boolean b(d.a parama)
  {
    AppMethodBeat.i(78174);
    parama = new d.c(parama, null);
    boolean bool;
    if (this.fDv.contains(parama))
    {
      this.fDv.remove(parama);
      bool = true;
      AppMethodBeat.o(78174);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(78174);
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramObject != null)
    {
      if ((paramObject instanceof b))
        break label19;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label19: paramObject = (b)paramObject;
      bool2 = bool1;
      if (paramObject.fDs == this.fDs)
      {
        bool2 = bool1;
        if (paramObject.eln == this.eln)
        {
          bool2 = bool1;
          if (paramObject.fDt == this.fDt)
            bool2 = true;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(78176);
    if (this.aBR == 0)
      this.aBR = (this.fDs + "_" + this.eln + "_" + this.fDt).hashCode();
    int i = this.aBR;
    AppMethodBeat.o(78176);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.d.b
 * JD-Core Version:    0.6.2
 */