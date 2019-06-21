package com.tencent.mm.protocal;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

public final class x
{
  public static final class a extends l.d
    implements l.b
  {
    public byte[] eJt;
    public byte[] fIi;
    public int netType;
    public int uin;
    public int vyo;

    public a()
    {
      AppMethodBeat.i(58866);
      this.fIi = new byte[0];
      this.uin = 0;
      AppMethodBeat.o(58866);
    }

    public final byte[] ZT()
    {
      AppMethodBeat.i(58867);
      int i = this.uin;
      int j;
      Object localObject;
      if (this.fIi == null)
      {
        j = -1;
        ab.d("MicroMsg.MMSyncCheck", "toProtoBuf dksynccheck uin:%d keybuf:%d, stack[%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), bo.dpG() });
        if ((this.uin != 0) && (!bo.cb(this.fIi)))
          break label87;
        localObject = new byte[0];
        AppMethodBeat.o(58867);
      }
      while (true)
      {
        return localObject;
        j = this.fIi.length;
        break;
        label87: i = (this.uin >> 13 & 0x7FFFF | this.fIi.length << 19) ^ 0x5601F281;
        j = 0x5601F281 ^ (this.fIi.length >> 13 & 0x7FFFF | this.uin << 19);
        byte[] arrayOfByte = new byte[this.fIi.length + 32];
        ab.d("MicroMsg.MMSyncCheck", "dksynccheck uin=[%d/%d], keyBufLen=[%d/%d] outBuf=[%d]", new Object[] { Integer.valueOf(this.uin), Integer.valueOf(i), Integer.valueOf(this.fIi.length), Integer.valueOf(j), Integer.valueOf(arrayOfByte.length) });
        arrayOfByte[0] = ((byte)(byte)(i >> 24 & 0xFF));
        arrayOfByte[1] = ((byte)(byte)(i >> 16 & 0xFF));
        arrayOfByte[2] = ((byte)(byte)(i >> 8 & 0xFF));
        arrayOfByte[3] = ((byte)(byte)(i & 0xFF));
        arrayOfByte[4] = ((byte)(byte)(j >> 24 & 0xFF));
        arrayOfByte[5] = ((byte)(byte)(j >> 16 & 0xFF));
        arrayOfByte[6] = ((byte)(byte)(j >> 8 & 0xFF));
        arrayOfByte[7] = ((byte)(byte)(j & 0xFF));
        System.arraycopy(this.fIi, 0, arrayOfByte, 8, this.fIi.length);
        arrayOfByte[(arrayOfByte.length - 24)] = ((byte)(byte)(d.vxo >> 24 & 0xFF));
        arrayOfByte[(arrayOfByte.length - 23)] = ((byte)(byte)(d.vxo >> 16 & 0xFF));
        arrayOfByte[(arrayOfByte.length - 22)] = ((byte)(byte)(d.vxo >> 8 & 0xFF));
        arrayOfByte[(arrayOfByte.length - 21)] = ((byte)(byte)(d.vxo & 0xFF));
        String str = Locale.getDefault().toString();
        localObject = str;
        if (str.length() > 8)
          localObject = str.substring(0, 8);
        localObject = ((String)localObject).getBytes();
        System.arraycopy(localObject, 0, arrayOfByte, arrayOfByte.length - 20, localObject.length);
        ab.d("MicroMsg.MMSyncCheck", "language:%x" + Arrays.toString((byte[])localObject));
        arrayOfByte[(arrayOfByte.length - 12)] = ((byte)0);
        arrayOfByte[(arrayOfByte.length - 11)] = ((byte)0);
        arrayOfByte[(arrayOfByte.length - 10)] = ((byte)0);
        arrayOfByte[(arrayOfByte.length - 9)] = ((byte)2);
        arrayOfByte[(arrayOfByte.length - 8)] = ((byte)(byte)(this.netType >> 24 & 0xFF));
        arrayOfByte[(arrayOfByte.length - 7)] = ((byte)(byte)(this.netType >> 16 & 0xFF));
        arrayOfByte[(arrayOfByte.length - 6)] = ((byte)(byte)(this.netType >> 8 & 0xFF));
        arrayOfByte[(arrayOfByte.length - 5)] = ((byte)(byte)(this.netType & 0xFF));
        arrayOfByte[(arrayOfByte.length - 4)] = ((byte)(byte)(this.vyo >> 24 & 0xFF));
        arrayOfByte[(arrayOfByte.length - 3)] = ((byte)(byte)(this.vyo >> 16 & 0xFF));
        arrayOfByte[(arrayOfByte.length - 2)] = ((byte)(byte)(this.vyo >> 8 & 0xFF));
        arrayOfByte[(arrayOfByte.length - 1)] = ((byte)(byte)(this.vyo & 0xFF));
        ab.d("MicroMsg.MMSyncCheck", "outbuf:%x" + Arrays.toString(arrayOfByte));
        this.eJt = g.y(arrayOfByte);
        AppMethodBeat.o(58867);
        localObject = arrayOfByte;
      }
    }

    public final int ZU()
    {
      return 0;
    }

    public final boolean adr()
    {
      return false;
    }

    public final boolean dms()
    {
      return true;
    }

    public final int getCmdId()
    {
      return 205;
    }

    public final void hB(int paramInt)
    {
      this.uin = paramInt;
    }
  }

  public static final class b extends l.e
    implements l.c
  {
    private String cHz = null;
    public byte[] eJt = null;
    public long vyM = 7L;
    private byte[] vyN;

    public final int P(byte[] paramArrayOfByte)
    {
      int i = -1;
      AppMethodBeat.i(58869);
      int j;
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 12))
      {
        StringBuilder localStringBuilder = new StringBuilder("dksynccheck err resp buf:");
        if (paramArrayOfByte == null)
        {
          j = -1;
          ab.e("MicroMsg.MMSyncCheck", j);
          AppMethodBeat.o(58869);
          j = i;
        }
      }
      while (true)
      {
        return j;
        j = paramArrayOfByte.length;
        break;
        this.vyM = (paramArrayOfByte[3] & 0xFF | (paramArrayOfByte[2] & 0xFF) << 8 | (paramArrayOfByte[1] & 0xFF) << 16 | (paramArrayOfByte[0] & 0xFF) << 24);
        j = paramArrayOfByte[7] & 0xFF | (paramArrayOfByte[6] & 0xFF) << 8 | (paramArrayOfByte[5] & 0xFF) << 16 | (paramArrayOfByte[4] & 0xFF) << 24;
        int k = paramArrayOfByte[11] & 0xFF | (paramArrayOfByte[10] & 0xFF) << 8 | (paramArrayOfByte[9] & 0xFF) << 16 | (paramArrayOfByte[8] & 0xFF) << 24;
        ab.d("MicroMsg.MMSyncCheck", " fromProtoBuf oreh synccheck resp selector:%d, redCode:%d, keyLen:%d", new Object[] { Long.valueOf(this.vyM), Integer.valueOf(j), Integer.valueOf(k) });
        if (j != -3002)
        {
          this.cHz = "";
          AppMethodBeat.o(58869);
        }
        else if ((k != paramArrayOfByte.length - 12) && (k != paramArrayOfByte.length - 12 - 16))
        {
          ab.e("MicroMsg.MMSyncCheck", " the key len is invalid keyLen:%d, bufLen:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(paramArrayOfByte.length) });
          AppMethodBeat.o(58869);
          j = i;
        }
        else
        {
          if (k == paramArrayOfByte.length - 12 - 16)
          {
            this.eJt = new byte[16];
            System.arraycopy(paramArrayOfByte, paramArrayOfByte.length - 16, this.eJt, 0, 16);
          }
          this.vyN = new byte[k];
          System.arraycopy(paramArrayOfByte, 12, this.vyN, 0, k);
          AppMethodBeat.o(58869);
        }
      }
    }

    public final boolean dms()
    {
      return true;
    }

    @TargetApi(9)
    public final String dmu()
    {
      AppMethodBeat.i(58868);
      Object localObject;
      if (this.eJt == null)
      {
        localObject = "";
        AppMethodBeat.o(58868);
      }
      while (true)
      {
        return localObject;
        if (this.cHz != null)
          break label84;
        localObject = MMProtocalJni.aesDecrypt(this.vyN, this.eJt);
        if (!bo.cb((byte[])localObject))
          break;
        localObject = "";
        AppMethodBeat.o(58868);
      }
      if (Build.VERSION.SDK_INT >= 9);
      for (this.cHz = new String((byte[])localObject, Charset.forName("UTF-8")); ; this.cHz = new String((byte[])localObject))
      {
        label84: localObject = this.cHz;
        AppMethodBeat.o(58868);
        break;
      }
    }

    public final int getCmdId()
    {
      return 1000000205;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.x
 * JD-Core Version:    0.6.2
 */