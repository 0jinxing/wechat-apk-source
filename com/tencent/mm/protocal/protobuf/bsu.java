package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bsu extends bsr
{
  public String csB;
  public int nSc;
  public String nSd;
  public int vzO;
  public long wKC;
  public int wUR;
  public int wUS;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56960);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.csB != null)
        paramArrayOfObject.e(2, this.csB);
      paramArrayOfObject.iz(3, this.nSc);
      paramArrayOfObject.iz(4, this.vzO);
      paramArrayOfObject.ai(5, this.wKC);
      paramArrayOfObject.iz(6, this.wUR);
      if (this.nSd != null)
        paramArrayOfObject.e(7, this.nSd);
      paramArrayOfObject.iz(8, this.wUS);
      AppMethodBeat.o(56960);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label684;
    label684: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.csB);
      i = i + e.a.a.b.b.a.bs(3, this.nSc) + e.a.a.b.b.a.bs(4, this.vzO) + e.a.a.b.b.a.o(5, this.wKC) + e.a.a.b.b.a.bs(6, this.wUR);
      paramInt = i;
      if (this.nSd != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.nSd);
      paramInt += e.a.a.b.b.a.bs(8, this.wUS);
      AppMethodBeat.o(56960);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56960);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bsu localbsu = (bsu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56960);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbsu.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56960);
          paramInt = i;
          break;
        case 2:
          localbsu.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56960);
          paramInt = i;
          break;
        case 3:
          localbsu.nSc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56960);
          paramInt = i;
          break;
        case 4:
          localbsu.vzO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56960);
          paramInt = i;
          break;
        case 5:
          localbsu.wKC = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56960);
          paramInt = i;
          break;
        case 6:
          localbsu.wUR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56960);
          paramInt = i;
          break;
        case 7:
          localbsu.nSd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56960);
          paramInt = i;
          break;
        case 8:
          localbsu.wUS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56960);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56960);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bsu
 * JD-Core Version:    0.6.2
 */