package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bpu extends bsr
{
  public String pXM;
  public String vOA;
  public String vOB;
  public String vOC;
  public String vOD;
  public String vOz;
  public int wBd;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80160);
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
      paramArrayOfObject.iz(7, this.wBd);
      if (this.pXM != null)
        paramArrayOfObject.e(8, this.pXM);
      AppMethodBeat.o(80160);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label757;
    label757: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vOz != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vOz);
      paramInt = i;
      if (this.vOA != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vOA);
      i = paramInt;
      if (this.vOB != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vOB);
      paramInt = i;
      if (this.vOC != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vOC);
      i = paramInt;
      if (this.vOD != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vOD);
      i += e.a.a.b.b.a.bs(7, this.wBd);
      paramInt = i;
      if (this.pXM != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.pXM);
      AppMethodBeat.o(80160);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80160);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bpu localbpu = (bpu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80160);
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
            localbpu.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(80160);
          paramInt = i;
          break;
        case 2:
          localbpu.vOz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80160);
          paramInt = i;
          break;
        case 3:
          localbpu.vOA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80160);
          paramInt = i;
          break;
        case 4:
          localbpu.vOB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80160);
          paramInt = i;
          break;
        case 5:
          localbpu.vOC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80160);
          paramInt = i;
          break;
        case 6:
          localbpu.vOD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80160);
          paramInt = i;
          break;
        case 7:
          localbpu.wBd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80160);
          paramInt = i;
          break;
        case 8:
          localbpu.pXM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80160);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80160);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bpu
 * JD-Core Version:    0.6.2
 */