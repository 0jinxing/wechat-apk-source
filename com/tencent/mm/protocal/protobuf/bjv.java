package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bjv extends bsr
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
    AppMethodBeat.i(56911);
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
      AppMethodBeat.o(56911);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label953;
    label953: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
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
      int j = i;
      if (this.vYR != null)
        j = i + e.a.a.b.b.a.f(7, this.vYR);
      paramInt = j;
      if (this.vXP != null)
        paramInt = j + e.a.a.b.b.a.f(8, this.vXP);
      i = paramInt;
      if (this.wla != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wla);
      i += e.a.a.b.b.a.bs(10, this.vAM);
      paramInt = i;
      if (this.ndT != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.ndT);
      AppMethodBeat.o(56911);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56911);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bjv localbjv = (bjv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56911);
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
            localbjv.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56911);
          paramInt = i;
          break;
        case 2:
          localbjv.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56911);
          paramInt = i;
          break;
        case 3:
          localbjv.vYO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56911);
          paramInt = i;
          break;
        case 4:
          localbjv.vLo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56911);
          paramInt = i;
          break;
        case 5:
          localbjv.vYP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56911);
          paramInt = i;
          break;
        case 6:
          localbjv.vYQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56911);
          paramInt = i;
          break;
        case 7:
          localbjv.vYR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56911);
          paramInt = i;
          break;
        case 8:
          localbjv.vXP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56911);
          paramInt = i;
          break;
        case 9:
          localbjv.wla = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56911);
          paramInt = i;
          break;
        case 10:
          localbjv.vAM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56911);
          paramInt = i;
          break;
        case 11:
          localbjv.ndT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56911);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56911);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bjv
 * JD-Core Version:    0.6.2
 */