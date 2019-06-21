package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class biu extends com.tencent.mm.bt.a
{
  public int jBT;
  public int vKo;
  public String wMe;
  public b wMf;
  public b wMg;
  public b wMh;
  public String wMi;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56882);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wMe != null)
        paramArrayOfObject.e(1, this.wMe);
      paramArrayOfObject.iz(2, this.jBT);
      if (this.wMf != null)
        paramArrayOfObject.c(3, this.wMf);
      if (this.wMg != null)
        paramArrayOfObject.c(4, this.wMg);
      if (this.wMh != null)
        paramArrayOfObject.c(5, this.wMh);
      paramArrayOfObject.iz(6, this.vKo);
      if (this.wMi != null)
        paramArrayOfObject.e(7, this.wMi);
      AppMethodBeat.o(56882);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wMe == null)
        break label577;
    label577: for (paramInt = e.a.a.b.b.a.f(1, this.wMe) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jBT);
      paramInt = i;
      if (this.wMf != null)
        paramInt = i + e.a.a.b.b.a.b(3, this.wMf);
      i = paramInt;
      if (this.wMg != null)
        i = paramInt + e.a.a.b.b.a.b(4, this.wMg);
      paramInt = i;
      if (this.wMh != null)
        paramInt = i + e.a.a.b.b.a.b(5, this.wMh);
      i = paramInt + e.a.a.b.b.a.bs(6, this.vKo);
      paramInt = i;
      if (this.wMi != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wMi);
      AppMethodBeat.o(56882);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56882);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        biu localbiu = (biu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56882);
          break;
        case 1:
          localbiu.wMe = locala.BTU.readString();
          AppMethodBeat.o(56882);
          paramInt = i;
          break;
        case 2:
          localbiu.jBT = locala.BTU.vd();
          AppMethodBeat.o(56882);
          paramInt = i;
          break;
        case 3:
          localbiu.wMf = locala.BTU.emu();
          AppMethodBeat.o(56882);
          paramInt = i;
          break;
        case 4:
          localbiu.wMg = locala.BTU.emu();
          AppMethodBeat.o(56882);
          paramInt = i;
          break;
        case 5:
          localbiu.wMh = locala.BTU.emu();
          AppMethodBeat.o(56882);
          paramInt = i;
          break;
        case 6:
          localbiu.vKo = locala.BTU.vd();
          AppMethodBeat.o(56882);
          paramInt = i;
          break;
        case 7:
          localbiu.wMi = locala.BTU.readString();
          AppMethodBeat.o(56882);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56882);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.biu
 * JD-Core Version:    0.6.2
 */