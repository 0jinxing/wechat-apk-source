package com.tencent.mm.ui;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.widget.BaseAdapter;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

public abstract class p<T> extends BaseAdapter
  implements k.a, n.b
{
  public Context context;
  protected int count;
  private ak mty = new ak(Looper.getMainLooper());
  protected T ylb;
  private Cursor ylc = null;
  protected Map<Integer, T> yld = null;
  protected p.a yle;
  private int ylf = 0;
  private int ylg = 0;
  private int ylh = 0;
  private Runnable yli = new p.1(this);

  public p(Context paramContext, T paramT)
  {
    this.ylb = paramT;
    this.context = paramContext;
    this.count = -1;
  }

  private void dxQ()
  {
    ab.v("MicroMsg.MListAdapter", "ashutest:: on UI, directly call resetCursor Job");
    bIf();
    KC();
    if (this.yle != null)
      this.yle.apt();
  }

  public abstract void KC();

  protected abstract void KD();

  public abstract T a(T paramT, Cursor paramCursor);

  public void a(int paramInt, n paramn, Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof String)))
      ab.d("MicroMsg.MListAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
    while (true)
    {
      return;
      a((String)paramObject, null);
    }
  }

  public final void a(p.a parama)
  {
    this.yle = parama;
  }

  public void a(String paramString, m paramm)
  {
    dxQ();
  }

  protected int bFs()
  {
    return 0;
  }

  protected T bFt()
  {
    return this.ylb;
  }

  public void bIf()
  {
    if (this.yld != null)
      this.yld.clear();
    if (this.ylc != null)
      this.ylc.close();
    this.count = -1;
  }

  public final void dww()
  {
    this.yle = null;
  }

  public int getCount()
  {
    if (this.count < 0)
      this.count = getCursor().getCount();
    return this.count + bFs();
  }

  protected final Cursor getCursor()
  {
    if ((this.ylc == null) || (this.ylc.isClosed()))
    {
      KD();
      Assert.assertNotNull(this.ylc);
    }
    return this.ylc;
  }

  public T getItem(int paramInt)
  {
    Object localObject1;
    if (wK(paramInt))
      localObject1 = bFt();
    while (true)
    {
      return localObject1;
      if (this.yld != null)
      {
        Object localObject2 = this.yld.get(Integer.valueOf(paramInt));
        localObject1 = localObject2;
        if (localObject2 != null);
      }
      else if ((paramInt < 0) || (!getCursor().moveToPosition(paramInt)))
      {
        localObject1 = null;
      }
      else if (this.yld == null)
      {
        localObject1 = a(this.ylb, getCursor());
      }
      else
      {
        localObject1 = a(null, getCursor());
        this.yld.put(Integer.valueOf(paramInt), localObject1);
      }
    }
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public final int getRealCount()
  {
    if (this.count < 0)
      this.count = getCursor().getCount();
    return this.count;
  }

  public final void pN(boolean paramBoolean)
  {
    if (!paramBoolean)
      if (this.yld != null)
      {
        this.yld.clear();
        this.yld = null;
      }
    while (true)
    {
      return;
      if (this.yld == null)
        this.yld = new HashMap();
    }
  }

  public final void setCursor(Cursor paramCursor)
  {
    this.ylc = paramCursor;
    this.count = -1;
  }

  public boolean wK(int paramInt)
  {
    if ((paramInt >= this.count) && (paramInt < this.count + bFs()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.p
 * JD-Core Version:    0.6.2
 */