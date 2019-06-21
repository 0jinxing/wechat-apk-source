package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class i$c$a
{
  private final Iterator<Map.Entry<i.e, Object>> BzK;
  private Map.Entry<i.e, Object> BzL;
  private final boolean BzM;

  private i$c$a(i.c paramc)
  {
    AppMethodBeat.i(121522);
    paramc = i.c.b(this.BzN);
    if (paramc.BzE);
    for (paramc = new l.b(paramc.BzC.entrySet().iterator()); ; paramc = paramc.BzC.entrySet().iterator())
    {
      this.BzK = paramc;
      if (this.BzK.hasNext())
        this.BzL = ((Map.Entry)this.BzK.next());
      this.BzM = false;
      AppMethodBeat.o(121522);
      return;
    }
  }

  public final void b(int paramInt, f paramf)
  {
    AppMethodBeat.i(121523);
    while ((this.BzL != null) && (((i.e)this.BzL.getKey()).number < paramInt))
    {
      i.e locale = (i.e)this.BzL.getKey();
      if ((this.BzM) && (locale.BzP.BBj == z.b.BBu) && (!locale.BzQ))
        paramf.b(locale.number, (q)this.BzL.getValue());
      while (true)
      {
        if (!this.BzK.hasNext())
          break label139;
        this.BzL = ((Map.Entry)this.BzK.next());
        break;
        h.a(locale, this.BzL.getValue(), paramf);
      }
      label139: this.BzL = null;
    }
    AppMethodBeat.o(121523);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.i.c.a
 * JD-Core Version:    0.6.2
 */