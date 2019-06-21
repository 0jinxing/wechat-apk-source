package a.k;

import a.h.e;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "nativePattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "_options", "getOptions", "()Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "containsMatchIn", "", "input", "", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchEntire", "matches", "replace", "transform", "Lkotlin/Function1;", "replacement", "replaceFirst", "split", "", "limit", "toPattern", "toString", "writeReplace", "", "Companion", "Serialized", "kotlin-stdlib"})
public final class k
  implements Serializable
{
  public static final k.a BPg;
  public final Pattern BPf;

  static
  {
    AppMethodBeat.i(56277);
    BPg = new k.a((byte)0);
    AppMethodBeat.o(56277);
  }

  public k(String paramString)
  {
    this(paramString);
    AppMethodBeat.i(56276);
    AppMethodBeat.o(56276);
  }

  public k(Pattern paramPattern)
  {
    AppMethodBeat.i(56275);
    this.BPf = paramPattern;
    AppMethodBeat.o(56275);
  }

  private final Object writeReplace()
  {
    AppMethodBeat.i(56274);
    Object localObject = this.BPf.pattern();
    a.f.b.j.o(localObject, "nativePattern.pattern()");
    localObject = new k.b((String)localObject, this.BPf.flags());
    AppMethodBeat.o(56274);
    return localObject;
  }

  public final boolean aq(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(56269);
    a.f.b.j.p(paramCharSequence, "input");
    boolean bool = this.BPf.matcher(paramCharSequence).matches();
    AppMethodBeat.o(56269);
    return bool;
  }

  public final String c(CharSequence paramCharSequence, String paramString)
  {
    AppMethodBeat.i(56271);
    a.f.b.j.p(paramCharSequence, "input");
    a.f.b.j.p(paramString, "replacement");
    paramCharSequence = this.BPf.matcher(paramCharSequence).replaceFirst(paramString);
    a.f.b.j.o(paramCharSequence, "nativePattern.matcher(in…replaceFirst(replacement)");
    AppMethodBeat.o(56271);
    return paramCharSequence;
  }

  public final List<String> r(CharSequence paramCharSequence, int paramInt)
  {
    int i = 10;
    AppMethodBeat.i(56272);
    a.f.b.j.p(paramCharSequence, "input");
    if (paramInt >= 0);
    for (int j = 1; j == 0; j = 0)
    {
      paramCharSequence = (Throwable)new IllegalArgumentException(("Limit must be non-negative, but was " + paramInt + '.').toString());
      AppMethodBeat.o(56272);
      throw paramCharSequence;
    }
    Matcher localMatcher = this.BPf.matcher(paramCharSequence);
    if ((!localMatcher.find()) || (paramInt == 1))
    {
      paramCharSequence = a.a.j.listOf(paramCharSequence.toString());
      AppMethodBeat.o(56272);
    }
    while (true)
    {
      return paramCharSequence;
      j = i;
      if (paramInt > 0)
        j = e.in(paramInt, 10);
      ArrayList localArrayList = new ArrayList(j);
      i = paramInt - 1;
      paramInt = 0;
      do
      {
        localArrayList.add(paramCharSequence.subSequence(paramInt, localMatcher.start()).toString());
        j = localMatcher.end();
        if ((i >= 0) && (localArrayList.size() == i))
          break;
        paramInt = j;
      }
      while (localMatcher.find());
      localArrayList.add(paramCharSequence.subSequence(j, paramCharSequence.length()).toString());
      paramCharSequence = (List)localArrayList;
      AppMethodBeat.o(56272);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(56273);
    String str = this.BPf.toString();
    a.f.b.j.o(str, "nativePattern.toString()");
    AppMethodBeat.o(56273);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.k.k
 * JD-Core Version:    0.6.2
 */