package com.tencent.mm.plugin.backup.c;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.lan_cs.Client.Java2C;
import com.tencent.mm.lan_cs.Server.Java2C;
import com.tencent.mm.lan_cs.Server.a;
import com.tencent.mm.plugin.backup.g.b;
import com.tencent.mm.plugin.backup.g.b.a;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;

public final class a
  implements b.a
{
  public static final byte[] jrm;
  private String jrn;
  private int jro;
  public ak jrp = null;
  public a.a jrq;
  private int mode = 0;

  static
  {
    AppMethodBeat.i(17166);
    jrm = "GSMW".getBytes();
    AppMethodBeat.o(17166);
  }

  private void a(boolean paramBoolean, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17163);
    al.d(new a.5(this, paramBoolean, paramInt1, paramInt2, paramArrayOfByte));
    AppMethodBeat.o(17163);
  }

  public final boolean a(PString paramPString, PInt paramPInt)
  {
    AppMethodBeat.i(17158);
    this.mode = 0;
    ab.i("MicroMsg.BackupCEngine", "listen, before server.stop");
    Server.Java2C.stop();
    ab.i("MicroMsg.BackupCEngine", "listen, before server.start listener");
    com.tencent.mm.lan_cs.Server.eOu = new Server.a()
    {
      public final void SX()
      {
        AppMethodBeat.i(17151);
        a.a(a.this, 10011, "listen server onDisconnect".getBytes());
        AppMethodBeat.o(17151);
      }

      public final void jW(int paramAnonymousInt)
      {
        AppMethodBeat.i(17149);
        if (a.a(a.this) == 1)
          b.rz(paramAnonymousInt);
        AppMethodBeat.o(17149);
      }

      public final void onConnect(String paramAnonymousString, int paramAnonymousInt)
      {
        AppMethodBeat.i(17152);
        a.a(a.this, paramAnonymousString);
        a.a(a.this, paramAnonymousInt);
        AppMethodBeat.o(17152);
      }

      public final void onRecv(String paramAnonymousString, int paramAnonymousInt, byte[] paramAnonymousArrayOfByte)
      {
        AppMethodBeat.i(17150);
        a.a(a.this, paramAnonymousString);
        a.a(a.this, paramAnonymousInt);
        try
        {
          a.a(a.this, paramAnonymousArrayOfByte);
          AppMethodBeat.o(17150);
          return;
        }
        catch (IOException paramAnonymousString)
        {
          while (true)
          {
            a.a(a.this, 10006, ("server readErr:" + paramAnonymousString.toString()).getBytes());
            AppMethodBeat.o(17150);
          }
        }
      }
    };
    Object[] arrayOfObject = Server.Java2C.access$000();
    boolean bool;
    if ((arrayOfObject == null) || (arrayOfObject.length != 3))
    {
      ab.e("MicroMsg.BackupCEngine", "listen error");
      AppMethodBeat.o(17158);
      bool = false;
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.BackupCEngine", "listen, result[%d, %s, %d]", new Object[] { arrayOfObject[0], arrayOfObject[1], arrayOfObject[2] });
      if (((Integer)arrayOfObject[0]).intValue() != 1)
      {
        AppMethodBeat.o(17158);
        bool = false;
      }
      else
      {
        paramPString.value = ((String)arrayOfObject[1]);
        paramPInt.value = ((Integer)arrayOfObject[2]).intValue();
        this.mode = 1;
        AppMethodBeat.o(17158);
        bool = true;
      }
    }
  }

  public final void connect(String paramString, int paramInt)
  {
    AppMethodBeat.i(17159);
    this.mode = 2;
    this.jrn = paramString;
    this.jro = paramInt;
    com.tencent.mm.lan_cs.Client.eOt = new a.2(this);
    AppMethodBeat.o(17159);
  }

  public final void i(final int paramInt, final byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17161);
    final long l = bo.anU();
    ab.v("MicroMsg.BackupCEngine", "send seq:%d buff:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(bo.cc(paramArrayOfByte)) });
    if ((this.jrp == null) || (!this.jrp.getLooper().getThread().isAlive()))
    {
      HandlerThread localHandlerThread = d.anM("BackupCEngine_sendHandler");
      localHandlerThread.setPriority(10);
      localHandlerThread.start();
      this.jrp = new ak(localHandlerThread.getLooper());
      ab.w("MicroMsg.BackupCEngine", "BackupCEngine send, new writerHandler:%d", new Object[] { Long.valueOf(localHandlerThread.getId()) });
    }
    this.jrp.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(17156);
        long l = bo.anU();
        ab.i("MicroMsg.BackupCEngine", "before send server mode:%d  seq:%d  buff:%d time:[%d]", new Object[] { Integer.valueOf(a.a(a.this)), Integer.valueOf(paramInt), Integer.valueOf(bo.cc(paramArrayOfByte)), Long.valueOf(l - l) });
        if (a.a(a.this) == 0)
        {
          ab.i("MicroMsg.BackupCEngine", "sendImp err mode!!");
          AppMethodBeat.o(17156);
          return;
        }
        int j;
        if (a.a(a.this) == 1)
        {
          int i = Server.Java2C.send(a.b(a.this), a.c(a.this), paramArrayOfByte);
          j = i;
          if (i == 0);
        }
        while (true)
        {
          b.rz(bo.cc(paramArrayOfByte));
          ab.i("MicroMsg.BackupCEngine", "send result[%d], seq[%d], buff[%d], time[%d,%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt), Integer.valueOf(bo.cc(paramArrayOfByte)), Long.valueOf(bo.gb(l)), Long.valueOf(bo.gb(l)) });
          AppMethodBeat.o(17156);
          break;
          if (a.a(a.this) == 2)
            j = Client.Java2C.send(a.b(a.this), a.c(a.this), paramArrayOfByte);
          else
            j = 0;
        }
      }
    });
    AppMethodBeat.o(17161);
  }

  public final int j(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17162);
    long l = bo.anU();
    int i;
    if (this.mode == 1)
      i = Server.Java2C.send(this.jrn, this.jro, paramArrayOfByte);
    while (true)
    {
      ab.i("MicroMsg.BackupCEngine", "sendSameThread, result[%d], seq[%d], buflen[%d], send time[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(bo.cc(paramArrayOfByte)), Long.valueOf(bo.gb(l)) });
      AppMethodBeat.o(17162);
      return i;
      if (this.mode == 2)
      {
        i = Client.Java2C.send(this.jrn, this.jro, paramArrayOfByte);
        b.rz(bo.cc(paramArrayOfByte));
      }
      else
      {
        i = 0;
      }
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(17160);
    ab.i("MicroMsg.BackupCEngine", "BackupCEngine stop.");
    if (this.mode == 1)
    {
      Server.Java2C.stop();
      b.aTm();
      this.mode = 0;
      AppMethodBeat.o(17160);
    }
    while (true)
    {
      return;
      if (this.mode == 2)
      {
        Client.Java2C.disconnect();
        b.aTm();
        this.mode = 0;
        AppMethodBeat.o(17160);
      }
      else
      {
        AppMethodBeat.o(17160);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.a
 * JD-Core Version:    0.6.2
 */