package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class col extends bsr
{
  public int vZF;
  public String wPm;
  public int wem;
  public long wen;
  public cpx xlM;
  public cpx xlN;
  public long xlQ;
  public int xlR;
  public int xmb;
  public int xmc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5230);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wPm != null)
        paramArrayOfObject.e(2, this.wPm);
      paramArrayOfObject.iz(3, this.wem);
      paramArrayOfObject.iz(4, this.xmb);
      if (this.xlM != null)
      {
        paramArrayOfObject.iy(5, this.xlM.computeSize());
        this.xlM.writeFields(paramArrayOfObject);
      }
      if (this.xlN != null)
      {
        paramArrayOfObject.iy(6, this.xlN.computeSize());
        this.xlN.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(7, this.wen);
      paramArrayOfObject.iz(8, this.vZF);
      paramArrayOfObject.ai(9, this.xlQ);
      paramArrayOfObject.iz(10, this.xmc);
      paramArrayOfObject.iz(11, this.xlR);
      AppMethodBeat.o(5230);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1050;
    label1050: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wPm != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wPm);
      i = i + e.a.a.b.b.a.bs(3, this.wem) + e.a.a.b.b.a.bs(4, this.xmb);
      paramInt = i;
      if (this.xlM != null)
        paramInt = i + e.a.a.a.ix(5, this.xlM.computeSize());
      i = paramInt;
      if (this.xlN != null)
        i = paramInt + e.a.a.a.ix(6, this.xlN.computeSize());
      paramInt = i + e.a.a.b.b.a.o(7, this.wen) + e.a.a.b.b.a.bs(8, this.vZF) + e.a.a.b.b.a.o(9, this.xlQ) + e.a.a.b.b.a.bs(10, this.xmc) + e.a.a.b.b.a.bs(11, this.xlR);
      AppMethodBeat.o(5230);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(5230);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        col localcol = (col)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5230);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcol.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(5230);
          paramInt = i;
          break;
        case 2:
          localcol.wPm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5230);
          paramInt = i;
          break;
        case 3:
          localcol.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5230);
          paramInt = i;
          break;
        case 4:
          localcol.xmb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5230);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cpx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcol.xlM = paramArrayOfObject;
          }
          AppMethodBeat.o(5230);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cpx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcol.xlN = paramArrayOfObject;
          }
          AppMethodBeat.o(5230);
          paramInt = i;
          break;
        case 7:
          localcol.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5230);
          paramInt = i;
          break;
        case 8:
          localcol.vZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5230);
          paramInt = i;
          break;
        case 9:
          localcol.xlQ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5230);
          paramInt = i;
          break;
        case 10:
          localcol.xmc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5230);
          paramInt = i;
          break;
        case 11:
          localcol.xlR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5230);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5230);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.col
 * JD-Core Version:    0.6.2
 */