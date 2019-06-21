package a.i.b.a.c.d.b;

import a.f.b.j;
import a.i.b.a.c.b.am;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a$d$a extends a.d.b
  implements n.f
{
  public a$d$a(q paramq)
  {
    super(paramq, localObject);
    AppMethodBeat.i(120217);
    AppMethodBeat.o(120217);
  }

  public final n.a a(int paramInt, a.i.b.a.c.f.a parama, am paramam)
  {
    AppMethodBeat.i(120216);
    j.p(parama, "classId");
    j.p(paramam, "source");
    Object localObject = q.BrI;
    q localq = q.a.a(this.Brb, paramInt);
    List localList = (List)this.BqZ.BqX.get(localq);
    localObject = localList;
    if (localList == null)
    {
      localObject = (List)new ArrayList();
      ((Map)this.BqZ.BqX).put(localq, localObject);
    }
    parama = a.a(this.BqZ.BqW, parama, paramam, (List)localObject);
    AppMethodBeat.o(120216);
    return parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.a.d.a
 * JD-Core Version:    0.6.2
 */