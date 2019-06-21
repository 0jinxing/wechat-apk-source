package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bll extends bsr
{
  public String ProductID;
  public String ndT;
  public int pdc;
  public String wOs;
  public String wOt;
  public int wOu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56931);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.ProductID != null)
        paramArrayOfObject.e(2, this.ProductID);
      if (this.wOs != null)
        paramArrayOfObject.e(3, this.wOs);
      if (this.wOt != null)
        paramArrayOfObject.e(4, this.wOt);
      paramArrayOfObject.iz(5, this.pdc);
      if (this.ndT != null)
        paramArrayOfObject.e(7, this.ndT);
      paramArrayOfObject.iz(8, this.wOu);
      AppMethodBeat.o(56931);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label678;
    label678: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ProductID != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ProductID);
      paramInt = i;
      if (this.wOs != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wOs);
      i = paramInt;
      if (this.wOt != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wOt);
      i += e.a.a.b.b.a.bs(5, this.pdc);
      paramInt = i;
      if (this.ndT != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.ndT);
      paramInt += e.a.a.b.b.a.bs(8, this.wOu);
      AppMethodBeat.o(56931);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56931);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bll localbll = (bll)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 6:
        default:
          paramInt = -1;
          AppMethodBeat.o(56931);
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
            localbll.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56931);
          paramInt = i;
          break;
        case 2:
          localbll.ProductID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56931);
          paramInt = i;
          break;
        case 3:
          localbll.wOs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56931);
          paramInt = i;
          break;
        case 4:
          localbll.wOt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56931);
          paramInt = i;
          break;
        case 5:
          localbll.pdc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56931);
          paramInt = i;
          break;
        case 7:
          localbll.ndT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56931);
          paramInt = i;
          break;
        case 8:
          localbll.wOu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56931);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56931);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bll
 * JD-Core Version:    0.6.2
 */