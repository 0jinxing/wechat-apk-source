package com.tencent.tinker.a.a;

import com.tencent.tinker.a.a.a.a;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class t
{
  public final t.a AyA = new t.a(4097, true);
  public final t.a AyB = new t.a(4098, true);
  public final t.a AyC = new t.a(4099, true);
  public final t.a AyD = new t.a(8192, false);
  public final t.a AyE = new t.a(8193, true);
  public final t.a AyF = new t.a(8194, false);
  public final t.a AyG = new t.a(8195, false);
  public final t.a AyH = new t.a(8196, false);
  public final t.a AyI = new t.a(8197, false);
  public final t.a AyJ = new t.a(8198, true);
  public final t.a[] AyK = { this.Ays, this.Ayt, this.Ayu, this.Ayv, this.Ayw, this.Ayx, this.Ayy, this.Ayz, this.AyA, this.AyB, this.AyC, this.AyD, this.AyE, this.AyF, this.AyG, this.AyH, this.AyI, this.AyJ };
  public int AyL;
  public int AyM;
  public int AyN;
  public final t.a Ays = new t.a(0, true);
  public final t.a Ayt = new t.a(1, true);
  public final t.a Ayu = new t.a(2, true);
  public final t.a Ayv = new t.a(3, true);
  public final t.a Ayw = new t.a(4, true);
  public final t.a Ayx = new t.a(5, true);
  public final t.a Ayy = new t.a(6, true);
  public final t.a Ayz = new t.a(4096, true);
  public int fileSize;
  public int gai;
  public int lgV;
  public byte[] nTL = new byte[20];

  final void a(i.e parame)
  {
    int i = parame.aEY.getInt();
    int j = 0;
    t.a locala;
    for (Object localObject = null; j < i; localObject = locala)
    {
      int k = parame.aEY.getShort();
      parame.aEY.getShort();
      for (locala : this.AyK)
        if (locala.AyO == k)
        {
          ??? = parame.aEY.getInt();
          ??? = parame.aEY.getInt();
          if (((locala.size == 0) || (locala.size == ???)) && ((locala.off == -1) || (locala.off == ???)))
            break label180;
          throw new j("Unexpected map value for 0x" + Integer.toHexString(k));
        }
      throw new IllegalArgumentException("No such map item: ".concat(String.valueOf(k)));
      label180: locala.size = ???;
      locala.off = ???;
      if ((localObject != null) && (localObject.off > locala.off))
        throw new j("Map is unsorted at " + localObject + ", " + locala);
      j++;
    }
    this.Ays.off = 0;
    Arrays.sort(this.AyK);
    for (j = 1; j < this.AyK.length; j++)
      if (this.AyK[j].off == -1)
        this.AyK[j].off = this.AyK[(j - 1)].off;
  }

  public final void b(i.e parame)
  {
    t.a[] arrayOfa1 = this.AyK;
    int i = arrayOfa1.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      m = k;
      if (arrayOfa1[j].exists())
        m = k + 1;
      j++;
    }
    parame.writeInt(k);
    for (arrayOfa1 : this.AyK)
      if (arrayOfa1.exists())
      {
        parame.writeShort(arrayOfa1.AyO);
        parame.writeShort((short)0);
        parame.writeInt(arrayOfa1.size);
        parame.writeInt(arrayOfa1.off);
      }
  }

  public final void dRV()
  {
    int i = this.fileSize;
    int j = this.AyK.length - 1;
    while (j >= 0)
    {
      t.a locala = this.AyK[j];
      int k = i;
      if (locala.off != -1)
      {
        if (locala.off > i)
          throw new j("Map is unsorted at ".concat(String.valueOf(locala)));
        locala.byteCount = (i - locala.off);
        k = locala.off;
      }
      j--;
      i = k;
    }
    this.AyN = (this.Ays.byteCount + this.Ayt.byteCount + this.Ayu.byteCount + this.Ayv.byteCount + this.Ayw.byteCount + this.Ayx.byteCount + this.Ayy.byteCount);
    this.lgV = (this.fileSize - this.AyN);
  }

  public static abstract class a$a<T>
    implements Comparable<T>
  {
    public int off;

    public a$a(int paramInt)
    {
      this.off = paramInt;
    }

    public boolean equals(Object paramObject)
    {
      if (compareTo(paramObject) == 0);
      for (boolean bool = true; ; bool = false)
        return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.a.t
 * JD-Core Version:    0.6.2
 */