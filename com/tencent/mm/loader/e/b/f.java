package com.tencent.mm.loader.e.b;

import android.view.View;
import com.tencent.mm.loader.h.a.a;
import java.lang.ref.WeakReference;

public final class f<T>
{
  private WeakReference<T> eQD;
  private a eQE = new a("");
  private final int eQF;
  public int height = 0;
  public int width = 0;

  public f(T paramT)
  {
    this.eQD = new WeakReference(paramT);
    if (paramT != null);
    for (this.eQF = paramT.hashCode(); ; this.eQF = hashCode())
      return;
  }

  public final View getView()
  {
    if (this.eQD != null)
    {
      localObject = this.eQD.get();
      if ((localObject == null) || (!(localObject instanceof View)));
    }
    for (Object localObject = (View)localObject; ; localObject = null)
      return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.e.b.f
 * JD-Core Version:    0.6.2
 */