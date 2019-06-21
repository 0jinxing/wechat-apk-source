package com.tencent.mm.plugin.fts.a.d;

import android.content.Context;
import android.view.View;
import com.tencent.mm.plugin.fts.a.d.a.a;
import java.util.List;

public abstract class b
  implements e
{
  protected Context context;
  protected e.b mEZ;
  protected int mFa;

  public b(Context paramContext, e.b paramb, int paramInt)
  {
    this.context = paramContext;
    this.mEZ = paramb;
    this.mFa = paramInt;
  }

  protected static boolean bX(List<? extends Object> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected static <T> List<T> bY(List<T> paramList)
  {
    Object localObject = paramList;
    if (bX(paramList))
    {
      localObject = paramList;
      if (paramList.size() > 3)
        localObject = paramList.subList(0, 3);
    }
    return localObject;
  }

  public boolean a(View paramView, a parama, boolean paramBoolean)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.d.b
 * JD-Core Version:    0.6.2
 */