package com.tencent.mm.plugin.appbrand.widget.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import com.tencent.mm.plugin.appbrand.jsapi.base.e;

@SuppressLint({"AppCompatCustomView"})
class f extends ImageView
  implements e
{
  private boolean ikj;

  public f(Context paramContext)
  {
    super(paramContext);
  }

  public boolean aCH()
  {
    return this.ikj;
  }

  public void setInterceptEvent(boolean paramBoolean)
  {
    this.ikj = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.c.f
 * JD-Core Version:    0.6.2
 */