package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.b.a.a;
import android.support.v4.b.a.b;
import android.view.Menu;
import android.view.MenuItem;

public final class q
{
  public static Menu a(Context paramContext, a parama)
  {
    return new r(paramContext, parama);
  }

  public static MenuItem a(Context paramContext, b paramb)
  {
    if (Build.VERSION.SDK_INT >= 16);
    for (paramContext = new l(paramContext, paramb); ; paramContext = new k(paramContext, paramb))
      return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.q
 * JD-Core Version:    0.6.2
 */