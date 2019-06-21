package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cpj extends bsr
{
  public SKBuiltinBuffer_t vJd;
  public int wPb;
  public int wem;
  public long wen;
  public int xmN;
  public int xmO;
  public int xmP;
  public int xmQ;
  public int xmR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5242);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vJd == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Buffer");
        AppMethodBeat.o(5242);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wem);
      paramArrayOfObject.ai(3, this.wen);
      paramArrayOfObject.iz(4, this.wPb);
      paramArrayOfObject.iz(5, this.xmN);
      paramArrayOfObject.iz(6, this.xmO);
      paramArrayOfObject.iz(7, this.xmP);
      paramArrayOfObject.iz(8, this.xmQ);
      paramArrayOfObject.iz(9, this.xmR);
      if (this.vJd != null)
      {
        paramArrayOfObject.iy(10, this.vJd.computeSize());
        this.vJd.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(5242);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label919;
    label919: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wem) + e.a.a.b.b.a.o(3, this.wen) + e.a.a.b.b.a.bs(4, this.wPb) + e.a.a.b.b.a.bs(5, this.xmN) + e.a.a.b.b.a.bs(6, this.xmO) + e.a.a.b.b.a.bs(7, this.xmP) + e.a.a.b.b.a.bs(8, this.xmQ) + e.a.a.b.b.a.bs(9, this.xmR);
      paramInt = i;
      if (this.vJd != null)
        paramInt = i + e.a.a.a.ix(10, this.vJd.computeSize());
      AppMethodBeat.o(5242);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vJd == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Buffer");
          AppMethodBeat.o(5242);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5242);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cpj localcpj = (cpj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5242);
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
            localcpj.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(5242);
          paramInt = i;
          break;
        case 2:
          localcpj.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5242);
          paramInt = i;
          break;
        case 3:
          localcpj.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5242);
          paramInt = i;
          break;
        case 4:
          localcpj.wPb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5242);
          paramInt = i;
          break;
        case 5:
          localcpj.xmN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5242);
          paramInt = i;
          break;
        case 6:
          localcpj.xmO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5242);
          paramInt = i;
          break;
        case 7:
          localcpj.xmP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5242);
          paramInt = i;
          break;
        case 8:
          localcpj.xmQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5242);
          paramInt = i;
          break;
        case 9:
          localcpj.xmR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5242);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpj.vJd = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(5242);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5242);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpj
 * JD-Core Version:    0.6.2
 */