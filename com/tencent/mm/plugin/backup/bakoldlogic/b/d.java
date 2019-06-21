package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.a;
import java.util.HashMap;

public final class d extends a
{
  private static String TAG = "MicroMsg.BakOldItemFactory";
  private static d jyU;
  private HashMap<Integer, j> jvv;

  public static d aUA()
  {
    AppMethodBeat.i(17786);
    if (jyU == null)
    {
      locald = new d();
      jyU = locald;
      a(locald);
    }
    d locald = jyU;
    AppMethodBeat.o(17786);
    return locald;
  }

  public final void aSp()
  {
    jyU = null;
  }

  public final j rD(int paramInt)
  {
    AppMethodBeat.i(17787);
    if (this.jvv == null)
    {
      this.jvv = new HashMap();
      this.jvv.put(Integer.valueOf(3), new e());
      this.jvv.put(Integer.valueOf(47), new c());
      this.jvv.put(Integer.valueOf(49), new b());
      this.jvv.put(Integer.valueOf(34), new h());
      localObject = new g();
      this.jvv.put(Integer.valueOf(43), localObject);
      this.jvv.put(Integer.valueOf(44), localObject);
      this.jvv.put(Integer.valueOf(62), localObject);
      localObject = new f();
      this.jvv.put(Integer.valueOf(48), localObject);
      this.jvv.put(Integer.valueOf(42), localObject);
      this.jvv.put(Integer.valueOf(66), localObject);
      this.jvv.put(Integer.valueOf(10000), localObject);
      this.jvv.put(Integer.valueOf(1), localObject);
      this.jvv.put(Integer.valueOf(37), localObject);
      this.jvv.put(Integer.valueOf(40), localObject);
      this.jvv.put(Integer.valueOf(50), localObject);
    }
    Object localObject = (j)this.jvv.get(Integer.valueOf(paramInt));
    AppMethodBeat.o(17787);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.b.d
 * JD-Core Version:    0.6.2
 */