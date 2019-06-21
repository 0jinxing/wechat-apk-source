package a.k;

import a.a.ab;
import a.f.b.j;
import a.j.i;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"CASE_INSENSITIVE_ORDER", "Ljava/util/Comparator;", "", "Lkotlin/String$Companion;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "String", "stringBuffer", "Ljava/lang/StringBuffer;", "stringBuilder", "Ljava/lang/StringBuilder;", "bytes", "", "charset", "Ljava/nio/charset/Charset;", "offset", "", "length", "chars", "", "codePoints", "", "capitalize", "codePointAt", "index", "codePointBefore", "codePointCount", "beginIndex", "endIndex", "compareTo", "other", "ignoreCase", "", "contentEquals", "charSequence", "", "decapitalize", "endsWith", "suffix", "equals", "format", "locale", "Ljava/util/Locale;", "args", "", "", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "intern", "isBlank", "nativeIndexOf", "ch", "", "fromIndex", "str", "nativeLastIndexOf", "offsetByCodePoints", "codePointOffset", "regionMatches", "thisOffset", "otherOffset", "repeat", "n", "replace", "oldChar", "newChar", "oldValue", "newValue", "replaceFirst", "split", "", "regex", "Ljava/util/regex/Pattern;", "limit", "startsWith", "prefix", "startIndex", "substring", "toByteArray", "toCharArray", "destination", "destinationOffset", "toLowerCase", "toPattern", "flags", "toUpperCase", "kotlin-stdlib"}, dWr=1)
public class u extends t
{
  public static final boolean I(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(56352);
    if (paramString1 == null)
      if (paramString2 == null)
      {
        paramBoolean = true;
        AppMethodBeat.o(56352);
      }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(56352);
      continue;
      if (!paramBoolean)
      {
        paramBoolean = paramString1.equals(paramString2);
        AppMethodBeat.o(56352);
      }
      else
      {
        paramBoolean = paramString1.equalsIgnoreCase(paramString2);
        AppMethodBeat.o(56352);
      }
    }
  }

  public static final String a(String paramString, char paramChar1, char paramChar2)
  {
    AppMethodBeat.i(56353);
    j.p(paramString, "receiver$0");
    paramString = paramString.replace(paramChar1, paramChar2);
    j.o(paramString, "(this as java.lang.Strin…replace(oldChar, newChar)");
    AppMethodBeat.o(56353);
    return paramString;
  }

  public static final boolean a(String paramString1, String paramString2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(56359);
    j.p(paramString1, "receiver$0");
    j.p(paramString2, "other");
    if (!paramBoolean)
    {
      paramBoolean = paramString1.regionMatches(0, paramString2, paramInt1, paramInt2);
      AppMethodBeat.o(56359);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = paramString1.regionMatches(paramBoolean, 0, paramString2, paramInt1, paramInt2);
      AppMethodBeat.o(56359);
    }
  }

  public static final String aI(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(56355);
    j.p(paramString1, "receiver$0");
    j.p(paramString2, "oldValue");
    j.p(paramString3, "newValue");
    int i = m.a((CharSequence)paramString1, paramString2, 0, false, 2);
    if (i < 0)
      AppMethodBeat.o(56355);
    while (true)
    {
      return paramString1;
      int j = i + paramString2.length();
      paramString1 = (CharSequence)paramString1;
      paramString2 = (CharSequence)paramString3;
      j.p(paramString1, "receiver$0");
      j.p(paramString2, "replacement");
      if (j < i)
      {
        paramString1 = (Throwable)new IndexOutOfBoundsException("End index (" + j + ") is less than start index (" + i + ").");
        AppMethodBeat.o(56355);
        throw paramString1;
      }
      paramString3 = new StringBuilder();
      paramString3.append(paramString1, 0, i);
      paramString3.append(paramString2);
      paramString3.append(paramString1, j, paramString1.length());
      paramString1 = ((CharSequence)paramString3).toString();
      AppMethodBeat.o(56355);
    }
  }

  public static final boolean ar(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(56358);
    j.p(paramCharSequence, "receiver$0");
    int i;
    if (paramCharSequence.length() != 0)
    {
      Iterator localIterator = ((Iterable)m.as(paramCharSequence)).iterator();
      do
        if (!localIterator.hasNext())
          break;
      while (a.isWhitespace(paramCharSequence.charAt(((ab)localIterator).nextInt())));
      i = 0;
      if (i == 0);
    }
    else
    {
      AppMethodBeat.o(56358);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      i = 1;
      break;
      AppMethodBeat.o(56358);
    }
  }

  public static final String capitalize(String paramString)
  {
    AppMethodBeat.i(56360);
    j.p(paramString, "receiver$0");
    int i;
    if (((CharSequence)paramString).length() > 0)
      i = 1;
    while ((i != 0) && (Character.isLowerCase(paramString.charAt(0))))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      String str = paramString.substring(0, 1);
      j.o(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
      if (str == null)
      {
        paramString = new v("null cannot be cast to non-null type java.lang.String");
        AppMethodBeat.o(56360);
        throw paramString;
        i = 0;
      }
      else
      {
        str = str.toUpperCase();
        j.o(str, "(this as java.lang.String).toUpperCase()");
        localStringBuilder = localStringBuilder.append(str);
        paramString = paramString.substring(1);
        j.o(paramString, "(this as java.lang.String).substring(startIndex)");
        paramString = paramString;
        AppMethodBeat.o(56360);
      }
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(56360);
    }
  }

  public static final String i(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(56354);
    j.p(paramString1, "receiver$0");
    j.p(paramString2, "oldValue");
    j.p(paramString3, "newValue");
    paramString1 = i.a(m.a((CharSequence)paramString1, new String[] { paramString2 }, paramBoolean, 4), (CharSequence)paramString3);
    AppMethodBeat.o(56354);
    return paramString1;
  }

  public static final boolean jb(String paramString1, String paramString2)
  {
    AppMethodBeat.i(56356);
    j.p(paramString1, "receiver$0");
    j.p(paramString2, "prefix");
    boolean bool = paramString1.startsWith(paramString2);
    AppMethodBeat.o(56356);
    return bool;
  }

  public static final boolean jc(String paramString1, String paramString2)
  {
    AppMethodBeat.i(56357);
    j.p(paramString1, "receiver$0");
    j.p(paramString2, "suffix");
    boolean bool = paramString1.endsWith(paramString2);
    AppMethodBeat.o(56357);
    return bool;
  }

  public static final String s(CharSequence paramCharSequence, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(56361);
    j.p(paramCharSequence, "receiver$0");
    if (paramInt >= 0);
    for (int j = 1; j == 0; j = 0)
    {
      paramCharSequence = (Throwable)new IllegalArgumentException(("Count 'n' must be non-negative, but was " + paramInt + '.').toString());
      AppMethodBeat.o(56361);
      throw paramCharSequence;
    }
    StringBuilder localStringBuilder;
    switch (paramInt)
    {
    default:
      switch (paramCharSequence.length())
      {
      default:
        localStringBuilder = new StringBuilder(paramCharSequence.length() * paramInt);
        if (paramInt > 0)
          for (j = i; ; j++)
          {
            localStringBuilder.append(paramCharSequence);
            if (j == paramInt)
              break;
          }
        break;
      case 0:
      case 1:
      }
    case 0:
      paramCharSequence = "";
      AppMethodBeat.o(56361);
    case 1:
    }
    while (true)
    {
      return paramCharSequence;
      paramCharSequence = paramCharSequence.toString();
      AppMethodBeat.o(56361);
      continue;
      paramCharSequence = "";
      AppMethodBeat.o(56361);
      continue;
      j = paramCharSequence.charAt(0);
      paramCharSequence = new char[paramInt];
      i = paramCharSequence.length;
      for (paramInt = 0; paramInt < i; paramInt++)
        paramCharSequence[paramInt] = ((char)j);
      paramCharSequence = new String(paramCharSequence);
      AppMethodBeat.o(56361);
      continue;
      paramCharSequence = localStringBuilder.toString();
      j.o(paramCharSequence, "sb.toString()");
      AppMethodBeat.o(56361);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.k.u
 * JD-Core Version:    0.6.2
 */