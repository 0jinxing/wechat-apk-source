package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aaf extends bsr
{
  public String csB;
  public int cvd;
  public int lSN;
  public String wfo;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(838);
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
      if (this.wfo != null)
        paramArrayOfObject.e(3, this.wfo);
      paramArrayOfObject.iz(4, this.cvd);
      paramArrayOfObject.iz(5, this.lSN);
      AppMethodBeat.o(838);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label554;
    label554: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.csB != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.csB);
      i = paramInt;
      if (this.wfo != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wfo);
      paramInt = i + e.a.a.b.b.a.bs(4, this.cvd) + e.a.a.b.b.a.bs(5, this.lSN);
      AppMethodBeat.o(838);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(838);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aaf localaaf = (aaf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(838);
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
            localaaf.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(838);
          paramInt = i;
          break;
        case 2:
          localaaf.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(838);
          paramInt = i;
          break;
        case 3:
          localaaf.wfo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(838);
          paramInt = i;
          break;
        case 4:
          localaaf.cvd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(838);
          paramInt = i;
          break;
        case 5:
          localaaf.lSN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(838);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(838);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aaf
 * JD-Core Version:    0.6.2
 */