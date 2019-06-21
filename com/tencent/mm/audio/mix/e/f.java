package com.tencent.mm.audio.mix.e;

import com.tencent.mm.audio.mix.a.d;
import java.util.Arrays;
import java.util.List;

public abstract class f
  implements h
{
  protected int MAX_VALUE = 32767;
  protected int MIN_VALUE = -32768;
  protected short[][] cmZ = new short[1][1];
  protected int cna = 1;
  protected int cnb = 1;
  protected short[] cnc = new short[1];
  protected int cnd = 1;
  protected com.tencent.mm.audio.mix.a.b cne;

  private byte[] Ed()
  {
    if (this.cne != null);
    for (byte[] arrayOfByte = this.cne.ckv; ; arrayOfByte = null)
      return arrayOfByte;
  }

  protected abstract byte[] D(int paramInt1, int paramInt2, int paramInt3);

  public final boolean a(com.tencent.mm.audio.mix.a.b paramb, List<d> paramList)
  {
    boolean bool = false;
    if ((paramList == null) || (paramList.size() == 0))
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.BaseAudioMixAlgorithm", "process list is invalid");
    while (true)
    {
      return bool;
      Object localObject1 = new byte[paramList.size()][];
      for (int i = 0; i < paramList.size(); i++)
        localObject1[i] = ((d)paramList.get(i)).ckv;
      this.cne = paramb;
      if (localObject1.length == 0)
        localObject1 = null;
      while (true)
      {
        if (localObject1 != null)
          break label441;
        com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.BaseAudioMixAlgorithm", "mixed data is invalid");
        break;
        Object localObject2 = localObject1[0];
        if ((localObject2 == null) || (localObject2.length == 0))
        {
          localObject1 = null;
        }
        else if (localObject1.length == 1)
        {
          byte[] arrayOfByte = Ed();
          if (arrayOfByte != null)
          {
            localObject1 = arrayOfByte;
            if (arrayOfByte.length == localObject2.length);
          }
          else
          {
            localObject1 = new byte[localObject2.length];
          }
          System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
        }
        else
        {
          for (i = 0; ; i++)
          {
            if (i >= localObject1.length)
              break label241;
            if (localObject1[i].length != localObject2.length)
            {
              com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.BaseAudioMixAlgorithm", "column of the road of audio + " + i + " is different.");
              localObject1 = null;
              break;
            }
          }
          label241: int j = localObject1.length;
          int k = localObject2.length / 2;
          if ((j != this.cna) || (k != this.cnb))
          {
            this.cmZ = new short[j][k];
            this.cna = j;
            this.cnb = k;
          }
          for (i = 0; i < j; i++)
          {
            Arrays.fill(this.cmZ[i], 0, k - 1, (short)0);
            for (int m = 0; m < k; m++)
              this.cmZ[i][m] = ((short)(short)(localObject1[i][(m * 2)] & 0xFF | (localObject1[i][(m * 2 + 1)] & 0xFF) << 8));
          }
          if (this.cnd != k)
          {
            this.cnd = k;
            this.cnc = new short[k];
          }
          Arrays.fill(this.cnc, 0, k - 1, (short)0);
          localObject1 = D(j, k, localObject2.length);
        }
      }
      label441: paramb.ckv = ((byte[])localObject1);
      paramb.channels = ((d)paramList.get(0)).channels;
      paramb.sampleRate = ((d)paramList.get(0)).sampleRate;
      bool = true;
    }
  }

  protected final byte[] bM(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte1 = Ed();
    byte[] arrayOfByte2;
    if (arrayOfByte1 != null)
    {
      arrayOfByte2 = arrayOfByte1;
      if (arrayOfByte1.length == paramInt1);
    }
    else
    {
      arrayOfByte2 = new byte[paramInt1];
    }
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
    {
      arrayOfByte2[(paramInt1 * 2)] = ((byte)(byte)(this.cnc[paramInt1] & 0xFF));
      arrayOfByte2[(paramInt1 * 2 + 1)] = ((byte)(byte)((this.cnc[paramInt1] & 0xFF00) >> 8));
    }
    return arrayOfByte2;
  }

  protected final short gz(int paramInt)
  {
    int i;
    if (paramInt > this.MAX_VALUE)
    {
      paramInt = (short)this.MAX_VALUE;
      i = paramInt;
    }
    while (true)
    {
      return i;
      int j;
      if (paramInt < this.MIN_VALUE)
      {
        paramInt = (short)this.MIN_VALUE;
        j = paramInt;
      }
      else
      {
        paramInt = (short)paramInt;
        j = paramInt;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.e.f
 * JD-Core Version:    0.6.2
 */