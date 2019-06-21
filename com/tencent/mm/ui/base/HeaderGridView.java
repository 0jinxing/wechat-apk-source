package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObservable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class HeaderGridView extends GridView
{
  private ArrayList<HeaderGridView.a> oiP;

  public HeaderGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106303);
    this.oiP = new ArrayList();
    super.setClipChildren(false);
    AppMethodBeat.o(106303);
  }

  public HeaderGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106304);
    this.oiP = new ArrayList();
    super.setClipChildren(false);
    AppMethodBeat.o(106304);
  }

  public final void eE(View paramView)
  {
    AppMethodBeat.i(106306);
    ListAdapter localListAdapter = getAdapter();
    if ((localListAdapter != null) && (!(localListAdapter instanceof HeaderGridView.c)))
    {
      paramView = new IllegalStateException("Cannot add header view to grid -- setAdapter has already been called.");
      AppMethodBeat.o(106306);
      throw paramView;
    }
    HeaderGridView.a locala = new HeaderGridView.a((byte)0);
    HeaderGridView.b localb = new HeaderGridView.b(this, getContext());
    localb.addView(paramView);
    locala.view = paramView;
    locala.oiV = localb;
    locala.data = null;
    locala.isSelectable = false;
    this.oiP.add(locala);
    if (localListAdapter != null)
      ((HeaderGridView.c)localListAdapter).mDataSetObservable.notifyChanged();
    AppMethodBeat.o(106306);
  }

  public int getHeaderViewCount()
  {
    AppMethodBeat.i(106307);
    int i = this.oiP.size();
    AppMethodBeat.o(106307);
    return i;
  }

  @TargetApi(11)
  public int getNumColumns()
  {
    int i = 1;
    AppMethodBeat.i(106305);
    if (Build.VERSION.SDK_INT >= 11)
    {
      i = super.getNumColumns();
      AppMethodBeat.o(106305);
    }
    while (true)
    {
      return i;
      try
      {
        Field localField = getClass().getSuperclass().getDeclaredField("mNumColumns");
        localField.setAccessible(true);
        int j = localField.getInt(this);
        i = j;
        AppMethodBeat.o(106305);
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(106305);
      }
    }
  }

  public final void setAdapter$159aa965(ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(106308);
    if (this.oiP.size() > 0)
    {
      paramListAdapter = new HeaderGridView.c(this.oiP, paramListAdapter);
      if (paramListAdapter.mNumColumns != 5)
      {
        paramListAdapter.mNumColumns = 5;
        paramListAdapter.mDataSetObservable.notifyChanged();
      }
      super.setAdapter(paramListAdapter);
      AppMethodBeat.o(106308);
    }
    while (true)
    {
      return;
      super.setAdapter(paramListAdapter);
      AppMethodBeat.o(106308);
    }
  }

  public void setClipChildren(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.HeaderGridView
 * JD-Core Version:    0.6.2
 */