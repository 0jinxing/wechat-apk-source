package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class lf extends bsr
{
  public int vAM;
  public String vAN;
  public String vMR;
  public ayu vOK;
  public buc vOL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28345);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vMR != null)
        paramArrayOfObject.e(2, this.vMR);
      if (this.vOK != null)
      {
        paramArrayOfObject.iy(3, this.vOK.computeSize());
        this.vOK.writeFields(paramArrayOfObject);
      }
      if (this.vOL != null)
      {
        paramArrayOfObject.iy(4, this.vOL.computeSize());
        this.vOL.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.vAM);
      if (this.vAN != null)
        paramArrayOfObject.e(6, this.vAN);
      AppMethodBeat.o(28345);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label826;
    label826: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vMR != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vMR);
      paramInt = i;
      if (this.vOK != null)
        paramInt = i + e.a.a.a.ix(3, this.vOK.computeSize());
      i = paramInt;
      if (this.vOL != null)
        i = paramInt + e.a.a.a.ix(4, this.vOL.computeSize());
      i += e.a.a.b.b.a.bs(5, this.vAM);
      paramInt = i;
      if (this.vAN != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vAN);
      AppMethodBeat.o(28345);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28345);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        lf locallf = (lf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28345);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallf.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28345);
          paramInt = i;
          break;
        case 2:
          locallf.vMR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28345);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ayu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallf.vOK = paramArrayOfObject;
          }
          AppMethodBeat.o(28345);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new buc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallf.vOL = paramArrayOfObject;
          }
          AppMethodBeat.o(28345);
          paramInt = i;
          break;
        case 5:
          locallf.vAM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28345);
          paramInt = i;
          break;
        case 6:
          locallf.vAN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28345);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28345);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.lf
 * JD-Core Version:    0.6.2
 */