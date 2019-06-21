package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;

public class TimelineRefreshImageView extends ImageView
{
  public TimelineRefreshImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public TimelineRefreshImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public void buildDrawingCache(boolean paramBoolean)
  {
    AppMethodBeat.i(39893);
    Object localObject;
    if (paramBoolean)
      localObject = "mDrawingCache";
    try
    {
      localObject = View.class.getDeclaredField((String)localObject);
      ((Field)localObject).setAccessible(true);
      localObject = (Bitmap)((Field)localObject).get(this);
      if (localObject == null);
      for (localObject = "cache is null"; ; localObject = String.format("cache.width: %s, cache.height: %s, width: %s, height: %s", new Object[] { Integer.valueOf(((Bitmap)localObject).getWidth()), Integer.valueOf(((Bitmap)localObject).getHeight()), Integer.valueOf(getWidth()), Integer.valueOf(getHeight()) }))
      {
        ab.d("MicroMsg.TimelineRefreshImageView", (String)localObject);
        ab.d("MicroMsg.TimelineRefreshImageView", "buildDrawingCache, autoScale: %s, width: %s, height: %s, hash: %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), Integer.valueOf(hashCode()) });
        super.buildDrawingCache(paramBoolean);
        AppMethodBeat.o(39893);
        return;
        localObject = "mUnscaledDrawingCache";
        break;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TimelineRefreshImageView", localException, "", new Object[0]);
        ab.e("MicroMsg.TimelineRefreshImageView", "checkIfCanReuseDrawingCache error: %s", new Object[] { localException.getMessage() });
      }
    }
  }

  public void destroyDrawingCache()
  {
    AppMethodBeat.i(39894);
    super.destroyDrawingCache();
    ab.d("MicroMsg.TimelineRefreshImageView", "destroyDrawingCache, width: %s, height: %s, hash: %s", new Object[] { Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), Integer.valueOf(hashCode()) });
    AppMethodBeat.o(39894);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.TimelineRefreshImageView
 * JD-Core Version:    0.6.2
 */