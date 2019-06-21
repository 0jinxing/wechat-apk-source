package com.tencent.mm.plugin.choosemsgfile.b.b;

import android.content.Context;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.choosemsgfile.b.c.g;
import com.tencent.mm.storage.bi;

public abstract class a<T extends RecyclerView.v>
{
  protected int Lp;
  protected int alq;
  public bi kua;
  g kuj;
  protected int kuk = 0;

  public a(g paramg)
  {
    this.kuj = paramg;
  }

  public a(g paramg, bi parambi)
  {
    this.kuj = paramg;
    this.kua = parambi;
  }

  public void T(T paramT)
  {
  }

  public void a(T paramT, int paramInt)
  {
  }

  public void a(View paramView, a parama)
  {
  }

  public final void a(boolean paramBoolean, a parama, T paramT)
  {
    this.kuj.a(paramBoolean, parama, paramT);
  }

  protected final com.tencent.mm.plugin.choosemsgfile.b.d.a bfn()
  {
    return this.kuj.bfy().bfn();
  }

  public String bfo()
  {
    return "";
  }

  public int bfp()
  {
    return 0;
  }

  public final void bfq()
  {
    try
    {
      this.kuk = 1;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void bfr()
  {
    try
    {
      this.kuk = 3;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void bfs()
  {
    try
    {
      this.kuk = 4;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void bft()
  {
    try
    {
      this.kuk = 5;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void bfu()
  {
    try
    {
      this.kuk = 0;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void dM(int paramInt1, int paramInt2)
  {
    try
    {
      this.kuk = 2;
      this.Lp = paramInt1;
      this.alq = paramInt2;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public boolean equals(Object paramObject)
  {
    boolean bool;
    if ((this.kua != null) && ((paramObject instanceof bi)) && (paramObject != null))
      if (this.kua.field_msgId == ((bi)paramObject).field_msgId)
        bool = true;
    while (true)
    {
      return bool;
      bool = false;
      continue;
      bool = super.equals(paramObject);
    }
  }

  protected final Context getContext()
  {
    return this.kuj.bfy().getContext();
  }

  public String getFileName()
  {
    return "";
  }

  public long getTimeStamp()
  {
    return this.kua.field_createTime;
  }

  public abstract int getType();

  public final boolean isEnable()
  {
    if ((!this.kuj.bfy().bfn().kq()) || (this.kuj.bfy().bfn().gW(this.kua.field_msgId)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean kq()
  {
    if ((this.kuk == 4) || (this.kuk == 5));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public String toString()
  {
    return "MsgItem{msgInfo=" + this.kua.field_msgId + '}';
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.b.a
 * JD-Core Version:    0.6.2
 */