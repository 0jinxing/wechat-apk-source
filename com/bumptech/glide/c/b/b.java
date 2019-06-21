package com.bumptech.glide.c.b;

import com.bumptech.glide.c.a.d;
import com.bumptech.glide.c.a.d.a;
import com.bumptech.glide.c.c.n;
import com.bumptech.glide.c.c.n.a;
import com.bumptech.glide.c.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.List;

final class b
  implements d.a<Object>, e
{
  private File aAa;
  private final List<h> azS;
  private final f<?> azT;
  private final e.a azU;
  private int azV = -1;
  private h azW;
  private List<n<File, ?>> azX;
  private int azY;
  private volatile n.a<?> azZ;

  b(f<?> paramf, e.a parama)
  {
    this(paramf.mp(), paramf, parama);
    AppMethodBeat.i(91752);
    AppMethodBeat.o(91752);
  }

  b(List<h> paramList, f<?> paramf, e.a parama)
  {
    this.azS = paramList;
    this.azT = paramf;
    this.azU = parama;
  }

  private boolean ml()
  {
    AppMethodBeat.i(91754);
    boolean bool;
    if (this.azY < this.azX.size())
    {
      bool = true;
      AppMethodBeat.o(91754);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(91754);
    }
  }

  public final void S(Object paramObject)
  {
    AppMethodBeat.i(91756);
    this.azU.a(this.azW, paramObject, this.azZ.aEq, com.bumptech.glide.c.a.ayF, this.azW);
    AppMethodBeat.o(91756);
  }

  public final void b(Exception paramException)
  {
    AppMethodBeat.i(91757);
    this.azU.a(this.azW, paramException, this.azZ.aEq, com.bumptech.glide.c.a.ayF);
    AppMethodBeat.o(91757);
  }

  public final void cancel()
  {
    AppMethodBeat.i(91755);
    n.a locala = this.azZ;
    if (locala != null)
      locala.aEq.cancel();
    AppMethodBeat.o(91755);
  }

  public final boolean mk()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(91753);
    Object localObject;
    while ((this.azX == null) || (!ml()))
    {
      this.azV += 1;
      if (this.azV >= this.azS.size())
      {
        AppMethodBeat.o(91753);
        return bool2;
      }
      localObject = (h)this.azS.get(this.azV);
      c localc = new c((h)localObject, this.azT.aAb);
      this.aAa = this.azT.mn().a(localc);
      if (this.aAa != null)
      {
        this.azW = ((h)localObject);
        this.azX = this.azT.n(this.aAa);
        this.azY = 0;
      }
    }
    this.azZ = null;
    bool2 = bool1;
    label150: if ((!bool2) && (ml()))
    {
      localObject = this.azX;
      int i = this.azY;
      this.azY = (i + 1);
      this.azZ = ((n)((List)localObject).get(i)).b(this.aAa, this.azT.width, this.azT.height, this.azT.aAd);
      if ((this.azZ == null) || (!this.azT.l(this.azZ.aEq.mg())))
        break label287;
      bool2 = true;
      this.azZ.aEq.a(this.azT.aAk, this);
    }
    label287: 
    while (true)
    {
      break label150;
      AppMethodBeat.o(91753);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.b
 * JD-Core Version:    0.6.2
 */