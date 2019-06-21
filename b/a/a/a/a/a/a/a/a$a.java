package b.a.a.a.a.a.a.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.be;
import java.util.HashMap;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lmain/java/com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberReporter$Companion;", "", "()V", "sMap", "Ljava/util/HashMap;", "", "Lcom/tencent/mm/autogen/mmdata/rpt/WAPhoneAuthActionLogStruct;", "Lkotlin/collections/HashMap;", "get", "appId", "init", "", "uninit", "plugin-appbrand-integration_release"})
public final class a$a
{
  public final void Az(String paramString)
  {
    try
    {
      AppMethodBeat.i(135275);
      j.p(paramString, "appId");
      Map localMap = (Map)a.emo();
      be localbe = new com/tencent/mm/g/b/a/be;
      localbe.<init>();
      localMap.put(paramString, localbe);
      AppMethodBeat.o(135275);
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final be awB(String paramString)
  {
    try
    {
      AppMethodBeat.i(135276);
      j.p(paramString, "appId");
      paramString = (be)a.emo().get(paramString);
      AppMethodBeat.o(135276);
      return paramString;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final void awC(String paramString)
  {
    try
    {
      AppMethodBeat.i(135277);
      j.p(paramString, "appId");
      a.emo().remove(paramString);
      AppMethodBeat.o(135277);
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     b.a.a.a.a.a.a.a.a.a
 * JD-Core Version:    0.6.2
 */