package com.tencent.mm.pluginsdk.c;

import com.tencent.mm.g.a.jp;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import java.util.ArrayList;

public abstract class a extends c<jp>
{
  protected ArrayList<String> vaJ = new ArrayList(3);

  public a()
  {
    this.xxI = jp.class.getName().hashCode();
  }

  public static void a(String paramString, a parama)
  {
    if (!parama.vaJ.contains(paramString))
      parama.vaJ.add(paramString);
    com.tencent.mm.sdk.b.a.xxA.c(parama);
    e.ait(paramString);
  }

  public static void b(String paramString, a parama)
  {
    e.aiu(paramString);
    com.tencent.mm.sdk.b.a.xxA.d(parama);
    if (parama.vaJ.contains(paramString))
      parama.vaJ.remove(paramString);
  }

  public abstract void j(b paramb);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.c.a
 * JD-Core Version:    0.6.2
 */