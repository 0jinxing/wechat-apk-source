package a.i.b.a.c.n;

import a.a.ad;
import a.f;
import a.f.a.a;
import a.f.b.j;
import a.f.b.t;
import a.f.b.v;
import a.i.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class e
{
  public static final e BNd;
  public static final e BNe;
  public static final e BNf;
  public static final e.a BNg;
  private final f BMY;
  public final g BMZ;
  public final g BNa;
  public final Map<String, g> BNb;
  public final boolean BNc;

  static
  {
    AppMethodBeat.i(122935);
    eQB = new k[] { (k)v.a(new t(v.aN(e.class), "description", "getDescription()[Ljava/lang/String;")) };
    BNg = new e.a((byte)0);
    BNd = new e(g.BNk, null, ad.emptyMap(), (byte)0);
    g localg = g.BNj;
    BNe = new e(localg, localg, ad.emptyMap(), (byte)0);
    localg = g.BNl;
    BNf = new e(localg, localg, ad.emptyMap(), (byte)0);
    AppMethodBeat.o(122935);
  }

  private e(g paramg1, g paramg2, Map<String, ? extends g> paramMap)
  {
    AppMethodBeat.i(122936);
    this.BMZ = paramg1;
    this.BNa = paramg2;
    this.BNb = paramMap;
    this.BNc = true;
    this.BMY = a.g.g((a)new e.b(this));
    AppMethodBeat.o(122936);
  }

  public final boolean ekx()
  {
    if ((e)this == BNe);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(122939);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof e))
        break label97;
      paramObject = (e)paramObject;
      if ((!j.j(this.BMZ, paramObject.BMZ)) || (!j.j(this.BNa, paramObject.BNa)) || (!j.j(this.BNb, paramObject.BNb)))
        break label97;
      if (this.BNc == paramObject.BNc)
      {
        i = 1;
        if (i == 0)
          break label97;
      }
    }
    else
    {
      AppMethodBeat.o(122939);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label97: AppMethodBeat.o(122939);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(122938);
    Object localObject = this.BMZ;
    int j;
    if (localObject != null)
    {
      j = localObject.hashCode();
      localObject = this.BNa;
      if (localObject == null)
        break label97;
    }
    label97: for (int k = localObject.hashCode(); ; k = 0)
    {
      localObject = this.BNb;
      if (localObject != null)
        i = localObject.hashCode();
      int m = this.BNc;
      int n = m;
      if (m != 0)
        n = 1;
      AppMethodBeat.o(122938);
      return n + ((k + j * 31) * 31 + i) * 31;
      j = 0;
      break;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(122937);
    String str = "Jsr305State(global=" + this.BMZ + ", migration=" + this.BNa + ", user=" + this.BNb + ", enableCompatqualCheckerFrameworkAnnotations=" + this.BNc + ")";
    AppMethodBeat.o(122937);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.n.e
 * JD-Core Version:    0.6.2
 */