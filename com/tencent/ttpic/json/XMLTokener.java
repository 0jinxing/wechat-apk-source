package com.tencent.ttpic.json;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

public class XMLTokener extends JSONTokener
{
  public static final HashMap entity;

  static
  {
    AppMethodBeat.i(50229);
    HashMap localHashMap = new HashMap(8);
    entity = localHashMap;
    localHashMap.put("amp", XML.AMP);
    entity.put("apos", XML.APOS);
    entity.put("gt", XML.GT);
    entity.put("lt", XML.LT);
    entity.put("quot", XML.QUOT);
    AppMethodBeat.o(50229);
  }

  public XMLTokener(String paramString)
  {
    super(paramString);
  }

  public String nextCDATA()
  {
    AppMethodBeat.i(50223);
    Object localObject = new StringBuffer();
    int i;
    do
    {
      char c = next();
      if (end())
      {
        localObject = syntaxError("Unclosed CDATA");
        AppMethodBeat.o(50223);
        throw ((Throwable)localObject);
      }
      ((StringBuffer)localObject).append(c);
      i = ((StringBuffer)localObject).length() - 3;
    }
    while ((i < 0) || (((StringBuffer)localObject).charAt(i) != ']') || (((StringBuffer)localObject).charAt(i + 1) != ']') || (((StringBuffer)localObject).charAt(i + 2) != '>'));
    ((StringBuffer)localObject).setLength(i);
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(50223);
    return localObject;
  }

  public Object nextContent()
  {
    AppMethodBeat.i(50224);
    char c1;
    do
      c1 = next();
    while (Character.isWhitespace(c1));
    Object localObject;
    if (c1 == 0)
    {
      localObject = null;
      AppMethodBeat.o(50224);
    }
    while (true)
    {
      return localObject;
      if (c1 == '<')
      {
        localObject = XML.LT;
        AppMethodBeat.o(50224);
      }
      else
      {
        localObject = new StringBuffer();
        if ((c1 != '<') && (c1 != 0))
          break;
        back();
        localObject = ((StringBuffer)localObject).toString().trim();
        AppMethodBeat.o(50224);
      }
    }
    if (c1 == '&')
      ((StringBuffer)localObject).append(nextEntity(c1));
    while (true)
    {
      char c2 = next();
      c1 = c2;
      break;
      ((StringBuffer)localObject).append(c1);
    }
  }

  public Object nextEntity(char paramChar)
  {
    AppMethodBeat.i(50225);
    Object localObject = new StringBuffer();
    char c;
    while (true)
    {
      c = next();
      if ((!Character.isLetterOrDigit(c)) && (c != '#'))
        break;
      ((StringBuffer)localObject).append(Character.toLowerCase(c));
    }
    if (c != ';')
    {
      localObject = syntaxError("Missing ';' in XML entity: &".concat(String.valueOf(localObject)));
      AppMethodBeat.o(50225);
      throw ((Throwable)localObject);
    }
    String str = ((StringBuffer)localObject).toString();
    localObject = entity.get(str);
    if (localObject != null)
      AppMethodBeat.o(50225);
    while (true)
    {
      return localObject;
      localObject = paramChar + str + ";";
      AppMethodBeat.o(50225);
    }
  }

  public Object nextMeta()
  {
    AppMethodBeat.i(50226);
    char c1;
    do
      c1 = next();
    while (Character.isWhitespace(c1));
    Object localObject;
    switch (c1)
    {
    default:
      c1 = next();
      if (Character.isWhitespace(c1))
      {
        localObject = Boolean.TRUE;
        AppMethodBeat.o(50226);
      }
      break;
    case '\000':
    case '<':
    case '>':
    case '/':
    case '=':
    case '!':
    case '?':
    case '"':
    case '\'':
    }
    while (true)
    {
      return localObject;
      localObject = syntaxError("Misshaped meta tag");
      AppMethodBeat.o(50226);
      throw ((Throwable)localObject);
      localObject = XML.LT;
      AppMethodBeat.o(50226);
      continue;
      localObject = XML.GT;
      AppMethodBeat.o(50226);
      continue;
      localObject = XML.SLASH;
      AppMethodBeat.o(50226);
      continue;
      localObject = XML.EQ;
      AppMethodBeat.o(50226);
      continue;
      localObject = XML.BANG;
      AppMethodBeat.o(50226);
      continue;
      localObject = XML.QUEST;
      AppMethodBeat.o(50226);
      continue;
      char c2;
      do
      {
        c2 = next();
        if (c2 == 0)
        {
          localObject = syntaxError("Unterminated string");
          AppMethodBeat.o(50226);
          throw ((Throwable)localObject);
        }
      }
      while (c2 != c1);
      localObject = Boolean.TRUE;
      AppMethodBeat.o(50226);
      continue;
      switch (c1)
      {
      default:
        break;
      case '\000':
      case '!':
      case '"':
      case '\'':
      case '/':
      case '<':
      case '=':
      case '>':
      case '?':
        back();
        localObject = Boolean.TRUE;
        AppMethodBeat.o(50226);
      }
    }
  }

  public Object nextToken()
  {
    AppMethodBeat.i(50227);
    char c1;
    do
      c1 = next();
    while (Character.isWhitespace(c1));
    switch (c1)
    {
    default:
      localObject = new StringBuffer();
      ((StringBuffer)localObject).append(c1);
      c1 = next();
      if (Character.isWhitespace(c1))
      {
        localObject = ((StringBuffer)localObject).toString();
        AppMethodBeat.o(50227);
      }
      break;
    case '\000':
    case '<':
    case '>':
    case '/':
    case '=':
    case '!':
    case '?':
    case '"':
    case '\'':
    }
    while (true)
    {
      return localObject;
      localObject = syntaxError("Misshaped element");
      AppMethodBeat.o(50227);
      throw ((Throwable)localObject);
      localObject = syntaxError("Misplaced '<'");
      AppMethodBeat.o(50227);
      throw ((Throwable)localObject);
      localObject = XML.GT;
      AppMethodBeat.o(50227);
      continue;
      localObject = XML.SLASH;
      AppMethodBeat.o(50227);
      continue;
      localObject = XML.EQ;
      AppMethodBeat.o(50227);
      continue;
      localObject = XML.BANG;
      AppMethodBeat.o(50227);
      continue;
      localObject = XML.QUEST;
      AppMethodBeat.o(50227);
      continue;
      localObject = new StringBuffer();
      while (true)
      {
        char c2 = next();
        if (c2 == 0)
        {
          localObject = syntaxError("Unterminated string");
          AppMethodBeat.o(50227);
          throw ((Throwable)localObject);
        }
        if (c2 == c1)
        {
          localObject = ((StringBuffer)localObject).toString();
          AppMethodBeat.o(50227);
          break;
        }
        if (c2 == '&')
          ((StringBuffer)localObject).append(nextEntity(c2));
        else
          ((StringBuffer)localObject).append(c2);
      }
      switch (c1)
      {
      default:
        break;
      case '\000':
        localObject = ((StringBuffer)localObject).toString();
        AppMethodBeat.o(50227);
        break;
      case '!':
      case '/':
      case '=':
      case '>':
      case '?':
      case '[':
      case ']':
        back();
        localObject = ((StringBuffer)localObject).toString();
        AppMethodBeat.o(50227);
      case '"':
      case '\'':
      case '<':
      }
    }
    Object localObject = syntaxError("Bad character in a name");
    AppMethodBeat.o(50227);
    throw ((Throwable)localObject);
  }

  public boolean skipPast(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(50228);
    int i = paramString.length();
    char[] arrayOfChar = new char[i];
    int j = 0;
    int k;
    while (true)
      if (j < i)
      {
        k = next();
        if (k == 0)
        {
          AppMethodBeat.o(50228);
          return bool;
        }
        arrayOfChar[j] = ((char)k);
        j++;
        continue;
        label58: arrayOfChar[j] = ((char)k);
        k = j + 1;
        j = k;
        if (k < i)
          break;
      }
    for (j = k - i; ; j = 0)
    {
      k = j;
      int m = 0;
      label95: if (m < i)
        if (arrayOfChar[k] == paramString.charAt(m));
      for (k = 0; ; k = 1)
      {
        if (k != 0)
        {
          AppMethodBeat.o(50228);
          bool = true;
          break;
          int n = k + 1;
          k = n;
          if (n >= i)
            k = n - i;
          m++;
          break label95;
        }
        k = next();
        if (k != 0)
          break label58;
        AppMethodBeat.o(50228);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.json.XMLTokener
 * JD-Core Version:    0.6.2
 */