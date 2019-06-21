package com.tencent.mm.plugin.forcenotify.a;

import android.content.Context;
import com.tencent.mm.kernel.c.a;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.messenger.foundation.a.s;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.e.j;

public abstract interface b extends a, o, s<cm>
{
  public abstract void Mn(String paramString);

  public abstract long Mo(String paramString);

  public abstract boolean Mp(String paramString);

  public abstract void am(String paramString, int paramInt);

  public abstract boolean bxU();

  public abstract j bxV();

  public abstract void dS(Context paramContext);

  public abstract boolean hasError();

  public abstract void hx(boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.a.b
 * JD-Core Version:    0.6.2
 */