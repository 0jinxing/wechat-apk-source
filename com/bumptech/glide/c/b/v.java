package com.bumptech.glide.c.b;

import com.bumptech.glide.c.a.d;
import com.bumptech.glide.c.a.d.a;
import com.bumptech.glide.c.c.n;
import com.bumptech.glide.c.c.n.a;
import com.bumptech.glide.c.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.List;

final class v
  implements d.a<Object>, e
{
  private File aAa;
  private int aCg = -1;
  private w aCh;
  private final f<?> azT;
  private final e.a azU;
  private int azV;
  private com.bumptech.glide.c.h azW;
  private List<n<File, ?>> azX;
  private int azY;
  private volatile n.a<?> azZ;

  v(f<?> paramf, e.a parama)
  {
    this.azT = paramf;
    this.azU = parama;
  }

  private boolean ml()
  {
    AppMethodBeat.i(91878);
    boolean bool;
    if (this.azY < this.azX.size())
    {
      bool = true;
      AppMethodBeat.o(91878);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(91878);
    }
  }

  public final void S(Object paramObject)
  {
    AppMethodBeat.i(91880);
    this.azU.a(this.azW, paramObject, this.azZ.aEq, com.bumptech.glide.c.a.ayG, this.aCh);
    AppMethodBeat.o(91880);
  }

  public final void b(Exception paramException)
  {
    AppMethodBeat.i(91881);
    this.azU.a(this.aCh, paramException, this.azZ.aEq, com.bumptech.glide.c.a.ayG);
    AppMethodBeat.o(91881);
  }

  public final void cancel()
  {
    AppMethodBeat.i(91879);
    n.a locala = this.azZ;
    if (locala != null)
      locala.aEq.cancel();
    AppMethodBeat.o(91879);
  }

  public final boolean mk()
  {
    AppMethodBeat.i(91877);
    List localList1 = this.azT.mp();
    if (localList1.isEmpty())
    {
      AppMethodBeat.o(91877);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject = this.azT;
      List localList2 = ((f)localObject).awi.awj.b(((f)localObject).axb.getClass(), ((f)localObject).aAf, ((f)localObject).awY);
      if ((localList2.isEmpty()) && (File.class.equals(this.azT.awY)))
      {
        AppMethodBeat.o(91877);
        bool = false;
      }
      else
      {
        do
        {
          this.aCg = 0;
          do
          {
            com.bumptech.glide.c.h localh = (com.bumptech.glide.c.h)localList1.get(this.azV);
            Class localClass = (Class)localList2.get(this.aCg);
            localObject = this.azT.n(localClass);
            this.aCh = new w(this.azT.awi.awk, localh, this.azT.aAb, this.azT.width, this.azT.height, (m)localObject, localClass, this.azT.aAd);
            this.aAa = this.azT.mn().a(this.aCh);
            if (this.aAa != null)
            {
              this.azW = localh;
              this.azX = this.azT.n(this.aAa);
              this.azY = 0;
            }
            if ((this.azX != null) && (ml()))
              break;
            this.aCg += 1;
          }
          while (this.aCg < localList2.size());
          this.azV += 1;
        }
        while (this.azV < localList1.size());
        AppMethodBeat.o(91877);
        bool = false;
      }
    }
    this.azZ = null;
    boolean bool = false;
    label329: if ((!bool) && (ml()))
    {
      localList1 = this.azX;
      int i = this.azY;
      this.azY = (i + 1);
      this.azZ = ((n)localList1.get(i)).b(this.aAa, this.azT.width, this.azT.height, this.azT.aAd);
      if ((this.azZ == null) || (!this.azT.l(this.azZ.aEq.mg())))
        break label466;
      bool = true;
      this.azZ.aEq.a(this.azT.aAk, this);
    }
    label466: 
    while (true)
    {
      break label329;
      AppMethodBeat.o(91877);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.v
 * JD-Core Version:    0.6.2
 */