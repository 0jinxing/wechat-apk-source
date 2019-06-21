package com.tencent.mm.pluginsdk.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.a.b;
import java.util.concurrent.ConcurrentHashMap;

public final class d
{
  public static d vdw;
  private boolean nDl;
  private ConcurrentHashMap<String, Integer> vdt;
  private ConcurrentHashMap<String, Long> vdu;
  private String vdv;

  static
  {
    AppMethodBeat.i(79452);
    vdw = new d("default");
    AppMethodBeat.o(79452);
  }

  public d(String paramString)
  {
    AppMethodBeat.i(79450);
    this.vdt = new ConcurrentHashMap();
    this.vdu = new ConcurrentHashMap();
    this.vdv = "";
    this.nDl = false;
    if (b.dnO())
      this.nDl = true;
    this.vdv = paramString;
    AppMethodBeat.o(79450);
  }

  public final void aiV(String paramString)
  {
    AppMethodBeat.i(79451);
    if (!this.nDl)
    {
      AppMethodBeat.o(79451);
      return;
    }
    int i;
    if (this.vdt.containsKey(paramString))
    {
      i = ((Integer)this.vdt.get(paramString)).intValue();
      label44: i++;
      this.vdt.put(paramString, Integer.valueOf(i));
      if (!this.vdu.containsKey(paramString))
        break label172;
    }
    label172: for (long l = ((Long)this.vdu.get(paramString)).longValue(); ; l = 0L)
    {
      if (System.currentTimeMillis() - l > 1000L)
      {
        new StringBuilder().append(this.vdv).append("user get fps ").append(i).append(" fpswraper: ").append(paramString);
        this.vdt.put(paramString, Integer.valueOf(0));
        this.vdu.put(paramString, Long.valueOf(System.currentTimeMillis()));
      }
      AppMethodBeat.o(79451);
      break;
      i = 0;
      break label44;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.f.d
 * JD-Core Version:    0.6.2
 */