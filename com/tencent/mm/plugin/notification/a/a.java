package com.tencent.mm.plugin.notification.a;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;

public final class a
  implements n.b
{
  private final int DELAY_TIME;
  private final String TAG;
  private ak mHandler;
  public boolean oVn;

  public a()
  {
    AppMethodBeat.i(23095);
    this.TAG = "MicroMsg.NotificationObserver";
    this.DELAY_TIME = 50;
    this.oVn = false;
    this.mHandler = new a.1(this, Looper.getMainLooper());
    AppMethodBeat.o(23095);
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(23096);
    ab.i("MicroMsg.NotificationObserver", "event: %d", new Object[] { Integer.valueOf(paramInt) });
    if ((!(paramObject instanceof String)) || (bo.isNullOrNil((String)paramObject)))
    {
      ab.d("MicroMsg.NotificationObserver", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(23096);
      return;
    }
    if (!aw.ZD())
      aw.ZK();
    for (paramInt = (int)c.XM().aoM((String)paramObject).ewQ; ; paramInt = 0)
    {
      this.mHandler.removeMessages(paramInt);
      paramn = Message.obtain();
      Bundle localBundle = new Bundle();
      localBundle.putString("com.tencent.mm.notification.observer", (String)paramObject);
      paramn.setData(localBundle);
      paramn.what = paramInt;
      this.mHandler.sendMessageDelayed(paramn, 50L);
      AppMethodBeat.o(23096);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.a.a
 * JD-Core Version:    0.6.2
 */