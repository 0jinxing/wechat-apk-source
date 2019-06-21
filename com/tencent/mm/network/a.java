package com.tencent.mm.network;

import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.model.ay;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.y;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public final class a extends d.a
  implements c
{
  byte[] cPB;
  private boolean foreground;
  private byte[] gcA;
  private byte[] gcB;
  private byte[] gcC;
  private a.a gcD;
  byte[] gcE;
  String gcF;
  private Map<String, byte[]> gcG;
  private int uin;
  String username;

  public a(a.a parama)
  {
    AppMethodBeat.i(58438);
    this.gcD = null;
    this.foreground = false;
    this.gcG = new HashMap();
    this.gcD = parama;
    amK();
    AppMethodBeat.o(58438);
  }

  private void amK()
  {
    AppMethodBeat.i(58440);
    this.cPB = bo.anf(ay.ZQ().getString("server_id", ""));
    AppMethodBeat.o(58440);
  }

  private String amL()
  {
    AppMethodBeat.i(58446);
    try
    {
      Object localObject = ByteBuffer.allocate(4096);
      ((ByteBuffer)localObject).put(this.gcA).put(this.gcB).put(this.gcC).put(this.gcE).put(this.cPB).putInt(this.uin).put(this.gcF.getBytes()).put(this.username.getBytes());
      localObject = g.x(((ByteBuffer)localObject).array());
      AppMethodBeat.o(58446);
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str = "";
        AppMethodBeat.o(58446);
      }
    }
  }

  private void clear()
  {
    this.username = null;
    this.gcA = null;
    this.gcB = null;
    this.gcC = null;
    this.cPB = null;
    this.uin = 0;
    this.gcE = null;
    this.gcF = null;
  }

  public final int QF()
  {
    return this.uin;
  }

  public final int S(byte[] paramArrayOfByte)
  {
    int i = 0;
    AppMethodBeat.i(58448);
    long l = bo.anU();
    if (adb())
    {
      ab.e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf Error : isLogin == true ");
      i = -2;
      AppMethodBeat.o(58448);
    }
    while (true)
    {
      return i;
      try
      {
        y localy = new com/tencent/mm/sdk/platformtools/y;
        localy.<init>();
        int j = localy.bX(paramArrayOfByte);
        if (j != 0)
        {
          ab.e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf Error : initParse: %s", new Object[] { Integer.valueOf(j) });
          i = -3;
          AppMethodBeat.o(58448);
        }
        else
        {
          this.username = localy.getString();
          this.gcF = localy.getString();
          this.uin = localy.getInt();
          this.cPB = localy.getBuffer();
          this.gcE = localy.getBuffer();
          this.gcA = localy.getBuffer();
          this.gcB = localy.getBuffer();
          this.gcC = localy.getBuffer();
          paramArrayOfByte = localy.getString();
          if ((bo.isNullOrNil(paramArrayOfByte)) || (!paramArrayOfByte.equals(amL())))
          {
            clear();
            ab.e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf Error : checksum failed");
            i = -4;
            AppMethodBeat.o(58448);
          }
          else
          {
            ab.i("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf finish time:%s  md5:%s", new Object[] { Long.valueOf(bo.gb(l)), paramArrayOfByte });
            AppMethodBeat.o(58448);
          }
        }
      }
      catch (Exception paramArrayOfByte)
      {
        clear();
        ab.e("MicroMsg.AccInfo", "AccInfoCacheInWorker parseBuf exception:%s", new Object[] { bo.l(paramArrayOfByte) });
        i = -5;
        AppMethodBeat.o(58448);
      }
    }
  }

  public final void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt)
  {
    AppMethodBeat.i(58441);
    ab.i("MicroMsg.AccInfo", "summerauth update session info: session single[%s] cli[%s], svr[%s] uin:%d -> %d stack:[%s]", new Object[] { bo.anv(bo.ca(paramArrayOfByte1)), bo.anv(bo.ca(paramArrayOfByte2)), bo.anv(bo.ca(paramArrayOfByte3)), Integer.valueOf(this.uin), Integer.valueOf(paramInt), bo.dpG() });
    this.gcA = paramArrayOfByte1;
    this.gcB = paramArrayOfByte2;
    this.gcC = paramArrayOfByte3;
    this.uin = paramInt;
    if (this.gcD != null)
      adb();
    AppMethodBeat.o(58441);
  }

  public final void ab(byte[] paramArrayOfByte)
  {
    this.cPB = paramArrayOfByte;
  }

  public final void ac(byte[] paramArrayOfByte)
  {
    this.gcE = paramArrayOfByte;
  }

  public final String adD()
  {
    return this.gcF;
  }

  public final byte[] ada()
  {
    return this.cPB;
  }

  public final boolean adb()
  {
    if ((this.gcA != null) && (this.gcB != null) && (this.gcC != null) && (this.gcA.length > 0) && (this.gcB.length > 0) && (this.gcC.length > 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final byte[] adc()
  {
    return this.gcE;
  }

  public final boolean ade()
  {
    return this.foreground;
  }

  public final byte[] adf()
  {
    Object localObject1 = null;
    AppMethodBeat.i(58447);
    long l = bo.anU();
    int i;
    if (bo.isNullOrNil(this.username))
    {
      i = 0;
      if (i != 0)
        break label166;
      ab.e("MicroMsg.AccInfo", "AccInfoCacheInWorker getCacheBuffer Error : isCacheValid== false");
      AppMethodBeat.o(58447);
    }
    while (true)
    {
      return localObject1;
      if (bo.cb(this.gcA))
      {
        i = 0;
        break;
      }
      if (bo.cb(this.gcB))
      {
        i = 0;
        break;
      }
      if (bo.cb(this.gcC))
      {
        i = 0;
        break;
      }
      if (bo.cb(this.cPB))
      {
        i = 0;
        break;
      }
      if ((this.uin == 0) || (this.uin == -1))
      {
        i = 0;
        break;
      }
      if (bo.cb(this.gcE))
      {
        i = 0;
        break;
      }
      if (bo.isNullOrNil(this.gcF))
      {
        i = 0;
        break;
      }
      i = 1;
      break;
      try
      {
        label166: Object localObject2 = new com/tencent/mm/sdk/platformtools/y;
        ((y)localObject2).<init>();
        ((y)localObject2).dog();
        ((y)localObject2).amu(this.username);
        ((y)localObject2).amu(this.gcF);
        ((y)localObject2).LY(this.uin);
        ((y)localObject2).bY(this.cPB);
        ((y)localObject2).bY(this.gcE);
        ((y)localObject2).bY(this.gcA);
        ((y)localObject2).bY(this.gcB);
        ((y)localObject2).bY(this.gcC);
        String str = amL();
        ((y)localObject2).amu(str);
        localObject2 = ((y)localObject2).doh();
        ab.i("MicroMsg.AccInfo", "AccInfoCacheInWorker getCacheBuffer finish time:%s buflen:%s md5:%s", new Object[] { Long.valueOf(bo.gb(l)), Integer.valueOf(localObject2.length), str });
        AppMethodBeat.o(58447);
        localObject1 = localObject2;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.AccInfo", "AccInfoCacheInWorker getCacheBuffer exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58447);
      }
    }
  }

  public final void cE(boolean paramBoolean)
  {
    AppMethodBeat.i(58445);
    this.foreground = paramBoolean;
    ab.i("MicroMsg.AccInfo", "somr accinfo setForeground :%b", new Object[] { Boolean.valueOf(this.foreground) });
    AppMethodBeat.o(58445);
  }

  public final String getUsername()
  {
    return this.username;
  }

  public final void hB(int paramInt)
  {
    AppMethodBeat.i(58449);
    ab.i("MicroMsg.AccInfo", "summerauth setuin [%d -> %d], stack[%s]", new Object[] { Integer.valueOf(this.uin), Integer.valueOf(paramInt), bo.dpG() });
    this.uin = paramInt;
    AppMethodBeat.o(58449);
  }

  public final byte[] jQ(int paramInt)
  {
    byte[] arrayOfByte;
    switch (paramInt)
    {
    default:
      arrayOfByte = null;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = this.gcA;
      continue;
      arrayOfByte = this.gcB;
      continue;
      arrayOfByte = this.gcC;
    }
  }

  public final void o(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58443);
    this.gcG.put(paramString, paramArrayOfByte);
    AppMethodBeat.o(58443);
  }

  public final byte[] qr(String paramString)
  {
    AppMethodBeat.i(58444);
    paramString = (byte[])this.gcG.get(paramString);
    AppMethodBeat.o(58444);
    return paramString;
  }

  public final void reset()
  {
    AppMethodBeat.i(58439);
    ab.i("MicroMsg.AccInfo", "reset accinfo");
    this.username = "";
    this.gcA = null;
    amK();
    this.uin = 0;
    this.gcB = null;
    this.gcC = null;
    AppMethodBeat.o(58439);
  }

  public final void setUsername(String paramString)
  {
    this.username = paramString;
  }

  public final String toString()
  {
    AppMethodBeat.i(58442);
    String str = "AccInfo:\n" + "|-uin     =" + QF() + "\n";
    str = str + "|-user    =" + getUsername() + "\n";
    str = str + "|-wxuser  =" + adD() + "\n";
    str = str + "|-wxuser  =" + adD() + "\n";
    str = str + "|-singlesession =" + bo.ca(jQ(1)) + "\n";
    str = str + "|-clientsession =" + bo.ca(jQ(2)) + "\n";
    str = str + "|-serversession =" + bo.ca(jQ(3)) + "\n";
    str = str + "|-ecdhkey =" + bo.ca(adc()) + "\n";
    str = str + "`-cookie  =" + bo.ca(ada());
    AppMethodBeat.o(58442);
    return str;
  }

  public final void va(String paramString)
  {
    this.gcF = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.a
 * JD-Core Version:    0.6.2
 */