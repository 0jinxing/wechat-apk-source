package a.k;

import a.h.d;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"category", "Lkotlin/text/CharCategory;", "", "getCategory", "(C)Lkotlin/text/CharCategory;", "directionality", "Lkotlin/text/CharDirectionality;", "getDirectionality", "(C)Lkotlin/text/CharDirectionality;", "checkRadix", "", "radix", "digitOf", "char", "isDefined", "", "isDigit", "isHighSurrogate", "isISOControl", "isIdentifierIgnorable", "isJavaIdentifierPart", "isJavaIdentifierStart", "isLetter", "isLetterOrDigit", "isLowSurrogate", "isLowerCase", "isTitleCase", "isUpperCase", "isWhitespace", "toLowerCase", "toTitleCase", "toUpperCase", "kotlin-stdlib"}, dWr=1)
public class b
{
  public static final int UW(int paramInt)
  {
    AppMethodBeat.i(56266);
    if ((2 > paramInt) || (36 < paramInt))
    {
      Throwable localThrowable = (Throwable)new IllegalArgumentException("radix " + paramInt + " was not in valid range " + new d(2, 36));
      AppMethodBeat.o(56266);
      throw localThrowable;
    }
    AppMethodBeat.o(56266);
    return paramInt;
  }

  public static final boolean isWhitespace(char paramChar)
  {
    AppMethodBeat.i(56265);
    boolean bool;
    if ((Character.isWhitespace(paramChar)) || (Character.isSpaceChar(paramChar)))
    {
      bool = true;
      AppMethodBeat.o(56265);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(56265);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.k.b
 * JD-Core Version:    0.6.2
 */