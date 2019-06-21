package com.tencent.mm.plugin.gif;

import android.graphics.drawable.Drawable;
import com.tencent.mm.ui.e.b.a;

public abstract class b extends Drawable
  implements a
{
  public abstract void pause();

  public abstract void recycle();

  public abstract void reset();

  public abstract void resume();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.b
 * JD-Core Version:    0.6.2
 */