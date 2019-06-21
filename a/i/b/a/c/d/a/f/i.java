package a.i.b.a.c.d.a.f;

import a.f.a.b;
import a.f.b.k;
import a.i.b.a.c.d.b.t;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class i
{
  private static final d BpR;
  private static final d BpS;
  private static final d BpT;
  private static final Map<String, j> BpU;

  static
  {
    AppMethodBeat.i(120143);
    BpR = new d(g.BpL, null, false);
    BpS = new d(g.BpM, null, false);
    BpT = new d(g.BpM, null, true);
    t localt = t.BrJ;
    final String str1 = t.avQ("Object");
    final String str2 = t.avS("Predicate");
    final String str3 = t.avS("Function");
    final String str4 = t.avS("Consumer");
    final String str5 = t.avS("BiFunction");
    final String str6 = t.avS("BiConsumer");
    final String str7 = t.avS("UnaryOperator");
    final String str8 = t.avR("stream/Stream");
    final String str9 = t.avR("Optional");
    m localm = new m();
    new m.a(localm, t.avR("Iterator")).c("forEachRemaining", (b)new i.a(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, t.avQ("Iterable")).c("spliterator", (b)new i.l(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    m.a locala = new m.a(localm, t.avR("Collection"));
    locala.c("removeIf", (b)new i.v(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.c("stream", (b)new i.w(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.c("parallelStream", (b)new i.x(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, t.avR("List")).c("replaceAll", (b)new i.y(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala = new m.a(localm, t.avR("Map"));
    locala.c("forEach", (b)new i.z(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.c("putIfAbsent", (b)new i.aa(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.c("replace", (b)new ab(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.c("replace", (b)new b(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.c("replaceAll", (b)new c(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.c("compute", (b)new d(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.c("computeIfAbsent", (b)new i.e(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.c("computeIfPresent", (b)new i.f(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.c("merge", (b)new i.g(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala = new m.a(localm, str9);
    locala.c("empty", (b)new i.h(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.c("of", (b)new i(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.c("ofNullable", (b)new i.j(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.c("get", (b)new i.k(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    locala.c("ifPresent", (b)new i.m(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, t.avQ("ref/Reference")).c("get", (b)new i.n(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, str2).c("test", (b)new i.o(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, t.avS("BiPredicate")).c("test", (b)new i.p(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, str4).c("accept", (b)new i.q(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, str6).c("accept", (b)new i.r(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, str3).c("apply", (b)new i.s(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, str5).c("apply", (b)new i.t(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    new m.a(localm, t.avS("Supplier")).c("get", (b)new i.u(localt, str4, str2, str8, str7, str6, str1, str5, str3, str9));
    BpU = localm.BqB;
    AppMethodBeat.o(120143);
  }

  public static final Map<String, j> ecj()
  {
    return BpU;
  }

  static final class ab extends k
    implements b<m.a.a, y>
  {
    ab(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }

  static final class b extends k
    implements b<m.a.a, y>
  {
    b(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }

  static final class c extends k
    implements b<m.a.a, y>
  {
    c(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }

  static final class d extends k
    implements b<m.a.a, y>
  {
    d(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }

  static final class i extends k
    implements b<m.a.a, y>
  {
    i(t paramt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.f.i
 * JD-Core Version:    0.6.2
 */