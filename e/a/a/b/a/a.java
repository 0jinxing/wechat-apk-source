package e.a.a.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.util.LinkedList;

public final class a
{
  private int Bzw;
  private byte[] buffer;
  public int bufferSize;
  private int bxl;
  public int bxm;
  public int bxn;
  private int bxo;
  private int bxr;
  private InputStream input;

  public a(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(51886);
    this.bxl = 0;
    this.bxn = 0;
    this.Bzw = 0;
    this.bxo = 2147483647;
    this.bxr = 67108864;
    this.buffer = paramArrayOfByte;
    this.bufferSize = (paramInt + 0);
    this.bxm = 0;
    this.input = null;
    AppMethodBeat.o(51886);
  }

  private int[] Vi(int paramInt)
  {
    AppMethodBeat.i(51881);
    int i = this.buffer[paramInt];
    int j = paramInt + 1;
    Object localObject;
    if (i >= 0)
    {
      localObject = new int[2];
      localObject[0] = i;
      localObject[1] = j;
      AppMethodBeat.o(51881);
      return localObject;
    }
    paramInt = i & 0x7F;
    i = this.buffer[j];
    if (i >= 0)
    {
      j++;
      paramInt |= i << 7;
    }
    label158: int k;
    do
    {
      while (true)
      {
        AppMethodBeat.o(51881);
        localObject = new int[] { paramInt, j };
        break;
        i = paramInt | (i & 0x7F) << 7;
        paramInt = this.buffer[j];
        if (paramInt >= 0)
        {
          j++;
          paramInt = i | paramInt << 14;
        }
        else
        {
          paramInt = i | (paramInt & 0x7F) << 14;
          i = this.buffer[j];
          if (i < 0)
            break label158;
          j++;
          paramInt |= i << 21;
        }
      }
      k = this.buffer[j];
      paramInt = paramInt | (i & 0x7F) << 21 | k << 28;
      i = j + 1;
      j = i;
    }
    while (k >= 0);
    for (paramInt = 0; ; paramInt++)
    {
      if (paramInt >= 5)
      {
        localObject = b.emx();
        AppMethodBeat.o(51881);
        throw ((Throwable)localObject);
      }
      if (this.buffer[i] >= 0)
      {
        localObject = new int[2];
        localObject[0] = k;
        localObject[1] = (i + 1);
        AppMethodBeat.o(51881);
        break;
      }
    }
  }

  private byte[] fr(int paramInt)
  {
    AppMethodBeat.i(51889);
    Object localObject;
    if (paramInt < 0)
    {
      localObject = b.emw();
      AppMethodBeat.o(51889);
      throw ((Throwable)localObject);
    }
    if (this.Bzw + this.bxm + paramInt > this.bxo)
    {
      fs(this.bxo - this.Bzw - this.bxm);
      localObject = b.emv();
      AppMethodBeat.o(51889);
      throw ((Throwable)localObject);
    }
    if (paramInt <= this.bufferSize - this.bxm)
    {
      localObject = new byte[paramInt];
      System.arraycopy(this.buffer, this.bxm, localObject, 0, paramInt);
      this.bxm += paramInt;
      AppMethodBeat.o(51889);
      return localObject;
    }
    if (paramInt < 2048)
    {
      localObject = new byte[paramInt];
      i = this.bufferSize - this.bxm;
      System.arraycopy(this.buffer, this.bxm, localObject, 0, i);
      this.bxm = this.bufferSize;
      sd(true);
      while (true)
      {
        if (paramInt - i <= this.bufferSize)
        {
          System.arraycopy(this.buffer, 0, localObject, i, paramInt - i);
          this.bxm = (paramInt - i);
          AppMethodBeat.o(51889);
          break;
        }
        System.arraycopy(this.buffer, 0, localObject, i, this.bufferSize);
        i += this.bufferSize;
        this.bxm = this.bufferSize;
        sd(true);
      }
    }
    int j = this.bxm;
    int k = this.bufferSize;
    this.Bzw += this.bufferSize;
    this.bxm = 0;
    this.bufferSize = 0;
    LinkedList localLinkedList = new LinkedList();
    int i = paramInt - (k - j);
    if (i <= 0)
    {
      localObject = new byte[paramInt];
      i = k - j;
      System.arraycopy(this.buffer, j, localObject, 0, i);
    }
    for (paramInt = 0; ; paramInt++)
    {
      if (paramInt >= localLinkedList.size())
      {
        AppMethodBeat.o(51889);
        break;
        localObject = new byte[Math.min(i, 2048)];
        int m = 0;
        while (true)
        {
          if (m >= localObject.length)
          {
            m = localObject.length;
            localLinkedList.add(localObject);
            i -= m;
            break;
          }
          if (this.input == null);
          for (int n = -1; n == -1; n = this.input.read((byte[])localObject, m, localObject.length - m))
          {
            localObject = b.emv();
            AppMethodBeat.o(51889);
            throw ((Throwable)localObject);
          }
          this.Bzw += n;
          m += n;
        }
      }
      byte[] arrayOfByte = (byte[])localLinkedList.get(paramInt);
      System.arraycopy(arrayOfByte, 0, localObject, i, arrayOfByte.length);
      i += arrayOfByte.length;
    }
  }

  private void fs(int paramInt)
  {
    AppMethodBeat.i(51890);
    b localb;
    if (paramInt < 0)
    {
      localb = b.emw();
      AppMethodBeat.o(51890);
      throw localb;
    }
    if (this.Bzw + this.bxm + paramInt > this.bxo)
    {
      fs(this.bxo - this.Bzw - this.bxm);
      localb = b.emv();
      AppMethodBeat.o(51890);
      throw localb;
    }
    if (paramInt < this.bufferSize - this.bxm)
    {
      this.bxm += paramInt;
      AppMethodBeat.o(51890);
      return;
    }
    int i = this.bufferSize - this.bxm;
    this.Bzw += i;
    this.bxm = 0;
    this.bufferSize = 0;
    while (true)
    {
      if (i >= paramInt)
      {
        AppMethodBeat.o(51890);
        break;
      }
      if (this.input == null);
      for (int j = -1; j <= 0; j = (int)this.input.skip(paramInt - i))
      {
        localb = b.emv();
        AppMethodBeat.o(51890);
        throw localb;
      }
      i += j;
      this.Bzw = (j + this.Bzw);
    }
  }

  private void vf()
  {
    this.bufferSize += this.bxl;
    int i = this.Bzw + this.bufferSize;
    if (i > this.bxo)
    {
      this.bxl = (i - this.bxo);
      this.bufferSize -= this.bxl;
    }
    while (true)
    {
      return;
      this.bxl = 0;
    }
  }

  private byte vh()
  {
    AppMethodBeat.i(51888);
    if (this.bxm == this.bufferSize)
      sd(true);
    byte[] arrayOfByte = this.buffer;
    int i = this.bxm;
    this.bxm = (i + 1);
    byte b = arrayOfByte[i];
    AppMethodBeat.o(51888);
    return b;
  }

  public final LinkedList<byte[]> Vh(int paramInt)
  {
    AppMethodBeat.i(51878);
    LinkedList localLinkedList = new LinkedList();
    int i = vd();
    try
    {
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(this.buffer, this.bxm, arrayOfByte, 0, i);
      localLinkedList.add(arrayOfByte);
      this.bxm = (i + this.bxm);
      i = this.bxm;
      if (this.bxm == this.bufferSize)
      {
        AppMethodBeat.o(51878);
        return localLinkedList;
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      localObject = new OutOfMemoryError("alloc bytes:".concat(String.valueOf(i)));
      AppMethodBeat.o(51878);
      throw ((Throwable)localObject);
    }
    Object localObject = Vi(i);
    for (i = localObject[0]; ; i = localObject[0])
    {
      if (e.a.a.b.a.fz(i) != paramInt);
      do
      {
        AppMethodBeat.o(51878);
        break;
        this.bxm = localObject[1];
        i = vd();
        localObject = new byte[i];
        System.arraycopy(this.buffer, this.bxm, localObject, 0, i);
        localLinkedList.add(localObject);
        this.bxm = (i + this.bxm);
      }
      while (this.bxm == this.bufferSize);
      localObject = Vi(this.bxm);
    }
  }

  public final boolean ehX()
  {
    AppMethodBeat.i(51877);
    boolean bool;
    if (vd() != 0)
    {
      bool = true;
      AppMethodBeat.o(51877);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(51877);
    }
  }

  public final int eia()
  {
    AppMethodBeat.i(51884);
    int i = vh();
    int j = vh();
    int k = vh();
    int m = vh();
    AppMethodBeat.o(51884);
    return i & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16 | (m & 0xFF) << 24;
  }

  public final long eib()
  {
    AppMethodBeat.i(51885);
    int i = vh();
    int j = vh();
    int k = vh();
    int m = vh();
    int n = vh();
    int i1 = vh();
    int i2 = vh();
    int i3 = vh();
    long l1 = i;
    long l2 = j;
    long l3 = k;
    long l4 = m;
    long l5 = n;
    long l6 = i1;
    long l7 = i2;
    long l8 = i3;
    AppMethodBeat.o(51885);
    return (l2 & 0xFF) << 8 | l1 & 0xFF | (l3 & 0xFF) << 16 | (l4 & 0xFF) << 24 | (l5 & 0xFF) << 32 | (l6 & 0xFF) << 40 | (l7 & 0xFF) << 48 | (l8 & 0xFF) << 56;
  }

  public final LinkedList<Integer> emt()
  {
    AppMethodBeat.i(51876);
    LinkedList localLinkedList = new LinkedList();
    while (true)
    {
      if (this.bxm >= this.bufferSize)
      {
        AppMethodBeat.o(51876);
        return localLinkedList;
      }
      localLinkedList.add(Integer.valueOf(vd()));
    }
  }

  public final com.tencent.mm.bt.b emu()
  {
    AppMethodBeat.i(51880);
    int i = vd();
    com.tencent.mm.bt.b localb;
    if ((i < this.bufferSize - this.bxm) && (i > 0))
    {
      localb = com.tencent.mm.bt.b.y(this.buffer, this.bxm, i);
      this.bxm = (i + this.bxm);
      AppMethodBeat.o(51880);
    }
    while (true)
    {
      return localb;
      localb = com.tencent.mm.bt.b.bI(fr(i));
      AppMethodBeat.o(51880);
    }
  }

  public final String readString()
  {
    AppMethodBeat.i(51879);
    int i = vd();
    String str;
    if ((i < this.bufferSize - this.bxm) && (i > 0))
    {
      str = new String(this.buffer, this.bxm, i, "UTF-8");
      this.bxm = (i + this.bxm);
      AppMethodBeat.o(51879);
    }
    while (true)
    {
      return str;
      str = new String(fr(i), "UTF-8");
      AppMethodBeat.o(51879);
    }
  }

  public final boolean sd(boolean paramBoolean)
  {
    AppMethodBeat.i(51887);
    Object localObject;
    if (this.bxm < this.bufferSize)
    {
      localObject = new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
      AppMethodBeat.o(51887);
      throw ((Throwable)localObject);
    }
    if (this.Bzw + this.bufferSize == this.bxo)
    {
      if (paramBoolean)
      {
        localObject = b.emv();
        AppMethodBeat.o(51887);
        throw ((Throwable)localObject);
      }
      AppMethodBeat.o(51887);
      paramBoolean = false;
    }
    while (true)
    {
      return paramBoolean;
      this.Bzw += this.bufferSize;
      this.bxm = 0;
      if (this.input == null);
      for (int i = -1; ; i = this.input.read(this.buffer))
      {
        this.bufferSize = i;
        if (this.bufferSize != -1)
          break label158;
        this.bufferSize = 0;
        if (!paramBoolean)
          break;
        localObject = b.emv();
        AppMethodBeat.o(51887);
        throw ((Throwable)localObject);
      }
      AppMethodBeat.o(51887);
      paramBoolean = false;
      continue;
      label158: vf();
      i = this.Bzw + this.bufferSize + this.bxl;
      if ((i > this.bxr) || (i < 0))
      {
        localObject = b.emz();
        AppMethodBeat.o(51887);
        throw ((Throwable)localObject);
      }
      paramBoolean = true;
      AppMethodBeat.o(51887);
    }
  }

  public final int vd()
  {
    AppMethodBeat.i(51882);
    int i = vh();
    if (i >= 0)
    {
      AppMethodBeat.o(51882);
      return i;
    }
    int j = i & 0x7F;
    i = vh();
    if (i >= 0)
      i = j | i << 7;
    label108: int k;
    do
    {
      while (true)
      {
        AppMethodBeat.o(51882);
        break;
        i = j | (i & 0x7F) << 7;
        j = vh();
        if (j >= 0)
        {
          i |= j << 14;
        }
        else
        {
          j = i | (j & 0x7F) << 14;
          i = vh();
          if (i < 0)
            break label108;
          i = j | i << 21;
        }
      }
      k = vh();
      j = j | (i & 0x7F) << 21 | k << 28;
      i = j;
    }
    while (k >= 0);
    for (i = 0; ; i++)
    {
      if (i >= 5)
      {
        b localb = b.emx();
        AppMethodBeat.o(51882);
        throw localb;
      }
      if (vh() >= 0)
      {
        AppMethodBeat.o(51882);
        i = j;
        break;
      }
    }
  }

  public final long ve()
  {
    AppMethodBeat.i(51883);
    int i = 0;
    long l = 0L;
    while (true)
    {
      if (i >= 64)
      {
        b localb = b.emx();
        AppMethodBeat.o(51883);
        throw localb;
      }
      int j = vh();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0)
      {
        AppMethodBeat.o(51883);
        return l;
      }
      i += 7;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     e.a.a.b.a.a
 * JD-Core Version:    0.6.2
 */