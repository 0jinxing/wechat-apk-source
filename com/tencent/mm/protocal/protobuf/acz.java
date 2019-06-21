package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class acz extends bsr
{
  public String guW;
  public String nbs;
  public LinkedList<String> wkE;
  public LinkedList<String> wkL;
  public int wkM;

  public acz()
  {
    AppMethodBeat.i(112426);
    this.wkL = new LinkedList();
    this.wkE = new LinkedList();
    AppMethodBeat.o(112426);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(112427);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 1, this.wkL);
      paramArrayOfObject.e(3, 1, this.wkE);
      if (this.nbs != null)
        paramArrayOfObject.e(4, this.nbs);
      if (this.guW != null)
        paramArrayOfObject.e(5, this.guW);
      paramArrayOfObject.iz(6, this.wkM);
      AppMethodBeat.o(112427);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label618;
    label618: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 1, this.wkL) + e.a.a.a.c(3, 1, this.wkE);
      paramInt = i;
      if (this.nbs != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.nbs);
      i = paramInt;
      if (this.guW != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.guW);
      paramInt = i + e.a.a.b.b.a.bs(6, this.wkM);
      AppMethodBeat.o(112427);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wkL.clear();
        this.wkE.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(112427);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        acz localacz = (acz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(112427);
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
            localacz.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(112427);
          paramInt = i;
          break;
        case 2:
          localacz.wkL.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(112427);
          paramInt = i;
          break;
        case 3:
          localacz.wkE.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(112427);
          paramInt = i;
          break;
        case 4:
          localacz.nbs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112427);
          paramInt = i;
          break;
        case 5:
          localacz.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112427);
          paramInt = i;
          break;
        case 6:
          localacz.wkM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(112427);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(112427);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.acz
 * JD-Core Version:    0.6.2
 */