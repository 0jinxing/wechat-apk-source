package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class oa extends com.tencent.mm.bt.a
{
  public int vTs;
  public String vTt;
  public String vTu;
  public String vTv;
  public int vTw;
  public String vTx;
  public ny vTy;
  public String vTz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89037);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vTs);
      if (this.vTt != null)
        paramArrayOfObject.e(2, this.vTt);
      if (this.vTu != null)
        paramArrayOfObject.e(3, this.vTu);
      if (this.vTv != null)
        paramArrayOfObject.e(4, this.vTv);
      paramArrayOfObject.iz(5, this.vTw);
      if (this.vTx != null)
        paramArrayOfObject.e(6, this.vTx);
      if (this.vTy != null)
      {
        paramArrayOfObject.iy(7, this.vTy.computeSize());
        this.vTy.writeFields(paramArrayOfObject);
      }
      if (this.vTz != null)
        paramArrayOfObject.e(8, this.vTz);
      AppMethodBeat.o(89037);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vTs) + 0;
        i = paramInt;
        if (this.vTt != null)
          i = paramInt + e.a.a.b.b.a.f(2, this.vTt);
        paramInt = i;
        if (this.vTu != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.vTu);
        i = paramInt;
        if (this.vTv != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.vTv);
        i += e.a.a.b.b.a.bs(5, this.vTw);
        paramInt = i;
        if (this.vTx != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.vTx);
        i = paramInt;
        if (this.vTy != null)
          i = paramInt + e.a.a.a.ix(7, this.vTy.computeSize());
        paramInt = i;
        if (this.vTz != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.vTz);
        AppMethodBeat.o(89037);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89037);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        oa localoa = (oa)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89037);
          break;
        case 1:
          localoa.vTs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89037);
          paramInt = 0;
          break;
        case 2:
          localoa.vTt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89037);
          paramInt = 0;
          break;
        case 3:
          localoa.vTu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89037);
          paramInt = 0;
          break;
        case 4:
          localoa.vTv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89037);
          paramInt = 0;
          break;
        case 5:
          localoa.vTw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89037);
          paramInt = 0;
          break;
        case 6:
          localoa.vTx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89037);
          paramInt = 0;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ny();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ny)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localoa.vTy = ((ny)localObject1);
          }
          AppMethodBeat.o(89037);
          paramInt = 0;
          break;
        case 8:
          localoa.vTz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89037);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(89037);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.oa
 * JD-Core Version:    0.6.2
 */