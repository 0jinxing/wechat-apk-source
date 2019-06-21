package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class iq extends com.tencent.mm.bt.a
{
  public int Ret;
  public String jBF;
  public String vKF;
  public String vKK;
  public bbv vKL;
  public asq vKM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(10159);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.Ret);
      if (this.vKK != null)
        paramArrayOfObject.e(2, this.vKK);
      if (this.vKL != null)
      {
        paramArrayOfObject.iy(3, this.vKL.computeSize());
        this.vKL.writeFields(paramArrayOfObject);
      }
      if (this.vKF != null)
        paramArrayOfObject.e(4, this.vKF);
      if (this.jBF != null)
        paramArrayOfObject.e(5, this.jBF);
      if (this.vKM != null)
      {
        paramArrayOfObject.iy(6, this.vKM.computeSize());
        this.vKM.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(10159);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.Ret) + 0;
        paramInt = i;
        if (this.vKK != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.vKK);
        i = paramInt;
        if (this.vKL != null)
          i = paramInt + e.a.a.a.ix(3, this.vKL.computeSize());
        paramInt = i;
        if (this.vKF != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.vKF);
        i = paramInt;
        if (this.jBF != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.jBF);
        paramInt = i;
        if (this.vKM != null)
          paramInt = i + e.a.a.a.ix(6, this.vKM.computeSize());
        AppMethodBeat.o(10159);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10159);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        iq localiq = (iq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10159);
          break;
        case 1:
          localiq.Ret = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10159);
          paramInt = 0;
          break;
        case 2:
          localiq.vKK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10159);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bbv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localiq.vKL = paramArrayOfObject;
          }
          AppMethodBeat.o(10159);
          paramInt = 0;
          break;
        case 4:
          localiq.vKF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10159);
          paramInt = 0;
          break;
        case 5:
          localiq.jBF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10159);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new asq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((asq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localiq.vKM = ((asq)localObject1);
          }
          AppMethodBeat.o(10159);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(10159);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.iq
 * JD-Core Version:    0.6.2
 */