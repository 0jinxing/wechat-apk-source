package com.tencent.ttpic.json;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

public class JSONTokener
{
  private long character;
  private boolean eof;
  private long index;
  private long line;
  private char previous;
  private Reader reader;
  private boolean usePrevious;

  public JSONTokener(InputStream paramInputStream)
  {
    this(new InputStreamReader(paramInputStream));
    AppMethodBeat.i(50184);
    AppMethodBeat.o(50184);
  }

  public JSONTokener(Reader paramReader)
  {
    AppMethodBeat.i(50183);
    if (paramReader.markSupported());
    while (true)
    {
      this.reader = paramReader;
      this.eof = false;
      this.usePrevious = false;
      this.previous = ((char)0);
      this.index = 0L;
      this.character = 1L;
      this.line = 1L;
      AppMethodBeat.o(50183);
      return;
      paramReader = new BufferedReader(paramReader);
    }
  }

  public JSONTokener(String paramString)
  {
    this(new StringReader(paramString));
    AppMethodBeat.i(50185);
    AppMethodBeat.o(50185);
  }

  public static int dehexchar(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9'))
      paramChar -= 48;
    while (true)
    {
      return paramChar;
      if ((paramChar >= 'A') && (paramChar <= 'F'))
        paramChar -= 55;
      else if ((paramChar >= 'a') && (paramChar <= 'f'))
        paramChar -= 87;
      else
        paramChar = '����';
    }
  }

  public void back()
  {
    AppMethodBeat.i(50186);
    if ((this.usePrevious) || (this.index <= 0L))
    {
      JSONException localJSONException = new JSONException("Stepping back two steps is not supported");
      AppMethodBeat.o(50186);
      throw localJSONException;
    }
    this.index -= 1L;
    this.character -= 1L;
    this.usePrevious = true;
    this.eof = false;
    AppMethodBeat.o(50186);
  }

  public boolean end()
  {
    if ((this.eof) && (!this.usePrevious));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean more()
  {
    AppMethodBeat.i(50187);
    next();
    boolean bool;
    if (end())
    {
      bool = false;
      AppMethodBeat.o(50187);
    }
    while (true)
    {
      return bool;
      back();
      bool = true;
      AppMethodBeat.o(50187);
    }
  }

  public char next()
  {
    long l = 0L;
    int i = 0;
    AppMethodBeat.i(50188);
    int j;
    if (this.usePrevious)
    {
      this.usePrevious = false;
      j = this.previous;
    }
    label179: 
    while (true)
    {
      this.index += 1L;
      if (this.previous == '\r')
      {
        this.line += 1L;
        if (j == 10)
          label63: this.character = l;
      }
      while (true)
      {
        while (true)
        {
          this.previous = ((char)(char)j);
          char c = this.previous;
          AppMethodBeat.o(50188);
          return c;
          try
          {
            j = this.reader.read();
            if (j > 0)
              break label179;
            this.eof = true;
            j = i;
          }
          catch (IOException localIOException)
          {
            JSONException localJSONException = new JSONException(localIOException);
            AppMethodBeat.o(50188);
            throw localJSONException;
          }
        }
        l = 1L;
        break label63;
        if (j == 10)
        {
          this.line = (1L + this.line);
          this.character = 0L;
        }
        else
        {
          this.character += 1L;
        }
      }
    }
  }

  public char next(char paramChar)
  {
    AppMethodBeat.i(50189);
    char c = next();
    if (c != paramChar)
    {
      JSONException localJSONException = syntaxError("Expected '" + paramChar + "' and instead saw '" + c + "'");
      AppMethodBeat.o(50189);
      throw localJSONException;
    }
    AppMethodBeat.o(50189);
    return c;
  }

  public String next(int paramInt)
  {
    AppMethodBeat.i(50190);
    Object localObject;
    if (paramInt == 0)
    {
      localObject = "";
      AppMethodBeat.o(50190);
    }
    while (true)
    {
      return localObject;
      localObject = new char[paramInt];
      for (int i = 0; i < paramInt; i++)
      {
        localObject[i] = next();
        if (end())
        {
          localObject = syntaxError("Substring bounds error");
          AppMethodBeat.o(50190);
          throw ((Throwable)localObject);
        }
      }
      localObject = new String((char[])localObject);
      AppMethodBeat.o(50190);
    }
  }

  public char nextClean()
  {
    AppMethodBeat.i(50191);
    char c;
    do
      c = next();
    while ((c != 0) && (c <= ' '));
    AppMethodBeat.o(50191);
    return c;
  }

  public String nextString(char paramChar)
  {
    AppMethodBeat.i(50192);
    Object localObject = new StringBuffer();
    while (true)
    {
      char c = next();
      switch (c)
      {
      default:
        if (c == paramChar)
        {
          localObject = ((StringBuffer)localObject).toString();
          AppMethodBeat.o(50192);
          return localObject;
        }
        break;
      case '\000':
      case '\n':
      case '\r':
        localObject = syntaxError("Unterminated string");
        AppMethodBeat.o(50192);
        throw ((Throwable)localObject);
      case '\\':
        c = next();
        switch (c)
        {
        default:
          localObject = syntaxError("Illegal escape.");
          AppMethodBeat.o(50192);
          throw ((Throwable)localObject);
        case 'b':
          ((StringBuffer)localObject).append('\b');
          break;
        case 't':
          ((StringBuffer)localObject).append('\t');
          break;
        case 'n':
          ((StringBuffer)localObject).append('\n');
          break;
        case 'f':
          ((StringBuffer)localObject).append('\f');
          break;
        case 'r':
          ((StringBuffer)localObject).append('\r');
          break;
        case 'u':
          ((StringBuffer)localObject).append((char)Integer.parseInt(next(4), 16));
          break;
        case '"':
        case '\'':
        case '/':
        case '\\':
          ((StringBuffer)localObject).append(c);
        }
        break;
      }
      ((StringBuffer)localObject).append(c);
    }
  }

  public String nextTo(char paramChar)
  {
    AppMethodBeat.i(50193);
    Object localObject = new StringBuffer();
    while (true)
    {
      char c = next();
      if ((c == paramChar) || (c == 0) || (c == '\n') || (c == '\r'))
      {
        if (c != 0)
          back();
        localObject = ((StringBuffer)localObject).toString().trim();
        AppMethodBeat.o(50193);
        return localObject;
      }
      ((StringBuffer)localObject).append(c);
    }
  }

  public String nextTo(String paramString)
  {
    AppMethodBeat.i(50194);
    StringBuffer localStringBuffer = new StringBuffer();
    while (true)
    {
      char c = next();
      if ((paramString.indexOf(c) >= 0) || (c == 0) || (c == '\n') || (c == '\r'))
      {
        if (c != 0)
          back();
        paramString = localStringBuffer.toString().trim();
        AppMethodBeat.o(50194);
        return paramString;
      }
      localStringBuffer.append(c);
    }
  }

  public Object nextValue()
  {
    AppMethodBeat.i(50195);
    char c1 = nextClean();
    Object localObject;
    switch (c1)
    {
    default:
      localObject = new StringBuffer();
    case '"':
    case '\'':
      while ((c1 >= ' ') && (",:]}/\\\"[{;=#".indexOf(c1) < 0))
      {
        ((StringBuffer)localObject).append(c1);
        char c2 = next();
        c1 = c2;
        continue;
        localObject = nextString(c1);
        AppMethodBeat.o(50195);
      }
    case '{':
    case '[':
    }
    while (true)
    {
      return localObject;
      back();
      localObject = new JSONObject(this);
      AppMethodBeat.o(50195);
      continue;
      back();
      localObject = new JSONArray(this);
      AppMethodBeat.o(50195);
      continue;
      back();
      localObject = ((StringBuffer)localObject).toString().trim();
      if ("".equals(localObject))
      {
        localObject = syntaxError("Missing value");
        AppMethodBeat.o(50195);
        throw ((Throwable)localObject);
      }
      localObject = JSONObject.stringToValue((String)localObject);
      AppMethodBeat.o(50195);
    }
  }

  public char skipTo(char paramChar)
  {
    AppMethodBeat.i(50196);
    try
    {
      long l1 = this.index;
      long l2 = this.character;
      long l3 = this.line;
      this.reader.mark(1000000);
      char c = next();
      if (c == 0)
      {
        this.reader.reset();
        this.index = l1;
        this.character = l2;
        this.line = l3;
        AppMethodBeat.o(50196);
      }
      while (true)
      {
        return c;
        if (c != paramChar)
          break;
        back();
        AppMethodBeat.o(50196);
      }
    }
    catch (IOException localIOException)
    {
      JSONException localJSONException = new JSONException(localIOException);
      AppMethodBeat.o(50196);
      throw localJSONException;
    }
  }

  public JSONException syntaxError(String paramString)
  {
    AppMethodBeat.i(50197);
    paramString = new JSONException(paramString + toString());
    AppMethodBeat.o(50197);
    return paramString;
  }

  public String toString()
  {
    AppMethodBeat.i(50198);
    String str = " at " + this.index + " [character " + this.character + " line " + this.line + "]";
    AppMethodBeat.o(50198);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.json.JSONTokener
 * JD-Core Version:    0.6.2
 */