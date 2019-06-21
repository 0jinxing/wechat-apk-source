package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cle extends bsr
{
  public String jBB;
  public int vIJ;
  public String vLs;
  public LinkedList<bbl> wCo;
  public int xiQ;
  public int xiR;
  public LinkedList<azc> xiS;

  public cle()
  {
    AppMethodBeat.i(73773);
    this.wCo = new LinkedList();
    this.xiS = new LinkedList();
    AppMethodBeat.o(73773);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73774);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.jBB != null)
        paramArrayOfObject.e(2, this.jBB);
      paramArrayOfObject.iz(3, this.vIJ);
      if (this.vLs != null)
        paramArrayOfObject.e(4, this.vLs);
      paramArrayOfObject.iz(5, this.xiQ);
      paramArrayOfObject.e(6, 8, this.wCo);
      paramArrayOfObject.iz(7, this.xiR);
      paramArrayOfObject.e(8, 8, this.xiS);
      AppMethodBeat.o(73774);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label877;
    label877: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.jBB);
      i += e.a.a.b.b.a.bs(3, this.vIJ);
      paramInt = i;
      if (this.vLs != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vLs);
      paramInt = paramInt + e.a.a.b.b.a.bs(5, this.xiQ) + e.a.a.a.c(6, 8, this.wCo) + e.a.a.b.b.a.bs(7, this.xiR) + e.a.a.a.c(8, 8, this.xiS);
      AppMethodBeat.o(73774);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wCo.clear();
        this.xiS.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73774);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cle localcle = (cle)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73774);
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
            localcle.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(73774);
          paramInt = i;
          break;
        case 2:
          localcle.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73774);
          paramInt = i;
          break;
        case 3:
          localcle.vIJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73774);
          paramInt = i;
          break;
        case 4:
          localcle.vLs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73774);
          paramInt = i;
          break;
        case 5:
          localcle.xiQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73774);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bbl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcle.wCo.add(paramArrayOfObject);
          }
          AppMethodBeat.o(73774);
          paramInt = i;
          break;
        case 7:
          localcle.xiR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73774);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new azc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((azc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcle.xiS.add(localObject1);
          }
          AppMethodBeat.o(73774);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73774);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cle
 * JD-Core Version:    0.6.2
 */