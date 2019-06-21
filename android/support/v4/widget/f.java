package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

public abstract class f extends BaseAdapter
  implements g.a, Filterable
{
  protected boolean PG = false;
  protected boolean PH = true;
  protected Cursor PI = null;
  protected int PJ;
  protected f.a PK;
  protected DataSetObserver PL;
  protected g PM;
  protected FilterQueryProvider PN;
  protected Context mContext;

  public f(Context paramContext)
  {
    this.mContext = paramContext;
    this.PJ = -1;
    this.PK = new f.a(this);
    this.PL = new f.b(this);
  }

  public abstract void a(View paramView, Cursor paramCursor);

  public void changeCursor(Cursor paramCursor)
  {
    if (paramCursor == this.PI)
      paramCursor = null;
    while (true)
    {
      if (paramCursor != null)
        paramCursor.close();
      return;
      Cursor localCursor = this.PI;
      if (localCursor != null)
      {
        if (this.PK != null)
          localCursor.unregisterContentObserver(this.PK);
        if (this.PL != null)
          localCursor.unregisterDataSetObserver(this.PL);
      }
      this.PI = paramCursor;
      if (paramCursor != null)
      {
        if (this.PK != null)
          paramCursor.registerContentObserver(this.PK);
        if (this.PL != null)
          paramCursor.registerDataSetObserver(this.PL);
        this.PJ = paramCursor.getColumnIndexOrThrow("_id");
        this.PG = true;
        notifyDataSetChanged();
        paramCursor = localCursor;
      }
      else
      {
        this.PJ = -1;
        this.PG = false;
        notifyDataSetInvalidated();
        paramCursor = localCursor;
      }
    }
  }

  public CharSequence convertToString(Cursor paramCursor)
  {
    if (paramCursor == null);
    for (paramCursor = ""; ; paramCursor = paramCursor.toString())
      return paramCursor;
  }

  public int getCount()
  {
    if ((this.PG) && (this.PI != null));
    for (int i = this.PI.getCount(); ; i = 0)
      return i;
  }

  public final Cursor getCursor()
  {
    return this.PI;
  }

  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    if (this.PG)
    {
      this.PI.moveToPosition(paramInt);
      localView = paramView;
      if (paramView == null)
        localView = newDropDownView(this.mContext, this.PI, paramViewGroup);
      a(localView, this.PI);
    }
    while (true)
    {
      return localView;
      localView = null;
    }
  }

  public Filter getFilter()
  {
    if (this.PM == null)
      this.PM = new g(this);
    return this.PM;
  }

  public Object getItem(int paramInt)
  {
    if ((this.PG) && (this.PI != null))
      this.PI.moveToPosition(paramInt);
    for (Cursor localCursor = this.PI; ; localCursor = null)
      return localCursor;
  }

  public long getItemId(int paramInt)
  {
    long l1 = 0L;
    long l2 = l1;
    if (this.PG)
    {
      l2 = l1;
      if (this.PI != null)
      {
        l2 = l1;
        if (this.PI.moveToPosition(paramInt))
          l2 = this.PI.getLong(this.PJ);
      }
    }
    return l2;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (!this.PG)
      throw new IllegalStateException("this should only be called when the cursor is valid");
    if (!this.PI.moveToPosition(paramInt))
      throw new IllegalStateException("couldn't move cursor to position ".concat(String.valueOf(paramInt)));
    View localView = paramView;
    if (paramView == null)
      localView = newView(this.mContext, this.PI, paramViewGroup);
    a(localView, this.PI);
    return localView;
  }

  public boolean hasStableIds()
  {
    return true;
  }

  public View newDropDownView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return newView(paramContext, paramCursor, paramViewGroup);
  }

  public abstract View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);

  protected final void onContentChanged()
  {
    if ((this.PH) && (this.PI != null) && (!this.PI.isClosed()))
      this.PG = this.PI.requery();
  }

  public Cursor runQueryOnBackgroundThread(CharSequence paramCharSequence)
  {
    if (this.PN != null);
    for (paramCharSequence = this.PN.runQuery(paramCharSequence); ; paramCharSequence = this.PI)
      return paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.f
 * JD-Core Version:    0.6.2
 */