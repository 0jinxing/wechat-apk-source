package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bwf extends bsr
{
  public String ncM;
  public int wBm;
  public String wWV;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(127732);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wWV != null)
        paramArrayOfObject.e(2, this.wWV);
      if (this.ncM != null)
        paramArrayOfObject.e(3, this.ncM);
      paramArrayOfObject.iz(4, this.wBm);
      AppMethodBeat.o(127732);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label496;
    label496: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wWV != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wWV);
      i = paramInt;
      if (this.ncM != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.ncM);
      paramInt = i + e.a.a.b.b.a.bs(4, this.wBm);
      AppMethodBeat.o(127732);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(127732);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bwf localbwf = (bwf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(127732);
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
            localbwf.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(127732);
          paramInt = i;
          break;
        case 2:
          localbwf.wWV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(127732);
          paramInt = i;
          break;
        case 3:
          localbwf.ncM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(127732);
          paramInt = i;
          break;
        case 4:
          localbwf.wBm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(127732);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(127732);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bwf
 * JD-Core Version:    0.6.2
 */