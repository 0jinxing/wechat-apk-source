package android.support.v4.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;

public final class ae
  implements Iterable<Intent>
{
  private static final c Ge;
  public final ArrayList<Intent> Gf = new ArrayList();
  public final Context Gg;

  static
  {
    if (Build.VERSION.SDK_INT >= 16);
    for (Ge = new b(); ; Ge = new c())
      return;
  }

  private ae(Context paramContext)
  {
    this.Gg = paramContext;
  }

  public static ae N(Context paramContext)
  {
    return new ae(paramContext);
  }

  public final ae a(ComponentName paramComponentName)
  {
    int i = this.Gf.size();
    try
    {
      for (paramComponentName = t.a(this.Gg, paramComponentName); paramComponentName != null; paramComponentName = t.a(this.Gg, paramComponentName.getComponent()))
        this.Gf.add(i, paramComponentName);
    }
    catch (PackageManager.NameNotFoundException paramComponentName)
    {
      throw new IllegalArgumentException(paramComponentName);
    }
    return this;
  }

  @Deprecated
  public final Iterator<Intent> iterator()
  {
    return this.Gf.iterator();
  }

  public static abstract interface a
  {
    public abstract Intent getSupportParentActivityIntent();
  }

  static final class b extends ae.c
  {
  }

  static class c
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.ae
 * JD-Core Version:    0.6.2
 */