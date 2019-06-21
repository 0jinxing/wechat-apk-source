package a.k;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "kotlin.jvm.PlatformType", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"})
public final class j
  implements i
{
  private final CharSequence BOQ;
  final MatchResult BOZ;
  private final g BPa;
  private List<String> BPb;
  private final Matcher BPc;

  public j(Matcher paramMatcher, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(56293);
    this.BPc = paramMatcher;
    this.BOQ = paramCharSequence;
    this.BOZ = this.BPc.toMatchResult();
    this.BPa = ((g)new j.b(this));
    AppMethodBeat.o(56293);
  }

  public final List<String> ekM()
  {
    AppMethodBeat.i(56292);
    if (this.BPb == null)
      this.BPb = ((List)new j.a(this));
    List localList = this.BPb;
    if (localList == null)
      a.f.b.j.dWJ();
    AppMethodBeat.o(56292);
    return localList;
  }

  public final i.a ekN()
  {
    AppMethodBeat.i(56294);
    i.a locala = new i.a(this);
    AppMethodBeat.o(56294);
    return locala;
  }

  public final String getValue()
  {
    AppMethodBeat.i(56291);
    String str = this.BOZ.group();
    a.f.b.j.o(str, "matchResult.group()");
    AppMethodBeat.o(56291);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.k.j
 * JD-Core Version:    0.6.2
 */