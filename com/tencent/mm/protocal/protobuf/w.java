package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class w extends bsr
{
  public int limit;
  public int offset;
  public int type;
  public int vAA;
  public int vAB;
  public String vAC;
  public String vAz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56692);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.limit);
      paramArrayOfObject.iz(3, this.offset);
      paramArrayOfObject.iz(4, this.type);
      if (this.vAz != null)
        paramArrayOfObject.e(5, this.vAz);
      paramArrayOfObject.iz(6, this.vAA);
      paramArrayOfObject.iz(7, this.vAB);
      if (this.vAC != null)
        paramArrayOfObject.e(8, this.vAC);
      AppMethodBeat.o(56692);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label684;
    label684: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.limit) + e.a.a.b.b.a.bs(3, this.offset) + e.a.a.b.b.a.bs(4, this.type);
      paramInt = i;
      if (this.vAz != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vAz);
      i = paramInt + e.a.a.b.b.a.bs(6, this.vAA) + e.a.a.b.b.a.bs(7, this.vAB);
      paramInt = i;
      if (this.vAC != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vAC);
      AppMethodBeat.o(56692);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56692);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        w localw = (w)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56692);
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
            localw.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56692);
          paramInt = i;
          break;
        case 2:
          localw.limit = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56692);
          paramInt = i;
          break;
        case 3:
          localw.offset = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56692);
          paramInt = i;
          break;
        case 4:
          localw.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56692);
          paramInt = i;
          break;
        case 5:
          localw.vAz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56692);
          paramInt = i;
          break;
        case 6:
          localw.vAA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56692);
          paramInt = i;
          break;
        case 7:
          localw.vAB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56692);
          paramInt = i;
          break;
        case 8:
          localw.vAC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56692);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56692);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.w
 * JD-Core Version:    0.6.2
 */