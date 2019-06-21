package a.i.b.a.c.m.a;

import a.f.b.j;
import a.k.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

public final class a
{
  public static final String awr(String paramString)
  {
    AppMethodBeat.i(122910);
    j.p(paramString, "receiver$0");
    a.a locala = new a.a(paramString);
    int i;
    if (((CharSequence)paramString).length() == 0)
    {
      i = 1;
      if ((i == 0) && (locala.UO(0)))
        break label58;
      AppMethodBeat.o(122910);
    }
    while (true)
    {
      return paramString;
      i = 0;
      break;
      label58: if ((paramString.length() == 1) || (!locala.UO(1)))
      {
        j.p(paramString, "receiver$0");
        if (((CharSequence)paramString).length() == 0)
        {
          i = 1;
          label94: if (i == 0)
          {
            c = paramString.charAt(0);
            if ('A' <= c)
              break label123;
          }
        }
        label123: 
        while ('Z' < c)
        {
          AppMethodBeat.o(122910);
          break;
          i = 0;
          break label94;
        }
        char c = Character.toLowerCase(c);
        paramString = paramString.substring(1);
        j.o(paramString, "(this as java.lang.String).substring(startIndex)");
        paramString = String.valueOf(c) + paramString;
        AppMethodBeat.o(122910);
      }
      else
      {
        a.b localb = new a.b();
        Object localObject1 = ((Iterable)m.as((CharSequence)paramString)).iterator();
        label202: Object localObject2;
        if (((Iterator)localObject1).hasNext())
        {
          localObject2 = ((Iterator)localObject1).next();
          if (!locala.UO(((Number)localObject2).intValue()))
          {
            i = 1;
            label238: if (i == 0)
              break label333;
          }
        }
        while (true)
        {
          localObject2 = (Integer)localObject2;
          if (localObject2 == null)
            break label341;
          i = ((Integer)localObject2).intValue() - 1;
          localObject1 = new StringBuilder();
          localObject2 = paramString.substring(0, i);
          j.o(localObject2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
          localObject2 = ((StringBuilder)localObject1).append(localb.awu((String)localObject2));
          paramString = paramString.substring(i);
          j.o(paramString, "(this as java.lang.String).substring(startIndex)");
          paramString = paramString;
          AppMethodBeat.o(122910);
          break;
          i = 0;
          break label238;
          label333: break label202;
          localObject2 = null;
        }
        label341: paramString = localb.awu(paramString);
        AppMethodBeat.o(122910);
      }
    }
  }

  public static final String aws(String paramString)
  {
    AppMethodBeat.i(122911);
    j.p(paramString, "receiver$0");
    int i;
    if (((CharSequence)paramString).length() == 0)
    {
      i = 1;
      if (i == 0)
        break label41;
      AppMethodBeat.o(122911);
    }
    while (true)
    {
      return paramString;
      i = 0;
      break;
      label41: char c = paramString.charAt(0);
      if ('a' > c);
      while ('z' < c)
      {
        AppMethodBeat.o(122911);
        break;
      }
      c = Character.toUpperCase(c);
      paramString = paramString.substring(1);
      j.o(paramString, "(this as java.lang.String).substring(startIndex)");
      paramString = String.valueOf(c) + paramString;
      AppMethodBeat.o(122911);
    }
  }

  public static final String awt(String paramString)
  {
    AppMethodBeat.i(122912);
    j.p(paramString, "receiver$0");
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    int i = paramString.length();
    int j = 0;
    if (j < i)
    {
      char c1 = paramString.charAt(j);
      if ('A' > c1);
      while (true)
      {
        localStringBuilder.append(c1);
        j++;
        break;
        if ('Z' >= c1)
        {
          char c2 = Character.toLowerCase(c1);
          c1 = c2;
        }
      }
    }
    paramString = localStringBuilder.toString();
    j.o(paramString, "builder.toString()");
    AppMethodBeat.o(122912);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.m.a.a
 * JD-Core Version:    0.6.2
 */