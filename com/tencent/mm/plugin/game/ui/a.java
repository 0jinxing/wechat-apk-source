package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.BaseAdapter;
import com.tencent.mm.a.f;
import com.tencent.mm.memory.a.b;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public abstract class a<T> extends BaseAdapter
{
  private static int nec = 500;
  protected Context mContext;
  protected LinkedList<T> mYj;
  private a.a ndZ;
  protected boolean nea = false;
  private f<String, Bitmap> neb;
  private ap ned = new ap(new a.2(this), false);
  private final k.a nee = new a.3(this);

  public a(Context paramContext)
  {
    this.mContext = paramContext;
    this.mYj = new LinkedList();
    this.neb = new b(20, getClass());
    com.tencent.mm.plugin.s.a.bYJ().c(this.nee);
  }

  protected final Bitmap Oi(String paramString)
  {
    Object localObject;
    if (bo.isNullOrNil(paramString))
      localObject = null;
    while (true)
    {
      return localObject;
      Bitmap localBitmap;
      if (this.neb.aj(paramString))
      {
        localBitmap = (Bitmap)this.neb.get(paramString);
        if (localBitmap != null)
        {
          localObject = localBitmap;
          if (!localBitmap.isRecycled())
            continue;
        }
      }
      else
      {
        localBitmap = g.b(paramString, 1, com.tencent.mm.bz.a.getDensity(this.mContext));
        localObject = localBitmap;
        if (localBitmap != null)
        {
          localObject = localBitmap;
          if (!localBitmap.isRecycled())
          {
            this.neb.k(paramString, localBitmap);
            localObject = localBitmap;
          }
        }
      }
    }
  }

  public void Y(LinkedList<T> paramLinkedList)
  {
    if (paramLinkedList == null)
      if (this.ndZ != null)
        this.mYj.size();
    while (true)
    {
      return;
      this.mYj.addAll(paramLinkedList);
      if (this.ndZ != null)
        this.mYj.size();
      super.notifyDataSetChanged();
    }
  }

  public void Z(LinkedList<T> paramLinkedList)
  {
    if (paramLinkedList == null)
      if (this.ndZ != null)
        this.mYj.size();
    while (true)
    {
      return;
      this.mYj = paramLinkedList;
      if (this.ndZ != null)
        this.mYj.size();
      super.notifyDataSetChanged();
    }
  }

  public void clear()
  {
    if (this.mYj != null)
      this.mYj.clear();
    if (this.neb != null)
      this.neb.a(new a.1(this));
    this.neb = null;
    com.tencent.mm.plugin.s.a.bYJ().d(this.nee);
  }

  public int getCount()
  {
    return this.mYj.size();
  }

  public Object getItem(int paramInt)
  {
    return this.mYj.get(paramInt);
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.a
 * JD-Core Version:    0.6.2
 */