package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cap extends com.tencent.mm.bt.a
{
  public String jBB;
  public int wCd;
  public String wZP;
  public int wZQ;
  public String wZR;
  public int wZS;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94565);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wZP != null)
        paramArrayOfObject.e(1, this.wZP);
      paramArrayOfObject.iz(2, this.wZQ);
      if (this.jBB != null)
        paramArrayOfObject.e(3, this.jBB);
      if (this.wZR != null)
        paramArrayOfObject.e(4, this.wZR);
      paramArrayOfObject.iz(5, this.wCd);
      paramArrayOfObject.iz(6, this.wZS);
      AppMethodBeat.o(94565);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wZP == null)
        break label494;
    label494: for (paramInt = e.a.a.b.b.a.f(1, this.wZP) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wZQ);
      paramInt = i;
      if (this.jBB != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.jBB);
      i = paramInt;
      if (this.wZR != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wZR);
      paramInt = i + e.a.a.b.b.a.bs(5, this.wCd) + e.a.a.b.b.a.bs(6, this.wZS);
      AppMethodBeat.o(94565);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94565);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cap localcap = (cap)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94565);
          break;
        case 1:
          localcap.wZP = locala.BTU.readString();
          AppMethodBeat.o(94565);
          paramInt = i;
          break;
        case 2:
          localcap.wZQ = locala.BTU.vd();
          AppMethodBeat.o(94565);
          paramInt = i;
          break;
        case 3:
          localcap.jBB = locala.BTU.readString();
          AppMethodBeat.o(94565);
          paramInt = i;
          break;
        case 4:
          localcap.wZR = locala.BTU.readString();
          AppMethodBeat.o(94565);
          paramInt = i;
          break;
        case 5:
          localcap.wCd = locala.BTU.vd();
          AppMethodBeat.o(94565);
          paramInt = i;
          break;
        case 6:
          localcap.wZS = locala.BTU.vd();
          AppMethodBeat.o(94565);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94565);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cap
 * JD-Core Version:    0.6.2
 */