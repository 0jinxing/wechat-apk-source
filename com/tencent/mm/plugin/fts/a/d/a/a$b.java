package com.tencent.mm.plugin.fts.a.d.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.n;

public abstract class a$b
{
  public a$b(a parama)
  {
  }

  protected static void a(String paramString, l paraml)
  {
    ((n)g.M(n.class)).updateTopHitsRank(paramString, paraml, 0);
  }

  public abstract View a(Context paramContext, ViewGroup paramViewGroup);

  public abstract void a(Context paramContext, a.a parama, a parama1, Object[] paramArrayOfObject);

  public abstract boolean a(Context paramContext, a parama);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.d.a.a.b
 * JD-Core Version:    0.6.2
 */