package com.tencent.mm.plugin.brandservice.a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.tencent.mm.af.o;
import com.tencent.mm.af.p;
import com.tencent.mm.aj.d;
import com.tencent.mm.plugin.brandservice.ui.timeline.i;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.q;

public abstract interface a extends com.tencent.mm.kernel.c.a
{
  public abstract void a(int paramInt, Context paramContext, String paramString1, String paramString2, long paramLong1, long paramLong2);

  public abstract void a(long paramLong, int paramInt, Context paramContext, Activity paramActivity, bi parambi);

  public abstract void a(View paramView, long paramLong, String paramString1, String paramString2, int paramInt);

  public abstract void a(p paramp, q paramq, int paramInt1, o paramo, View paramView, boolean paramBoolean, int paramInt2, i parami);

  public abstract void a(bi parambi, Activity paramActivity);

  public abstract void a(bi parambi, Context paramContext);

  public abstract void b(d paramd, Activity paramActivity, ad paramad);

  public abstract long cY(View paramView);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.a.a
 * JD-Core Version:    0.6.2
 */