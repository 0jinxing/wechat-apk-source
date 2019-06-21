package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public class MMPageControlView extends LinearLayout
{
  protected ImageView cAw;
  protected Context context;
  protected int count;
  protected Map<Integer, ImageView> map;
  protected int yvY;

  public MMPageControlView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(106701);
    this.map = new HashMap();
    this.yvY = 2130970231;
    this.context = paramContext;
    AppMethodBeat.o(106701);
  }

  public MMPageControlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106702);
    this.map = new HashMap();
    this.yvY = 2130970231;
    this.context = paramContext;
    AppMethodBeat.o(106702);
  }

  protected void Dr(int paramInt)
  {
    AppMethodBeat.i(106703);
    removeAllViews();
    if (paramInt >= this.count)
      AppMethodBeat.o(106703);
    while (true)
    {
      return;
      int i = this.count;
      int j = 0;
      if (j < i)
      {
        this.cAw = null;
        if (paramInt == j)
        {
          if (this.map.size() > j)
            this.cAw = ((ImageView)this.map.get(Integer.valueOf(j)));
          if (this.cAw == null)
          {
            this.cAw = ((ImageView)View.inflate(this.context, this.yvY, null).findViewById(2131826106));
            this.map.put(Integer.valueOf(j), this.cAw);
          }
          this.cAw.setSelected(true);
        }
        while (true)
        {
          if (j == 0)
            this.cAw.setPadding(0, 0, 0, 0);
          addView(this.cAw);
          j++;
          break;
          if (this.map.size() > j)
            this.cAw = ((ImageView)this.map.get(Integer.valueOf(j)));
          if (this.cAw == null)
          {
            this.cAw = ((ImageView)View.inflate(this.context, this.yvY, null).findViewById(2131826106));
            this.map.put(Integer.valueOf(j), this.cAw);
          }
          this.cAw.setSelected(false);
        }
      }
      AppMethodBeat.o(106703);
    }
  }

  public final void hj(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106699);
    this.count = paramInt1;
    Dr(paramInt2);
    AppMethodBeat.o(106699);
  }

  public void setIndicatorLayoutRes(int paramInt)
  {
    this.yvY = paramInt;
  }

  public void setPage(int paramInt)
  {
    AppMethodBeat.i(106700);
    Dr(paramInt);
    AppMethodBeat.o(106700);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMPageControlView
 * JD-Core Version:    0.6.2
 */