package com.tencent.mm.pluginsdk.c;

import com.tencent.mm.g.a.kp;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import java.util.ArrayList;

public abstract class b extends c<kp>
{
  protected ArrayList<String> vaJ = new ArrayList(3);

  public b()
  {
    super(0);
    this.xxI = kp.class.getName().hashCode();
  }

  public static void a(String paramString, b paramb)
  {
    if (!paramb.vaJ.contains(paramString))
      paramb.vaJ.add(paramString);
    a.xxA.c(paramb);
    e.ait(paramString);
  }

  public static void b(String paramString, b paramb)
  {
    e.aiu(paramString);
    a.xxA.d(paramb);
    if (paramb.vaJ.contains(paramString))
      paramb.vaJ.remove(paramString);
  }

  public abstract void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.sdk.b.b paramb);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.c.b
 * JD-Core Version:    0.6.2
 */