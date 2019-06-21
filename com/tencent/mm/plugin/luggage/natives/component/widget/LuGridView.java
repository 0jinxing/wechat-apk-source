package com.tencent.mm.plugin.luggage.natives.component.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.GridView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class LuGridView extends GridView
{
  private ArrayList<Object> oiP;

  public LuGridView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(116846);
    this.oiP = new ArrayList();
    super.setClipChildren(false);
    AppMethodBeat.o(116846);
  }

  public LuGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(116847);
    this.oiP = new ArrayList();
    super.setClipChildren(false);
    AppMethodBeat.o(116847);
  }

  public LuGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(116848);
    this.oiP = new ArrayList();
    super.setClipChildren(false);
    AppMethodBeat.o(116848);
  }

  public int getHeaderViewCount()
  {
    AppMethodBeat.i(116850);
    int i = this.oiP.size();
    AppMethodBeat.o(116850);
    return i;
  }

  @TargetApi(11)
  public int getNumColumns()
  {
    int i = 1;
    AppMethodBeat.i(116849);
    int j;
    if (Build.VERSION.SDK_INT >= 11)
    {
      j = super.getNumColumns();
      AppMethodBeat.o(116849);
    }
    while (true)
    {
      return j;
      try
      {
        Field localField = getClass().getSuperclass().getDeclaredField("mNumColumns");
        localField.setAccessible(true);
        j = localField.getInt(this);
        AppMethodBeat.o(116849);
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(116849);
        j = i;
      }
    }
  }

  public void setClipChildren(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luggage.natives.component.widget.LuGridView
 * JD-Core Version:    0.6.2
 */