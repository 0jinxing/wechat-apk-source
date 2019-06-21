package a.i.b.a.c.b;

import a.f.b.j;
import a.i.b.a.c.f.a;
import a.i.b.a.c.k.c;
import a.i.b.a.c.k.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class aa
{
  final i Baf;
  final y BcH;
  final c<a.i.b.a.c.f.b, ab> BeH;
  private final c<aa.a, e> BeI;

  public aa(i parami, y paramy)
  {
    AppMethodBeat.i(119291);
    this.Baf = parami;
    this.BcH = paramy;
    this.BeH = this.Baf.f((a.f.a.b)new aa.d(this));
    this.BeI = this.Baf.f((a.f.a.b)new aa.c(this));
    AppMethodBeat.o(119291);
  }

  public final e a(a parama, List<Integer> paramList)
  {
    AppMethodBeat.i(119290);
    j.p(parama, "classId");
    j.p(paramList, "typeParametersCount");
    parama = (e)this.BeI.am(new aa.a(parama, paramList));
    AppMethodBeat.o(119290);
    return parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.aa
 * JD-Core Version:    0.6.2
 */