package com.tencent.mm.plugin.d.a.c;

import android.bluetooth.BluetoothSocket;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.io.InputStream;

public final class c$b
  implements Runnable
{
  private final BluetoothSocket jIG;
  private b jII;
  a jIJ;
  private InputStream jIM;
  private volatile boolean jIN;

  public c$b(b paramb, a parama, BluetoothSocket paramBluetoothSocket)
  {
    AppMethodBeat.i(18489);
    this.jIG = paramBluetoothSocket;
    this.jII = paramb;
    this.jIJ = parama;
    this.jIN = false;
    this.jIM = null;
    try
    {
      this.jIM = paramBluetoothSocket.getInputStream();
      AppMethodBeat.o(18489);
      return;
    }
    catch (IOException paramb)
    {
      while (true)
      {
        this.jIM = null;
        ab.e("MicroMsg.exdevice.RecvThread", "socket.getInputStream failed!!! (%s)", new Object[] { paramb.toString() });
        AppMethodBeat.o(18489);
      }
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(18491);
    ab.i("MicroMsg.exdevice.RecvThread", "------cancel------");
    if (this.jIN)
    {
      ab.w("MicroMsg.exdevice.RecvThread", "Cancel is done aready, just leave");
      AppMethodBeat.o(18491);
    }
    while (true)
    {
      return;
      this.jIN = true;
      try
      {
        this.jIG.close();
        AppMethodBeat.o(18491);
      }
      catch (IOException localIOException)
      {
        ab.e("MicroMsg.exdevice.RecvThread", "close() of connect socket failed", new Object[] { localIOException });
        AppMethodBeat.o(18491);
      }
    }
  }

  public final void run()
  {
    AppMethodBeat.i(18490);
    ab.i("MicroMsg.exdevice.RecvThread", "BEGIN RecvThread");
    if (this.jIM == null)
    {
      ab.e("MicroMsg.exdevice.RecvThread", "socket.getInputStream failed!!! Just Leave");
      AppMethodBeat.o(18490);
    }
    while (true)
    {
      return;
      byte[] arrayOfByte1 = new byte[2048];
      label40: if (this.jIN)
      {
        ab.w("MicroMsg.exdevice.RecvThread", "Cancel is called while receiving data, just leave");
        AppMethodBeat.o(18490);
      }
      else
      {
        try
        {
          int i = this.jIM.read(arrayOfByte1);
          if (i <= 0)
            break label40;
          ab.i("MicroMsg.exdevice.RecvThread", "------On data receivce------data length = %d", new Object[] { Integer.valueOf(i) });
          ab.d("MicroMsg.exdevice.RecvThread", "data dump = %s", new Object[] { com.tencent.mm.plugin.exdevice.j.b.S(arrayOfByte1, i) });
          byte[] arrayOfByte2 = new byte[i];
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i);
          if (this.jIJ == null)
            break label40;
          this.jIJ.jIy.b(this.jII.mSessionId, arrayOfByte2);
        }
        catch (IOException localIOException1)
        {
          ab.e("MicroMsg.exdevice.RecvThread", "mInStream.read Failed!!! (%s)", new Object[] { localIOException1.toString() });
          try
          {
            this.jIG.close();
            AppMethodBeat.o(18490);
          }
          catch (IOException localIOException2)
          {
            ab.e("MicroMsg.exdevice.RecvThread", "Close socket failed!!! (%s)", new Object[] { localIOException2.toString() });
            AppMethodBeat.o(18490);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.c.c.b
 * JD-Core Version:    0.6.2
 */