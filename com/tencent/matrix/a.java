package com.tencent.matrix;

import android.app.Application;
import com.tencent.matrix.b.b;
import com.tencent.matrix.d.c.a;
import java.util.HashSet;
import java.util.Iterator;

public class a
{
  private static volatile a bUB;
  public final Application application;
  public final HashSet<b> bUC;
  private final com.tencent.matrix.b.c pluginListener;

  private a(Application paramApplication, com.tencent.matrix.b.c paramc, HashSet<b> paramHashSet)
  {
    this.application = paramApplication;
    this.pluginListener = paramc;
    this.bUC = paramHashSet;
    paramApplication = paramHashSet.iterator();
    while (paramApplication.hasNext())
    {
      paramc = (b)paramApplication.next();
      paramc.init(this.application, this.pluginListener);
      this.pluginListener.b(paramc);
    }
  }

  public static a a(a parama)
  {
    try
    {
      if (bUB == null)
        bUB = parama;
      while (true)
      {
        return bUB;
        com.tencent.matrix.d.c.e("Matrix.Matrix", "Matrix instance is already set. this invoking will be ignored", new Object[0]);
      }
    }
    finally
    {
    }
    throw parama;
  }

  public static void a(c.a parama)
  {
    com.tencent.matrix.d.c.b(parama);
  }

  public static boolean isInstalled()
  {
    if (bUB != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static a yK()
  {
    if (bUB == null)
      throw new RuntimeException("you must init Matrix sdk first");
    return bUB;
  }

  public final <T extends b> T F(Class<T> paramClass)
  {
    String str = paramClass.getName();
    Iterator localIterator = this.bUC.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      paramClass = (b)localIterator.next();
    }
    while (!paramClass.getClass().getName().equals(str));
    while (true)
    {
      return paramClass;
      paramClass = null;
    }
  }

  public static final class a
  {
    public final Application application;
    public HashSet<b> bUC = new HashSet();
    public com.tencent.matrix.b.c pluginListener;

    public a(Application paramApplication)
    {
      if (paramApplication == null)
        throw new RuntimeException("matrix init, application is null");
      this.application = paramApplication;
    }

    public final a a(b paramb)
    {
      String str = paramb.getTag();
      Iterator localIterator = this.bUC.iterator();
      while (localIterator.hasNext())
        if (str.equals(((b)localIterator.next()).getTag()))
          throw new RuntimeException(String.format("plugin with tag %s is already exist", new Object[] { str }));
      this.bUC.add(paramb);
      return this;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.a
 * JD-Core Version:    0.6.2
 */