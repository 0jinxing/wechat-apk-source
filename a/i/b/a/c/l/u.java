package a.i.b.a.c.l;

import a.aa;
import a.f.b.j;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class u extends as
{
  public final ar[] BJE;
  public final ap[] BJF;
  private final boolean BJG;

  public u(List<? extends ar> paramList, List<? extends ap> paramList1)
  {
    this(paramList, (ap[])paramList1);
    AppMethodBeat.o(122597);
  }

  public u(ar[] paramArrayOfar, ap[] paramArrayOfap, boolean paramBoolean)
  {
    AppMethodBeat.i(122596);
    this.BJE = paramArrayOfar;
    this.BJF = paramArrayOfap;
    this.BJG = paramBoolean;
    if (this.BJE.length <= this.BJF.length);
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramArrayOfar = (Throwable)new AssertionError("Number of arguments should not be less then number of parameters, but: parameters=" + this.BJE.length + ", args=" + this.BJF.length);
      AppMethodBeat.o(122596);
      throw paramArrayOfar;
    }
    AppMethodBeat.o(122596);
  }

  public final ap O(w paramw)
  {
    Object localObject = null;
    AppMethodBeat.i(122595);
    j.p(paramw, "key");
    h localh = paramw.ejw().dYs();
    paramw = localh;
    if (!(localh instanceof ar))
      paramw = null;
    paramw = (ar)paramw;
    if (paramw == null)
    {
      AppMethodBeat.o(122595);
      paramw = localObject;
    }
    while (true)
    {
      return paramw;
      int i = paramw.getIndex();
      if ((i < this.BJE.length) && (j.j(this.BJE[i].dXY(), paramw.dXY())))
      {
        paramw = this.BJF[i];
        AppMethodBeat.o(122595);
      }
      else
      {
        AppMethodBeat.o(122595);
        paramw = localObject;
      }
    }
  }

  public final boolean ejx()
  {
    return this.BJG;
  }

  public final boolean isEmpty()
  {
    if (this.BJF.length == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.u
 * JD-Core Version:    0.6.2
 */