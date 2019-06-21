package com.tencent.mm.audio.mix.e;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.c.f;
import com.tencent.mm.audio.mix.c.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class e
{
  public static int cmY = 18432;
  private int cmQ;
  private int cmR;
  private int cmS;
  private int cmT;
  private ArrayList<String> cmU;
  private HashMap<String, g> cmV;
  private HashMap<String, byte[]> cmW;
  private HashMap<String, Integer> cmX;
  private i cmq;

  public e()
  {
    AppMethodBeat.i(137117);
    this.cmT = 0;
    this.cmU = new ArrayList();
    this.cmV = new HashMap();
    this.cmW = new HashMap();
    this.cmX = new HashMap();
    this.cmq = new d();
    this.cmq.init();
    AppMethodBeat.o(137117);
  }

  private byte[] K(List<com.tencent.mm.audio.mix.a.d> paramList)
  {
    Object localObject = null;
    AppMethodBeat.i(137122);
    if (paramList.isEmpty())
    {
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioSyncMixController", "list is invalid");
      AppMethodBeat.o(137122);
      paramList = localObject;
    }
    while (true)
    {
      return paramList;
      if (paramList.size() == 1)
      {
        paramList = ((com.tencent.mm.audio.mix.a.d)paramList.get(0)).ckv;
        AppMethodBeat.o(137122);
      }
      else if (this.cmq == null)
      {
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioSyncMixController", "mixer is null");
        AppMethodBeat.o(137122);
        paramList = localObject;
      }
      else
      {
        paramList = this.cmq.I(paramList);
        if (paramList != null)
        {
          paramList = paramList.ckv;
          AppMethodBeat.o(137122);
        }
        else
        {
          AppMethodBeat.o(137122);
          paramList = localObject;
        }
      }
    }
  }

  public final byte[] Ec()
  {
    AppMethodBeat.i(137120);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.cmU.iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      if (this.cmW.containsKey(localObject))
      {
        byte[] arrayOfByte1 = (byte[])this.cmW.get(localObject);
        int i = ((Integer)this.cmX.get(localObject)).intValue();
        com.tencent.mm.audio.mix.a.d locald = new com.tencent.mm.audio.mix.a.d();
        byte[] arrayOfByte2 = new byte[this.cmT];
        if ((i > 0) && (i <= this.cmT))
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i);
        while (true)
        {
          locald.ckv = arrayOfByte2;
          localArrayList.add(locald);
          this.cmX.put(localObject, Integer.valueOf(0));
          Arrays.fill(arrayOfByte1, 0, cmY, (byte)0);
          this.cmW.put(localObject, arrayOfByte1);
          break;
          if (arrayOfByte1 != null)
            System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, this.cmT);
        }
      }
    }
    Object localObject = K(localArrayList);
    AppMethodBeat.o(137120);
    return localObject;
  }

  public final byte[] J(List<com.tencent.mm.audio.mix.a.d> paramList)
  {
    AppMethodBeat.i(137119);
    if (paramList.isEmpty())
    {
      paramList = null;
      AppMethodBeat.o(137119);
      return paramList;
    }
    ArrayList localArrayList = new ArrayList();
    if (paramList.size() > 1);
    com.tencent.mm.audio.mix.a.d locald1;
    for (int i = 1; ; i = 0)
    {
      Iterator localIterator = paramList.iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label849;
        locald1 = (com.tencent.mm.audio.mix.a.d)localIterator.next();
        if ((locald1 != null) && (locald1.ckv != null) && (!TextUtils.isEmpty(locald1.ckD)))
          break;
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioSyncMixController", "track or pcmData is null, or audioId is empty");
        paramList = locald1;
        localArrayList.add(paramList);
      }
    }
    label154: com.tencent.mm.audio.mix.a.d locald2;
    byte[] arrayOfByte1;
    if (this.cmV.containsKey(locald1.ckD))
    {
      paramList = (g)this.cmV.get(locald1.ckD);
      locald2 = new com.tencent.mm.audio.mix.a.d();
      locald2.ckv = paramList.F(locald1.ckv);
      locald2.ckD = locald1.ckD;
      locald2.ckG = locald1.ckG;
      locald2.channels = locald1.channels;
      locald2.sampleRate = locald1.sampleRate;
      locald2.cku = locald1.cku;
      if (i != 0)
      {
        arrayOfByte1 = locald2.ckv;
        if ((arrayOfByte1 != null) && (arrayOfByte1.length != 0))
        {
          paramList = null;
          if (!this.cmW.containsKey(locald2.ckD))
            break label866;
          paramList = (byte[])this.cmW.get(locald2.ckD);
        }
      }
    }
    label345: label866: for (int j = ((Integer)this.cmX.get(locald2.ckD)).intValue(); ; j = 0)
    {
      if ((j > 0) && (paramList != null))
        if (arrayOfByte1.length <= cmY - j)
        {
          System.arraycopy(arrayOfByte1, 0, paramList, j, arrayOfByte1.length);
          j = arrayOfByte1.length + j;
          if (j <= this.cmT)
            break label600;
          j -= this.cmT;
          arrayOfByte1 = new byte[this.cmT];
          System.arraycopy(paramList, 0, arrayOfByte1, 0, this.cmT);
          locald2.ckv = arrayOfByte1;
          arrayOfByte1 = new byte[j];
          System.arraycopy(paramList, this.cmT, arrayOfByte1, 0, j);
          Arrays.fill(paramList, 0, cmY, (byte)0);
          System.arraycopy(arrayOfByte1, 0, paramList, 0, j);
          this.cmX.put(locald2.ckD, Integer.valueOf(j));
          this.cmW.put(locald2.ckD, paramList);
        }
      do
        while (true)
        {
          if (locald2.ckv.equals(locald1.ckv))
          {
            paramList = new byte[locald2.ckv.length];
            System.arraycopy(locald2.ckv, 0, paramList, 0, locald2.ckv.length);
            locald2.ckv = paramList;
          }
          paramList = locald2;
          break;
          paramList = new f(locald1.ckD, locald1.sampleRate, locald1.channels, locald1.cku, this.cmQ, this.cmR, this.cmS);
          this.cmV.put(locald1.ckD, paramList);
          break label154;
          System.arraycopy(arrayOfByte1, 0, paramList, j, cmY - j);
          j = cmY - j + j;
          break label345;
          arrayOfByte1 = new byte[this.cmT];
          System.arraycopy(paramList, 0, arrayOfByte1, 0, j);
          locald2.ckv = arrayOfByte1;
          j = 0;
          Arrays.fill(paramList, 0, cmY, (byte)0);
          break label428;
          if (arrayOfByte1.length >= this.cmT)
            break label687;
          paramList = new byte[this.cmT];
          Arrays.fill(paramList, 0, this.cmT, (byte)0);
          System.arraycopy(arrayOfByte1, 0, paramList, 0, arrayOfByte1.length);
          locald2.ckv = paramList;
        }
      while (arrayOfByte1.length <= this.cmT);
      byte[] arrayOfByte2 = new byte[this.cmT];
      Arrays.fill(arrayOfByte2, 0, this.cmT, (byte)0);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, this.cmT);
      locald2.ckv = arrayOfByte2;
      if (paramList == null)
        if (arrayOfByte1.length > cmY)
        {
          j = arrayOfByte1.length;
          label754: cmY = j;
          paramList = new byte[j];
        }
      while (true)
      {
        Arrays.fill(paramList, 0, cmY, (byte)0);
        System.arraycopy(arrayOfByte1, this.cmT, paramList, 0, arrayOfByte1.length - this.cmT);
        int k = arrayOfByte1.length;
        j = this.cmT;
        this.cmX.put(locald2.ckD, Integer.valueOf(k - j));
        this.cmW.put(locald2.ckD, paramList);
        break label460;
        j = cmY;
        break label754;
        paramList = K(localArrayList);
        AppMethodBeat.o(137119);
        break;
      }
    }
  }

  public final void r(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(137118);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioSyncMixController", "init, outSample:%d, outChannel:%d, outBitDepth:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.cmQ = paramInt1;
    this.cmR = paramInt2;
    this.cmS = paramInt3;
    this.cmT = paramInt4;
    if (this.cmT <= 0)
      if (2 != paramInt3)
        break label98;
    label98: for (paramInt3 = 16; ; paramInt3 = 8)
    {
      this.cmT = (paramInt3 * (paramInt1 * paramInt2) * 20 / 8 / 1000);
      AppMethodBeat.o(137118);
      return;
    }
  }

  public final void release()
  {
    AppMethodBeat.i(137121);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioSyncMixController", "release, ids size:%d", new Object[] { Integer.valueOf(this.cmU.size()) });
    Iterator localIterator = this.cmU.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (this.cmV.containsKey(str))
      {
        g localg = (g)this.cmV.remove(str);
        if (localg != null)
          localg.release();
      }
      this.cmW.remove(str);
      this.cmX.remove(str);
    }
    this.cmV.clear();
    this.cmW.clear();
    this.cmX.clear();
    this.cmU.clear();
    if (this.cmq != null)
      this.cmq = null;
    AppMethodBeat.o(137121);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.e.e
 * JD-Core Version:    0.6.2
 */