package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPageControlView;
import java.util.Map;

public class AdLandingControlView extends MMPageControlView
{
  public AdLandingControlView(Context paramContext)
  {
    super(paramContext);
  }

  public AdLandingControlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void Dr(int paramInt)
  {
    AppMethodBeat.i(37368);
    removeAllViews();
    if (paramInt >= this.count)
      AppMethodBeat.o(37368);
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
      AppMethodBeat.o(37368);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingControlView
 * JD-Core Version:    0.6.2
 */