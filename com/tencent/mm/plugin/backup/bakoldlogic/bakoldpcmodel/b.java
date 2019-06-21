package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.l;
import com.tencent.mm.plugin.backup.g.b.a;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.protobuf.ua;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.zip.CRC32;

public final class b
  implements b.a
{
  public static final byte[] jrm;
  private Socket iSP;
  private Boolean jyZ;
  private ServerSocket jza;
  private ak jzb;
  private ak jzc;
  private DataOutputStream jzd;
  private int jze;
  private int jzf;
  private long jzg;
  private Object lock;

  static
  {
    AppMethodBeat.i(17825);
    jrm = "GSMW".getBytes();
    AppMethodBeat.o(17825);
  }

  public b()
  {
    AppMethodBeat.i(17812);
    this.jyZ = Boolean.FALSE;
    this.jza = null;
    this.iSP = null;
    this.jzb = null;
    this.jzc = new ak(Looper.getMainLooper());
    this.jzd = null;
    this.lock = new Object();
    this.jze = 0;
    this.jzf = 0;
    this.jzg = 0L;
    aUH();
    AppMethodBeat.o(17812);
  }

  private void a(DataInputStream paramDataInputStream)
  {
    AppMethodBeat.i(17820);
    while (true)
    {
      int i;
      try
      {
        if ((!this.jyZ.booleanValue()) && (this.jze != 4))
        {
          i = paramDataInputStream.readByte();
          if (jrm[this.jze] == i)
          {
            this.jze += 1;
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.BakOldJavaEngine", "loopRead %s", new Object[] { localException });
      }
      try
      {
        paramDataInputStream.close();
        label74: if (!this.jyZ.booleanValue())
          a(true, 0, 10006, "read_error ".concat(String.valueOf(localException)).getBytes());
        aUG();
        AppMethodBeat.o(17820);
        while (true)
        {
          return;
          long l1 = bo.anT();
          long l2 = this.jzg;
          if (this.jzf - (l1 - l2) < 10L)
          {
            if (this.jzf < 0)
              this.jzf = 0;
            this.jzf += 1;
            this.jzg = l1;
          }
          String str;
          for (int j = 0; ; j = 1)
          {
            if (j == 0)
            {
              str = String.format("GSMW in the %dth step error:expect:%02X, butGet:%02X", new Object[] { Integer.valueOf(this.jze + 1), Integer.valueOf(jrm[this.jze] & 0xFF), Integer.valueOf(i & 0xFF) });
              ab.e("MicroMsg.BakOldJavaEngine", str);
              a(true, 0, 10007, str.getBytes());
            }
            this.jze = 0;
            break;
          }
          this.jze = 0;
          i = paramDataInputStream.readInt();
          short s1 = paramDataInputStream.readShort();
          short s2 = paramDataInputStream.readShort();
          int k = paramDataInputStream.readInt();
          if (k > 16777216)
          {
            str = String.format("loopRead size to large:%d", new Object[] { Integer.valueOf(k) });
            ab.e("MicroMsg.BakOldJavaEngine", str);
            this.jyZ = Boolean.TRUE;
            a(true, 0, 10007, str.getBytes());
            AppMethodBeat.o(17820);
          }
          else
          {
            int m = paramDataInputStream.readInt();
            ab.i("MicroMsg.BakOldJavaEngine", "read buf size:".concat(String.valueOf(k)));
            Object localObject2 = new byte[k - 20];
            j = 0;
            while (j < localObject2.length)
            {
              int n = paramDataInputStream.read((byte[])localObject2, j, localObject2.length - j);
              if (n == -1)
                try
                {
                  Thread.sleep(200L);
                }
                catch (InterruptedException localInterruptedException)
                {
                }
              else
                j += n;
            }
            PByteArray localPByteArray = new com/tencent/mm/pointers/PByteArray;
            localPByteArray.<init>();
            Object localObject1 = jrm;
            if (s1 != 1)
            {
              localObject1 = String.format("unpack failed, getVersion:%d", new Object[] { Short.valueOf(s1) });
              ab.e("MicroMsg.BakOldPacker", (String)localObject1);
              localPByteArray.value = ((String)localObject1).getBytes();
              j = -1;
              label501: ab.d("MicroMsg.BakOldJavaEngine", "summerbak loopRead unpack ret[%d]", new Object[] { Integer.valueOf(j) });
              if (j == 0)
                break label759;
              if (localPByteArray.value != null)
                break label743;
            }
            label731: label743: for (localObject1 = ""; ; localObject1 = new String(localPByteArray.value))
            {
              a(true, 0, 10007, ((String)localObject1).getBytes());
              AppMethodBeat.o(17820);
              break;
              if (com.tencent.mm.plugin.backup.g.b.aSx() == 1)
              {
                j = com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.b.a((byte[])localObject1, i, s1, s2, k, (byte[])localObject2);
                if (m != j)
                {
                  localObject1 = new java/util/zip/CRC32;
                  ((CRC32)localObject1).<init>();
                  ((CRC32)localObject1).update((byte[])localObject2);
                  localObject2 = com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.b.ap((byte[])localObject2);
                  localObject1 = String.format("unpack failed--calcSum:%d, getfromPcMgr:%d, seq:%d, type:%d, size:%d, just buf.crc:%d, last 100 bytes:%s", new Object[] { Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(i), Short.valueOf(s2), Integer.valueOf(k), Integer.valueOf((int)((CRC32)localObject1).getValue()), localObject2 });
                  ab.e("MicroMsg.BakOldPacker", (String)localObject1);
                  localPByteArray.value = ((String)localObject1).getBytes();
                  j = -2;
                  break label501;
                }
              }
              localObject1 = localObject2;
              if (s2 != 1)
                if (s2 != 2)
                  break label731;
              for (localObject1 = localObject2; ; localObject1 = l.c((byte[])localObject2, com.tencent.mm.plugin.backup.b.d.aSy()))
              {
                localPByteArray.value = ((byte[])localObject1);
                j = 0;
                break;
              }
            }
            label759: ab.d("MicroMsg.BakOldJavaEngine", "summerbak loopRead unpack ret[%d], seq[%d], type[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Short.valueOf(s2) });
            a(false, i, s2, localPByteArray.value);
            AppMethodBeat.o(17820);
          }
        }
      }
      catch (IOException paramDataInputStream)
      {
        break label74;
      }
    }
  }

  private void a(boolean paramBoolean, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17816);
    this.jzc.post(new b.2(this, paramBoolean, paramInt1, paramInt2, paramArrayOfByte));
    AppMethodBeat.o(17816);
  }

  private void aUG()
  {
    AppMethodBeat.i(17815);
    this.jze = 0;
    this.jzf = 0;
    this.jzg = 0L;
    this.jyZ = Boolean.TRUE;
    try
    {
      synchronized (this.lock)
      {
        if (this.jzd != null)
          this.jzd.close();
      }
    }
    catch (Exception localException1)
    {
      try
      {
        while (true)
        {
          if (this.iSP != null)
            this.iSP.close();
          AppMethodBeat.o(17815);
          return;
          localObject2 = finally;
          AppMethodBeat.o(17815);
          throw localObject2;
          localException1 = localException1;
        }
      }
      catch (Exception localException2)
      {
        while (true)
          AppMethodBeat.o(17815);
      }
    }
  }

  private void aUH()
  {
    AppMethodBeat.i(17819);
    if ((this.jzb == null) || (!this.jzb.getLooper().getThread().isAlive()))
      com.tencent.mm.sdk.g.d.h(new b.5(this), "BackupJavaEngine_handler").start();
    AppMethodBeat.o(17819);
  }

  public final void aUF()
  {
    AppMethodBeat.i(17814);
    ab.i("MicroMsg.BakOldJavaEngine", "close connect");
    aUG();
    a(true, 0, 10003, null);
    AppMethodBeat.o(17814);
  }

  public final void aq(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17818);
    if (this.jyZ.booleanValue())
    {
      ab.e("MicroMsg.BakOldJavaEngine", "engine has stop");
      AppMethodBeat.o(17818);
    }
    while (true)
    {
      return;
      this.jzb.post(new b.4(this, paramArrayOfByte));
      AppMethodBeat.o(17818);
    }
  }

  public final void e(int paramInt, List<ua> paramList)
  {
    AppMethodBeat.i(17813);
    ab.i("MicroMsg.BakOldJavaEngine", "connect type:%d", new Object[] { Integer.valueOf(paramInt) });
    aUH();
    com.tencent.mm.sdk.g.d.post(new b.1(this, paramInt, paramList), "BackupJavaEngine_connect");
    AppMethodBeat.o(17813);
  }

  public final void i(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17817);
    if (this.jzb != null)
    {
      aq(paramArrayOfByte);
      AppMethodBeat.o(17817);
    }
    while (true)
    {
      return;
      this.jzc.postDelayed(new b.3(this, paramInt, paramArrayOfByte), 200L);
      AppMethodBeat.o(17817);
    }
  }

  public final int j(int paramInt, byte[] paramArrayOfByte)
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.b
 * JD-Core Version:    0.6.2
 */