package com.tencent.mm.plugin.messenger.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.kernel.c.a;
import java.lang.ref.WeakReference;

public abstract interface e extends a
{
  public abstract void QB(String paramString);

  public abstract void QC(String paramString);

  public abstract CharSequence QD(String paramString);

  public abstract CharSequence a(String paramString, Bundle paramBundle, WeakReference<Context> paramWeakReference);

  public abstract void a(String paramString, e.a parama);

  public abstract void a(String paramString, e.b paramb);

  public abstract void a(String paramString, e.c paramc);

  public abstract void b(String paramString, e.c paramc);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.a.e
 * JD-Core Version:    0.6.2
 */