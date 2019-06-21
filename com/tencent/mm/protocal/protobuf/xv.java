package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class xv extends bsr
{
  public String luQ;
  public int vIJ;
  public String vIj;
  public String vLJ;
  public String vLe;
  public SKBuiltinBuffer_t vLz;
  public int wdA;
  public String wdy;
  public String wdz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73701);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vLz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: RandomEncryKey");
        AppMethodBeat.o(73701);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vLz != null)
      {
        paramArrayOfObject.iy(2, this.vLz.computeSize());
        this.vLz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.vIJ);
      if (this.vLe != null)
        paramArrayOfObject.e(4, this.vLe);
      if (this.luQ != null)
        paramArrayOfObject.e(5, this.luQ);
      if (this.vLJ != null)
        paramArrayOfObject.e(6, this.vLJ);
      if (this.wdy != null)
        paramArrayOfObject.e(7, this.wdy);
      if (this.vIj != null)
        paramArrayOfObject.e(8, this.vIj);
      if (this.wdz != null)
        paramArrayOfObject.e(9, this.wdz);
      paramArrayOfObject.iz(10, this.wdA);
      AppMethodBeat.o(73701);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1014;
    label1014: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vLz != null)
        i = paramInt + e.a.a.a.ix(2, this.vLz.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(3, this.vIJ);
      i = paramInt;
      if (this.vLe != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vLe);
      paramInt = i;
      if (this.luQ != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.luQ);
      i = paramInt;
      if (this.vLJ != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vLJ);
      int j = i;
      if (this.wdy != null)
        j = i + e.a.a.b.b.a.f(7, this.wdy);
      paramInt = j;
      if (this.vIj != null)
        paramInt = j + e.a.a.b.b.a.f(8, this.vIj);
      i = paramInt;
      if (this.wdz != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wdz);
      paramInt = i + e.a.a.b.b.a.bs(10, this.wdA);
      AppMethodBeat.o(73701);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vLz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: RandomEncryKey");
          AppMethodBeat.o(73701);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(73701);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xv localxv = (xv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73701);
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
            localxv.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(73701);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxv.vLz = paramArrayOfObject;
          }
          AppMethodBeat.o(73701);
          paramInt = i;
          break;
        case 3:
          localxv.vIJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73701);
          paramInt = i;
          break;
        case 4:
          localxv.vLe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73701);
          paramInt = i;
          break;
        case 5:
          localxv.luQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73701);
          paramInt = i;
          break;
        case 6:
          localxv.vLJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73701);
          paramInt = i;
          break;
        case 7:
          localxv.wdy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73701);
          paramInt = i;
          break;
        case 8:
          localxv.vIj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73701);
          paramInt = i;
          break;
        case 9:
          localxv.wdz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73701);
          paramInt = i;
          break;
        case 10:
          localxv.wdA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73701);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73701);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xv
 * JD-Core Version:    0.6.2
 */