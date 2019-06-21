package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bjb extends bsr
{
  public String fKh;
  public String ndT;
  public int vAM;
  public String vLo;
  public String vXP;
  public String vYO;
  public String vYP;
  public String vYQ;
  public String vYR;
  public String wla;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56888);
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
      if (this.wla != null)
        paramArrayOfObject.e(9, this.wla);
      paramArrayOfObject.iz(10, this.vAM);
      if (this.ndT != null)
        paramArrayOfObject.e(11, this.ndT);
      AppMethodBeat.o(56888);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label949;
    label949: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.fKh != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.fKh);
      i = paramInt;
      if (this.vYO != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vYO);
      paramInt = i;
      if (this.vLo != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vLo);
      i = paramInt;
      if (this.vYP != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vYP);
      paramInt = i;
      if (this.vYQ != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vYQ);
      i = paramInt;
      if (this.vYR != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vYR);
      paramInt = i;
      if (this.vXP != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vXP);
      i = paramInt;
      if (this.wla != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wla);
      i += e.a.a.b.b.a.bs(10, this.vAM);
      paramInt = i;
      if (this.ndT != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.ndT);
      AppMethodBeat.o(56888);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56888);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bjb localbjb = (bjb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56888);
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
            localbjb.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56888);
          paramInt = i;
          break;
        case 2:
          localbjb.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56888);
          paramInt = i;
          break;
        case 3:
          localbjb.vYO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56888);
          paramInt = i;
          break;
        case 4:
          localbjb.vLo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56888);
          paramInt = i;
          break;
        case 5:
          localbjb.vYP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56888);
          paramInt = i;
          break;
        case 6:
          localbjb.vYQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56888);
          paramInt = i;
          break;
        case 7:
          localbjb.vYR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56888);
          paramInt = i;
          break;
        case 8:
          localbjb.vXP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56888);
          paramInt = i;
          break;
        case 9:
          localbjb.wla = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56888);
          paramInt = i;
          break;
        case 10:
          localbjb.vAM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56888);
          paramInt = i;
          break;
        case 11:
          localbjb.ndT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56888);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56888);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bjb
 * JD-Core Version:    0.6.2
 */