package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class o extends f
{
  private int Rt;
  private int Ru;
  private LayoutInflater mInflater;

  @Deprecated
  public o(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.Ru = paramInt;
    this.Rt = paramInt;
    this.mInflater = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }

  public final View newDropDownView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.mInflater.inflate(this.Ru, paramViewGroup, false);
  }

  public View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.mInflater.inflate(this.Rt, paramViewGroup, false);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.o
 * JD-Core Version:    0.6.2
 */