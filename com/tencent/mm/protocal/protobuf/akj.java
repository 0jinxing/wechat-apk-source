package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class akj extends bsr
{
  public int Height;
  public int Width;
  public String luQ;
  public float vRp;
  public float vRq;
  public int wqd;
  public int wqe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(113780);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.r(2, this.vRp);
      paramArrayOfObject.r(3, this.vRq);
      paramArrayOfObject.iz(4, this.Width);
      paramArrayOfObject.iz(5, this.Height);
      if (this.luQ != null)
        paramArrayOfObject.e(6, this.luQ);
      paramArrayOfObject.iz(7, this.wqd);
      paramArrayOfObject.iz(8, this.wqe);
      AppMethodBeat.o(113780);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label671;
    label671: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + (e.a.a.b.b.a.fv(2) + 4) + (e.a.a.b.b.a.fv(3) + 4) + e.a.a.b.b.a.bs(4, this.Width) + e.a.a.b.b.a.bs(5, this.Height);
      paramInt = i;
      if (this.luQ != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.luQ);
      paramInt = paramInt + e.a.a.b.b.a.bs(7, this.wqd) + e.a.a.b.b.a.bs(8, this.wqe);
      AppMethodBeat.o(113780);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(113780);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        akj localakj = (akj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(113780);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localakj.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(113780);
          paramInt = i;
          break;
        case 2:
          localakj.vRp = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(113780);
          paramInt = i;
          break;
        case 3:
          localakj.vRq = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(113780);
          paramInt = i;
          break;
        case 4:
          localakj.Width = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(113780);
          paramInt = i;
          break;
        case 5:
          localakj.Height = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(113780);
          paramInt = i;
          break;
        case 6:
          localakj.luQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(113780);
          paramInt = i;
          break;
        case 7:
          localakj.wqd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(113780);
          paramInt = i;
          break;
        case 8:
          localakj.wqe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(113780);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(113780);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.akj
 * JD-Core Version:    0.6.2
 */