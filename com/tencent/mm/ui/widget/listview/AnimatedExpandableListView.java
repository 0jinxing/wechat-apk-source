package com.tencent.mm.ui.widget.listview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AnimatedExpandableListView extends ExpandableListView
{
  private static final String TAG;
  private AnimatedExpandableListView.a zQT;

  static
  {
    AppMethodBeat.i(112723);
    TAG = AnimatedExpandableListView.a.class.getSimpleName();
    AppMethodBeat.o(112723);
  }

  public AnimatedExpandableListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AnimatedExpandableListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private int getAnimationDuration()
  {
    return 150;
  }

  @SuppressLint({"NewApi"})
  public final boolean Qi(int paramInt)
  {
    AppMethodBeat.i(112720);
    int i = getFlatListPosition(getPackedPositionForGroup(paramInt));
    boolean bool;
    if (i != -1)
    {
      i -= getFirstVisiblePosition();
      if ((i < getChildCount()) && (getChildAt(i).getBottom() >= getBottom()))
      {
        this.zQT.Ql(paramInt);
        bool = expandGroup(paramInt);
        AppMethodBeat.o(112720);
      }
    }
    while (true)
    {
      return bool;
      AnimatedExpandableListView.a.a(this.zQT, paramInt);
      bool = expandGroup(paramInt);
      AppMethodBeat.o(112720);
    }
  }

  public final boolean Qj(int paramInt)
  {
    AppMethodBeat.i(112721);
    int i = getFlatListPosition(getPackedPositionForGroup(paramInt));
    boolean bool;
    if (i != -1)
    {
      i -= getFirstVisiblePosition();
      if ((i >= 0) && (i < getChildCount()))
      {
        if (getChildAt(i).getBottom() < getBottom())
          break label80;
        bool = collapseGroup(paramInt);
        AppMethodBeat.o(112721);
      }
    }
    while (true)
    {
      return bool;
      bool = collapseGroup(paramInt);
      AppMethodBeat.o(112721);
      continue;
      label80: long l = getExpandableListPosition(getFirstVisiblePosition());
      i = getPackedPositionChild(l);
      int j = getPackedPositionGroup(l);
      if ((i == -1) || (j != paramInt))
        i = 0;
      AnimatedExpandableListView.a.a(this.zQT, paramInt, i);
      this.zQT.notifyDataSetChanged();
      bool = isGroupExpanded(paramInt);
      AppMethodBeat.o(112721);
    }
  }

  public void setAdapter(ExpandableListAdapter paramExpandableListAdapter)
  {
    AppMethodBeat.i(112719);
    super.setAdapter(paramExpandableListAdapter);
    if ((paramExpandableListAdapter instanceof AnimatedExpandableListView.a))
    {
      this.zQT = ((AnimatedExpandableListView.a)paramExpandableListAdapter);
      AnimatedExpandableListView.a.a(this.zQT, this);
      AppMethodBeat.o(112719);
      return;
    }
    paramExpandableListAdapter = new ClassCastException(paramExpandableListAdapter.toString() + " must implement AnimatedExpandableListAdapter");
    AppMethodBeat.o(112719);
    throw paramExpandableListAdapter;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.listview.AnimatedExpandableListView
 * JD-Core Version:    0.6.2
 */