package com.tencent.matrix.b;

import android.content.Context;

public class a
  implements c
{
  private final Context context;

  public a(Context paramContext)
  {
    this.context = paramContext;
  }

  public void a(com.tencent.matrix.c.b paramb)
  {
    com.tencent.matrix.d.c.i("Matrix.DefaultPluginListener", "report issue content: %s", new Object[] { paramb });
  }

  public final void b(b paramb)
  {
    com.tencent.matrix.d.c.i("Matrix.DefaultPluginListener", "%s plugin is inited", new Object[] { paramb.getTag() });
  }

  public final void c(b paramb)
  {
    com.tencent.matrix.d.c.i("Matrix.DefaultPluginListener", "%s plugin is started", new Object[] { paramb.getTag() });
  }

  public final void d(b paramb)
  {
    com.tencent.matrix.d.c.i("Matrix.DefaultPluginListener", "%s plugin is stopped", new Object[] { paramb.getTag() });
  }

  public final void e(b paramb)
  {
    com.tencent.matrix.d.c.i("Matrix.DefaultPluginListener", "%s plugin is destroyed", new Object[] { paramb.getTag() });
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.b.a
 * JD-Core Version:    0.6.2
 */