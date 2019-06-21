package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cpv extends bsr
{
  public int wPb;
  public int wem;
  public long wen;
  public int xnN;
  public int xnO;
  public LinkedList<cpy> xnP;
  public int xnQ;

  public cpv()
  {
    AppMethodBeat.i(5259);
    this.xnP = new LinkedList();
    AppMethodBeat.o(5259);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5260);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wem);
      paramArrayOfObject.ai(3, this.wen);
      paramArrayOfObject.iz(4, this.wPb);
      paramArrayOfObject.iz(5, this.xnN);
      paramArrayOfObject.iz(6, this.xnO);
      paramArrayOfObject.e(7, 8, this.xnP);
      paramArrayOfObject.iz(8, this.xnQ);
      AppMethodBeat.o(5260);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label759;
    label759: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wem) + e.a.a.b.b.a.o(3, this.wen) + e.a.a.b.b.a.bs(4, this.wPb) + e.a.a.b.b.a.bs(5, this.xnN) + e.a.a.b.b.a.bs(6, this.xnO) + e.a.a.a.c(7, 8, this.xnP) + e.a.a.b.b.a.bs(8, this.xnQ);
      AppMethodBeat.o(5260);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xnP.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(5260);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cpv localcpv = (cpv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5260);
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
            localcpv.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(5260);
          paramInt = i;
          break;
        case 2:
          localcpv.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5260);
          paramInt = i;
          break;
        case 3:
          localcpv.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5260);
          paramInt = i;
          break;
        case 4:
          localcpv.wPb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5260);
          paramInt = i;
          break;
        case 5:
          localcpv.xnN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5260);
          paramInt = i;
          break;
        case 6:
          localcpv.xnO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5260);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cpy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cpy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpv.xnP.add(localObject1);
          }
          AppMethodBeat.o(5260);
          paramInt = i;
          break;
        case 8:
          localcpv.xnQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5260);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5260);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpv
 * JD-Core Version:    0.6.2
 */