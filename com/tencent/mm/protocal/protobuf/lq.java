package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class lq extends bsr
{
  public int cIb;
  public int nUf;
  public int pOA;
  public String pOB;
  public String pOC;
  public String pPW;
  public String pPZ;
  public String vFf;
  public String vPl;
  public int vPm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56720);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.nUf);
      paramArrayOfObject.iz(3, this.cIb);
      paramArrayOfObject.iz(4, this.pOA);
      if (this.vPl != null)
        paramArrayOfObject.e(5, this.vPl);
      if (this.pPW != null)
        paramArrayOfObject.e(6, this.pPW);
      if (this.pOB != null)
        paramArrayOfObject.e(7, this.pOB);
      if (this.pPZ != null)
        paramArrayOfObject.e(8, this.pPZ);
      if (this.vFf != null)
        paramArrayOfObject.e(9, this.vFf);
      if (this.pOC != null)
        paramArrayOfObject.e(10, this.pOC);
      paramArrayOfObject.iz(11, this.vPm);
      AppMethodBeat.o(56720);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label898;
    label898: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.nUf) + e.a.a.b.b.a.bs(3, this.cIb) + e.a.a.b.b.a.bs(4, this.pOA);
      paramInt = i;
      if (this.vPl != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vPl);
      i = paramInt;
      if (this.pPW != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.pPW);
      paramInt = i;
      if (this.pOB != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.pOB);
      i = paramInt;
      if (this.pPZ != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.pPZ);
      paramInt = i;
      if (this.vFf != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.vFf);
      i = paramInt;
      if (this.pOC != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.pOC);
      paramInt = i + e.a.a.b.b.a.bs(11, this.vPm);
      AppMethodBeat.o(56720);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56720);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        lq locallq = (lq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56720);
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
            locallq.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56720);
          paramInt = i;
          break;
        case 2:
          locallq.nUf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56720);
          paramInt = i;
          break;
        case 3:
          locallq.cIb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56720);
          paramInt = i;
          break;
        case 4:
          locallq.pOA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56720);
          paramInt = i;
          break;
        case 5:
          locallq.vPl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56720);
          paramInt = i;
          break;
        case 6:
          locallq.pPW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56720);
          paramInt = i;
          break;
        case 7:
          locallq.pOB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56720);
          paramInt = i;
          break;
        case 8:
          locallq.pPZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56720);
          paramInt = i;
          break;
        case 9:
          locallq.vFf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56720);
          paramInt = i;
          break;
        case 10:
          locallq.pOC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56720);
          paramInt = i;
          break;
        case 11:
          locallq.vPm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56720);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56720);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.lq
 * JD-Core Version:    0.6.2
 */