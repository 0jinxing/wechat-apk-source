package a.k;

import a.h.b.a;
import a.h.d;
import a.j.h;
import a.j.i;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "limit", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, dWr=1)
public class v extends u
{
  public static final int a(CharSequence paramCharSequence, char paramChar, int paramInt)
  {
    AppMethodBeat.i(56324);
    a.f.b.j.p(paramCharSequence, "receiver$0");
    char[] arrayOfChar;
    if (!(paramCharSequence instanceof String))
    {
      arrayOfChar = new char[1];
      arrayOfChar[0] = ((char)paramChar);
      a.f.b.j.p(paramCharSequence, "receiver$0");
      a.f.b.j.p(arrayOfChar, "chars");
      if ((paramCharSequence instanceof String))
      {
        paramChar = a.a.e.b(arrayOfChar);
        paramChar = ((String)paramCharSequence).indexOf(paramChar, paramInt);
        AppMethodBeat.o(56324);
      }
    }
    while (true)
    {
      return paramChar;
      paramChar = a.h.e.im(paramInt, 0);
      char c1 = m.at(paramCharSequence);
      if (paramChar <= c1)
        while (true)
        {
          char c2 = paramCharSequence.charAt(paramChar);
          paramInt = 0;
          label97: if (paramInt <= 0)
            if (!a.a(arrayOfChar[paramInt], c2, false));
          for (paramInt = 1; ; paramInt = 0)
          {
            if (paramInt == 0)
              break label138;
            AppMethodBeat.o(56324);
            break;
            paramInt++;
            break label97;
          }
          label138: if (paramChar == c1)
            break label150;
          paramChar++;
        }
      label150: paramChar = 'ð¿¿';
      AppMethodBeat.o(56324);
      continue;
      paramChar = ((String)paramCharSequence).indexOf(paramChar, paramInt);
      AppMethodBeat.o(56324);
    }
  }

  private static final int a(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(56322);
    Object localObject;
    int i;
    if (!paramBoolean2)
    {
      localObject = (a.h.b)new d(a.h.e.im(paramInt1, 0), a.h.e.in(paramInt2, paramCharSequence1.length()));
      if ((!(paramCharSequence1 instanceof String)) || (!(paramCharSequence2 instanceof String)))
        break label162;
      paramInt1 = ((a.h.b)localObject).AVJ;
      paramInt2 = ((a.h.b)localObject).AVK;
      i = ((a.h.b)localObject).hzv;
      if (i <= 0)
        break label141;
      if (paramInt1 > paramInt2)
        break label237;
      label80: if (!m.a((String)paramCharSequence2, (String)paramCharSequence1, paramInt1, paramCharSequence2.length(), paramBoolean1))
        break label149;
      AppMethodBeat.o(56322);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = a.h.e.in(paramInt1, m.at(paramCharSequence1));
      paramInt2 = a.h.e.im(paramInt2, 0);
      localObject = a.h.b.AVL;
      localObject = b.a.aP(paramInt1, paramInt2, -1);
      break;
      label141: if (paramInt1 >= paramInt2)
      {
        break label80;
        label149: if (paramInt1 != paramInt2)
        {
          paramInt1 += i;
          break label80;
          label162: paramInt1 = ((a.h.b)localObject).AVJ;
          paramInt2 = ((a.h.b)localObject).AVK;
          i = ((a.h.b)localObject).hzv;
          if (i > 0)
          {
            if (paramInt1 > paramInt2);
          }
          else
            while (true)
            {
              if (m.a(paramCharSequence2, paramCharSequence1, paramInt1, paramCharSequence2.length(), paramBoolean1))
              {
                AppMethodBeat.o(56322);
                break;
                if (paramInt1 < paramInt2)
                  break label237;
                continue;
              }
              if (paramInt1 == paramInt2)
                break label237;
              paramInt1 += i;
            }
        }
      }
      label237: AppMethodBeat.o(56322);
      paramInt1 = -1;
    }
  }

  public static final int a(CharSequence paramCharSequence, String paramString, int paramInt)
  {
    AppMethodBeat.i(56330);
    a.f.b.j.p(paramCharSequence, "receiver$0");
    a.f.b.j.p(paramString, "string");
    if (!(paramCharSequence instanceof String))
    {
      paramInt = a(paramCharSequence, (CharSequence)paramString, paramInt, 0, false, true);
      AppMethodBeat.o(56330);
    }
    while (true)
    {
      return paramInt;
      paramInt = ((String)paramCharSequence).lastIndexOf(paramString, paramInt);
      AppMethodBeat.o(56330);
    }
  }

  public static final int a(CharSequence paramCharSequence, String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(56326);
    a.f.b.j.p(paramCharSequence, "receiver$0");
    a.f.b.j.p(paramString, "string");
    if ((paramBoolean) || (!(paramCharSequence instanceof String)))
    {
      paramInt = b(paramCharSequence, (CharSequence)paramString, paramInt, paramCharSequence.length(), paramBoolean);
      AppMethodBeat.o(56326);
    }
    while (true)
    {
      return paramInt;
      paramInt = ((String)paramCharSequence).indexOf(paramString, paramInt);
      AppMethodBeat.o(56326);
    }
  }

  public static final String a(CharSequence paramCharSequence, d paramd)
  {
    AppMethodBeat.i(56309);
    a.f.b.j.p(paramCharSequence, "receiver$0");
    a.f.b.j.p(paramd, "range");
    paramCharSequence = paramCharSequence.subSequence(paramd.AVJ, paramd.AVK + 1).toString();
    AppMethodBeat.o(56309);
    return paramCharSequence;
  }

  public static final String a(String paramString1, char paramChar, String paramString2)
  {
    AppMethodBeat.i(56316);
    a.f.b.j.p(paramString1, "receiver$0");
    a.f.b.j.p(paramString2, "missingDelimiterValue");
    int i = m.a((CharSequence)paramString1, paramChar);
    if (i == -1)
      AppMethodBeat.o(56316);
    while (true)
    {
      return paramString2;
      paramString2 = paramString1.substring(i + 1, paramString1.length());
      a.f.b.j.o(paramString2, "(this as java.lang.Strinâ€¦ing(startIndex, endIndex)");
      AppMethodBeat.o(56316);
    }
  }

  public static final List<String> a(CharSequence paramCharSequence, String[] paramArrayOfString)
  {
    AppMethodBeat.i(56339);
    a.f.b.j.p(paramCharSequence, "receiver$0");
    a.f.b.j.p(paramArrayOfString, "delimiters");
    Object localObject = paramArrayOfString[0];
    int i;
    int j;
    if (((CharSequence)localObject).length() == 0)
    {
      i = 1;
      if (i != 0)
        break label174;
      j = m.a(paramCharSequence, (String)localObject, 0, false);
      if (j != -1)
        break label77;
      paramCharSequence = a.a.j.listOf(paramCharSequence.toString());
      AppMethodBeat.o(56339);
    }
    while (true)
    {
      return paramCharSequence;
      i = 0;
      break;
      label77: paramArrayOfString = new ArrayList(10);
      i = 0;
      int k;
      int m;
      do
      {
        paramArrayOfString.add(paramCharSequence.subSequence(i, j).toString());
        k = ((String)localObject).length() + j;
        m = m.a(paramCharSequence, (String)localObject, k, false);
        j = m;
        i = k;
      }
      while (m != -1);
      paramArrayOfString.add(paramCharSequence.subSequence(k, paramCharSequence.length()).toString());
      paramCharSequence = (List)paramArrayOfString;
      AppMethodBeat.o(56339);
      continue;
      label174: localObject = i.f(a(paramCharSequence, paramArrayOfString, false));
      paramArrayOfString = (Collection)new ArrayList(a.a.j.d((Iterable)localObject));
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        paramArrayOfString.add(m.a(paramCharSequence, (d)((Iterator)localObject).next()));
      paramCharSequence = (List)paramArrayOfString;
      AppMethodBeat.o(56339);
    }
  }

  public static final boolean a(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(56319);
    a.f.b.j.p(paramCharSequence1, "receiver$0");
    a.f.b.j.p(paramCharSequence2, "other");
    if ((paramInt1 < 0) || (paramCharSequence1.length() - paramInt2 < 0) || (paramInt1 > paramCharSequence2.length() - paramInt2))
    {
      AppMethodBeat.o(56319);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      for (int i = 0; ; i++)
      {
        if (i >= paramInt2)
          break label118;
        if (!a.a(paramCharSequence1.charAt(i + 0), paramCharSequence2.charAt(paramInt1 + i), paramBoolean))
        {
          AppMethodBeat.o(56319);
          paramBoolean = bool;
          break;
        }
      }
      label118: paramBoolean = true;
      AppMethodBeat.o(56319);
    }
  }

  public static final boolean a(CharSequence paramCharSequence1, CharSequence paramCharSequence2, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(56332);
    a.f.b.j.p(paramCharSequence1, "receiver$0");
    a.f.b.j.p(paramCharSequence2, "other");
    if ((paramCharSequence2 instanceof String))
      if (m.a(paramCharSequence1, (String)paramCharSequence2, 0, paramBoolean, 2) >= 0)
      {
        AppMethodBeat.o(56332);
        paramBoolean = bool;
      }
    while (true)
    {
      return paramBoolean;
      AppMethodBeat.o(56332);
      paramBoolean = false;
      continue;
      if (b(paramCharSequence1, paramCharSequence2, 0, paramCharSequence1.length(), paramBoolean) >= 0)
      {
        AppMethodBeat.o(56332);
        paramBoolean = bool;
      }
      else
      {
        AppMethodBeat.o(56332);
        paramBoolean = false;
      }
    }
  }

  public static final String aJ(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(56311);
    a.f.b.j.p(paramString1, "receiver$0");
    a.f.b.j.p(paramString2, "delimiter");
    a.f.b.j.p(paramString3, "missingDelimiterValue");
    int i = m.a((CharSequence)paramString1, paramString2, 0, false, 6);
    if (i == -1)
      AppMethodBeat.o(56311);
    while (true)
    {
      return paramString3;
      paramString3 = paramString1.substring(0, i);
      a.f.b.j.o(paramString3, "(this as java.lang.Strinâ€¦ing(startIndex, endIndex)");
      AppMethodBeat.o(56311);
    }
  }

  public static final String aK(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(56313);
    a.f.b.j.p(paramString1, "receiver$0");
    a.f.b.j.p(paramString2, "delimiter");
    a.f.b.j.p(paramString3, "missingDelimiterValue");
    int i = m.a((CharSequence)paramString1, paramString2, 0, false, 6);
    if (i == -1)
      AppMethodBeat.o(56313);
    while (true)
    {
      return paramString3;
      paramString3 = paramString1.substring(i + paramString2.length(), paramString1.length());
      a.f.b.j.o(paramString3, "(this as java.lang.Strinâ€¦ing(startIndex, endIndex)");
      AppMethodBeat.o(56313);
    }
  }

  public static final d as(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(56307);
    a.f.b.j.p(paramCharSequence, "receiver$0");
    paramCharSequence = new d(0, paramCharSequence.length() - 1);
    AppMethodBeat.o(56307);
    return paramCharSequence;
  }

  public static final int at(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(56308);
    a.f.b.j.p(paramCharSequence, "receiver$0");
    int i = paramCharSequence.length();
    AppMethodBeat.o(56308);
    return i - 1;
  }

  public static final boolean au(CharSequence paramCharSequence)
  {
    boolean bool = false;
    AppMethodBeat.i(56320);
    a.f.b.j.p(paramCharSequence, "receiver$0");
    if ((paramCharSequence.length() > 0) && (a.a(paramCharSequence.charAt(0), '0', false)))
    {
      bool = true;
      AppMethodBeat.o(56320);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(56320);
    }
  }

  public static final int b(CharSequence paramCharSequence, char paramChar, int paramInt)
  {
    AppMethodBeat.i(56328);
    a.f.b.j.p(paramCharSequence, "receiver$0");
    char[] arrayOfChar;
    if (!(paramCharSequence instanceof String))
    {
      arrayOfChar = new char[1];
      arrayOfChar[0] = ((char)paramChar);
      a.f.b.j.p(paramCharSequence, "receiver$0");
      a.f.b.j.p(arrayOfChar, "chars");
      if ((paramCharSequence instanceof String))
      {
        paramChar = a.a.e.b(arrayOfChar);
        paramChar = ((String)paramCharSequence).lastIndexOf(paramChar, paramInt);
        AppMethodBeat.o(56328);
      }
    }
    while (true)
    {
      return paramChar;
      label136: for (paramChar = a.h.e.in(paramInt, m.at(paramCharSequence)); ; paramChar--)
      {
        if (paramChar < 0)
          break label142;
        char c = paramCharSequence.charAt(paramChar);
        paramInt = 0;
        label94: if (paramInt <= 0)
          if (!a.a(arrayOfChar[paramInt], c, false));
        for (paramInt = 1; ; paramInt = 0)
        {
          if (paramInt == 0)
            break label136;
          AppMethodBeat.o(56328);
          break;
          paramInt++;
          break label94;
        }
      }
      label142: paramChar = 'ð¿¿';
      AppMethodBeat.o(56328);
      continue;
      paramChar = ((String)paramCharSequence).lastIndexOf(paramChar, paramInt);
      AppMethodBeat.o(56328);
    }
  }

  public static final h<String> b(CharSequence paramCharSequence, String[] paramArrayOfString, boolean paramBoolean)
  {
    AppMethodBeat.i(56337);
    a.f.b.j.p(paramCharSequence, "receiver$0");
    a.f.b.j.p(paramArrayOfString, "delimiters");
    paramCharSequence = i.d(a(paramCharSequence, paramArrayOfString, paramBoolean), (a.f.a.b)new v.b(paramCharSequence));
    AppMethodBeat.o(56337);
    return paramCharSequence;
  }

  public static final String b(String paramString, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(56318);
    a.f.b.j.p(paramString, "receiver$0");
    a.f.b.j.p(paramCharSequence, "prefix");
    if (m.c((CharSequence)paramString, paramCharSequence))
    {
      paramString = paramString.substring(paramCharSequence.length());
      a.f.b.j.o(paramString, "(this as java.lang.String).substring(startIndex)");
      AppMethodBeat.o(56318);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(56318);
    }
  }

  public static final boolean b(CharSequence paramCharSequence, char paramChar)
  {
    boolean bool = false;
    AppMethodBeat.i(56334);
    a.f.b.j.p(paramCharSequence, "receiver$0");
    if (m.a(paramCharSequence, paramChar, 0, 2) >= 0)
    {
      bool = true;
      AppMethodBeat.o(56334);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(56334);
    }
  }

  public static final boolean c(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    AppMethodBeat.i(56321);
    a.f.b.j.p(paramCharSequence1, "receiver$0");
    a.f.b.j.p(paramCharSequence2, "prefix");
    boolean bool;
    if (((paramCharSequence1 instanceof String)) && ((paramCharSequence2 instanceof String)))
    {
      bool = m.jb((String)paramCharSequence1, (String)paramCharSequence2);
      AppMethodBeat.o(56321);
    }
    while (true)
    {
      return bool;
      bool = m.a(paramCharSequence1, paramCharSequence2, 0, paramCharSequence2.length(), false);
      AppMethodBeat.o(56321);
    }
  }

  public static final String jd(String paramString1, String paramString2)
  {
    AppMethodBeat.i(56310);
    a.f.b.j.p(paramString1, "receiver$0");
    a.f.b.j.p(paramString2, "missingDelimiterValue");
    int i = m.a((CharSequence)paramString1, '<', 0, 6);
    if (i == -1)
      AppMethodBeat.o(56310);
    while (true)
    {
      return paramString2;
      paramString2 = paramString1.substring(0, i);
      a.f.b.j.o(paramString2, "(this as java.lang.Strinâ€¦ing(startIndex, endIndex)");
      AppMethodBeat.o(56310);
    }
  }

  public static final String jg(String paramString1, String paramString2)
  {
    AppMethodBeat.i(56315);
    a.f.b.j.p(paramString1, "receiver$0");
    a.f.b.j.p(paramString2, "missingDelimiterValue");
    int i = m.a((CharSequence)paramString1, '/');
    if (i == -1)
      AppMethodBeat.o(56315);
    while (true)
    {
      return paramString2;
      paramString2 = paramString1.substring(0, i);
      a.f.b.j.o(paramString2, "(this as java.lang.Strinâ€¦ing(startIndex, endIndex)");
      AppMethodBeat.o(56315);
    }
  }

  public static final CharSequence trim(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(56306);
    a.f.b.j.p(paramCharSequence, "receiver$0");
    int i = paramCharSequence.length() - 1;
    int j = 0;
    int k = 0;
    while (k <= i)
    {
      if (j == 0);
      boolean bool;
      for (int m = k; ; m = i)
      {
        bool = a.isWhitespace(paramCharSequence.charAt(m));
        if (j != 0)
          break label76;
        if (bool)
          break label70;
        j = 1;
        break;
      }
      label70: k++;
      continue;
      label76: if (!bool)
        break;
      i--;
    }
    paramCharSequence = paramCharSequence.subSequence(k, i + 1);
    AppMethodBeat.o(56306);
    return paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.k.v
 * JD-Core Version:    0.6.2
 */