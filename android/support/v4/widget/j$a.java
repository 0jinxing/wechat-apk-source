package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.view.a.b;
import android.support.v4.view.a.c;

final class j$a extends c
{
  j$a(j paramj)
  {
  }

  public final b aL(int paramInt)
  {
    return b.a(this.QO.obtainAccessibilityNodeInfo(paramInt));
  }

  public final b aM(int paramInt)
  {
    if (paramInt == 2)
    {
      paramInt = j.access$000(this.QO);
      if (paramInt != -2147483648)
        break label34;
    }
    label34: for (b localb = null; ; localb = aL(paramInt))
    {
      return localb;
      paramInt = j.access$100(this.QO);
      break;
    }
  }

  public final boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return this.QO.performAction(paramInt1, paramInt2, paramBundle);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.j.a
 * JD-Core Version:    0.6.2
 */