package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class jm extends bsr
{
  public int vIJ;
  public int vLk;
  public String vLl;
  public String vLm;
  public String vLn;
  public String vLo;
  public String vLp;
  public String vLq;
  public String vLr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73693);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vIJ);
      paramArrayOfObject.iz(3, this.vLk);
      if (this.vLl != null)
        paramArrayOfObject.e(4, this.vLl);
      if (this.vLm != null)
        paramArrayOfObject.e(5, this.vLm);
      if (this.vLn != null)
        paramArrayOfObject.e(6, this.vLn);
      if (this.vLo != null)
        paramArrayOfObject.e(7, this.vLo);
      if (this.vLp != null)
        paramArrayOfObject.e(8, this.vLp);
      if (this.vLq != null)
        paramArrayOfObject.e(9, this.vLq);
      if (this.vLr != null)
        paramArrayOfObject.e(10, this.vLr);
      AppMethodBeat.o(73693);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label870;
    label870: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.vIJ) + e.a.a.b.b.a.bs(3, this.vLk);
      i = paramInt;
      if (this.vLl != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vLl);
      paramInt = i;
      if (this.vLm != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vLm);
      i = paramInt;
      if (this.vLn != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vLn);
      paramInt = i;
      if (this.vLo != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vLo);
      i = paramInt;
      if (this.vLp != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.vLp);
      paramInt = i;
      if (this.vLq != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.vLq);
      i = paramInt;
      if (this.vLr != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.vLr);
      AppMethodBeat.o(73693);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73693);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        jm localjm = (jm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73693);
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
            localjm.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(73693);
          paramInt = i;
          break;
        case 2:
          localjm.vIJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73693);
          paramInt = i;
          break;
        case 3:
          localjm.vLk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73693);
          paramInt = i;
          break;
        case 4:
          localjm.vLl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73693);
          paramInt = i;
          break;
        case 5:
          localjm.vLm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73693);
          paramInt = i;
          break;
        case 6:
          localjm.vLn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73693);
          paramInt = i;
          break;
        case 7:
          localjm.vLo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73693);
          paramInt = i;
          break;
        case 8:
          localjm.vLp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73693);
          paramInt = i;
          break;
        case 9:
          localjm.vLq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73693);
          paramInt = i;
          break;
        case 10:
          localjm.vLr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73693);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73693);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.jm
 * JD-Core Version:    0.6.2
 */