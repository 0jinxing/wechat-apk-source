package com.tencent.mm.plugin.d.a.c;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class c
{
  public static final class a
  {
    BluetoothSocket jIG;
    final boolean jIH;
    public final b jII;
    public final a jIJ;
    boolean jIK;
    final BluetoothDevice jIL;
    public final ak mHandler;
    private final HandlerThread mThread;

    public a(b paramb, a parama, BluetoothDevice paramBluetoothDevice)
    {
      AppMethodBeat.i(18487);
      this.jIJ = parama;
      this.jII = paramb;
      this.jIH = true;
      this.jIK = false;
      this.jIL = paramBluetoothDevice;
      this.mThread = com.tencent.mm.sdk.g.d.anM("BluetoothChatThreads_handlerThread");
      this.mThread.start();
      this.mHandler = new c.a.a(this.mThread.getLooper(), this);
      AppMethodBeat.o(18487);
    }

    public final void disconnect()
    {
      AppMethodBeat.i(18488);
      ab.i("MicroMsg.exdevice.ConnectThread", "------disconnect------");
      if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(1)))
        ab.e("MicroMsg.exdevice.ConnectThread", "sendMessage = %d failed!!!", new Object[] { Integer.valueOf(1) });
      if (com.tencent.mm.compatible.util.d.iW(18))
      {
        this.mThread.quitSafely();
        AppMethodBeat.o(18488);
      }
      while (true)
      {
        return;
        this.mThread.quit();
        AppMethodBeat.o(18488);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.c.c
 * JD-Core Version:    0.6.2
 */