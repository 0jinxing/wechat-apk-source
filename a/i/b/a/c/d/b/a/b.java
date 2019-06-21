package a.i.b.a.c.d.b.a;

import a.i.b.a.c.b.am;
import a.i.b.a.c.d.a.p;
import a.i.b.a.c.d.b.n.a;
import a.i.b.a.c.d.b.n.c;
import a.i.b.a.c.e.b.a.d;
import a.i.b.a.c.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class b
  implements n.c
{
  private static final boolean Bss;
  private static final Map<a, a.a> Bst;
  public d Bse = null;
  public String[] Bsf = null;
  public String[] Bsg = null;
  public String Bsh = null;
  public int Bsi = 0;
  public int[] Bsu = null;
  public a.a Bsv = null;
  public String packageName = null;
  public String[] strings = null;

  static
  {
    AppMethodBeat.i(120352);
    Bss = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
    HashMap localHashMap = new HashMap();
    Bst = localHashMap;
    localHashMap.put(a.n(new a.i.b.a.c.f.b("kotlin.jvm.internal.KotlinClass")), a.a.Bsk);
    Bst.put(a.n(new a.i.b.a.c.f.b("kotlin.jvm.internal.KotlinFileFacade")), a.a.Bsl);
    Bst.put(a.n(new a.i.b.a.c.f.b("kotlin.jvm.internal.KotlinMultifileClass")), a.a.Bsn);
    Bst.put(a.n(new a.i.b.a.c.f.b("kotlin.jvm.internal.KotlinMultifileClassPart")), a.a.Bso);
    Bst.put(a.n(new a.i.b.a.c.f.b("kotlin.jvm.internal.KotlinSyntheticClass")), a.a.Bsm);
    AppMethodBeat.o(120352);
  }

  public final n.a a(a parama, am paramam)
  {
    AppMethodBeat.i(120351);
    if (parama.ehE().equals(p.Bll))
    {
      parama = new b.b(this, (byte)0);
      AppMethodBeat.o(120351);
    }
    while (true)
    {
      return parama;
      if (Bss)
      {
        AppMethodBeat.o(120351);
        parama = null;
      }
      else if (this.Bsv != null)
      {
        AppMethodBeat.o(120351);
        parama = null;
      }
      else
      {
        parama = (a.a)Bst.get(parama);
        if (parama != null)
        {
          this.Bsv = parama;
          parama = new b.c(this, (byte)0);
          AppMethodBeat.o(120351);
        }
        else
        {
          AppMethodBeat.o(120351);
          parama = null;
        }
      }
    }
  }

  public final void zn()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.a.b
 * JD-Core Version:    0.6.2
 */