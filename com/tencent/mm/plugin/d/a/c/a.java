package com.tencent.mm.plugin.d.a.c;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.HandlerThread;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.UUID;
import junit.framework.Assert;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public final class a
{
  public static final UUID jIw;
  public static final UUID jIx;
  public BluetoothAdapter jEU;
  public HashMap<Long, b> jFA;
  public final BroadcastReceiver jIA;
  public a.a jIy;
  public Context jIz;
  public ak mHandler;
  public boolean mIsInit;
  private Runnable mRunnable;

  static
  {
    AppMethodBeat.i(18482);
    jIw = UUID.fromString("e5b152ed-6b46-09e9-4678-665e9a972cbc");
    jIx = UUID.fromString("e5b152ed-6b46-09e9-4678-665e9a972cbc");
    AppMethodBeat.o(18482);
  }

  public a(al paramal)
  {
    AppMethodBeat.i(18478);
    this.mIsInit = false;
    this.jIA = new a.1(this);
    this.jFA = new HashMap();
    this.mHandler = new ak(paramal.oAl.getLooper());
    this.mRunnable = new a.2(this);
    AppMethodBeat.o(18478);
  }

  private boolean aVG()
  {
    boolean bool = true;
    AppMethodBeat.i(18480);
    if (!this.jEU.isDiscovering())
      AppMethodBeat.o(18480);
    while (true)
    {
      return bool;
      if (!this.jEU.cancelDiscovery())
      {
        ab.e("MicroMsg.exdevice.BluetoothChatManager", "mAdapter.cancelDiscovery Failed!!!");
        bool = false;
        AppMethodBeat.o(18480);
      }
      else
      {
        this.mHandler.removeCallbacks(this.mRunnable);
        AppMethodBeat.o(18480);
      }
    }
  }

  public final boolean aVF()
  {
    AppMethodBeat.i(18479);
    Assert.assertTrue(this.mIsInit);
    boolean bool;
    if (this.jEU == null)
    {
      bool = false;
      AppMethodBeat.o(18479);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(18479);
    }
  }

  public final boolean fw(boolean paramBoolean)
  {
    AppMethodBeat.i(18481);
    StringBuilder localStringBuilder = new StringBuilder("scanDevices");
    String str;
    if (paramBoolean)
    {
      str = "true";
      ab.i("MicroMsg.exdevice.BluetoothChatManager", str);
      Assert.assertTrue(this.mIsInit);
      if (aVF())
        break label73;
      ab.e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
      AppMethodBeat.o(18481);
      paramBoolean = false;
    }
    while (true)
    {
      return paramBoolean;
      str = "false";
      break;
      label73: if (paramBoolean)
      {
        if ((this.jEU.isDiscovering()) && (!aVG()))
        {
          AppMethodBeat.o(18481);
          paramBoolean = false;
        }
        else if (!this.jEU.startDiscovery())
        {
          ab.e("MicroMsg.exdevice.BluetoothChatManager", "mAdapter.startDiscovery() Failed");
          AppMethodBeat.o(18481);
          paramBoolean = false;
        }
        else
        {
          this.mHandler.postDelayed(this.mRunnable, 10000L);
          paramBoolean = true;
          AppMethodBeat.o(18481);
        }
      }
      else
      {
        paramBoolean = aVG();
        AppMethodBeat.o(18481);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.c.a
 * JD-Core Version:    0.6.2
 */