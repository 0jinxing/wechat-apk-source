package com.tencent.mm.plugin.appbrand.config.a;

import android.database.ContentObserver;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

public final class a$1 extends ContentObserver
{
  public a$1(a parama, Handler paramHandler)
  {
    super(paramHandler);
  }

  public final boolean deliverSelfNotifications()
  {
    return true;
  }

  public final void onChange(boolean paramBoolean)
  {
    AppMethodBeat.i(86904);
    super.onChange(paramBoolean);
    ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "hy: lock orientation settings changed! request now");
    if ((a.a(this.hiI) != null) && (a.b(this.hiI).get() != null))
    {
      ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "hy: need change");
      this.hiI.a(a.b(a.a(this.hiI)), null);
      a.c(this.hiI);
    }
    AppMethodBeat.o(86904);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.a.a.1
 * JD-Core Version:    0.6.2
 */