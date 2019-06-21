package a.i.b.a.b;

import a.f.b.j;
import a.i.b.a.c.b.b;
import a.i.b.a.c.b.e;
import a.i.b.a.c.j.a.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/components/RuntimeErrorReporter;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter;", "()V", "reportCannotInferVisibility", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "reportIncompleteHierarchy", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "unresolvedSuperClasses", "", "", "descriptors.runtime"})
public final class h
  implements m
{
  public static final h AZw;

  static
  {
    AppMethodBeat.i(119048);
    AZw = new h();
    AppMethodBeat.o(119048);
  }

  public final void a(e parame, List<String> paramList)
  {
    AppMethodBeat.i(119046);
    j.p(parame, "descriptor");
    j.p(paramList, "unresolvedSuperClasses");
    parame = (Throwable)new IllegalStateException("Incomplete hierarchy for class " + parame.dZg() + ", unresolved classes " + paramList);
    AppMethodBeat.o(119046);
    throw parame;
  }

  public final void d(b paramb)
  {
    AppMethodBeat.i(119047);
    j.p(paramb, "descriptor");
    paramb = (Throwable)new IllegalStateException("Cannot infer visibility for ".concat(String.valueOf(paramb)));
    AppMethodBeat.o(119047);
    throw paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.b.h
 * JD-Core Version:    0.6.2
 */