package a.i.b.a.c.d.b;

import a.aa;
import a.i.b.a.c.i.d.c;
import a.k.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class l
  implements k<j>
{
  public static final l BrF;

  static
  {
    AppMethodBeat.i(120283);
    BrF = new l();
    AppMethodBeat.o(120283);
  }

  private j avO(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(120276);
    a.f.b.j.p(paramString, "representation");
    if (paramString.length() > 0);
    for (int j = 1; (aa.AUz) && (j == 0); j = 0)
    {
      paramString = (Throwable)new AssertionError("empty string as JvmType");
      AppMethodBeat.o(120276);
      throw paramString;
    }
    int k = paramString.charAt(0);
    c[] arrayOfc = c.values();
    int m = arrayOfc.length;
    j = 0;
    Object localObject;
    int n;
    if (j < m)
    {
      localObject = arrayOfc[j];
      if (((c)localObject).desc.charAt(0) == k)
      {
        n = 1;
        label105: if (n == 0)
          break label141;
        label110: if (localObject == null)
          break label153;
        paramString = (j)new j.c((c)localObject);
        AppMethodBeat.o(120276);
      }
    }
    while (true)
    {
      return paramString;
      n = 0;
      break label105;
      label141: j++;
      break;
      localObject = null;
      break label110;
      switch (k)
      {
      default:
        label153: j = i;
        if (k == 76)
        {
          localObject = (CharSequence)paramString;
          a.f.b.j.p(localObject, "receiver$0");
          if ((((CharSequence)localObject).length() <= 0) || (!a.a(((CharSequence)localObject).charAt(a.k.m.at((CharSequence)localObject)), ';', false)))
            break label350;
        }
        break;
      case 86:
      case 91:
      }
      label350: for (n = 1; ; n = 0)
      {
        j = i;
        if (n != 0)
          j = 1;
        if ((!aa.AUz) || (j != 0))
          break label356;
        paramString = (Throwable)new AssertionError("Type that is not primitive nor array should be Object, but '" + paramString + "' was found");
        AppMethodBeat.o(120276);
        throw paramString;
        paramString = (j)new j.c(null);
        AppMethodBeat.o(120276);
        break;
        paramString = paramString.substring(1);
        a.f.b.j.o(paramString, "(this as java.lang.String).substring(startIndex)");
        paramString = (j)new j.a(avO(paramString));
        AppMethodBeat.o(120276);
        break;
      }
      label356: paramString = paramString.substring(1, paramString.length() - 1);
      a.f.b.j.o(paramString, "(this as java.lang.Strin…ing(startIndex, endIndex)");
      paramString = (j)new j.b(paramString);
      AppMethodBeat.o(120276);
    }
  }

  private static j.b avP(String paramString)
  {
    AppMethodBeat.i(120278);
    a.f.b.j.p(paramString, "internalName");
    paramString = new j.b(paramString);
    AppMethodBeat.o(120278);
    return paramString;
  }

  public final String a(j paramj)
  {
    AppMethodBeat.i(120280);
    a.f.b.j.p(paramj, "type");
    if ((paramj instanceof j.a))
    {
      paramj = "[" + a(((j.a)paramj).BrC);
      AppMethodBeat.o(120280);
    }
    while (true)
    {
      return paramj;
      if ((paramj instanceof j.c))
      {
        paramj = ((j.c)paramj).BrE;
        if (paramj != null)
        {
          paramj = paramj.desc;
          if (paramj != null);
        }
        else
        {
          paramj = "V";
          AppMethodBeat.o(120280);
        }
      }
      else if ((paramj instanceof j.b))
      {
        paramj = "L" + ((j.b)paramj).BrD + ";";
        AppMethodBeat.o(120280);
      }
      else
      {
        paramj = new a.m();
        AppMethodBeat.o(120280);
        throw paramj;
        AppMethodBeat.o(120280);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.l
 * JD-Core Version:    0.6.2
 */