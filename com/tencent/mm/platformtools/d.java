package com.tencent.mm.platformtools;

import android.app.Activity;
import com.tencent.mm.ai.f;
import java.util.HashSet;
import java.util.Set;

public abstract class d
  implements f
{
  public Activity activity;
  Set<Integer> ggX = new HashSet();

  public d(Activity paramActivity)
  {
    this.activity = paramActivity;
  }

  public final boolean a(ag paramag)
  {
    boolean bool = false;
    if (paramag.action == 0);
    while (true)
    {
      return bool;
      switch (paramag.action)
      {
      case 3:
      default:
        break;
      case 1:
        bool = b(paramag);
        break;
      case 2:
        bool = c(paramag);
        break;
      case 4:
        bool = d(paramag);
        break;
      case 5:
        bool = e(paramag);
      }
    }
  }

  public abstract boolean b(ag paramag);

  public abstract boolean c(ag paramag);

  public abstract boolean d(ag paramag);

  public abstract boolean e(ag paramag);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.d
 * JD-Core Version:    0.6.2
 */