package a.i.b.a.c.m;

import a.i.b.a.c.b.t;
import a.i.b.a.c.f.f;
import a.k.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Collection;

public final class d
{
  public final k BLv;
  public final Collection<f> BLw;
  public final a.f.a.b<t, String> BLx;
  public final b[] BLy;
  public final f BgZ;

  private d(f paramf, k paramk, Collection<f> paramCollection, a.f.a.b<? super t, String> paramb, b[] paramArrayOfb)
  {
    this.BgZ = paramf;
    this.BLv = paramk;
    this.BLw = paramCollection;
    this.BLx = paramb;
    this.BLy = paramArrayOfb;
  }

  public d(f paramf, b[] paramArrayOfb, a.f.a.b<? super t, String> paramb)
  {
    this(paramf, null, null, paramb, (b[])Arrays.copyOf(paramArrayOfb, paramArrayOfb.length));
    AppMethodBeat.i(122858);
    AppMethodBeat.o(122858);
  }

  private d(k paramk, b[] paramArrayOfb, a.f.a.b<? super t, String> paramb)
  {
    this(null, paramk, null, paramb, (b[])Arrays.copyOf(paramArrayOfb, paramArrayOfb.length));
    AppMethodBeat.i(122860);
    AppMethodBeat.o(122860);
  }

  public d(Collection<f> paramCollection, b[] paramArrayOfb, a.f.a.b<? super t, String> paramb)
  {
    this(null, null, paramCollection, paramb, (b[])Arrays.copyOf(paramArrayOfb, paramArrayOfb.length));
    AppMethodBeat.i(122862);
    AppMethodBeat.o(122862);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.m.d
 * JD-Core Version:    0.6.2
 */