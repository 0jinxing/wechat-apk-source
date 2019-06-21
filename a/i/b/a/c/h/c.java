package a.i.b.a.c.h;

import a.aa;
import a.f.b.t;
import a.i.b.a.c.a.g;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.l;
import a.i.b.a.c.f.f;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.w;
import a.i.d;
import a.k.m;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

public abstract class c
{
  public static final c BBG = c.a.e((a.f.a.b)c.d.BBS);
  public static final c BBH = c.a.e((a.f.a.b)c.b.BBQ);
  public static final c BBI = c.a.e((a.f.a.b)c.c.BBR);
  public static final c BBJ = c.a.e((a.f.a.b)c.e.BBT);
  public static final c BBK = c.a.e((a.f.a.b)c.i.BBX);
  public static final c BBL = c.a.e((a.f.a.b)c.g.BBV);
  public static final c BBM = c.a.e((a.f.a.b)j.BBY);
  public static final c BBN = c.a.e((a.f.a.b)c.f.BBU);
  public static final c BBO = c.a.e((a.f.a.b)c.h.BBW);
  public static final c.a BBP = new c.a((byte)0);

  public abstract String a(a.i.b.a.c.b.a.c paramc, a.i.b.a.c.b.a.e parame);

  public abstract String a(ap paramap);

  public abstract String a(String paramString1, String paramString2, g paramg);

  public abstract String b(f paramf, boolean paramBoolean);

  public abstract String b(w paramw);

  public final c e(a.f.a.b<? super i, y> paramb)
  {
    a.f.b.j.p(paramb, "changeOptions");
    if (this == null)
      throw new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
    j localj1 = ((e)this).BCc;
    j localj2 = new j();
    Field[] arrayOfField = localj1.getClass().getDeclaredFields();
    int i = arrayOfField.length;
    int j = 0;
    if (j < i)
    {
      Field localField = arrayOfField[j];
      a.f.b.j.o(localField, "field");
      Object localObject1;
      Object localObject2;
      if ((localField.getModifiers() & 0x8) == 0)
      {
        localField.setAccessible(true);
        localObject1 = localField.get(localj1);
        localObject2 = localObject1;
        if (!(localObject1 instanceof a.g.b))
          localObject2 = null;
        localObject2 = (a.g.b)localObject2;
        if (localObject2 != null)
          break label132;
      }
      while (true)
      {
        j++;
        break;
        label132: localObject1 = localField.getName();
        a.f.b.j.o(localObject1, "field.name");
        if (!m.jb((String)localObject1, "is"));
        for (int k = 1; (aa.AUz) && (k == 0); k = 0)
          throw ((Throwable)new AssertionError("Fields named is* are not supported here yet"));
        d locald = (d)a.f.b.v.aN(j.class);
        String str1 = localField.getName();
        localObject1 = new StringBuilder("get");
        String str2 = localField.getName();
        a.f.b.j.o(str2, "field.name");
        localField.set(localj2, localj2.dP(((a.g.b)localObject2).b((a.i.k)new t(locald, str1, m.capitalize(str2)))));
      }
    }
    paramb.am(localj2);
    localj2.lock();
    return (c)new e(localj2);
  }

  public abstract String f(a.i.b.a.c.f.c paramc);

  public abstract String k(l paraml);

  static final class j extends a.f.b.k
    implements a.f.a.b<i, y>
  {
    public static final j BBY;

    static
    {
      AppMethodBeat.i(121724);
      BBY = new j();
      AppMethodBeat.o(121724);
    }

    j()
    {
      super();
    }
  }

  public static abstract interface k
  {
    public abstract void a(au paramau, int paramInt1, int paramInt2, StringBuilder paramStringBuilder);

    public abstract void a(au paramau, StringBuilder paramStringBuilder);

    public abstract void e(StringBuilder paramStringBuilder);

    public abstract void f(StringBuilder paramStringBuilder);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.h.c
 * JD-Core Version:    0.6.2
 */