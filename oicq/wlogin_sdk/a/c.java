package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.util;

public final class c extends a
{
  int BVp = 1;
  int BVq = util.BWu;
  int BVr = 22;

  public c()
  {
    this.BUz = 256;
  }

  public final byte[] Vk(int paramInt)
  {
    AppMethodBeat.i(96475);
    byte[] arrayOfByte = new byte[this.BVr];
    util.N(arrayOfByte, 0, this.BVp);
    util.O(arrayOfByte, 2, this.BVq);
    util.O(arrayOfByte, 6, 522017402);
    util.O(arrayOfByte, 10, 1);
    util.O(arrayOfByte, 14, paramInt);
    util.O(arrayOfByte, 18, 8256);
    super.Vj(this.BUz);
    super.ac(arrayOfByte, this.BVr);
    super.emG();
    arrayOfByte = super.emC();
    AppMethodBeat.o(96475);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.c
 * JD-Core Version:    0.6.2
 */