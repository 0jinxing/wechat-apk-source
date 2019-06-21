package com.tencent.mm.ui.chatting.m;

import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.a.e;
import java.lang.ref.WeakReference;
import java.util.Map;
import junit.framework.Assert;

public abstract class a
{
  WeakReference<a.b> zaF = null;

  public a(a.b paramb)
  {
    Assert.assertNotNull(paramb);
    this.zaF = new WeakReference(paramb);
    ((e)g.K(e.class)).a(dHh(), new a.1(this));
  }

  abstract CharSequence b(Map<String, String> paramMap, String paramString, Bundle paramBundle, WeakReference<Context> paramWeakReference);

  abstract String dHh();

  public final void release()
  {
    ((e)g.K(e.class)).QB(dHh());
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.m.a
 * JD-Core Version:    0.6.2
 */