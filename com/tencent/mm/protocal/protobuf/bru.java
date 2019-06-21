package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bru extends bsr
{
  public int cKB;
  public String nSX;
  public String nXl;
  public String wKQ;
  public String wTV;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(70487);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.nSX != null)
        paramArrayOfObject.e(2, this.nSX);
      if (this.wKQ != null)
        paramArrayOfObject.e(3, this.wKQ);
      paramArrayOfObject.iz(4, this.cKB);
      if (this.nXl != null)
        paramArrayOfObject.e(5, this.nXl);
      if (this.wTV != null)
        paramArrayOfObject.e(6, this.wTV);
      AppMethodBeat.o(70487);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label626;
    label626: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.nSX != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.nSX);
      i = paramInt;
      if (this.wKQ != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wKQ);
      i += e.a.a.b.b.a.bs(4, this.cKB);
      paramInt = i;
      if (this.nXl != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.nXl);
      i = paramInt;
      if (this.wTV != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wTV);
      AppMethodBeat.o(70487);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(70487);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bru localbru = (bru)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(70487);
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
            localbru.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(70487);
          paramInt = i;
          break;
        case 2:
          localbru.nSX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(70487);
          paramInt = i;
          break;
        case 3:
          localbru.wKQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(70487);
          paramInt = i;
          break;
        case 4:
          localbru.cKB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(70487);
          paramInt = i;
          break;
        case 5:
          localbru.nXl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(70487);
          paramInt = i;
          break;
        case 6:
          localbru.wTV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(70487);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(70487);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bru
 * JD-Core Version:    0.6.2
 */