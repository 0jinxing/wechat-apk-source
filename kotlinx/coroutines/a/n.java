package kotlinx.coroutines.a;

import a.f.b.j;
import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"AVAILABLE_PROCESSORS", "", "getAVAILABLE_PROCESSORS", "()I", "systemProp", "", "propertyName", "", "defaultValue", "minValue", "maxValue", "", "kotlinx-coroutines-core"})
public final class n
{
  private static final int BRH;

  static
  {
    AppMethodBeat.i(118445);
    BRH = Runtime.getRuntime().availableProcessors();
    AppMethodBeat.o(118445);
  }

  public static final String awA(String paramString)
  {
    AppMethodBeat.i(118441);
    j.p(paramString, "propertyName");
    try
    {
      paramString = System.getProperty(paramString);
      AppMethodBeat.o(118441);
      return paramString;
    }
    catch (SecurityException paramString)
    {
      while (true)
        paramString = null;
    }
  }

  private static long d(String paramString, long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(118443);
    j.p(paramString, "propertyName");
    String str = awA(paramString);
    if (str == null)
      AppMethodBeat.o(118443);
    while (true)
    {
      return paramLong1;
      Long localLong = m.awz(str);
      if (localLong != null)
      {
        paramLong1 = localLong.longValue();
        if ((paramLong2 > paramLong1) || (paramLong3 < paramLong1))
        {
          paramString = (Throwable)new IllegalStateException(("System property '" + paramString + "' should be in range " + paramLong2 + ".." + paramLong3 + ", but is '" + paramLong1 + '\'').toString());
          AppMethodBeat.o(118443);
          throw paramString;
        }
      }
      else
      {
        paramString = (Throwable)new IllegalStateException(("System property '" + paramString + "' has unrecognized value '" + str + '\'').toString());
        AppMethodBeat.o(118443);
        throw paramString;
      }
      AppMethodBeat.o(118443);
    }
  }

  public static final int elQ()
  {
    return BRH;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.a.n
 * JD-Core Version:    0.6.2
 */