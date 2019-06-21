package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public class c
{
  public final Object Oo;

  public c()
  {
    if (Build.VERSION.SDK_INT >= 19)
      this.Oo = new b(this);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 16)
        this.Oo = new a(this);
      else
        this.Oo = null;
    }
  }

  public c(Object paramObject)
  {
    this.Oo = paramObject;
  }

  public b aL(int paramInt)
  {
    return null;
  }

  public b aM(int paramInt)
  {
    return null;
  }

  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return false;
  }

  static class a extends AccessibilityNodeProvider
  {
    final c Op;

    a(c paramc)
    {
      this.Op = paramc;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
    {
      Object localObject = this.Op.aL(paramInt);
      if (localObject == null);
      for (localObject = null; ; localObject = ((b)localObject).NG)
        return localObject;
    }

    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String paramString, int paramInt)
    {
      return null;
    }

    public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
    {
      return this.Op.performAction(paramInt1, paramInt2, paramBundle);
    }
  }

  static final class b extends c.a
  {
    b(c paramc)
    {
      super();
    }

    public final AccessibilityNodeInfo findFocus(int paramInt)
    {
      Object localObject = this.Op.aM(paramInt);
      if (localObject == null);
      for (localObject = null; ; localObject = ((b)localObject).NG)
        return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.c
 * JD-Core Version:    0.6.2
 */