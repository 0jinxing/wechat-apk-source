package com.tencent.mm.plugin.appbrand.game.a;

import a.aa;
import a.f.b.j;
import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/game/config/WAGameConfigSimple;", "Lcom/tencent/mm/plugin/appbrand/game/config/WAGameDynamicConfig;", "", "kv", "", "defaultValue", "askRestart", "(Ljava/lang/String;ZZ)V", "enableAlert", "enableKv", "getConfigDefaultValue", "()Ljava/lang/Boolean;", "onProcessConfig", "input", "(Ljava/lang/String;)Ljava/lang/Boolean;", "Companion", "plugin-appbrand-integration_release"})
public final class e extends g<Boolean>
{
  private static final HashMap<String, e> hqP;
  public static final a hqQ;
  final String hqM;
  private final boolean hqN;
  private final boolean hqO;

  static
  {
    AppMethodBeat.i(134623);
    hqQ = new a((byte)0);
    hqP = new HashMap();
    a.a(new e("localso", (byte)0));
    a.a(new e("showmemory", (byte)0));
    AppMethodBeat.o(134623);
  }

  private e(String paramString)
  {
    AppMethodBeat.i(134622);
    this.hqM = paramString;
    this.hqN = false;
    this.hqO = true;
    if (!m.ar((CharSequence)this.hqM));
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramString = (Throwable)new AssertionError("Assertion failed");
      AppMethodBeat.o(134622);
      throw paramString;
    }
    AppMethodBeat.o(134622);
  }

  public static final e Aq(String paramString)
  {
    AppMethodBeat.i(134624);
    j.p(paramString, "kv_name");
    paramString = hqP.get(paramString);
    if (paramString == null)
      j.dWJ();
    paramString = (e)paramString;
    AppMethodBeat.o(134624);
    return paramString;
  }

  protected final boolean aAA()
  {
    return this.hqO;
  }

  protected final String aAy()
  {
    return this.hqM;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/game/config/WAGameConfigSimple$Companion;", "", "()V", "registry", "Ljava/util/HashMap;", "", "Lcom/tencent/mm/plugin/appbrand/game/config/WAGameConfigSimple;", "Lkotlin/collections/HashMap;", "get", "kv_name", "getAll", "", "register", "", "config", "plugin-appbrand-integration_release"})
  public static final class a
  {
    static void a(e parame)
    {
      AppMethodBeat.i(134619);
      Map localMap = (Map)e.aAD();
      String str = parame.hqM;
      if (str == null)
        j.dWJ();
      localMap.put(str, parame);
      AppMethodBeat.o(134619);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.a.e
 * JD-Core Version:    0.6.2
 */