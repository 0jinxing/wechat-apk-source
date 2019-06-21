package com.tencent.toybrick.c;

import android.os.Handler;
import android.view.View;
import com.tencent.toybrick.f.a;
import com.tencent.toybrick.g.b.a;
import com.tencent.toybrick.ui.BaseToyUI;

public abstract class f<S extends f, T extends a>
{
  BaseToyUI AGA;
  public Runnable AGB;
  public String AGC;
  public b.a<S> AGD;
  public boolean isVisible;
  public Handler mMainHandler;

  public abstract void a(T paramT);

  public abstract T fy(View paramView);

  public abstract int getLayoutResource();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.c.f
 * JD-Core Version:    0.6.2
 */