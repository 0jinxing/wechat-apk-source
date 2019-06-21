package com.tencent.mm.plugin.luggage.natives.component.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class LuImageView extends AppCompatImageView
{
  public LuImageView(Context paramContext)
  {
    super(paramContext);
  }

  public LuImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public LuImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(116891);
    Object localObject = getBackground();
    if ((localObject instanceof a))
    {
      localObject = (a)localObject;
      if (((a)localObject).oiI == null)
      {
        ((a)localObject).oiI = ((a)localObject).bMS();
        if (((a)localObject).oiI == null)
          localObject = null;
      }
    }
    while (true)
    {
      if (localObject != null)
      {
        paramCanvas.save();
        paramCanvas.clipPath((Path)localObject);
      }
      super.onDraw(paramCanvas);
      if (localObject != null)
        paramCanvas.restore();
      AppMethodBeat.o(116891);
      return;
      localObject = ((a)localObject).j(((a)localObject).oiI);
      continue;
      localObject = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luggage.natives.component.widget.LuImageView
 * JD-Core Version:    0.6.2
 */