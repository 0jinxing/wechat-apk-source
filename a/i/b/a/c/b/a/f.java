package a.i.b.a.c.b.a;

import a.aa;
import a.f.b.j;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.t;
import a.i.b.a.c.b.v;
import a.i.b.a.c.i.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;

public final class f
{
  private static final a.i.b.a.c.f.f BfC;
  private static final a.i.b.a.c.f.f BfD;
  private static final a.i.b.a.c.f.f BfE;
  private static final a.i.b.a.c.f.f BfF;
  private static final a.i.b.a.c.f.f BfG;
  private static final a.i.b.a.c.f.b BfH;

  static
  {
    AppMethodBeat.i(119328);
    a.i.b.a.c.f.f localf = a.i.b.a.c.f.f.avX("message");
    j.o(localf, "Name.identifier(\"message\")");
    BfC = localf;
    localf = a.i.b.a.c.f.f.avX("replaceWith");
    j.o(localf, "Name.identifier(\"replaceWith\")");
    BfD = localf;
    localf = a.i.b.a.c.f.f.avX("level");
    j.o(localf, "Name.identifier(\"level\")");
    BfE = localf;
    localf = a.i.b.a.c.f.f.avX("expression");
    j.o(localf, "Name.identifier(\"expression\")");
    BfF = localf;
    localf = a.i.b.a.c.f.f.avX("imports");
    j.o(localf, "Name.identifier(\"imports\")");
    BfG = localf;
    BfH = new a.i.b.a.c.f.b("kotlin.internal.InlineOnly");
    AppMethodBeat.o(119328);
  }

  public static final boolean a(v paramv)
  {
    AppMethodBeat.i(119325);
    j.p(paramv, "receiver$0");
    j.p(paramv, "receiver$0");
    int i;
    if ((paramv instanceof a.i.b.a.c.b.b))
    {
      Object localObject;
      if (!e((a.i.b.a.c.b.b)paramv))
      {
        localObject = d.v((a.i.b.a.c.b.b)paramv);
        j.o(localObject, "DescriptorUtils.getDirectMember(this)");
        if (!e((a.i.b.a.c.b.b)localObject))
        {
          j.p(paramv, "receiver$0");
          if ((paramv instanceof t))
          {
            if (f((a.i.b.a.c.b.b)paramv))
              break label248;
            localObject = d.v((a.i.b.a.c.b.b)paramv);
            j.o(localObject, "DescriptorUtils.getDirectMember(this)");
            if (f((a.i.b.a.c.b.b)localObject))
              break label248;
          }
          i = 0;
          if (i == 0)
            break label300;
        }
      }
      i = 1;
      label107: if (i == 0)
      {
        if ((!(paramv instanceof t)) || (!((t)paramv).dZv()) || (!((t)paramv).dYj()))
          break label310;
        localObject = ((t)paramv).dYV();
        j.o(localObject, "valueParameters");
        localObject = (Iterable)localObject;
        if (((localObject instanceof Collection)) && (((Collection)localObject).isEmpty()))
          break label305;
        localObject = ((Iterable)localObject).iterator();
        do
          if (!((Iterator)localObject).hasNext())
            break;
        while (!((au)((Iterator)localObject).next()).dZX());
        i = 1;
        if ((i == 0) && (!j.j(((t)paramv).dYf(), ay.BeW)))
          break label310;
      }
      label217: AppMethodBeat.o(119325);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      label248: bool = ((t)paramv).dYj();
      if ((aa.AUz) && (!bool))
      {
        paramv = (Throwable)new AssertionError("Function is not inline: ".concat(String.valueOf(paramv)));
        AppMethodBeat.o(119325);
        throw paramv;
      }
      i = 1;
      break;
      label300: i = 0;
      break label107;
      label305: i = 0;
      break label217;
      label310: AppMethodBeat.o(119325);
    }
  }

  private static final boolean e(a.i.b.a.c.b.b paramb)
  {
    AppMethodBeat.i(119326);
    paramb = paramb.dYS();
    j.o(paramb, "typeParameters");
    paramb = (Iterable)paramb;
    boolean bool;
    if ((!(paramb instanceof Collection)) || (!((Collection)paramb).isEmpty()))
    {
      paramb = paramb.iterator();
      while (paramb.hasNext())
      {
        ar localar = (ar)paramb.next();
        j.o(localar, "it");
        if (localar.dZi())
        {
          bool = true;
          AppMethodBeat.o(119326);
        }
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119326);
    }
  }

  private static final boolean f(a.i.b.a.c.b.b paramb)
  {
    AppMethodBeat.i(119327);
    boolean bool = paramb.dYn().j(BfH);
    AppMethodBeat.o(119327);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.a.f
 * JD-Core Version:    0.6.2
 */