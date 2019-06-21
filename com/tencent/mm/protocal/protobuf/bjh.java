package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bjh extends bsr
{
  public String fKh;
  public String vLo;
  public String vXP;
  public String vYO;
  public String vYP;
  public String vYQ;
  public String vYR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56895);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      if (this.vYO != null)
        paramArrayOfObject.e(3, this.vYO);
      if (this.vLo != null)
        paramArrayOfObject.e(4, this.vLo);
      if (this.vYP != null)
        paramArrayOfObject.e(5, this.vYP);
      if (this.vYQ != null)
        paramArrayOfObject.e(6, this.vYQ);
      if (this.vYR != null)
        paramArrayOfObject.e(7, this.vYR);
      if (this.vXP != null)
        paramArrayOfObject.e(8, this.vXP);
      AppMethodBeat.o(56895);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label772;
    label772: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fKh);
      paramInt = i;
      if (this.vYO != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vYO);
      i = paramInt;
      if (this.vLo != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vLo);
      paramInt = i;
      if (this.vYP != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vYP);
      i = paramInt;
      if (this.vYQ != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vYQ);
      paramInt = i;
      if (this.vYR != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vYR);
      i = paramInt;
      if (this.vXP != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.vXP);
      AppMethodBeat.o(56895);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56895);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bjh localbjh = (bjh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56895);
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
            localbjh.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56895);
          paramInt = i;
          break;
        case 2:
          localbjh.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56895);
          paramInt = i;
          break;
        case 3:
          localbjh.vYO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56895);
          paramInt = i;
          break;
        case 4:
          localbjh.vLo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56895);
          paramInt = i;
          break;
        case 5:
          localbjh.vYP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56895);
          paramInt = i;
          break;
        case 6:
          localbjh.vYQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56895);
          paramInt = i;
          break;
        case 7:
          localbjh.vYR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56895);
          paramInt = i;
          break;
        case 8:
          localbjh.vXP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56895);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56895);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bjh
 * JD-Core Version:    0.6.2
 */