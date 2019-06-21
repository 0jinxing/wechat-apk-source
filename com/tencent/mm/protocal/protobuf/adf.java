package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class adf extends bsr
{
  public int pXL;
  public String vOA;
  public String vOB;
  public String vOC;
  public String vOD;
  public String vOE;
  public String vOz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(59602);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vOz != null)
        paramArrayOfObject.e(2, this.vOz);
      if (this.vOA != null)
        paramArrayOfObject.e(3, this.vOA);
      if (this.vOB != null)
        paramArrayOfObject.e(4, this.vOB);
      if (this.vOC != null)
        paramArrayOfObject.e(5, this.vOC);
      if (this.vOD != null)
        paramArrayOfObject.e(6, this.vOD);
      paramArrayOfObject.iz(7, this.pXL);
      if (this.vOE != null)
        paramArrayOfObject.e(8, this.vOE);
      AppMethodBeat.o(59602);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label760;
    label760: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vOz != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vOz);
      i = paramInt;
      if (this.vOA != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vOA);
      int j = i;
      if (this.vOB != null)
        j = i + e.a.a.b.b.a.f(4, this.vOB);
      paramInt = j;
      if (this.vOC != null)
        paramInt = j + e.a.a.b.b.a.f(5, this.vOC);
      i = paramInt;
      if (this.vOD != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vOD);
      i += e.a.a.b.b.a.bs(7, this.pXL);
      paramInt = i;
      if (this.vOE != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vOE);
      AppMethodBeat.o(59602);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(59602);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        adf localadf = (adf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(59602);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localadf.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(59602);
          paramInt = i;
          break;
        case 2:
          localadf.vOz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(59602);
          paramInt = i;
          break;
        case 3:
          localadf.vOA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(59602);
          paramInt = i;
          break;
        case 4:
          localadf.vOB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(59602);
          paramInt = i;
          break;
        case 5:
          localadf.vOC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(59602);
          paramInt = i;
          break;
        case 6:
          localadf.vOD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(59602);
          paramInt = i;
          break;
        case 7:
          localadf.pXL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(59602);
          paramInt = i;
          break;
        case 8:
          localadf.vOE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(59602);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(59602);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.adf
 * JD-Core Version:    0.6.2
 */