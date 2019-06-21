package com.tencent.mm.plugin.backup.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

public final class c extends com.tencent.mm.plugin.backup.b.a
{
  private static String TAG = "MicroMsg.BackupItemFactory";
  private static c jvu;
  private HashMap<Integer, l> jvv;

  private void aTA()
  {
    AppMethodBeat.i(17453);
    this.jvv = new HashMap();
    this.jvv.put(Integer.valueOf(3), new d());
    this.jvv.put(Integer.valueOf(47), new b());
    this.jvv.put(Integer.valueOf(49), new a());
    this.jvv.put(Integer.valueOf(34), new g());
    Object localObject = new f();
    this.jvv.put(Integer.valueOf(43), localObject);
    this.jvv.put(Integer.valueOf(44), localObject);
    this.jvv.put(Integer.valueOf(62), localObject);
    localObject = new e();
    this.jvv.put(Integer.valueOf(48), localObject);
    this.jvv.put(Integer.valueOf(42), localObject);
    this.jvv.put(Integer.valueOf(66), localObject);
    this.jvv.put(Integer.valueOf(10000), localObject);
    this.jvv.put(Integer.valueOf(1), localObject);
    this.jvv.put(Integer.valueOf(37), localObject);
    this.jvv.put(Integer.valueOf(40), localObject);
    this.jvv.put(Integer.valueOf(50), localObject);
    AppMethodBeat.o(17453);
  }

  public static c aTz()
  {
    AppMethodBeat.i(17451);
    if (jvu == null)
    {
      localc = new c();
      jvu = localc;
      a(localc);
    }
    c localc = jvu;
    AppMethodBeat.o(17451);
    return localc;
  }

  public final void aSp()
  {
    jvu = null;
  }

  public final l rq(int paramInt)
  {
    AppMethodBeat.i(17452);
    if (this.jvv == null)
      aTA();
    l locall = (l)this.jvv.get(Integer.valueOf(paramInt));
    AppMethodBeat.o(17452);
    return locall;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.f.c
 * JD-Core Version:    0.6.2
 */