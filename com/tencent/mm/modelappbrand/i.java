package com.tencent.mm.modelappbrand;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.c.a;
import com.tencent.mm.modelappbrand.a.b.e;
import com.tencent.mm.modelappbrand.a.b.f;

public abstract interface i extends a
{
  public abstract b.e a(int paramInt1, int paramInt2, a parama);

  public abstract void a(String paramString, View paramView);

  public abstract boolean a(String paramString, View paramView, Bundle paramBundle);

  public abstract boolean a(String paramString, View paramView, Bundle paramBundle, b paramb);

  public abstract b.f abB();

  public abstract b.e cq(int paramInt1, int paramInt2);

  public abstract View d(Context paramContext, Bundle paramBundle);

  public abstract void d(int paramInt, Bundle paramBundle);

  public static enum a
  {
    static
    {
      AppMethodBeat.i(51133);
      fpF = new a("DECODE_TYPE_DEFAULT", 0);
      fpG = new a("DECODE_TYPE_ORIGIN", 1);
      fpH = new a[] { fpF, fpG };
      AppMethodBeat.o(51133);
    }
  }

  public static abstract interface b
  {
    public abstract void kQ(int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.i
 * JD-Core Version:    0.6.2
 */